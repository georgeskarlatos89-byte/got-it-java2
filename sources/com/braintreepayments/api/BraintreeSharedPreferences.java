package com.braintreepayments.api;

import android.content.Context;
import android.content.SharedPreferences;

class BraintreeSharedPreferences {
    private static volatile BraintreeSharedPreferences INSTANCE = null;
    private static final String PREFERENCES_FILE_KEY = "com.braintreepayments.api.SHARED_PREFERENCES";
    private final SharedPreferences sharedPreferences;

    static BraintreeSharedPreferences getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (BraintreeSharedPreferences.class) {
                if (INSTANCE == null) {
                    INSTANCE = new BraintreeSharedPreferences(createSharedPreferencesInstance(context));
                }
            }
        }
        return INSTANCE;
    }

    private static SharedPreferences createSharedPreferencesInstance(Context context) {
        return context.getSharedPreferences(PREFERENCES_FILE_KEY, 0);
    }

    BraintreeSharedPreferences(SharedPreferences sharedPreferences2) {
        this.sharedPreferences = sharedPreferences2;
    }

    /* access modifiers changed from: package-private */
    public String getString(String str, String str2) {
        return this.sharedPreferences.getString(str, str2);
    }

    /* access modifiers changed from: package-private */
    public void putString(String str, String str2) {
        this.sharedPreferences.edit().putString(str, str2).apply();
    }

    /* access modifiers changed from: package-private */
    public boolean getBoolean(String str) {
        return this.sharedPreferences.getBoolean(str, false);
    }

    /* access modifiers changed from: package-private */
    public void putBoolean(String str, boolean z) {
        this.sharedPreferences.edit().putBoolean(str, z).apply();
    }

    /* access modifiers changed from: package-private */
    public boolean containsKey(String str) {
        return this.sharedPreferences.contains(str);
    }

    /* access modifiers changed from: package-private */
    public long getLong(String str) {
        return this.sharedPreferences.getLong(str, 0);
    }

    /* access modifiers changed from: package-private */
    public void putStringAndLong(String str, String str2, String str3, long j) {
        this.sharedPreferences.edit().putString(str, str2).putLong(str3, j).apply();
    }

    /* access modifiers changed from: package-private */
    public void clearSharedPreferences() {
        this.sharedPreferences.edit().clear().apply();
    }
}
