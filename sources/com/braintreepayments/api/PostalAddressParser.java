package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010$H\u0007J\u000e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020$R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/braintreepayments/api/PostalAddressParser;", "", "()V", "COUNTRY_CODE_ALPHA_2_KEY", "", "COUNTRY_CODE_KEY", "COUNTRY_CODE_UNDERSCORE_KEY", "EXTENDED_ADDRESS_KEY", "LINE_1_KEY", "LINE_2_KEY", "LOCALITY_KEY", "POSTAL_CODE_KEY", "POSTAL_CODE_UNDERSCORE_KEY", "RECIPIENT_NAME_KEY", "RECIPIENT_NAME_UNDERSCORE_KEY", "REGION_KEY", "STREET_ADDRESS_KEY", "USER_ADDRESS_ADDRESS_1_KEY", "USER_ADDRESS_ADDRESS_2_KEY", "USER_ADDRESS_ADDRESS_3_KEY", "USER_ADDRESS_ADDRESS_4_KEY", "USER_ADDRESS_ADDRESS_5_KEY", "USER_ADDRESS_ADMINISTRATIVE_AREA_KEY", "USER_ADDRESS_COUNTRY_CODE_KEY", "USER_ADDRESS_LOCALITY_KEY", "USER_ADDRESS_NAME_KEY", "USER_ADDRESS_PHONE_NUMBER_KEY", "USER_ADDRESS_POSTAL_CODE_KEY", "USER_ADDRESS_SORTING_CODE_KEY", "VENMO_GQL_ADDRESS1_KEY", "VENMO_GQL_ADDRESS2_KEY", "VENMO_GQL_LOCALITY_KEY", "VENMO_GQL_RECIPIENT_KEY", "VENMO_GQL_REGION_KEY", "formatExtendedUserAddress", "address", "Lorg/json/JSONObject;", "fromJson", "Lcom/braintreepayments/api/PostalAddress;", "accountAddress", "fromUserAddressJson", "json", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: PostalAddressParser.kt */
public final class PostalAddressParser {
    public static final String COUNTRY_CODE_ALPHA_2_KEY = "country";
    public static final String COUNTRY_CODE_KEY = "countryCode";
    public static final String COUNTRY_CODE_UNDERSCORE_KEY = "country_code";
    public static final String EXTENDED_ADDRESS_KEY = "street2";
    public static final PostalAddressParser INSTANCE = new PostalAddressParser();
    public static final String LINE_1_KEY = "line1";
    public static final String LINE_2_KEY = "line2";
    public static final String LOCALITY_KEY = "city";
    public static final String POSTAL_CODE_KEY = "postalCode";
    public static final String POSTAL_CODE_UNDERSCORE_KEY = "postal_code";
    public static final String RECIPIENT_NAME_KEY = "recipientName";
    public static final String RECIPIENT_NAME_UNDERSCORE_KEY = "recipient_name";
    public static final String REGION_KEY = "state";
    public static final String STREET_ADDRESS_KEY = "street1";
    public static final String USER_ADDRESS_ADDRESS_1_KEY = "address1";
    public static final String USER_ADDRESS_ADDRESS_2_KEY = "address2";
    public static final String USER_ADDRESS_ADDRESS_3_KEY = "address3";
    public static final String USER_ADDRESS_ADDRESS_4_KEY = "address4";
    public static final String USER_ADDRESS_ADDRESS_5_KEY = "address5";
    public static final String USER_ADDRESS_ADMINISTRATIVE_AREA_KEY = "administrativeArea";
    public static final String USER_ADDRESS_COUNTRY_CODE_KEY = "countryCode";
    public static final String USER_ADDRESS_LOCALITY_KEY = "locality";
    public static final String USER_ADDRESS_NAME_KEY = "name";
    public static final String USER_ADDRESS_PHONE_NUMBER_KEY = "phoneNumber";
    public static final String USER_ADDRESS_POSTAL_CODE_KEY = "postalCode";
    public static final String USER_ADDRESS_SORTING_CODE_KEY = "sortingCode";
    public static final String VENMO_GQL_ADDRESS1_KEY = "addressLine1";
    public static final String VENMO_GQL_ADDRESS2_KEY = "addressLine2";
    public static final String VENMO_GQL_LOCALITY_KEY = "adminArea2";
    public static final String VENMO_GQL_RECIPIENT_KEY = "fullName";
    public static final String VENMO_GQL_REGION_KEY = "adminArea1";

    private PostalAddressParser() {
    }

