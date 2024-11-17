package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class ProductPriceBreakdowns {

   @SerializedName("net_amount")
   NetAmount netAmount;

   @SerializedName("client_translations")
   ClientTranslations clientTranslations;

   @SerializedName("benefits")
   List<String> benefits;

   @SerializedName("items")
   List<Items> items;

   @SerializedName("all_inclusive_amount_hotel_currency")
   AllInclusiveAmountHotelCurrency allInclusiveAmountHotelCurrency;

   @SerializedName("gross_amount_per_night")
   GrossAmountPerNight grossAmountPerNight;

   @SerializedName("charges_details")
   ChargesDetails chargesDetails;

   @SerializedName("excluded_amount")
   ExcludedAmount excludedAmount;

   @SerializedName("all_inclusive_amount")
   AllInclusiveAmount allInclusiveAmount;

   @SerializedName("gross_amount")
   GrossAmount grossAmount;

   @SerializedName("price_display_config")
   List<PriceDisplayConfig> priceDisplayConfig;

   @SerializedName("included_taxes_and_charges_amount")
   IncludedTaxesAndChargesAmount includedTaxesAndChargesAmount;

   @SerializedName("gross_amount_hotel_currency")
   GrossAmountHotelCurrency grossAmountHotelCurrency;


    public void setNetAmount(NetAmount netAmount) {
        this.netAmount = netAmount;
    }
    public NetAmount getNetAmount() {
        return netAmount;
    }
    
    public void setClientTranslations(ClientTranslations clientTranslations) {
        this.clientTranslations = clientTranslations;
    }
    public ClientTranslations getClientTranslations() {
        return clientTranslations;
    }
    
    public void setBenefits(List<String> benefits) {
        this.benefits = benefits;
    }
    public List<String> getBenefits() {
        return benefits;
    }
    
    public void setItems(List<Items> items) {
        this.items = items;
    }
    public List<Items> getItems() {
        return items;
    }
    
    public void setAllInclusiveAmountHotelCurrency(AllInclusiveAmountHotelCurrency allInclusiveAmountHotelCurrency) {
        this.allInclusiveAmountHotelCurrency = allInclusiveAmountHotelCurrency;
    }
    public AllInclusiveAmountHotelCurrency getAllInclusiveAmountHotelCurrency() {
        return allInclusiveAmountHotelCurrency;
    }
    
    public void setGrossAmountPerNight(GrossAmountPerNight grossAmountPerNight) {
        this.grossAmountPerNight = grossAmountPerNight;
    }
    public GrossAmountPerNight getGrossAmountPerNight() {
        return grossAmountPerNight;
    }
    
    public void setChargesDetails(ChargesDetails chargesDetails) {
        this.chargesDetails = chargesDetails;
    }
    public ChargesDetails getChargesDetails() {
        return chargesDetails;
    }
    
    public void setExcludedAmount(ExcludedAmount excludedAmount) {
        this.excludedAmount = excludedAmount;
    }
    public ExcludedAmount getExcludedAmount() {
        return excludedAmount;
    }
    
    public void setAllInclusiveAmount(AllInclusiveAmount allInclusiveAmount) {
        this.allInclusiveAmount = allInclusiveAmount;
    }
    public AllInclusiveAmount getAllInclusiveAmount() {
        return allInclusiveAmount;
    }
    
    public void setGrossAmount(GrossAmount grossAmount) {
        this.grossAmount = grossAmount;
    }
    public GrossAmount getGrossAmount() {
        return grossAmount;
    }
    
    public void setPriceDisplayConfig(List<PriceDisplayConfig> priceDisplayConfig) {
        this.priceDisplayConfig = priceDisplayConfig;
    }
    public List<PriceDisplayConfig> getPriceDisplayConfig() {
        return priceDisplayConfig;
    }
    
    public void setIncludedTaxesAndChargesAmount(IncludedTaxesAndChargesAmount includedTaxesAndChargesAmount) {
        this.includedTaxesAndChargesAmount = includedTaxesAndChargesAmount;
    }
    public IncludedTaxesAndChargesAmount getIncludedTaxesAndChargesAmount() {
        return includedTaxesAndChargesAmount;
    }
    
    public void setGrossAmountHotelCurrency(GrossAmountHotelCurrency grossAmountHotelCurrency) {
        this.grossAmountHotelCurrency = grossAmountHotelCurrency;
    }
    public GrossAmountHotelCurrency getGrossAmountHotelCurrency() {
        return grossAmountHotelCurrency;
    }
    
}