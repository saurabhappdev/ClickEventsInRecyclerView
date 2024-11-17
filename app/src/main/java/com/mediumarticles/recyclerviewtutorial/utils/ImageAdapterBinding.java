package com.mediumarticles.recyclerviewtutorial.utils;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mediumarticles.recyclerviewtutorial.R;

public class ImageAdapterBinding {

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView imageView, String url) {
        if (url == null || url.trim().isEmpty()) {
            // Set the blue background drawable
            imageView.setBackgroundResource(R.drawable.blue_background);
        } else {
            // Load the image using Glide
            Glide.with(imageView.getContext())
                    .load(url)
                    .apply(new RequestOptions()
                            .placeholder(R.drawable.blue_background)) // Placeholder image
                    .error(R.drawable.blue_background) // Handle errors
                    .into(imageView);
        }
    }
}
