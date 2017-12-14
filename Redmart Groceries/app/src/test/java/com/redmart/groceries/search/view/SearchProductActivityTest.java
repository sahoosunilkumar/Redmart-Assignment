package com.redmart.groceries.search.view;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.redmart.groceries.Utils;
import com.redmart.groceries.productdetail.view.ProductDetailActivity;
import com.redmart.groceries.productdetail.viewmodel.ProductDetailViewModel;
import com.redmart.groceries.search.model.Product;
import com.redmart.groceries.search.viewmodel.SearchViewModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
public class SearchProductActivityTest {

    @Mock
    ProductListAdapter productListAdapter;
    @Mock
    private View view;
    @Mock
    private Bundle bundle;
    @Mock
    private ProductDetailViewModel presenter;
    @Mock
    private Product product;
    @Mock
    Intent mockIntent;
    private SearchProductActivity activity;


    private static final String EXTRA_INFO = "extra_info";
    @Before
    public void setUp() {

        activity = Robolectric.setupActivity(SearchProductActivity.class);
        MockitoAnnotations.initMocks(this);
        when(mockIntent.getExtras()).thenReturn(bundle);
        when(view.getContext()).thenReturn(activity);
        when(productListAdapter.getItemAt(anyInt())).thenReturn(product);
    }

    @After
    public void tearDown() throws Exception {
        activity = null;
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( activity );
    }
    @Test
    public void viewmodelShouldNotBeNull() throws Exception
    {
        assertNotNull(ViewModelProviders.of(activity).get(SearchViewModel.class));
    }
    @Test
    public void onItemClick() throws Exception
    {
        Utils.setByReflection(activity, "productListAdapter", productListAdapter);
        activity.onItemClick(view, 0);
        Intent expectedIntent = new Intent(activity, ProductDetailActivity.class);
        expectedIntent.putExtra(EXTRA_INFO, product);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
}
