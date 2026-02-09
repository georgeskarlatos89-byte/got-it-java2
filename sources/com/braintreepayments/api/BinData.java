package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

public class BinData implements Parcelable {
    public static final String BIN_DATA_KEY = "binData";
    private static final String COMMERCIAL_KEY = "commercial";
    private static final String COUNTRY_OF_ISSUANCE_KEY = "countryOfIssuance";
    public static final Parcelable.Creator<BinData> CREATOR = new Parcelable.Creator<BinData>() {
        public BinData createFromParcel(Parcel parcel) {
            return new BinData(parcel);
        }

        public BinData[] newArray(int i) {
            return new BinData[i];
        }
    };
    private static final String DEBIT_KEY = "debit";
    private static final String DURBIN_REGULATED_KEY = "durbinRegulated";
    private static final String HEALTHCARE_KEY = "healthcare";
    private static final String ISSUING_BANK_KEY = "issuingBank";
    public static final String NO = "No";
    private static final String PAYROLL_KEY = "payroll";
    private static final String PREPAID_KEY = "prepaid";
    private static final String PRODUCT_ID_KEY = "productId";
    public static final String UNKNOWN = "Unknown";
    public static final String YES = "Yes";
    private String commercial;
    private String countryOfIssuance;
    private String debit;
    private String durbinRegulated;
    private String healthcare;
    private String issuingBank;
    private String payroll;
    private String prepaid;
    private String productId;

    public int describeContents() {
        return 0;
    }

    protected static BinData fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        BinData binData = new BinData();
        binData.prepaid = Json.optString(jSONObject, PREPAID_KEY, "Unknown");
        binData.healthcare = Json.optString(jSONObject, HEALTHCARE_KEY, "Unknown");
        binData.debit = Json.optString(jSONObject, "debit", "Unknown");
        binData.durbinRegulated = Json.optString(jSONObject, DURBIN_REGULATED_KEY, "Unknown");
        binData.commercial = Json.optString(jSONObject, COMMERCIAL_KEY, "Unknown");
        binData.payroll = Json.optString(jSONObject, PAYROLL_KEY, "Unknown");
        binData.issuingBank = convertNullToUnknown(jSONObject, ISSUING_BANK_KEY);
        binData.countryOfIssuance = convertNullToUnknown(jSONObject, COUNTRY_OF_ISSUANCE_KEY);
        binData.productId = convertNullToUnknown(jSONObject, "productId");
        return binData;
    }

    private static String convertNullToUnknown(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || !jSONObject.isNull(str)) {
            return Json.optString(jSONObject, str, "");
        }
        return "Unknown";
    }

    public String getPrepaid() {
        return this.prepaid;
    }

    public String getHealthcare() {
        return this.healthcare;
    }

    public String getDebit() {
        return this.debit;
    }

    public String getDurbinRegulated() {
        return this.durbinRegulated;
    }

    public String getCommercial() {
        return this.commercial;
    }

    public String getPayroll() {
        return this.payroll;
    }

    public String getIssuingBank() {
        return this.issuingBank;
    }

    public String getCountryOfIssuance() {
        return this.countryOfIssuance;
    }

    public String getProductId() {
        return this.productId;
    }

    public BinData() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.prepaid);
        parcel.writeString(this.healthcare);
        parcel.writeString(this.debit);
        parcel.writeString(this.durbinRegulated);
        parcel.writeString(this.commercial);
        parcel.writeString(this.payroll);
        parcel.writeString(this.issuingBank);
        parcel.writeString(this.countryOfIssuance);
        parcel.writeString(this.productId);
    }

    private BinData(Parcel parcel) {
        this.prepaid = parcel.readString();
        this.healthcare = parcel.readString();
        this.debit = parcel.readString();
        this.durbinRegulated = parcel.readString();
        this.commercial = parcel.readString();
        this.payroll = parcel.readString();
        this.issuingBank = parcel.readString();
        this.countryOfIssuance = parcel.readString();
        this.productId = parcel.readString();
    }
}
