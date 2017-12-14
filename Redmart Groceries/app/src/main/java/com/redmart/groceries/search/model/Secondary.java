
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Secondary implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("content")
    @Expose
    private String content;
    public final static Creator<Secondary> CREATOR = new Creator<Secondary>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Secondary createFromParcel(Parcel in) {
            return new Secondary(in);
        }

        public Secondary[] newArray(int size) {
            return (new Secondary[size]);
        }

    }
    ;

    protected Secondary(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.content = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Secondary() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(content);
    }

    public int describeContents() {
        return  0;
    }

}
