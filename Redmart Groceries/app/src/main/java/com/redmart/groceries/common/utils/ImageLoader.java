package com.redmart.groceries.common.utils;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.redmart.groceries.R;
import com.redmart.groceries.search.model.Product;

public class ImageLoader {
    private ImageLoader() {

    }

    public static void loadImage(String endPoint, ImageView view) {
        String url = String.format(view.getContext().getString(R.string
                .image_url), endPoint);
        Glide.with(view.getContext()).load(url).into
                (view);
    }
}
