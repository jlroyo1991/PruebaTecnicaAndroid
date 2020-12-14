package com.example.pruebatecnicaandroid.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.pruebatecnicaandroid.R;
import com.example.pruebatecnicaandroid.model.Photo;
import com.example.pruebatecnicaandroid.model.PhotosCollection;
import com.example.pruebatecnicaandroid.viewmodel.FlckrViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FlckrViewModel flckrViewModel;
    ArrayList<Photo> photosArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        flckrViewModel = ViewModelProviders.of(this).get(FlckrViewModel.class);
        flckrViewModel.init();
        flckrViewModel.getPhotoRepository().observe(this, photoLibrary -> {
            PhotosCollection photosCollection = photoLibrary.getPhotos();
            photosArrayList.addAll(photosCollection.getPhoto());
        });
    }
}