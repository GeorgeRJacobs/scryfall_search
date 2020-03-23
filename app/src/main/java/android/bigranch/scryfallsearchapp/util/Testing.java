package android.bigranch.scryfallsearchapp.util;

import android.bigranch.scryfallsearchapp.models.Card;
import android.util.Log;

import java.util.List;

public class Testing {

    public static void printCards(List<Card> list, String tag) {
        for(Card card: list) {
            Log.d(tag, card.getImage_uris().getNormal());
            //Log.d(tag, card.getImage_uris_small());
        }
    }

}
