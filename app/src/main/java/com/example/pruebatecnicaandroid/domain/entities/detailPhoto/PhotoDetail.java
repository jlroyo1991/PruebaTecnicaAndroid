
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;


import com.example.pruebatecnicaandroid.domain.entities.collection.Photo;
import com.google.gson.annotations.SerializedName;


public class PhotoDetail {

    @SerializedName("photo")
    private Photo mPhoto;
    @SerializedName("stat")
    private String mStat;

    public Photo getPhoto() {
        return mPhoto;
    }

    public void setPhoto(Photo photo) {
        mPhoto = photo;
    }

    public String getStat() {
        return mStat;
    }

    public void setStat(String stat) {
        mStat = stat;
    }

}
