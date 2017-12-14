
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Toggle implements Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("uri")
    @Expose
    private String uri;
    public final static Creator<Toggle> CREATOR = new Creator<Toggle>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Toggle createFromParcel(Parcel in) {
            return new Toggle(in);
        }

        public Toggle[] newArray(int size) {
            return (new Toggle[size]);
        }

    }
    ;

    protected Toggle(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.uri = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Toggle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(uri);
    }

    public int describeContents() {
        return  0;
    }

}
