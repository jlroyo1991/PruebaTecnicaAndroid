
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class People {

    @SerializedName("haspeople")
    private Long mHaspeople;

    public Long getHaspeople() {
        return mHaspeople;
    }

    public static class Builder {

        private Long mHaspeople;

        public People.Builder withHaspeople(Long haspeople) {
            mHaspeople = haspeople;
            return this;
        }

        public People build() {
            People people = new People();
            people.mHaspeople = mHaspeople;
            return people;
        }

    }

}
