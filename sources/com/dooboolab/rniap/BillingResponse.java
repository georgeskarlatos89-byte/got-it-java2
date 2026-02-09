package com.dooboolab.rniap;

import co.gotitapp.android.modules.country.CountryPickerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/dooboolab/rniap/BillingResponse;", "", "code", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "react-native-iap_playRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: PlayUtils.kt */
public final class BillingResponse {
    private final String code;
    private final String message;

    public static /* synthetic */ BillingResponse copy$default(BillingResponse billingResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billingResponse.code;
        }
        if ((i & 2) != 0) {
            str2 = billingResponse.message;
        }
        return billingResponse.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final BillingResponse copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA);
        Intrinsics.checkNotNullParameter(str2, "message");
        return new BillingResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingResponse)) {
            return false;
        }
        BillingResponse billingResponse = (BillingResponse) obj;
        return Intrinsics.areEqual((Object) this.code, (Object) billingResponse.code) && Intrinsics.areEqual((Object) this.message, (Object) billingResponse.message);
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        return "BillingResponse(code=" + this.code + ", message=" + this.message + ')';
    }

    public BillingResponse(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA);
        Intrinsics.checkNotNullParameter(str2, "message");
        this.code = str;
        this.message = str2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
