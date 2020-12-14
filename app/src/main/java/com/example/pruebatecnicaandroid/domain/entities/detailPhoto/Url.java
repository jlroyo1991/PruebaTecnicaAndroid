
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import com.google.gson.annotations.SerializedName;


public class Url {

    @SerializedName("type")
    private String mType;
    @SerializedName("_content")
    private String m_content;

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String get_content() {
        return m_content;
    }

    public void set_content(String _content) {
        m_content = _content;
    }

}
