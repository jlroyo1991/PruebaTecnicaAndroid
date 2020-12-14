
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Notes {

    @SerializedName("note")
    private List<Object> mNote;

    public List<Object> getNote() {
        return mNote;
    }

    public void setNote(List<Object> note) {
        mNote = note;
    }

}
