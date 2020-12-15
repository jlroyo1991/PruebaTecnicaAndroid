
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Url {

    @SerializedName("type")
    private String mType;
    @SerializedName("_content")
    private String m_content;

    public String getType() {
        return mType;
    }

    public String get_content() {
        return m_content;
    }

    public static class Builder {

        private String mType;
        private String m_content;

        public Url.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Url.Builder with_content(String _content) {
            m_content = _content;
            return this;
        }

        public Url build() {
            Url url = new Url();
            url.mType = mType;
            url.m_content = m_content;
            return url;
        }

    }

}
