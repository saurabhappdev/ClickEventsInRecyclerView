package com.mediumarticles.recyclerviewtutorial.utils;

@FunctionalInterface
public interface ClickEventHandler {
    void onItemClick(double hotelId);

}

//NOTE: If you are looking to send some data to the next activity or want to
// make API call on the basis of data selected here, you can create a parameter of
// that datatype
