
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pricing implements Parcelable
{

    @SerializedName("on_sale")
    @Expose
    private Integer onSale;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("promo_price")
    @Expose
    private Double promoPrice;
    @SerializedName("savings_type")
    @Expose
    private Integer savingsType;
    @SerializedName("savings")
    @Expose
    private Double savings;
    @SerializedName("promo_id")
    @Expose
    private Integer promoId;
    @SerializedName("savings_amount")
    @Expose
    private Double savingsAmount;
    @SerializedName("savings_text")
    @Expose
    private String savingsText;
    @SerializedName("discounts")
    @Expose
    private Discounts discounts;
    @SerializedName("applicable_discount")
    @Expose
    private String applicableDiscount;
    public final static Creator<Pricing> CREATOR = new Creator<Pricing>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Pricing createFromParcel(Parcel in) {
            return new Pricing(in);
        }

        public Pricing[] newArray(int size) {
            return (new Pricing[size]);
        }

    }
    ;

    protected Pricing(Parcel in) {
        this.onSale = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.price = ((Double) in.readValue((Double.class.getClassLoader())));
        this.promoPrice = ((Double) in.readValue((Double.class.getClassLoader())));
        this.savingsType = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.savings = ((Double) in.readValue((Double.class.getClassLoader())));
        this.promoId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.savingsAmount = ((Double) in.readValue((Double.class.getClassLoader())));
        this.savingsText = ((String) in.readValue((String.class.getClassLoader())));
        this.discounts = ((Discounts) in.readValue((Discounts.class.getClassLoader())));
        this.applicableDiscount = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Pricing() {
    }

    public Integer getOnSale() {
        return onSale;
    }

    public void setOnSale(Integer onSale) {
        this.onSale = onSale;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Integer getSavingsType() {
        return savingsType;
    }

    public void setSavingsType(Integer savingsType) {
        this.savingsType = savingsType;
    }

    public Double getSavings() {
        return savings;
    }

    public void setSavings(Double savings) {
        this.savings = savings;
    }

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    public Double getSavingsAmount() {
        return savingsAmount;
    }

    public void setSavingsAmount(Double savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    public String getSavingsText() {
        return savingsText;
    }

    public void setSavingsText(String savingsText) {
        this.savingsText = savingsText;
    }

    public Discounts getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Discounts discounts) {
        this.discounts = discounts;
    }

    public String getApplicableDiscount() {
        return applicableDiscount;
    }

    public void setApplicableDiscount(String applicableDiscount) {
        this.applicableDiscount = applicableDiscount;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(onSale);
        dest.writeValue(price);
        dest.writeValue(promoPrice);
        dest.writeValue(savingsType);
        dest.writeValue(savings);
        dest.writeValue(promoId);
        dest.writeValue(savingsAmount);
        dest.writeValue(savingsText);
        dest.writeValue(discounts);
        dest.writeValue(applicableDiscount);
    }

    public int describeContents() {
        return  0;
    }

}
