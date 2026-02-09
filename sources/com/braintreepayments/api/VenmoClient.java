package com.braintreepayments.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import org.json.JSONException;
import org.json.JSONObject;

public class VenmoClient {
    static final String APP_SWITCH_ACTIVITY = "controller.SetupMerchantActivity";
    static final String EXTRA_ACCESS_TOKEN = "com.braintreepayments.api.ACCESS_TOKEN";
    static final String EXTRA_BRAINTREE_DATA = "com.braintreepayments.api.EXTRA_BRAINTREE_DATA";
    static final String EXTRA_ENVIRONMENT = "com.braintreepayments.api.ENVIRONMENT";
    static final String EXTRA_MERCHANT_ID = "com.braintreepayments.api.MERCHANT_ID";
    static final String EXTRA_PAYMENT_METHOD_NONCE = "com.braintreepayments.api.EXTRA_PAYMENT_METHOD_NONCE";
    static final String EXTRA_RESOURCE_ID = "com.braintreepayments.api.EXTRA_RESOURCE_ID";
    static final String EXTRA_USERNAME = "com.braintreepayments.api.EXTRA_USER_NAME";
    static final String META_KEY = "_meta";
    static final String VENMO_PACKAGE_NAME = "com.venmo";
    /* access modifiers changed from: private */
    public final BraintreeClient braintreeClient;
    /* access modifiers changed from: private */
    public final DeviceInspector deviceInspector;
    /* access modifiers changed from: private */
    public VenmoListener listener;
    VenmoLifecycleObserver observer;
    /* access modifiers changed from: private */
    public String payPalContextId;
    BrowserSwitchResult pendingBrowserSwitchResult;
    /* access modifiers changed from: private */
    public final VenmoSharedPrefsWriter sharedPrefsWriter;
    /* access modifiers changed from: private */
    public final VenmoApi venmoApi;

    public VenmoClient(FragmentActivity fragmentActivity, BraintreeClient braintreeClient2) {
        this(fragmentActivity, fragmentActivity.getLifecycle(), braintreeClient2, new ApiClient(braintreeClient2));
    }

    public VenmoClient(Fragment fragment, BraintreeClient braintreeClient2) {
        this(fragment.requireActivity(), fragment.getLifecycle(), braintreeClient2, new ApiClient(braintreeClient2));
    }

    private VenmoClient(FragmentActivity fragmentActivity, Lifecycle lifecycle, BraintreeClient braintreeClient2, ApiClient apiClient) {
        this(fragmentActivity, lifecycle, braintreeClient2, new VenmoApi(braintreeClient2, apiClient), new VenmoSharedPrefsWriter(), new DeviceInspector());
    }

    @Deprecated
    public VenmoClient(BraintreeClient braintreeClient2) {
        this((FragmentActivity) null, (Lifecycle) null, braintreeClient2, new ApiClient(braintreeClient2));
    }

    VenmoClient(FragmentActivity fragmentActivity, Lifecycle lifecycle, BraintreeClient braintreeClient2, VenmoApi venmoApi2, VenmoSharedPrefsWriter venmoSharedPrefsWriter, DeviceInspector deviceInspector2) {
        this.payPalContextId = null;
        this.braintreeClient = braintreeClient2;
        this.sharedPrefsWriter = venmoSharedPrefsWriter;
        this.deviceInspector = deviceInspector2;
        this.venmoApi = venmoApi2;
        if (fragmentActivity != null && lifecycle != null) {
            addObserver(fragmentActivity, lifecycle);
        }
    }

    private void addObserver(FragmentActivity fragmentActivity, Lifecycle lifecycle) {
        VenmoLifecycleObserver venmoLifecycleObserver = new VenmoLifecycleObserver(fragmentActivity.getActivityResultRegistry(), this);
        this.observer = venmoLifecycleObserver;
        lifecycle.addObserver(venmoLifecycleObserver);
    }

    public void setListener(VenmoListener venmoListener) {
        this.listener = venmoListener;
        BrowserSwitchResult browserSwitchResult = this.pendingBrowserSwitchResult;
        if (browserSwitchResult != null) {
            deliverBrowserSwitchResultToListener(browserSwitchResult);
        }
    }

