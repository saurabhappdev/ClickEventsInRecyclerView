package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class Bwallet {

   @SerializedName("hotel_eligibility")
   double hotelEligibility;


    public void setHotelEligibility(double hotelEligibility) {
        this.hotelEligibility = hotelEligibility;
    }
    public double getHotelEligibility() {
        return hotelEligibility;
    }
    
}