
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
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

    public String getPosted() {
        return mPosted;
    }

    public String getTaken() {
        return mTaken;
    }

    public String getTakengranularity() {
        return mTakengranularity;
    }

    public String getTakenunknown() {
        return mTakenunknown;
    }

    public static class Builder {

        private String mLastupdate;
        private String mPosted;
        private String mTaken;
        private String mTakengranularity;
        private String mTakenunknown;

        public Dates.Builder withLastupdate(String lastupdate) {
            mLastupdate = lastupdate;
            return this;
        }

        public Dates.Builder withPosted(String posted) {
            mPosted = posted;
            return this;
        }

        public Dates.Builder withTaken(String taken) {
            mTaken = taken;
            return this;
        }

        public Dates.Builder withTakengranularity(String takengranularity) {
            mTakengranularity = takengranularity;
            return this;
        }

        public Dates.Builder withTakenunknown(String takenunknown) {
            mTakenunknown = takenunknown;
            return this;
        }

        public Dates build() {
            Dates dates = new Dates();
            dates.mLastupdate = mLastupdate;
            dates.mPosted = mPosted;
            dates.mTaken = mTaken;
            dates.mTakengranularity = mTakengranularity;
            dates.mTakenunknown = mTakenunknown;
            return dates;
        }

    }

}
