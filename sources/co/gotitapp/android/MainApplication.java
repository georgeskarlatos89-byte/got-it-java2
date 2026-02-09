package co.gotitapp.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.webkit.WebView;
import co.gotitapp.android.modules.PhotoStudyPackage;
import com.facebook.react.PackageList;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.codepush.react.CodePush;
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.react.NavigationReactNativeHost;
import java.util.ArrayList;
import java.util.List;

public class MainApplication extends NavigationApplication {
    private final ReactNativeHost mReactNativeHost = new NavigationReactNativeHost(this) {
        /* access modifiers changed from: protected */
        public String getJSMainModuleName() {
            return FirebaseAnalytics.Param.INDEX;
        }

        public boolean getUseDeveloperSupport() {
            return false;
        }

        /* access modifiers changed from: protected */
        public List<ReactPackage> getPackages() {
            ArrayList<ReactPackage> packages = new PackageList((ReactNativeHost) this).getPackages();
            packages.add(new PhotoStudyPackage());
            return packages;
        }

        /* access modifiers changed from: protected */
        public String getJSBundleFile() {
            return CodePush.getJSBundleFile();
        }
    };

    private static void initializeFlipper(Context context, ReactInstanceManager reactInstanceManager) {
    }

    public ReactNativeHost getReactNativeHost() {
        return this.mReactNativeHost;
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT < 34 || getApplicationInfo().targetSdkVersion < 34) {
            return super.registerReceiver(broadcastReceiver, intentFilter);
        }
        return super.registerReceiver(broadcastReceiver, intentFilter, 2);
    }

    public void onCreate() {
        super.onCreate();
        WebView.setWebContentsDebuggingEnabled(false);
        initializeFlipper(this, getReactNativeHost().getReactInstanceManager());
    }
}
