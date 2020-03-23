package android.bigranch.scryfallsearchapp.requests;

import android.bigranch.scryfallsearchapp.util.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static ScryfallAPI scryfallApi = retrofit.create(ScryfallAPI.class);

    public static ScryfallAPI getScryfallApi () {
        return scryfallApi;
    }
}
