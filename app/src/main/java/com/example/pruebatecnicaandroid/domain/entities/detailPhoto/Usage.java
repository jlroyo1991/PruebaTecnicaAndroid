
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import com.google.gson.annotations.SerializedName;


public class Usage {

    @SerializedName("canblog")
    private Long mCanblog;
    @SerializedName("candownload")
    private Long mCandownload;
    @SerializedName("canprint")
    private Long mCanprint;
    @SerializedName("canshare")
    private Long mCanshare;

    public Long getCanblog() {
        return mCanblog;
    }

    public void setCanblog(Long canblog) {
        mCanblog = canblog;
    }

    public Long getCandownload() {
        return mCandownload;
    }

    public void setCandownload(Long candownload) {
        mCandownload = candownload;
    }

    public Long getCanprint() {
        return mCanprint;
    }

    public void setCanprint(Long canprint) {
        mCanprint = canprint;
    }

    public Long getCanshare() {
        return mCanshare;
    }

    public void setCanshare(Long canshare) {
        mCanshare = canshare;
    }

}
