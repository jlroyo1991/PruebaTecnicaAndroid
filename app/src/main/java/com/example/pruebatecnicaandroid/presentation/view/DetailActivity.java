package com.example.pruebatecnicaandroid.presentation.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;
import com.example.pruebatecnicaandroid.R;
import com.example.pruebatecnicaandroid.presentation.viewmodel.FlckrDetailViewModel;
import com.example.pruebatecnicaandroid.utils.FormatterUtils;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class DetailActivity extends AppCompatActivity {

    private String idPhoto;
    private String secret;
    private FlckrDetailViewModel flckrDetailViewModel;
    private TextView userName;
    private TextView description;
    private TextView dateUploaded;
    private TextView title;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getExtras();
        initViews();
        initViewModel();
    }

    private void initViews() {
        userName = findViewById(R.id.username_textview);
        description = findViewById(R.id.description_textview);
        dateUploaded = findViewById(R.id.date_uploaded_textview);
        title = findViewById(R.id.title_textview);
        image = findViewById(R.id.detail_imageview);
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

            if (photoDetail != null){
                String url = FormatterUtils.formatUrl(photoDetail.getPhoto().getFarm(), photoDetail.getPhoto().getServer(), photoDetail.getPhoto().getId(),  photoDetail.getPhoto().getSecret());

                Glide.with(this).load(url).centerCrop().into(image);
                userName.setText(photoDetail.getPhoto().getOwner().getUsername());
                description.setText(photoDetail.getPhoto().getDescription().get_content());
                dateUploaded.setText(photoDetail.getPhoto().getDateuploaded());
                title.setText(photoDetail.getPhoto().getTitle().get_content());
            }
        });
    }

}