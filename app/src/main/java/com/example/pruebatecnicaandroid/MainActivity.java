package com.example.pruebatecnicaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pruebatecnicaandroid.api.Repository;

public class MainActivity extends AppCompatActivity {

    private Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        repository = Repository.getInstance();
        repository.getCollection("35705637fdd6a170f36b1c35fe916017", "flickr.photos.search", "json", 1);

    }
}