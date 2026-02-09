package com.braintreepayments.api;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.braintreepayments.api.browserswitch.R;

public class BrowserSwitchClient {
    private final BrowserSwitchInspector browserSwitchInspector;
    private final ChromeCustomTabsInternalClient customTabsInternalClient;
    private final BrowserSwitchPersistentStore persistentStore;

    private boolean isValidRequestCode(int i) {
        return i != Integer.MIN_VALUE;
    }

    public BrowserSwitchClient() {
        this(new BrowserSwitchInspector(), BrowserSwitchPersistentStore.getInstance(), new ChromeCustomTabsInternalClient());
    }

    BrowserSwitchClient(BrowserSwitchInspector browserSwitchInspector2, BrowserSwitchPersistentStore browserSwitchPersistentStore, ChromeCustomTabsInternalClient chromeCustomTabsInternalClient) {
        this.browserSwitchInspector = browserSwitchInspector2;
        this.persistentStore = browserSwitchPersistentStore;
        this.customTabsInternalClient = chromeCustomTabsInternalClient;
    }

    public void start(FragmentActivity fragmentActivity, BrowserSwitchOptions browserSwitchOptions) throws BrowserSwitchException {
        assertCanPerformBrowserSwitch(fragmentActivity, browserSwitchOptions);
        Context applicationContext = fragmentActivity.getApplicationContext();
        Uri url = browserSwitchOptions.getUrl();
        Uri uri = url;
        this.persistentStore.putActiveRequest(new BrowserSwitchRequest(browserSwitchOptions.getRequestCode(), uri, browserSwitchOptions.getMetadata(), browserSwitchOptions.getReturnUrlScheme(), true), applicationContext);
        if (fragmentActivity.isFinishing()) {
            throw new BrowserSwitchException("Unable to start browser switch while host Activity is finishing.");
        } else if (this.browserSwitchInspector.deviceHasChromeCustomTabs(applicationContext)) {
            this.customTabsInternalClient.launchUrl(fragmentActivity, url, browserSwitchOptions.isLaunchAsNewTask());
        } else {
            try {
                fragmentActivity.startActivity(new Intent("android.intent.action.VIEW", url));
            } catch (ActivityNotFoundException unused) {
                throw new BrowserSwitchException("Unable to start browser switch without a web browser.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void assertCanPerformBrowserSwitch(FragmentActivity fragmentActivity, BrowserSwitchOptions browserSwitchOptions) throws BrowserSwitchException {
        String str;
        Context applicationContext = fragmentActivity.getApplicationContext();
        int requestCode = browserSwitchOptions.getRequestCode();
        String returnUrlScheme = browserSwitchOptions.getReturnUrlScheme();
        if (!isValidRequestCode(requestCode)) {
            str = fragmentActivity.getString(R.string.error_request_code_invalid);
        } else if (returnUrlScheme == null) {
            str = fragmentActivity.getString(R.string.error_return_url_required);
        } else {
            str = !this.browserSwitchInspector.isDeviceConfiguredForDeepLinking(applicationContext, returnUrlScheme) ? fragmentActivity.getString(R.string.error_device_not_configured_for_deep_link) : null;
        }
        if (str != null) {
            throw new BrowserSwitchException(str);
        }
    }

    public BrowserSwitchResult deliverResult(FragmentActivity fragmentActivity) {
        Context applicationContext = fragmentActivity.getApplicationContext();
        BrowserSwitchRequest activeRequest = this.persistentStore.getActiveRequest(applicationContext);
        if (activeRequest == null) {
            return null;
        }
        BrowserSwitchResult result = getResult(fragmentActivity);
        if (result == null) {
            return result;
        }
        int status = result.getStatus();
        if (status == 1) {
            this.persistentStore.clearActiveRequest(applicationContext);
            return result;
        } else if (status != 2) {
            return result;
        } else {
            activeRequest.setShouldNotifyCancellation(false);
            this.persistentStore.putActiveRequest(activeRequest, fragmentActivity);
            return result;
        }
    }

    public BrowserSwitchResult getResult(FragmentActivity fragmentActivity) {
        Intent intent = fragmentActivity.getIntent();
        BrowserSwitchRequest activeRequest = this.persistentStore.getActiveRequest(fragmentActivity.getApplicationContext());
        if (activeRequest == null || intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null && activeRequest.matchesDeepLinkUrlScheme(data)) {
            return new BrowserSwitchResult(1, activeRequest, data);
        }
        if (activeRequest.getShouldNotifyCancellation()) {
            return new BrowserSwitchResult(2, activeRequest);
        }
        return null;
    }

    public BrowserSwitchResult parseResult(Context context, int i, Intent intent) {
        BrowserSwitchRequest activeRequest;
        if (!(intent == null || intent.getData() == null || (activeRequest = this.persistentStore.getActiveRequest(context.getApplicationContext())) == null || activeRequest.getRequestCode() != i)) {
            Uri data = intent.getData();
            if (activeRequest.matchesDeepLinkUrlScheme(data)) {
                return new BrowserSwitchResult(1, activeRequest, data);
            }
        }
        return null;
    }

    public void clearActiveRequests(Context context) {
        this.persistentStore.clearActiveRequest(context.getApplicationContext());
    }

    public BrowserSwitchResult getResultFromCache(Context context) {
        return this.persistentStore.getActiveResult(context.getApplicationContext());
    }

    public BrowserSwitchResult deliverResultFromCache(Context context) {
        BrowserSwitchResult resultFromCache = getResultFromCache(context);
        if (resultFromCache != null) {
            this.persistentStore.removeAll(context.getApplicationContext());
        }
        return resultFromCache;
    }

    public void captureResult(FragmentActivity fragmentActivity) {
        Uri data;
        Intent intent = fragmentActivity.getIntent();
        BrowserSwitchRequest activeRequest = this.persistentStore.getActiveRequest(fragmentActivity.getApplicationContext());
        if (activeRequest != null && intent != null && (data = intent.getData()) != null) {
            this.persistentStore.putActiveResult(new BrowserSwitchResult(1, activeRequest, data), fragmentActivity.getApplicationContext());
        }
    }
}
