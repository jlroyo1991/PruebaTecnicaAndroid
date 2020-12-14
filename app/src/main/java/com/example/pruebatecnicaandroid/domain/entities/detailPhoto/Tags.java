
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Tags {

    @SerializedName("tag")
    private List<Tag> mTag;

    public List<Tag> getTag() {
        return mTag;
    }

    public void setTag(List<Tag> tag) {
        mTag = tag;
    }

}
