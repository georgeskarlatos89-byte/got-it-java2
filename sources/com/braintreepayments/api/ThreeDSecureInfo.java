package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

public class ThreeDSecureInfo implements Parcelable {
    private static final String ACS_TRANSACTION_ID_KEY = "acsTransactionId";
    private static final String AUTHENTICATION_KEY = "authentication";
    private static final String CAVV_KEY = "cavv";
    public static final Parcelable.Creator<ThreeDSecureInfo> CREATOR = new Parcelable.Creator<ThreeDSecureInfo>() {
        public ThreeDSecureInfo createFromParcel(Parcel parcel) {
            return new ThreeDSecureInfo(parcel);
        }

        public ThreeDSecureInfo[] newArray(int i) {
            return new ThreeDSecureInfo[i];
        }
    };
    private static final String DS_TRANSACTION_ID_KEY = "dsTransactionId";
    private static final String ECI_FLAG_KEY = "eciFlag";
    private static final String ENROLLED_KEY = "enrolled";
    private static final String LIABILITY_SHIFTED_KEY = "liabilityShifted";
    private static final String LIABILITY_SHIFT_POSSIBLE_KEY = "liabilityShiftPossible";
    private static final String LOOKUP_KEY = "lookup";
    private static final String PARES_STATUS_KEY = "paresStatus";
    private static final String STATUS_KEY = "status";
    private static final String THREE_D_SECURE_AUTHENTICATION_ID_KEY = "threeDSecureAuthenticationId";
    private static final String THREE_D_SECURE_SERVER_TRANSACTION_ID_KEY = "threeDSecureServerTransactionId";
    private static final String THREE_D_SECURE_VERSION_KEY = "threeDSecureVersion";
    private static final String TRANS_STATUS_KEY = "transStatus";
    private static final String TRANS_STATUS_REASON_KEY = "transStatusReason";
    private static final String XID_KEY = "xid";
    private String acsTransactionId;
    private String authenticationTransactionStatus;
    private String authenticationTransactionStatusReason;
    private String cavv;
    private String dsTransactionId;
    private String eciFlag;
    private String enrolled;
    private boolean liabilityShiftPossible;
    private boolean liabilityShifted;
    private String lookupTransactionStatus;
    private String lookupTransactionStatusReason;
    private String paresStatus;
    private String status;
    private String threeDSecureAuthenticationId;
    private String threeDSecureServerTransactionId;
    private String threeDSecureVersion;
    private boolean wasVerified;
    private String xid;

    public int describeContents() {
        return 0;
    }

    static ThreeDSecureInfo fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        ThreeDSecureInfo threeDSecureInfo = new ThreeDSecureInfo();
        threeDSecureInfo.cavv = jSONObject.optString(CAVV_KEY);
        threeDSecureInfo.dsTransactionId = jSONObject.optString(DS_TRANSACTION_ID_KEY);
        threeDSecureInfo.eciFlag = jSONObject.optString(ECI_FLAG_KEY);
        threeDSecureInfo.enrolled = jSONObject.optString(ENROLLED_KEY);
        threeDSecureInfo.liabilityShifted = jSONObject.optBoolean(LIABILITY_SHIFTED_KEY);
        threeDSecureInfo.liabilityShiftPossible = jSONObject.optBoolean(LIABILITY_SHIFT_POSSIBLE_KEY);
        threeDSecureInfo.status = jSONObject.optString("status");
        threeDSecureInfo.threeDSecureVersion = jSONObject.optString(THREE_D_SECURE_VERSION_KEY);
        threeDSecureInfo.wasVerified = jSONObject.has(LIABILITY_SHIFTED_KEY) && jSONObject.has(LIABILITY_SHIFT_POSSIBLE_KEY);
        threeDSecureInfo.xid = jSONObject.optString(XID_KEY);
        threeDSecureInfo.acsTransactionId = jSONObject.optString(ACS_TRANSACTION_ID_KEY);
        threeDSecureInfo.threeDSecureAuthenticationId = jSONObject.optString(THREE_D_SECURE_AUTHENTICATION_ID_KEY);
        threeDSecureInfo.threeDSecureServerTransactionId = jSONObject.optString(THREE_D_SECURE_SERVER_TRANSACTION_ID_KEY);
        threeDSecureInfo.paresStatus = jSONObject.optString(PARES_STATUS_KEY);
        JSONObject optJSONObject = jSONObject.optJSONObject(AUTHENTICATION_KEY);
        if (optJSONObject != null) {
            threeDSecureInfo.authenticationTransactionStatus = optJSONObject.optString(TRANS_STATUS_KEY);
            threeDSecureInfo.authenticationTransactionStatusReason = optJSONObject.optString(TRANS_STATUS_REASON_KEY);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("lookup");
        if (optJSONObject2 != null) {
            threeDSecureInfo.lookupTransactionStatus = optJSONObject2.optString(TRANS_STATUS_KEY);
            threeDSecureInfo.lookupTransactionStatusReason = optJSONObject2.optString(TRANS_STATUS_REASON_KEY);
        }
        return threeDSecureInfo;
    }

