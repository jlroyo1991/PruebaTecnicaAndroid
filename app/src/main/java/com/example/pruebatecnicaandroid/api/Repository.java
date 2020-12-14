package com.example.pruebatecnicaandroid.api;

import androidx.lifecycle.MutableLiveData;

import com.example.pruebatecnicaandroid.model.PhotoLibrary;

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

    public MutableLiveData<PhotoLibrary> getCollection(String apiKey, String method, String format, int nojson, String tags){

        MutableLiveData<PhotoLibrary> photosData = new MutableLiveData<>();

        flickrApi.getPhotoCollection(apiKey, method, format, nojson, tags).enqueue(new Callback<PhotoLibrary>() {
            @Override
            public void onResponse(Call<PhotoLibrary> call,
                                   Response<PhotoLibrary> response) {
                if (response.isSuccessful()){
                    photosData.setValue(response.body());
                }else{
                    //TODO: CONTROL DE ERRORES
                    response.errorBody();
                }
            }

            @Override
            public void onFailure(Call<PhotoLibrary> call, Throwable t) {
                //TODO: CONTROL DE ERRORES

                t.getCause();
                t.getMessage();
                t.getLocalizedMessage();

                photosData.setValue(null);
            }
        });

        return photosData;
    }
}