package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import org.json.JSONException;
import org.json.JSONObject;

public class PayPalClient {
    /* access modifiers changed from: private */
    public final BraintreeClient braintreeClient;
    private final PayPalInternalClient internalPayPalClient;
    /* access modifiers changed from: private */
    public PayPalListener listener;
    /* access modifiers changed from: private */
    public String payPalContextId;
    BrowserSwitchResult pendingBrowserSwitchResult;

    public PayPalClient(FragmentActivity fragmentActivity, BraintreeClient braintreeClient2) {
        this(fragmentActivity, fragmentActivity.getLifecycle(), braintreeClient2, new PayPalInternalClient(braintreeClient2));
    }

    public PayPalClient(Fragment fragment, BraintreeClient braintreeClient2) {
        this(fragment.getActivity(), fragment.getLifecycle(), braintreeClient2, new PayPalInternalClient(braintreeClient2));
    }

    public PayPalClient(BraintreeClient braintreeClient2) {
        this((FragmentActivity) null, (Lifecycle) null, braintreeClient2, new PayPalInternalClient(braintreeClient2));
    }

    PayPalClient(FragmentActivity fragmentActivity, Lifecycle lifecycle, BraintreeClient braintreeClient2, PayPalInternalClient payPalInternalClient) {
        this.payPalContextId = null;
        this.braintreeClient = braintreeClient2;
        this.internalPayPalClient = payPalInternalClient;
        if (fragmentActivity != null && lifecycle != null) {
            lifecycle.addObserver(new PayPalLifecycleObserver(this));
        }
    }

    public void setListener(PayPalListener payPalListener) {
        this.listener = payPalListener;
        BrowserSwitchResult browserSwitchResult = this.pendingBrowserSwitchResult;
        if (browserSwitchResult != null) {
            deliverBrowserSwitchResultToListener(browserSwitchResult);
        }
    }

    /* access modifiers changed from: private */
    public static boolean payPalConfigInvalid(Configuration configuration) {
        return configuration == null || !configuration.isPayPalEnabled();
    }

    public BrowserSwitchResult parseBrowserSwitchResult(Context context, Intent intent) {
        return this.braintreeClient.parseBrowserSwitchResult(context, 13591, intent);
    }

    public void clearActiveBrowserSwitchRequests(Context context) {
        this.braintreeClient.clearActiveBrowserSwitchRequests(context);
    }

    /* access modifiers changed from: private */
    public void assertCanPerformBrowserSwitch(FragmentActivity fragmentActivity) throws BrowserSwitchException {
        this.braintreeClient.assertCanPerformBrowserSwitch(fragmentActivity, 13591);
    }

    /* access modifiers changed from: private */
    public static Exception createPayPalError() {
        return new BraintreeException("PayPal is not enabled. See https://developer.paypal.com/braintree/docs/guides/paypal/overview/android/v4 for more information.");
    }

    /* access modifiers changed from: private */
    public static Exception createBrowserSwitchError(BrowserSwitchException browserSwitchException) {
        return new BraintreeException("AndroidManifest.xml is incorrectly configured or another app defines the same browser switch url as this app. See https://developer.paypal.com/braintree/docs/guides/client-sdk/setup/android/v4#browser-switch-setup for the correct configuration: " + browserSwitchException.getMessage());
    }

    public void tokenizePayPalAccount(FragmentActivity fragmentActivity, PayPalRequest payPalRequest) {
        tokenizePayPalAccount(fragmentActivity, payPalRequest, new PayPalFlowStartedCallback() {
            public void onResult(Exception exc) {
                if (exc != null && PayPalClient.this.listener != null) {
                    PayPalClient.this.listener.onPayPalFailure(exc);
                }
            }
        });
    }

    @Deprecated
    public void tokenizePayPalAccount(FragmentActivity fragmentActivity, PayPalRequest payPalRequest, PayPalFlowStartedCallback payPalFlowStartedCallback) {
        if (payPalRequest instanceof PayPalCheckoutRequest) {
            sendCheckoutRequest(fragmentActivity, (PayPalCheckoutRequest) payPalRequest, payPalFlowStartedCallback);
        } else if (payPalRequest instanceof PayPalVaultRequest) {
            sendVaultRequest(fragmentActivity, (PayPalVaultRequest) payPalRequest, payPalFlowStartedCallback);
        }
    }

