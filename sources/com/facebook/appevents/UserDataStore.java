package com.facebook.appevents;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.FacebookSdk;
import com.facebook.appevents.aam.MetadataRule;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0007J\b\u0010\"\u001a\u00020\u0004H\u0007J\r\u0010#\u001a\u00020\u0004H\u0001¢\u0006\u0002\b$J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0004H\u0002J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H\u0002J\u001c\u0010,\u001a\u00020!2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0016H\u0007J\u0012\u0010.\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010/H\u0007Jl\u0010.\u001a\u00020!2\b\u00100\u001a\u0004\u0018\u00010\u00042\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010:\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010/H\u0002J\u0018\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0012*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/facebook/appevents/UserDataStore;", "", "()V", "CITY", "", "COUNTRY", "DATA_SEPARATOR", "DATE_OF_BIRTH", "EMAIL", "FIRST_NAME", "GENDER", "INTERNAL_USER_DATA_KEY", "LAST_NAME", "MAX_NUM", "", "PHONE", "STATE", "TAG", "kotlin.jvm.PlatformType", "USER_DATA_KEY", "ZIP", "enabledInternalUserData", "", "getEnabledInternalUserData", "()Ljava/util/Map;", "externalHashedUserData", "Ljava/util/concurrent/ConcurrentHashMap;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "internalHashedUserData", "sharedPreferences", "Landroid/content/SharedPreferences;", "clear", "", "getAllHashedUserData", "getHashedUserData", "getHashedUserData$facebook_core_release", "initAndWait", "initStore", "maybeSHA256Hashed", "", "data", "normalizeData", "type", "setInternalUd", "ud", "setUserDataAndHash", "Landroid/os/Bundle;", "email", "firstName", "lastName", "phone", "dateOfBirth", "gender", "city", "state", "zip", "country", "updateHashUserData", "writeDataIntoCache", "key", "value", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: UserDataStore.kt */
public final class UserDataStore {
    public static final String CITY = "ct";
    public static final String COUNTRY = "country";
    private static final String DATA_SEPARATOR = ",";
    public static final String DATE_OF_BIRTH = "db";
    public static final String EMAIL = "em";
    public static final String FIRST_NAME = "fn";
    public static final String GENDER = "ge";
    public static final UserDataStore INSTANCE = new UserDataStore();
    private static final String INTERNAL_USER_DATA_KEY = "com.facebook.appevents.UserDataStore.internalUserData";
    public static final String LAST_NAME = "ln";
    private static final int MAX_NUM = 5;
    public static final String PHONE = "ph";
    public static final String STATE = "st";
    private static final String TAG = "UserDataStore";
    private static final String USER_DATA_KEY = "com.facebook.appevents.UserDataStore.userData";
    public static final String ZIP = "zp";
    private static final ConcurrentHashMap<String, String> externalHashedUserData = new ConcurrentHashMap<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static final ConcurrentHashMap<String, String> internalHashedUserData = new ConcurrentHashMap<>();
    private static SharedPreferences sharedPreferences;

    private UserDataStore() {
    }

