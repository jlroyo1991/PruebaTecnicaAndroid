package com.example.pruebatecnicaandroid.presentation.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.pruebatecnicaandroid.data.Repository;
import com.example.pruebatecnicaandroid.domain.entities.collection.PhotoLibrary;
import com.example.pruebatecnicaandroid.domain.entities.detailPhoto.PhotoDetail;

public class FlckrDetailViewModel extends ViewModel {

    private Repository repository;
    private MutableLiveData<PhotoDetail> photoDetailMutableLiveData;

    public void init(){
        repository = Repository.getInstance();
    }

    public LiveData<PhotoDetail> getDetailRepository() {
        return photoDetailMutableLiveData;
    }


    public void photoDetailMutableLiveData(String photoId, String secret){
        photoDetailMutableLiveData = repository.getDetail("35705637fdd6a170f36b1c35fe916017", "flickr.photos.getInfo", "json", 1, photoId, secret);
    }

}