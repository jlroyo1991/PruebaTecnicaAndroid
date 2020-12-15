
package com.example.pruebatecnicaandroid.domain.entities.detailPhoto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Notes {

    @SerializedName("note")
    private List<Object> mNote;

    public List<Object> getNote() {
        return mNote;
    }

    public static class Builder {

        private List<Object> mNote;

        public Notes.Builder withNote(List<Object> note) {
            mNote = note;
            return this;
        }

        public Notes build() {
            Notes notes = new Notes();
            notes.mNote = mNote;
            return notes;
        }

    }

}
