package com.redmart.groceries.search.repository;

import android.arch.paging.DataSource;
import android.arch.paging.TiledDataSource;

import com.redmart.groceries.common.repository.State;
import com.redmart.groceries.networkinterface.NetworkApi;
import com.redmart.groceries.networkinterface.NetworkApiService;
import com.redmart.groceries.search.model.FetchItemsResponse;
import com.redmart.groceries.search.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

public class SearchRepository extends TiledDataSource<Product> {
    private NetworkApiService networkApiService;
    private ISearchRepositoryCallback callback;

    public SearchRepository(ISearchRepositoryCallback callback) {
        networkApiService = NetworkApi.createNetworkApiService();
        this.callback = callback;
    }

    @Override
    public int countItems() {
        return DataSource.COUNT_UNDEFINED;
    }

    @Override
    public List<Product> loadRange(int startPosition, int pageSize) {
        this.callback.onStateChanged(State.IN_PROGRESS);
        int pageNumber = startPosition / pageSize;
        List<Product> results = new ArrayList();
        try {
            Response<FetchItemsResponse> response = networkApiService.getUser(pageNumber, pageSize).execute();
            if (response.isSuccessful() && response.code() == 200) {
                results.addAll(response.body().getProducts());
            }
            this.callback.onStateChanged(State.SUCCESS);
        } catch (IOException e) {
            this.callback.onStateChanged(State.FAILURE);
        }
        return results;
    }
}
