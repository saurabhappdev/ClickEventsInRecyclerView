package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class GrossAmountPerNight {

   @SerializedName("currency")
   String currency;

   @SerializedName("amount_rounded")
   String amountRounded;

   @SerializedName("amount_unrounded")
   String amountUnrounded;

   @SerializedName("value")
   double value;


    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }
    
    public void setAmountRounded(String amountRounded) {
        this.amountRounded = amountRounded;
    }
    public String getAmountRounded() {
        return amountRounded;
    }
    
    public void setAmountUnrounded(String amountUnrounded) {
        this.amountUnrounded = amountUnrounded;
    }
    public String getAmountUnrounded() {
        return amountUnrounded;
    }
    
    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    
}