
package com.redmart.groceries.search.model;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DescriptionFields implements Parcelable {

    @SerializedName("secondary")
    @Expose
    private List<Secondary> secondary = null;
    @SerializedName("primary")
    @Expose
    private List<Primary> primary = null;

    public List<Secondary> getSecondary() {
        return secondary;
    }

    public void setSecondary(List<Secondary> secondary) {
        this.secondary = secondary;
    }

    public List<Primary> getPrimary() {
        return primary;
    }

    public void setPrimary(List<Primary> primary) {
        this.primary = primary;
    }


    protected DescriptionFields(Parcel in) {
        if (in.readByte() == 0x01) {
            secondary = new ArrayList<>();
            in.readList(secondary, Secondary.class.getClassLoader());
        } else {
            secondary = null;
        }
        if (in.readByte() == 0x01) {
            primary = new ArrayList<>();
            in.readList(primary, Primary.class.getClassLoader());
        } else {
            primary = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (secondary == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(secondary);
        }
        if (primary == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(primary);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<DescriptionFields> CREATOR = new Parcelable.Creator<DescriptionFields>() {
        @Override
        public DescriptionFields createFromParcel(Parcel in) {
            return new DescriptionFields(in);
        }

        @Override
        public DescriptionFields[] newArray(int size) {
            return new DescriptionFields[size];
        }
    };
}