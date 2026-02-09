package ai.gotit.giap.service;

import ai.gotit.giap.constant.CommonConstant;
import android.content.SharedPreferences;

public class Storage {
    private SharedPreferences pref;

    public Storage(ConfigManager configManager) {
        this.pref = configManager.getContext().getSharedPreferences(CommonConstant.SHARED_PREFERENCES_PREFIX + configManager.getToken(), 0);
    }

    public static Storage makeInstance(ConfigManager configManager) {
        return new Storage(configManager);
    }

    public void put(String str, String str2) {
        SharedPreferences.Editor edit = this.pref.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void put(String str, Boolean bool) {
        SharedPreferences.Editor edit = this.pref.edit();
        edit.putBoolean(str, bool.booleanValue());
        edit.commit();
    }

    public void put(String str, Integer num) {
        SharedPreferences.Editor edit = this.pref.edit();
        edit.putInt(str, num.intValue());
        edit.commit();
    }

    public void put(String str, Float f) {
        SharedPreferences.Editor edit = this.pref.edit();
        edit.putFloat(str, f.floatValue());
        edit.commit();
    }

    public String getString(String str) {
        if (!this.pref.contains(str)) {
            return null;
        }
        return this.pref.getString(str, (String) null);
    }

    public Boolean getBoolean(String str) {
        if (!this.pref.contains(str)) {
            return null;
        }
        return Boolean.valueOf(this.pref.getBoolean(str, false));
    }

    public Integer getInt(String str) {
        if (!this.pref.contains(str)) {
            return null;
        }
        return Integer.valueOf(this.pref.getInt(str, 0));
    }

    public Float getFloat(String str) {
        if (!this.pref.contains(str)) {
            return null;
        }
        return Float.valueOf(this.pref.getFloat(str, 0.0f));
    }

    public void remove(String str) {
        SharedPreferences.Editor edit = this.pref.edit();
        edit.remove(str);
        edit.commit();
    }
}
