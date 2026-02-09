package com.braintreepayments.api;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.wallet.Wallet;

public class GooglePayCapabilities {
    public static boolean isGooglePayEnabled(Context context, Configuration configuration) {
        try {
            Class.forName(Wallet.class.getName());
            if (!configuration.isGooglePayEnabled() || GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }
}
