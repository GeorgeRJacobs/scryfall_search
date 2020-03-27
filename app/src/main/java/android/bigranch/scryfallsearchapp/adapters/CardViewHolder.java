package android.bigranch.scryfallsearchapp.adapters;

import android.bigranch.scryfallsearchapp.R;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    // Might Change Here
    TextView title, card_type, card_text;
    AppCompatImageView image;
    OnCardListener onCardListener;

    public CardViewHolder(@NonNull View itemView, OnCardListener onCardListener) {
        super(itemView);

        this.onCardListener = onCardListener;
        title = itemView.findViewById(R.id.card_title);
        card_type = itemView.findViewById(R.id.card_type);
        card_text = itemView.findViewById(R.id.card_text);
        image = itemView.findViewById(R.id.card_image);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        onCardListener.onCardClick(getAdapterPosition());

    }
}
