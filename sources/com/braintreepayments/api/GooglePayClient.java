package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.braintreepayments.api.googlepay.R;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.PaymentsClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lib.android.paypal.com.magnessdk.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GooglePayClient {
    private static final String AMEX_NETWORK = "amex";
    private static final String CARD_PAYMENT_TYPE = "CARD";
    private static final String DISCOVER_NETWORK = "discover";
    private static final String ELO_NETWORK = "elo";
    protected static final String EXTRA_ENVIRONMENT = "com.braintreepayments.api.EXTRA_ENVIRONMENT";
    protected static final String EXTRA_PAYMENT_DATA_REQUEST = "com.braintreepayments.api.EXTRA_PAYMENT_DATA_REQUEST";
    private static final String MASTERCARD_NETWORK = "mastercard";
    private static final String PAYPAL_PAYMENT_TYPE = "PAYPAL";
    private static final String VISA_NETWORK = "visa";
    /* access modifiers changed from: private */
    public final BraintreeClient braintreeClient;
    /* access modifiers changed from: private */
    public final GooglePayInternalClient internalGooglePayClient;
    /* access modifiers changed from: private */
    public GooglePayListener listener;
    GooglePayLifecycleObserver observer;

    public GooglePayClient(FragmentActivity fragmentActivity, BraintreeClient braintreeClient2) {
        this(fragmentActivity, fragmentActivity.getLifecycle(), braintreeClient2, new GooglePayInternalClient());
    }

    public GooglePayClient(Fragment fragment, BraintreeClient braintreeClient2) {
        this(fragment.requireActivity(), fragment.getLifecycle(), braintreeClient2, new GooglePayInternalClient());
    }

    @Deprecated
    public GooglePayClient(BraintreeClient braintreeClient2) {
        this((FragmentActivity) null, (Lifecycle) null, braintreeClient2, new GooglePayInternalClient());
    }

    GooglePayClient(FragmentActivity fragmentActivity, Lifecycle lifecycle, BraintreeClient braintreeClient2, GooglePayInternalClient googlePayInternalClient) {
        this.braintreeClient = braintreeClient2;
        this.internalGooglePayClient = googlePayInternalClient;
        if (fragmentActivity != null && lifecycle != null) {
            GooglePayLifecycleObserver googlePayLifecycleObserver = new GooglePayLifecycleObserver(fragmentActivity.getActivityResultRegistry(), this);
            this.observer = googlePayLifecycleObserver;
            lifecycle.addObserver(googlePayLifecycleObserver);
        }
    }

    public void setListener(GooglePayListener googlePayListener) {
        this.listener = googlePayListener;
    }

    public void isReadyToPay(FragmentActivity fragmentActivity, GooglePayIsReadyToPayCallback googlePayIsReadyToPayCallback) {
        isReadyToPay(fragmentActivity, (ReadyForGooglePayRequest) null, googlePayIsReadyToPayCallback);
    }

    @Deprecated
    public void isReadyToPay(FragmentActivity fragmentActivity, ReadyForGooglePayRequest readyForGooglePayRequest, GooglePayIsReadyToPayCallback googlePayIsReadyToPayCallback) {
        isReadyToPay(fragmentActivity != null ? fragmentActivity.getApplicationContext() : null, readyForGooglePayRequest, googlePayIsReadyToPayCallback);
    }

    public void isReadyToPay(final Context context, final ReadyForGooglePayRequest readyForGooglePayRequest, final GooglePayIsReadyToPayCallback googlePayIsReadyToPayCallback) {
        try {
            Class.forName(PaymentsClient.class.getName());
            this.braintreeClient.getConfiguration(new ConfigurationCallback() {
                public void onResult(Configuration configuration, Exception exc) {
                    if (configuration == null) {
                        googlePayIsReadyToPayCallback.onResult(false, exc);
                    } else if (!configuration.isGooglePayEnabled()) {
                        googlePayIsReadyToPayCallback.onResult(false, (Exception) null);
                    } else if (context == null) {
                        googlePayIsReadyToPayCallback.onResult(false, new IllegalArgumentException("Context cannot be null."));
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(new JSONObject().put("type", GooglePayClient.CARD_PAYMENT_TYPE).put("parameters", new JSONObject().put("allowedAuthMethods", new JSONArray().put("PAN_ONLY").put("CRYPTOGRAM_3DS")).put("allowedCardNetworks", GooglePayClient.this.buildCardNetworks(configuration)))));
                            ReadyForGooglePayRequest readyForGooglePayRequest = readyForGooglePayRequest;
                            if (readyForGooglePayRequest != null) {
                                jSONObject.put("existingPaymentMethodRequired", readyForGooglePayRequest.isExistingPaymentMethodRequired());
                            }
                        } catch (JSONException unused) {
                        }
                        GooglePayClient.this.internalGooglePayClient.isReadyToPay(context, configuration, IsReadyToPayRequest.fromJson(jSONObject.toString()), googlePayIsReadyToPayCallback);
                    }
                }
            });
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            googlePayIsReadyToPayCallback.onResult(false, (Exception) null);
        }
    }

    public void getTokenizationParameters(final GooglePayGetTokenizationParametersCallback googlePayGetTokenizationParametersCallback) {
        this.braintreeClient.getAuthorization(new AuthorizationCallback() {
            public void onAuthorizationResult(final Authorization authorization, Exception exc) {
                if (authorization != null) {
                    GooglePayClient.this.braintreeClient.getConfiguration(new ConfigurationCallback() {
                        public void onResult(Configuration configuration, Exception exc) {
                            if (configuration == null) {
                                googlePayGetTokenizationParametersCallback.onResult((PaymentMethodTokenizationParameters) null, (Collection<Integer>) null);
                            } else {
                                googlePayGetTokenizationParametersCallback.onResult(GooglePayClient.this.getTokenizationParameters(configuration, authorization), GooglePayClient.this.getAllowedCardNetworks(configuration));
                            }
                        }
                    });
                } else {
                    googlePayGetTokenizationParametersCallback.onResult((PaymentMethodTokenizationParameters) null, (Collection<Integer>) null);
                }
            }
        });
    }

    public void requestPayment(FragmentActivity fragmentActivity, GooglePayRequest googlePayRequest) {
        requestPayment(fragmentActivity, googlePayRequest, new GooglePayRequestPaymentCallback() {
            public void onResult(Exception exc) {
                if (exc != null) {
                    GooglePayClient.this.listener.onGooglePayFailure(exc);
                }
            }
        });
    }

    @Deprecated
    public void requestPayment(final FragmentActivity fragmentActivity, final GooglePayRequest googlePayRequest, final GooglePayRequestPaymentCallback googlePayRequestPaymentCallback) {
        this.braintreeClient.sendAnalyticsEvent("google-payment.selected");
        if (!validateManifest()) {
            googlePayRequestPaymentCallback.onResult(new BraintreeException("GooglePayActivity was not found in the Android manifest, or did not have a theme of R.style.bt_transparent_activity"));
            this.braintreeClient.sendAnalyticsEvent("google-payment.failed");
        } else if (googlePayRequest == null) {
            googlePayRequestPaymentCallback.onResult(new BraintreeException("Cannot pass null GooglePayRequest to requestPayment"));
            this.braintreeClient.sendAnalyticsEvent("google-payment.failed");
        } else if (googlePayRequest.getTransactionInfo() == null) {
            googlePayRequestPaymentCallback.onResult(new BraintreeException("Cannot pass null TransactionInfo to requestPayment"));
            this.braintreeClient.sendAnalyticsEvent("google-payment.failed");
        } else {
            this.braintreeClient.getAuthorization(new AuthorizationCallback() {
                public void onAuthorizationResult(final Authorization authorization, Exception exc) {
                    if (authorization != null) {
                        GooglePayClient.this.braintreeClient.getConfiguration(new ConfigurationCallback() {
                            public void onResult(Configuration configuration, Exception exc) {
                                if (configuration == null) {
                                    googlePayRequestPaymentCallback.onResult(exc);
                                } else if (!configuration.isGooglePayEnabled()) {
                                    googlePayRequestPaymentCallback.onResult(new BraintreeException("Google Pay is not enabled for your Braintree account, or Google Play Services are not configured correctly."));
                                } else {
                                    GooglePayClient.this.setGooglePayRequestDefaults(configuration, authorization, googlePayRequest);
                                    GooglePayClient.this.braintreeClient.sendAnalyticsEvent("google-payment.started");
                                    PaymentDataRequest fromJson = PaymentDataRequest.fromJson(googlePayRequest.toJson());
                                    if (GooglePayClient.this.observer != null) {
                                        GooglePayClient.this.observer.launch(new GooglePayIntentData(GooglePayClient.this.getGooglePayEnvironment(configuration), fromJson));
                                        return;
                                    }
                                    fragmentActivity.startActivityForResult(new Intent(fragmentActivity, GooglePayActivity.class).putExtra(GooglePayClient.EXTRA_ENVIRONMENT, GooglePayClient.this.getGooglePayEnvironment(configuration)).putExtra(GooglePayClient.EXTRA_PAYMENT_DATA_REQUEST, fromJson), 13593);
                                }
                            }
                        });
                    } else {
                        googlePayRequestPaymentCallback.onResult(exc);
                    }
                }
            });
        }
    }

    public void tokenize(PaymentData paymentData, GooglePayOnActivityResultCallback googlePayOnActivityResultCallback) {
        try {
            googlePayOnActivityResultCallback.onResult(GooglePayCardNonce.fromJSON(new JSONObject(paymentData.toJson())), (Exception) null);
            this.braintreeClient.sendAnalyticsEvent("google-payment.nonce-received");
        } catch (NullPointerException | JSONException unused) {
            this.braintreeClient.sendAnalyticsEvent("google-payment.failed");
            try {
                googlePayOnActivityResultCallback.onResult((PaymentMethodNonce) null, ErrorWithResponse.fromJson(new JSONObject(paymentData.toJson()).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token")));
            } catch (NullPointerException | JSONException e) {
                googlePayOnActivityResultCallback.onResult((PaymentMethodNonce) null, e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onGooglePayResult(GooglePayResult googlePayResult) {
        if (googlePayResult.getPaymentData() != null) {
            this.braintreeClient.sendAnalyticsEvent("google-payment.authorized");
            tokenize(googlePayResult.getPaymentData(), new GooglePayOnActivityResultCallback() {
                public void onResult(PaymentMethodNonce paymentMethodNonce, Exception exc) {
                    if (paymentMethodNonce != null) {
                        GooglePayClient.this.listener.onGooglePaySuccess(paymentMethodNonce);
                    } else if (exc != null) {
                        GooglePayClient.this.listener.onGooglePayFailure(exc);
                    }
                }
            });
        } else if (googlePayResult.getError() != null) {
            if (googlePayResult.getError() instanceof UserCanceledException) {
                this.braintreeClient.sendAnalyticsEvent("google-payment.canceled");
            } else {
                this.braintreeClient.sendAnalyticsEvent("google-payment.failed");
            }
            this.listener.onGooglePayFailure(googlePayResult.getError());
        }
    }

    @Deprecated
    public void onActivityResult(int i, Intent intent, GooglePayOnActivityResultCallback googlePayOnActivityResultCallback) {
        if (i == -1) {
            this.braintreeClient.sendAnalyticsEvent("google-payment.authorized");
            tokenize(PaymentData.getFromIntent(intent), googlePayOnActivityResultCallback);
        } else if (i == 1) {
            this.braintreeClient.sendAnalyticsEvent("google-payment.failed");
            googlePayOnActivityResultCallback.onResult((PaymentMethodNonce) null, new GooglePayException("An error was encountered during the Google Pay flow. See the status object in this exception for more details.", AutoResolveHelper.getStatusFromIntent(intent)));
        } else if (i == 0) {
            this.braintreeClient.sendAnalyticsEvent("google-payment.canceled");
            googlePayOnActivityResultCallback.onResult((PaymentMethodNonce) null, new UserCanceledException("User canceled Google Pay.", true));
        }
    }

    /* access modifiers changed from: package-private */
    public int getGooglePayEnvironment(Configuration configuration) {
        return a.d.equals(configuration.getGooglePayEnvironment()) ? 1 : 3;
    }

    /* access modifiers changed from: package-private */
    public PaymentMethodTokenizationParameters getTokenizationParameters(Configuration configuration, Authorization authorization) {
        String str;
        JSONObject build = new MetadataBuilder().integration(this.braintreeClient.getIntegrationType()).sessionId(this.braintreeClient.getSessionId()).version().build();
        try {
            str = build.getString("version");
        } catch (JSONException unused) {
            str = "4.45.0";
        }
        PaymentMethodTokenizationParameters.Builder addParameter = PaymentMethodTokenizationParameters.newBuilder().setPaymentMethodTokenizationType(1).addParameter("gateway", "braintree").addParameter("braintree:merchantId", configuration.getMerchantId()).addParameter("braintree:authorizationFingerprint", configuration.getGooglePayAuthorizationFingerprint()).addParameter("braintree:apiVersion", "v1").addParameter("braintree:sdkVersion", str).addParameter("braintree:metadata", build.toString());
        if (authorization instanceof TokenizationKey) {
            addParameter.addParameter("braintree:clientKey", authorization.getBearer());
        }
        return addParameter.build();
    }

    /* access modifiers changed from: package-private */
    public ArrayList<Integer> getAllowedCardNetworks(Configuration configuration) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String next : configuration.getGooglePaySupportedNetworks()) {
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -2038717326:
                    if (next.equals(MASTERCARD_NETWORK)) {
                        c = 0;
                        break;
                    }
                    break;
                case 100520:
                    if (next.equals(ELO_NETWORK)) {
                        c = 1;
                        break;
                    }
                    break;
                case 2997727:
                    if (next.equals(AMEX_NETWORK)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3619905:
                    if (next.equals(VISA_NETWORK)) {
                        c = 3;
                        break;
                    }
                    break;
                case 273184745:
                    if (next.equals(DISCOVER_NETWORK)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    arrayList.add(4);
                    break;
                case 1:
                    arrayList.add(1001);
                    break;
                case 2:
                    arrayList.add(1);
                    break;
                case 3:
                    arrayList.add(5);
                    break;
                case 4:
                    arrayList.add(2);
                    break;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public JSONArray buildCardNetworks(Configuration configuration) {
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it = getAllowedCardNetworks(configuration).iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue == 1) {
                jSONArray.put("AMEX");
            } else if (intValue == 2) {
                jSONArray.put("DISCOVER");
            } else if (intValue == 3) {
                jSONArray.put("JCB");
            } else if (intValue == 4) {
                jSONArray.put("MASTERCARD");
            } else if (intValue == 5) {
                jSONArray.put("VISA");
            } else if (intValue == 1001) {
                jSONArray.put("ELO");
                jSONArray.put("ELO_DEBIT");
            }
        }
        return jSONArray;
    }

    private JSONObject buildCardPaymentMethodParameters(Configuration configuration, GooglePayRequest googlePayRequest) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (googlePayRequest.getAllowedCardNetworksForType(CARD_PAYMENT_TYPE) == null) {
                JSONArray buildCardNetworks = buildCardNetworks(configuration);
                if (googlePayRequest.getAllowedAuthMethodsForType(CARD_PAYMENT_TYPE) == null) {
                    googlePayRequest.setAllowedAuthMethods(CARD_PAYMENT_TYPE, new JSONArray().put("PAN_ONLY").put("CRYPTOGRAM_3DS"));
                } else {
                    googlePayRequest.setAllowedAuthMethods(CARD_PAYMENT_TYPE, googlePayRequest.getAllowedAuthMethodsForType(CARD_PAYMENT_TYPE));
                }
                googlePayRequest.setAllowedCardNetworks(CARD_PAYMENT_TYPE, buildCardNetworks);
            }
            jSONObject.put("billingAddressRequired", googlePayRequest.isBillingAddressRequired()).put("allowPrepaidCards", googlePayRequest.getAllowPrepaidCards()).put("allowedAuthMethods", googlePayRequest.getAllowedAuthMethodsForType(CARD_PAYMENT_TYPE)).put("allowedCardNetworks", googlePayRequest.getAllowedCardNetworksForType(CARD_PAYMENT_TYPE));
            if (googlePayRequest.isBillingAddressRequired()) {
                jSONObject.put("billingAddressParameters", new JSONObject().put("format", googlePayRequest.billingAddressFormatToString()).put("phoneNumberRequired", googlePayRequest.isPhoneNumberRequired()));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private JSONObject buildPayPalPaymentMethodParameters(Configuration configuration) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchase_context", new JSONObject().put("purchase_units", new JSONArray().put(new JSONObject().put("payee", new JSONObject().put("client_id", configuration.getGooglePayPayPalClientId())).put("recurring_payment", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE))));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private JSONObject buildCardTokenizationSpecification(Configuration configuration, Authorization authorization) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("gateway", "braintree").put("braintree:apiVersion", "v1").put("braintree:sdkVersion", "4.45.0").put("braintree:merchantId", configuration.getMerchantId()).put("braintree:metadata", new JSONObject().put("source", "client").put(AnalyticsClient.WORK_INPUT_KEY_INTEGRATION, this.braintreeClient.getIntegrationType()).put(AnalyticsClient.WORK_INPUT_KEY_SESSION_ID, this.braintreeClient.getSessionId()).put("version", "4.45.0").put("platform", "android").toString());
            if (authorization instanceof TokenizationKey) {
                jSONObject2.put("braintree:clientKey", authorization.toString());
            } else {
                jSONObject2.put("braintree:authorizationFingerprint", configuration.getGooglePayAuthorizationFingerprint());
            }
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("type", "PAYMENT_GATEWAY").put("parameters", jSONObject2);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    private JSONObject buildPayPalTokenizationSpecification(Configuration configuration) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "braintree").put("braintree:apiVersion", "v1").put("braintree:sdkVersion", "4.45.0").put("braintree:merchantId", configuration.getMerchantId()).put("braintree:paypalClientId", configuration.getGooglePayPayPalClientId()).put("braintree:metadata", new JSONObject().put("source", "client").put(AnalyticsClient.WORK_INPUT_KEY_INTEGRATION, this.braintreeClient.getIntegrationType()).put(AnalyticsClient.WORK_INPUT_KEY_SESSION_ID, this.braintreeClient.getSessionId()).put("version", "4.45.0").put("platform", "android").toString()));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public void setGooglePayRequestDefaults(Configuration configuration, Authorization authorization, GooglePayRequest googlePayRequest) {
        if (googlePayRequest.getAllowedPaymentMethod(CARD_PAYMENT_TYPE) == null) {
            googlePayRequest.setAllowedPaymentMethod(CARD_PAYMENT_TYPE, buildCardPaymentMethodParameters(configuration, googlePayRequest));
        }
        if (googlePayRequest.getTokenizationSpecificationForType(CARD_PAYMENT_TYPE) == null) {
            googlePayRequest.setTokenizationSpecificationForType(CARD_PAYMENT_TYPE, buildCardTokenizationSpecification(configuration, authorization));
        }
        if (googlePayRequest.isPayPalEnabled() && !TextUtils.isEmpty(configuration.getGooglePayPayPalClientId())) {
            if (googlePayRequest.getAllowedPaymentMethod(PAYPAL_PAYMENT_TYPE) == null) {
                googlePayRequest.setAllowedPaymentMethod(PAYPAL_PAYMENT_TYPE, buildPayPalPaymentMethodParameters(configuration));
            }
            if (googlePayRequest.getTokenizationSpecificationForType(PAYPAL_PAYMENT_TYPE) == null) {
                googlePayRequest.setTokenizationSpecificationForType(PAYPAL_PAYMENT_TYPE, buildPayPalTokenizationSpecification(configuration));
            }
        }
        googlePayRequest.setEnvironment(configuration.getGooglePayEnvironment());
    }

    private boolean validateManifest() {
        ActivityInfo manifestActivityInfo = this.braintreeClient.getManifestActivityInfo(GooglePayActivity.class);
        return manifestActivityInfo != null && manifestActivityInfo.getThemeResource() == R.style.bt_transparent_activity;
    }
}
