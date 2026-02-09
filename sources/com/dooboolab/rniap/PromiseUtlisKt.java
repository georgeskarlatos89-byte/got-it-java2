package com.dooboolab.rniap;

import android.util.Log;
import co.gotitapp.android.modules.country.CountryPickerActivity;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u0014\u0010\t\u001a\u00020\u0003*\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"TAG", "", "safeReject", "", "Lcom/facebook/react/bridge/Promise;", "message", "code", "throwable", "", "safeResolve", "value", "", "react-native-iap_playRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PromiseUtlis.kt */
public final class PromiseUtlisKt {
    public static final String TAG = "IapPromises";

    public static final void safeResolve(Promise promise, Object obj) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        try {
            promise.resolve(obj);
        } catch (RuntimeException e) {
            Log.d(TAG, "Already consumed " + e.getMessage());
        }
    }

    public static final void safeReject(Promise promise, String str) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        Intrinsics.checkNotNullParameter(str, "message");
        safeReject(promise, str, (String) null, (Throwable) null);
    }

    public static final void safeReject(Promise promise, String str, String str2) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        Intrinsics.checkNotNullParameter(str, CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA);
        safeReject(promise, str, str2, (Throwable) null);
    }

    public static final void safeReject(Promise promise, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        Intrinsics.checkNotNullParameter(str, CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA);
        safeReject(promise, str, (String) null, th);
    }

    public static final void safeReject(Promise promise, String str, String str2, Throwable th) {
        Intrinsics.checkNotNullParameter(promise, "<this>");
        Intrinsics.checkNotNullParameter(str, CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA);
        try {
            promise.reject(str, str2, th);
        } catch (RuntimeException e) {
            Log.d(TAG, "Already consumed " + e.getMessage());
        }
    }
}
