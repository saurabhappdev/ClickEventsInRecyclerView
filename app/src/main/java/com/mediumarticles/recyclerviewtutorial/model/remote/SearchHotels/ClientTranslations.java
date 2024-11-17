package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class ClientTranslations {

   @SerializedName("tooltip_total_text")
   String tooltipTotalText;

   @SerializedName("tooltip_taxes_and_charges")
   String tooltipTaxesAndCharges;

   @SerializedName("per_night_amount_prefix")
   String perNightAmountPrefix;

   @SerializedName("total_text")
   String totalText;

   @SerializedName("tooltip_footnote_text")
   List<String> tooltipFootnoteText;

   @SerializedName("amount_per_night_suffix")
   String amountPerNightSuffix;


    public void setTooltipTotalText(String tooltipTotalText) {
        this.tooltipTotalText = tooltipTotalText;
    }
    public String getTooltipTotalText() {
        return tooltipTotalText;
    }
    
    public void setTooltipTaxesAndCharges(String tooltipTaxesAndCharges) {
        this.tooltipTaxesAndCharges = tooltipTaxesAndCharges;
    }
    public String getTooltipTaxesAndCharges() {
        return tooltipTaxesAndCharges;
    }
    
    public void setPerNightAmountPrefix(String perNightAmountPrefix) {
        this.perNightAmountPrefix = perNightAmountPrefix;
    }
    public String getPerNightAmountPrefix() {
        return perNightAmountPrefix;
    }
    
    public void setTotalText(String totalText) {
        this.totalText = totalText;
    }
    public String getTotalText() {
        return totalText;
    }
    
    public void setTooltipFootnoteText(List<String> tooltipFootnoteText) {
        this.tooltipFootnoteText = tooltipFootnoteText;
    }
    public List<String> getTooltipFootnoteText() {
        return tooltipFootnoteText;
    }
    
    public void setAmountPerNightSuffix(String amountPerNightSuffix) {
        this.amountPerNightSuffix = amountPerNightSuffix;
    }
    public String getAmountPerNightSuffix() {
        return amountPerNightSuffix;
    }
    
}