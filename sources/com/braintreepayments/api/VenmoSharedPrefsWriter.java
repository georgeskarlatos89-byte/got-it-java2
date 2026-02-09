package com.braintreepayments.api;

import android.content.Context;

class VenmoSharedPrefsWriter {
    private static final String VAULT_VENMO_KEY = "com.braintreepayments.api.Venmo.VAULT_VENMO_KEY";

    VenmoSharedPrefsWriter() {
    }

    /* access modifiers changed from: package-private */
    public void persistVenmoVaultOption(Context context, boolean z) {
        persistVenmoVaultOption(BraintreeSharedPreferences.getInstance(context), z);
    }

    /* access modifiers changed from: package-private */
    public void persistVenmoVaultOption(BraintreeSharedPreferences braintreeSharedPreferences, boolean z) {
        braintreeSharedPreferences.putBoolean(VAULT_VENMO_KEY, z);
    }

    /* access modifiers changed from: package-private */
    public boolean getVenmoVaultOption(Context context) {
        return getVenmoVaultOption(BraintreeSharedPreferences.getInstance(context));
    }

    /* access modifiers changed from: package-private */
    public boolean getVenmoVaultOption(BraintreeSharedPreferences braintreeSharedPreferences) {
        return braintreeSharedPreferences.getBoolean(VAULT_VENMO_KEY);
    }
}
