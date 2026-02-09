package com.braintreepayments.api;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

public class BrowserSwitchResult {
    private static final String KEY_BROWSER_SWITCH_REQUEST = "browserSwitchRequest";
    private static final String KEY_DEEP_LINK_URL = "deepLinkUrl";
    private static final String KEY_STATUS = "status";
    private final Uri deepLinkUrl;
    private final BrowserSwitchRequest request;
    private final int status;

    static BrowserSwitchResult fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new BrowserSwitchResult(jSONObject.getInt("status"), BrowserSwitchRequest.fromJson(jSONObject.getString(KEY_BROWSER_SWITCH_REQUEST)), Uri.parse(jSONObject.getString(KEY_DEEP_LINK_URL)));
    }

    BrowserSwitchResult(int i, BrowserSwitchRequest browserSwitchRequest) {
        this(i, browserSwitchRequest, (Uri) null);
    }

    BrowserSwitchResult(int i, BrowserSwitchRequest browserSwitchRequest, Uri uri) {
        this.status = i;
        this.request = browserSwitchRequest;
        this.deepLinkUrl = uri;
    }

    public int getStatus() {
        return this.status;
    }

    public JSONObject getRequestMetadata() {
        return this.request.getMetadata();
    }

    public int getRequestCode() {
        return this.request.getRequestCode();
    }

    public Uri getRequestUrl() {
        return this.request.getUrl();
    }

    public Uri getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", this.status);
        jSONObject.put(KEY_DEEP_LINK_URL, this.deepLinkUrl.toString());
        jSONObject.put(KEY_BROWSER_SWITCH_REQUEST, this.request.toJson());
        return jSONObject.toString();
    }
}
