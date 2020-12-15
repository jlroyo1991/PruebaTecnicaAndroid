
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Editability {

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

        public Editability.Builder withCanaddmeta(Long canaddmeta) {
            mCanaddmeta = canaddmeta;
            return this;
        }

        public Editability.Builder withCancomment(Long cancomment) {
            mCancomment = cancomment;
            return this;
        }

        public Editability build() {
            Editability editability = new Editability();
            editability.mCanaddmeta = mCanaddmeta;
            editability.mCancomment = mCancomment;
            return editability;
        }

    }

}
