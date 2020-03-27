package android.bigranch.scryfallsearchapp.viewmodels;

import android.bigranch.scryfallsearchapp.models.Card;
import android.bigranch.scryfallsearchapp.repositories.CardRepository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class CardListViewModel extends ViewModel {

    private CardRepository mCardRepository;
    private boolean mIsViewingCards;

    public CardListViewModel() {
        mIsViewingCards = false;
        mCardRepository = CardRepository.getInstance();
    }

    // Train of Live Data
    public LiveData<List<Card>> getCards() {
        return mCardRepository.getCards();
    }

    public void SearchCardAPI(String query) {
        mIsViewingCards = true;
        mCardRepository.SearchCardAPI(query);
    }

    public boolean ismIsViewingCards() {
        return mIsViewingCards;
    }

    public void setmIsViewingCards(boolean isViewingCards){
        mIsViewingCards = isViewingCards;
    }
}
