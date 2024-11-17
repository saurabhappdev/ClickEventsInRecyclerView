package com.mediumarticles.recyclerviewtutorial.ui.hotels.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.mediumarticles.recyclerviewtutorial.Repository.HotelsRepository;
import com.mediumarticles.recyclerviewtutorial.model.custom.SearchResultCardData;

import java.util.ArrayList;

public class HotelSearchResultsViewModel extends AndroidViewModel {
    private Observer<ArrayList<SearchResultCardData>> hotelDatasetObserver;
    MutableLiveData<ArrayList<SearchResultCardData>> dataset = new MutableLiveData<>();
    MutableLiveData<Boolean> hasDatasetLoadedFlag = new MutableLiveData<>(false);

    double hotelId = 0.0;

    HotelsRepository hotelsRepositoryInstance;

    public HotelSearchResultsViewModel(@NonNull Application application) {
        super(application);
        hotelsRepositoryInstance = HotelsRepository.getHotelsRepositoryInstance();
        fetchHotels();

    }

    public LiveData<ArrayList<SearchResultCardData>> getDataset() {
        return dataset;
    }

    public LiveData<Boolean> getHasDatasetLoadedFlag() {
        return hasDatasetLoadedFlag;
    }

    private void fetchHotels() {
        hotelDatasetObserver = new Observer<ArrayList<SearchResultCardData>>() {
            @Override
            public void onChanged(ArrayList<SearchResultCardData> searchResultCardData) {
                dataset.setValue(searchResultCardData);
                hasDatasetLoadedFlag.setValue(true);

                // it is a good idea to handle unexpected cases like data turns out to be null.Use if-else in prod environment

            }


        };
        hotelsRepositoryInstance.getSearchHotelResults().observeForever(hotelDatasetObserver);
    }

    public void setSelectedHotelId(double hotelId) {
        this.hotelId = hotelId;
    }


    //This method sends the selected hotel's id to repository.Using the hotel's id you can get details of that specific hotel

    //will trigger this method on click
    public void sendHotelIdToRepository() {
        hotelsRepositoryInstance.setSelectedHotelId(hotelId);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        hotelsRepositoryInstance.getSearchHotelResults().removeObserver(hotelDatasetObserver);
    }
}
