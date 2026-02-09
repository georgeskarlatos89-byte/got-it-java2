package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import java.util.List;

public class DropInClient {
    static final String EXTRA_AUTHORIZATION = "com.braintreepayments.api.EXTRA_AUTHORIZATION";
    static final String EXTRA_AUTHORIZATION_ERROR = "com.braintreepayments.api.EXTRA_AUTHORIZATION_ERROR";
    static final String EXTRA_CHECKOUT_REQUEST = "com.braintreepayments.api.EXTRA_CHECKOUT_REQUEST";
    static final String EXTRA_CHECKOUT_REQUEST_BUNDLE = "com.braintreepayments.api.EXTRA_CHECKOUT_REQUEST_BUNDLE";
    static final String EXTRA_SESSION_ID = "com.braintreepayments.api.EXTRA_SESSION_ID";
    final BraintreeClient braintreeClient;
    private final DropInRequest dropInRequest;
    /* access modifiers changed from: private */
    public final DropInSharedPreferences dropInSharedPreferences;
    /* access modifiers changed from: private */
    public final GooglePayClient googlePayClient;
    private DropInListener listener;
    DropInLifecycleObserver observer;
    private final PaymentMethodClient paymentMethodClient;

    private static DropInClientParams createDefaultParams(Context context, String str, ClientTokenProvider clientTokenProvider, DropInRequest dropInRequest2, FragmentActivity fragmentActivity, Lifecycle lifecycle) {
        BraintreeClient braintreeClient2 = new BraintreeClient(new BraintreeOptions(context, (String) null, dropInRequest2 != null ? dropInRequest2.getCustomUrlScheme() : null, str, clientTokenProvider, IntegrationType.DROP_IN));
        return new DropInClientParams().activity(fragmentActivity).lifecycle(lifecycle).dropInRequest(dropInRequest2).braintreeClient(braintreeClient2).paymentMethodClient(new PaymentMethodClient(braintreeClient2)).googlePayClient(new GooglePayClient(braintreeClient2)).dropInSharedPreferences(DropInSharedPreferences.getInstance(context.getApplicationContext()));
    }

    @Deprecated
    public DropInClient(Context context, String str, DropInRequest dropInRequest2) {
        this(createDefaultParams(context, str, (ClientTokenProvider) null, dropInRequest2, (FragmentActivity) null, (Lifecycle) null));
    }

    @Deprecated
    public DropInClient(FragmentActivity fragmentActivity, DropInRequest dropInRequest2, String str) {
        this(fragmentActivity, fragmentActivity.getLifecycle(), str, dropInRequest2);
    }

    public DropInClient(FragmentActivity fragmentActivity, String str) {
        this(fragmentActivity, fragmentActivity.getLifecycle(), str, (DropInRequest) null);
    }

    @Deprecated
    public DropInClient(Fragment fragment, DropInRequest dropInRequest2, String str) {
        this(fragment.requireActivity(), fragment.getLifecycle(), str, dropInRequest2);
    }

    public DropInClient(Fragment fragment, String str) {
        this(fragment.requireActivity(), fragment.getLifecycle(), str, (DropInRequest) null);
    }

    @Deprecated
    public DropInClient(FragmentActivity fragmentActivity, DropInRequest dropInRequest2, ClientTokenProvider clientTokenProvider) {
        this(createDefaultParams(fragmentActivity, (String) null, clientTokenProvider, dropInRequest2, fragmentActivity, fragmentActivity.getLifecycle()));
    }

    public DropInClient(FragmentActivity fragmentActivity, ClientTokenProvider clientTokenProvider) {
        this(createDefaultParams(fragmentActivity, (String) null, clientTokenProvider, (DropInRequest) null, fragmentActivity, fragmentActivity.getLifecycle()));
    }

    @Deprecated
    public DropInClient(Fragment fragment, DropInRequest dropInRequest2, ClientTokenProvider clientTokenProvider) {
        this(createDefaultParams(fragment.requireActivity(), (String) null, clientTokenProvider, dropInRequest2, fragment.requireActivity(), fragment.getLifecycle()));
    }

