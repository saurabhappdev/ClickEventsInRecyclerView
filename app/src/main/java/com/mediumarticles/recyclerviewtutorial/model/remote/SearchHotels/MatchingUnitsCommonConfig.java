package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class MatchingUnitsCommonConfig {

   @SerializedName("localized_area")
   String localizedArea;

   @SerializedName("unit_type_id")
   double unitTypeId;


    public void setLocalizedArea(String localizedArea) {
        this.localizedArea = localizedArea;
    }
    public String getLocalizedArea() {
        return localizedArea;
    }
    
    public void setUnitTypeId(double unitTypeId) {
        this.unitTypeId = unitTypeId;
    }
    public double getUnitTypeId() {
        return unitTypeId;
    }
    
}