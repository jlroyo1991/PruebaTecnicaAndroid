package com.example.pruebatecnicaandroid.presentation.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebatecnicaandroid.R;
import com.example.pruebatecnicaandroid.domain.entities.collection.Photo;
import com.example.pruebatecnicaandroid.domain.entities.collection.PhotosCollection;
import com.example.pruebatecnicaandroid.presentation.adapter.ListItemClickListener;
import com.example.pruebatecnicaandroid.presentation.viewmodel.FlckrCollectionViewModel;
import com.example.pruebatecnicaandroid.presentation.adapter.PhotosAdapter;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SearchActivity extends AppCompatActivity implements ListItemClickListener {

    private static final String SECRET = "SECRET";
    private static final String PHOTOID = "PHOTOID";
    private FlckrCollectionViewModel flckrCollectionViewModel;
    private ArrayList<Photo> photosArrayList = new ArrayList<>();
    private RecyclerView photosRecyclerView;
    private SearchView simpleSearchView;

    @Inject
    PhotosAdapter photosAdapter;

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
        photosAdapter.setPhotos(photosArrayList);
        photosAdapter.setListItemClickListener(this);
        photosRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        photosRecyclerView.setAdapter(photosAdapter);
        photosRecyclerView.setItemAnimator(new DefaultItemAnimator());
        photosRecyclerView.setNestedScrollingEnabled(true);
    }


    @Override
    public void onListItemClick(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(SECRET, photosArrayList.get(position).getSecret());
        intent.putExtra(PHOTOID, photosArrayList.get(position).getId());
        startActivity(intent);
    }
}