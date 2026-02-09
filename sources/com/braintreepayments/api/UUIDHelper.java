package com.braintreepayments.api;

import android.content.Context;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u000eR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/braintreepayments/api/UUIDHelper;", "", "()V", "formattedUUID", "", "getFormattedUUID", "()Ljava/lang/String;", "getInstallationGUID", "context", "Landroid/content/Context;", "braintreeSharedPreferences", "Lcom/braintreepayments/api/BraintreeSharedPreferences;", "getInstallationGUID$BraintreeCore_release", "getPersistentUUID", "getPersistentUUID$BraintreeCore_release", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: UUIDHelper.kt */
public final class UUIDHelper {
    private static final String BRAINTREE_UUID_KEY = "braintreeUUID";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String INSTALL_GUID = "InstallationGUID";

    public final String getPersistentUUID(Context context) {
        BraintreeSharedPreferences instance = BraintreeSharedPreferences.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(context)");
        return getPersistentUUID$BraintreeCore_release(instance);
    }

    public final String getPersistentUUID$BraintreeCore_release(BraintreeSharedPreferences braintreeSharedPreferences) {
        Intrinsics.checkNotNullParameter(braintreeSharedPreferences, "braintreeSharedPreferences");
        String string = braintreeSharedPreferences.getString(BRAINTREE_UUID_KEY, (String) null);
        if (string != null) {
            return string;
        }
        String formattedUUID = getFormattedUUID();
        braintreeSharedPreferences.putString(BRAINTREE_UUID_KEY, formattedUUID);
        return formattedUUID;
    }

    public final String getFormattedUUID() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        return StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null);
    }

    public final String getInstallationGUID(Context context) {
        BraintreeSharedPreferences instance = BraintreeSharedPreferences.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(context)");
        return getInstallationGUID$BraintreeCore_release(instance);
    }

    public final String getInstallationGUID$BraintreeCore_release(BraintreeSharedPreferences braintreeSharedPreferences) {
        Intrinsics.checkNotNullParameter(braintreeSharedPreferences, "braintreeSharedPreferences");
        String string = braintreeSharedPreferences.getString(INSTALL_GUID, (String) null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            braintreeSharedPreferences.putString(INSTALL_GUID, string);
        }
        Intrinsics.checkNotNullExpressionValue(string, "installationGUID");
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/UUIDHelper$Companion;", "", "()V", "BRAINTREE_UUID_KEY", "", "INSTALL_GUID", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: UUIDHelper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
