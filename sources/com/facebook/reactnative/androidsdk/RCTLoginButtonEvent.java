package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;

public class RCTLoginButtonEvent extends Event<RCTLoginButtonEvent> {
    public static final String EVENT_NAME = "topChange";
    private final WritableMap mEvent;

    public String getEventName() {
        return "topChange";
    }

    public RCTLoginButtonEvent(int i, int i2, WritableMap writableMap) {
        super(i, i2);
        this.mEvent = writableMap;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        return this.mEvent;
    }
}
