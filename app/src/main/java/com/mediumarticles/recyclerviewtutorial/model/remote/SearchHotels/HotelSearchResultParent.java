package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class HotelSearchResultParent {

   @SerializedName("primary_count")
   double primaryCount;

   @SerializedName("count")
   double count;

   @SerializedName("room_distribution")
   List<RoomDistribution> roomDistribution;

   @SerializedName("map_bounding_box")
   MapBoundingBox mapBoundingBox;

   @SerializedName("total_count_with_filters")
   double totalCountWithFilters;

   @SerializedName("unfiltered_count")
   double unfilteredCount;

   @SerializedName("extended_count")
   double extendedCount;

   @SerializedName("unfiltered_primary_count")
   double unfilteredPrimaryCount;

   @SerializedName("search_radius")
   double searchRadius;

   @SerializedName("sort")
   List<Sort> sort;

   @SerializedName("result")
   List<Result> result;


    public void setPrimaryCount(double primaryCount) {
        this.primaryCount = primaryCount;
    }
    public double getPrimaryCount() {
        return primaryCount;
    }
    
    public void setCount(double count) {
        this.count = count;
    }
    public double getCount() {
        return count;
    }
    
    public void setRoomDistribution(List<RoomDistribution> roomDistribution) {
        this.roomDistribution = roomDistribution;
    }
    public List<RoomDistribution> getRoomDistribution() {
        return roomDistribution;
    }
    
    public void setMapBoundingBox(MapBoundingBox mapBoundingBox) {
        this.mapBoundingBox = mapBoundingBox;
    }
    public MapBoundingBox getMapBoundingBox() {
        return mapBoundingBox;
    }
    
    public void setTotalCountWithFilters(double totalCountWithFilters) {
        this.totalCountWithFilters = totalCountWithFilters;
    }
    public double getTotalCountWithFilters() {
        return totalCountWithFilters;
    }
    
    public void setUnfilteredCount(double unfilteredCount) {
        this.unfilteredCount = unfilteredCount;
    }
    public double getUnfilteredCount() {
        return unfilteredCount;
    }
    
    public void setExtendedCount(double extendedCount) {
        this.extendedCount = extendedCount;
    }
    public double getExtendedCount() {
        return extendedCount;
    }
    
    public void setUnfilteredPrimaryCount(double unfilteredPrimaryCount) {
        this.unfilteredPrimaryCount = unfilteredPrimaryCount;
    }
    public double getUnfilteredPrimaryCount() {
        return unfilteredPrimaryCount;
    }
    
    public void setSearchRadius(double searchRadius) {
        this.searchRadius = searchRadius;
    }
    public double getSearchRadius() {
        return searchRadius;
    }
    
    public void setSort(List<Sort> sort) {
        this.sort = sort;
    }
    public List<Sort> getSort() {
        return sort;
    }
    
    public void setResult(List<Result> result) {
        this.result = result;
    }
    public List<Result> getResult() {
        return result;
    }
    
}