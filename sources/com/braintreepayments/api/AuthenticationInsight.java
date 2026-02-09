package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

public class AuthenticationInsight implements Parcelable {
    public static final Parcelable.Creator<AuthenticationInsight> CREATOR = new Parcelable.Creator<AuthenticationInsight>() {
        public AuthenticationInsight createFromParcel(Parcel parcel) {
            return new AuthenticationInsight(parcel);
        }

        public AuthenticationInsight[] newArray(int i) {
            return new AuthenticationInsight[i];
        }
    };
    private static final String GRAPHQL_REGULATION_ENVIRONMENT_KEY = "customerAuthenticationRegulationEnvironment";
    private static final String REST_REGULATION_ENVIRONMENT_KEY = "regulationEnvironment";
    private final String regulationEnvironment;

    public int describeContents() {
        return 0;
    }

    static AuthenticationInsight fromJson(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has(GRAPHQL_REGULATION_ENVIRONMENT_KEY)) {
            str = Json.optString(jSONObject, GRAPHQL_REGULATION_ENVIRONMENT_KEY, "");
        } else {
            str = Json.optString(jSONObject, REST_REGULATION_ENVIRONMENT_KEY, "");
        }
        if ("psdtwo".equalsIgnoreCase(str)) {
            str = "psd2";
        }
        return new AuthenticationInsight(str.toLowerCase());
    }

    AuthenticationInsight(String str) {
        this.regulationEnvironment = str;
    }

    public String getRegulationEnvironment() {
        return this.regulationEnvironment;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.regulationEnvironment);
    }

    private AuthenticationInsight(Parcel parcel) {
        this.regulationEnvironment = parcel.readString();
    }
}
