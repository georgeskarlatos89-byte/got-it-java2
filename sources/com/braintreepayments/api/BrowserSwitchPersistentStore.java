package com.braintreepayments.api;

import android.content.Context;
import android.util.Log;
import java.util.Arrays;
import org.json.JSONException;

class BrowserSwitchPersistentStore {
    private static final BrowserSwitchPersistentStore INSTANCE = new BrowserSwitchPersistentStore();
    static final String REQUEST_KEY = "browserSwitch.request";
    static final String RESULT_KEY = "browserSwitch.result";
    private static final String TAG = "BrowserSwitch";

    static BrowserSwitchPersistentStore getInstance() {
        return INSTANCE;
    }

    private BrowserSwitchPersistentStore() {
    }

    /* access modifiers changed from: package-private */
    public BrowserSwitchRequest getActiveRequest(Context context) {
        String str = PersistentStore.get(REQUEST_KEY, context);
        if (str != null) {
            try {
                return BrowserSwitchRequest.fromJson(str);
            } catch (JSONException e) {
                Log.d(TAG, e.getMessage());
                Log.d(TAG, Arrays.toString(e.getStackTrace()));
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void putActiveRequest(BrowserSwitchRequest browserSwitchRequest, Context context) {
        try {
            PersistentStore.put(REQUEST_KEY, browserSwitchRequest.toJson(), context);
        } catch (JSONException e) {
            Log.d(TAG, e.getMessage());
            Log.d(TAG, Arrays.toString(e.getStackTrace()));
        }
    }

    /* access modifiers changed from: package-private */
    public void putActiveResult(BrowserSwitchResult browserSwitchResult, Context context) {
        try {
            PersistentStore.put(RESULT_KEY, browserSwitchResult.toJson(), context);
        } catch (JSONException e) {
            Log.d(TAG, e.getMessage());
            Log.d(TAG, Arrays.toString(e.getStackTrace()));
        }
    }

    /* access modifiers changed from: package-private */
    public BrowserSwitchResult getActiveResult(Context context) {
        String str = PersistentStore.get(RESULT_KEY, context);
        if (str != null) {
            try {
                return BrowserSwitchResult.fromJson(str);
            } catch (JSONException e) {
                Log.d(TAG, e.getMessage());
                Log.d(TAG, Arrays.toString(e.getStackTrace()));
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void clearActiveRequest(Context context) {
        PersistentStore.remove(REQUEST_KEY, context);
    }

    /* access modifiers changed from: package-private */
    public void removeAll(Context context) {
        PersistentStore.remove(RESULT_KEY, context);
        PersistentStore.remove(REQUEST_KEY, context);
    }
}
