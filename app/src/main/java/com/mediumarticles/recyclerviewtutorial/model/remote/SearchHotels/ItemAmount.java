package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class ItemAmount {

   @SerializedName("value")
   double value;

   @SerializedName("amount_unrounded")
   String amountUnrounded;

   @SerializedName("currency")
   String currency;

   @SerializedName("amount_rounded")
   String amountRounded;


    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    
    public void setAmountUnrounded(String amountUnrounded) {
        this.amountUnrounded = amountUnrounded;
    }
    public String getAmountUnrounded() {
        return amountUnrounded;
    }
    
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
    
}