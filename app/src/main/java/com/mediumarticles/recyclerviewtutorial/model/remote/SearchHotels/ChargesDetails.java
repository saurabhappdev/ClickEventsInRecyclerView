package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class ChargesDetails {

   @SerializedName("mode")
   String mode;

   @SerializedName("translated_copy")
   String translatedCopy;

   @SerializedName("amount")
   Amount amount;


    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getMode() {
        return mode;
    }
    
    public void setTranslatedCopy(String translatedCopy) {
        this.translatedCopy = translatedCopy;
    }
    public String getTranslatedCopy() {
        return translatedCopy;
    }
    
    public void setAmount(Amount amount) {
        this.amount = amount;
    }
    public Amount getAmount() {
        return amount;
    }
    
}