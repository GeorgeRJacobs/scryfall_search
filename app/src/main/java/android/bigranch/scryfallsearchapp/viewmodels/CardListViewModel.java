package android.bigranch.scryfallsearchapp.viewmodels;

import android.bigranch.scryfallsearchapp.models.Card;
import android.bigranch.scryfallsearchapp.repositories.CardRepository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class CardListViewModel extends ViewModel {

    private CardRepository mCardRepository;

    public CardListViewModel() {
        mCardRepository = CardRepository.getInstance();
    }

    // Train of Live Data
    public LiveData<List<Card>> getCards() {
        return mCardRepository.getCards();
    }

    public void SearchCardAPI(String query) {
        mCardRepository.SearchCardAPI(query);
    }
}
