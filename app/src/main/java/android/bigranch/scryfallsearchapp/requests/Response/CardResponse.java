package android.bigranch.scryfallsearchapp.requests.Response;

import android.bigranch.scryfallsearchapp.models.Card;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

// TODO Fix the Card Response Object.
// Current problem - not returning the Image URL string like it should

public class CardResponse {
    private Card card;
    public Card getCard() {
        return card;
    }
}