    @JvmStatic
    public static final PostalAddress fromJson(JSONObject jSONObject) {
        PostalAddress postalAddress;
        if (jSONObject != null) {
            String optString = Json.optString(jSONObject, STREET_ADDRESS_KEY, (String) null);
            String optString2 = Json.optString(jSONObject, EXTENDED_ADDRESS_KEY, (String) null);
            String optString3 = Json.optString(jSONObject, "country", (String) null);
            if (optString == null) {
                optString = Json.optString(jSONObject, LINE_1_KEY, (String) null);
            }
            if (optString2 == null) {
                optString2 = Json.optString(jSONObject, LINE_2_KEY, (String) null);
            }
            if (optString3 == null) {
                optString3 = Json.optString(jSONObject, "countryCode", (String) null);
            }
            if (optString == null) {
                optString = Json.optString(jSONObject, VENMO_GQL_ADDRESS1_KEY, (String) null);
            }
            if (optString2 == null) {
                optString2 = Json.optString(jSONObject, VENMO_GQL_ADDRESS2_KEY, (String) null);
            }
            if (optString != null || Json.optString(jSONObject, "name", (String) null) == null) {
                PostalAddress postalAddress2 = new PostalAddress();
                postalAddress2.setRecipientName(Json.optString(jSONObject, RECIPIENT_NAME_KEY, (String) null));
                postalAddress2.setStreetAddress(optString);
                postalAddress2.setExtendedAddress(optString2);
                postalAddress2.setLocality(Json.optString(jSONObject, LOCALITY_KEY, (String) null));
                postalAddress2.setRegion(Json.optString(jSONObject, "state", (String) null));
                postalAddress2.setPostalCode(Json.optString(jSONObject, "postalCode", (String) null));
                postalAddress2.setCountryCodeAlpha2(optString3);
                String recipientName = postalAddress2.getRecipientName();
                if (recipientName == null) {
                    recipientName = Json.optString(jSONObject, VENMO_GQL_RECIPIENT_KEY, (String) null);
                }
                postalAddress2.setRecipientName(recipientName);
                String locality = postalAddress2.getLocality();
                if (locality == null) {
                    locality = Json.optString(jSONObject, VENMO_GQL_LOCALITY_KEY, (String) null);
                }
                postalAddress2.setLocality(locality);
                String region = postalAddress2.getRegion();
                if (region == null) {
                    region = Json.optString(jSONObject, VENMO_GQL_REGION_KEY, (String) null);
                }
                postalAddress2.setRegion(region);
                postalAddress = postalAddress2;
            } else {
                postalAddress = INSTANCE.fromUserAddressJson(jSONObject);
            }
            if (postalAddress != null) {
                return postalAddress;
            }
        }
        return new PostalAddress();
    }

    public final PostalAddress fromUserAddressJson(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        PostalAddress postalAddress = new PostalAddress();
        postalAddress.setRecipientName(Json.optString(jSONObject, "name", ""));
        postalAddress.setPhoneNumber(Json.optString(jSONObject, "phoneNumber", ""));
        postalAddress.setStreetAddress(Json.optString(jSONObject, USER_ADDRESS_ADDRESS_1_KEY, ""));
        postalAddress.setExtendedAddress(INSTANCE.formatExtendedUserAddress(jSONObject));
        postalAddress.setLocality(Json.optString(jSONObject, USER_ADDRESS_LOCALITY_KEY, ""));
        postalAddress.setRegion(Json.optString(jSONObject, USER_ADDRESS_ADMINISTRATIVE_AREA_KEY, ""));
        postalAddress.setCountryCodeAlpha2(Json.optString(jSONObject, "countryCode", ""));
        postalAddress.setPostalCode(Json.optString(jSONObject, "postalCode", ""));
        postalAddress.setSortingCode(Json.optString(jSONObject, USER_ADDRESS_SORTING_CODE_KEY, ""));
        return postalAddress;
    }

    private final String formatExtendedUserAddress(JSONObject jSONObject) {
        return StringsKt.trim((CharSequence) Json.optString(jSONObject, USER_ADDRESS_ADDRESS_2_KEY, "") + 10 + Json.optString(jSONObject, USER_ADDRESS_ADDRESS_3_KEY, "") + 10 + Json.optString(jSONObject, USER_ADDRESS_ADDRESS_4_KEY, "") + 10 + Json.optString(jSONObject, USER_ADDRESS_ADDRESS_5_KEY, "")).toString();
    }
}
