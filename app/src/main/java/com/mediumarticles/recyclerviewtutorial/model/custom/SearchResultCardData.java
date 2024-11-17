package com.mediumarticles.recyclerviewtutorial.model.custom;

//This model class I have created represents the data presented in SINGLE search result item
public class SearchResultCardData {
    double hotelId;
    String hotelUrl;
    String hotelName;
    String hotelAddress;
    String hotelCity;
    String hotelCountry;
    double hotelNumericRating;
    String hotelTextRating;

    public SearchResultCardData(double hotelId, String hotelUrl, String hotelName, String hotelAddress, String hotelCity, String hotelCountry, double hotelNumericRating, String hotelTextRating) {
        this.hotelId = hotelId;
        this.hotelUrl = hotelUrl;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelCity = hotelCity;
        this.hotelCountry = hotelCountry;
        this.hotelNumericRating = hotelNumericRating;
        this.hotelTextRating = hotelTextRating;
    }

    public double getHotelId() {
        return hotelId;
    }

    public String getHotelUrl() {
        return hotelUrl;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public String getHotelCountry() {
        return hotelCountry;
    }

    public double getHotelNumericRating() {
        return hotelNumericRating;
    }

    public String getHotelTextRating() {
        return hotelTextRating;
    }
}
