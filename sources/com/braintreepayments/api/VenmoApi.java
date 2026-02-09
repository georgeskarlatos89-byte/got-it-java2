package com.braintreepayments.api;

import android.text.TextUtils;
import com.braintreepayments.api.GraphQLConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class VenmoApi {
    private final ApiClient apiClient;
    private final BraintreeClient braintreeClient;

    VenmoApi(BraintreeClient braintreeClient2, ApiClient apiClient2) {
        this.braintreeClient = braintreeClient2;
        this.apiClient = apiClient2;
    }

    /* access modifiers changed from: package-private */
    public void createPaymentContext(VenmoRequest venmoRequest, String str, final VenmoApiCallback venmoApiCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("query", "mutation CreateVenmoPaymentContext($input: CreateVenmoPaymentContextInput!) { createVenmoPaymentContext(input: $input) { venmoPaymentContext { id } } }");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("paymentMethodUsage", venmoRequest.getPaymentMethodUsageAsString());
            jSONObject2.put("merchantProfileId", str);
            jSONObject2.put("customerClient", "MOBILE_APP");
            jSONObject2.put(SDKConstants.PARAM_INTENT, "CONTINUE");
            jSONObject2.put("isFinalAmount", venmoRequest.getIsFinalAmountAsString());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("collectCustomerShippingAddress", venmoRequest.getCollectCustomerShippingAddressAsString());
            jSONObject3.put("collectCustomerBillingAddress", venmoRequest.getCollectCustomerBillingAddressAsString());
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("subTotalAmount", venmoRequest.getSubTotalAmount());
            jSONObject4.put("discountAmount", venmoRequest.getDiscountAmount());
            jSONObject4.put("taxAmount", venmoRequest.getTaxAmount());
            jSONObject4.put("shippingAmount", venmoRequest.getShippingAmount());
            jSONObject4.put("totalAmount", venmoRequest.getTotalAmount());
            if (!venmoRequest.getLineItems().isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<VenmoLineItem> it = venmoRequest.getLineItems().iterator();
                while (it.hasNext()) {
                    VenmoLineItem next = it.next();
                    if (next.getUnitTaxAmount() == null || next.getUnitTaxAmount().equals("")) {
                        next.setUnitTaxAmount("0");
                    }
                    jSONArray.put(next.toJson());
                }
                jSONObject4.put("lineItems", jSONArray);
            }
            if (jSONObject4.length() > 0) {
                jSONObject3.put("transactionDetails", jSONObject4);
            }
            jSONObject2.put("paysheetDetails", jSONObject3);
            jSONObject2.putOpt("displayName", venmoRequest.getDisplayName());
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(GraphQLConstants.Keys.INPUT, jSONObject2);
            jSONObject.put(GraphQLConstants.Keys.VARIABLES, jSONObject5);
            jSONObject.put("clientSdkMetadata", new MetadataBuilder().sessionId(this.braintreeClient.getSessionId()).integration(this.braintreeClient.getIntegrationType()).version().build());
        } catch (JSONException unused) {
            venmoApiCallback.onResult((String) null, new BraintreeException("unexpected error"));
        }
        this.braintreeClient.sendGraphQLPOST(jSONObject.toString(), new HttpResponseCallback() {
            public void onResult(String str, Exception exc) {
                if (str != null) {
                    String access$000 = VenmoApi.parsePaymentContextId(str);
                    if (TextUtils.isEmpty(access$000)) {
                        venmoApiCallback.onResult((String) null, new BraintreeException("Failed to fetch a Venmo paymentContextId while constructing the requestURL."));
                    } else {
                        venmoApiCallback.onResult(access$000, (Exception) null);
                    }
                } else {
                    venmoApiCallback.onResult((String) null, exc);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void createNonceFromPaymentContext(String str, final VenmoOnActivityResultCallback venmoOnActivityResultCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("query", "query PaymentContext($id: ID!) { node(id: $id) { ... on VenmoPaymentContext { paymentMethodId userName payerInfo { firstName lastName phoneNumber email externalId userName shippingAddress { fullName addressLine1 addressLine2 adminArea1 adminArea2 postalCode countryCode } billingAddress { fullName addressLine1 addressLine2 adminArea1 adminArea2 postalCode countryCode } } } } }");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put(GraphQLConstants.Keys.VARIABLES, jSONObject2);
            this.braintreeClient.sendGraphQLPOST(jSONObject.toString(), new HttpResponseCallback() {
                public void onResult(String str, Exception exc) {
                    if (str != null) {
                        try {
                            venmoOnActivityResultCallback.onResult(VenmoAccountNonce.fromJSON(new JSONObject(str).getJSONObject("data").getJSONObject("node")), (Exception) null);
                        } catch (JSONException e) {
                            venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, e);
                        }
                    } else {
                        venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, exc);
                    }
                }
            });
        } catch (JSONException e) {
            venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, e);
        }
    }

    /* access modifiers changed from: package-private */
    public void vaultVenmoAccountNonce(String str, final VenmoOnActivityResultCallback venmoOnActivityResultCallback) {
        VenmoAccount venmoAccount = new VenmoAccount();
        venmoAccount.setNonce(str);
        this.apiClient.tokenizeREST(venmoAccount, new TokenizeCallback() {
            public void onResult(JSONObject jSONObject, Exception exc) {
                if (jSONObject != null) {
                    try {
                        venmoOnActivityResultCallback.onResult(VenmoAccountNonce.fromJSON(jSONObject), (Exception) null);
                    } catch (JSONException e) {
                        venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, e);
                    }
                } else {
                    venmoOnActivityResultCallback.onResult((VenmoAccountNonce) null, exc);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static String parsePaymentContextId(String str) {
        try {
            return new JSONObject(str).getJSONObject("data").getJSONObject("createVenmoPaymentContext").getJSONObject("venmoPaymentContext").getString("id");
        } catch (JSONException unused) {
            return null;
        }
    }
}
