package com.example.pruebatecnicaandroid.data;

import com.example.pruebatecnicaandroid.domain.entities.collection.PhotoLibrary;
import com.example.pruebatecnicaandroid.domain.entities.detailPhoto.PhotoDetail;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface FlickrApi {
    @GET("rest/")
    Call<PhotoLibrary> getPhotoCollection(@Query("api_key") String apiKey,
                                          @Query("method") String method,
                                          @Query("format") String format,
                                          @Query("nojsoncallback") int nojson,
                                          @Query("tags") String tags);

    @GET("rest/")
    Call<PhotoDetail> getPhotoDetail(@Query("api_key") String apiKey,
                                     @Query("method") String method,
                                     @Query("format") String format,
                                     @Query("nojsoncallback") int nojson,
                                     @Query("photo_id") String photoId,
                                     @Query("secret") String secret);
}