    public void showVenmoInGooglePlayStore(FragmentActivity fragmentActivity) {
        this.braintreeClient.sendAnalyticsEvent("android.pay-with-venmo.app-store.invoked", this.payPalContextId);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.venmo"));
        fragmentActivity.startActivity(intent);
    }

    public void tokenizeVenmoAccount(FragmentActivity fragmentActivity, VenmoRequest venmoRequest) {
        tokenizeVenmoAccount(fragmentActivity, venmoRequest, new VenmoTokenizeAccountCallback() {
            public void onResult(Exception exc) {
                if (exc != null) {
                    VenmoClient.this.deliverVenmoFailure(exc);
                }
            }
        });
    }

    @Deprecated
    public void tokenizeVenmoAccount(final FragmentActivity fragmentActivity, final VenmoRequest venmoRequest, final VenmoTokenizeAccountCallback venmoTokenizeAccountCallback) {
        this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.selected", this.payPalContextId);
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(final Configuration configuration, Exception exc) {
                if (configuration == null) {
                    venmoTokenizeAccountCallback.onResult(exc);
                    VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.failed", VenmoClient.this.payPalContextId);
                    return;
                }
                String str = (venmoRequest.getFallbackToWeb() || VenmoClient.this.deviceInspector.isVenmoAppSwitchAvailable(fragmentActivity)) ? null : "Venmo is not installed";
                if (!configuration.isVenmoEnabled()) {
                    str = "Venmo is not enabled";
                }
                if (str != null) {
                    venmoTokenizeAccountCallback.onResult(new AppSwitchNotAvailableException(str));
                    VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.failed", VenmoClient.this.payPalContextId);
                } else if ((venmoRequest.getCollectCustomerShippingAddress() || venmoRequest.getCollectCustomerBillingAddress()) && !configuration.getVenmoEnrichedCustomerDataEnabled()) {
                    venmoTokenizeAccountCallback.onResult(new BraintreeException("Cannot collect customer data when ECD is disabled. Enable this feature in the Control Panel to collect this data."));
                    VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.failed", VenmoClient.this.payPalContextId);
                } else {
                    final String profileId = venmoRequest.getProfileId();
                    if (TextUtils.isEmpty(profileId)) {
                        profileId = configuration.getVenmoMerchantId();
                    }
                    VenmoClient.this.venmoApi.createPaymentContext(venmoRequest, profileId, new VenmoApiCallback() {
                        public void onResult(final String str, Exception exc) {
                            if (exc == null) {
                                if (str != null && !str.isEmpty()) {
                                    String unused = VenmoClient.this.payPalContextId = str;
                                }
                                VenmoClient.this.braintreeClient.getAuthorization(new AuthorizationCallback() {
                                    public void onAuthorizationResult(Authorization authorization, Exception exc) {
                                        if (authorization != null) {
                                            VenmoClient.this.startVenmoActivityForResult(fragmentActivity, venmoRequest, configuration, authorization, profileId, str);
                                            return;
                                        }
                                        venmoTokenizeAccountCallback.onResult(exc);
                                    }
                                });
                                return;
                            }
                            venmoTokenizeAccountCallback.onResult(exc);
                            VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.failed", VenmoClient.this.payPalContextId);
                        }
                    });
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void startVenmoActivityForResult(FragmentActivity fragmentActivity, VenmoRequest venmoRequest, Configuration configuration, Authorization authorization, String str, String str2) {
        this.sharedPrefsWriter.persistVenmoVaultOption((Context) fragmentActivity, venmoRequest.getShouldVault() && (authorization instanceof ClientToken));
        if (this.observer != null) {
            VenmoIntentData venmoIntentData = new VenmoIntentData(configuration, str, str2, this.braintreeClient.getSessionId(), this.braintreeClient.getIntegrationType());
            if (venmoRequest.getFallbackToWeb()) {
                try {
                    startAppLinkFlow(fragmentActivity, venmoIntentData);
                } catch (BrowserSwitchException | JSONException e) {
                    this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.failure");
                    deliverVenmoFailure(e);
                }
            } else {
                this.observer.launch(venmoIntentData);
            }
        } else {
            fragmentActivity.startActivityForResult(getLaunchIntent(configuration, str, str2), 13488);
        }
        this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.started", this.payPalContextId);
    }

    /* access modifiers changed from: package-private */
    public void onVenmoResult(final VenmoResult venmoResult) {
        if (venmoResult.getError() == null) {
            this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.success", this.payPalContextId);
            this.braintreeClient.getAuthorization(new AuthorizationCallback() {
                public void onAuthorizationResult(Authorization authorization, Exception exc) {
                    if (authorization != null) {
                        final boolean z = authorization instanceof ClientToken;
                        String paymentContextId = venmoResult.getPaymentContextId();
                        if (paymentContextId != null) {
                            VenmoClient.this.venmoApi.createNonceFromPaymentContext(paymentContextId, new VenmoOnActivityResultCallback() {
                                public void onResult(VenmoAccountNonce venmoAccountNonce, Exception exc) {
                                    if (venmoAccountNonce == null) {
                                        VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.failure", VenmoClient.this.payPalContextId);
                                        VenmoClient.this.deliverVenmoFailure(exc);
                                    } else if (!VenmoClient.this.sharedPrefsWriter.getVenmoVaultOption(VenmoClient.this.braintreeClient.getApplicationContext()) || !z) {
                                        VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.failure", VenmoClient.this.payPalContextId);
                                        VenmoClient.this.deliverVenmoSuccess(venmoAccountNonce);
                                    } else {
                                        VenmoClient.this.vaultVenmoAccountNonce(venmoAccountNonce.getString(), new VenmoOnActivityResultCallback() {
                                            public void onResult(VenmoAccountNonce venmoAccountNonce, Exception exc) {
                                                if (venmoAccountNonce != null) {
                                                    VenmoClient.this.deliverVenmoSuccess(venmoAccountNonce);
                                                } else if (exc != null) {
                                                    VenmoClient.this.deliverVenmoFailure(exc);
                                                }
                                            }
                                        });
                                    }
                                }
                            });
                            return;
                        }
                        String venmoAccountNonce = venmoResult.getVenmoAccountNonce();
                        if (!VenmoClient.this.sharedPrefsWriter.getVenmoVaultOption(VenmoClient.this.braintreeClient.getApplicationContext()) || !z) {
                            VenmoClient.this.deliverVenmoSuccess(new VenmoAccountNonce(venmoAccountNonce, venmoResult.getVenmoUsername(), false));
                            return;
                        }
                        VenmoClient.this.vaultVenmoAccountNonce(venmoAccountNonce, new VenmoOnActivityResultCallback() {
                            public void onResult(VenmoAccountNonce venmoAccountNonce, Exception exc) {
                                if (venmoAccountNonce != null) {
                                    VenmoClient.this.deliverVenmoSuccess(venmoAccountNonce);
                                } else if (exc != null) {
                                    VenmoClient.this.deliverVenmoFailure(exc);
                                }
                            }
                        });
                    } else if (exc != null) {
                        VenmoClient.this.deliverVenmoFailure(exc);
                    }
                }
            });
        } else if (venmoResult.getError() != null) {
            if (venmoResult.getError() instanceof UserCanceledException) {
                this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.canceled", this.payPalContextId);
            }
            deliverVenmoFailure(venmoResult.getError());
        }
    }

    /* access modifiers changed from: private */
    public void deliverVenmoSuccess(VenmoAccountNonce venmoAccountNonce) {
        VenmoListener venmoListener = this.listener;
        if (venmoListener != null) {
            venmoListener.onVenmoSuccess(venmoAccountNonce);
        } else {
            Log.w(LoggingUtils.TAG, LoggingUtils.LISTENER_WARNING);
        }
    }

    /* access modifiers changed from: private */
    public void deliverVenmoFailure(Exception exc) {
        VenmoListener venmoListener = this.listener;
        if (venmoListener != null) {
            venmoListener.onVenmoFailure(exc);
        } else {
            Log.w(LoggingUtils.TAG, LoggingUtils.LISTENER_WARNING);
        }
    }

    public void onActivityResult(final Context context, int i, final Intent intent, final VenmoOnActivityResultCallback venmoOnActivityResultCallback) {
        if (i == -1) {
            this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.success", this.payPalContextId);
            this.braintreeClient.getAuthorization(new AuthorizationCallback() {
                public void onAuthorizationResult(Authorization authorization, Exception exc) {
                    if (authorization != null) {
                        final boolean z = authorization instanceof ClientToken;
                        String stringExtra = intent.getStringExtra(VenmoClient.EXTRA_RESOURCE_ID);
                        if (stringExtra != null) {
                            VenmoClient.this.venmoApi.createNonceFromPaymentContext(stringExtra, new VenmoOnActivityResultCallback() {
                                public void onResult(VenmoAccountNonce venmoAccountNonce, Exception exc) {
                                    if (venmoAccountNonce == null) {
                                        VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.failure", VenmoClient.this.payPalContextId);
                                        venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, exc);
                                    } else if (!VenmoClient.this.sharedPrefsWriter.getVenmoVaultOption(context) || !z) {
                                        VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.failure", VenmoClient.this.payPalContextId);
                                        venmoOnActivityResultCallback.onResult(venmoAccountNonce, (Exception) null);
                                    } else {
                                        VenmoClient.this.vaultVenmoAccountNonce(venmoAccountNonce.getString(), venmoOnActivityResultCallback);
                                    }
                                }
                            });
                            return;
                        }
                        String stringExtra2 = intent.getStringExtra(VenmoClient.EXTRA_PAYMENT_METHOD_NONCE);
                        if (!VenmoClient.this.sharedPrefsWriter.getVenmoVaultOption(context) || !z) {
                            venmoOnActivityResultCallback.onResult(new VenmoAccountNonce(stringExtra2, intent.getStringExtra(VenmoClient.EXTRA_USERNAME), false), (Exception) null);
                            return;
                        }
                        VenmoClient.this.vaultVenmoAccountNonce(stringExtra2, venmoOnActivityResultCallback);
                    } else if (exc != null) {
                        venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, exc);
                    }
                }
            });
        } else if (i == 0) {
            this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-switch.canceled", this.payPalContextId);
            venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, new UserCanceledException("User canceled Venmo."));
        }
    }

