package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.braintreepayments.cardform.utils.CardType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class DropInInternalClient {
    private static final String CARD_TYPE_UNION_PAY = "UnionPay";
    final BraintreeClient braintreeClient;
    private final CardClient cardClient;
    private final DataCollector dataCollector;
    private final DropInRequest dropInRequest;
    private final DropInSharedPreferences dropInSharedPreferences;
    private final GooglePayClient googlePayClient;
    private final PayPalClient payPalClient;
    private final PaymentMethodClient paymentMethodClient;
    private final PaymentMethodInspector paymentMethodInspector;
    private final ThreeDSecureClient threeDSecureClient;
    private final UnionPayClient unionPayClient;
    private final VenmoClient venmoClient;

    private static DropInInternalClientParams createDefaultParams(Context context, String str, DropInRequest dropInRequest2, String str2) {
        BraintreeClient braintreeClient2 = new BraintreeClient(new BraintreeOptions(context, str2, dropInRequest2.getCustomUrlScheme(), str, (ClientTokenProvider) null, IntegrationType.DROP_IN));
        return new DropInInternalClientParams().dropInRequest(dropInRequest2).braintreeClient(braintreeClient2).threeDSecureClient(new ThreeDSecureClient(braintreeClient2)).paymentMethodClient(new PaymentMethodClient(braintreeClient2)).payPalClient(new PayPalClient(braintreeClient2)).venmoClient(new VenmoClient(braintreeClient2)).cardClient(new CardClient(braintreeClient2)).unionPayClient(new UnionPayClient(braintreeClient2)).dataCollector(new DataCollector(braintreeClient2)).googlePayClient(new GooglePayClient(braintreeClient2)).dropInSharedPreferences(DropInSharedPreferences.getInstance(context.getApplicationContext()));
    }

    DropInInternalClient(FragmentActivity fragmentActivity, String str, String str2, DropInRequest dropInRequest2) {
        this(createDefaultParams(fragmentActivity, str, dropInRequest2, str2));
    }

    DropInInternalClient(DropInInternalClientParams dropInInternalClientParams) {
        this.paymentMethodInspector = new PaymentMethodInspector();
        this.dropInRequest = dropInInternalClientParams.getDropInRequest();
        this.braintreeClient = dropInInternalClientParams.getBraintreeClient();
        this.googlePayClient = dropInInternalClientParams.getGooglePayClient();
        this.paymentMethodClient = dropInInternalClientParams.getPaymentMethodClient();
        this.threeDSecureClient = dropInInternalClientParams.getThreeDSecureClient();
        this.payPalClient = dropInInternalClientParams.getPayPalClient();
        this.venmoClient = dropInInternalClientParams.getVenmoClient();
        this.cardClient = dropInInternalClientParams.getCardClient();
        this.unionPayClient = dropInInternalClientParams.getUnionPayClient();
        this.dataCollector = dropInInternalClientParams.getDataCollector();
        this.dropInSharedPreferences = dropInInternalClientParams.getDropInSharedPreferences();
    }

    /* access modifiers changed from: package-private */
    public void getAuthorization(AuthorizationCallback authorizationCallback) {
        this.braintreeClient.getAuthorization(authorizationCallback);
    }

    /* access modifiers changed from: package-private */
    public void getConfiguration(ConfigurationCallback configurationCallback) {
        this.braintreeClient.getConfiguration(configurationCallback);
    }

    /* access modifiers changed from: package-private */
    public void sendAnalyticsEvent(String str) {
        this.braintreeClient.sendAnalyticsEvent(str);
    }

    /* access modifiers changed from: package-private */
    public void collectDeviceData(FragmentActivity fragmentActivity, boolean z, DataCollectorCallback dataCollectorCallback) {
        this.dataCollector.collectDeviceData((Context) fragmentActivity, new DataCollectorRequest(z), dataCollectorCallback);
    }

    /* access modifiers changed from: package-private */
    public void performThreeDSecureVerification(FragmentActivity fragmentActivity, PaymentMethodNonce paymentMethodNonce, DropInResultCallback dropInResultCallback) {
        ThreeDSecureRequest threeDSecureRequest = this.dropInRequest.getThreeDSecureRequest();
        threeDSecureRequest.setNonce(paymentMethodNonce.getString());
        this.threeDSecureClient.performVerification(fragmentActivity, threeDSecureRequest, new DropInInternalClient$$ExternalSyntheticLambda10(this, fragmentActivity, threeDSecureRequest, dropInResultCallback));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$performThreeDSecureVerification$2$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m390lambda$performThreeDSecureVerification$2$combraintreepaymentsapiDropInInternalClient(FragmentActivity fragmentActivity, ThreeDSecureRequest threeDSecureRequest, DropInResultCallback dropInResultCallback, ThreeDSecureResult threeDSecureResult, Exception exc) {
        if (threeDSecureResult != null) {
            this.threeDSecureClient.continuePerformVerification(fragmentActivity, threeDSecureRequest, threeDSecureResult, new DropInInternalClient$$ExternalSyntheticLambda4(this, dropInResultCallback, fragmentActivity));
        } else {
            dropInResultCallback.onResult((DropInResult) null, exc);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$performThreeDSecureVerification$1$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m389lambda$performThreeDSecureVerification$1$combraintreepaymentsapiDropInInternalClient(DropInResultCallback dropInResultCallback, FragmentActivity fragmentActivity, ThreeDSecureResult threeDSecureResult, Exception exc) {
        if (exc != null) {
            dropInResultCallback.onResult((DropInResult) null, exc);
        } else if (threeDSecureResult != null) {
            DropInResult dropInResult = new DropInResult();
            dropInResult.setPaymentMethodNonce(threeDSecureResult.getTokenizedCard());
            collectDeviceData(fragmentActivity, this.dropInRequest.hasUserLocationConsent(), new DropInInternalClient$$ExternalSyntheticLambda8(dropInResult, dropInResultCallback));
        }
    }

    static /* synthetic */ void lambda$performThreeDSecureVerification$0(DropInResult dropInResult, DropInResultCallback dropInResultCallback, String str, Exception exc) {
        if (str != null) {
            dropInResult.setDeviceData(str);
            dropInResultCallback.onResult(dropInResult, (Exception) null);
            return;
        }
        dropInResultCallback.onResult((DropInResult) null, exc);
    }

    /* access modifiers changed from: package-private */
    public void shouldRequestThreeDSecureVerification(PaymentMethodNonce paymentMethodNonce, ShouldRequestThreeDSecureVerification shouldRequestThreeDSecureVerification) {
        if (paymentMethodCanPerformThreeDSecureVerification(paymentMethodNonce)) {
            this.braintreeClient.getConfiguration(new DropInInternalClient$$ExternalSyntheticLambda13(this, shouldRequestThreeDSecureVerification));
        } else {
            shouldRequestThreeDSecureVerification.onResult(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$shouldRequestThreeDSecureVerification$3$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m391lambda$shouldRequestThreeDSecureVerification$3$combraintreepaymentsapiDropInInternalClient(ShouldRequestThreeDSecureVerification shouldRequestThreeDSecureVerification, Configuration configuration, Exception exc) {
        boolean z = false;
        if (configuration == null) {
            shouldRequestThreeDSecureVerification.onResult(false);
            return;
        }
        boolean z2 = this.dropInRequest.getThreeDSecureRequest() != null && !TextUtils.isEmpty(this.dropInRequest.getThreeDSecureRequest().getAmount());
        if (configuration.isThreeDSecureEnabled() && z2) {
            z = true;
        }
        shouldRequestThreeDSecureVerification.onResult(z);
    }

    /* access modifiers changed from: package-private */
    public void tokenizePayPalRequest(FragmentActivity fragmentActivity, PayPalFlowStartedCallback payPalFlowStartedCallback) {
        PayPalRequest payPalRequest = this.dropInRequest.getPayPalRequest();
        if (payPalRequest == null) {
            payPalRequest = new PayPalVaultRequest(this.dropInRequest.hasUserLocationConsent());
        }
        this.payPalClient.tokenizePayPalAccount(fragmentActivity, payPalRequest, payPalFlowStartedCallback);
    }

    /* access modifiers changed from: package-private */
    public void requestGooglePayPayment(FragmentActivity fragmentActivity, GooglePayRequestPaymentCallback googlePayRequestPaymentCallback) {
        this.googlePayClient.requestPayment(fragmentActivity, this.dropInRequest.getGooglePayRequest(), googlePayRequestPaymentCallback);
    }

    /* access modifiers changed from: package-private */
    public void tokenizeVenmoAccount(FragmentActivity fragmentActivity, VenmoTokenizeAccountCallback venmoTokenizeAccountCallback) {
        VenmoRequest venmoRequest = this.dropInRequest.getVenmoRequest();
        if (venmoRequest == null) {
            venmoRequest = new VenmoRequest(1);
        }
        this.venmoClient.tokenizeVenmoAccount(fragmentActivity, venmoRequest, venmoTokenizeAccountCallback);
    }

    /* access modifiers changed from: package-private */
    public void deletePaymentMethod(FragmentActivity fragmentActivity, PaymentMethodNonce paymentMethodNonce, DeletePaymentMethodNonceCallback deletePaymentMethodNonceCallback) {
        this.paymentMethodClient.deletePaymentMethod(fragmentActivity, paymentMethodNonce, deletePaymentMethodNonceCallback);
    }

    /* access modifiers changed from: package-private */
    public void tokenizeCard(Card card, CardTokenizeCallback cardTokenizeCallback) {
        this.cardClient.tokenize(card, cardTokenizeCallback);
    }

    /* access modifiers changed from: package-private */
    public void fetchUnionPayCapabilities(String str, UnionPayFetchCapabilitiesCallback unionPayFetchCapabilitiesCallback) {
        this.unionPayClient.fetchCapabilities(str, unionPayFetchCapabilitiesCallback);
    }

    /* access modifiers changed from: package-private */
    public void enrollUnionPay(UnionPayCard unionPayCard, UnionPayEnrollCallback unionPayEnrollCallback) {
        this.unionPayClient.enroll(unionPayCard, unionPayEnrollCallback);
    }

    /* access modifiers changed from: package-private */
    public void tokenizeUnionPay(UnionPayCard unionPayCard, UnionPayTokenizeCallback unionPayTokenizeCallback) {
        this.unionPayClient.tokenize(unionPayCard, unionPayTokenizeCallback);
    }

    /* access modifiers changed from: package-private */
    public BrowserSwitchResult getBrowserSwitchResult(FragmentActivity fragmentActivity) {
        return this.braintreeClient.getBrowserSwitchResult(fragmentActivity);
    }

    /* access modifiers changed from: package-private */
    public void deliverBrowserSwitchResult(FragmentActivity fragmentActivity, DropInResultCallback dropInResultCallback) {
        BrowserSwitchResult deliverBrowserSwitchResult = this.braintreeClient.deliverBrowserSwitchResult(fragmentActivity);
        if (deliverBrowserSwitchResult != null) {
            int requestCode = deliverBrowserSwitchResult.getRequestCode();
            if (requestCode == 13487) {
                this.threeDSecureClient.onBrowserSwitchResult(deliverBrowserSwitchResult, new DropInInternalClient$$ExternalSyntheticLambda2(this, fragmentActivity, dropInResultCallback));
            } else if (requestCode == 13591) {
                this.payPalClient.onBrowserSwitchResult(deliverBrowserSwitchResult, new DropInInternalClient$$ExternalSyntheticLambda1(this, fragmentActivity, dropInResultCallback));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$deliverBrowserSwitchResult$5$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m379lambda$deliverBrowserSwitchResult$5$combraintreepaymentsapiDropInInternalClient(FragmentActivity fragmentActivity, DropInResultCallback dropInResultCallback, ThreeDSecureResult threeDSecureResult, Exception exc) {
        m388lambda$handleVenmoActivityResult$8$combraintreepaymentsapiDropInInternalClient(fragmentActivity, threeDSecureResult != null ? threeDSecureResult.getTokenizedCard() : null, exc, dropInResultCallback);
    }

    /* access modifiers changed from: package-private */
    public void handleActivityResult(FragmentActivity fragmentActivity, int i, int i2, Intent intent, DropInResultCallback dropInResultCallback) {
        if (i == 13487) {
            handleThreeDSecureActivityResult(fragmentActivity, i2, intent, dropInResultCallback);
        } else if (i == 13488) {
            handleVenmoActivityResult(fragmentActivity, i2, intent, dropInResultCallback);
        } else if (i == 13593) {
            handleGooglePayActivityResult(fragmentActivity, i2, intent, dropInResultCallback);
        }
    }

    /* access modifiers changed from: package-private */
    public void handleThreeDSecureActivityResult(FragmentActivity fragmentActivity, int i, Intent intent, DropInResultCallback dropInResultCallback) {
        this.threeDSecureClient.onActivityResult(i, intent, new DropInInternalClient$$ExternalSyntheticLambda7(this, fragmentActivity, dropInResultCallback));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$handleThreeDSecureActivityResult$6$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m387lambda$handleThreeDSecureActivityResult$6$combraintreepaymentsapiDropInInternalClient(FragmentActivity fragmentActivity, DropInResultCallback dropInResultCallback, ThreeDSecureResult threeDSecureResult, Exception exc) {
        m388lambda$handleVenmoActivityResult$8$combraintreepaymentsapiDropInInternalClient(fragmentActivity, threeDSecureResult != null ? threeDSecureResult.getTokenizedCard() : null, exc, dropInResultCallback);
    }

    /* access modifiers changed from: package-private */
    public void handleGooglePayActivityResult(FragmentActivity fragmentActivity, int i, Intent intent, DropInResultCallback dropInResultCallback) {
        this.googlePayClient.onActivityResult(i, intent, new DropInInternalClient$$ExternalSyntheticLambda9(this, fragmentActivity, dropInResultCallback));
    }

    /* access modifiers changed from: package-private */
    public void handleVenmoActivityResult(FragmentActivity fragmentActivity, int i, Intent intent, DropInResultCallback dropInResultCallback) {
        this.venmoClient.onActivityResult(fragmentActivity, i, intent, new DropInInternalClient$$ExternalSyntheticLambda5(this, fragmentActivity, dropInResultCallback));
    }

    /* access modifiers changed from: private */
    /* renamed from: notifyDropInResult */
    public void m388lambda$handleVenmoActivityResult$8$combraintreepaymentsapiDropInInternalClient(FragmentActivity fragmentActivity, PaymentMethodNonce paymentMethodNonce, Exception exc, DropInResultCallback dropInResultCallback) {
        if (exc != null) {
            dropInResultCallback.onResult((DropInResult) null, exc);
            return;
        }
        DropInResult dropInResult = new DropInResult();
        dropInResult.setPaymentMethodNonce(paymentMethodNonce);
        collectDeviceData(fragmentActivity, this.dropInRequest.hasUserLocationConsent(), new DropInInternalClient$$ExternalSyntheticLambda15(dropInResultCallback, dropInResult));
    }

    static /* synthetic */ void lambda$notifyDropInResult$9(DropInResultCallback dropInResultCallback, DropInResult dropInResult, String str, Exception exc) {
        if (exc != null) {
            dropInResultCallback.onResult((DropInResult) null, exc);
        } else if (str != null) {
            dropInResult.setDeviceData(str);
            dropInResultCallback.onResult(dropInResult, (Exception) null);
        }
    }

    private boolean paymentMethodCanPerformThreeDSecureVerification(PaymentMethodNonce paymentMethodNonce) {
        if (paymentMethodNonce instanceof CardNonce) {
            return true;
        }
        if (paymentMethodNonce instanceof GooglePayCardNonce) {
            return !((GooglePayCardNonce) paymentMethodNonce).isNetworkTokenized();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void getSupportedPaymentMethods(FragmentActivity fragmentActivity, GetSupportedPaymentMethodsCallback getSupportedPaymentMethodsCallback) {
        this.braintreeClient.getConfiguration(new DropInInternalClient$$ExternalSyntheticLambda0(this, getSupportedPaymentMethodsCallback, fragmentActivity));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getSupportedPaymentMethods$11$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m382lambda$getSupportedPaymentMethods$11$combraintreepaymentsapiDropInInternalClient(GetSupportedPaymentMethodsCallback getSupportedPaymentMethodsCallback, FragmentActivity fragmentActivity, Configuration configuration, Exception exc) {
        if (exc != null) {
            getSupportedPaymentMethodsCallback.onResult((List<DropInPaymentMethod>) null, exc);
        } else if (!this.dropInRequest.isGooglePayDisabled()) {
            this.googlePayClient.isReadyToPay(fragmentActivity, new DropInInternalClient$$ExternalSyntheticLambda11(this, fragmentActivity, configuration, getSupportedPaymentMethodsCallback));
        } else {
            getSupportedPaymentMethodsCallback.onResult(filterSupportedPaymentMethods(fragmentActivity, configuration, false), (Exception) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getSupportedPaymentMethods$10$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m381lambda$getSupportedPaymentMethods$10$combraintreepaymentsapiDropInInternalClient(FragmentActivity fragmentActivity, Configuration configuration, GetSupportedPaymentMethodsCallback getSupportedPaymentMethodsCallback, boolean z, Exception exc) {
        getSupportedPaymentMethodsCallback.onResult(filterSupportedPaymentMethods(fragmentActivity, configuration, z), (Exception) null);
    }

    private List<DropInPaymentMethod> filterSupportedPaymentMethods(Context context, Configuration configuration, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!this.dropInRequest.isPayPalDisabled() && configuration.isPayPalEnabled()) {
            arrayList.add(DropInPaymentMethod.PAYPAL);
        }
        if (!this.dropInRequest.isVenmoDisabled() && configuration.isVenmoEnabled() && this.venmoClient.isVenmoAppSwitchAvailable(context)) {
            arrayList.add(DropInPaymentMethod.VENMO);
        }
        if (!this.dropInRequest.isCardDisabled()) {
            HashSet hashSet = new HashSet(configuration.getSupportedCardTypes());
            if (!configuration.isUnionPayEnabled()) {
                hashSet.remove(CARD_TYPE_UNION_PAY);
            }
            if (hashSet.size() > 0) {
                arrayList.add(DropInPaymentMethod.UNKNOWN);
            }
        }
        if (z && !this.dropInRequest.isGooglePayDisabled()) {
            arrayList.add(DropInPaymentMethod.GOOGLE_PAY);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void getSupportedCardTypes(GetSupportedCardTypesCallback getSupportedCardTypesCallback) {
        this.braintreeClient.getConfiguration(new DropInInternalClient$$ExternalSyntheticLambda12(this, getSupportedCardTypesCallback));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getSupportedCardTypes$12$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m380lambda$getSupportedCardTypes$12$combraintreepaymentsapiDropInInternalClient(GetSupportedCardTypesCallback getSupportedCardTypesCallback, Configuration configuration, Exception exc) {
        if (configuration != null) {
            ArrayList arrayList = new ArrayList();
            for (String cardTypeFromString : configuration.getSupportedCardTypes()) {
                CardType cardTypeFromString2 = this.paymentMethodInspector.getCardTypeFromString(cardTypeFromString);
                if (cardTypeFromString2 != null) {
                    arrayList.add(cardTypeFromString2);
                }
            }
            if (!configuration.isUnionPayEnabled()) {
                arrayList.remove(CardType.UNIONPAY);
            }
            getSupportedCardTypesCallback.onResult(arrayList, (Exception) null);
            return;
        }
        getSupportedCardTypesCallback.onResult((List<CardType>) null, exc);
    }

    /* access modifiers changed from: package-private */
    public void getVaultedPaymentMethods(FragmentActivity fragmentActivity, GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback) {
        this.braintreeClient.getConfiguration(new DropInInternalClient$$ExternalSyntheticLambda6(this, getPaymentMethodNoncesCallback, fragmentActivity));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getVaultedPaymentMethods$15$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m385lambda$getVaultedPaymentMethods$15$combraintreepaymentsapiDropInInternalClient(GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback, FragmentActivity fragmentActivity, Configuration configuration, Exception exc) {
        if (exc != null) {
            getPaymentMethodNoncesCallback.onResult((List<PaymentMethodNonce>) null, exc);
        } else {
            this.paymentMethodClient.getPaymentMethodNonces(new DropInInternalClient$$ExternalSyntheticLambda3(this, getPaymentMethodNoncesCallback, fragmentActivity, configuration));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getVaultedPaymentMethods$14$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m384lambda$getVaultedPaymentMethods$14$combraintreepaymentsapiDropInInternalClient(GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback, FragmentActivity fragmentActivity, Configuration configuration, List list, Exception exc) {
        if (exc != null) {
            getPaymentMethodNoncesCallback.onResult((List<PaymentMethodNonce>) null, exc);
        } else if (list == null) {
        } else {
            if (!this.dropInRequest.isGooglePayDisabled()) {
                this.googlePayClient.isReadyToPay(fragmentActivity, new DropInInternalClient$$ExternalSyntheticLambda14(this, configuration, list, getPaymentMethodNoncesCallback));
            } else {
                getPaymentMethodNoncesCallback.onResult(new AvailablePaymentMethodNonceList(configuration, list, this.dropInRequest, false).getItems(), (Exception) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getVaultedPaymentMethods$13$com-braintreepayments-api-DropInInternalClient  reason: not valid java name */
    public /* synthetic */ void m383lambda$getVaultedPaymentMethods$13$combraintreepaymentsapiDropInInternalClient(Configuration configuration, List list, GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback, boolean z, Exception exc) {
        getPaymentMethodNoncesCallback.onResult(new AvailablePaymentMethodNonceList(configuration, list, this.dropInRequest, z).getItems(), (Exception) null);
    }

    /* access modifiers changed from: package-private */
    public void setLastUsedPaymentMethodType(PaymentMethodNonce paymentMethodNonce) {
        this.dropInSharedPreferences.setLastUsedPaymentMethod(paymentMethodNonce);
    }
}
