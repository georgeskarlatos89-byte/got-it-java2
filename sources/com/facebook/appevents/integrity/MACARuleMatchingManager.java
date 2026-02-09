package com.facebook.appevents.integrity;

import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010\u001c\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\""}, d2 = {"Lcom/facebook/appevents/integrity/MACARuleMatchingManager;", "", "()V", "MACARules", "Lorg/json/JSONArray;", "enabled", "", "keys", "", "", "[Ljava/lang/String;", "enable", "", "generateInfo", "params", "Landroid/os/Bundle;", "event", "getKey", "logic", "Lorg/json/JSONObject;", "getMatchPropertyIDs", "getStringArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "jsonArray", "isMatchCCRule", "ruleString", "data", "loadMACARules", "processParameters", "removeGeneratedInfo", "stringComparison", "variable", "values", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: MACARuleMatchingManager.kt */
public final class MACARuleMatchingManager {
    public static final MACARuleMatchingManager INSTANCE = new MACARuleMatchingManager();
    private static JSONArray MACARules;
    private static boolean enabled;
    private static String[] keys = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private MACARuleMatchingManager() {
    }

    @JvmStatic
    public static final void enable() {
        Class<MACARuleMatchingManager> cls = MACARuleMatchingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                INSTANCE.loadMACARules();
                if (MACARules != null) {
                    enabled = true;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void loadMACARules() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (queryAppSettings != null) {
                    MACARules = queryAppSettings.getMACARuleMatchingSetting();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @JvmStatic
    public static final String getKey(JSONObject jSONObject) {
        Class<MACARuleMatchingManager> cls = MACARuleMatchingManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(jSONObject, "logic");
            Iterator<String> keys2 = jSONObject.keys();
            if (keys2.hasNext()) {
                return keys2.next();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c6, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7.toString(), (java.lang.Object) r3) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e3, code lost:
        if (java.lang.Double.parseDouble(r7.toString()) <= java.lang.Double.parseDouble(r3)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0212, code lost:
        if (java.lang.Double.parseDouble(r7.toString()) >= java.lang.Double.parseDouble(r3)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021f, code lost:
        if (r9 != null) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0221, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0222, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0226, code lost:
        if ((r9 instanceof java.util.Collection) == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x022f, code lost:
        if (((java.util.Collection) r9).isEmpty() == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0232, code lost:
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x023a, code lost:
        if (r8.hasNext() == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x023c, code lost:
        r9 = ((java.lang.String) r8.next()).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        r10 = r7.toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x025d, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)) != false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x026b, code lost:
        if (r9 != null) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x026d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x026e, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0272, code lost:
        if ((r9 instanceof java.util.Collection) == false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x027b, code lost:
        if (((java.util.Collection) r9).isEmpty() == false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x027f, code lost:
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0287, code lost:
        if (r8.hasNext() == false) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0289, code lost:
        r9 = ((java.lang.String) r8.next()).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        r10 = r7.toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02a9, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10) == false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x032d, code lost:
        if (r9 != null) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x032f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0342, code lost:
        if (r9 != null) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0344, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r7 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7.toString(), (java.lang.Object) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return r9.contains(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return r9.contains(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018c, code lost:
        if (java.lang.Double.parseDouble(r7.toString()) < java.lang.Double.parseDouble(r3)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b1, code lost:
        if (java.lang.Double.parseDouble(r7.toString()) > java.lang.Double.parseDouble(r3)) goto L_?;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean stringComparison(java.lang.String r8, org.json.JSONObject r9, android.os.Bundle r10) {
        /*
            java.lang.Class<com.facebook.appevents.integrity.MACARuleMatchingManager> r0 = com.facebook.appevents.integrity.MACARuleMatchingManager.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "variable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)     // Catch:{ all -> 0x037a }
            java.lang.String r1 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)     // Catch:{ all -> 0x037a }
            java.lang.String r1 = getKey(r9)     // Catch:{ all -> 0x037a }
            if (r1 != 0) goto L_0x001b
            return r2
        L_0x001b:
            java.lang.Object r3 = r9.get(r1)     // Catch:{ all -> 0x037a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x037a }
            org.json.JSONArray r9 = r9.optJSONArray(r1)     // Catch:{ all -> 0x037a }
            java.util.ArrayList r9 = getStringArrayList(r9)     // Catch:{ all -> 0x037a }
            java.lang.String r4 = "exists"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x037a }
            r5 = 1
            if (r4 == 0) goto L_0x0042
            if (r10 == 0) goto L_0x0041
            boolean r8 = r10.containsKey(r8)     // Catch:{ all -> 0x037a }
            boolean r9 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ all -> 0x037a }
            if (r8 != r9) goto L_0x0041
            r2 = r5
        L_0x0041:
            return r2
        L_0x0042:
            r4 = 0
            java.lang.String r6 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r10 == 0) goto L_0x0056
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r7 = r8.toLowerCase(r7)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)     // Catch:{ all -> 0x037a }
            java.lang.Object r7 = r10.get(r7)     // Catch:{ all -> 0x037a }
            if (r7 != 0) goto L_0x0062
        L_0x0056:
            if (r10 == 0) goto L_0x005e
            java.lang.Object r8 = r10.get(r8)     // Catch:{ all -> 0x037a }
            r7 = r8
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            if (r7 != 0) goto L_0x0062
            return r2
        L_0x0062:
            int r8 = r1.hashCode()     // Catch:{ all -> 0x037a }
            r10 = 2
            switch(r8) {
                case -1729128927: goto L_0x034e;
                case -1179774633: goto L_0x0339;
                case -1039699439: goto L_0x0324;
                case -969266188: goto L_0x0312;
                case -966353971: goto L_0x02f7;
                case -665609109: goto L_0x02ed;
                case -567445985: goto L_0x02d5;
                case -327990090: goto L_0x02ad;
                case -159812115: goto L_0x0261;
                case -92753547: goto L_0x0215;
                case 60: goto L_0x01fa;
                case 61: goto L_0x01e6;
                case 62: goto L_0x01cb;
                case 1084: goto L_0x01b4;
                case 1921: goto L_0x0199;
                case 1952: goto L_0x018f;
                case 1983: goto L_0x0174;
                case 3244: goto L_0x016a;
                case 3294: goto L_0x0160;
                case 3309: goto L_0x0156;
                case 3365: goto L_0x014c;
                case 3449: goto L_0x0142;
                case 3464: goto L_0x0138;
                case 3511: goto L_0x012e;
                case 102680: goto L_0x0124;
                case 107485: goto L_0x011a;
                case 108954: goto L_0x0110;
                case 127966736: goto L_0x00ea;
                case 127966857: goto L_0x00e0;
                case 363990325: goto L_0x00b6;
                case 1091487233: goto L_0x00ac;
                case 1918401035: goto L_0x0092;
                case 1961112862: goto L_0x006c;
                default: goto L_0x006a;
            }     // Catch:{ all -> 0x037a }
        L_0x006a:
            goto L_0x0379
        L_0x006c:
            java.lang.String r8 = "i_starts_with"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0076
            goto L_0x0379
        L_0x0076:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)     // Catch:{ all -> 0x037a }
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r8, r9, r2, r10, r4)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x0092:
            java.lang.String r8 = "not_contains"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x009c
            goto L_0x0379
        L_0x009c:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x037a }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x037a }
            boolean r8 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r3, (boolean) r2, (int) r10, (java.lang.Object) r4)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0379
            goto L_0x01c8
        L_0x00ac:
            java.lang.String r8 = "i_is_not_any"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x021f
            goto L_0x0379
        L_0x00b6:
            java.lang.String r8 = "i_contains"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x00c0
            goto L_0x0379
        L_0x00c0:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)     // Catch:{ all -> 0x037a }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)     // Catch:{ all -> 0x037a }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x037a }
            boolean r2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r9, (boolean) r2, (int) r10, (java.lang.Object) r4)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x00e0:
            java.lang.String r8 = "i_str_in"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x026b
            goto L_0x0379
        L_0x00ea:
            java.lang.String r8 = "i_str_eq"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x00f4
            goto L_0x0379
        L_0x00f4:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)     // Catch:{ all -> 0x037a }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x0110:
            java.lang.String r8 = "neq"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01be
            goto L_0x0379
        L_0x011a:
            java.lang.String r8 = "lte"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01a3
            goto L_0x0379
        L_0x0124:
            java.lang.String r8 = "gte"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x017e
            goto L_0x0379
        L_0x012e:
            java.lang.String r8 = "ne"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01be
            goto L_0x0379
        L_0x0138:
            java.lang.String r8 = "lt"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0204
            goto L_0x0379
        L_0x0142:
            java.lang.String r8 = "le"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01a3
            goto L_0x0379
        L_0x014c:
            java.lang.String r8 = "in"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0342
            goto L_0x0379
        L_0x0156:
            java.lang.String r8 = "gt"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01d5
            goto L_0x0379
        L_0x0160:
            java.lang.String r8 = "ge"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x017e
            goto L_0x0379
        L_0x016a:
            java.lang.String r8 = "eq"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01f0
            goto L_0x0379
        L_0x0174:
            java.lang.String r8 = ">="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x017e
            goto L_0x0379
        L_0x017e:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x037a }
            double r0 = java.lang.Double.parseDouble(r3)     // Catch:{ all -> 0x037a }
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x0379
            goto L_0x01c8
        L_0x018f:
            java.lang.String r8 = "=="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01f0
            goto L_0x0379
        L_0x0199:
            java.lang.String r8 = "<="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01a3
            goto L_0x0379
        L_0x01a3:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x037a }
            double r0 = java.lang.Double.parseDouble(r3)     // Catch:{ all -> 0x037a }
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 > 0) goto L_0x0379
            goto L_0x01c8
        L_0x01b4:
            java.lang.String r8 = "!="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01be
            goto L_0x0379
        L_0x01be:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r3)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0379
        L_0x01c8:
            r2 = r5
            goto L_0x0379
        L_0x01cb:
            java.lang.String r8 = ">"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01d5
            goto L_0x0379
        L_0x01d5:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x037a }
            double r0 = java.lang.Double.parseDouble(r3)     // Catch:{ all -> 0x037a }
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0379
            goto L_0x01c8
        L_0x01e6:
            java.lang.String r8 = "="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x01f0
            goto L_0x0379
        L_0x01f0:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r3)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x01fa:
            java.lang.String r8 = "<"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0204
            goto L_0x0379
        L_0x0204:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x037a }
            double r0 = java.lang.Double.parseDouble(r3)     // Catch:{ all -> 0x037a }
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0379
            goto L_0x01c8
        L_0x0215:
            java.lang.String r8 = "i_str_not_in"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x021f
            goto L_0x0379
        L_0x021f:
            if (r9 != 0) goto L_0x0222
            return r2
        L_0x0222:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x037a }
            boolean r8 = r9 instanceof java.util.Collection     // Catch:{ all -> 0x037a }
            if (r8 == 0) goto L_0x0232
            r8 = r9
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x037a }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x037a }
            if (r8 == 0) goto L_0x0232
            goto L_0x01c8
        L_0x0232:
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x037a }
        L_0x0236:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x037a }
            if (r9 == 0) goto L_0x01c8
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x037a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x037a }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)     // Catch:{ all -> 0x037a }
            java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x037a }
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r10 = r10.toLowerCase(r1)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r6)     // Catch:{ all -> 0x037a }
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)     // Catch:{ all -> 0x037a }
            r9 = r9 ^ r5
            if (r9 != 0) goto L_0x0236
            goto L_0x0379
        L_0x0261:
            java.lang.String r8 = "i_is_any"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x026b
            goto L_0x0379
        L_0x026b:
            if (r9 != 0) goto L_0x026e
            return r2
        L_0x026e:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x037a }
            boolean r8 = r9 instanceof java.util.Collection     // Catch:{ all -> 0x037a }
            if (r8 == 0) goto L_0x027f
            r8 = r9
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x037a }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x037a }
            if (r8 == 0) goto L_0x027f
            goto L_0x0379
        L_0x027f:
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x037a }
        L_0x0283:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x037a }
            if (r9 == 0) goto L_0x0379
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x037a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x037a }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)     // Catch:{ all -> 0x037a }
            java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x037a }
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r10 = r10.toLowerCase(r1)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r6)     // Catch:{ all -> 0x037a }
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)     // Catch:{ all -> 0x037a }
            if (r9 == 0) goto L_0x0283
            goto L_0x01c8
        L_0x02ad:
            java.lang.String r8 = "i_str_neq"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x02b7
            goto L_0x0379
        L_0x02b7:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)     // Catch:{ all -> 0x037a }
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0379
            goto L_0x01c8
        L_0x02d5:
            java.lang.String r8 = "contains"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x02df
            goto L_0x0379
        L_0x02df:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x037a }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x037a }
            boolean r2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r3, (boolean) r2, (int) r10, (java.lang.Object) r4)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x02ed:
            java.lang.String r8 = "is_not_any"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x032d
            goto L_0x0379
        L_0x02f7:
            java.lang.String r8 = "regex_match"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0301
            goto L_0x0379
        L_0x0301:
            kotlin.text.Regex r8 = new kotlin.text.Regex     // Catch:{ all -> 0x037a }
            r8.<init>((java.lang.String) r3)     // Catch:{ all -> 0x037a }
            java.lang.String r9 = r7.toString()     // Catch:{ all -> 0x037a }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x037a }
            boolean r2 = r8.matches(r9)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x0312:
            java.lang.String r8 = "starts_with"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x031b
            goto L_0x0379
        L_0x031b:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r8, r3, r2, r10, r4)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x0324:
            java.lang.String r8 = "not_in"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x032d
            goto L_0x0379
        L_0x032d:
            if (r9 != 0) goto L_0x0330
            return r2
        L_0x0330:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            boolean r2 = r9.contains(r8)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x0339:
            java.lang.String r8 = "is_any"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0342
            goto L_0x0379
        L_0x0342:
            if (r9 != 0) goto L_0x0345
            return r2
        L_0x0345:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            boolean r2 = r9.contains(r8)     // Catch:{ all -> 0x037a }
            goto L_0x0379
        L_0x034e:
            java.lang.String r8 = "i_not_contains"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0357
            goto L_0x0379
        L_0x0357:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)     // Catch:{ all -> 0x037a }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x037a }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x037a }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x037a }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)     // Catch:{ all -> 0x037a }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x037a }
            boolean r8 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r9, (boolean) r2, (int) r10, (java.lang.Object) r4)     // Catch:{ all -> 0x037a }
            if (r8 != 0) goto L_0x0379
            goto L_0x01c8
        L_0x0379:
            return r2
        L_0x037a:
            r8 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r8, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.MACARuleMatchingManager.stringComparison(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }

    @JvmStatic
    public static final ArrayList<String> getStringArrayList(JSONArray jSONArray) {
        Class<MACARuleMatchingManager> cls = MACARuleMatchingManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.get(i).toString());
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final boolean isMatchCCRule(String str, Bundle bundle) {
        Class<MACARuleMatchingManager> cls = MACARuleMatchingManager.class;
        if (!(CrashShieldHandler.isObjectCrashing(cls) || str == null || bundle == null)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String key = getKey(jSONObject);
                if (key == null) {
                    return false;
                }
                Object obj = jSONObject.get(key);
                int hashCode = key.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267) {
                            if (key.equals("not")) {
                                return !isMatchCCRule(obj.toString(), bundle);
                            }
                        }
                    } else if (key.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            if (!isMatchCCRule(jSONArray.get(i).toString(), bundle)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (key.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (isMatchCCRule(jSONArray2.get(i2).toString(), bundle)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return stringComparison(key, jSONObject2, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
        return false;
    }

    @JvmStatic
    public static final String getMatchPropertyIDs(Bundle bundle) {
        Class<MACARuleMatchingManager> cls = MACARuleMatchingManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            JSONArray jSONArray2 = MACARules;
            Intrinsics.checkNotNull(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            List arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray2.optString(i);
                if (optString != null) {
                    JSONObject jSONObject = new JSONObject(optString);
                    long optLong = jSONObject.optLong("id");
                    if (optLong != 0) {
                        String optString2 = jSONObject.optString("rule");
                        if (optString2 != null) {
                            if (isMatchCCRule(optString2, bundle)) {
                                arrayList.add(Long.valueOf(optLong));
                            }
                        }
                    }
                }
            }
            String jSONArray3 = new JSONArray(arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final void processParameters(Bundle bundle, String str) {
        Class<MACARuleMatchingManager> cls = MACARuleMatchingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(str, "event");
                if (enabled && bundle != null) {
                    try {
                        generateInfo(bundle, str);
                        bundle.putString("_audiencePropertyIds", getMatchPropertyIDs(bundle));
                        bundle.putString("cs_maca", "1");
                        removeGeneratedInfo(bundle);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void generateInfo(Bundle bundle, String str) {
        Class<MACARuleMatchingManager> cls = MACARuleMatchingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(bundle, NativeProtocol.WEB_DIALOG_PARAMS);
                Intrinsics.checkNotNullParameter(str, "event");
                bundle.putString("event", str);
                StringBuilder sb = new StringBuilder();
                Locale locale = Utility.INSTANCE.getLocale();
                String str2 = null;
                String language = locale != null ? locale.getLanguage() : null;
                String str3 = "";
                if (language == null) {
                    language = str3;
                }
                StringBuilder append = sb.append(language).append('_');
                Locale locale2 = Utility.INSTANCE.getLocale();
                if (locale2 != null) {
                    str2 = locale2.getCountry();
                }
                if (str2 == null) {
                    str2 = str3;
                }
                bundle.putString("_locale", append.append(str2).toString());
                String versionName = Utility.INSTANCE.getVersionName();
                if (versionName == null) {
                    versionName = str3;
                }
                bundle.putString("_appVersion", versionName);
                bundle.putString("_deviceOS", "ANDROID");
                bundle.putString("_platform", "mobile");
                String str4 = Build.MODEL;
                if (str4 == null) {
                    str4 = str3;
                }
                bundle.putString("_deviceModel", str4);
                bundle.putString("_nativeAppID", FacebookSdk.getApplicationId());
                String versionName2 = Utility.INSTANCE.getVersionName();
                if (versionName2 != null) {
                    str3 = versionName2;
                }
                bundle.putString("_nativeAppShortVersion", str3);
                bundle.putString("_timezone", Utility.INSTANCE.getDeviceTimeZoneName());
                bundle.putString("_carrier", Utility.INSTANCE.getCarrierName());
                bundle.putString("_deviceOSTypeName", "ANDROID");
                bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                bundle.putLong("_remainingDiskGB", Utility.INSTANCE.getAvailableExternalStorageGB());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void removeGeneratedInfo(Bundle bundle) {
        Class<MACARuleMatchingManager> cls = MACARuleMatchingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(bundle, NativeProtocol.WEB_DIALOG_PARAMS);
                for (String remove : keys) {
                    bundle.remove(remove);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
