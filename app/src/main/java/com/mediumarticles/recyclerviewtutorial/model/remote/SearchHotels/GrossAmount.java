package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class GrossAmount {

   @SerializedName("value")
   double value;

   @SerializedName("amount_unrounded")
   String amountUnrounded;

   @SerializedName("amount_rounded")
   String amountRounded;

   @SerializedName("currency")
   String currency;


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
    
    public void setAmountRounded(String amountRounded) {
        this.amountRounded = amountRounded;
    }
    public String getAmountRounded() {
        return amountRounded;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }
    
}