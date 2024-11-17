package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class RoomDistribution {

   @SerializedName("children")
   List<Double> children;

   @SerializedName("adults")
   String adults;


    public void setChildren(List<Double> children) {
        this.children = children;
    }
    public List<Double> getChildren() {
        return children;
    }
    
    public void setAdults(String adults) {
        this.adults = adults;
    }
    public String getAdults() {
        return adults;
    }
    
}