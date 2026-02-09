package com.gaspardbruno.staticsafeareainsets;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import java.util.HashMap;
import java.util.Map;

public class RNStaticSafeAreaInsetsModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public String getName() {
        return "RNStaticSafeAreaInsets";
    }

    public RNStaticSafeAreaInsetsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    public Map<String, Object> getConstants() {
        return _getSafeAreaInsets();
    }

    private Map<String, Object> _getSafeAreaInsets() {
        HashMap hashMap = new HashMap();
        Activity currentActivity = getCurrentActivity();
        Float valueOf = Float.valueOf(0.0f);
        if (currentActivity != null) {
            View decorView = getCurrentActivity().getWindow().getDecorView();
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            Boolean valueOf2 = Boolean.valueOf((decorView.getSystemUiVisibility() & 2048) == 2048);
            if (rootWindowInsets == null || !valueOf2.booleanValue()) {
                hashMap.put("safeAreaInsetsTop", valueOf);
                hashMap.put("safeAreaInsetsBottom", valueOf);
                hashMap.put("safeAreaInsetsLeft", valueOf);
                hashMap.put("safeAreaInsetsRight", valueOf);
            } else if (Build.VERSION.SDK_INT >= 30) {
                Insets insets = rootWindowInsets.getInsets(WindowInsets.Type.systemGestures());
                hashMap.put("safeAreaInsetsTop", Float.valueOf((float) insets.top));
                hashMap.put("safeAreaInsetsBottom", Float.valueOf((float) insets.bottom));
                hashMap.put("safeAreaInsetsLeft", Float.valueOf((float) insets.left));
                hashMap.put("safeAreaInsetsRight", Float.valueOf((float) insets.right));
            } else {
                hashMap.put("safeAreaInsetsTop", Float.valueOf(PixelUtil.toDIPFromPixel((float) rootWindowInsets.getSystemWindowInsetTop())));
                hashMap.put("safeAreaInsetsBottom", Float.valueOf(PixelUtil.toDIPFromPixel((float) rootWindowInsets.getSystemWindowInsetBottom())));
                hashMap.put("safeAreaInsetsLeft", Float.valueOf(PixelUtil.toDIPFromPixel((float) rootWindowInsets.getSystemWindowInsetLeft())));
                hashMap.put("safeAreaInsetsRight", Float.valueOf(PixelUtil.toDIPFromPixel((float) rootWindowInsets.getSystemWindowInsetRight())));
            }
        } else {
            hashMap.put("safeAreaInsetsTop", valueOf);
            hashMap.put("safeAreaInsetsBottom", valueOf);
            hashMap.put("safeAreaInsetsLeft", valueOf);
            hashMap.put("safeAreaInsetsRight", valueOf);
        }
        return hashMap;
    }

    @ReactMethod
    public void getSafeAreaInsets(Callback callback) {
        Map<String, Object> _getSafeAreaInsets = _getSafeAreaInsets();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("safeAreaInsetsTop", ((Float) _getSafeAreaInsets.get("safeAreaInsetsTop")).intValue());
        writableNativeMap.putInt("safeAreaInsetsBottom", ((Float) _getSafeAreaInsets.get("safeAreaInsetsBottom")).intValue());
        writableNativeMap.putInt("safeAreaInsetsLeft", ((Float) _getSafeAreaInsets.get("safeAreaInsetsLeft")).intValue());
        writableNativeMap.putInt("safeAreaInsetsRight", ((Float) _getSafeAreaInsets.get("safeAreaInsetsRight")).intValue());
        callback.invoke(writableNativeMap);
    }
}
