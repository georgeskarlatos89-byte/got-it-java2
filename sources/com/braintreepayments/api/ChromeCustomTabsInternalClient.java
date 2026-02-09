package com.braintreepayments.api;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;

class ChromeCustomTabsInternalClient {
    private final CustomTabsIntent.Builder customTabsIntentBuilder;

    ChromeCustomTabsInternalClient() {
        this(new CustomTabsIntent.Builder());
    }

    ChromeCustomTabsInternalClient(CustomTabsIntent.Builder builder) {
        this.customTabsIntentBuilder = builder;
    }

    /* access modifiers changed from: package-private */
    public void launchUrl(Context context, Uri uri, boolean z) {
        CustomTabsIntent build = this.customTabsIntentBuilder.build();
        if (z) {
            build.intent.addFlags(268435456);
        }
        build.launchUrl(context, uri);
    }
}
