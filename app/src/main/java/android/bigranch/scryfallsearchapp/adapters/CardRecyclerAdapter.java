package android.bigranch.scryfallsearchapp.adapters;

import android.bigranch.scryfallsearchapp.R;
import android.bigranch.scryfallsearchapp.models.Card;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class CardRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int CARD_TYPE = 1;
    private static final int LOADING_TYPE = 2;

    private List<Card> mCards;
    private OnCardListener mOnCardListener;

    public CardRecyclerAdapter(OnCardListener mOnCardListener) {
        this.mOnCardListener = mOnCardListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        switch(viewType) {
            case CARD_TYPE: {
                view = LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.layout_card_list_item, parent, false);
                return new CardViewHolder(view, mOnCardListener);
            }
            case LOADING_TYPE: {
                view = LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.layout_loading_list_item, parent, false);
                return new LoadingViewHolder(view);
            }
            default: {
                view = LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.layout_card_list_item, parent, false);
                return new CardViewHolder(view, mOnCardListener);
            }
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        int itemViewType = getItemViewType(position);
        if(itemViewType == CARD_TYPE) {
            RequestOptions options = new RequestOptions()
                    .centerCrop()
                    .error(R.drawable.ic_launcher_background);

            Log.d("TAG", mCards.get(position).getName());

            Glide.with(((CardViewHolder) holder).itemView)
                    .setDefaultRequestOptions(options)
                    .load(mCards.get(position).getImage_uris().getNormal())
                    .error(R.drawable.ic_launcher_background)
                    .into(((CardViewHolder) holder).image);

            ((CardViewHolder)holder).title.setText(mCards.get(position).getName());
            ((CardViewHolder)holder).card_type.setText(mCards.get(position).getType_line());
            ((CardViewHolder)holder).card_text.setText(mCards.get(position).getOracle_text());
        }

    }

    @Override
    public int getItemViewType(int position) {
        if(mCards.get(position).getName().equals("LOADING...")) {
            return LOADING_TYPE;
        } else {
            return CARD_TYPE;
        }
    }

    public void displayLoading() {
        if(!isLoading()) {
            Card card = new Card();
            card.setName("LOADING...");
            List<Card> loadingcard = new ArrayList<>();
            loadingcard.add(card);
            mCards = loadingcard;
            notifyDataSetChanged();

        }
    }

    private boolean isLoading() {
        if(mCards.size() > 0) {
            if(mCards.get(mCards.size() - 1).getName().equals("LOADING...")){
                return true;
            }
        }
        return false;
    }

    @Override
    public int getItemCount() {
        if(mCards != null) {
            return mCards.size();
        }
        return 0;
    }

    public void setCards(List<Card> cards) {
        mCards = cards;
        notifyDataSetChanged();
    }
}
