package android.bigranch.scryfallsearchapp;

import android.bigranch.scryfallsearchapp.models.Card;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class CardActivity extends BaseActivity {
    private static final String TAG = "CardActivity";

    //UI Components
    private AppCompatImageView mCardImage;
    private TextView mCardTitle, mCardType, mCardText, mCardPrice;
    private LinearLayout mCardDetailsContainer;
    private ScrollView mScrollview;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        mCardImage = findViewById(R.id.card_image_act);
        mCardTitle = findViewById(R.id.card_title_act);
        mCardType = findViewById(R.id.card_type_act);
        mCardText = findViewById(R.id.card_text_act);
        mCardPrice = findViewById(R.id.card_price_act);
        mScrollview = findViewById(R.id.parent);
        showProgressBar(true);
        getIncomingIntent();
        prepareCardIntent();


    }

    private void prepareCardIntent() {
        if(getIntent().hasExtra("card")) {
            Intent intent = getIntent();
            RequestOptions requestOptions = new RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background);

            Card card = intent.getExtras().getParcelable("card");

            Glide.with(this)
                    .setDefaultRequestOptions(requestOptions)
                    .load(card.getImage_uris().getLarge())
                    .into(mCardImage);
            mCardTitle.setText(card.getName());
            mCardType.setText(card.getType_line());
            mCardText.setText(card.getOracle_text());
            Log.d(TAG, card.getPrices().getUsd());
            mCardPrice.setText("TCG Market Price: $ " + card.getPrices().getUsd());
            showProgressBar(false);
            showParent();

        }
    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("card")){
            Card card = getIntent().getParcelableExtra("card");
            Log.d(TAG, "getIncomingIntent: " + card.getName());
        }
    }

    private void showParent(){
        mScrollview.setVisibility(View.VISIBLE);
    }

}
