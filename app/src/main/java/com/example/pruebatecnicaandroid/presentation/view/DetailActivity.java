package com.example.pruebatecnicaandroid.presentation.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;
import com.example.pruebatecnicaandroid.R;
import com.example.pruebatecnicaandroid.domain.entities.detailPhoto.PhotoDetail;
import com.example.pruebatecnicaandroid.presentation.viewmodel.FlckrDetailViewModel;
import com.example.pruebatecnicaandroid.utils.FormatterUtils;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class DetailActivity extends AppCompatActivity {

    private String idPhoto;
    private String secret;
    private FlckrDetailViewModel flckrDetailViewModel;
    private TextView userNameTextView;
    private TextView descriptionTextView;
    private TextView dateUploadedTextView;
    private TextView title;
    private ImageView image;
    private String url;
    private String date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getExtras();
        initViews();
        initToolbar();
        initViewModel();
    }


    private void initToolbar() {
        Toolbar myToolbar = findViewById(R.id.detail_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle(getString(R.string.detail_string));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        myToolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private void initViews() {
        userNameTextView = findViewById(R.id.username_textview);
        descriptionTextView = findViewById(R.id.description_textview);
        dateUploadedTextView = findViewById(R.id.date_uploaded_textview);
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
                getValuesFromFormatter(photoDetail);
                setValuesToView(photoDetail);
            }
        });
    }

    private void getValuesFromFormatter(PhotoDetail photoDetail) {
        url = FormatterUtils.formatUrl(photoDetail.getPhoto().getFarm(), photoDetail.getPhoto().getServer(), photoDetail.getPhoto().getId(),  photoDetail.getPhoto().getSecret());
        date = FormatterUtils.getDate(Long.parseLong(photoDetail.getPhoto().getDateuploaded()));
    }

    private void setValuesToView(PhotoDetail photoDetail) {

        Glide.with(this).load(url).centerCrop().into(image);
        userNameTextView.setText(photoDetail.getPhoto().getOwner().getUsername());
        descriptionTextView.setText(photoDetail.getPhoto().getDescription().get_content());
        dateUploadedTextView.setText(date);
        title.setText(photoDetail.getPhoto().getTitle().get_content());
    }

}