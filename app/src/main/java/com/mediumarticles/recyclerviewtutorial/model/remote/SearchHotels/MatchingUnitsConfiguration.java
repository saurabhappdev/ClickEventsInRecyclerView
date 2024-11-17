package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class MatchingUnitsConfiguration {

   @SerializedName("matching_units_common_config")
   MatchingUnitsCommonConfig matchingUnitsCommonConfig;


    public void setMatchingUnitsCommonConfig(MatchingUnitsCommonConfig matchingUnitsCommonConfig) {
        this.matchingUnitsCommonConfig = matchingUnitsCommonConfig;
    }
    public MatchingUnitsCommonConfig getMatchingUnitsCommonConfig() {
        return matchingUnitsCommonConfig;
    }
    
}