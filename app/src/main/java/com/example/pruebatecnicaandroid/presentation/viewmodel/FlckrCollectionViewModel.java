package com.example.pruebatecnicaandroid.presentation.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.pruebatecnicaandroid.data.Repository;
import com.example.pruebatecnicaandroid.domain.entities.collection.PhotoLibrary;

public class FlckrCollectionViewModel extends ViewModel {

    private Repository repository;
    private MutableLiveData<PhotoLibrary> photoLibraryMutableLiveData;

    public void init(){
        repository = Repository.getInstance();
    }

    public LiveData<PhotoLibrary> getPhotoRepository() {
        return photoLibraryMutableLiveData;
    }

    public void requestFotoCollection(String query){
        photoLibraryMutableLiveData = repository.getCollection("35705637fdd6a170f36b1c35fe916017", "flickr.photos.search", "json", 1, query);
    }


}