package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class Checkout {

   @SerializedName("until")
   String until;

   @SerializedName("from")
   String from;


    public void setUntil(String until) {
        this.until = until;
    }
    public String getUntil() {
        return until;
    }
    
    public void setFrom(String from) {
        this.from = from;
    }
    public String getFrom() {
        return from;
    }
    
}