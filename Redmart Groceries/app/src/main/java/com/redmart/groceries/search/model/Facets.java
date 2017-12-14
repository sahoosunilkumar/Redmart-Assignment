
package com.redmart.groceries.search.model;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facets implements Parcelable {

    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


    protected Facets(Parcel in) {
        if (in.readByte() == 0x01) {
            categories = new ArrayList<>();
            in.readList(categories, Category.class.getClassLoader());
        } else {
            categories = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (categories == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(categories);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Facets> CREATOR = new Parcelable.Creator<Facets>() {
        @Override
        public Facets createFromParcel(Parcel in) {
            return new Facets(in);
        }

        @Override
        public Facets[] newArray(int size) {
            return new Facets[size];
        }
    };
}