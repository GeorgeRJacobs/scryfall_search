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

import java.util.List;

import retrofit2.http.Tag;

public class CardRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Card> mCards;
    private OnCardListener mOnCardListener;

    public CardRecyclerAdapter(OnCardListener mOnCardListener) {
        this.mOnCardListener = mOnCardListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_card_list_item, parent, false
        );
        return new CardViewHolder(view, mOnCardListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

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
