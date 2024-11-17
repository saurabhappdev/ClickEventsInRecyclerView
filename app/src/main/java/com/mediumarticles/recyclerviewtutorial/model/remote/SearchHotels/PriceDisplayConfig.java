package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class PriceDisplayConfig {

   @SerializedName("key")
   String key;

   @SerializedName("value")
   double value;


    public void setKey(String key) {
        this.key = key;
    }
    public String getKey() {
        return key;
    }
    
    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    
}