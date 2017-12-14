
package com.redmart.groceries.search.model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes implements Parcelable
{

    @SerializedName("dag")
    @Expose
    private List<Object> dag = null;
    public final static Creator<Attributes> CREATOR = new Creator<Attributes>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Attributes createFromParcel(Parcel in) {
            return new Attributes(in);
        }

        public Attributes[] newArray(int size) {
            return (new Attributes[size]);
        }

    }
    ;

    protected Attributes(Parcel in) {
        in.readList(this.dag, (Object.class.getClassLoader()));
    }

    public Attributes() {
    }

    public List<Object> getDag() {
        return dag;
    }

    public void setDag(List<Object> dag) {
        this.dag = dag;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(dag);
    }

    public int describeContents() {
        return  0;
    }

}
