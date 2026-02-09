package com.braintreepayments.api;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/braintreepayments/api/CardConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "supportedCardTypes", "", "", "isFraudDataCollectionEnabled", "", "(Ljava/util/List;Z)V", "()Z", "getSupportedCardTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: CardConfiguration.kt */
public final class CardConfiguration {
    private static final String COLLECT_DEVICE_DATA_KEY = "collectDeviceData";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String SUPPORTED_CARD_TYPES_KEY = "supportedCardTypes";
    private final boolean isFraudDataCollectionEnabled;
    private final List<String> supportedCardTypes;

    public static /* synthetic */ CardConfiguration copy$default(CardConfiguration cardConfiguration, List<String> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardConfiguration.supportedCardTypes;
        }
        if ((i & 2) != 0) {
            z = cardConfiguration.isFraudDataCollectionEnabled;
        }
        return cardConfiguration.copy(list, z);
    }

    public final List<String> component1() {
        return this.supportedCardTypes;
    }

    public final boolean component2() {
        return this.isFraudDataCollectionEnabled;
    }

    public final CardConfiguration copy(List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, SUPPORTED_CARD_TYPES_KEY);
        return new CardConfiguration(list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardConfiguration)) {
            return false;
        }
        CardConfiguration cardConfiguration = (CardConfiguration) obj;
        return Intrinsics.areEqual((Object) this.supportedCardTypes, (Object) cardConfiguration.supportedCardTypes) && this.isFraudDataCollectionEnabled == cardConfiguration.isFraudDataCollectionEnabled;
    }

    public int hashCode() {
        int hashCode = this.supportedCardTypes.hashCode() * 31;
        boolean z = this.isFraudDataCollectionEnabled;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "CardConfiguration(supportedCardTypes=" + this.supportedCardTypes + ", isFraudDataCollectionEnabled=" + this.isFraudDataCollectionEnabled + ')';
    }

    public CardConfiguration(List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, SUPPORTED_CARD_TYPES_KEY);
        this.supportedCardTypes = list;
        this.isFraudDataCollectionEnabled = z;
    }

    public final List<String> getSupportedCardTypes() {
        return this.supportedCardTypes;
    }

    public final boolean isFraudDataCollectionEnabled() {
        return this.isFraudDataCollectionEnabled;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CardConfiguration(JSONObject jSONObject) {
        this(Companion.parseSupportedCardTypes(jSONObject != null ? jSONObject.optJSONArray(SUPPORTED_CARD_TYPES_KEY) : null), jSONObject != null ? jSONObject.optBoolean(COLLECT_DEVICE_DATA_KEY, false) : false);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braintreepayments/api/CardConfiguration$Companion;", "", "()V", "COLLECT_DEVICE_DATA_KEY", "", "SUPPORTED_CARD_TYPES_KEY", "parseSupportedCardTypes", "", "jsonArray", "Lorg/json/JSONArray;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: CardConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final List<String> parseSupportedCardTypes(JSONArray jSONArray) {
            List<String> arrayList = new ArrayList<>();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = jSONArray.optString(i, "");
                    Intrinsics.checkNotNullExpressionValue(optString, "array.optString(i, \"\")");
                    arrayList.add(optString);
                }
            }
            return arrayList;
        }
    }
}
