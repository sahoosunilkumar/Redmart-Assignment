
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Discounts implements Parcelable
{

    @SerializedName("promo")
    @Expose
    private Promo promo;
    @SerializedName("live_up")
    @Expose
    private LiveUp liveUp;
    public final static Creator<Discounts> CREATOR = new Creator<Discounts>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Discounts createFromParcel(Parcel in) {
            return new Discounts(in);
        }

        public Discounts[] newArray(int size) {
            return (new Discounts[size]);
        }

    }
    ;

    protected Discounts(Parcel in) {
        this.promo = ((Promo) in.readValue((Promo.class.getClassLoader())));
        this.liveUp = ((LiveUp) in.readValue((LiveUp.class.getClassLoader())));
    }

    public Discounts() {
    }

    public Promo getPromo() {
        return promo;
    }

    public void setPromo(Promo promo) {
        this.promo = promo;
    }

    public LiveUp getLiveUp() {
        return liveUp;
    }

    public void setLiveUp(LiveUp liveUp) {
        this.liveUp = liveUp;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(promo);
        dest.writeValue(liveUp);
    }

    public int describeContents() {
        return  0;
    }

}
