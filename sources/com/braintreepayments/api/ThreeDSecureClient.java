package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import org.apache.http.HttpStatus;
import org.json.JSONException;
import org.json.JSONObject;

public class ThreeDSecureClient {
    /* access modifiers changed from: private */
    public final ThreeDSecureAPI api;
    /* access modifiers changed from: private */
    public final BraintreeClient braintreeClient;
    /* access modifiers changed from: private */
    public final CardinalClient cardinalClient;
    /* access modifiers changed from: private */
    public ThreeDSecureListener listener;
    ThreeDSecureLifecycleObserver observer;
    BrowserSwitchResult pendingBrowserSwitchResult;

    public ThreeDSecureClient(FragmentActivity fragmentActivity, BraintreeClient braintreeClient2) {
        this(fragmentActivity, fragmentActivity.getLifecycle(), braintreeClient2, new CardinalClient(), new ThreeDSecureAPI(braintreeClient2));
    }

    public ThreeDSecureClient(Fragment fragment, BraintreeClient braintreeClient2) {
        this(fragment.requireActivity(), fragment.getLifecycle(), braintreeClient2, new CardinalClient(), new ThreeDSecureAPI(braintreeClient2));
    }

    @Deprecated
    public ThreeDSecureClient(BraintreeClient braintreeClient2) {
        this((FragmentActivity) null, (Lifecycle) null, braintreeClient2, new CardinalClient(), new ThreeDSecureAPI(braintreeClient2));
    }

    ThreeDSecureClient(FragmentActivity fragmentActivity, Lifecycle lifecycle, BraintreeClient braintreeClient2, CardinalClient cardinalClient2, ThreeDSecureAPI threeDSecureAPI) {
        this.cardinalClient = cardinalClient2;
        this.braintreeClient = braintreeClient2;
        this.api = threeDSecureAPI;
        if (fragmentActivity != null && lifecycle != null) {
            addObserver(fragmentActivity, lifecycle);
        }
    }

    /* access modifiers changed from: package-private */
    public void addObserver(FragmentActivity fragmentActivity, Lifecycle lifecycle) {
        ThreeDSecureLifecycleObserver threeDSecureLifecycleObserver = new ThreeDSecureLifecycleObserver(fragmentActivity.getActivityResultRegistry(), this);
        this.observer = threeDSecureLifecycleObserver;
        lifecycle.addObserver(threeDSecureLifecycleObserver);
    }

    public void setListener(ThreeDSecureListener threeDSecureListener) {
        this.listener = threeDSecureListener;
        BrowserSwitchResult browserSwitchResult = this.pendingBrowserSwitchResult;
        if (browserSwitchResult != null) {
            deliverBrowserSwitchResultToListener(browserSwitchResult);
        }
    }

