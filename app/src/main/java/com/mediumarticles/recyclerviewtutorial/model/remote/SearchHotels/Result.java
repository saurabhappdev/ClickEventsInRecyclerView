package com.mediumarticles.recyclerviewtutorial.model.remote.SearchHotels;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Result {

//   @SerializedName("native_ad_id")
//   String nativeAdId;
//
//   @SerializedName("countrycode")
//   String countrycode;
//
//   @SerializedName("preferred_plus")
//   double preferredPlus;
//
//   @SerializedName("cc_required")
//   double ccRequired;
//
//   @SerializedName("district")
//   String district;

   @SerializedName("hotel_id")
   double hotelId;

//   @SerializedName("native_ads_cpc")
//   double nativeAdsCpc;
//
//   @SerializedName("property_cribs_availability")
//   double propertyCribsAvailability;
//
//   @SerializedName("crib_guaranteed")
//   String cribGuaranteed;
//
//   @SerializedName("cant_book")
//   double cantBook;
//
//   @SerializedName("distance")
//   String distance;
//
//   @SerializedName("city_in_trans")
//   String citydoublerans;
//
//   @SerializedName("mobile_discount_percentage")
//   double mobileDiscountPercentage;
//
//   @SerializedName("zip")
//   String zip;
//
//   @SerializedName("main_photo_id")
//   double mainPhotoId;
//
//   @SerializedName("is_geo_rate")
//   String isGeoRate;
//
//   @SerializedName("extended")
//   double extended;
//
//   @SerializedName("checkin")
//   Checkin checkin;
//
//   @SerializedName("is_beach_front")
//   double isBeachFront;
//
//   @SerializedName("city_trans")
//   String cityTrans;
//
//   @SerializedName("checkout")
//   Checkout checkout;
//
//   @SerializedName("currency_code")
//   String currencyCode;
//
//   @SerializedName("hotel_name_trans")
//   String hotelNameTrans;
//
//   @SerializedName("preferred")
//   double preferred;
//
//   @SerializedName("is_smart_deal")
//   double isSmartDeal;
//
//   @SerializedName("is_genius_deal")
//   double isGeniusDeal;

   @SerializedName("country_trans")
   String countryTrans;

//   @SerializedName("type")
//   String type;
//
//   @SerializedName("ribbon_text")
//   String ribbonText;

   @SerializedName("address")
   String address;

//   @SerializedName("wishlist_count")
//   double wishlistCount;

   @SerializedName("review_score_word")
   String reviewScoreWord;

//   @SerializedName("latitude")
//   double latitude;

   @SerializedName("city_name_en")
   String cityNameEn;

//   @SerializedName("longitude")
//   double longitude;

   @SerializedName("main_photo_url")
   String mainPhotoUrl;

//   @SerializedName("distance_to_cc")
//   String distanceToCc;
//
//   @SerializedName("price_is_final")
//   double priceIsFinal;
//
//   @SerializedName("default_language")
//   String defaultLanguage;
//
//   @SerializedName("block_ids")
//   List<String> blockIds;
//
//   @SerializedName("in_best_district")
//   double inBestDistrict;
//
//   @SerializedName("updated_checkout")
//   String updatedCheckout;
//
//   @SerializedName("soldout")
//   double soldout;
//
//   @SerializedName("id")
//   String id;
//
//   @SerializedName("city")
//   String city;
//
//   @SerializedName("composite_price_breakdown")
//   CompositePriceBreakdown compositePriceBreakdown;
//
//   @SerializedName("min_total_price")
//   double mdoubleotalPrice;
//
//   @SerializedName("genius_discount_percentage")
//   double geniusDiscountPercentage;
//
//   @SerializedName("selected_review_topic")
//   String selectedReviewTopic;
//
//   @SerializedName("distances")
//   List<Distances> distances;

   @SerializedName("hotel_name")
   String hotelName;

//   @SerializedName("districts")
//   String districts;
//
//   @SerializedName("is_mobile_deal")
//   double isMobileDeal;
//
//   @SerializedName("is_no_prepayment_block")
//   double isNoPrepaymentBlock;
//
//   @SerializedName("class_is_estimated")
//   double classIsEstimated;
//
//   @SerializedName("hotel_facilities")
//   String hotelFacilities;
//
//   @SerializedName("ufi")
//   double ufi;
//
//   @SerializedName("cc1")
//   String cc1;

   @SerializedName("review_score")
   double reviewScore;

   @SerializedName("review_nr")
   double reviewNr;

//   @SerializedName("hotel_has_vb_boost")
//   double hotelHasVbBoost;
//
//   @SerializedName("distance_to_cc_formatted")
//   String distanceToCcFormatted;
//
//   @SerializedName("bwallet")
//   Bwallet bwallet;
//
//   @SerializedName("address_trans")
//   String addressTrans;
//
//   @SerializedName("url")
//   String url;
//
//   @SerializedName("currencycode")
//   String currencycode;
//
//   @SerializedName("accommodation_type_name")
//   String accommodationTypeName;
//
//   @SerializedName("unit_configuration_label")
//   String unitConfigurationLabel;
//
//   @SerializedName("default_wishlist_name")
//   String defaultWishlistName;
//
//   @SerializedName("price_breakdown")
//   PriceBreakdown priceBreakdown;
//
//   @SerializedName("timezone")
//   String timezone;
//
//   @SerializedName("is_free_cancellable")
//   double isFreeCancellable;
//
//   @SerializedName("native_ads_tracking")
//   String nativeAdsTracking;
//
//   @SerializedName("children_not_allowed")
//   double childrenNotAllowed;
//
//   @SerializedName("district_id")
//   double districtId;
//
//   @SerializedName("class")
//   double classs;
//
//   @SerializedName("matching_units_configuration")
//   MatchingUnitsConfiguration matchingUnitsConfiguration;
//
//   @SerializedName("accommodation_type")
//   double accommodationType;
//
//   @SerializedName("review_recommendation")
//   String reviewRecommendation;
//
//   @SerializedName("updated_checkin")
//   String updatedCheckin;
//
//   @SerializedName("badges")
//   List<Object> badges;
//
//   @SerializedName("is_city_center")
//   double isCityCenter;
//
//   @SerializedName("max_photo_url")
//   String maxPhotoUrl;
//
//   @SerializedName("max_1440_photo_url")
//   String max1440PhotoUrl;


//    public void setNativeAdId(String nativeAdId) {
//        this.nativeAdId = nativeAdId;
//    }
//    public String getNativeAdId() {
//        return nativeAdId;
//    }
//
//    public void setCountrycode(String countrycode) {
//        this.countrycode = countrycode;
//    }
//    public String getCountrycode() {
//        return countrycode;
//    }
//
//    public void setPreferredPlus(double preferredPlus) {
//        this.preferredPlus = preferredPlus;
//    }
//    public double getPreferredPlus() {
//        return preferredPlus;
//    }
//
//    public void setCcRequired(double ccRequired) {
//        this.ccRequired = ccRequired;
//    }
//    public double getCcRequired() {
//        return ccRequired;
//    }
//
//    public void setDistrict(String district) {
//        this.district = district;
//    }
//    public String getDistrict() {
//        return district;
//    }
    
    public void setHotelId(double hotelId) {
        this.hotelId = hotelId;
    }
    public double getHotelId() {
        return hotelId;
    }
    
//    public void setNativeAdsCpc(double nativeAdsCpc) {
//        this.nativeAdsCpc = nativeAdsCpc;
//    }
//    public double getNativeAdsCpc() {
//        return nativeAdsCpc;
//    }
//
//    public void setPropertyCribsAvailability(double propertyCribsAvailability) {
//        this.propertyCribsAvailability = propertyCribsAvailability;
//    }
//    public double getPropertyCribsAvailability() {
//        return propertyCribsAvailability;
//    }
//
//    public void setCribGuaranteed(String cribGuaranteed) {
//        this.cribGuaranteed = cribGuaranteed;
//    }
//    public String getCribGuaranteed() {
//        return cribGuaranteed;
//    }
//
//    public void setCantBook(double cantBook) {
//        this.cantBook = cantBook;
//    }
//    public double getCantBook() {
//        return cantBook;
//    }
//
//    public void setDistance(String distance) {
//        this.distance = distance;
//    }
//    public String getDistance() {
//        return distance;
//    }
//
//    public void setCitydoublerans(String citydoublerans) {
//        this.citydoublerans = citydoublerans;
//    }
//    public String getCitydoublerans() {
//        return citydoublerans;
//    }
//
//    public void setMobileDiscountPercentage(double mobileDiscountPercentage) {
//        this.mobileDiscountPercentage = mobileDiscountPercentage;
//    }
//    public double getMobileDiscountPercentage() {
//        return mobileDiscountPercentage;
//    }
//
//    public void setZip(String zip) {
//        this.zip = zip;
//    }
//    public String getZip() {
//        return zip;
//    }
//
//    public void setMainPhotoId(double mainPhotoId) {
//        this.mainPhotoId = mainPhotoId;
//    }
//    public double getMainPhotoId() {
//        return mainPhotoId;
//    }
//
//    public void setIsGeoRate(String isGeoRate) {
//        this.isGeoRate = isGeoRate;
//    }
//    public String getIsGeoRate() {
//        return isGeoRate;
//    }
//
//    public void setExtended(double extended) {
//        this.extended = extended;
//    }
//    public double getExtended() {
//        return extended;
//    }
//
//    public void setCheckin(Checkin checkin) {
//        this.checkin = checkin;
//    }
//    public Checkin getCheckin() {
//        return checkin;
//    }
//
//    public void setIsBeachFront(double isBeachFront) {
//        this.isBeachFront = isBeachFront;
//    }
//    public double getIsBeachFront() {
//        return isBeachFront;
//    }
//
//    public void setCityTrans(String cityTrans) {
//        this.cityTrans = cityTrans;
//    }
//    public String getCityTrans() {
//        return cityTrans;
//    }
//
//    public void setCheckout(Checkout checkout) {
//        this.checkout = checkout;
//    }
//    public Checkout getCheckout() {
//        return checkout;
//    }
//
//    public void setCurrencyCode(String currencyCode) {
//        this.currencyCode = currencyCode;
//    }
//    public String getCurrencyCode() {
//        return currencyCode;
//    }
//
//    public void setHotelNameTrans(String hotelNameTrans) {
//        this.hotelNameTrans = hotelNameTrans;
//    }
//    public String getHotelNameTrans() {
//        return hotelNameTrans;
//    }
//
//    public void setPreferred(double preferred) {
//        this.preferred = preferred;
//    }
//    public double getPreferred() {
//        return preferred;
//    }
//
//    public void setIsSmartDeal(double isSmartDeal) {
//        this.isSmartDeal = isSmartDeal;
//    }
//    public double getIsSmartDeal() {
//        return isSmartDeal;
//    }
//
//    public void setIsGeniusDeal(double isGeniusDeal) {
//        this.isGeniusDeal = isGeniusDeal;
//    }
//    public double getIsGeniusDeal() {
//        return isGeniusDeal;
//    }
    
    public void setCountryTrans(String countryTrans) {
        this.countryTrans = countryTrans;
    }
    public String getCountryTrans() {
        return countryTrans;
    }
    
//    public void setType(String type) {
//        this.type = type;
//    }
//    public String getType() {
//        return type;
//    }
//
//    public void setRibbonText(String ribbonText) {
//        this.ribbonText = ribbonText;
//    }
//    public String getRibbonText() {
//        return ribbonText;
//    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    
//    public void setWishlistCount(double wishlistCount) {
//        this.wishlistCount = wishlistCount;
//    }
//    public double getWishlistCount() {
//        return wishlistCount;
//    }
    
    public void setReviewScoreWord(String reviewScoreWord) {
        this.reviewScoreWord = reviewScoreWord;
    }
    public String getReviewScoreWord() {
        return reviewScoreWord;
    }
    
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }
//    public double getLatitude() {
//        return latitude;
//    }
//
    public void setCityNameEn(String cityNameEn) {
        this.cityNameEn = cityNameEn;
    }
    public String getCityNameEn() {
        return cityNameEn;
    }
    
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }
//    public double getLongitude() {
//        return longitude;
//    }
    
    public void setMainPhotoUrl(String mainPhotoUrl) {
        this.mainPhotoUrl = mainPhotoUrl;
    }
    public String getMainPhotoUrl() {
        return mainPhotoUrl;
    }
    
