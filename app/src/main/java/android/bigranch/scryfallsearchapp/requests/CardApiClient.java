package android.bigranch.scryfallsearchapp.requests;

import android.bigranch.scryfallsearchapp.AppExecutors;
import android.bigranch.scryfallsearchapp.models.Card;
import android.bigranch.scryfallsearchapp.requests.Response.CardSearchResponse;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Response;

import static android.bigranch.scryfallsearchapp.util.Constants.NETWORK_TIMEOUT;
import static android.content.ContentValues.TAG;

public class CardApiClient {

    private static CardApiClient instance;
    private MutableLiveData<List<Card>> mCards;
    private RetrieveCardRunnable mRetrieveCardsRunnable;
    private MutableLiveData<Boolean> mCardRequestTimeout = new MutableLiveData<>();

    public static CardApiClient getInstance() {
        if(instance == null) {
            instance = new CardApiClient();
        }

        return instance;
    }

    private CardApiClient() {
        mCards = new MutableLiveData<>();
    }

    public LiveData<List<Card>> getCards() {
        return mCards;
    }

    public LiveData<Boolean> isCardRequestTimedOut() {
        return mCardRequestTimeout;
    }

    public void searchCardAPI(String query) {

        if(mRetrieveCardsRunnable!= null) {
            mRetrieveCardsRunnable = null;
        }
        mRetrieveCardsRunnable = new RetrieveCardRunnable(query);

        final Future handler = AppExecutors.getInstance().networkIO().submit(mRetrieveCardsRunnable);

        AppExecutors.getInstance().networkIO().schedule(new Runnable() {
            @Override
            public void run() {
                // Let the user know its timed out
                mCardRequestTimeout.postValue(true);
                handler.cancel(true);
            }
        }, NETWORK_TIMEOUT, TimeUnit.MILLISECONDS);
    }

    private class RetrieveCardRunnable implements Runnable{

        private String query;
        private Boolean cancelRequest;

        public RetrieveCardRunnable(String query) {
            this.query = query;
            cancelRequest = false;
        }

        @Override
        public void run() {
            try {
                Response response = getCards(query).execute();
                if(cancelRequest == true) {
                    return;
                }
                if (response.code() == 200) {
                    List<Card> cards = new ArrayList<>(((CardSearchResponse)response.body()).getData());
                    mCards.postValue(cards);
                } else {
                    String error = response.errorBody().string();
                    Log.e(TAG, "run: " + error);
                    mCards.postValue(null) ;
                }

            } catch (IOException e) {
                e.printStackTrace();
                mCards.postValue(null);
            }
        }

        private Call<CardSearchResponse> getCards(String query) {
            return ServiceGenerator.getScryfallApi().searchCards(
                    query
            );
        }

        private void cancelRequest() {
            Log.d(TAG, "cancelRequest: canceling the search request");
            cancelRequest = true;
        }
    }

    public void cancelRequest() {
        if(mRetrieveCardsRunnable != null) {
            mRetrieveCardsRunnable.cancelRequest();
        }
    }
}
