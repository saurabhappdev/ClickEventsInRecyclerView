package com.mediumarticles.recyclerviewtutorial.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://booking-com.p.rapidapi.com/v1/hotels/";

    private static Retrofit retrofit = null;
     // Se
    // Method to create and return a Retrofit instance
    private static Retrofit getClient() {
        if (retrofit == null) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            // Build OkHttpClient and add the interceptor
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new RetrofitInterceptor())
                    .addInterceptor(loggingInterceptor)// Add the custom interceptor
                    .build();

            // Create Retrofit instance
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client) // Set the custom OkHttpClient
                    .addConverterFactory(GsonConverterFactory.create()) // Use Gson for JSON parsing
                    .build();
        }
        return retrofit;
    }

    // Method to return the API service
    public static RetrofitService getApiService() {
        return getClient().create(RetrofitService.class);
    }
}
