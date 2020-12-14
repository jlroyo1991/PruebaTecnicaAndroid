
package com.example.pruebatecnicaandroid.model;

import com.google.gson.annotations.SerializedName;


public class PhotoLibrary {

    @SerializedName("photos")
    private PhotosCollection mPhotos;

    public PhotosCollection getPhotos() {
        return mPhotos;
    }

    public void PhotosCollection(PhotosCollection photos) {
        mPhotos = photos;
    }

}
