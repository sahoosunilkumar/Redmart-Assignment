package com.redmart.groceries.search.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.DataSource;
import android.arch.paging.LivePagedListProvider;
import android.arch.paging.PagedList;
import android.databinding.ObservableBoolean;

import com.redmart.groceries.common.repository.State;
import com.redmart.groceries.search.model.Product;
import com.redmart.groceries.search.repository.ISearchRepositoryCallback;
import com.redmart.groceries.search.repository.SearchRepository;

public class SearchViewModel extends ViewModel implements ISearchRepositoryCallback{

    public LiveData<PagedList<Product>> userList;
    private SearchRepository tDataSource;
    private ISearchRepositoryCallback callback;
    private static final int PAGE_SIZE = 20;
    public ObservableBoolean showProgress = new ObservableBoolean();
    public ObservableBoolean showError = new ObservableBoolean();

    public SearchViewModel() {
        init();
    }

    private void init() {
        callback = this;
        showError.set(false);
        showProgress.set(false);
        userList = new LivePagedListProvider<Integer, Product>() {
            @Override
            protected DataSource<Integer, Product> createDataSource() {
                tDataSource = new SearchRepository(callback);
                return tDataSource;
            }

        }.create(0, new PagedList.Config.Builder()
                .setEnablePlaceholders(false)
                .setPageSize(PAGE_SIZE)
                .setInitialLoadSizeHint(PAGE_SIZE)
                .build());
    }

    @Override
    public void onStateChanged(int state) {
        showProgress.set(state == State.IN_PROGRESS);
        showError.set(state == State.FAILURE);
    }
}
