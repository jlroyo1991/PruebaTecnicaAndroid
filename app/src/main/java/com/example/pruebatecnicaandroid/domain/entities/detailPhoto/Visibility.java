
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import com.google.gson.annotations.SerializedName;


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

    public void setIsfamily(Long isfamily) {
        mIsfamily = isfamily;
    }

    public Long getIsfriend() {
        return mIsfriend;
    }

    public void setIsfriend(Long isfriend) {
        mIsfriend = isfriend;
    }

    public Long getIspublic() {
        return mIspublic;
    }

    public void setIspublic(Long ispublic) {
        mIspublic = ispublic;
    }

}
