package com.redmart.groceries.search.view;

import android.arch.paging.PagedListAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.redmart.groceries.BR;
import com.redmart.groceries.R;
import com.redmart.groceries.common.utils.ImageLoader;
import com.redmart.groceries.databinding.ItemProductListBinding;
import com.redmart.groceries.search.model.Product;

public class ProductListAdapter extends PagedListAdapter<Product, ProductListAdapter.ProductItemViewHolder> {

    private OnItemClickListener onItemClickListener;

    protected ProductListAdapter(OnItemClickListener onItemClickListener) {
        super(Product.DIFF_CALLBACK);
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ProductItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemProductListBinding movieListRowBinding = ItemProductListBinding.bind(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product_list, parent, false));

        return new ProductItemViewHolder(movieListRowBinding, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(ProductItemViewHolder holder, int position) {
        Product result = getItemAt(position);
        holder.bind(result);
    }

    public Product getItemAt(int position) {
        return getItem(position);
    }

    public class ProductItemViewHolder extends RecyclerView.ViewHolder {
        private final ItemProductListBinding binding;

        public ProductItemViewHolder(ItemProductListBinding movieListRowBinding, OnItemClickListener onItemClickListener) {
            super(movieListRowBinding.getRoot());

            this.binding = movieListRowBinding;
            movieListRowBinding.getRoot().setOnClickListener(view -> onItemClickListener.onItemClick(view, getAdapterPosition()));
        }

        public void bind(Product product) {
            binding.setVariable(BR.product, product);
            binding.executePendingBindings();
            ImageLoader.loadImage(product.getImg().getName(), binding.icon);
        }
    }

}