    public void performVerification(final FragmentActivity fragmentActivity, final ThreeDSecureRequest threeDSecureRequest, final ThreeDSecureResultCallback threeDSecureResultCallback) {
        if (threeDSecureRequest.getAmount() == null || threeDSecureRequest.getNonce() == null) {
            threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new InvalidArgumentException("The ThreeDSecureRequest nonce and amount cannot be null"));
        } else {
            this.braintreeClient.getConfiguration(new ConfigurationCallback() {
                public void onResult(Configuration configuration, Exception exc) {
                    if (configuration == null) {
                        threeDSecureResultCallback.onResult((ThreeDSecureResult) null, exc);
                    } else if (!configuration.isThreeDSecureEnabled()) {
                        threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new BraintreeException("Three D Secure is not enabled for this account. Please contact Braintree Support for assistance."));
                    } else if ("1".equals(threeDSecureRequest.getVersionRequested())) {
                        threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new BraintreeException("3D Secure v1 is deprecated and no longer supported. See https://developer.paypal.com/braintree/docs/guides/3d-secure/client-side/android/v4 for more information."));
                    } else if (configuration.getCardinalAuthenticationJwt() == null) {
                        threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new BraintreeException("Merchant is not configured for 3DS 2.0. Please contact Braintree Support for assistance."));
                    } else {
                        ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.initialized");
                        try {
                            ThreeDSecureClient.this.cardinalClient.initialize(fragmentActivity, configuration, threeDSecureRequest, new CardinalInitializeCallback() {
                                public void onResult(String str, Exception exc) {
                                    if (str != null) {
                                        ThreeDSecureClient.this.api.performLookup(threeDSecureRequest, ThreeDSecureClient.this.cardinalClient.getConsumerSessionId(), threeDSecureResultCallback);
                                        ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.cardinal-sdk.init.setup-completed");
                                        return;
                                    }
                                    ThreeDSecureClient.this.api.performLookup(threeDSecureRequest, ThreeDSecureClient.this.cardinalClient.getConsumerSessionId(), threeDSecureResultCallback);
                                    ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.cardinal-sdk.init.setup-failed");
                                }
                            });
                        } catch (BraintreeException e) {
                            ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.cardinal-sdk.init.failed");
                            threeDSecureResultCallback.onResult((ThreeDSecureResult) null, e);
                        }
                    }
                }
            });
        }
    }

    public void prepareLookup(final Context context, final ThreeDSecureRequest threeDSecureRequest, final ThreeDSecurePrepareLookupCallback threeDSecurePrepareLookupCallback) {
        this.braintreeClient.getAuthorization(new AuthorizationCallback() {
            public void onAuthorizationResult(Authorization authorization, Exception exc) {
                if (authorization != null) {
                    final JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("authorizationFingerprint", authorization.getBearer()).put("braintreeLibraryVersion", "Android-4.45.0").put("nonce", threeDSecureRequest.getNonce()).put("clientMetadata", new JSONObject().put("requestedThreeDSecureVersion", "2").put("sdkVersion", "Android/4.45.0"));
                    } catch (JSONException unused) {
                    }
                    ThreeDSecureClient.this.braintreeClient.getConfiguration(new ConfigurationCallback() {
                        public void onResult(Configuration configuration, Exception exc) {
                            if (configuration == null) {
                                threeDSecurePrepareLookupCallback.onResult((ThreeDSecureRequest) null, (String) null, exc);
                            } else if (configuration.getCardinalAuthenticationJwt() == null) {
                                threeDSecurePrepareLookupCallback.onResult((ThreeDSecureRequest) null, (String) null, new BraintreeException("Merchant is not configured for 3DS 2.0. Please contact Braintree Support for assistance."));
                            } else {
                                try {
                                    ThreeDSecureClient.this.cardinalClient.initialize(context, configuration, threeDSecureRequest, new CardinalInitializeCallback() {
                                        public void onResult(String str, Exception exc) {
                                            if (str != null) {
                                                try {
                                                    jSONObject.put("dfReferenceId", str);
                                                } catch (JSONException unused) {
                                                }
                                            }
                                            threeDSecurePrepareLookupCallback.onResult(threeDSecureRequest, jSONObject.toString(), (Exception) null);
                                        }
                                    });
                                } catch (BraintreeException e) {
                                    ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.cardinal-sdk.init.failed");
                                    threeDSecurePrepareLookupCallback.onResult((ThreeDSecureRequest) null, (String) null, e);
                                }
                            }
                        }
                    });
                    return;
                }
                threeDSecurePrepareLookupCallback.onResult((ThreeDSecureRequest) null, (String) null, exc);
            }
        });
    }

    public void continuePerformVerification(FragmentActivity fragmentActivity, ThreeDSecureRequest threeDSecureRequest, ThreeDSecureResult threeDSecureResult) {
        continuePerformVerification(fragmentActivity, threeDSecureRequest, threeDSecureResult, new ThreeDSecureResultCallback() {
            public void onResult(ThreeDSecureResult threeDSecureResult, Exception exc) {
                if (threeDSecureResult != null) {
                    ThreeDSecureClient.this.listener.onThreeDSecureSuccess(threeDSecureResult);
                } else if (exc != null) {
                    ThreeDSecureClient.this.listener.onThreeDSecureFailure(exc);
                }
            }
        });
    }

    public void initializeChallengeWithLookupResponse(FragmentActivity fragmentActivity, String str) {
        initializeChallengeWithLookupResponse(fragmentActivity, str, (ThreeDSecureResultCallback) new ThreeDSecureResultCallback() {
            public void onResult(ThreeDSecureResult threeDSecureResult, Exception exc) {
                if (threeDSecureResult != null) {
                    ThreeDSecureClient.this.listener.onThreeDSecureSuccess(threeDSecureResult);
                } else if (exc != null) {
                    ThreeDSecureClient.this.listener.onThreeDSecureFailure(exc);
                }
            }
        });
    }

    public void initializeChallengeWithLookupResponse(FragmentActivity fragmentActivity, ThreeDSecureRequest threeDSecureRequest, String str) {
        initializeChallengeWithLookupResponse(fragmentActivity, threeDSecureRequest, str, new ThreeDSecureResultCallback() {
            public void onResult(ThreeDSecureResult threeDSecureResult, Exception exc) {
                if (threeDSecureResult != null) {
                    ThreeDSecureClient.this.listener.onThreeDSecureSuccess(threeDSecureResult);
                } else if (exc != null) {
                    ThreeDSecureClient.this.listener.onThreeDSecureFailure(exc);
                }
            }
        });
    }

    @Deprecated
    public void continuePerformVerification(FragmentActivity fragmentActivity, ThreeDSecureRequest threeDSecureRequest, ThreeDSecureResult threeDSecureResult, ThreeDSecureResultCallback threeDSecureResultCallback) {
        final FragmentActivity fragmentActivity2 = fragmentActivity;
        final ThreeDSecureRequest threeDSecureRequest2 = threeDSecureRequest;
        final ThreeDSecureResult threeDSecureResult2 = threeDSecureResult;
        final ThreeDSecureResultCallback threeDSecureResultCallback2 = threeDSecureResultCallback;
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                ThreeDSecureClient.this.startVerificationFlow(fragmentActivity2, configuration, threeDSecureRequest2, threeDSecureResult2, threeDSecureResultCallback2);
            }
        });
    }

    @Deprecated
    public void initializeChallengeWithLookupResponse(FragmentActivity fragmentActivity, String str, ThreeDSecureResultCallback threeDSecureResultCallback) {
        initializeChallengeWithLookupResponse(fragmentActivity, (ThreeDSecureRequest) null, str, threeDSecureResultCallback);
    }

    @Deprecated
    public void initializeChallengeWithLookupResponse(FragmentActivity fragmentActivity, ThreeDSecureRequest threeDSecureRequest, String str, ThreeDSecureResultCallback threeDSecureResultCallback) {
        final String str2 = str;
        final FragmentActivity fragmentActivity2 = fragmentActivity;
        final ThreeDSecureRequest threeDSecureRequest2 = threeDSecureRequest;
        final ThreeDSecureResultCallback threeDSecureResultCallback2 = threeDSecureResultCallback;
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                try {
                    Configuration configuration2 = configuration;
                    ThreeDSecureClient.this.startVerificationFlow(fragmentActivity2, configuration2, threeDSecureRequest2, ThreeDSecureResult.fromJson(str2), threeDSecureResultCallback2);
                } catch (JSONException e) {
                    threeDSecureResultCallback2.onResult((ThreeDSecureResult) null, e);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void startVerificationFlow(FragmentActivity fragmentActivity, Configuration configuration, ThreeDSecureRequest threeDSecureRequest, ThreeDSecureResult threeDSecureResult, ThreeDSecureResultCallback threeDSecureResultCallback) {
        ThreeDSecureLookup lookup = threeDSecureResult.getLookup();
        boolean z = lookup.getAcsUrl() != null;
        String threeDSecureVersion = lookup.getThreeDSecureVersion();
        this.braintreeClient.sendAnalyticsEvent(String.format("three-d-secure.verification-flow.challenge-presented.%b", new Object[]{Boolean.valueOf(z)}));
        this.braintreeClient.sendAnalyticsEvent(String.format("three-d-secure.verification-flow.3ds-version.%s", new Object[]{threeDSecureVersion}));
        if (!z) {
            ThreeDSecureInfo threeDSecureInfo = threeDSecureResult.getTokenizedCard().getThreeDSecureInfo();
            this.braintreeClient.sendAnalyticsEvent(String.format("three-d-secure.verification-flow.liability-shifted.%b", new Object[]{Boolean.valueOf(threeDSecureInfo.isLiabilityShifted())}));
            this.braintreeClient.sendAnalyticsEvent(String.format("three-d-secure.verification-flow.liability-shift-possible.%b", new Object[]{Boolean.valueOf(threeDSecureInfo.isLiabilityShiftPossible())}));
            threeDSecureResultCallback.onResult(threeDSecureResult, (Exception) null);
        } else if (!threeDSecureVersion.startsWith("2.")) {
            threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new BraintreeException("3D Secure v1 is deprecated and no longer supported. See https://developer.paypal.com/braintree/docs/guides/3d-secure/client-side/android/v4 for more information."));
        } else {
            this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.started");
            try {
                ThreeDSecureLifecycleObserver threeDSecureLifecycleObserver = this.observer;
                if (threeDSecureLifecycleObserver != null) {
                    threeDSecureLifecycleObserver.launch(threeDSecureResult);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_THREE_D_SECURE_RESULT", threeDSecureResult);
                Intent intent = new Intent(fragmentActivity, ThreeDSecureActivity.class);
                intent.putExtras(bundle);
                fragmentActivity.startActivityForResult(intent, 13487);
            } catch (RuntimeException e) {
                if (e.getCause() instanceof TransactionTooLargeException) {
                    threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new BraintreeException("The 3D Secure response returned is too large to continue. Please contact Braintree Support for assistance.", e));
                    return;
                }
                throw e;
            }
        }
    }

    @Deprecated
    public void onBrowserSwitchResult(BrowserSwitchResult browserSwitchResult, ThreeDSecureResultCallback threeDSecureResultCallback) {
        if (browserSwitchResult == null) {
            threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new BraintreeException("BrowserSwitchResult cannot be null"));
        } else if (browserSwitchResult.getStatus() != 2) {
            Uri deepLinkUrl = browserSwitchResult.getDeepLinkUrl();
            if (deepLinkUrl != null) {
                String queryParameter = deepLinkUrl.getQueryParameter("auth_response");
                try {
                    ThreeDSecureResult fromJson = ThreeDSecureResult.fromJson(queryParameter);
                    if (fromJson.hasError()) {
                        threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new ErrorWithResponse(HttpStatus.SC_UNPROCESSABLE_ENTITY, queryParameter));
                        return;
                    }
                    sendLiabilityShiftedAnalytics(fromJson);
                    threeDSecureResultCallback.onResult(fromJson, (Exception) null);
                } catch (JSONException e) {
                    threeDSecureResultCallback.onResult((ThreeDSecureResult) null, e);
                }
            }
        } else {
            threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new UserCanceledException("User canceled 3DS."));
        }
    }

    @Deprecated
    public void onActivityResult(int i, Intent intent, final ThreeDSecureResultCallback threeDSecureResultCallback) {
        if (i != -1) {
            threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new UserCanceledException("User canceled 3DS."));
            return;
        }
        ThreeDSecureResult threeDSecureResult = (ThreeDSecureResult) intent.getParcelableExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_THREE_D_SECURE_RESULT");
        ValidateResponse validateResponse = (ValidateResponse) intent.getSerializableExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_VALIDATION_RESPONSE");
        String stringExtra = intent.getStringExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_JWT");
        this.braintreeClient.sendAnalyticsEvent(String.format("three-d-secure.verification-flow.cardinal-sdk.action-code.%s", new Object[]{validateResponse.getActionCode().name().toLowerCase()}));
        switch (AnonymousClass11.$SwitchMap$com$cardinalcommerce$cardinalmobilesdk$models$CardinalActionCode[validateResponse.getActionCode().ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.api.authenticateCardinalJWT(threeDSecureResult, stringExtra, new ThreeDSecureResultCallback() {
                    public void onResult(ThreeDSecureResult threeDSecureResult, Exception exc) {
                        if (threeDSecureResult != null) {
                            if (threeDSecureResult.hasError()) {
                                ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.upgrade-payment-method.failure.returned-lookup-nonce");
                            } else {
                                ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.upgrade-payment-method.succeeded");
                                ThreeDSecureClient.this.sendLiabilityShiftedAnalytics(threeDSecureResult);
                            }
                        } else if (exc != null) {
                            ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.upgrade-payment-method.errored");
                        }
                        threeDSecureResultCallback.onResult(threeDSecureResult, exc);
                    }
                });
                this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.completed");
                return;
            case 4:
            case 5:
                threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new BraintreeException(validateResponse.getErrorDescription()));
                this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.failed");
                return;
            case 6:
                threeDSecureResultCallback.onResult((ThreeDSecureResult) null, new UserCanceledException("User canceled 3DS.", true));
                this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.canceled");
                return;
            default:
                return;
        }
    }

    /* renamed from: com.braintreepayments.api.ThreeDSecureClient$11  reason: invalid class name */
    static /* synthetic */ class AnonymousClass11 {
        static final /* synthetic */ int[] $SwitchMap$com$cardinalcommerce$cardinalmobilesdk$models$CardinalActionCode;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode[] r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$cardinalcommerce$cardinalmobilesdk$models$CardinalActionCode = r0
                com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r1 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.FAILURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$cardinalcommerce$cardinalmobilesdk$models$CardinalActionCode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r1 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$cardinalcommerce$cardinalmobilesdk$models$CardinalActionCode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r1 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.NOACTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$cardinalcommerce$cardinalmobilesdk$models$CardinalActionCode     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r1 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$cardinalcommerce$cardinalmobilesdk$models$CardinalActionCode     // Catch:{ NoSuchFieldError -> 0x003e }
                com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r1 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$cardinalcommerce$cardinalmobilesdk$models$CardinalActionCode     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r1 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.CANCEL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.ThreeDSecureClient.AnonymousClass11.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public void onBrowserSwitchResult(BrowserSwitchResult browserSwitchResult) {
        this.pendingBrowserSwitchResult = browserSwitchResult;
        if (this.listener != null) {
            deliverBrowserSwitchResultToListener(browserSwitchResult);
        }
    }

    private void deliverBrowserSwitchResultToListener(BrowserSwitchResult browserSwitchResult) {
        onBrowserSwitchResult(browserSwitchResult, new ThreeDSecureResultCallback() {
            public void onResult(ThreeDSecureResult threeDSecureResult, Exception exc) {
                if (threeDSecureResult != null) {
                    ThreeDSecureClient.this.listener.onThreeDSecureSuccess(threeDSecureResult);
                } else if (exc != null) {
                    ThreeDSecureClient.this.listener.onThreeDSecureFailure(exc);
                }
            }
        });
        this.pendingBrowserSwitchResult = null;
    }

    /* access modifiers changed from: package-private */
    public void onCardinalResult(CardinalResult cardinalResult) {
        ThreeDSecureListener threeDSecureListener;
        Exception error = cardinalResult.getError();
        if (error == null || (threeDSecureListener = this.listener) == null) {
            ThreeDSecureResult threeSecureResult = cardinalResult.getThreeSecureResult();
            ValidateResponse validateResponse = cardinalResult.getValidateResponse();
            String jwt = cardinalResult.getJWT();
            this.braintreeClient.sendAnalyticsEvent(String.format("three-d-secure.verification-flow.cardinal-sdk.action-code.%s", new Object[]{validateResponse.getActionCode().name().toLowerCase()}));
            switch (AnonymousClass11.$SwitchMap$com$cardinalcommerce$cardinalmobilesdk$models$CardinalActionCode[validateResponse.getActionCode().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    this.api.authenticateCardinalJWT(threeSecureResult, jwt, new ThreeDSecureResultCallback() {
                        public void onResult(ThreeDSecureResult threeDSecureResult, Exception exc) {
                            if (threeDSecureResult != null) {
                                if (threeDSecureResult.hasError()) {
                                    ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.upgrade-payment-method.failure.returned-lookup-nonce");
                                } else {
                                    ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.upgrade-payment-method.succeeded");
                                    ThreeDSecureClient.this.sendLiabilityShiftedAnalytics(threeDSecureResult);
                                }
                                ThreeDSecureClient.this.listener.onThreeDSecureSuccess(threeDSecureResult);
                            } else if (exc != null) {
                                ThreeDSecureClient.this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.upgrade-payment-method.errored");
                                ThreeDSecureClient.this.listener.onThreeDSecureFailure(exc);
                            }
                        }
                    });
                    this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.completed");
                    return;
                case 4:
                case 5:
                    this.listener.onThreeDSecureFailure(new BraintreeException(validateResponse.getErrorDescription()));
                    this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.failed");
                    return;
                case 6:
                    this.listener.onThreeDSecureFailure(new UserCanceledException("User canceled 3DS.", true));
                    this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.canceled");
                    return;
                default:
                    return;
            }
        } else {
            threeDSecureListener.onThreeDSecureFailure(error);
        }
    }

    /* access modifiers changed from: private */
    public void sendLiabilityShiftedAnalytics(ThreeDSecureResult threeDSecureResult) {
        ThreeDSecureInfo threeDSecureInfo = threeDSecureResult.getTokenizedCard().getThreeDSecureInfo();
        this.braintreeClient.sendAnalyticsEvent(String.format("three-d-secure.verification-flow.liability-shifted.%b", new Object[]{Boolean.valueOf(threeDSecureInfo.isLiabilityShifted())}));
        this.braintreeClient.sendAnalyticsEvent(String.format("three-d-secure.verification-flow.liability-shift-possible.%b", new Object[]{Boolean.valueOf(threeDSecureInfo.isLiabilityShiftPossible())}));
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
}
