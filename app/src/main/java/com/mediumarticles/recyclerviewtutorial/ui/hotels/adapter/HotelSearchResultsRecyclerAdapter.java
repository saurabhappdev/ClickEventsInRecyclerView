package com.mediumarticles.recyclerviewtutorial.ui.hotels.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.datepicker.SingleDateSelector;
import com.mediumarticles.recyclerviewtutorial.R;
import com.mediumarticles.recyclerviewtutorial.databinding.ReplicatedLayoutBinding;
import com.mediumarticles.recyclerviewtutorial.model.custom.SearchResultCardData;
import com.mediumarticles.recyclerviewtutorial.utils.ClickEventHandler;

import java.util.ArrayList;


public class HotelSearchResultsRecyclerAdapter extends RecyclerView.Adapter<HotelSearchResultsRecyclerAdapter.ViewHolder> {

    private ClickEventHandler clickEventHandler;
    private ArrayList<SearchResultCardData> dataset = new ArrayList<>();

    public HotelSearchResultsRecyclerAdapter(ClickEventHandler clickEventHandler) {
        this.clickEventHandler = clickEventHandler;
    }

    @NonNull
    @Override
    public HotelSearchResultsRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ReplicatedLayoutBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.replicated_layout,
                parent,
                false
        );

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelSearchResultsRecyclerAdapter.ViewHolder holder, int position) {

        SearchResultCardData data = dataset.get(position);
        holder.binding.setSingleCardData(data);
        holder.binding.setOnClickHandler(clickEventHandler);

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void setDataset(ArrayList<SearchResultCardData> dataSet) {
        if (dataSet != null && !dataSet.isEmpty()) {
            dataset = dataSet;
            notifyDataSetChanged();
        } else {
            dataset = new ArrayList<>();
            notifyDataSetChanged();
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ReplicatedLayoutBinding binding;

        public ViewHolder(@NonNull ReplicatedLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
