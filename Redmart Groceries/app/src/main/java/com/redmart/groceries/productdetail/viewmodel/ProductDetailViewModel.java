package com.redmart.groceries.productdetail.viewmodel;

import android.arch.lifecycle.ViewModel;

import com.redmart.groceries.search.model.Product;

public class ProductDetailViewModel extends ViewModel {

    public Product productDetail;

    public ProductDetailViewModel() {
    }

    public Product getProductDetail() {
        return this.productDetail;
    }

    public void setProductDetail(Product productDetail) {
        this.productDetail = productDetail;
    }
}
