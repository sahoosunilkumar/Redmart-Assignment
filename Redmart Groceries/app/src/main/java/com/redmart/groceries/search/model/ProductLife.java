
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductLife implements Parcelable
{

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("metric")
    @Expose
    private String metric;
    @SerializedName("is_minimum")
    @Expose
    private Boolean isMinimum;
    public final static Creator<ProductLife> CREATOR = new Creator<ProductLife>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ProductLife createFromParcel(Parcel in) {
            return new ProductLife(in);
        }

        public ProductLife[] newArray(int size) {
            return (new ProductLife[size]);
        }

    }
    ;

    protected ProductLife(Parcel in) {
        this.time = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.metric = ((String) in.readValue((String.class.getClassLoader())));
        this.isMinimum = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public ProductLife() {
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public Boolean getIsMinimum() {
        return isMinimum;
    }

    public void setIsMinimum(Boolean isMinimum) {
        this.isMinimum = isMinimum;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(time);
        dest.writeValue(metric);
        dest.writeValue(isMinimum);
    }

    public int describeContents() {
        return  0;
    }

}
