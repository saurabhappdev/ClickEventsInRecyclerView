package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;

import com.google.gson.annotations.SerializedName;

   
public class PriceBreakdown {

   @SerializedName("has_fine_prdouble_charges")
   double hasFinePrdoubleCharges;

   @SerializedName("all_inclusive_price")
   double allInclusivePrice;

   @SerializedName("sum_excluded_raw")
   String sumExcludedRaw;

   @SerializedName("gross_price")
   String grossPrice;

   @SerializedName("currency")
   String currency;

   @SerializedName("has_tax_exceptions")
   double hasTaxExceptions;

   @SerializedName("has_incalculable_charges")
   double hasIncalculableCharges;


    public void setHasFinePrdoubleCharges(double hasFinePrdoubleCharges) {
        this.hasFinePrdoubleCharges = hasFinePrdoubleCharges;
    }
    public double getHasFinePrdoubleCharges() {
        return hasFinePrdoubleCharges;
    }
    
    public void setAllInclusivePrice(double allInclusivePrice) {
        this.allInclusivePrice = allInclusivePrice;
    }
    public double getAllInclusivePrice() {
        return allInclusivePrice;
    }
    
    public void setSumExcludedRaw(String sumExcludedRaw) {
        this.sumExcludedRaw = sumExcludedRaw;
    }
    public String getSumExcludedRaw() {
        return sumExcludedRaw;
    }
    
    public void setGrossPrice(String grossPrice) {
        this.grossPrice = grossPrice;
    }
    public String getGrossPrice() {
        return grossPrice;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }
    
    public void setHasTaxExceptions(double hasTaxExceptions) {
        this.hasTaxExceptions = hasTaxExceptions;
    }
    public double getHasTaxExceptions() {
        return hasTaxExceptions;
    }
    
    public void setHasIncalculableCharges(double hasIncalculableCharges) {
        this.hasIncalculableCharges = hasIncalculableCharges;
    }
    public double getHasIncalculableCharges() {
        return hasIncalculableCharges;
    }
    
}