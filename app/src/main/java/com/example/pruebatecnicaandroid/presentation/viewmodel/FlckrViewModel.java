package com.example.pruebatecnicaandroid.presentation.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.pruebatecnicaandroid.data.Repository;
import com.example.pruebatecnicaandroid.domain.entities.PhotoLibrary;

public class FlckrViewModel extends ViewModel {

    private Repository repository;
    private MutableLiveData<PhotoLibrary> mutableLiveData;

    public void init(String query){

        repository = Repository.getInstance();
        mutableLiveData = repository.getCollection("35705637fdd6a170f36b1c35fe916017", "flickr.photos.search", "json", 1, query);

    }

    public LiveData<PhotoLibrary> getPhotoRepository() {
        return mutableLiveData;
    }

}