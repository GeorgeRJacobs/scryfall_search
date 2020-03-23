package android.bigranch.scryfallsearchapp.requests;

import android.bigranch.scryfallsearchapp.requests.Response.CardResponse;
import android.bigranch.scryfallsearchapp.requests.Response.CardSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ScryfallAPI {

    // SEARCH
    @GET("cards/search")
    Call<CardSearchResponse> searchCards(
            //@Query("key") String key,
            // Just need q= for now
            @Query("q") String query
            //@Query("page") String page
    );

    // GET Card Request
    @GET("cards/{id}")
    Call<CardResponse> getCard(
      @Path("id") String id
    );
}
