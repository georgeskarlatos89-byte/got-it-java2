package com.braintreepayments.api;

import android.net.Uri;
import com.brentvatne.react.ReactVideoView;
import org.json.JSONException;
import org.json.JSONObject;

class BrowserSwitchRequest {
    private final JSONObject metadata;
    private final int requestCode;
    private final String returnUrlScheme;
    private boolean shouldNotifyCancellation;
    private final Uri url;

    static BrowserSwitchRequest fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        int i = jSONObject.getInt("requestCode");
        String string = jSONObject.getString("url");
        String string2 = jSONObject.getString("returnUrlScheme");
        return new BrowserSwitchRequest(i, Uri.parse(string), jSONObject.optJSONObject(ReactVideoView.EVENT_PROP_METADATA), string2, jSONObject.optBoolean("shouldNotify", true));
    }

    BrowserSwitchRequest(int i, Uri uri, JSONObject jSONObject, String str, boolean z) {
        this.url = uri;
        this.requestCode = i;
        this.metadata = jSONObject;
        this.returnUrlScheme = str;
        this.shouldNotifyCancellation = z;
    }

    /* access modifiers changed from: package-private */
    public Uri getUrl() {
        return this.url;
    }

    /* access modifiers changed from: package-private */
    public int getRequestCode() {
        return this.requestCode;
    }

    /* access modifiers changed from: package-private */
    public JSONObject getMetadata() {
        return this.metadata;
    }

    /* access modifiers changed from: package-private */
    public boolean getShouldNotifyCancellation() {
        return this.shouldNotifyCancellation;
    }

    /* access modifiers changed from: package-private */
    public void setShouldNotifyCancellation(boolean z) {
        this.shouldNotifyCancellation = z;
    }

    /* access modifiers changed from: package-private */
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestCode", this.requestCode);
        jSONObject.put("url", this.url.toString());
        jSONObject.put("returnUrlScheme", this.returnUrlScheme);
        jSONObject.put("shouldNotify", this.shouldNotifyCancellation);
        JSONObject jSONObject2 = this.metadata;
        if (jSONObject2 != null) {
            jSONObject.put(ReactVideoView.EVENT_PROP_METADATA, jSONObject2);
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean matchesDeepLinkUrlScheme(Uri uri) {
        return uri.getScheme() != null && uri.getScheme().equalsIgnoreCase(this.returnUrlScheme);
    }
}
