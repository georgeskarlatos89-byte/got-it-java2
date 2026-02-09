package ai.gotit.giap.service;

import ai.gotit.giap.constant.CommonProps;
import ai.gotit.giap.constant.Operation;
import ai.gotit.giap.util.Logger;
import android.net.Uri;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkManager {
    /* access modifiers changed from: private */
    public ConfigManager configManager;
    private RequestQueue requestQueue;

    public NetworkManager(ConfigManager configManager2) {
        this.configManager = configManager2;
        this.requestQueue = Volley.newRequestQueue(configManager2.getContext());
    }

    NetworkManager(ConfigManager configManager2, BaseHttpStack baseHttpStack) {
        this.configManager = configManager2;
        this.requestQueue = Volley.newRequestQueue(configManager2.getContext(), baseHttpStack);
    }

    public static NetworkManager makeInstance(ConfigManager configManager2) {
        return new NetworkManager(configManager2);
    }

    private void initializeSSLContext() {
        try {
            SSLContext.getInstance("TLSv1.2");
        } catch (NoSuchAlgorithmException e) {
            Logger.error((Throwable) e);
        }
        try {
            ProviderInstaller.installIfNeeded(this.configManager.getContext().getApplicationContext().getApplicationContext());
        } catch (GooglePlayServicesRepairableException e2) {
            Logger.error((Throwable) e2);
        } catch (GooglePlayServicesNotAvailableException e3) {
            Logger.error((Throwable) e3);
        }
    }

    /* access modifiers changed from: package-private */
    public void request(int i, String str, Map<String, String> map, JSONObject jSONObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        initializeSSLContext();
        Uri.Builder builder = new Uri.Builder();
        String serverUrl = this.configManager.getServerUrl();
        if (!serverUrl.startsWith("http")) {
            builder.scheme("https");
            builder.encodedAuthority(serverUrl);
        } else {
            builder.encodedPath(serverUrl);
        }
        builder.appendEncodedPath(str);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                builder.appendQueryParameter((String) next.getKey(), (String) next.getValue());
            }
        }
        final int i2 = i;
        AnonymousClass1 r0 = new JsonObjectRequest(i, builder.build().toString(), jSONObject, listener, errorListener) {
            public Map<String, String> getHeaders() {
                HashMap hashMap = new HashMap();
                hashMap.put("Authorization", "Bearer " + NetworkManager.this.configManager.getToken());
                if (i2 != 0) {
                    hashMap.put("Content-Type", "application/json");
                }
                return hashMap;
            }
        };
        this.requestQueue.add(r0);
        Logger.log("REQUEST: sent a request - " + r0.getMethod() + " " + r0.getUrl() + (jSONObject != null ? " - " + jSONObject.toString() : ""));
    }

    public void track(JSONArray jSONArray, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("events", jSONArray);
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
        request(1, "events", (Map<String, String>) null, jSONObject, listener, errorListener);
    }

    public void alias(JSONObject jSONObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        request(1, "alias", (Map<String, String>) null, jSONObject, listener, errorListener);
    }

    public void identify(String str, String str2, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        HashMap hashMap = new HashMap();
        hashMap.put(CommonProps.CURRENT_DISTINCT_ID, str2);
        request(0, "alias/" + str, hashMap, (JSONObject) null, listener, errorListener);
    }

    public void updateProfile(JSONObject jSONObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        JSONObject jSONObject2;
        String str;
        String str2 = null;
        try {
            str = jSONObject.getString(CommonProps.CURRENT_DISTINCT_ID);
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
                try {
                    jSONObject2.remove(CommonProps.CURRENT_DISTINCT_ID);
                } catch (JSONException e) {
                    e = e;
                }
            } catch (JSONException e2) {
                e = e2;
                jSONObject2 = null;
                str2 = str;
                Logger.error((Throwable) e);
                str = str2;
                request(2, "profiles/" + str, (Map<String, String>) null, jSONObject2, listener, errorListener);
            }
        } catch (JSONException e3) {
            e = e3;
            jSONObject2 = null;
            Logger.error((Throwable) e);
            str = str2;
            request(2, "profiles/" + str, (Map<String, String>) null, jSONObject2, listener, errorListener);
        }
        request(2, "profiles/" + str, (Map<String, String>) null, jSONObject2, listener, errorListener);
    }

    public <T> void increaseProperty(String str, String str2, T t, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        String str3 = "profiles/" + str + "/" + str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operation", Operation.INCREASE);
            jSONObject.put("value", t);
            request(2, str3, (Map<String, String>) null, jSONObject, listener, errorListener);
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }

    public void appendToProperty(String str, String str2, JSONArray jSONArray, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        String str3 = "profiles/" + str + "/" + str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operation", Operation.APPEND);
            jSONObject.put("value", jSONArray);
            request(2, str3, (Map<String, String>) null, jSONObject, listener, errorListener);
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }

    public void removeFromProperty(String str, String str2, JSONArray jSONArray, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        String str3 = "profiles/" + str + "/" + str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operation", Operation.REMOVE);
            jSONObject.put("value", jSONArray);
            request(2, str3, (Map<String, String>) null, jSONObject, listener, errorListener);
        } catch (JSONException e) {
            Logger.error((Throwable) e);
        }
    }
}
