package com.redmart.groceries.networkinterface;

import com.redmart.groceries.search.model.FetchItemsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NetworkApiService {


    @GET("catalog/search?")
    Call<FetchItemsResponse> getUser(@Query("page") int pageNumber, @Query("pageSize") int pageSize);
}
