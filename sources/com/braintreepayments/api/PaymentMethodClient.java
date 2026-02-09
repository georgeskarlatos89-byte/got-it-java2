package com.braintreepayments.api;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PaymentMethodClient {
    private static final String CLIENT_SDK_META_DATA = "clientSdkMetadata";
    private static final String INPUT = "input";
    private static final String PAYMENT_METHOD_NONCE_COLLECTION_KEY = "paymentMethods";
    private static final String PAYMENT_METHOD_TYPE_CARD = "CreditCard";
    private static final String PAYMENT_METHOD_TYPE_KEY = "type";
    private static final String PAYMENT_METHOD_TYPE_PAYPAL = "PayPalAccount";
    private static final String PAYMENT_METHOD_TYPE_VENMO = "VenmoAccount";
    private static final String SINGLE_USE_TOKEN_ID = "singleUseTokenId";
    private static final String VARIABLES = "variables";
    /* access modifiers changed from: private */
    public final BraintreeClient braintreeClient;

    public PaymentMethodClient(BraintreeClient braintreeClient2) {
        this.braintreeClient = braintreeClient2;
    }

    private static List<PaymentMethodNonce> parsePaymentMethodNonces(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray(PAYMENT_METHOD_NONCE_COLLECTION_KEY);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            PaymentMethodNonce parseVaultSupportedPaymentMethodNonce = parseVaultSupportedPaymentMethodNonce(jSONArray.getJSONObject(i));
            if (parseVaultSupportedPaymentMethodNonce != null) {
                arrayList.add(parseVaultSupportedPaymentMethodNonce);
            }
        }
        return arrayList;
    }

    private static PaymentMethodNonce parseVaultSupportedPaymentMethodNonce(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("type");
        string.hashCode();
        char c = 65535;
        switch (string.hashCode()) {
            case -1807185524:
                if (string.equals(PAYMENT_METHOD_TYPE_VENMO)) {
                    c = 0;
                    break;
                }
                break;
            case 1212590010:
                if (string.equals(PAYMENT_METHOD_TYPE_PAYPAL)) {
                    c = 1;
                    break;
                }
                break;
            case 1428640201:
                if (string.equals(PAYMENT_METHOD_TYPE_CARD)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return VenmoAccountNonce.fromJSON(jSONObject);
            case 1:
                return PayPalAccountNonce.fromJSON(jSONObject);
            case 2:
                return CardNonce.fromJSON(jSONObject);
            default:
                return null;
        }
    }

    public void getPaymentMethodNonces(boolean z, GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback) {
        this.braintreeClient.sendGET(Uri.parse(ApiClient.versionedPath(ApiClient.PAYMENT_METHOD_ENDPOINT)).buildUpon().appendQueryParameter("default_first", String.valueOf(z)).appendQueryParameter(SDKAnalyticsEvents.PARAMETER_SESSION_ID, this.braintreeClient.getSessionId()).build().toString(), new PaymentMethodClient$$ExternalSyntheticLambda0(this, getPaymentMethodNoncesCallback));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getPaymentMethodNonces$0$com-braintreepayments-api-PaymentMethodClient  reason: not valid java name */
    public /* synthetic */ void m393lambda$getPaymentMethodNonces$0$combraintreepaymentsapiPaymentMethodClient(GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback, String str, Exception exc) {
        if (str != null) {
            try {
                getPaymentMethodNoncesCallback.onResult(parsePaymentMethodNonces(str), (Exception) null);
                this.braintreeClient.sendAnalyticsEvent("get-payment-methods.succeeded");
            } catch (JSONException e) {
                getPaymentMethodNoncesCallback.onResult((List<PaymentMethodNonce>) null, e);
                this.braintreeClient.sendAnalyticsEvent("get-payment-methods.failed");
            }
        } else {
            getPaymentMethodNoncesCallback.onResult((List<PaymentMethodNonce>) null, exc);
            this.braintreeClient.sendAnalyticsEvent("get-payment-methods.failed");
        }
    }

    /* access modifiers changed from: package-private */
    public void getPaymentMethodNonces(GetPaymentMethodNoncesCallback getPaymentMethodNoncesCallback) {
        getPaymentMethodNonces(false, getPaymentMethodNoncesCallback);
    }

    public void deletePaymentMethod(final Context context, final PaymentMethodNonce paymentMethodNonce, final DeletePaymentMethodNonceCallback deletePaymentMethodNonceCallback) {
        this.braintreeClient.getAuthorization(new AuthorizationCallback() {
            public void onAuthorizationResult(Authorization authorization, Exception exc) {
                if (!(authorization instanceof ClientToken)) {
                    deletePaymentMethodNonceCallback.onResult((PaymentMethodNonce) null, new BraintreeException("A client token with a customer id must be used to delete a payment method nonce."));
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject.put(PaymentMethodClient.CLIENT_SDK_META_DATA, new MetadataBuilder().sessionId(PaymentMethodClient.this.braintreeClient.getSessionId()).source("client").integration(PaymentMethodClient.this.braintreeClient.getIntegrationType()).build());
                    jSONObject.put("query", GraphQLQueryHelper.getQuery(context, R.raw.delete_payment_method_mutation));
                    jSONObject3.put(PaymentMethodClient.SINGLE_USE_TOKEN_ID, paymentMethodNonce.getString());
                    jSONObject2.put("input", jSONObject3);
                    jSONObject.put("variables", jSONObject2);
                    jSONObject.put("operationName", "DeletePaymentMethodFromSingleUseToken");
                } catch (Resources.NotFoundException | IOException | JSONException unused) {
                    deletePaymentMethodNonceCallback.onResult((PaymentMethodNonce) null, new BraintreeException("Unable to read GraphQL query"));
                }
                PaymentMethodClient.this.braintreeClient.sendGraphQLPOST(jSONObject.toString(), new PaymentMethodClient$1$$ExternalSyntheticLambda0(this, deletePaymentMethodNonceCallback, paymentMethodNonce));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: lambda$onAuthorizationResult$0$com-braintreepayments-api-PaymentMethodClient$1  reason: not valid java name */
            public /* synthetic */ void m394lambda$onAuthorizationResult$0$combraintreepaymentsapiPaymentMethodClient$1(DeletePaymentMethodNonceCallback deletePaymentMethodNonceCallback, PaymentMethodNonce paymentMethodNonce, String str, Exception exc) {
                if (str != null) {
                    deletePaymentMethodNonceCallback.onResult(paymentMethodNonce, (Exception) null);
                    PaymentMethodClient.this.braintreeClient.sendAnalyticsEvent("delete-payment-methods.succeeded");
                    return;
                }
                deletePaymentMethodNonceCallback.onResult((PaymentMethodNonce) null, new PaymentMethodDeleteException(paymentMethodNonce, exc));
                PaymentMethodClient.this.braintreeClient.sendAnalyticsEvent("delete-payment-methods.failed");
            }
        });
    }
}
