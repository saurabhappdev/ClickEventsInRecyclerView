package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class Distances {

   @SerializedName("icon_set")
   String iconSet;

   @SerializedName("icon_name")
   String iconName;

   @SerializedName("text")
   String text;


    public void setIconSet(String iconSet) {
        this.iconSet = iconSet;
    }
    public String getIconSet() {
        return iconSet;
    }
    
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
    public String getIconName() {
        return iconName;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    
}