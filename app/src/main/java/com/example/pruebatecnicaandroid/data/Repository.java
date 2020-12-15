package com.example.pruebatecnicaandroid.data;

import androidx.lifecycle.MutableLiveData;

import com.example.pruebatecnicaandroid.domain.entities.collection.PhotoLibrary;
import com.example.pruebatecnicaandroid.domain.entities.detailPhoto.PhotoDetail;

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
        flickrApi = RetrofitService.createService(FlickrApi.class);
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
                    response.errorBody();
                }
            }

            @Override
            public void onFailure(Call<PhotoLibrary> call, Throwable t) {
                photosData.setValue(null);
            }
        });

        return photosData;
    }

    public MutableLiveData<PhotoDetail> getDetail(String apiKey, String method, String format, int nojson, String photo_id, String secret){

        MutableLiveData<PhotoDetail> photosData = new MutableLiveData<>();

        flickrApi.getPhotoDetail(apiKey, method, format, nojson, photo_id, secret).enqueue(new Callback<PhotoDetail>() {
            @Override
            public void onResponse(Call<PhotoDetail> call,
                                   Response<PhotoDetail> response) {
                if (response.isSuccessful()){
                    photosData.setValue(response.body());
                }else{
                    response.errorBody();
                }
            }

            @Override
            public void onFailure(Call<PhotoDetail> call, Throwable t) {
                photosData.setValue(null);
                t.getLocalizedMessage();
                t.getMessage();
                t.getCause();
            }
        });

        return photosData;
    }
}