//    public void setDistanceToCc(String distanceToCc) {
//        this.distanceToCc = distanceToCc;
//    }
//    public String getDistanceToCc() {
//        return distanceToCc;
//    }
//
//    public void setPriceIsFinal(double priceIsFinal) {
//        this.priceIsFinal = priceIsFinal;
//    }
//    public double getPriceIsFinal() {
//        return priceIsFinal;
//    }
//
//    public void setDefaultLanguage(String defaultLanguage) {
//        this.defaultLanguage = defaultLanguage;
//    }
//    public String getDefaultLanguage() {
//        return defaultLanguage;
//    }
//
//    public void setBlockIds(List<String> blockIds) {
//        this.blockIds = blockIds;
//    }
//    public List<String> getBlockIds() {
//        return blockIds;
//    }
//
//    public void setInBestDistrict(double inBestDistrict) {
//        this.inBestDistrict = inBestDistrict;
//    }
//    public double getInBestDistrict() {
//        return inBestDistrict;
//    }
//
//    public void setUpdatedCheckout(String updatedCheckout) {
//        this.updatedCheckout = updatedCheckout;
//    }
//    public String getUpdatedCheckout() {
//        return updatedCheckout;
//    }
//
//    public void setSoldout(double soldout) {
//        this.soldout = soldout;
//    }
//    public double getSoldout() {
//        return soldout;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//    public String getId() {
//        return id;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//    public String getCity() {
//        return city;
//    }
//
//    public void setCompositePriceBreakdown(CompositePriceBreakdown compositePriceBreakdown) {
//        this.compositePriceBreakdown = compositePriceBreakdown;
//    }
//    public CompositePriceBreakdown getCompositePriceBreakdown() {
//        return compositePriceBreakdown;
//    }
//
//    public void setMdoubleotalPrice(double mdoubleotalPrice) {
//        this.mdoubleotalPrice = mdoubleotalPrice;
//    }
//    public double getMdoubleotalPrice() {
//        return mdoubleotalPrice;
//    }
//
//    public void setGeniusDiscountPercentage(double geniusDiscountPercentage) {
//        this.geniusDiscountPercentage = geniusDiscountPercentage;
//    }
//    public double getGeniusDiscountPercentage() {
//        return geniusDiscountPercentage;
//    }
//
//    public void setSelectedReviewTopic(String selectedReviewTopic) {
//        this.selectedReviewTopic = selectedReviewTopic;
//    }
//    public String getSelectedReviewTopic() {
//        return selectedReviewTopic;
//    }
//
//    public void setDistances(List<Distances> distances) {
//        this.distances = distances;
//    }
//    public List<Distances> getDistances() {
//        return distances;
//    }
    
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public String getHotelName() {
        return hotelName;
    }
    
