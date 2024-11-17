package com.mediumarticles.recyclerviewtutorial.api;

import com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels.HotelSearchResultParent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {
    @GET("search")
    Call<HotelSearchResultParent> searchHotels(
            @Query("children_ages") String childrenAges,
            @Query("page_number") int pageNumber,
            @Query("adults_number") int adultsNumber,
            @Query("children_number") int childrenNumber,
            @Query("room_number") int roomNumber,
            @Query("include_adjacency") boolean includeAdjacency,
            @Query("units") String units,
            @Query("categories_filter_ids") String categoriesFilterIds,
            @Query("checkout_date") String checkoutDate,
            @Query("dest_id") String destId,
            @Query("filter_by_currency") String currency,
            @Query("dest_type") String destType,
            @Query("checkin_date") String checkinDate,
            @Query("order_by") String orderBy,
            @Query("locale") String locale
    );
}
