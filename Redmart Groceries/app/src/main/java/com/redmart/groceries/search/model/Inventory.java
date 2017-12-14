
package com.redmart.groceries.search.model;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Inventory implements Parcelable {

    @SerializedName("atp_status")
    @Expose
    private Integer atpStatus;
    @SerializedName("max_sale_qty")
    @Expose
    private Integer maxSaleQty;
    @SerializedName("qty_in_carts")
    @Expose
    private Integer qtyInCarts;
    @SerializedName("qty_in_stock")
    @Expose
    private Integer qtyInStock;
    @SerializedName("stock_status")
    @Expose
    private Integer stockStatus;
    @SerializedName("stock_type")
    @Expose
    private Integer stockType;
    @SerializedName("atp_lots")
    @Expose
    private List<AtpLot> atpLots = null;
    @SerializedName("next_available_date")
    @Expose
    private String nextAvailableDate;
    @SerializedName("limited_stock_status")
    @Expose
    private Integer limitedStockStatus;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("original_max_sale_qty")
    @Expose
    private Integer originalMaxSaleQty;

    public Integer getAtpStatus() {
        return atpStatus;
    }

    public void setAtpStatus(Integer atpStatus) {
        this.atpStatus = atpStatus;
    }

    public Integer getMaxSaleQty() {
        return maxSaleQty;
    }

    public void setMaxSaleQty(Integer maxSaleQty) {
        this.maxSaleQty = maxSaleQty;
    }

    public Integer getQtyInCarts() {
        return qtyInCarts;
    }

    public void setQtyInCarts(Integer qtyInCarts) {
        this.qtyInCarts = qtyInCarts;
    }

    public Integer getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(Integer qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public Integer getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(Integer stockStatus) {
        this.stockStatus = stockStatus;
    }

    public Integer getStockType() {
        return stockType;
    }

    public void setStockType(Integer stockType) {
        this.stockType = stockType;
    }

    public List<AtpLot> getAtpLots() {
        return atpLots;
    }

    public void setAtpLots(List<AtpLot> atpLots) {
        this.atpLots = atpLots;
    }

    public String getNextAvailableDate() {
        return nextAvailableDate;
    }

    public void setNextAvailableDate(String nextAvailableDate) {
        this.nextAvailableDate = nextAvailableDate;
    }

    public Integer getLimitedStockStatus() {
        return limitedStockStatus;
    }

    public void setLimitedStockStatus(Integer limitedStockStatus) {
        this.limitedStockStatus = limitedStockStatus;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Integer getOriginalMaxSaleQty() {
        return originalMaxSaleQty;
    }

    public void setOriginalMaxSaleQty(Integer originalMaxSaleQty) {
        this.originalMaxSaleQty = originalMaxSaleQty;
    }


    protected Inventory(Parcel in) {
        atpStatus = in.readByte() == 0x00 ? null : in.readInt();
        maxSaleQty = in.readByte() == 0x00 ? null : in.readInt();
        qtyInCarts = in.readByte() == 0x00 ? null : in.readInt();
        qtyInStock = in.readByte() == 0x00 ? null : in.readInt();
        stockStatus = in.readByte() == 0x00 ? null : in.readInt();
        stockType = in.readByte() == 0x00 ? null : in.readInt();
        if (in.readByte() == 0x01) {
            atpLots = new ArrayList<>();
            in.readList(atpLots, AtpLot.class.getClassLoader());
        } else {
            atpLots = null;
        }
        nextAvailableDate = in.readString();
        limitedStockStatus = in.readByte() == 0x00 ? null : in.readInt();
        v = in.readByte() == 0x00 ? null : in.readInt();
        originalMaxSaleQty = in.readByte() == 0x00 ? null : in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (atpStatus == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(atpStatus);
        }
        if (maxSaleQty == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(maxSaleQty);
        }
        if (qtyInCarts == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(qtyInCarts);
        }
        if (qtyInStock == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(qtyInStock);
        }
        if (stockStatus == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(stockStatus);
        }
        if (stockType == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(stockType);
        }
        if (atpLots == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(atpLots);
        }
        dest.writeString(nextAvailableDate);
        if (limitedStockStatus == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(limitedStockStatus);
        }
        if (v == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(v);
        }
        if (originalMaxSaleQty == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(originalMaxSaleQty);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Inventory> CREATOR = new Parcelable.Creator<Inventory>() {
        @Override
        public Inventory createFromParcel(Parcel in) {
            return new Inventory(in);
        }

        @Override
        public Inventory[] newArray(int size) {
            return new Inventory[size];
        }
    };
}
