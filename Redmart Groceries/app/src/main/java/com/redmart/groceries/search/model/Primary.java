
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Primary implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("content")
    @Expose
    private String content;
    public final static Creator<Primary> CREATOR = new Creator<Primary>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Primary createFromParcel(Parcel in) {
            return new Primary(in);
        }

        public Primary[] newArray(int size) {
            return (new Primary[size]);
        }

    }
    ;

    protected Primary(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.content = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Primary() {
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
