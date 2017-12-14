
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Promotion implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("savings_text")
    @Expose
    private String savingsText;
    @SerializedName("promo_label")
    @Expose
    private String promoLabel;
    @SerializedName("current_product_group_id")
    @Expose
    private Integer currentProductGroupId;
    @SerializedName("live_up_savings_text")
    @Expose
    private String liveUpSavingsText;
    public final static Creator<Promotion> CREATOR = new Creator<Promotion>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Promotion createFromParcel(Parcel in) {
            return new Promotion(in);
        }

        public Promotion[] newArray(int size) {
            return (new Promotion[size]);
        }

    }
    ;

    protected Promotion(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.type = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.savingsText = ((String) in.readValue((String.class.getClassLoader())));
        this.promoLabel = ((String) in.readValue((String.class.getClassLoader())));
        this.currentProductGroupId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.liveUpSavingsText = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Promotion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSavingsText() {
        return savingsText;
    }

    public void setSavingsText(String savingsText) {
        this.savingsText = savingsText;
    }

    public String getPromoLabel() {
        return promoLabel;
    }

    public void setPromoLabel(String promoLabel) {
        this.promoLabel = promoLabel;
    }

    public Integer getCurrentProductGroupId() {
        return currentProductGroupId;
    }

    public void setCurrentProductGroupId(Integer currentProductGroupId) {
        this.currentProductGroupId = currentProductGroupId;
    }

    public String getLiveUpSavingsText() {
        return liveUpSavingsText;
    }

    public void setLiveUpSavingsText(String liveUpSavingsText) {
        this.liveUpSavingsText = liveUpSavingsText;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(type);
        dest.writeValue(savingsText);
        dest.writeValue(promoLabel);
        dest.writeValue(currentProductGroupId);
        dest.writeValue(liveUpSavingsText);
    }

    public int describeContents() {
        return  0;
    }

    @Override
    public String toString() {
        return this.promoLabel;
    }
}
