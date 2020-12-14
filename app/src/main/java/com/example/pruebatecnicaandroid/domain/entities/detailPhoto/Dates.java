
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import com.google.gson.annotations.SerializedName;


public class Dates {

    @SerializedName("lastupdate")
    private String mLastupdate;
    @SerializedName("posted")
    private String mPosted;
    @SerializedName("taken")
    private String mTaken;
    @SerializedName("takengranularity")
    private String mTakengranularity;
    @SerializedName("takenunknown")
    private String mTakenunknown;

    public String getLastupdate() {
        return mLastupdate;
    }

    public void setLastupdate(String lastupdate) {
        mLastupdate = lastupdate;
    }

    public String getPosted() {
        return mPosted;
    }

    public void setPosted(String posted) {
        mPosted = posted;
    }

    public String getTaken() {
        return mTaken;
    }

    public void setTaken(String taken) {
        mTaken = taken;
    }

    public String getTakengranularity() {
        return mTakengranularity;
    }

    public void setTakengranularity(String takengranularity) {
        mTakengranularity = takengranularity;
    }

    public String getTakenunknown() {
        return mTakenunknown;
    }

    public void setTakenunknown(String takenunknown) {
        mTakenunknown = takenunknown;
    }

}
