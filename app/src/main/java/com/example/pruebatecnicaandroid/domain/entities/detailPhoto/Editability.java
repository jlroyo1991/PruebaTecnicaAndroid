
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import com.google.gson.annotations.SerializedName;


public class Editability {

    @SerializedName("canaddmeta")
    private Long mCanaddmeta;
    @SerializedName("cancomment")
    private Long mCancomment;

    public Long getCanaddmeta() {
        return mCanaddmeta;
    }

    public void setCanaddmeta(Long canaddmeta) {
        mCanaddmeta = canaddmeta;
    }

    public Long getCancomment() {
        return mCancomment;
    }

    public void setCancomment(Long cancomment) {
        mCancomment = cancomment;
    }

}
