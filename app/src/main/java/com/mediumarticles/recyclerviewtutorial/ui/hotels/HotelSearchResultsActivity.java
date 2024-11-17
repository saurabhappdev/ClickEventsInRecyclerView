package com.mediumarticles.recyclerviewtutorial.ui.hotels;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.mediumarticles.recyclerviewtutorial.R;
import com.mediumarticles.recyclerviewtutorial.databinding.ActivityHotelSearchResultsBinding;
import com.mediumarticles.recyclerviewtutorial.model.custom.SearchResultCardData;
import com.mediumarticles.recyclerviewtutorial.ui.hotels.adapter.HotelSearchResultsRecyclerAdapter;
import com.mediumarticles.recyclerviewtutorial.ui.hotels.viewmodel.HotelSearchResultsViewModel;
import com.mediumarticles.recyclerviewtutorial.utils.ClickEventHandler;

import java.util.ArrayList;

public class HotelSearchResultsActivity extends AppCompatActivity {

    private ActivityHotelSearchResultsBinding binding;
    private HotelSearchResultsViewModel viewmodel;
    private HotelSearchResultsRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable Edge-to-Edge support
        EdgeToEdge.enable(this);

        // Initialize the DataBinding
        binding = ActivityHotelSearchResultsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Set up WindowInsetsListener for system bar padding
        ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        adapter = new HotelSearchResultsRecyclerAdapter(new ClickEventHandler() {
            @Override
            public void onItemClick(double hotelId) {
                viewmodel.setSelectedHotelId(hotelId);
                viewmodel.sendHotelIdToRepository();
                Intent intent = new Intent(HotelSearchResultsActivity.this,SingleHotelDetailsExpandedActivity.class);
                startActivity(intent);


            }
        });

        viewmodel = new ViewModelProvider(this).get(HotelSearchResultsViewModel.class);

        viewmodel.getDataset().observe(this, new Observer<ArrayList<SearchResultCardData>>() {
            @Override
            public void onChanged(ArrayList<SearchResultCardData> searchResultCardData) {
                if(searchResultCardData!=null){
                    adapter.setDataset(searchResultCardData);
                }

            }
        });


        binding.setHotelSearchResults(viewmodel);
        binding.setAdapter(adapter);
    }


}
