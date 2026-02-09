package com.braintreepayments.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/braintreepayments/api/VisaCheckoutConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "apiKey", "", "externalClientId", "acceptedCardBrands", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAcceptedCardBrands", "()Ljava/util/List;", "getApiKey", "()Ljava/lang/String;", "getExternalClientId", "isEnabled", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: VisaCheckoutConfiguration.kt */
public final class VisaCheckoutConfiguration {
    private static final String API_KEY = "apikey";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EXTERNAL_CLIENT_ID = "externalClientId";
    private final List<String> acceptedCardBrands;
    private final String apiKey;
    private final String externalClientId;
    private final boolean isEnabled;

    public static /* synthetic */ VisaCheckoutConfiguration copy$default(VisaCheckoutConfiguration visaCheckoutConfiguration, String str, String str2, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = visaCheckoutConfiguration.apiKey;
        }
        if ((i & 2) != 0) {
            str2 = visaCheckoutConfiguration.externalClientId;
        }
        if ((i & 4) != 0) {
            list = visaCheckoutConfiguration.acceptedCardBrands;
        }
        return visaCheckoutConfiguration.copy(str, str2, list);
    }

    public final String component1() {
        return this.apiKey;
    }

    public final String component2() {
        return this.externalClientId;
    }

    public final List<String> component3() {
        return this.acceptedCardBrands;
    }

    public final VisaCheckoutConfiguration copy(String str, String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "apiKey");
        Intrinsics.checkNotNullParameter(str2, EXTERNAL_CLIENT_ID);
        Intrinsics.checkNotNullParameter(list, "acceptedCardBrands");
        return new VisaCheckoutConfiguration(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisaCheckoutConfiguration)) {
            return false;
        }
        VisaCheckoutConfiguration visaCheckoutConfiguration = (VisaCheckoutConfiguration) obj;
        return Intrinsics.areEqual((Object) this.apiKey, (Object) visaCheckoutConfiguration.apiKey) && Intrinsics.areEqual((Object) this.externalClientId, (Object) visaCheckoutConfiguration.externalClientId) && Intrinsics.areEqual((Object) this.acceptedCardBrands, (Object) visaCheckoutConfiguration.acceptedCardBrands);
    }

    public int hashCode() {
        return (((this.apiKey.hashCode() * 31) + this.externalClientId.hashCode()) * 31) + this.acceptedCardBrands.hashCode();
    }

    public String toString() {
        return "VisaCheckoutConfiguration(apiKey=" + this.apiKey + ", externalClientId=" + this.externalClientId + ", acceptedCardBrands=" + this.acceptedCardBrands + ')';
    }

    public VisaCheckoutConfiguration(String str, String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "apiKey");
        Intrinsics.checkNotNullParameter(str2, EXTERNAL_CLIENT_ID);
        Intrinsics.checkNotNullParameter(list, "acceptedCardBrands");
        this.apiKey = str;
        this.externalClientId = str2;
        this.acceptedCardBrands = list;
        this.isEnabled = !Intrinsics.areEqual((Object) str, (Object) "");
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getExternalClientId() {
        return this.externalClientId;
    }

    public final List<String> getAcceptedCardBrands() {
        return this.acceptedCardBrands;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VisaCheckoutConfiguration(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "apikey"
            java.lang.String r1 = ""
            java.lang.String r0 = com.braintreepayments.api.Json.optString(r5, r0, r1)
            java.lang.String r2 = "optString(json, API_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r2 = "externalClientId"
            java.lang.String r1 = com.braintreepayments.api.Json.optString(r5, r2, r1)
            java.lang.String r2 = "optString(json, EXTERNAL_CLIENT_ID, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.braintreepayments.api.VisaCheckoutConfiguration$Companion r2 = Companion
            com.braintreepayments.api.CardConfiguration r3 = new com.braintreepayments.api.CardConfiguration
            r3.<init>(r5)
            java.util.List r5 = r3.getSupportedCardTypes()
            java.util.List r5 = r2.supportedCardTypesToAcceptedCardBrands(r5)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.VisaCheckoutConfiguration.<init>(org.json.JSONObject):void");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/VisaCheckoutConfiguration$Companion;", "", "()V", "API_KEY", "", "EXTERNAL_CLIENT_ID", "supportedCardTypesToAcceptedCardBrands", "", "supportedCardTypes", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: VisaCheckoutConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final List<String> supportedCardTypesToAcceptedCardBrands(List<String> list) {
            List<String> arrayList = new ArrayList<>();
            for (String lowerCase : list) {
                String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                switch (lowerCase2.hashCode()) {
                    case -2038717326:
                        if (lowerCase2.equals("mastercard")) {
                            arrayList.add("MASTERCARD");
                            break;
                        } else {
                            break;
                        }
                    case -1120637072:
                        if (lowerCase2.equals("american express")) {
                            arrayList.add("AMEX");
                            break;
                        } else {
                            break;
                        }
                    case 3619905:
                        if (lowerCase2.equals("visa")) {
                            arrayList.add("VISA");
                            break;
                        } else {
                            break;
                        }
                    case 273184745:
                        if (lowerCase2.equals("discover")) {
                            arrayList.add("DISCOVER");
                            break;
                        } else {
                            break;
                        }
                }
            }
            return arrayList;
        }
    }
}
