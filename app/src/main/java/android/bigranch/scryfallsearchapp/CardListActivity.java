package android.bigranch.scryfallsearchapp;

import android.bigranch.scryfallsearchapp.adapters.CardRecyclerAdapter;
import android.bigranch.scryfallsearchapp.adapters.OnCardListener;
import android.bigranch.scryfallsearchapp.models.Card;
import android.bigranch.scryfallsearchapp.util.Testing;
import android.bigranch.scryfallsearchapp.util.VerticalSpacingItemDecorator;
import android.bigranch.scryfallsearchapp.viewmodels.CardListViewModel;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
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
    private SearchView mSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);
        mRecyclerView = findViewById(R.id.card_list);
        mSearchView = findViewById(R.id.search_view);
        mCardListViewModel = new ViewModelProvider(this).get(CardListViewModel.class);
        initRecyclerView();
        subscribeObservers();
        initSearchView();
        if(!mCardListViewModel.ismIsViewingCards()){
            //Display
            displaySearchCategories();
        }
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));

    }

    private void subscribeObservers() {
        mCardListViewModel.getCards().observe(this, new Observer<List<Card>>() {
            @Override
            public void onChanged(List<Card> cards) {
                if(cards != null) {
                    if(mCardListViewModel.ismIsViewingCards()){
                        //                    Testing.printCards(cards, "Testing Card Print-Out");
                        mCardListViewModel.setmIsPerformingQuery(false);
                        mRecyclerAdapter.setCards(cards);

                    }
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
        VerticalSpacingItemDecorator itemDecorator = new VerticalSpacingItemDecorator(15);
        mRecyclerView.addItemDecoration(itemDecorator);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void SearchCardAPI(String query) {
        mCardListViewModel.SearchCardAPI(query);
    }

    private void initSearchView(){

        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                mRecyclerAdapter.displayLoading();
                mCardListViewModel.SearchCardAPI(query);
                mSearchView.clearFocus();
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
        Intent intent = new Intent(this, CardActivity.class);
        intent.putExtra("card", mRecyclerAdapter.getSelectCard(position));
        startActivity(intent);

    }

    @Override
    public void onCategoryClick(String category) {
        mRecyclerAdapter.displayLoading();
        mCardListViewModel.SearchCardAPI(category);
    }

    private void displaySearchCategories() {
        mCardListViewModel.setmIsViewingCards(false);
        mRecyclerAdapter.displaySearchCategories();
        mSearchView.clearFocus();
    }

    @Override
    public void onBackPressed() {
        if(mCardListViewModel.onBackPressed()) {
            super.onBackPressed();
        } else {
            displaySearchCategories();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.action_categories) {
            displaySearchCategories();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.card_search_menu, menu);
        return super.onCreateOptionsMenu(menu);

}
}
