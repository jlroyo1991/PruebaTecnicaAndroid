package com.example.pruebatecnicaandroid.api;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private static Repository repository;

    public static Repository getInstance(){
        if (repository == null){
            repository = new Repository();
        }
        return repository;
    }

    private FlickrApi flickrApi;

    public Repository(){
        flickrApi = RetrofitService.cteateService(FlickrApi.class);
    }

    public void getCollection(String apiKey, String method, String format, int nojson){


        flickrApi.getPhotoCollection(apiKey, method, format, nojson).enqueue(new Callback<PhotoResponse>() {
            @Override
            public void onResponse(Call<PhotoResponse> call,
                                   Response<PhotoResponse> response) {
                if (response.isSuccessful()){
                    response.body();
                }else{
                    response.errorBody();
                }
            }

            @Override
            public void onFailure(Call<PhotoResponse> call, Throwable t) {
                t.getCause();
                t.getMessage();
                t.getLocalizedMessage();
            }
        });
    }
}