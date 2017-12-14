package com.redmart.groceries.productdetail.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.redmart.groceries.productdetail.viewmodel.ProductDetailViewModel;
import com.redmart.groceries.search.model.Product;
import com.redmart.groceries.search.view.SearchProductActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
public class ProductDetailActivityTest {

    @Mock
    TextView userName;
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

    @InjectMocks
    private ProductDetailActivity activity;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(bundle.getParcelable(anyString())).thenReturn(product);
        when(mockIntent.getExtras()).thenReturn(bundle);
    }

    @After
    public void tearDown() throws Exception {
        activity = null;
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        SearchProductActivity activity = Robolectric.setupActivity(SearchProductActivity.class);
        assertNotNull( activity );
    }

    @Test
    public void testPutExtras() throws NullPointerException{
//        Bundle extras = Your_Activity.getIntent().getExtras();
//        String str = extras.getString("data", null);
//        assertNotNull(str);
//        assertThat(str, equalTo("This is a Value"));
    }
}
