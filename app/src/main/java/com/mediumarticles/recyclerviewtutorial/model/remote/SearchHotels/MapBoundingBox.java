package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class MapBoundingBox {

   @SerializedName("sw_lat")
   double swLat;

   @SerializedName("ne_lat")
   double neLat;

   @SerializedName("sw_long")
   double swLong;

   @SerializedName("ne_long")
   double neLong;


    public void setSwLat(double swLat) {
        this.swLat = swLat;
    }
    public double getSwLat() {
        return swLat;
    }
    
    public void setNeLat(double neLat) {
        this.neLat = neLat;
    }
    public double getNeLat() {
        return neLat;
    }
    
    public void setSwLong(double swLong) {
        this.swLong = swLong;
    }
    public double getSwLong() {
        return swLong;
    }
    
    public void setNeLong(double neLong) {
        this.neLong = neLong;
    }
    public double getNeLong() {
        return neLong;
    }
    
}