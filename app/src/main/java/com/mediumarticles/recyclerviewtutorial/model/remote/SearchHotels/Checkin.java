package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class Checkin {

   @SerializedName("from")
   String from;

   @SerializedName("until")
   String until;


    public void setFrom(String from) {
        this.from = from;
    }
    public String getFrom() {
        return from;
    }
    
    public void setUntil(String until) {
        this.until = until;
    }
    public String getUntil() {
        return until;
    }
    
}