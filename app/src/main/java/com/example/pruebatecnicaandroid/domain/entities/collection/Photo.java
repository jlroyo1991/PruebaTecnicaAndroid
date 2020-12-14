
package com.example.pruebatecnicaandroid.domain.entities.collection;

import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("farm")
    private Long mFarm;
    @SerializedName("id")
    private String mId;
    @SerializedName("isfamily")
    private Long mIsfamily;
    @SerializedName("isfriend")
    private Long mIsfriend;
    @SerializedName("ispublic")
    private Long mIspublic;
    @SerializedName("owner")
    private String mOwner;
    @SerializedName("secret")
    private String mSecret;
    @SerializedName("server")
    private String mServer;
    @SerializedName("title")
    private String mTitle;

    public Long getFarm() {
        return mFarm;
    }

    public void setFarm(Long farm) {
        mFarm = farm;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

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

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public String getSecret() {
        return mSecret;
    }

    public void setSecret(String secret) {
        mSecret = secret;
    }

    public String getServer() {
        return mServer;
    }

    public void setServer(String server) {
        mServer = server;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
