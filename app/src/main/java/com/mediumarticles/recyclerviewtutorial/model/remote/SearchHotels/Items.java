package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class Items {

   @SerializedName("inclusion_type")
   String inclusionType;

   @SerializedName("base")
   Base base;

   @SerializedName("item_amount")
   ItemAmount itemAmount;

   @SerializedName("details")
   String details;

   @SerializedName("kind")
   String kind;

   @SerializedName("name")
   String name;


    public void setInclusionType(String inclusionType) {
        this.inclusionType = inclusionType;
    }
    public String getInclusionType() {
        return inclusionType;
    }
    
    public void setBase(Base base) {
        this.base = base;
    }
    public Base getBase() {
        return base;
    }
    
    public void setItemAmount(ItemAmount itemAmount) {
        this.itemAmount = itemAmount;
    }
    public ItemAmount getItemAmount() {
        return itemAmount;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    public String getDetails() {
        return details;
    }
    
    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getKind() {
        return kind;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
}