package com.reactnativenavigation.react;

import com.facebook.react.bridge.Promise;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.utils.Now;

public class NativeCommandListener extends CommandListenerAdapter {
    private String commandId;
    private String commandName;
    private EventEmitter eventEmitter;
    private Now now;
    private Promise promise;

    public NativeCommandListener(String str, String str2, Promise promise2, EventEmitter eventEmitter2, Now now2) {
        this.commandName = str;
        this.commandId = str2;
        this.promise = promise2;
        this.eventEmitter = eventEmitter2;
        this.now = now2;
    }

    public void onSuccess(String str) {
        Promise promise2 = this.promise;
        if (promise2 != null) {
            promise2.resolve(str);
        }
        this.eventEmitter.emitCommandCompleted(this.commandName, this.commandId, this.now.now());
    }

    public void onError(String str) {
        Promise promise2 = this.promise;
        if (promise2 != null) {
            promise2.reject(new Throwable(str));
        }
    }
}
