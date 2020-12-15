
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
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

    public Long getCandownload() {
        return mCandownload;
    }

    public Long getCanprint() {
        return mCanprint;
    }

    public Long getCanshare() {
        return mCanshare;
    }

    public static class Builder {

        private Long mCanblog;
        private Long mCandownload;
        private Long mCanprint;
        private Long mCanshare;

        public Usage.Builder withCanblog(Long canblog) {
            mCanblog = canblog;
            return this;
        }

        public Usage.Builder withCandownload(Long candownload) {
            mCandownload = candownload;
            return this;
        }

        public Usage.Builder withCanprint(Long canprint) {
            mCanprint = canprint;
            return this;
        }

        public Usage.Builder withCanshare(Long canshare) {
            mCanshare = canshare;
            return this;
        }

        public Usage build() {
            Usage usage = new Usage();
            usage.mCanblog = mCanblog;
            usage.mCandownload = mCandownload;
            usage.mCanprint = mCanprint;
            usage.mCanshare = mCanshare;
            return usage;
        }

    }

}
