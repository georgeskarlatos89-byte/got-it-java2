package co.gotitapp.android.modules.exitApp;

import android.os.Process;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "ExitApp")
public class ExitAppModule extends ReactContextBaseJavaModule {
    public static final String NAME = "ExitApp";
    ReactApplicationContext reactContext;

    public String getName() {
        return NAME;
    }

    public ExitAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void exitApp() {
        Process.killProcess(Process.myPid());
    }

    @ReactMethod
    public void hideApp() {
        this.reactContext.getCurrentActivity().moveTaskToBack(true);
    }
}
