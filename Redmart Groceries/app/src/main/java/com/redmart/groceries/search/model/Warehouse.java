
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Warehouse implements Parcelable
{

    @SerializedName("measure")
    @Expose
    private Measure_ measure;
    public final static Creator<Warehouse> CREATOR = new Creator<Warehouse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Warehouse createFromParcel(Parcel in) {
            return new Warehouse(in);
        }

        public Warehouse[] newArray(int size) {
            return (new Warehouse[size]);
        }

    }
    ;

    protected Warehouse(Parcel in) {
        this.measure = ((Measure_) in.readValue((Measure_.class.getClassLoader())));
    }

    public Warehouse() {
    }

    public Measure_ getMeasure() {
        return measure;
    }

    public void setMeasure(Measure_ measure) {
        this.measure = measure;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(measure);
    }

    public int describeContents() {
        return  0;
    }

}
