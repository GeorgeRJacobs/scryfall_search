package android.bigranch.scryfallsearchapp;

import android.bigranch.scryfallsearchapp.models.Card;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

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
        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("card")){
            Card card = getIntent().getParcelableExtra("card");
            Log.d(TAG, "getIncomingIntent: " + card.getName());
        }
    }
}
