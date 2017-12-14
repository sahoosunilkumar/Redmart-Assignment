
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Measure implements Parcelable
{

    @SerializedName("wt_or_vol")
    @Expose
    private String wtOrVol;
    @SerializedName("size")
    @Expose
    private Double size;
    public final static Creator<Measure> CREATOR = new Creator<Measure>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Measure createFromParcel(Parcel in) {
            return new Measure(in);
        }

        public Measure[] newArray(int size) {
            return (new Measure[size]);
        }

    }
    ;

    protected Measure(Parcel in) {
        this.wtOrVol = ((String) in.readValue((String.class.getClassLoader())));
        this.size = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    public Measure() {
    }

    public String getWtOrVol() {
        return wtOrVol;
    }

    public void setWtOrVol(String wtOrVol) {
        this.wtOrVol = wtOrVol;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(wtOrVol);
        dest.writeValue(size);
    }

    public int describeContents() {
        return  0;
    }

}
