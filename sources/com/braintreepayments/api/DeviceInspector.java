package com.braintreepayments.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.internal.ServerProtocol;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\tH\u0002J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J5\u0010\u0016\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\u001cJ\u0014\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u001f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010 \u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/braintreepayments/api/DeviceInspector;", "", "()V", "appHelper", "Lcom/braintreepayments/api/AppHelper;", "signatureVerifier", "Lcom/braintreepayments/api/SignatureVerifier;", "(Lcom/braintreepayments/api/AppHelper;Lcom/braintreepayments/api/SignatureVerifier;)V", "dropInVersion", "", "getDropInVersion", "()Ljava/lang/String;", "isDeviceEmulator", "", "()Z", "getAPIVersion", "getAppName", "context", "Landroid/content/Context;", "getAppVersion", "getApplicationInfo", "Landroid/content/pm/ApplicationInfo;", "getDeviceMetadata", "Lcom/braintreepayments/api/DeviceMetadata;", "configuration", "Lcom/braintreepayments/api/Configuration;", "sessionId", "integration", "getDeviceMetadata$BraintreeCore_release", "getPackageInfo", "isPayPalInstalled", "isVenmoAppSwitchAvailable", "isVenmoInstalled", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: DeviceInspector.kt */
public final class DeviceInspector {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String PAYPAL_APP_PACKAGE = "com.paypal.android.p2pmobile";
    private static final String VENMO_APP_PACKAGE = "com.venmo";
    private static final String VENMO_APP_SWITCH_ACTIVITY = "controller.SetupMerchantActivity";
    public static final String VENMO_BASE_64_ENCODED_SIGNATURE = "x34mMawEUcCG8l95riWCOK+kAJYejVmdt44l6tzcyUc=\n";
    private final AppHelper appHelper;
    private final SignatureVerifier signatureVerifier;

    public DeviceInspector(AppHelper appHelper2, SignatureVerifier signatureVerifier2) {
        Intrinsics.checkNotNullParameter(appHelper2, "appHelper");
        Intrinsics.checkNotNullParameter(signatureVerifier2, "signatureVerifier");
        this.appHelper = appHelper2;
        this.signatureVerifier = signatureVerifier2;
    }

    public DeviceInspector() {
        this(new AppHelper(), new SignatureVerifier());
    }

    public final DeviceMetadata getDeviceMetadata$BraintreeCore_release(Context context, Configuration configuration, String str, String str2) {
        String str3 = null;
        String packageName = context != null ? context.getPackageName() : null;
        String appName = getAppName(context);
        String aPIVersion = getAPIVersion();
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        String dropInVersion = getDropInVersion();
        String environment = configuration != null ? configuration.getEnvironment() : null;
        boolean isDeviceEmulator = isDeviceEmulator();
        String appVersion = getAppVersion(context);
        if (configuration != null) {
            str3 = configuration.getMerchantId();
        }
        return new DeviceMetadata(packageName, appName, "4.45.0", aPIVersion, "braintreeclientsdk", str4, str5, dropInVersion, environment, "mobile-native", str2, isDeviceEmulator, appVersion, str3, "Android", str);
    }

    public final boolean isVenmoAppSwitchAvailable(Context context) {
        return this.appHelper.isIntentAvailable(context, Companion.getVenmoIntent()) && this.signatureVerifier.isSignatureValid(context, VENMO_APP_PACKAGE, VENMO_BASE_64_ENCODED_SIGNATURE);
    }

    public final boolean isPayPalInstalled(Context context) {
        return this.appHelper.isAppInstalled(context, PAYPAL_APP_PACKAGE);
    }

    public final boolean isVenmoInstalled(Context context) {
        return this.appHelper.isAppInstalled(context, VENMO_APP_PACKAGE);
    }

    private final boolean isDeviceEmulator() {
        if (StringsKt.equals("google_sdk", Build.PRODUCT, true) || StringsKt.equals(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Build.PRODUCT, true) || StringsKt.equals("Genymotion", Build.MANUFACTURER, true)) {
            return true;
        }
        String str = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(str, "FINGERPRINT");
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "generic", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = r2.getPackageManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getAppName(android.content.Context r2) {
        /*
            r1 = this;
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r2)
            if (r0 == 0) goto L_0x001a
            if (r2 == 0) goto L_0x0013
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            if (r2 == 0) goto L_0x0013
            java.lang.CharSequence r2 = r2.getApplicationLabel(r0)
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r2 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r2 = "ApplicationNameUnknown"
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.DeviceInspector.getAppName(android.content.Context):java.lang.String");
    }

    private final ApplicationInfo getApplicationInfo(Context context) {
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getApplicationInfo(context.getPackageName(), 0);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            ApplicationInfo applicationInfo = null;
            return null;
        }
    }

    private final String getAppVersion(Context context) {
        String packageInfo = getPackageInfo(context);
        return packageInfo == null ? "VersionUnknown" : packageInfo;
    }

    private final String getPackageInfo(Context context) {
        if (context == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String str = null;
            return null;
        }
    }

    private final String getAPIVersion() {
        return "Android API " + Build.VERSION.SDK_INT;
    }

    private final String getDropInVersion() {
        return Companion.getDropInVersion$BraintreeCore_release();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0014\u0010\t\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/braintreepayments/api/DeviceInspector$Companion;", "", "()V", "PAYPAL_APP_PACKAGE", "", "VENMO_APP_PACKAGE", "VENMO_APP_SWITCH_ACTIVITY", "VENMO_BASE_64_ENCODED_SIGNATURE", "getVENMO_BASE_64_ENCODED_SIGNATURE$annotations", "venmoIntent", "Landroid/content/Intent;", "getVenmoIntent", "()Landroid/content/Intent;", "getDropInVersion", "getDropInVersion$BraintreeCore_release", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: DeviceInspector.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getVENMO_BASE_64_ENCODED_SIGNATURE$annotations() {
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Intent getVenmoIntent() {
            Intent component = new Intent().setComponent(new ComponentName(DeviceInspector.VENMO_APP_PACKAGE, "com.venmo.controller.SetupMerchantActivity"));
            Intrinsics.checkNotNullExpressionValue(component, "Intent().setComponent(\n …          )\n            )");
            return component;
        }

        public final String getDropInVersion$BraintreeCore_release() {
            try {
                Field field = Class.forName("com.braintreepayments.api.dropin.BuildConfig").getField("VERSION_NAME");
                field.setAccessible(true);
                return (String) field.get(Reflection.getOrCreateKotlinClass(String.class));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                return null;
            }
        }
    }
}
