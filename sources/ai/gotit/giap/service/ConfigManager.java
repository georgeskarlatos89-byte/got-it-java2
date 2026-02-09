package ai.gotit.giap.service;

import android.app.Activity;
import android.content.Context;

public class ConfigManager {
    private Context context;
    private String serverUrl;
    private String token;

    public ConfigManager() {
        this.context = null;
        this.serverUrl = null;
        this.token = null;
    }

    public ConfigManager(Context context2, String str, String str2) {
        this.context = context2;
        this.serverUrl = str;
        this.token = str2;
    }

    public static ConfigManager makeInstance(Context context2, String str, String str2) {
        return new ConfigManager(context2, str, str2);
    }

    public Context getContext() {
        return this.context;
    }

    public void setContext(Activity activity) {
        this.context = activity;
    }

    public String getServerUrl() {
        return this.serverUrl;
    }

    public void setServerUrl(String str) {
        this.serverUrl = str;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