    /* access modifiers changed from: private */
    public void vaultVenmoAccountNonce(String str, final VenmoOnActivityResultCallback venmoOnActivityResultCallback) {
        this.venmoApi.vaultVenmoAccountNonce(str, new VenmoOnActivityResultCallback() {
            public void onResult(VenmoAccountNonce venmoAccountNonce, Exception exc) {
                if (venmoAccountNonce != null) {
                    VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.vault.success", VenmoClient.this.payPalContextId);
                } else {
                    VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.vault.failed", VenmoClient.this.payPalContextId);
                }
                venmoOnActivityResultCallback.onResult(venmoAccountNonce, exc);
            }
        });
    }

    private static Intent getVenmoIntent() {
        return new Intent().setComponent(new ComponentName(VENMO_PACKAGE_NAME, "com.venmo.controller.SetupMerchantActivity"));
    }

    private Intent getLaunchIntent(Configuration configuration, String str, String str2) {
        Intent putExtra = getVenmoIntent().putExtra(EXTRA_MERCHANT_ID, str).putExtra(EXTRA_ACCESS_TOKEN, configuration.getVenmoAccessToken()).putExtra(EXTRA_ENVIRONMENT, configuration.getVenmoEnvironment());
        if (str2 != null) {
            putExtra.putExtra(EXTRA_RESOURCE_ID, str2);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_meta", new MetadataBuilder().sessionId(this.braintreeClient.getSessionId()).integration(this.braintreeClient.getIntegrationType()).version().build());
            putExtra.putExtra(EXTRA_BRAINTREE_DATA, jSONObject.toString());
        } catch (JSONException unused) {
        }
        return putExtra;
    }

