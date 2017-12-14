package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FetchItemsResponse implements Parcelable {

    @SerializedName("products")
    @Expose
    private List<Product> products = null;
    @SerializedName("facets")
    @Expose
    private Facets facets;
    @SerializedName("filters")
    @Expose
    private Filters_ filters;
    @SerializedName("on_sale_count")
    @Expose
    private Integer onSaleCount;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("page_size")
    @Expose
    private Integer pageSize;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    public Filters_ getFilters() {
        return filters;
    }

    public void setFilters(Filters_ filters) {
        this.filters = filters;
    }

    public Integer getOnSaleCount() {
        return onSaleCount;
    }

    public void setOnSaleCount(Integer onSaleCount) {
        this.onSaleCount = onSaleCount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    protected FetchItemsResponse(Parcel in) {
        if (in.readByte() == 0x01) {
            products = new ArrayList<>();
            in.readList(products, Product.class.getClassLoader());
        } else {
            products = null;
        }
        facets = (Facets) in.readValue(Facets.class.getClassLoader());
        filters = (Filters_) in.readValue(Filters_.class.getClassLoader());
        onSaleCount = in.readByte() == 0x00 ? null : in.readInt();
        status = (Status) in.readValue(Status.class.getClassLoader());
        total = in.readByte() == 0x00 ? null : in.readInt();
        page = in.readByte() == 0x00 ? null : in.readInt();
        pageSize = in.readByte() == 0x00 ? null : in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (products == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(products);
        }
        dest.writeValue(facets);
        dest.writeValue(filters);
        if (onSaleCount == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(onSaleCount);
        }
        dest.writeValue(status);
        if (total == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(total);
        }
        if (page == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(page);
        }
        if (pageSize == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(pageSize);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<FetchItemsResponse> CREATOR = new Parcelable.Creator<FetchItemsResponse>() {
        @Override
        public FetchItemsResponse createFromParcel(Parcel in) {
            return new FetchItemsResponse(in);
        }

        @Override
        public FetchItemsResponse[] newArray(int size) {
            return new FetchItemsResponse[size];
        }
    };
}