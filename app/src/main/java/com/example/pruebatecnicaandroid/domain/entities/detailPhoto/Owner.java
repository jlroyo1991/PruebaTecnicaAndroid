
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import com.google.gson.annotations.SerializedName;


public class Owner {

    @SerializedName("iconfarm")
    private Long mIconfarm;
    @SerializedName("iconserver")
    private String mIconserver;
    @SerializedName("location")
    private String mLocation;
    @SerializedName("nsid")
    private String mNsid;
    @SerializedName("path_alias")
    private Object mPathAlias;
    @SerializedName("realname")
    private String mRealname;
    @SerializedName("username")
    private String mUsername;

    public Long getIconfarm() {
        return mIconfarm;
    }

    public void setIconfarm(Long iconfarm) {
        mIconfarm = iconfarm;
    }

    public String getIconserver() {
        return mIconserver;
    }

    public void setIconserver(String iconserver) {
        mIconserver = iconserver;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getNsid() {
        return mNsid;
    }

    public void setNsid(String nsid) {
        mNsid = nsid;
    }

    public Object getPathAlias() {
        return mPathAlias;
    }

    public void setPathAlias(Object pathAlias) {
        mPathAlias = pathAlias;
    }

    public String getRealname() {
        return mRealname;
    }

    public void setRealname(String realname) {
        mRealname = realname;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

}
