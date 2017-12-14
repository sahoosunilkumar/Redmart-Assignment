
package com.redmart.groceries.search.model;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Filters_ implements Parcelable {

    @SerializedName("options")
    @Expose
    private List<Option> options = null;
    @SerializedName("toggles")
    @Expose
    private List<Toggle> toggles = null;

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public List<Toggle> getToggles() {
        return toggles;
    }

    public void setToggles(List<Toggle> toggles) {
        this.toggles = toggles;
    }


    protected Filters_(Parcel in) {
        if (in.readByte() == 0x01) {
            options = new ArrayList<>();
            in.readList(options, Option.class.getClassLoader());
        } else {
            options = null;
        }
        if (in.readByte() == 0x01) {
            toggles = new ArrayList<Toggle>();
            in.readList(toggles, Toggle.class.getClassLoader());
        } else {
            toggles = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (options == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(options);
        }
        if (toggles == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(toggles);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Filters_> CREATOR = new Parcelable.Creator<Filters_>() {
        @Override
        public Filters_ createFromParcel(Parcel in) {
            return new Filters_(in);
        }

        @Override
        public Filters_[] newArray(int size) {
            return new Filters_[size];
        }
    };
}
