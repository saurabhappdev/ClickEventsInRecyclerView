package com.mediumarticles.recyclerviewtutorial.api;

import androidx.annotation.NonNull;

import com.mediumarticles.recyclerviewtutorial.BuildConfig;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

public class RetrofitInterceptor implements Interceptor{
    private final String rapidAPIKey = BuildConfig.RAPIDAPI_KEY;
    //You should define your api keys in local properties as I have done here

    @NonNull

    public Response intercept(Interceptor.Chain chain) throws IOException {
//headers are added here. Notice the .addHeader()
        okhttp3.Request request = chain.request().newBuilder()
                .addHeader("x-rapidapi-key", rapidAPIKey)
                .addHeader("x-rapidapi-host", "booking-com.p.rapidapi.com")
                .build();

        return chain.proceed(request);
    }
}
