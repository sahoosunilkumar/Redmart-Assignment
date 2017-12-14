package com.redmart.groceries.search.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.redmart.groceries.R;
import com.redmart.groceries.databinding.ActivityMainBinding;
import com.redmart.groceries.productdetail.view.ProductDetailActivity;
import com.redmart.groceries.search.viewmodel.SearchViewModel;

public class SearchProductActivity extends AppCompatActivity implements SearchProductView {


    private ProductListAdapter productListAdapter;
    private SearchViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(SearchViewModel.class);
        binding.setUserViewModel(viewModel);
        initView();

    }

    @Override
    public void onItemClick(View view, int position) {
        ProductDetailActivity.launch(view.getContext(), productListAdapter.getItemAt(position));
    }

    @Override
    public void initView() {
        binding.userList.setLayoutManager(new LinearLayoutManager(this));
        binding.userList.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        binding.userList.setHasFixedSize(true);

        productListAdapter = new ProductListAdapter(this);

        viewModel.userList.observe(this, pagedList -> {
            productListAdapter.setList(pagedList);
        });
        binding.userList.setAdapter(productListAdapter);
    }
}
