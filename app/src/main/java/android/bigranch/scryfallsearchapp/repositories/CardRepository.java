package android.bigranch.scryfallsearchapp.repositories;

import android.bigranch.scryfallsearchapp.models.Card;
import android.bigranch.scryfallsearchapp.requests.CardApiClient;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import java.util.List;

public class CardRepository {

    private static CardRepository instance;
    private CardApiClient mCardApiClient;
    private MutableLiveData<Boolean> mIsQueryExhausted = new MutableLiveData<>();
    private MediatorLiveData<List<Card>> mCards = new MediatorLiveData<>();

    public static CardRepository getInstance() {
        if(instance == null) {
            instance = new CardRepository();
        }
        return instance;
    }

    private CardRepository() {
        mCardApiClient = CardApiClient.getInstance();
        initMediators();

    }

    public LiveData<Boolean> isCardRequestTimedOut() {
        return mCardApiClient.isCardRequestTimedOut();
    }

    private void initMediators() {
        LiveData<List<Card>> cardListAPISource = mCardApiClient.getCards();
        mCards.addSource(cardListAPISource, new Observer<List<Card>>() {
            @Override
            public void onChanged(List<Card> cards) {
                if(cards != null) {
                    mCards.setValue(cards);
                    doneQuery(cards);
                } else {
                    // search database cache
                    doneQuery(null);
                }
            }
        });
    }

    public void doneQuery(List<Card> list) {
        if(list != null) {
            if (list.size() < 30) {
                mIsQueryExhausted.setValue(true);
            }
        } else {
            mIsQueryExhausted.setValue(true);
        }
    }

    public LiveData<Boolean> isQueryExhausted() {
        return mIsQueryExhausted;
    }

    public LiveData<List<Card>> getCards() {
        return mCards;
    }

    public void SearchCardAPI(String query) {
        mIsQueryExhausted.setValue(false);
        mCardApiClient.searchCardAPI(query);
    }

    public void cancelRequest() {
        mCardApiClient.cancelRequest();
    }
}