    @JvmStatic
    public static final void initStore() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!initialized.get()) {
                    INSTANCE.initAndWait();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final void writeDataIntoCache(String str, String str2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                FacebookSdk.getExecutor().execute(new UserDataStore$$ExternalSyntheticLambda2(str, str2));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void writeDataIntoCache$lambda$0(String str, String str2) {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Intrinsics.checkNotNullParameter(str, "$key");
                Intrinsics.checkNotNullParameter(str2, "$value");
                if (!initialized.get()) {
                    INSTANCE.initAndWait();
                }
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (sharedPreferences2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                    sharedPreferences2 = null;
                }
                sharedPreferences2.edit().putString(str, str2).apply();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void setUserDataAndHash(Bundle bundle) {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(new UserDataStore$$ExternalSyntheticLambda0(bundle));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void setUserDataAndHash$lambda$1(Bundle bundle) {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!initialized.get()) {
                    Log.w(TAG, "initStore should have been called before calling setUserData");
                    INSTANCE.initAndWait();
                }
                UserDataStore userDataStore = INSTANCE;
                userDataStore.updateHashUserData(bundle);
                userDataStore.writeDataIntoCache(USER_DATA_KEY, Utility.mapToJsonStr(externalHashedUserData));
                userDataStore.writeDataIntoCache(INTERNAL_USER_DATA_KEY, Utility.mapToJsonStr(internalHashedUserData));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void setUserDataAndHash(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Bundle bundle = new Bundle();
                if (str != null) {
                    bundle.putString(EMAIL, str);
                }
                if (str2 != null) {
                    bundle.putString(FIRST_NAME, str2);
                }
                if (str3 != null) {
                    bundle.putString(LAST_NAME, str3);
                }
                if (str4 != null) {
                    bundle.putString(PHONE, str4);
                }
                if (str5 != null) {
                    bundle.putString(DATE_OF_BIRTH, str5);
                }
                if (str6 != null) {
                    bundle.putString(GENDER, str6);
                }
                if (str7 != null) {
                    bundle.putString(CITY, str7);
                }
                if (str8 != null) {
                    bundle.putString(STATE, str8);
                }
                if (str9 != null) {
                    bundle.putString(ZIP, str9);
                }
                if (str10 != null) {
                    bundle.putString("country", str10);
                }
                setUserDataAndHash(bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final void clear() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(new UserDataStore$$ExternalSyntheticLambda1());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void clear$lambda$2() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (!initialized.get()) {
                    Log.w(TAG, "initStore should have been called before calling setUserData");
                    INSTANCE.initAndWait();
                }
                externalHashedUserData.clear();
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (sharedPreferences2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                    sharedPreferences2 = null;
                }
                sharedPreferences2.edit().putString(USER_DATA_KEY, (String) null).apply();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @JvmStatic
    public static final String getHashedUserData$facebook_core_release() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                Log.w(TAG, "initStore should have been called before calling setUserID");
                INSTANCE.initAndWait();
            }
            return Utility.mapToJsonStr(externalHashedUserData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final String getAllHashedUserData() {
        Class<UserDataStore> cls = UserDataStore.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            Map hashMap = new HashMap();
            hashMap.putAll(externalHashedUserData);
            hashMap.putAll(INSTANCE.getEnabledInternalUserData());
            return Utility.mapToJsonStr(hashMap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final Map<String, String> getEnabledInternalUserData() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Map<String, String> hashMap = new HashMap<>();
            Set<String> enabledRuleNames = MetadataRule.Companion.getEnabledRuleNames();
            for (String next : internalHashedUserData.keySet()) {
                if (enabledRuleNames.contains(next)) {
                    hashMap.put(next, internalHashedUserData.get(next));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final synchronized void initAndWait() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                AtomicBoolean atomicBoolean = initialized;
                if (!atomicBoolean.get()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
                    Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
                    sharedPreferences = defaultSharedPreferences;
                    SharedPreferences sharedPreferences2 = null;
                    if (defaultSharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                        defaultSharedPreferences = null;
                    }
                    String string = defaultSharedPreferences.getString(USER_DATA_KEY, "");
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferences3 = sharedPreferences;
                    if (sharedPreferences3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                    } else {
                        sharedPreferences2 = sharedPreferences3;
                    }
                    String string2 = sharedPreferences2.getString(INTERNAL_USER_DATA_KEY, "");
                    if (string2 == null) {
                        string2 = "";
                    }
                    externalHashedUserData.putAll(Utility.jsonStrToMap(string));
                    internalHashedUserData.putAll(Utility.jsonStrToMap(string2));
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void updateHashUserData(Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(this) && bundle != null) {
            try {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        String obj2 = obj.toString();
                        if (maybeSHA256Hashed(obj2)) {
                            String lowerCase = obj2.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                            externalHashedUserData.put(str, lowerCase);
                        } else {
                            Intrinsics.checkNotNullExpressionValue(str, SDKConstants.PARAM_KEY);
                            String sha256hash = Utility.sha256hash(normalizeData(str, obj2));
                            if (sha256hash != null) {
                                externalHashedUserData.put(str, sha256hash);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r7 != null) goto L_0x00ad;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setInternalUd(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            java.lang.Class<com.facebook.appevents.UserDataStore> r0 = com.facebook.appevents.UserDataStore.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "ud"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)     // Catch:{ all -> 0x0118 }
            java.util.concurrent.atomic.AtomicBoolean r1 = initialized     // Catch:{ all -> 0x0118 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0118 }
            if (r1 != 0) goto L_0x001b
            com.facebook.appevents.UserDataStore r1 = INSTANCE     // Catch:{ all -> 0x0118 }
            r1.initAndWait()     // Catch:{ all -> 0x0118 }
        L_0x001b:
            java.util.Set r12 = r12.entrySet()     // Catch:{ all -> 0x0118 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0118 }
        L_0x0023:
            boolean r1 = r12.hasNext()     // Catch:{ all -> 0x0118 }
            if (r1 == 0) goto L_0x0108
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0118 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0118 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0118 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0118 }
            com.facebook.appevents.UserDataStore r3 = INSTANCE     // Catch:{ all -> 0x0118 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0118 }
            int r4 = r1.length()     // Catch:{ all -> 0x0118 }
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            r7 = r6
            r8 = r7
        L_0x0048:
            if (r7 > r4) goto L_0x006d
            if (r8 != 0) goto L_0x004e
            r9 = r7
            goto L_0x004f
        L_0x004e:
            r9 = r4
        L_0x004f:
            char r9 = r1.charAt(r9)     // Catch:{ all -> 0x0118 }
            r10 = 32
            int r9 = kotlin.jvm.internal.Intrinsics.compare((int) r9, (int) r10)     // Catch:{ all -> 0x0118 }
            if (r9 > 0) goto L_0x005d
            r9 = r5
            goto L_0x005e
        L_0x005d:
            r9 = r6
        L_0x005e:
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0064
            r8 = r5
            goto L_0x0048
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x0048
        L_0x0067:
            if (r9 != 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            int r4 = r4 + -1
            goto L_0x0048
        L_0x006d:
            int r4 = r4 + 1
            java.lang.CharSequence r1 = r1.subSequence(r7, r4)     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = r3.normalizeData(r2, r1)     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = com.facebook.internal.Utility.sha256hash((java.lang.String) r1)     // Catch:{ all -> 0x0118 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = internalHashedUserData     // Catch:{ all -> 0x0118 }
            boolean r4 = r3.containsKey(r2)     // Catch:{ all -> 0x0118 }
            if (r4 == 0) goto L_0x0101
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0118 }
            java.lang.String r4 = ","
            if (r3 == 0) goto L_0x00ab
            r7 = r3
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x0118 }
            kotlin.text.Regex r8 = new kotlin.text.Regex     // Catch:{ all -> 0x0118 }
            r8.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0118 }
            java.util.List r7 = r8.split(r7, r6)     // Catch:{ all -> 0x0118 }
            if (r7 == 0) goto L_0x00ab
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x0118 }
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ all -> 0x0118 }
            java.lang.Object[] r7 = r7.toArray(r8)     // Catch:{ all -> 0x0118 }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x0118 }
            if (r7 != 0) goto L_0x00ad
        L_0x00ab:
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x0118 }
        L_0x00ad:
            int r8 = r7.length     // Catch:{ all -> 0x0118 }
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r7, r8)     // Catch:{ all -> 0x0118 }
            java.util.Set r8 = kotlin.collections.SetsKt.mutableSetOf(r8)     // Catch:{ all -> 0x0118 }
            boolean r9 = r8.contains(r1)     // Catch:{ all -> 0x0118 }
            if (r9 == 0) goto L_0x00bd
            return
        L_0x00bd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r9.<init>()     // Catch:{ all -> 0x0118 }
            int r10 = r7.length     // Catch:{ all -> 0x0118 }
            if (r10 != 0) goto L_0x00c7
            r10 = r5
            goto L_0x00c8
        L_0x00c7:
            r10 = r6
        L_0x00c8:
            if (r10 == 0) goto L_0x00ce
            r9.append(r1)     // Catch:{ all -> 0x0118 }
            goto L_0x00f4
        L_0x00ce:
            int r10 = r7.length     // Catch:{ all -> 0x0118 }
            r11 = 5
            if (r10 >= r11) goto L_0x00de
            java.lang.StringBuilder r3 = r9.append(r3)     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ all -> 0x0118 }
            r3.append(r1)     // Catch:{ all -> 0x0118 }
            goto L_0x00f4
        L_0x00de:
            if (r5 >= r11) goto L_0x00ec
            r3 = r7[r5]     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r3 = r9.append(r3)     // Catch:{ all -> 0x0118 }
            r3.append(r4)     // Catch:{ all -> 0x0118 }
            int r5 = r5 + 1
            goto L_0x00de
        L_0x00ec:
            r9.append(r1)     // Catch:{ all -> 0x0118 }
            r1 = r7[r6]     // Catch:{ all -> 0x0118 }
            r8.remove(r1)     // Catch:{ all -> 0x0118 }
        L_0x00f4:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = internalHashedUserData     // Catch:{ all -> 0x0118 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x0118 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0118 }
            goto L_0x0023
        L_0x0101:
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x0118 }
            r3.put(r2, r1)     // Catch:{ all -> 0x0118 }
            goto L_0x0023
        L_0x0108:
            com.facebook.appevents.UserDataStore r12 = INSTANCE     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = "com.facebook.appevents.UserDataStore.internalUserData"
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = internalHashedUserData     // Catch:{ all -> 0x0118 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = com.facebook.internal.Utility.mapToJsonStr(r2)     // Catch:{ all -> 0x0118 }
            r12.writeDataIntoCache(r1, r2)     // Catch:{ all -> 0x0118 }
            return
        L_0x0118:
            r12 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.UserDataStore.setInternalUd(java.util.Map):void");
    }

    private final boolean maybeSHA256Hashed(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return new Regex("[A-Fa-f0-9]{64}").matches(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final String normalizeData(String str, String str2) {
        String str3;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            CharSequence charSequence = str2;
            int length = charSequence.length() - 1;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i > length) {
                    break;
                }
                boolean z2 = Intrinsics.compare((int) charSequence.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String lowerCase = charSequence.subSequence(i, length + 1).toString().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual((Object) EMAIL, (Object) str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(TAG, "Setting email failure: this is not a valid email address");
                return "";
            } else if (Intrinsics.areEqual((Object) PHONE, (Object) str)) {
                return new Regex("[^0-9]").replace((CharSequence) lowerCase, "");
            } else if (!Intrinsics.areEqual((Object) GENDER, (Object) str)) {
                return lowerCase;
            } else {
                if (lowerCase.length() > 0) {
                    str3 = lowerCase.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str3 = "";
                }
                if (!Intrinsics.areEqual((Object) "f", (Object) str3)) {
                    if (!Intrinsics.areEqual((Object) "m", (Object) str3)) {
                        Log.e(TAG, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                }
                return str3;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
