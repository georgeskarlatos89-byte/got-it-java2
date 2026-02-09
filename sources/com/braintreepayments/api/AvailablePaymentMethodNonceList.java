package com.braintreepayments.api;

import java.util.ArrayList;
import java.util.List;

class AvailablePaymentMethodNonceList {
    private final List<PaymentMethodNonce> items = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r5.isVenmoEnabled() != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r5.getSupportedCardTypes().isEmpty() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r7.isGooglePayDisabled() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r5.isPayPalEnabled() != false) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x000e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    AvailablePaymentMethodNonceList(com.braintreepayments.api.Configuration r5, java.util.List<com.braintreepayments.api.PaymentMethodNonce> r6, com.braintreepayments.api.DropInRequest r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.items = r0
            java.util.Iterator r6 = r6.iterator()
        L_0x000e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r6.next()
            com.braintreepayments.api.PaymentMethodNonce r0 = (com.braintreepayments.api.PaymentMethodNonce) r0
            boolean r1 = r0 instanceof com.braintreepayments.api.PayPalAccountNonce
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0030
            boolean r1 = r7.isPayPalDisabled()
            if (r1 != 0) goto L_0x002d
            boolean r1 = r5.isPayPalEnabled()
            if (r1 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = r3
        L_0x002e:
            r3 = r2
            goto L_0x0063
        L_0x0030:
            boolean r1 = r0 instanceof com.braintreepayments.api.VenmoAccountNonce
            if (r1 == 0) goto L_0x0041
            boolean r1 = r7.isVenmoDisabled()
            if (r1 != 0) goto L_0x002d
            boolean r1 = r5.isVenmoEnabled()
            if (r1 == 0) goto L_0x002d
            goto L_0x002e
        L_0x0041:
            boolean r1 = r0 instanceof com.braintreepayments.api.CardNonce
            if (r1 == 0) goto L_0x0056
            boolean r1 = r7.isCardDisabled()
            if (r1 != 0) goto L_0x002d
            java.util.List r1 = r5.getSupportedCardTypes()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x002d
            goto L_0x002e
        L_0x0056:
            boolean r1 = r0 instanceof com.braintreepayments.api.GooglePayCardNonce
            if (r1 == 0) goto L_0x0063
            if (r8 == 0) goto L_0x002d
            boolean r1 = r7.isGooglePayDisabled()
            if (r1 != 0) goto L_0x002d
            goto L_0x002e
        L_0x0063:
            if (r3 == 0) goto L_0x000e
            java.util.List<com.braintreepayments.api.PaymentMethodNonce> r1 = r4.items
            r1.add(r0)
            goto L_0x000e
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.AvailablePaymentMethodNonceList.<init>(com.braintreepayments.api.Configuration, java.util.List, com.braintreepayments.api.DropInRequest, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public int size() {
        return this.items.size();
    }

    /* access modifiers changed from: package-private */
    public PaymentMethodNonce get(int i) {
        return this.items.get(i);
    }

    public List<PaymentMethodNonce> getItems() {
        return this.items;
    }
}
