
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Measure_ implements Parcelable
{

    @SerializedName("vol_metric")
    @Expose
    private String volMetric;
    @SerializedName("wt")
    @Expose
    private Double wt;
    @SerializedName("wt_metric")
    @Expose
    private String wtMetric;
    @SerializedName("l")
    @Expose
    private Double l;
    @SerializedName("w")
    @Expose
    private Double w;
    @SerializedName("h")
    @Expose
    private Double h;
    @SerializedName("vol")
    @Expose
    private Double vol;
    public final static Creator<Measure_> CREATOR = new Creator<Measure_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Measure_ createFromParcel(Parcel in) {
            return new Measure_(in);
        }

        public Measure_[] newArray(int size) {
            return (new Measure_[size]);
        }

    }
    ;

    protected Measure_(Parcel in) {
        this.volMetric = ((String) in.readValue((String.class.getClassLoader())));
        this.wt = ((Double) in.readValue((Double.class.getClassLoader())));
        this.wtMetric = ((String) in.readValue((String.class.getClassLoader())));
        this.l = ((Double) in.readValue((Double.class.getClassLoader())));
        this.w = ((Double) in.readValue((Double.class.getClassLoader())));
        this.h = ((Double) in.readValue((Double.class.getClassLoader())));
        this.vol = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    public Measure_() {
    }

    public String getVolMetric() {
        return volMetric;
    }

    public void setVolMetric(String volMetric) {
        this.volMetric = volMetric;
    }

    public Double getWt() {
        return wt;
    }

    public void setWt(Double wt) {
        this.wt = wt;
    }

    public String getWtMetric() {
        return wtMetric;
    }

    public void setWtMetric(String wtMetric) {
        this.wtMetric = wtMetric;
    }

    public Double getL() {
        return l;
    }

    public void setL(Double l) {
        this.l = l;
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getVol() {
        return vol;
    }

    public void setVol(Double vol) {
        this.vol = vol;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(volMetric);
        dest.writeValue(wt);
        dest.writeValue(wtMetric);
        dest.writeValue(l);
        dest.writeValue(w);
        dest.writeValue(h);
        dest.writeValue(vol);
    }

    public int describeContents() {
        return  0;
    }

}
