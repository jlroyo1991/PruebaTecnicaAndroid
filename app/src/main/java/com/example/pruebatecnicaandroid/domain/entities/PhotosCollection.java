
package com.example.pruebatecnicaandroid.domain.entities;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PhotosCollection {

    @SerializedName("page")
    private Long mPage;
    @SerializedName("pages")
    private Long mPages;
    @SerializedName("perpage")
    private Long mPerpage;
    @SerializedName("photo")
    private List<Photo> mPhoto;
    @SerializedName("total")
    private String mTotal;

    public Long getPage() {
        return mPage;
    }

    public void setPage(Long page) {
        mPage = page;
    }

    public Long getPages() {
        return mPages;
    }

    public void setPages(Long pages) {
        mPages = pages;
    }

    public Long getPerpage() {
        return mPerpage;
    }

    public void setPerpage(Long perpage) {
        mPerpage = perpage;
    }

    public List<Photo> getPhoto() {
        return mPhoto;
    }

    public void setPhoto(List<Photo> photo) {
        mPhoto = photo;
    }

    public String getTotal() {
        return mTotal;
    }

    public void setTotal(String total) {
        mTotal = total;
    }

}
