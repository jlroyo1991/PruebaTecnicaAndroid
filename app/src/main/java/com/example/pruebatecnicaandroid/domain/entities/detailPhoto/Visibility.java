
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Visibility {

    @SerializedName("isfamily")
    private Long mIsfamily;
    @SerializedName("isfriend")
    private Long mIsfriend;
    @SerializedName("ispublic")
    private Long mIspublic;

    public Long getIsfamily() {
        return mIsfamily;
    }

    public Long getIsfriend() {
        return mIsfriend;
    }

    public Long getIspublic() {
        return mIspublic;
    }

    public static class Builder {

        private Long mIsfamily;
        private Long mIsfriend;
        private Long mIspublic;

        public Visibility.Builder withIsfamily(Long isfamily) {
            mIsfamily = isfamily;
            return this;
        }

        public Visibility.Builder withIsfriend(Long isfriend) {
            mIsfriend = isfriend;
            return this;
        }

        public Visibility.Builder withIspublic(Long ispublic) {
            mIspublic = ispublic;
            return this;
        }

        public Visibility build() {
            Visibility visibility = new Visibility();
            visibility.mIsfamily = mIsfamily;
            visibility.mIsfriend = mIsfriend;
            visibility.mIspublic = mIspublic;
            return visibility;
        }

    }

}