//    public void setDistricts(String districts) {
//        this.districts = districts;
//    }
//    public String getDistricts() {
//        return districts;
//    }
//
//    public void setIsMobileDeal(double isMobileDeal) {
//        this.isMobileDeal = isMobileDeal;
//    }
//    public double getIsMobileDeal() {
//        return isMobileDeal;
//    }
//
//    public void setIsNoPrepaymentBlock(double isNoPrepaymentBlock) {
//        this.isNoPrepaymentBlock = isNoPrepaymentBlock;
//    }
//    public double getIsNoPrepaymentBlock() {
//        return isNoPrepaymentBlock;
//    }
//
//    public void setClassIsEstimated(double classIsEstimated) {
//        this.classIsEstimated = classIsEstimated;
//    }
//    public double getClassIsEstimated() {
//        return classIsEstimated;
//    }
//
//    public void setHotelFacilities(String hotelFacilities) {
//        this.hotelFacilities = hotelFacilities;
//    }
//    public String getHotelFacilities() {
//        return hotelFacilities;
//    }
//
//    public void setUfi(double ufi) {
//        this.ufi = ufi;
//    }
//    public double getUfi() {
//        return ufi;
//    }
//
//    public void setCc1(String cc1) {
//        this.cc1 = cc1;
//    }
//    public String getCc1() {
//        return cc1;
//    }
    
    public void setReviewScore(double reviewScore) {
        this.reviewScore = reviewScore;
    }
    public double getReviewScore() {
        return reviewScore;
    }
    
    public void setReviewNr(double reviewNr) {
        this.reviewNr = reviewNr;
    }
    public double getReviewNr() {
        return reviewNr;
    }
    
