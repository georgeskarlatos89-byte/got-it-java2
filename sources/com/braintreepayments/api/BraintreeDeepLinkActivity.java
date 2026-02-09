package com.braintreepayments.api;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/BraintreeDeepLinkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "browserSwitchClient", "Lcom/braintreepayments/api/BrowserSwitchClient;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeDeepLinkActivity.kt */
public final class BraintreeDeepLinkActivity extends AppCompatActivity {
    private final BrowserSwitchClient browserSwitchClient = new BrowserSwitchClient();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.browserSwitchClient.captureResult(this);
        finish();
    }
}
