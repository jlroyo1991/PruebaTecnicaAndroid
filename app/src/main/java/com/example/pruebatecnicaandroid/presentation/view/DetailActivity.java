package com.example.pruebatecnicaandroid.presentation.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.lifecycle.ViewModelProviders;

import com.example.pruebatecnicaandroid.R;
import com.example.pruebatecnicaandroid.domain.entities.collection.Photo;
import com.example.pruebatecnicaandroid.domain.entities.collection.PhotosCollection;
import com.example.pruebatecnicaandroid.domain.entities.detailPhoto.PhotoDetail;
import com.example.pruebatecnicaandroid.presentation.adapter.PhotosAdapter;
import com.example.pruebatecnicaandroid.presentation.viewmodel.FlckrCollectionViewModel;
import com.example.pruebatecnicaandroid.presentation.viewmodel.FlckrDetailViewModel;

import java.sql.SQLOutput;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class DetailActivity extends AppCompatActivity {

    @Inject
    PhotosAdapter photosAdapter;
    private String idPhoto;
    private String secret;
    private FlckrDetailViewModel flckrDetailViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getExtras();
        initViews();
        initViewModel();
    }

    private void initViews() {
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        textView.setText(idPhoto);
        textView2.setText(secret);
    }

    private void getExtras() {
        Intent intent = getIntent();
        idPhoto = intent.getStringExtra("PHOTOID");
        secret = intent.getStringExtra("SECRET");
    }

    private void initViewModel() {
        flckrDetailViewModel = ViewModelProviders.of(this).get(FlckrDetailViewModel.class);
        flckrDetailViewModel.init();
        flckrDetailViewModel.photoDetailMutableLiveData(idPhoto, secret);
        observeViewModel();
    }

    private void observeViewModel() {
        flckrDetailViewModel.getDetailRepository().observe(this, photoDetail -> {
            PhotoDetail photo = photoDetail;

            //Titulo
            //Autor
            //Fecha
            //Descripcion
            if (photo != null){
                System.out.println("USERNAME");
                System.out.println(photo.getPhoto().getOwner().getUsername());
                System.out.println("DESCRIPTION");
                System.out.println(photo.getPhoto().getDescription().get_content());
                System.out.println("DATE");
                System.out.println(photo.getPhoto().getDateuploaded());
                System.out.println("TITLE");
                System.out.println(photo.getPhoto().getTitle());
            }
        });
    }

}