
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


public class Tag {

    @SerializedName("author")
    private String mAuthor;
    @SerializedName("authorname")
    private String mAuthorname;
    @SerializedName("id")
    private String mId;
    @SerializedName("machine_tag")
    private int mMachineTag;
    @SerializedName("raw")
    private String mRaw;
    @SerializedName("_content")
    private String m_content;

    public String getAuthor() {
        return mAuthor;
    }

    public String getAuthorname() {
        return mAuthorname;
    }

    public String getId() {
        return mId;
    }

    public int getMachineTag() {
        return mMachineTag;
    }

    public String getRaw() {
        return mRaw;
    }

    public String get_content() {
        return m_content;
    }



}
