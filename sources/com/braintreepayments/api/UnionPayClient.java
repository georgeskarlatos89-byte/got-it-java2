package com.braintreepayments.api;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

public class UnionPayClient {
    /* access modifiers changed from: private */
    public static final String UNIONPAY_CAPABILITIES_PATH = ApiClient.versionedPath("payment_methods/credit_cards/capabilities");
    private static final String UNIONPAY_ENROLLMENT_ID_KEY = "unionPayEnrollmentId";
    /* access modifiers changed from: private */
    public static final String UNIONPAY_ENROLLMENT_PATH = ApiClient.versionedPath("union_pay_enrollments");
    private static final String UNIONPAY_SMS_REQUIRED_KEY = "smsCodeRequired";
    private final ApiClient apiClient;
    /* access modifiers changed from: private */
    public final BraintreeClient braintreeClient;

    public UnionPayClient(BraintreeClient braintreeClient2) {
        this(braintreeClient2, new ApiClient(braintreeClient2));
    }

    UnionPayClient(BraintreeClient braintreeClient2, ApiClient apiClient2) {
        this.braintreeClient = braintreeClient2;
        this.apiClient = apiClient2;
    }

    public void fetchCapabilities(final String str, final UnionPayFetchCapabilitiesCallback unionPayFetchCapabilitiesCallback) {
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                if (!configuration.isUnionPayEnabled()) {
                    unionPayFetchCapabilitiesCallback.onResult((UnionPayCapabilities) null, new ConfigurationException("UnionPay is not enabled"));
                    return;
                }
                UnionPayClient.this.braintreeClient.sendGET(Uri.parse(UnionPayClient.UNIONPAY_CAPABILITIES_PATH).buildUpon().appendQueryParameter("creditCard[number]", str).build().toString(), new HttpResponseCallback() {
                    public void onResult(String str, Exception exc) {
                        if (str != null) {
                            unionPayFetchCapabilitiesCallback.onResult(UnionPayCapabilities.fromJson(str), (Exception) null);
                            UnionPayClient.this.braintreeClient.sendAnalyticsEvent("union-pay.capabilities-received");
                            return;
                        }
                        unionPayFetchCapabilitiesCallback.onResult((UnionPayCapabilities) null, exc);
                        UnionPayClient.this.braintreeClient.sendAnalyticsEvent("union-pay.capabilities-failed");
                    }
                });
            }
        });
    }

    public void enroll(final UnionPayCard unionPayCard, final UnionPayEnrollCallback unionPayEnrollCallback) {
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                if (!configuration.isUnionPayEnabled()) {
                    unionPayEnrollCallback.onResult((UnionPayEnrollment) null, new ConfigurationException("UnionPay is not enabled"));
                    return;
                }
                try {
                    UnionPayClient.this.braintreeClient.sendPOST(UnionPayClient.UNIONPAY_ENROLLMENT_PATH, unionPayCard.buildEnrollment().toString(), new HttpResponseCallback() {
                        public void onResult(String str, Exception exc) {
                            if (str != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    unionPayEnrollCallback.onResult(new UnionPayEnrollment(jSONObject.getString(UnionPayClient.UNIONPAY_ENROLLMENT_ID_KEY), jSONObject.getBoolean(UnionPayClient.UNIONPAY_SMS_REQUIRED_KEY)), (Exception) null);
                                    UnionPayClient.this.braintreeClient.sendAnalyticsEvent("union-pay.enrollment-succeeded");
                                } catch (JSONException e) {
                                    unionPayEnrollCallback.onResult((UnionPayEnrollment) null, e);
                                    UnionPayClient.this.braintreeClient.sendAnalyticsEvent("union-pay.enrollment-failed");
                                }
                            } else {
                                unionPayEnrollCallback.onResult((UnionPayEnrollment) null, exc);
                                UnionPayClient.this.braintreeClient.sendAnalyticsEvent("union-pay.enrollment-failed");
                            }
                        }
                    });
                } catch (JSONException e) {
                    unionPayEnrollCallback.onResult((UnionPayEnrollment) null, e);
                }
            }
        });
    }

    public void tokenize(UnionPayCard unionPayCard, final UnionPayTokenizeCallback unionPayTokenizeCallback) {
        this.apiClient.tokenizeREST(unionPayCard, new TokenizeCallback() {
            public void onResult(JSONObject jSONObject, Exception exc) {
                if (jSONObject != null) {
                    try {
                        unionPayTokenizeCallback.onResult(CardNonce.fromJSON(jSONObject), (Exception) null);
                        UnionPayClient.this.braintreeClient.sendAnalyticsEvent("union-pay.nonce-received");
                    } catch (JSONException e) {
                        unionPayTokenizeCallback.onResult((CardNonce) null, e);
                    }
                } else {
                    unionPayTokenizeCallback.onResult((CardNonce) null, exc);
                    UnionPayClient.this.braintreeClient.sendAnalyticsEvent("union-pay.nonce-failed");
                }
            }
        });
    }
}
