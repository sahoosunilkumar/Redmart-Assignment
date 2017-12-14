package com.redmart.groceries.productdetail.view;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.redmart.groceries.R;
import com.redmart.groceries.common.utils.ImageLoader;
import com.redmart.groceries.databinding.ActivityProductDetailBinding;
import com.redmart.groceries.productdetail.viewmodel.ProductDetailViewModel;
import com.redmart.groceries.search.model.Product;

public class ProductDetailActivity extends AppCompatActivity {

    private static final String EXTRA_INFO = "extra_info";
    private ProductDetailViewModel viewModel;

    public static void launch(Context context, Product product) {
        Intent intent = new Intent(context, ProductDetailActivity.class);
        intent.putExtra(EXTRA_INFO, product);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(ProductDetailViewModel.class);
        setData();
        ActivityProductDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_product_detail);
        binding.setProduct(viewModel.getProductDetail());
        ImageLoader.loadImage(binding.getProduct().getImg().getName(), binding.icon);
    }

    private void setData() {
        Product result = getIntent().getExtras().getParcelable(EXTRA_INFO);
        if (result != null) {
            viewModel.setProductDetail(result);
        }
    }

}