    @Deprecated
    public void requestOneTimePayment(FragmentActivity fragmentActivity, PayPalCheckoutRequest payPalCheckoutRequest, PayPalFlowStartedCallback payPalFlowStartedCallback) {
        tokenizePayPalAccount(fragmentActivity, payPalCheckoutRequest, payPalFlowStartedCallback);
    }

    @Deprecated
    public void requestBillingAgreement(FragmentActivity fragmentActivity, PayPalVaultRequest payPalVaultRequest, PayPalFlowStartedCallback payPalFlowStartedCallback) {
        tokenizePayPalAccount(fragmentActivity, payPalVaultRequest, payPalFlowStartedCallback);
    }

    private void sendCheckoutRequest(final FragmentActivity fragmentActivity, final PayPalCheckoutRequest payPalCheckoutRequest, final PayPalFlowStartedCallback payPalFlowStartedCallback) {
        this.braintreeClient.sendAnalyticsEvent("paypal.single-payment.selected", this.payPalContextId);
        if (payPalCheckoutRequest.getShouldOfferPayLater()) {
            this.braintreeClient.sendAnalyticsEvent("paypal.single-payment.paylater.offered", this.payPalContextId);
        }
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                if (exc != null) {
                    payPalFlowStartedCallback.onResult(exc);
                } else if (PayPalClient.payPalConfigInvalid(configuration)) {
                    payPalFlowStartedCallback.onResult(PayPalClient.createPayPalError());
                } else {
                    try {
                        PayPalClient.this.assertCanPerformBrowserSwitch(fragmentActivity);
                        PayPalClient.this.sendPayPalRequest(fragmentActivity, payPalCheckoutRequest, payPalFlowStartedCallback);
                    } catch (BrowserSwitchException e) {
                        PayPalClient.this.braintreeClient.sendAnalyticsEvent("paypal.invalid-manifest", PayPalClient.this.payPalContextId);
                        payPalFlowStartedCallback.onResult(PayPalClient.createBrowserSwitchError(e));
                    }
                }
            }
        });
    }

    private void sendVaultRequest(final FragmentActivity fragmentActivity, final PayPalVaultRequest payPalVaultRequest, final PayPalFlowStartedCallback payPalFlowStartedCallback) {
        this.braintreeClient.sendAnalyticsEvent("paypal.billing-agreement.selected", this.payPalContextId);
        if (payPalVaultRequest.getShouldOfferCredit()) {
            this.braintreeClient.sendAnalyticsEvent("paypal.billing-agreement.credit.offered", this.payPalContextId);
        }
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                if (exc != null) {
                    payPalFlowStartedCallback.onResult(exc);
                } else if (PayPalClient.payPalConfigInvalid(configuration)) {
                    payPalFlowStartedCallback.onResult(PayPalClient.createPayPalError());
                } else {
                    try {
                        PayPalClient.this.assertCanPerformBrowserSwitch(fragmentActivity);
                        PayPalClient.this.sendPayPalRequest(fragmentActivity, payPalVaultRequest, payPalFlowStartedCallback);
                    } catch (BrowserSwitchException e) {
                        PayPalClient.this.braintreeClient.sendAnalyticsEvent("paypal.invalid-manifest", PayPalClient.this.payPalContextId);
                        payPalFlowStartedCallback.onResult(PayPalClient.createBrowserSwitchError(e));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendPayPalRequest(final FragmentActivity fragmentActivity, final PayPalRequest payPalRequest, final PayPalFlowStartedCallback payPalFlowStartedCallback) {
        this.internalPayPalClient.sendRequest(fragmentActivity, payPalRequest, new PayPalInternalClientCallback() {
            public void onResult(PayPalResponse payPalResponse, Exception exc) {
                if (payPalResponse != null) {
                    String access$800 = PayPalClient.getAnalyticsEventPrefix(payPalRequest);
                    PayPalClient.this.braintreeClient.sendAnalyticsEvent(String.format("%s.browser-switch.started", new Object[]{access$800}), PayPalClient.this.payPalContextId);
                    try {
                        PayPalClient.this.startBrowserSwitch(fragmentActivity, payPalResponse);
                        payPalFlowStartedCallback.onResult((Exception) null);
                    } catch (BrowserSwitchException | JSONException e) {
                        payPalFlowStartedCallback.onResult(e);
                    }
                } else {
                    payPalFlowStartedCallback.onResult(exc);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void startBrowserSwitch(FragmentActivity fragmentActivity, PayPalResponse payPalResponse) throws JSONException, BrowserSwitchException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("approval-url", payPalResponse.getApprovalUrl());
        jSONObject.put("success-url", payPalResponse.getSuccessUrl());
        jSONObject.put("payment-type", payPalResponse.isBillingAgreement() ? "billing-agreement" : "single-payment");
        jSONObject.put("client-metadata-id", payPalResponse.getClientMetadataId());
        jSONObject.put("merchant-account-id", payPalResponse.getMerchantAccountId());
        jSONObject.put("source", "paypal-browser");
        jSONObject.put(SDKConstants.PARAM_INTENT, payPalResponse.getIntent());
        this.braintreeClient.startBrowserSwitch(fragmentActivity, new BrowserSwitchOptions().requestCode(13591).url(Uri.parse(payPalResponse.getApprovalUrl())).returnUrlScheme(this.braintreeClient.getReturnUrlScheme()).launchAsNewTask(this.braintreeClient.launchesBrowserSwitchAsNewTask()).metadata(jSONObject));
    }

    /* access modifiers changed from: private */
    public static String getAnalyticsEventPrefix(PayPalRequest payPalRequest) {
        return payPalRequest instanceof PayPalVaultRequest ? "paypal.billing-agreement" : "paypal.single-payment";
    }

    /* access modifiers changed from: package-private */
    public void onBrowserSwitchResult(BrowserSwitchResult browserSwitchResult) {
        this.pendingBrowserSwitchResult = browserSwitchResult;
        if (this.listener != null) {
            deliverBrowserSwitchResultToListener(browserSwitchResult);
        }
    }

    private void deliverBrowserSwitchResultToListener(BrowserSwitchResult browserSwitchResult) {
        onBrowserSwitchResult(browserSwitchResult, new PayPalBrowserSwitchResultCallback() {
            public void onResult(PayPalAccountNonce payPalAccountNonce, Exception exc) {
                if (payPalAccountNonce != null && PayPalClient.this.listener != null) {
                    PayPalClient.this.listener.onPayPalSuccess(payPalAccountNonce);
                } else if (exc != null && PayPalClient.this.listener != null) {
                    PayPalClient.this.listener.onPayPalFailure(exc);
                }
            }
        });
        this.pendingBrowserSwitchResult = null;
    }

    /* access modifiers changed from: package-private */
    public BrowserSwitchResult getBrowserSwitchResult(FragmentActivity fragmentActivity) {
        return this.braintreeClient.getBrowserSwitchResult(fragmentActivity);
    }

    /* access modifiers changed from: package-private */
    public BrowserSwitchResult deliverBrowserSwitchResult(FragmentActivity fragmentActivity) {
        return this.braintreeClient.deliverBrowserSwitchResult(fragmentActivity);
    }

    /* access modifiers changed from: package-private */
    public BrowserSwitchResult getBrowserSwitchResultFromNewTask(FragmentActivity fragmentActivity) {
        return this.braintreeClient.getBrowserSwitchResultFromNewTask(fragmentActivity);
    }

    /* access modifiers changed from: package-private */
    public BrowserSwitchResult deliverBrowserSwitchResultFromNewTask(FragmentActivity fragmentActivity) {
        return this.braintreeClient.deliverBrowserSwitchResultFromNewTask(fragmentActivity);
    }

    public void onBrowserSwitchResult(BrowserSwitchResult browserSwitchResult, final PayPalBrowserSwitchResultCallback payPalBrowserSwitchResultCallback) {
        String queryParameter;
        if (browserSwitchResult == null) {
            payPalBrowserSwitchResultCallback.onResult((PayPalAccountNonce) null, new BraintreeException("BrowserSwitchResult cannot be null"));
            return;
        }
        JSONObject requestMetadata = browserSwitchResult.getRequestMetadata();
        String optString = Json.optString(requestMetadata, "client-metadata-id", (String) null);
        String optString2 = Json.optString(requestMetadata, "merchant-account-id", (String) null);
        String optString3 = Json.optString(requestMetadata, SDKConstants.PARAM_INTENT, (String) null);
        String optString4 = Json.optString(requestMetadata, "approval-url", (String) null);
        String optString5 = Json.optString(requestMetadata, "success-url", (String) null);
        String optString6 = Json.optString(requestMetadata, "payment-type", "unknown");
        boolean equalsIgnoreCase = optString6.equalsIgnoreCase("billing-agreement");
        String str = equalsIgnoreCase ? "ba_token" : "token";
        String str2 = equalsIgnoreCase ? "paypal.billing-agreement" : "paypal.single-payment";
        if (!(optString4 == null || (queryParameter = Uri.parse(optString4).getQueryParameter(str)) == null || queryParameter.isEmpty())) {
            this.payPalContextId = queryParameter;
        }
        int status = browserSwitchResult.getStatus();
        if (status == 1) {
            try {
                Uri deepLinkUrl = browserSwitchResult.getDeepLinkUrl();
                if (deepLinkUrl != null) {
                    JSONObject parseUrlResponseData = parseUrlResponseData(deepLinkUrl, optString5, optString4, str);
                    PayPalAccount payPalAccount = new PayPalAccount();
                    payPalAccount.setClientMetadataId(optString);
                    payPalAccount.setIntent(optString3);
                    payPalAccount.setSource("paypal-browser");
                    payPalAccount.setUrlResponseData(parseUrlResponseData);
                    payPalAccount.setPaymentType(optString6);
                    if (optString2 != null) {
                        payPalAccount.setMerchantAccountId(optString2);
                    }
                    if (optString3 != null) {
                        payPalAccount.setIntent(optString3);
                    }
                    this.internalPayPalClient.tokenize(payPalAccount, new PayPalBrowserSwitchResultCallback() {
                        public void onResult(PayPalAccountNonce payPalAccountNonce, Exception exc) {
                            if (!(payPalAccountNonce == null || payPalAccountNonce.getCreditFinancing() == null)) {
                                PayPalClient.this.braintreeClient.sendAnalyticsEvent("paypal.credit.accepted", PayPalClient.this.payPalContextId);
                            }
                            payPalBrowserSwitchResultCallback.onResult(payPalAccountNonce, exc);
                        }
                    });
                    this.braintreeClient.sendAnalyticsEvent(String.format("%s.browser-switch.succeeded", new Object[]{str2}), this.payPalContextId);
                    return;
                }
                payPalBrowserSwitchResultCallback.onResult((PayPalAccountNonce) null, new BraintreeException("Unknown error"));
            } catch (UserCanceledException e) {
                payPalBrowserSwitchResultCallback.onResult((PayPalAccountNonce) null, e);
                this.braintreeClient.sendAnalyticsEvent(String.format("%s.browser-switch.canceled", new Object[]{str2}), this.payPalContextId);
            } catch (PayPalBrowserSwitchException | JSONException e2) {
                payPalBrowserSwitchResultCallback.onResult((PayPalAccountNonce) null, e2);
                this.braintreeClient.sendAnalyticsEvent(String.format("%s.browser-switch.failed", new Object[]{str2}), this.payPalContextId);
            }
        } else if (status == 2) {
            payPalBrowserSwitchResultCallback.onResult((PayPalAccountNonce) null, new UserCanceledException("User canceled PayPal."));
            this.braintreeClient.sendAnalyticsEvent(String.format("%s.browser-switch.canceled", new Object[]{str2}), this.payPalContextId);
        }
    }

    private JSONObject parseUrlResponseData(Uri uri, String str, String str2, String str3) throws JSONException, UserCanceledException, PayPalBrowserSwitchException {
        if (Uri.parse(str).getLastPathSegment().equals(uri.getLastPathSegment())) {
            String queryParameter = Uri.parse(str2).getQueryParameter(str3);
            String queryParameter2 = uri.getQueryParameter(str3);
            if (queryParameter2 == null || !TextUtils.equals(queryParameter, queryParameter2)) {
                throw new PayPalBrowserSwitchException("The response contained inconsistent data.");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("environment", (Object) null);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("client", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("webURL", uri.toString());
            jSONObject2.put("response", jSONObject3);
            jSONObject2.put(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB);
            return jSONObject2;
        }
        throw new UserCanceledException("User canceled PayPal.", true);
    }
}
