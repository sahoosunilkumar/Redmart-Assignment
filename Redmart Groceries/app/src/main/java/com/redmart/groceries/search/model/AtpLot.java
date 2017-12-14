
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AtpLot implements Parcelable
{

    @SerializedName("from_date")
    @Expose
    private String fromDate;
    @SerializedName("to_date")
    @Expose
    private String toDate;
    @SerializedName("stock_status")
    @Expose
    private Integer stockStatus;
    @SerializedName("qty_in_stock")
    @Expose
    private Integer qtyInStock;
    @SerializedName("qty_in_carts")
    @Expose
    private Integer qtyInCarts;
    public final static Creator<AtpLot> CREATOR = new Creator<AtpLot>() {


        @SuppressWarnings({
            "unchecked"
        })
        public AtpLot createFromParcel(Parcel in) {
            return new AtpLot(in);
        }

        public AtpLot[] newArray(int size) {
            return (new AtpLot[size]);
        }

    }
    ;

    protected AtpLot(Parcel in) {
        this.fromDate = ((String) in.readValue((String.class.getClassLoader())));
        this.toDate = ((String) in.readValue((String.class.getClassLoader())));
        this.stockStatus = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.qtyInStock = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.qtyInCarts = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public AtpLot() {
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Integer getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(Integer stockStatus) {
        this.stockStatus = stockStatus;
    }

    public Integer getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(Integer qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public Integer getQtyInCarts() {
        return qtyInCarts;
    }

    public void setQtyInCarts(Integer qtyInCarts) {
        this.qtyInCarts = qtyInCarts;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(fromDate);
        dest.writeValue(toDate);
        dest.writeValue(stockStatus);
        dest.writeValue(qtyInStock);
        dest.writeValue(qtyInCarts);
    }

    public int describeContents() {
        return  0;
    }

}
