
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Urls {

    @SerializedName("url")
    private List<Url> mUrl;

    public List<Url> getUrl() {
        return mUrl;
    }

    public static class Builder {

        private List<Url> mUrl;

        public Urls.Builder withUrl(List<Url> url) {
            mUrl = url;
            return this;
        }

        public Urls build() {
            Urls urls = new Urls();
            urls.mUrl = mUrl;
            return urls;
        }

    }

}
