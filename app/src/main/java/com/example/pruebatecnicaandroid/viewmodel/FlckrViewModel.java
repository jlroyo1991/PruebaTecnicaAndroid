package com.example.pruebatecnicaandroid.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.pruebatecnicaandroid.api.Repository;
import com.example.pruebatecnicaandroid.model.PhotoLibrary;

public class FlckrViewModel extends ViewModel {

    private Repository repository;
    private MutableLiveData<PhotoLibrary> mutableLiveData;

    public void init(){
        if (mutableLiveData != null){
            return;
        }
        repository = Repository.getInstance();
        mutableLiveData = repository.getCollection("35705637fdd6a170f36b1c35fe916017", "flickr.photos.search", "json", 1, "bank");

    }

    public LiveData<PhotoLibrary> getPhotoRepository() {
        return mutableLiveData;
    }

}