    public void onBrowserSwitchResult(BrowserSwitchResult browserSwitchResult, VenmoOnActivityResultCallback venmoOnActivityResultCallback) {
        int status = browserSwitchResult.getStatus();
        if (status == 1) {
            Uri deepLinkUrl = browserSwitchResult.getDeepLinkUrl();
            if (deepLinkUrl == null) {
                this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.failure");
                venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, new Exception("Unknown error"));
            } else if (deepLinkUrl.getPath().contains("success")) {
                final String parseResourceId = parseResourceId(String.valueOf(deepLinkUrl));
                final String parsePaymentMethodNonce = parsePaymentMethodNonce(String.valueOf(deepLinkUrl));
                final String parseUsername = parseUsername(String.valueOf(deepLinkUrl));
                final Context applicationContext = this.braintreeClient.getApplicationContext();
                final VenmoOnActivityResultCallback venmoOnActivityResultCallback2 = venmoOnActivityResultCallback;
                this.braintreeClient.getAuthorization(new AuthorizationCallback() {
                    public void onAuthorizationResult(Authorization authorization, Exception exc) {
                        if (authorization != null) {
                            final boolean z = authorization instanceof ClientToken;
                            if (parseResourceId != null) {
                                VenmoClient.this.venmoApi.createNonceFromPaymentContext(parseResourceId, new VenmoOnActivityResultCallback() {
                                    public void onResult(VenmoAccountNonce venmoAccountNonce, Exception exc) {
                                        if (venmoAccountNonce == null) {
                                            VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.failure");
                                            venmoOnActivityResultCallback2.onResult((VenmoAccountNonce) null, exc);
                                        } else if (!VenmoClient.this.sharedPrefsWriter.getVenmoVaultOption(applicationContext) || !z) {
                                            VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.success");
                                            venmoOnActivityResultCallback2.onResult(venmoAccountNonce, (Exception) null);
                                        } else {
                                            VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.success");
                                            VenmoClient.this.vaultVenmoAccountNonce(venmoAccountNonce.getString(), venmoOnActivityResultCallback2);
                                        }
                                    }
                                });
                            } else if (parsePaymentMethodNonce != null && parseUsername != null) {
                                if (!VenmoClient.this.sharedPrefsWriter.getVenmoVaultOption(applicationContext) || !z) {
                                    VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.success");
                                    venmoOnActivityResultCallback2.onResult(new VenmoAccountNonce(parsePaymentMethodNonce, parseUsername, false), (Exception) null);
                                    return;
                                }
                                VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.success");
                                VenmoClient.this.vaultVenmoAccountNonce(parsePaymentMethodNonce, venmoOnActivityResultCallback2);
                            }
                        } else if (exc != null) {
                            VenmoClient.this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.failure");
                            venmoOnActivityResultCallback2.onResult((VenmoAccountNonce) null, exc);
                        }
                    }
                });
            } else if (deepLinkUrl.getPath().contains("cancel")) {
                this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.canceled");
                venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, new UserCanceledException("User canceled Venmo."));
            } else if (deepLinkUrl.getPath().contains("error")) {
                this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.failure");
                venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, new Exception("Error returned from Venmo."));
            }
        } else if (status == 2) {
            this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.canceled");
            venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, new UserCanceledException("User canceled Venmo."));
        }
    }

    public BrowserSwitchResult parseBrowserSwitchResult(Context context, Intent intent) {
        return this.braintreeClient.parseBrowserSwitchResult(context, 13488, intent);
    }

    public void clearActiveBrowserSwitchRequests(Context context) {
        this.braintreeClient.clearActiveBrowserSwitchRequests(context);
    }

    /* access modifiers changed from: package-private */
    public void onBrowserSwitchResult(BrowserSwitchResult browserSwitchResult) {
        this.pendingBrowserSwitchResult = browserSwitchResult;
        if (this.listener != null) {
            deliverBrowserSwitchResultToListener(browserSwitchResult);
        }
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

    private String parseResourceId(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("resource_id");
        if (queryParameter != null) {
            return queryParameter;
        }
        String queryParameter2 = Uri.parse(String.valueOf(str.replaceFirst("&", "?"))).getQueryParameter("resource_id");
        if (queryParameter2 != null) {
            return queryParameter2;
        }
        return null;
    }

    private String parsePaymentMethodNonce(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("payment_method_nonce");
        if (queryParameter != null) {
            return queryParameter;
        }
        String queryParameter2 = Uri.parse(String.valueOf(str.replaceFirst("&", "?"))).getQueryParameter("payment_method_nonce");
        if (queryParameter2 != null) {
            return queryParameter2;
        }
        return null;
    }

    private String parseUsername(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter(HintConstants.AUTOFILL_HINT_USERNAME);
        if (queryParameter != null) {
            return queryParameter;
        }
        String queryParameter2 = Uri.parse(String.valueOf(str.replaceFirst("&", "?"))).getQueryParameter(HintConstants.AUTOFILL_HINT_USERNAME);
        if (queryParameter2 != null) {
            return queryParameter2;
        }
        return null;
    }

    private void deliverBrowserSwitchResultToListener(BrowserSwitchResult browserSwitchResult) {
        onBrowserSwitchResult(browserSwitchResult, new VenmoOnActivityResultCallback() {
            public void onResult(VenmoAccountNonce venmoAccountNonce, Exception exc) {
                if (VenmoClient.this.listener == null) {
                    return;
                }
                if (venmoAccountNonce != null) {
                    VenmoClient.this.listener.onVenmoSuccess(venmoAccountNonce);
                } else if (exc != null) {
                    VenmoClient.this.listener.onVenmoFailure(exc);
                }
            }
        });
        this.pendingBrowserSwitchResult = null;
    }

    /* access modifiers changed from: package-private */
    public void startAppLinkFlow(FragmentActivity fragmentActivity, VenmoIntentData venmoIntentData) throws JSONException, BrowserSwitchException {
        JSONObject put = new JSONObject().put("_meta", new MetadataBuilder().sessionId(venmoIntentData.getSessionId()).integration(venmoIntentData.getIntegrationType()).version().build());
        Context applicationContext = this.braintreeClient.getApplicationContext();
        this.braintreeClient.startBrowserSwitch(fragmentActivity, new BrowserSwitchOptions().requestCode(13488).url(Uri.parse("https://venmo.com/go/checkout").buildUpon().appendQueryParameter("x-success", this.braintreeClient.getReturnUrlScheme() + "://x-callback-url/vzero/auth/venmo/success").appendQueryParameter("x-error", this.braintreeClient.getReturnUrlScheme() + "://x-callback-url/vzero/auth/venmo/error").appendQueryParameter("x-cancel", this.braintreeClient.getReturnUrlScheme() + "://x-callback-url/vzero/auth/venmo/cancel").appendQueryParameter("x-source", (applicationContext == null || applicationContext.getPackageManager().getApplicationLabel(applicationContext.getApplicationInfo()).toString() == null) ? "ApplicationNameUnknown" : applicationContext.getPackageManager().getApplicationLabel(applicationContext.getApplicationInfo()).toString()).appendQueryParameter("braintree_merchant_id", venmoIntentData.getProfileId()).appendQueryParameter("braintree_access_token", venmoIntentData.getConfiguration().getVenmoAccessToken()).appendQueryParameter("braintree_environment", venmoIntentData.getConfiguration().getVenmoEnvironment()).appendQueryParameter("resource_id", venmoIntentData.getPaymentContextId()).appendQueryParameter("braintree_sdk_data", Base64.encodeToString(put.toString().getBytes(), 0)).appendQueryParameter("customerClient", "MOBILE_APP").build()).returnUrlScheme(this.braintreeClient.getReturnUrlScheme()));
        this.braintreeClient.sendAnalyticsEvent("pay-with-venmo.app-links.started");
    }

    public boolean isVenmoAppSwitchAvailable(Context context) {
        return this.deviceInspector.isVenmoAppSwitchAvailable(context);
    }

    public void isReadyToPay(final Context context, final VenmoIsReadyToPayCallback venmoIsReadyToPayCallback) {
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                boolean z = false;
                if (configuration != null) {
                    if (configuration.isVenmoEnabled() && VenmoClient.this.isVenmoAppSwitchAvailable(context)) {
                        z = true;
                    }
                    venmoIsReadyToPayCallback.onResult(z, (Exception) null);
                    return;
                }
                venmoIsReadyToPayCallback.onResult(false, exc);
            }
        });
    }
}
