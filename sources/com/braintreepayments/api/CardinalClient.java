package com.braintreepayments.api;

import android.content.Context;
import com.cardinalcommerce.cardinalmobilesdk.Cardinal;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalChallengeObserver;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalInitService;

class CardinalClient {
    /* access modifiers changed from: private */
    public String consumerSessionId;

    CardinalClient() {
    }

    /* access modifiers changed from: package-private */
    public void initialize(Context context, Configuration configuration, ThreeDSecureRequest threeDSecureRequest, final CardinalInitializeCallback cardinalInitializeCallback) throws BraintreeException {
        configureCardinal(context, configuration, threeDSecureRequest);
        try {
            Cardinal.getInstance().init(configuration.getCardinalAuthenticationJwt(), new CardinalInitService() {
                public void onSetupCompleted(String str) {
                    String unused = CardinalClient.this.consumerSessionId = str;
                    cardinalInitializeCallback.onResult(CardinalClient.this.consumerSessionId, (Exception) null);
                }

                public void onValidated(ValidateResponse validateResponse, String str) {
                    if (CardinalClient.this.consumerSessionId == null) {
                        cardinalInitializeCallback.onResult((String) null, new BraintreeException("consumer session id not available"));
                    } else {
                        cardinalInitializeCallback.onResult(CardinalClient.this.consumerSessionId, (Exception) null);
                    }
                }
            });
        } catch (RuntimeException e) {
            throw new BraintreeException("Cardinal SDK init Error.", e);
        }
    }

    /* access modifiers changed from: package-private */
    public void continueLookup(ThreeDSecureResult threeDSecureResult, CardinalChallengeObserver cardinalChallengeObserver) throws BraintreeException {
        ThreeDSecureLookup lookup = threeDSecureResult.getLookup();
        try {
            Cardinal.getInstance().cca_continue(lookup.getTransactionId(), lookup.getPareq(), cardinalChallengeObserver);
            Cardinal.getInstance().cleanup();
        } catch (RuntimeException e) {
            throw new BraintreeException("Cardinal SDK cca_continue Error.", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r1 != 3) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void configureCardinal(android.content.Context r8, com.braintreepayments.api.Configuration r9, com.braintreepayments.api.ThreeDSecureRequest r10) throws com.braintreepayments.api.BraintreeException {
        /*
            r7 = this;
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment r0 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment.STAGING
            java.lang.String r1 = "production"
            java.lang.String r9 = r9.getEnvironment()
            boolean r9 = r1.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0010
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment r0 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment.PRODUCTION
        L_0x0010:
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r9 = new com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters
            r9.<init>()
            r9.setEnvironment(r0)
            r0 = 8000(0x1f40, float:1.121E-41)
            r9.setRequestTimeout(r0)
            r0 = 1
            r9.setEnableDFSync(r0)
            int r1 = r10.getUiType()
            r2 = 3
            r3 = 2
            if (r1 == r0) goto L_0x002e
            if (r1 == r3) goto L_0x0033
            if (r1 == r2) goto L_0x0038
            goto L_0x003d
        L_0x002e:
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType r1 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType.NATIVE
            r9.setUiType(r1)
        L_0x0033:
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType r1 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType.HTML
            r9.setUiType(r1)
        L_0x0038:
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType r1 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType.BOTH
            r9.setUiType(r1)
        L_0x003d:
            java.util.List r1 = r10.getRenderTypes()
            if (r1 == 0) goto L_0x00b1
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r4 = r10.getRenderTypes()
            java.util.Iterator r4 = r4.iterator()
        L_0x0050:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x006c
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType r5 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType.OTP
            r1.put(r5)
            goto L_0x0050
        L_0x006c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x007c
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType r5 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType.SINGLE_SELECT
            r1.put(r5)
            goto L_0x0050
        L_0x007c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x008c
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType r5 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType.MULTI_SELECT
            r1.put(r5)
            goto L_0x0050
        L_0x008c:
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x009d
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType r5 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType.OOB
            r1.put(r5)
            goto L_0x0050
        L_0x009d:
            r6 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0050
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType r5 = com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType.HTML
            r1.put(r5)
            goto L_0x0050
        L_0x00ae:
            r9.setRenderType(r1)
        L_0x00b1:
            com.braintreepayments.api.ThreeDSecureV2UiCustomization r0 = r10.getV2UiCustomization()
            if (r0 == 0) goto L_0x00c2
            com.braintreepayments.api.ThreeDSecureV2UiCustomization r10 = r10.getV2UiCustomization()
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r10 = r10.getCardinalUiCustomization()
            r9.setUICustomization(r10)
        L_0x00c2:
            com.cardinalcommerce.cardinalmobilesdk.Cardinal r10 = com.cardinalcommerce.cardinalmobilesdk.Cardinal.getInstance()     // Catch:{ RuntimeException -> 0x00ca }
            r10.configure(r8, r9)     // Catch:{ RuntimeException -> 0x00ca }
            return
        L_0x00ca:
            r8 = move-exception
            com.braintreepayments.api.BraintreeException r9 = new com.braintreepayments.api.BraintreeException
            java.lang.String r10 = "Cardinal SDK configure Error."
            r9.<init>(r10, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.CardinalClient.configureCardinal(android.content.Context, com.braintreepayments.api.Configuration, com.braintreepayments.api.ThreeDSecureRequest):void");
    }

    /* access modifiers changed from: package-private */
    public String getConsumerSessionId() {
        return this.consumerSessionId;
    }
}
