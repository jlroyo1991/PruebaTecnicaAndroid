
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Urls {

    @SerializedName("url")
    private List<Url> mUrl;

    public List<Url> getUrl() {
        return mUrl;
    }

    public void setUrl(List<Url> url) {
        mUrl = url;
    }

}
