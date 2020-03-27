package android.bigranch.scryfallsearchapp.viewmodels;

import android.bigranch.scryfallsearchapp.models.Card;
import android.bigranch.scryfallsearchapp.repositories.CardRepository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class CardListViewModel extends ViewModel {

    private CardRepository mCardRepository;
    private boolean mIsViewingCards;
    private boolean mIsPerformingQuery;

    public CardListViewModel() {
        mCardRepository = CardRepository.getInstance();
        mIsPerformingQuery = false;
    }

    public void setmIsPerformingQuery(boolean IsPerformingQuery) {
        mIsPerformingQuery = IsPerformingQuery;
    }

    public boolean isPerformingQuery() {
        return mIsPerformingQuery;
    }

    // Train of Live Data
    public LiveData<List<Card>> getCards() {
        return mCardRepository.getCards();
    }

    public void SearchCardAPI(String query) {
        mIsViewingCards = true;
        mCardRepository.SearchCardAPI(query);
        mIsPerformingQuery = true;
    }

    public boolean ismIsViewingCards() {
        return mIsViewingCards;
    }

    public void setmIsViewingCards(boolean isViewingCards){
        mIsViewingCards = isViewingCards;
    }

    public boolean onBackPressed() {
        if(mIsViewingCards) {
            mIsViewingCards = false;
            return false;
        }
        return true;
    }
}
