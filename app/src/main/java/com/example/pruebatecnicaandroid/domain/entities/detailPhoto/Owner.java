
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
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

    public String getIconserver() {
        return mIconserver;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getNsid() {
        return mNsid;
    }

    public Object getPathAlias() {
        return mPathAlias;
    }

    public String getRealname() {
        return mRealname;
    }

    public String getUsername() {
        return mUsername;
    }

    public static class Builder {

        private Long mIconfarm;
        private String mIconserver;
        private String mLocation;
        private String mNsid;
        private Object mPathAlias;
        private String mRealname;
        private String mUsername;

        public Owner.Builder withIconfarm(Long iconfarm) {
            mIconfarm = iconfarm;
            return this;
        }

        public Owner.Builder withIconserver(String iconserver) {
            mIconserver = iconserver;
            return this;
        }

        public Owner.Builder withLocation(String location) {
            mLocation = location;
            return this;
        }

        public Owner.Builder withNsid(String nsid) {
            mNsid = nsid;
            return this;
        }

        public Owner.Builder withPathAlias(Object pathAlias) {
            mPathAlias = pathAlias;
            return this;
        }

        public Owner.Builder withRealname(String realname) {
            mRealname = realname;
            return this;
        }

        public Owner.Builder withUsername(String username) {
            mUsername = username;
            return this;
        }

        public Owner build() {
            Owner owner = new Owner();
            owner.mIconfarm = mIconfarm;
            owner.mIconserver = mIconserver;
            owner.mLocation = mLocation;
            owner.mNsid = mNsid;
            owner.mPathAlias = mPathAlias;
            owner.mRealname = mRealname;
            owner.mUsername = mUsername;
            return owner;
        }

    }

}
