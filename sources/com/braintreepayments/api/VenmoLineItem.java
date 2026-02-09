package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class VenmoLineItem implements Parcelable {
    public static final Parcelable.Creator<VenmoLineItem> CREATOR = new Parcelable.Creator<VenmoLineItem>() {
        public VenmoLineItem createFromParcel(Parcel parcel) {
            return new VenmoLineItem(parcel);
        }

        public VenmoLineItem[] newArray(int i) {
            return new VenmoLineItem[i];
        }
    };
    private static final String DESCRIPTION_KEY = "description";
    public static final String KIND_CREDIT = "CREDIT";
    public static final String KIND_DEBIT = "DEBIT";
    private static final String KIND_KEY = "type";
    private static final String NAME_KEY = "name";
    private static final String PRODUCT_CODE_KEY = "productCode";
    private static final String QUANTITY_KEY = "quantity";
    private static final String UNIT_AMOUNT_KEY = "unitAmount";
    private static final String UNIT_TAX_AMOUNT_KEY = "unitTaxAmount";
    private static final String URL_KEY = "url";
    private String description;
    private String kind;
    private String name;
    private String productCode;
    private Integer quantity;
    private String unitAmount;
    private String unitTaxAmount;
    private String url;

    public int describeContents() {
        return 0;
    }

    public VenmoLineItem(String str, String str2, Integer num, String str3) {
        this.kind = str;
        this.name = str2;
        this.quantity = num;
        this.unitAmount = str3;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setKind(String str) {
        this.kind = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public void setQuantity(Integer num) {
        this.quantity = num;
    }

    public void setUnitAmount(String str) {
        this.unitAmount = str;
    }

    public void setUnitTaxAmount(String str) {
        this.unitTaxAmount = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getDescription() {
        return this.description;
    }

    public String getKind() {
        return this.kind;
    }

    public String getName() {
        return this.name;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public String getUnitAmount() {
        return this.unitAmount;
    }

    public String getUnitTaxAmount() {
        return this.unitTaxAmount;
    }

    public String getUrl() {
        return this.url;
    }

    public JSONObject toJson() {
        try {
            return new JSONObject().putOpt("description", this.description).putOpt("type", this.kind).putOpt("name", this.name).putOpt(PRODUCT_CODE_KEY, this.productCode).putOpt("quantity", this.quantity).putOpt(UNIT_AMOUNT_KEY, this.unitAmount).putOpt(UNIT_TAX_AMOUNT_KEY, this.unitTaxAmount).putOpt("url", this.url);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    VenmoLineItem(Parcel parcel) {
        this.description = parcel.readString();
        this.kind = parcel.readString();
        this.name = parcel.readString();
        this.productCode = parcel.readString();
        this.quantity = Integer.valueOf(parcel.readInt());
        this.unitAmount = parcel.readString();
        this.unitTaxAmount = parcel.readString();
        this.url = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        parcel.writeString(this.kind);
        parcel.writeString(this.name);
        parcel.writeString(this.productCode);
        parcel.writeInt(this.quantity.intValue());
        parcel.writeString(this.unitAmount);
        parcel.writeString(this.unitTaxAmount);
        parcel.writeString(this.url);
    }
}
