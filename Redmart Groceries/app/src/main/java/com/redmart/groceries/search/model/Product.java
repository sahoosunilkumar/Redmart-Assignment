
package com.redmart.groceries.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.DiffCallback;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product implements Parcelable {

    @SerializedName("category_tags")
    @Expose
    private List<String> categoryTags = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("categories")
    @Expose
    private List<Integer> categories = null;
    @SerializedName("types")
    @Expose
    private List<Integer> types = null;
    @SerializedName("details")
    @Expose
    private Details details;
    @SerializedName("product_life")
    @Expose
    private ProductLife productLife;
    @SerializedName("filters")
    @Expose
    private Filters filters;
    @SerializedName("img")
    @Expose
    private Img img;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("measure")
    @Expose
    private Measure measure;
    @SerializedName("pricing")
    @Expose
    private Pricing pricing;
    @SerializedName("warehouse")
    @Expose
    private Warehouse warehouse;
    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("description_fields")
    @Expose
    private DescriptionFields descriptionFields;
    @SerializedName("max_days_on_shelf")
    @Expose
    private Integer maxDaysOnShelf;
    @SerializedName("inventory")
    @Expose
    private Inventory inventory;
    @SerializedName("pr")
    @Expose
    private Integer pr;
    @SerializedName("promotions")
    @Expose
    private List<Promotion> promotions = null;


    public static DiffCallback<Product> DIFF_CALLBACK = new DiffCallback<Product>() {
        @Override
        public boolean areItemsTheSame(@NonNull Product oldItem, @NonNull Product newItem) {
            return oldItem.id == newItem.id;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Product oldItem, @NonNull Product newItem) {
            return oldItem.equals(newItem);
        }
    };
    public List<String> getCategoryTags() {
        return categoryTags;
    }

    public void setCategoryTags(List<String> categoryTags) {
        this.categoryTags = categoryTags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<Integer> getTypes() {
        return types;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public ProductLife getProductLife() {
        return productLife;
    }

    public void setProductLife(ProductLife productLife) {
        this.productLife = productLife;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public Img getImg() {
        return img;
    }

    public void setImg(Img img) {
        this.img = img;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public DescriptionFields getDescriptionFields() {
        return descriptionFields;
    }

    public void setDescriptionFields(DescriptionFields descriptionFields) {
        this.descriptionFields = descriptionFields;
    }

    public Integer getMaxDaysOnShelf() {
        return maxDaysOnShelf;
    }

    public void setMaxDaysOnShelf(Integer maxDaysOnShelf) {
        this.maxDaysOnShelf = maxDaysOnShelf;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Integer getPr() {
        return pr;
    }

    public void setPr(Integer pr) {
        this.pr = pr;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }


    protected Product(Parcel in) {
        if (in.readByte() == 0x01) {
            categoryTags = new ArrayList<String>();
            in.readList(categoryTags, String.class.getClassLoader());
        } else {
            categoryTags = null;
        }
        id = in.readByte() == 0x00 ? null : in.readInt();
        title = in.readString();
        desc = in.readString();
        sku = in.readString();
        if (in.readByte() == 0x01) {
            categories = new ArrayList<Integer>();
            in.readList(categories, Integer.class.getClassLoader());
        } else {
            categories = null;
        }
        if (in.readByte() == 0x01) {
            types = new ArrayList<Integer>();
            in.readList(types, Integer.class.getClassLoader());
        } else {
            types = null;
        }
        details = (Details) in.readValue(Details.class.getClassLoader());
        productLife = (ProductLife) in.readValue(ProductLife.class.getClassLoader());
        filters = (Filters) in.readValue(Filters.class.getClassLoader());
        img = (Img) in.readValue(Img.class.getClassLoader());
        if (in.readByte() == 0x01) {
            images = new ArrayList<Image>();
            in.readList(images, Image.class.getClassLoader());
        } else {
            images = null;
        }
        measure = (Measure) in.readValue(Measure.class.getClassLoader());
        pricing = (Pricing) in.readValue(Pricing.class.getClassLoader());
        warehouse = (Warehouse) in.readValue(Warehouse.class.getClassLoader());
        attributes = (Attributes) in.readValue(Attributes.class.getClassLoader());
        descriptionFields = (DescriptionFields) in.readValue(DescriptionFields.class.getClassLoader());
        maxDaysOnShelf = in.readByte() == 0x00 ? null : in.readInt();
        inventory = (Inventory) in.readValue(Inventory.class.getClassLoader());
        pr = in.readByte() == 0x00 ? null : in.readInt();
        if (in.readByte() == 0x01) {
            promotions = new ArrayList<Promotion>();
            in.readList(promotions, Promotion.class.getClassLoader());
        } else {
            promotions = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (categoryTags == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(categoryTags);
        }
        if (id == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(id);
        }
        dest.writeString(title);
        dest.writeString(desc);
        dest.writeString(sku);
        if (categories == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(categories);
        }
        if (types == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(types);
        }
        dest.writeValue(details);
        dest.writeValue(productLife);
        dest.writeValue(filters);
        dest.writeValue(img);
        if (images == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(images);
        }
        dest.writeValue(measure);
        dest.writeValue(pricing);
        dest.writeValue(warehouse);
        dest.writeValue(attributes);
        dest.writeValue(descriptionFields);
        if (maxDaysOnShelf == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(maxDaysOnShelf);
        }
        dest.writeValue(inventory);
        if (pr == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(pr);
        }
        if (promotions == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(promotions);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Product> CREATOR = new Parcelable.Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };
}