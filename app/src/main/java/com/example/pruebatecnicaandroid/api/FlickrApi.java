package com.example.pruebatecnicaandroid.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface FlickrApi {
    @GET("getPhotoCollection")
    Call<PhotoResponse> getPhotoCollection(@Query("api_key") String apiKey,
                                           @Query("method") String method);

}
