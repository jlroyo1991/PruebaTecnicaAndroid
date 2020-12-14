
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import com.google.gson.annotations.SerializedName;


public class People {

    @SerializedName("haspeople")
    private Long mHaspeople;

    public Long getHaspeople() {
        return mHaspeople;
    }

    public void setHaspeople(Long haspeople) {
        mHaspeople = haspeople;
    }

}
