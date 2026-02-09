package co.gotitapp.android.modules.braintree;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.braintreepayments.api.DropInClient;
import com.braintreepayments.api.DropInRequest;
import com.braintreepayments.api.DropInResult;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Braintree")
public class BraintreeModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final String BRAINTREE_BAD_REQUEST_ERROR = "E_BRAINTREE_BAD_REQUEST";
    private static final String BRAINTREE_CANCELLED_ERROR = "E_BRAINTREE_CANCELLED";
    private static final int BRAINTREE_REQUEST_CODE = 10002;
    private static final String BRAINTREE_SDK_ERROR = "E_BRAINTREE_SDK";
    private static final String BRAINTREE_UNEXPECTED_ERROR = "E_BRAINTREE_UNEXPECTED";
    public static final String NAME = "Braintree";
    private Promise promise;

    public String getName() {
        return NAME;
    }

    public void onNewIntent(Intent intent) {
    }

    public BraintreeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        if (reactApplicationContext != null) {
            reactApplicationContext.addActivityEventListener(this);
        }
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Promise promise2;
        if (i == 10002 && (promise2 = this.promise) != null) {
            if (i2 == -1) {
                try {
                    DropInResult dropInResult = (DropInResult) intent.getParcelableExtra(DropInResult.EXTRA_DROP_IN_RESULT);
                    String string = dropInResult.getPaymentMethodNonce().getString();
                    String string2 = getReactApplicationContext().getString(dropInResult.getPaymentMethodType().getLocalizedName());
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("nonce", string);
                    createMap.putString("paymentMethod", string2);
                    this.promise.resolve(createMap);
                } catch (Exception e) {
                    this.promise.reject(BRAINTREE_SDK_ERROR, "Unexpected error", (Throwable) e);
                }
            } else if (i2 == 0) {
                promise2.reject(BRAINTREE_CANCELLED_ERROR, "User cancelled");
            } else {
                this.promise.reject(BRAINTREE_SDK_ERROR, "Unexpected error", (Throwable) (Exception) intent.getSerializableExtra(DropInResult.EXTRA_ERROR));
            }
            this.promise = null;
        }
    }

    @ReactMethod
    public void addPaymentMethod(String str, Promise promise2) {
        showDropIn(str, promise2);
    }

    @ReactMethod
    public void purchase(String str, String str2, double d, Promise promise2) {
        showDropIn(str, promise2);
    }

    private void showDropIn(String str, Promise promise2) {
        if (str == null || str.length() == 0) {
            promise2.reject(BRAINTREE_BAD_REQUEST_ERROR, "Token can not be empty");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise2.reject(BRAINTREE_UNEXPECTED_ERROR, "Activity not found");
            return;
        }
        this.promise = promise2;
        DropInRequest dropInRequest = new DropInRequest();
        dropInRequest.setGooglePayDisabled(true);
        new DropInClient((Context) getReactApplicationContext(), str, dropInRequest).launchDropInForResult((AppCompatActivity) currentActivity, 10002);
    }
}
