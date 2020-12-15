
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Comments {

    @SerializedName("_content")
    private String m_content;

    public String get_content() {
        return m_content;
    }

    public static class Builder {

        private String m_content;

        public Comments.Builder with_content(String _content) {
            m_content = _content;
            return this;
        }

        public Comments build() {
            Comments comments = new Comments();
            comments.m_content = m_content;
            return comments;
        }

    }

}
