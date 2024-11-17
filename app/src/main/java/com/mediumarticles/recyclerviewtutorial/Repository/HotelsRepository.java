package com.mediumarticles.recyclerviewtutorial.Repository;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mediumarticles.recyclerviewtutorial.api.RetrofitClient;
import com.mediumarticles.recyclerviewtutorial.api.RetrofitService;
import com.mediumarticles.recyclerviewtutorial.model.custom.SearchResultCardData;
import com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels.HotelSearchResultParent;

import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HotelsRepository {
    private final RetrofitService retrofitService;

    private double selectedHotelId = 0.0;

    private static HotelsRepository hotelsRepositoryInstance = null;

    public static HotelsRepository getHotelsRepositoryInstance() {
        return Objects.requireNonNullElseGet(hotelsRepositoryInstance, HotelsRepository::new);

    }

    HotelsRepository() {
        retrofitService = RetrofitClient.getApiService();
    }

    public void setSelectedHotelId(double selectedHotelId) {
        this.selectedHotelId = selectedHotelId;
    }

    //test data, for the sake of this tutorial
    String childrenAges = "5,0";
    int pageNumber = 0;
    int adultsNumber = 2;
    int childrenNumber = 2;
    int roomNumber = 1;
    boolean includeAdjacency = true;
    String units = "metric";
    String categoriesFilterIds = "class::2,class::4,free_cancellation::1";
    String checkoutDate = "2025-01-19";
    String destId = "-553173";
    String currency = "AED";
    String destType = "city";
    String checkinDate = "2025-01-18";
    String orderBy = "popularity";
    String locale = "en-gb";

    //abstracted method call, where I pass data and simply observe in ViewModel without actually passing the parameters there

    public LiveData<ArrayList<SearchResultCardData>> getSearchHotelResults() {
        return searchHotels(childrenAges, pageNumber, adultsNumber, childrenNumber, roomNumber, includeAdjacency, units, categoriesFilterIds, checkoutDate, destId, currency, destType, checkinDate, orderBy, locale);
    }

    private MutableLiveData<ArrayList<SearchResultCardData>> searchHotels(String childrenAges,
                                                                          int pageNumber,
                                                                          int adultsNumber,
                                                                          int childrenNumber,
                                                                          int roomNumber,
                                                                          boolean includeAdjacency,
                                                                          String units,
                                                                          String categoriesFilterIds,
                                                                          String checkoutDate,
                                                                          String destId,
                                                                          String currency,
                                                                          String destType,
                                                                          String checkinDate,
                                                                          String orderBy,
                                                                          String locale) {

        Call<HotelSearchResultParent> call = retrofitService.searchHotels(
                childrenAges,
                pageNumber,
                adultsNumber,
                childrenNumber,
                roomNumber,
                includeAdjacency,
                units,
                categoriesFilterIds,
                checkoutDate,
                destId,
                currency,
                destType,
                checkinDate,
                orderBy,
                locale
        );

        MutableLiveData<ArrayList<SearchResultCardData>> datasetMLD = new MutableLiveData<>();
        ArrayList<SearchResultCardData> datasetStatic = new ArrayList<>();

        call.enqueue(new Callback<HotelSearchResultParent>() {
            @Override
            public void onResponse(@NonNull Call<HotelSearchResultParent> call, @NonNull Response<HotelSearchResultParent> response) {

                HotelSearchResultParent data = response.body();
                assert data != null;
                if (!data.getResult().isEmpty()) {

                    for (int i = 0; i < data.getResult().size(); i++) {
                        datasetStatic.add(new SearchResultCardData(
                                data.getResult().get(i).getHotelId(),
                                data.getResult().get(i).getMainPhotoUrl(),
                                data.getResult().get(i).getHotelName(),
                                data.getResult().get(i).getAddress(),
                                data.getResult().get(i).getCityNameEn(),
                                data.getResult().get(i).getCountryTrans(),
                                data.getResult().get(i).getReviewScore(),
                                data.getResult().get(i).getReviewScoreWord()
                        ));
                    }

                    datasetMLD.setValue(datasetStatic);

                } else {
                    Log.d("Issue", "Dataset empty most prolly");
                }
            }

            @Override
            public void onFailure(@NonNull Call<HotelSearchResultParent> call, @NonNull Throwable throwable) {
                Log.d("HotelResultsFailure"," "+Log.getStackTraceString(throwable));

            }
        });
        return datasetMLD;
    }


}
