package android.bigranch.scryfallsearchapp.viewmodels;

import android.bigranch.scryfallsearchapp.models.Card;
import android.bigranch.scryfallsearchapp.repositories.CardRepository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class CardViewModel extends ViewModel {

    private CardRepository mCardRepository;

    public CardViewModel() {
        mCardRepository = CardRepository.getInstance();
    }

    public LiveData<List<Card>> getCards() {
        return mCardRepository.getCards();
    }
}
