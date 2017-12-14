
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Filters implements Parcelable
{

    @SerializedName("mfr_name")
    @Expose
    private String mfrName;
    @SerializedName("trending_frequency")
    @Expose
    private Integer trendingFrequency;
    @SerializedName("is_organic")
    @Expose
    private Integer isOrganic;
    @SerializedName("country_of_origin")
    @Expose
    private String countryOfOrigin;
    @SerializedName("vendor_name")
    @Expose
    private String vendorName;
    @SerializedName("brand_name")
    @Expose
    private String brandName;
    @SerializedName("brand_uri")
    @Expose
    private String brandUri;
    @SerializedName("frequency")
    @Expose
    private Integer frequency;
    @SerializedName("festive_bbq")
    @Expose
    private String festiveBbq;
    @SerializedName("potluck")
    @Expose
    private String potluck;
    @SerializedName("fsc")
    @Expose
    private Integer fsc;
    @SerializedName("holiday_party")
    @Expose
    private String holidayParty;
    @SerializedName("natural")
    @Expose
    private Integer natural;
    @SerializedName("vegan")
    @Expose
    private Integer vegan;
    @SerializedName("holiday_brunch")
    @Expose
    private String holidayBrunch;
    @SerializedName("made_in_singapore")
    @Expose
    private Integer madeInSingapore;
    @SerializedName("halal")
    @Expose
    private Integer halal;
    public final static Creator<Filters> CREATOR = new Creator<Filters>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Filters createFromParcel(Parcel in) {
            return new Filters(in);
        }

        public Filters[] newArray(int size) {
            return (new Filters[size]);
        }

    }
    ;

    protected Filters(Parcel in) {
        this.mfrName = ((String) in.readValue((String.class.getClassLoader())));
        this.trendingFrequency = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isOrganic = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.countryOfOrigin = ((String) in.readValue((String.class.getClassLoader())));
        this.vendorName = ((String) in.readValue((String.class.getClassLoader())));
        this.brandName = ((String) in.readValue((String.class.getClassLoader())));
        this.brandUri = ((String) in.readValue((String.class.getClassLoader())));
        this.frequency = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.festiveBbq = ((String) in.readValue((String.class.getClassLoader())));
        this.potluck = ((String) in.readValue((String.class.getClassLoader())));
        this.fsc = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.holidayParty = ((String) in.readValue((String.class.getClassLoader())));
        this.natural = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.vegan = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.holidayBrunch = ((String) in.readValue((String.class.getClassLoader())));
        this.madeInSingapore = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.halal = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Filters() {
    }

    public String getMfrName() {
        return mfrName;
    }

    public void setMfrName(String mfrName) {
        this.mfrName = mfrName;
    }

    public Integer getTrendingFrequency() {
        return trendingFrequency;
    }

    public void setTrendingFrequency(Integer trendingFrequency) {
        this.trendingFrequency = trendingFrequency;
    }

    public Integer getIsOrganic() {
        return isOrganic;
    }

    public void setIsOrganic(Integer isOrganic) {
        this.isOrganic = isOrganic;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandUri() {
        return brandUri;
    }

    public void setBrandUri(String brandUri) {
        this.brandUri = brandUri;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public String getFestiveBbq() {
        return festiveBbq;
    }

    public void setFestiveBbq(String festiveBbq) {
        this.festiveBbq = festiveBbq;
    }

    public String getPotluck() {
        return potluck;
    }

    public void setPotluck(String potluck) {
        this.potluck = potluck;
    }

    public Integer getFsc() {
        return fsc;
    }

    public void setFsc(Integer fsc) {
        this.fsc = fsc;
    }

    public String getHolidayParty() {
        return holidayParty;
    }

    public void setHolidayParty(String holidayParty) {
        this.holidayParty = holidayParty;
    }

    public Integer getNatural() {
        return natural;
    }

    public void setNatural(Integer natural) {
        this.natural = natural;
    }

    public Integer getVegan() {
        return vegan;
    }

    public void setVegan(Integer vegan) {
        this.vegan = vegan;
    }

    public String getHolidayBrunch() {
        return holidayBrunch;
    }

    public void setHolidayBrunch(String holidayBrunch) {
        this.holidayBrunch = holidayBrunch;
    }

    public Integer getMadeInSingapore() {
        return madeInSingapore;
    }

    public void setMadeInSingapore(Integer madeInSingapore) {
        this.madeInSingapore = madeInSingapore;
    }

    public Integer getHalal() {
        return halal;
    }

    public void setHalal(Integer halal) {
        this.halal = halal;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(mfrName);
        dest.writeValue(trendingFrequency);
        dest.writeValue(isOrganic);
        dest.writeValue(countryOfOrigin);
        dest.writeValue(vendorName);
        dest.writeValue(brandName);
        dest.writeValue(brandUri);
        dest.writeValue(frequency);
        dest.writeValue(festiveBbq);
        dest.writeValue(potluck);
        dest.writeValue(fsc);
        dest.writeValue(holidayParty);
        dest.writeValue(natural);
        dest.writeValue(vegan);
        dest.writeValue(holidayBrunch);
        dest.writeValue(madeInSingapore);
        dest.writeValue(halal);
    }

    public int describeContents() {
        return  0;
    }

}