    public String getCavv() {
        return this.cavv;
    }

    public String getDsTransactionId() {
        return this.dsTransactionId;
    }

    public String getEciFlag() {
        return this.eciFlag;
    }

    public String getEnrolled() {
        return this.enrolled;
    }

    public boolean isLiabilityShifted() {
        return this.liabilityShifted;
    }

    public boolean isLiabilityShiftPossible() {
        return this.liabilityShiftPossible;
    }

    public String getStatus() {
        return this.status;
    }

    public String getThreeDSecureVersion() {
        return this.threeDSecureVersion;
    }

    public boolean wasVerified() {
        return this.wasVerified;
    }

    public String getXid() {
        return this.xid;
    }

    public String getAcsTransactionId() {
        return this.acsTransactionId;
    }

    public String getThreeDSecureAuthenticationId() {
        return this.threeDSecureAuthenticationId;
    }

    public String getThreeDSecureServerTransactionId() {
        return this.threeDSecureServerTransactionId;
    }

    public String getParesStatus() {
        return this.paresStatus;
    }

    public String getAuthenticationTransactionStatus() {
        return this.authenticationTransactionStatus;
    }

    public String getAuthenticationTransactionStatusReason() {
        return this.authenticationTransactionStatusReason;
    }

    public String getLookupTransactionStatus() {
        return this.lookupTransactionStatus;
    }

    public String getLookupTransactionStatusReason() {
        return this.lookupTransactionStatusReason;
    }

    public ThreeDSecureInfo() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cavv);
        parcel.writeString(this.dsTransactionId);
        parcel.writeString(this.eciFlag);
        parcel.writeString(this.enrolled);
        parcel.writeByte(this.liabilityShifted ? (byte) 1 : 0);
        parcel.writeByte(this.liabilityShiftPossible ? (byte) 1 : 0);
        parcel.writeString(this.status);
        parcel.writeString(this.threeDSecureVersion);
        parcel.writeByte(this.wasVerified ? (byte) 1 : 0);
        parcel.writeString(this.xid);
        parcel.writeString(this.authenticationTransactionStatus);
        parcel.writeString(this.authenticationTransactionStatusReason);
        parcel.writeString(this.lookupTransactionStatus);
        parcel.writeString(this.lookupTransactionStatusReason);
        parcel.writeString(this.threeDSecureAuthenticationId);
    }

    private ThreeDSecureInfo(Parcel parcel) {
        this.cavv = parcel.readString();
        this.dsTransactionId = parcel.readString();
        this.eciFlag = parcel.readString();
        this.enrolled = parcel.readString();
        boolean z = true;
        this.liabilityShifted = parcel.readByte() != 0;
        this.liabilityShiftPossible = parcel.readByte() != 0;
        this.status = parcel.readString();
        this.threeDSecureVersion = parcel.readString();
        this.wasVerified = parcel.readByte() == 0 ? false : z;
        this.xid = parcel.readString();
        this.authenticationTransactionStatus = parcel.readString();
        this.authenticationTransactionStatusReason = parcel.readString();
        this.lookupTransactionStatus = parcel.readString();
        this.lookupTransactionStatusReason = parcel.readString();
        this.threeDSecureAuthenticationId = parcel.readString();
    }
}
