package com.redmart.groceries.search.repository;

import com.redmart.groceries.networkinterface.NetworkApiService;
import com.redmart.groceries.search.model.FetchItemsResponse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import retrofit2.Call;
import retrofit2.Response;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SearchRepositoryTest {
    @InjectMocks
    private SearchRepository subject;
    @Mock
    private NetworkApiService networkApiService;
    @Mock
    private ISearchRepositoryCallback callback;
    @Mock
    private Response<FetchItemsResponse> fetchItemsResponseResponse;
    @Mock
    private Call<FetchItemsResponse> fetchItemsResponseCall;

    @Before
    public void setUp() throws Exception {
        subject = new SearchRepository(callback);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void loadRange() throws Exception {
        when(networkApiService.getUser(anyInt(), anyInt())).thenReturn(fetchItemsResponseCall);
        when(fetchItemsResponseCall.execute()).thenReturn(fetchItemsResponseResponse);
        subject.loadRange(1, 20);
        then(networkApiService).should(times(1)).getUser(anyInt(), anyInt());
        then(callback).should(times(2)).onStateChanged(anyInt());
    }
}
