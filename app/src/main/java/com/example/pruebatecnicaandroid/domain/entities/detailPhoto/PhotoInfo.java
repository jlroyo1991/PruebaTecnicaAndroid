
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import com.google.gson.annotations.SerializedName;


public class PhotoInfo {

    @SerializedName("comments")
    private Comments mComments;
    @SerializedName("dates")
    private Dates mDates;
    @SerializedName("dateuploaded")
    private String mDateuploaded;
    @SerializedName("description")
    private Description mDescription;
    @SerializedName("editability")
    private Editability mEditability;
    @SerializedName("farm")
    private Long mFarm;
    @SerializedName("id")
    private String mId;
    @SerializedName("isfavorite")
    private Long mIsfavorite;
    @SerializedName("license")
    private String mLicense;
    @SerializedName("media")
    private String mMedia;
    @SerializedName("notes")
    private Notes mNotes;
    @SerializedName("owner")
    private Owner mOwner;
    @SerializedName("people")
    private People mPeople;
    @SerializedName("publiceditability")
    private Publiceditability mPubliceditability;
    @SerializedName("rotation")
    private Long mRotation;
    @SerializedName("safety_level")
    private String mSafetyLevel;
    @SerializedName("secret")
    private String mSecret;
    @SerializedName("server")
    private String mServer;
    @SerializedName("tags")
    private Tags mTags;
    @SerializedName("title")
    private Title mTitle;
    @SerializedName("urls")
    private Urls mUrls;
    @SerializedName("usage")
    private Usage mUsage;
    @SerializedName("views")
    private String mViews;
    @SerializedName("visibility")
    private Visibility mVisibility;

    public Comments getComments() {
        return mComments;
    }

    public Dates getDates() {
        return mDates;
    }

    public String getDateuploaded() {
        return mDateuploaded;
    }

    public Description getDescription() {
        return mDescription;
    }

    public Editability getEditability() {
        return mEditability;
    }

    public Long getFarm() {
        return mFarm;
    }

    public String getId() {
        return mId;
    }

    public Long getIsfavorite() {
        return mIsfavorite;
    }

    public String getLicense() {
        return mLicense;
    }

    public String getMedia() {
        return mMedia;
    }

    public Notes getNotes() {
        return mNotes;
    }

    public Owner getOwner() {
        return mOwner;
    }

    public People getPeople() {
        return mPeople;
    }

    public Publiceditability getPubliceditability() {
        return mPubliceditability;
    }

    public Long getRotation() {
        return mRotation;
    }

    public String getSafetyLevel() {
        return mSafetyLevel;
    }

    public String getSecret() {
        return mSecret;
    }

    public String getServer() {
        return mServer;
    }

    public Tags getTags() {
        return mTags;
    }

    public Title getTitle() {
        return mTitle;
    }

    public Urls getUrls() {
        return mUrls;
    }

    public Usage getUsage() {
        return mUsage;
    }

    public String getViews() {
        return mViews;
    }

    public Visibility getVisibility() {
        return mVisibility;
    }


}
