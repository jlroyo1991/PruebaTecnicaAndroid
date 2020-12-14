package com.example.pruebatecnicaandroid.presentation.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebatecnicaandroid.R;
import com.example.pruebatecnicaandroid.domain.entities.collection.Photo;
import com.example.pruebatecnicaandroid.domain.entities.collection.PhotosCollection;
import com.example.pruebatecnicaandroid.presentation.viewmodel.FlckrCollectionViewModel;
import com.example.pruebatecnicaandroid.presentation.adapter.PhotosAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FlckrCollectionViewModel flckrCollectionViewModel;
    private ArrayList<Photo> photosArrayList = new ArrayList<>();
    private RecyclerView photosRecyclerView;
    private PhotosAdapter photosAdapter;
    private SearchView simpleSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initSearchViewListener();
        setupRecyclerView();
    }

    private void initViewModel(String query) {
        flckrCollectionViewModel = ViewModelProviders.of(this).get(FlckrCollectionViewModel.class);
        flckrCollectionViewModel.init();
        flckrCollectionViewModel.requestFotoCollection(query);
        observeViewModel();
    }

    private void observeViewModel() {
        flckrCollectionViewModel.getPhotoRepository().observe(this, photoLibrary -> {
            PhotosCollection photosCollection = photoLibrary.getPhotos();
            photosArrayList.addAll(photosCollection.getPhoto());
            photosAdapter.notifyDataSetChanged();
        });
    }

    private void initViews() {
        photosRecyclerView = findViewById(R.id.photos_list);
        simpleSearchView = findViewById(R.id.photos_search_view);
    }

    private void initSearchViewListener() {
        simpleSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                photosArrayList.clear();
                initViewModel(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

    }

    private void setupRecyclerView() {
        if (photosAdapter == null) {
            photosAdapter = new PhotosAdapter(MainActivity.this, photosArrayList);
            photosRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            photosRecyclerView.setAdapter(photosAdapter);
            photosRecyclerView.setItemAnimator(new DefaultItemAnimator());
            photosRecyclerView.setNestedScrollingEnabled(true);
        }
    }
}