package android.bigranch.scryfallsearchapp.requests.Response;

import android.bigranch.scryfallsearchapp.models.Card;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CardSearchResponse {

    @SerializedName("total_cards")
    @Expose()
    private int total_cards;

    @SerializedName("data")
    @Expose()
    private List<Card> data;

    public int getTotal_cards() {
        return total_cards;
    }

    public List<Card> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "CardSearchResponse{" +
                "total_cards=" + total_cards +
                ", data=" + data +
                '}';
    }
}
