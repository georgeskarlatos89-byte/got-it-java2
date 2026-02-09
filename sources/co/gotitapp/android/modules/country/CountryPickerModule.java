package co.gotitapp.android.modules.country;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "CountryPicker")
public class CountryPickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int COUNTRY_PICKER_REQUEST_CODE = 10001;
    public static final String NAME = "CountryPicker";
    private Promise promise;

    public String getName() {
        return NAME;
    }

    public void onNewIntent(Intent intent) {
    }

    public CountryPickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Promise promise2;
        if (i == 10001 && (promise2 = this.promise) != null) {
            if (i2 == -1) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA, intent.getStringExtra(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA));
                writableNativeMap.putString(CountryPickerActivity.COUNTRY_PICKER_DIAL_CODE_EXTRA, intent.getStringExtra(CountryPickerActivity.COUNTRY_PICKER_DIAL_CODE_EXTRA));
                writableNativeMap.putString("countryName", intent.getStringExtra("name"));
                this.promise.resolve(writableNativeMap);
            } else {
                promise2.reject("E_COUNTRY_PICKER_CANCELLED", "Country picker cancelled");
            }
            this.promise = null;
        }
    }

    @ReactMethod
    public void open(String str, Promise promise2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            this.promise = promise2;
            Intent intent = new Intent(currentActivity, CountryPickerActivity.class);
            intent.putExtra("title", str);
            currentActivity.startActivityForResult(intent, 10001);
        }
    }
}
