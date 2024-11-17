package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class Sort {

   @SerializedName("name")
   String name;

   @SerializedName("id")
   String id;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
}