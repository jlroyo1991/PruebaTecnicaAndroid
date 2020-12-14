
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import com.google.gson.annotations.SerializedName;


public class Tag {

    @SerializedName("author")
    private String mAuthor;
    @SerializedName("authorname")
    private String mAuthorname;
    @SerializedName("id")
    private String mId;
    @SerializedName("machine_tag")
    private Boolean mMachineTag;
    @SerializedName("raw")
    private String mRaw;
    @SerializedName("_content")
    private String m_content;

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public String getAuthorname() {
        return mAuthorname;
    }

    public void setAuthorname(String authorname) {
        mAuthorname = authorname;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Boolean getMachineTag() {
        return mMachineTag;
    }

    public void setMachineTag(Boolean machineTag) {
        mMachineTag = machineTag;
    }

    public String getRaw() {
        return mRaw;
    }

    public void setRaw(String raw) {
        mRaw = raw;
    }

    public String get_content() {
        return m_content;
    }

    public void set_content(String _content) {
        m_content = _content;
    }

}
