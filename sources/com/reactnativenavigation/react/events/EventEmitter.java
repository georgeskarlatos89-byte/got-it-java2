package com.reactnativenavigation.react.events;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativenavigation.utils.LogKt;
import javax.annotation.Nullable;

public class EventEmitter {
    private static final String AppLaunched = "RNN.AppLaunched";
    private static final String BottomTabPressed = "RNN.BottomTabPressed";
    private static final String BottomTabSelected = "RNN.BottomTabSelected";
    private static final String CommandCompleted = "RNN.CommandCompleted";
    private static final String ComponentDidAppear = "RNN.ComponentDidAppear";
    private static final String ComponentDidDisappear = "RNN.ComponentDidDisappear";
    private static final String ComponentWillAppear = "RNN.ComponentWillAppear";
    private static final String ModalDismissed = "RNN.ModalDismissed";
    private static final String NavigationButtonPressed = "RNN.NavigationButtonPressed";
    private static final String ScreenPopped = "RNN.ScreenPopped";
    @Nullable
    private ReactContext reactContext;

    public EventEmitter(@Nullable ReactContext reactContext2) {
        this.reactContext = reactContext2;
    }

    public void appLaunched() {
        emit(AppLaunched, Arguments.createMap());
    }

    public void emitComponentDidDisappear(String str, String str2, ComponentType componentType) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("componentId", str);
        createMap.putString("componentName", str2);
        createMap.putString("componentType", componentType.getName());
        emit(ComponentDidDisappear, createMap);
    }

    public void emitComponentWillAppear(String str, String str2, ComponentType componentType) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("componentId", str);
        createMap.putString("componentName", str2);
        createMap.putString("componentType", componentType.getName());
        emit(ComponentWillAppear, createMap);
    }

    public void emitComponentDidAppear(String str, String str2, ComponentType componentType) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("componentId", str);
        createMap.putString("componentName", str2);
        createMap.putString("componentType", componentType.getName());
        emit(ComponentDidAppear, createMap);
    }

    public void emitOnNavigationButtonPressed(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("componentId", str);
        createMap.putString("buttonId", str2);
        emit(NavigationButtonPressed, createMap);
    }

    public void emitBottomTabSelected(int i, int i2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("unselectedTabIndex", i);
        createMap.putInt("selectedTabIndex", i2);
        emit(BottomTabSelected, createMap);
    }

    public void emitBottomTabPressed(int i) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("tabIndex", i);
        emit(BottomTabPressed, createMap);
    }

    public void emitCommandCompleted(String str, String str2, long j) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("commandName", str);
        createMap.putString("commandId", str2);
        createMap.putDouble("completionTime", (double) j);
        emit(CommandCompleted, createMap);
    }

    public void emitModalDismissed(String str, String str2, int i) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("componentId", str);
        createMap.putString("componentName", str2);
        createMap.putInt("modalsDismissed", i);
        emit(ModalDismissed, createMap);
    }

    public void emitScreenPoppedEvent(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("componentId", str);
        emit(ScreenPopped, createMap);
    }

    private void emit(String str, WritableMap writableMap) {
        ReactContext reactContext2 = this.reactContext;
        if (reactContext2 == null) {
            Log.e(LogKt.MAIN_LIB_TAG, "Could not send event " + str + ". React context is null!");
        } else {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext2.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }
}
