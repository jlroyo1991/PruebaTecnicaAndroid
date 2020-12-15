
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Publiceditability {

    @SerializedName("canaddmeta")
    private Long mCanaddmeta;
    @SerializedName("cancomment")
    private Long mCancomment;

    public Long getCanaddmeta() {
        return mCanaddmeta;
    }

    public Long getCancomment() {
        return mCancomment;
    }

    public static class Builder {

        private Long mCanaddmeta;
        private Long mCancomment;

        public Publiceditability.Builder withCanaddmeta(Long canaddmeta) {
            mCanaddmeta = canaddmeta;
            return this;
        }

        public Publiceditability.Builder withCancomment(Long cancomment) {
            mCancomment = cancomment;
            return this;
        }

        public Publiceditability build() {
            Publiceditability publiceditability = new Publiceditability();
            publiceditability.mCanaddmeta = mCanaddmeta;
            publiceditability.mCancomment = mCancomment;
            return publiceditability;
        }

    }

}
