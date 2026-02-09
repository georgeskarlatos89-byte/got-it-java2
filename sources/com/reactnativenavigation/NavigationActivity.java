package com.reactnativenavigation;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.reactnativenavigation.react.CommandListenerAdapter;
import com.reactnativenavigation.react.JsDevReloadHandler;
import com.reactnativenavigation.react.ReactGateway;
import com.reactnativenavigation.viewcontrollers.child.ChildControllersRegistry;
import com.reactnativenavigation.viewcontrollers.modal.ModalStack;
import com.reactnativenavigation.viewcontrollers.navigator.Navigator;
import com.reactnativenavigation.viewcontrollers.overlay.OverlayManager;
import com.reactnativenavigation.viewcontrollers.viewcontroller.RootPresenter;

public class NavigationActivity extends AppCompatActivity implements DefaultHardwareBackBtnHandler, PermissionAwareActivity, JsDevReloadHandler.ReloadListener {
    private OnBackPressedCallback callback;
    private PermissionListener mPermissionListener;
    protected Navigator navigator;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!isFinishing()) {
            addDefaultSplashLayout();
            Navigator navigator2 = new Navigator(this, new ChildControllersRegistry(), new ModalStack(this), new OverlayManager(), new RootPresenter());
            this.navigator = navigator2;
            navigator2.bindViews();
            getReactGateway().onActivityCreated(this);
            setBackPressedCallback();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getReactGateway().onConfigurationChanged(this, configuration);
        this.navigator.onConfigurationChanged(configuration);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.navigator.setContentLayout((ViewGroup) findViewById(16908290));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        getReactGateway().onActivityResumed(this);
    }

    public void onNewIntent(Intent intent) {
        if (!getReactGateway().onNewIntent(intent)) {
            super.onNewIntent(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        getReactGateway().onActivityPaused(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Navigator navigator2 = this.navigator;
        if (navigator2 != null) {
            navigator2.destroy();
        }
        getReactGateway().onActivityDestroyed(this);
    }

    public void invokeDefaultOnBackPressed() {
        if (!this.navigator.handleBack(new CommandListenerAdapter())) {
            this.callback.setEnabled(false);
            super.onBackPressed();
            this.callback.setEnabled(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        getReactGateway().onActivityResult(this, i, i2, intent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return getReactGateway().onKeyUp(this, i) || super.onKeyUp(i, keyEvent);
    }

    public ReactGateway getReactGateway() {
        return app().getReactGateway();
    }

    private NavigationApplication app() {
        return (NavigationApplication) getApplication();
    }

    public Navigator getNavigator() {
        return this.navigator;
    }

    public void requestPermissions(String[] strArr, int i, PermissionListener permissionListener) {
        this.mPermissionListener = permissionListener;
        requestPermissions(strArr, i);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        NavigationApplication.instance.onRequestPermissionsResult(i, strArr, iArr);
        PermissionListener permissionListener = this.mPermissionListener;
        if (permissionListener != null && permissionListener.onRequestPermissionsResult(i, strArr, iArr)) {
            this.mPermissionListener = null;
        }
    }

    public void onReload() {
        this.navigator.destroyViews();
    }

    /* access modifiers changed from: protected */
    public void addDefaultSplashLayout() {
        setContentView(new View(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCatalystInstanceDestroy$0$com-reactnativenavigation-NavigationActivity  reason: not valid java name */
    public /* synthetic */ void m961lambda$onCatalystInstanceDestroy$0$comreactnativenavigationNavigationActivity() {
        this.navigator.destroyViews();
    }

    public void onCatalystInstanceDestroy() {
        runOnUiThread(new NavigationActivity$$ExternalSyntheticLambda0(this));
    }

    private void setBackPressedCallback() {
        this.callback = new OnBackPressedCallback(true) {
            public void handleOnBackPressed() {
                NavigationActivity.this.getReactGateway().onBackPressed();
            }
        };
        getOnBackPressedDispatcher().addCallback(this, this.callback);
    }
}