//    public void setHotelHasVbBoost(double hotelHasVbBoost) {
//        this.hotelHasVbBoost = hotelHasVbBoost;
//    }
//    public double getHotelHasVbBoost() {
//        return hotelHasVbBoost;
//    }
//
//    public void setDistanceToCcFormatted(String distanceToCcFormatted) {
//        this.distanceToCcFormatted = distanceToCcFormatted;
//    }
//    public String getDistanceToCcFormatted() {
//        return distanceToCcFormatted;
//    }
//
//    public void setBwallet(Bwallet bwallet) {
//        this.bwallet = bwallet;
//    }
//    public Bwallet getBwallet() {
//        return bwallet;
//    }
//
//    public void setAddressTrans(String addressTrans) {
//        this.addressTrans = addressTrans;
//    }
//    public String getAddressTrans() {
//        return addressTrans;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//    public String getUrl() {
//        return url;
//    }
//
//    public void setCurrencycode(String currencycode) {
//        this.currencycode = currencycode;
//    }
//    public String getCurrencycode() {
//        return currencycode;
//    }
//
//    public void setAccommodationTypeName(String accommodationTypeName) {
//        this.accommodationTypeName = accommodationTypeName;
//    }
//    public String getAccommodationTypeName() {
//        return accommodationTypeName;
//    }
//
//    public void setUnitConfigurationLabel(String unitConfigurationLabel) {
//        this.unitConfigurationLabel = unitConfigurationLabel;
//    }
//    public String getUnitConfigurationLabel() {
//        return unitConfigurationLabel;
//    }
//
//    public void setDefaultWishlistName(String defaultWishlistName) {
//        this.defaultWishlistName = defaultWishlistName;
//    }
//    public String getDefaultWishlistName() {
//        return defaultWishlistName;
//    }
//
//    public void setPriceBreakdown(PriceBreakdown priceBreakdown) {
//        this.priceBreakdown = priceBreakdown;
//    }
//    public PriceBreakdown getPriceBreakdown() {
//        return priceBreakdown;
//    }
//
//    public void setTimezone(String timezone) {
//        this.timezone = timezone;
//    }
//    public String getTimezone() {
//        return timezone;
//    }
//
//    public void setIsFreeCancellable(double isFreeCancellable) {
//        this.isFreeCancellable = isFreeCancellable;
//    }
//    public double getIsFreeCancellable() {
//        return isFreeCancellable;
//    }
//
//    public void setNativeAdsTracking(String nativeAdsTracking) {
//        this.nativeAdsTracking = nativeAdsTracking;
//    }
//    public String getNativeAdsTracking() {
//        return nativeAdsTracking;
//    }
//
//    public void setChildrenNotAllowed(double childrenNotAllowed) {
//        this.childrenNotAllowed = childrenNotAllowed;
//    }
//    public double getChildrenNotAllowed() {
//        return childrenNotAllowed;
//    }
//
//    public void setDistrictId(double districtId) {
//        this.districtId = districtId;
//    }
//    public double getDistrictId() {
//        return districtId;
//    }
//
//    public void setClass(double classs) {
//        this.classs = classs;
//    }
//    public double getClasss() {
//        return classs;
//    }
//
//    public void setMatchingUnitsConfiguration(MatchingUnitsConfiguration matchingUnitsConfiguration) {
//        this.matchingUnitsConfiguration = matchingUnitsConfiguration;
//    }
//    public MatchingUnitsConfiguration getMatchingUnitsConfiguration() {
//        return matchingUnitsConfiguration;
//    }
//
//    public void setAccommodationType(double accommodationType) {
//        this.accommodationType = accommodationType;
//    }
//    public double getAccommodationType() {
//        return accommodationType;
//    }
//
//    public void setReviewRecommendation(String reviewRecommendation) {
//        this.reviewRecommendation = reviewRecommendation;
//    }
//    public String getReviewRecommendation() {
//        return reviewRecommendation;
//    }
//
//    public void setUpdatedCheckin(String updatedCheckin) {
//        this.updatedCheckin = updatedCheckin;
//    }
//    public String getUpdatedCheckin() {
//        return updatedCheckin;
//    }
//
//    public void setBadges(List<Object> badges) {
//        this.badges = badges;
//    }
//    public List<Object> getBadges() {
//        return badges;
//    }
//
//    public void setIsCityCenter(double isCityCenter) {
//        this.isCityCenter = isCityCenter;
//    }
//    public double getIsCityCenter() {
//        return isCityCenter;
//    }
//
//    public void setMaxPhotoUrl(String maxPhotoUrl) {
//        this.maxPhotoUrl = maxPhotoUrl;
//    }
//    public String getMaxPhotoUrl() {
//        return maxPhotoUrl;
//    }
//
//    public void setMax1440PhotoUrl(String max1440PhotoUrl) {
//        this.max1440PhotoUrl = max1440PhotoUrl;
//    }
//    public String getMax1440PhotoUrl() {
//        return max1440PhotoUrl;
//    }
//
}