    public DropInClient(Fragment fragment, ClientTokenProvider clientTokenProvider) {
        this(createDefaultParams(fragment.requireActivity(), (String) null, clientTokenProvider, (DropInRequest) null, fragment.requireActivity(), fragment.getLifecycle()));
    }

    DropInClient(FragmentActivity fragmentActivity, Lifecycle lifecycle, String str, DropInRequest dropInRequest2) {
        this(createDefaultParams(fragmentActivity, str, (ClientTokenProvider) null, dropInRequest2, fragmentActivity, lifecycle));
    }

    DropInClient(DropInClientParams dropInClientParams) {
        this.dropInRequest = dropInClientParams.getDropInRequest();
        this.braintreeClient = dropInClientParams.getBraintreeClient();
        this.googlePayClient = dropInClientParams.getGooglePayClient();
        this.paymentMethodClient = dropInClientParams.getPaymentMethodClient();
        this.dropInSharedPreferences = dropInClientParams.getDropInSharedPreferences();
        FragmentActivity activity = dropInClientParams.getActivity();
        Lifecycle lifecycle = dropInClientParams.getLifecycle();
        if (activity != null && lifecycle != null) {
            addObserver(activity, lifecycle);
        }
    }

    private void addObserver(FragmentActivity fragmentActivity, Lifecycle lifecycle) {
        DropInLifecycleObserver dropInLifecycleObserver = new DropInLifecycleObserver(fragmentActivity.getActivityResultRegistry(), this);
        this.observer = dropInLifecycleObserver;
        lifecycle.addObserver(dropInLifecycleObserver);
    }

    public void setListener(DropInListener dropInListener) {
        this.listener = dropInListener;
    }

    /* access modifiers changed from: package-private */
    public void getAuthorization(AuthorizationCallback authorizationCallback) {
        this.braintreeClient.getAuthorization(authorizationCallback);
    }

