
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LiveUp implements Parcelable
{

    @SerializedName("promo_price")
    @Expose
    private Double promoPrice;
    @SerializedName("savings")
    @Expose
    private Double savings;
    @SerializedName("savings_amount")
    @Expose
    private Double savingsAmount;
    @SerializedName("savings_type")
    @Expose
    private Integer savingsType;
    @SerializedName("savings_text")
    @Expose
    private String savingsText;
    public final static Creator<LiveUp> CREATOR = new Creator<LiveUp>() {


        @SuppressWarnings({
            "unchecked"
        })
        public LiveUp createFromParcel(Parcel in) {
            return new LiveUp(in);
        }

        public LiveUp[] newArray(int size) {
            return (new LiveUp[size]);
        }

    }
    ;

    protected LiveUp(Parcel in) {
        this.promoPrice = ((Double) in.readValue((Double.class.getClassLoader())));
        this.savings = ((Double) in.readValue((Double.class.getClassLoader())));
        this.savingsAmount = ((Double) in.readValue((Double.class.getClassLoader())));
        this.savingsType = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.savingsText = ((String) in.readValue((String.class.getClassLoader())));
    }

    public LiveUp() {
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Double getSavings() {
        return savings;
    }

    public void setSavings(Double savings) {
        this.savings = savings;
    }

    public Double getSavingsAmount() {
        return savingsAmount;
    }

    public void setSavingsAmount(Double savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    public Integer getSavingsType() {
        return savingsType;
    }

    public void setSavingsType(Integer savingsType) {
        this.savingsType = savingsType;
    }

    public String getSavingsText() {
        return savingsText;
    }

    public void setSavingsText(String savingsText) {
        this.savingsText = savingsText;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(promoPrice);
        dest.writeValue(savings);
        dest.writeValue(savingsAmount);
        dest.writeValue(savingsType);
        dest.writeValue(savingsText);
    }

    public int describeContents() {
        return  0;
    }

}
