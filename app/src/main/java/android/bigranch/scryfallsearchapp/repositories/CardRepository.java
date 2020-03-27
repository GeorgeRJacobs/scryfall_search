package android.bigranch.scryfallsearchapp.repositories;

import android.bigranch.scryfallsearchapp.models.Card;
import android.bigranch.scryfallsearchapp.requests.CardApiClient;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class CardRepository {

    private static CardRepository instance;
    private CardApiClient mCardApiClient;

    public static CardRepository getInstance() {
        if(instance == null) {
            instance = new CardRepository();
        }
        return instance;
    }

    private CardRepository() {
        mCardApiClient = CardApiClient.getInstance();


    }

    public LiveData<List<Card>> getCards() {
        return mCardApiClient.getCards();
    }

    public void SearchCardAPI(String query) {
        mCardApiClient.searchCardAPI(query);
    }

    public void cancelRequest() {
        mCardApiClient.cancelRequest();
    }
}
