package com.braintreepayments.api;

import android.net.Uri;
import org.json.JSONObject;

public class BrowserSwitchOptions {
    private boolean launchAsNewTask;
    private JSONObject metadata;
    private int requestCode;
    private String returnUrlScheme;
    private Uri url;

    public BrowserSwitchOptions metadata(JSONObject jSONObject) {
        this.metadata = jSONObject;
        return this;
    }

    public BrowserSwitchOptions requestCode(int i) {
        this.requestCode = i;
        return this;
    }

    public BrowserSwitchOptions url(Uri uri) {
        this.url = uri;
        return this;
    }

    public BrowserSwitchOptions returnUrlScheme(String str) {
        this.returnUrlScheme = str;
        return this;
    }

    public JSONObject getMetadata() {
        return this.metadata;
    }

    public int getRequestCode() {
        return this.requestCode;
    }

    public Uri getUrl() {
        return this.url;
    }

    public String getReturnUrlScheme() {
        return this.returnUrlScheme;
    }

    public boolean isLaunchAsNewTask() {
        return this.launchAsNewTask;
    }

    public BrowserSwitchOptions launchAsNewTask(boolean z) {
        this.launchAsNewTask = z;
        return this;
    }
}
