
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Details implements Parcelable
{

    @SerializedName("prod_type")
    @Expose
    private Integer prodType;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("is_new")
    @Expose
    private Double isNew;
    @SerializedName("storage_class")
    @Expose
    private String storageClass;
    @SerializedName("country_of_origin")
    @Expose
    private String countryOfOrigin;
    public final static Creator<Details> CREATOR = new Creator<Details>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Details createFromParcel(Parcel in) {
            return new Details(in);
        }

        public Details[] newArray(int size) {
            return (new Details[size]);
        }

    }
    ;

    protected Details(Parcel in) {
        this.prodType = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.uri = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isNew = ((Double) in.readValue((Double.class.getClassLoader())));
        this.storageClass = ((String) in.readValue((String.class.getClassLoader())));
        this.countryOfOrigin = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Details() {
    }

    public Integer getProdType() {
        return prodType;
    }

    public void setProdType(Integer prodType) {
        this.prodType = prodType;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getIsNew() {
        return isNew;
    }

    public void setIsNew(Double isNew) {
        this.isNew = isNew;
    }

    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(prodType);
        dest.writeValue(uri);
        dest.writeValue(status);
        dest.writeValue(isNew);
        dest.writeValue(storageClass);
        dest.writeValue(countryOfOrigin);
    }

    public int describeContents() {
        return  0;
    }

}
