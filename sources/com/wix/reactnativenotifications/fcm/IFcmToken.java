package com.wix.reactnativenotifications.fcm;

public interface IFcmToken {
    void onAppReady();

    void onManualRefresh();

    void onNewTokenReady();
}
