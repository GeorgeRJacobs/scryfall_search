package android.bigranch.scryfallsearchapp;

import android.bigranch.scryfallsearchapp.adapters.CardRecyclerAdapter;
import android.bigranch.scryfallsearchapp.adapters.OnCardListener;
import android.bigranch.scryfallsearchapp.models.Card;
import android.bigranch.scryfallsearchapp.util.Testing;
import android.bigranch.scryfallsearchapp.viewmodels.CardListViewModel;
import android.os.Bundle;


import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardListActivity extends BaseActivity implements OnCardListener {

    private static final String TAG = "CardListActivity";
    private CardListViewModel mCardListViewModel;
    private RecyclerView mRecyclerView;
    private CardRecyclerAdapter mRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);
        mRecyclerView = findViewById(R.id.card_list);
        mCardListViewModel = new ViewModelProvider(this).get(CardListViewModel.class);
        initRecyclerView();
        subscribeObservers();
        initSearchView();

    }

    private void subscribeObservers() {
        mCardListViewModel.getCards().observe(this, new Observer<List<Card>>() {
            @Override
            public void onChanged(List<Card> cards) {
                if(cards != null) {
//                    Testing.printCards(cards, "Testing Card Print-Out");
                    mRecyclerAdapter.setCards(cards);
                }
            }
        });
    }

    private void testRetrofitRequest() {
        mCardListViewModel.SearchCardAPI("Nature");
    }

    private void initRecyclerView(){
        mRecyclerAdapter = new CardRecyclerAdapter(
                this
                );
        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void SearchCardAPI(String query) {
        mCardListViewModel.SearchCardAPI(query);
    }

    private void initSearchView(){
        final SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                mRecyclerAdapter.displayLoading();
                mCardListViewModel.SearchCardAPI(query);

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    @Override
    public void onCardClick(int position) {

    }

    @Override
    public void onCategoryClick(String category) {

    }
}
