package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import co.gotitapp.android.R;
import co.gotitapp.giap.GotItAnalyticsPackage;
import com.RNAppleAuthentication.AppleAuthenticationAndroidPackage;
import com.airbnb.android.react.lottie.LottiePackage;
import com.brentvatne.react.ReactVideoPackage;
import com.chirag.RNMail.RNMail;
import com.dooboolab.rniap.RNIapPackage;
import com.dylanvann.fastimage.FastImageViewPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.gaspardbruno.staticsafeareainsets.RNStaticSafeAreaInsetsPackage;
import com.horcrux.svg.SvgPackage;
import com.imagepicker.ImagePickerPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.lugg.ReactNativeConfig.ReactNativeConfigPackage;
import com.microsoft.codepush.react.CodePush;
import com.mrousavy.camera.CameraPackage;
import com.ocetnik.timer.BackgroundTimerPackage;
import com.reactnative.ivpusic.imagepicker.PickerPackage;
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
import com.reactnativecommunity.netinfo.NetInfoPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.reactnativedocumentpicker.DocumentPickerPackage;
import com.reactnativenavigation.react.NavigationPackage;
import com.reactnativerate.RNRatePackage;
import com.rnfs.RNFSPackage;
import com.tkporter.sendsms.SendSMSPackage;
import com.wix.reactnativenotifications.RNNotificationsPackage;
import com.zmxv.RNSound.RNSoundPackage;
import com.zoontek.rnlocalize.RNLocalizePackage;
import com.zoontek.rnpermissions.RNPermissionsPackage;
import fr.bamlab.rnimageresizer.ImageResizerPackage;
import io.invertase.firebase.analytics.ReactNativeFirebaseAnalyticsPackage;
import io.invertase.firebase.app.ReactNativeFirebaseAppPackage;
import io.sentry.react.RNSentryPackage;
import java.util.ArrayList;
import java.util.Arrays;

public class PackageList {
    private Application application;
    private MainPackageConfig mConfig;
    private ReactNativeHost reactNativeHost;

    public PackageList(ReactNativeHost reactNativeHost2) {
        this(reactNativeHost2, (MainPackageConfig) null);
    }

    public PackageList(Application application2) {
        this(application2, (MainPackageConfig) null);
    }

    public PackageList(ReactNativeHost reactNativeHost2, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = reactNativeHost2;
        this.mConfig = mainPackageConfig;
    }

    public PackageList(Application application2, MainPackageConfig mainPackageConfig) {
        this.reactNativeHost = null;
        this.application = application2;
        this.mConfig = mainPackageConfig;
    }

    private ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    private Resources getResources() {
        return getApplication().getResources();
    }

    private Application getApplication() {
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 == null) {
            return this.application;
        }
        return reactNativeHost2.getApplication();
    }

    private Context getApplicationContext() {
        return getApplication().getApplicationContext();
    }

    public ArrayList<ReactPackage> getPackages() {
        return new ArrayList<>(Arrays.asList(new ReactPackage[]{new MainReactPackage(this.mConfig), new AppleAuthenticationAndroidPackage(), new AsyncStoragePackage(), new NetInfoPackage(), new ReactNativeFirebaseAnalyticsPackage(), new ReactNativeFirebaseAppPackage(), new RNSentryPackage(), new LottiePackage(), new BackgroundTimerPackage(), new CodePush(getResources().getString(R.string.CodePushDeploymentKey), getApplicationContext(), false), new ReactNativeConfigPackage(), new RNDeviceInfo(), new DocumentPickerPackage(), new FastImageViewPackage(), new FBSDKPackage(), new RNFSPackage(), new GotItAnalyticsPackage(), new RNIapPackage(), new PickerPackage(), new ImagePickerPackage(), new ImageResizerPackage(), new RNLocalizePackage(), new RNMail(), new NavigationPackage(this.reactNativeHost), new RNNotificationsPackage(this.reactNativeHost.getApplication()), new RNPermissionsPackage(), new RNRatePackage(), new SendSMSPackage(), new RNSoundPackage(), new RNStaticSafeAreaInsetsPackage(), new SvgPackage(), new ReactVideoPackage(), new CameraPackage(), new RNCWebViewPackage()}));
    }
}