    @Deprecated
    public void launchDropInForResult(FragmentActivity fragmentActivity, int i) {
        getAuthorization(new DropInClient$$ExternalSyntheticLambda2(this, fragmentActivity, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$launchDropInForResult$0$com-braintreepayments-api-DropInClient  reason: not valid java name */
    public /* synthetic */ void m376lambda$launchDropInForResult$0$combraintreepaymentsapiDropInClient(FragmentActivity fragmentActivity, int i, Authorization authorization, Exception exc) {
        if (authorization != null) {
            if (this.observer != null) {
                this.observer.launch(new DropInIntentData(this.dropInRequest, authorization, this.braintreeClient.getSessionId()));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(EXTRA_CHECKOUT_REQUEST, this.dropInRequest);
            fragmentActivity.startActivityForResult(new Intent(fragmentActivity, DropInActivity.class).putExtra(EXTRA_CHECKOUT_REQUEST_BUNDLE, bundle).putExtra(EXTRA_SESSION_ID, this.braintreeClient.getSessionId()).putExtra(EXTRA_AUTHORIZATION, authorization.toString()), i);
        } else if (exc != null) {
            DropInListener dropInListener = this.listener;
            if (dropInListener != null) {
                dropInListener.onDropInFailure(exc);
            } else {
                fragmentActivity.startActivityForResult(new Intent(fragmentActivity, DropInActivity.class).putExtra(EXTRA_AUTHORIZATION_ERROR, exc), i);
            }
        }
    }

    @Deprecated
    public void launchDropIn() {
        getAuthorization(new DropInClient$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$launchDropIn$1$com-braintreepayments-api-DropInClient  reason: not valid java name */
    public /* synthetic */ void m374lambda$launchDropIn$1$combraintreepaymentsapiDropInClient(Authorization authorization, Exception exc) {
        DropInListener dropInListener;
        if (authorization != null && this.observer != null) {
            this.observer.launch(new DropInIntentData(this.dropInRequest, authorization, this.braintreeClient.getSessionId()));
        } else if (exc != null && (dropInListener = this.listener) != null) {
            dropInListener.onDropInFailure(exc);
        }
    }

    public void launchDropIn(DropInRequest dropInRequest2) {
        getAuthorization(new DropInClient$$ExternalSyntheticLambda3(this, dropInRequest2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$launchDropIn$2$com-braintreepayments-api-DropInClient  reason: not valid java name */
    public /* synthetic */ void m375lambda$launchDropIn$2$combraintreepaymentsapiDropInClient(DropInRequest dropInRequest2, Authorization authorization, Exception exc) {
        DropInListener dropInListener;
        if (authorization != null && this.observer != null) {
            this.observer.launch(new DropInIntentData(dropInRequest2, authorization, this.braintreeClient.getSessionId()));
        } else if (exc != null && (dropInListener = this.listener) != null) {
            dropInListener.onDropInFailure(exc);
        }
    }

    public void fetchMostRecentPaymentMethod(final FragmentActivity fragmentActivity, final FetchMostRecentPaymentMethodCallback fetchMostRecentPaymentMethodCallback) {
        getAuthorization(new AuthorizationCallback() {
            public void onAuthorizationResult(Authorization authorization, Exception exc) {
                if (authorization == null) {
                    fetchMostRecentPaymentMethodCallback.onResult((DropInResult) null, exc);
                } else if (!(authorization instanceof ClientToken)) {
                    fetchMostRecentPaymentMethodCallback.onResult((DropInResult) null, new InvalidArgumentException("DropInClient#fetchMostRecentPaymentMethods() must be called with a client token"));
                } else if (DropInClient.this.dropInSharedPreferences.getLastUsedPaymentMethod() == DropInPaymentMethod.GOOGLE_PAY) {
                    DropInClient.this.googlePayClient.isReadyToPay(fragmentActivity, new DropInClient$1$$ExternalSyntheticLambda0(this, fetchMostRecentPaymentMethodCallback));
                } else {
                    DropInClient.this.getPaymentMethodNonces(fetchMostRecentPaymentMethodCallback);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: lambda$onAuthorizationResult$0$com-braintreepayments-api-DropInClient$1  reason: not valid java name */
            public /* synthetic */ void m377lambda$onAuthorizationResult$0$combraintreepaymentsapiDropInClient$1(FetchMostRecentPaymentMethodCallback fetchMostRecentPaymentMethodCallback, boolean z, Exception exc) {
                if (z) {
                    DropInResult dropInResult = new DropInResult();
                    dropInResult.setPaymentMethodType(DropInPaymentMethod.GOOGLE_PAY);
                    fetchMostRecentPaymentMethodCallback.onResult(dropInResult, (Exception) null);
                    return;
                }
                DropInClient.this.getPaymentMethodNonces(fetchMostRecentPaymentMethodCallback);
            }
        });
    }

    /* access modifiers changed from: private */
    public void getPaymentMethodNonces(FetchMostRecentPaymentMethodCallback fetchMostRecentPaymentMethodCallback) {
        this.paymentMethodClient.getPaymentMethodNonces(new DropInClient$$ExternalSyntheticLambda1(fetchMostRecentPaymentMethodCallback));
    }

    static /* synthetic */ void lambda$getPaymentMethodNonces$3(FetchMostRecentPaymentMethodCallback fetchMostRecentPaymentMethodCallback, List list, Exception exc) {
        if (list != null) {
            DropInResult dropInResult = new DropInResult();
            if (list.size() > 0) {
                dropInResult.setPaymentMethodNonce((PaymentMethodNonce) list.get(0));
            }
            fetchMostRecentPaymentMethodCallback.onResult(dropInResult, (Exception) null);
        } else if (exc != null) {
            fetchMostRecentPaymentMethodCallback.onResult((DropInResult) null, exc);
        }
    }

    /* access modifiers changed from: package-private */
    public void onDropInResult(DropInResult dropInResult) {
        if (dropInResult != null && this.listener != null) {
            Exception error = dropInResult.getError();
            if (error != null) {
                this.listener.onDropInFailure(error);
            } else {
                this.listener.onDropInSuccess(dropInResult);
            }
        }
    }

    public void invalidateClientToken() {
        this.braintreeClient.invalidateClientToken();
    }
}
