
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Img implements Parcelable
{

    @SerializedName("h")
    @Expose
    private Integer h;
    @SerializedName("w")
    @Expose
    private Integer w;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("position")
    @Expose
    private Integer position;
    public final static Creator<Img> CREATOR = new Creator<Img>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Img createFromParcel(Parcel in) {
            return new Img(in);
        }

        public Img[] newArray(int size) {
            return (new Img[size]);
        }

    }
    ;

    protected Img(Parcel in) {
        this.h = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.w = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.position = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Img() {
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(h);
        dest.writeValue(w);
        dest.writeValue(name);
        dest.writeValue(position);
    }

    public int describeContents() {
        return  0;
    }

}
