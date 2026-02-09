package com.braintreepayments.api;

import com.braintreepayments.cardform.utils.CardType;

class PaymentMethodInspector {
    private static final String PAYMENT_METHOD_AMEX = "American Express";
    private static final String PAYMENT_METHOD_DINERS_CLUB = "Diners";
    private static final String PAYMENT_METHOD_DISCOVER = "Discover";
    private static final String PAYMENT_METHOD_GOOGLE_PAY = "Google Pay";
    private static final String PAYMENT_METHOD_HIPER = "Hiper";
    private static final String PAYMENT_METHOD_HIPERCARD = "Hipercard";
    private static final String PAYMENT_METHOD_JCB = "JCB";
    private static final String PAYMENT_METHOD_MAESTRO = "Maestro";
    private static final String PAYMENT_METHOD_MASTERCARD = "MasterCard";
    private static final String PAYMENT_METHOD_PAYPAL = "PayPal";
    private static final String PAYMENT_METHOD_UNION_PAY = "UnionPay";
    private static final String PAYMENT_METHOD_VENMO = "Venmo";
    private static final String PAYMENT_METHOD_VISA = "Visa";

    PaymentMethodInspector() {
    }

    /* access modifiers changed from: package-private */
    public String getPaymentMethodDescription(PaymentMethodNonce paymentMethodNonce) {
        if (paymentMethodNonce instanceof CardNonce) {
            return ((CardNonce) paymentMethodNonce).getLastFour();
        }
        if (paymentMethodNonce instanceof PayPalAccountNonce) {
            return ((PayPalAccountNonce) paymentMethodNonce).getEmail();
        }
        if (paymentMethodNonce instanceof VenmoAccountNonce) {
            return ((VenmoAccountNonce) paymentMethodNonce).getUsername();
        }
        return paymentMethodNonce instanceof GooglePayCardNonce ? ((GooglePayCardNonce) paymentMethodNonce).getLastFour() : "";
    }

    /* access modifiers changed from: package-private */
    public DropInPaymentMethod getPaymentMethod(PaymentMethodNonce paymentMethodNonce) {
        String paymentMethodCanonicalName = getPaymentMethodCanonicalName(paymentMethodNonce);
        if (paymentMethodCanonicalName == null) {
            return null;
        }
        paymentMethodCanonicalName.hashCode();
        char c = 65535;
        switch (paymentMethodCanonicalName.hashCode()) {
            case -1911368973:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_PAYPAL)) {
                    c = 0;
                    break;
                }
                break;
            case -1802816241:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_MAESTRO)) {
                    c = 1;
                    break;
                }
                break;
            case -298759312:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_AMEX)) {
                    c = 2;
                    break;
                }
                break;
            case -231891079:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_UNION_PAY)) {
                    c = 3;
                    break;
                }
                break;
            case -46205774:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_MASTERCARD)) {
                    c = 4;
                    break;
                }
                break;
            case 73257:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_JCB)) {
                    c = 5;
                    break;
                }
                break;
            case 2666593:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_VISA)) {
                    c = 6;
                    break;
                }
                break;
            case 69732444:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_HIPER)) {
                    c = 7;
                    break;
                }
                break;
            case 82540897:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_VENMO)) {
                    c = 8;
                    break;
                }
                break;
            case 337828873:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_DISCOVER)) {
                    c = 9;
                    break;
                }
                break;
            case 456735297:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_GOOGLE_PAY)) {
                    c = 10;
                    break;
                }
                break;
            case 639825260:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_HIPERCARD)) {
                    c = 11;
                    break;
                }
                break;
            case 2047129693:
                if (paymentMethodCanonicalName.equals(PAYMENT_METHOD_DINERS_CLUB)) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return DropInPaymentMethod.PAYPAL;
            case 1:
                return DropInPaymentMethod.MAESTRO;
            case 2:
                return DropInPaymentMethod.AMEX;
            case 3:
                return DropInPaymentMethod.UNIONPAY;
            case 4:
                return DropInPaymentMethod.MASTERCARD;
            case 5:
                return DropInPaymentMethod.JCB;
            case 6:
                return DropInPaymentMethod.VISA;
            case 7:
                return DropInPaymentMethod.HIPER;
            case 8:
                return DropInPaymentMethod.VENMO;
            case 9:
                return DropInPaymentMethod.DISCOVER;
            case 10:
                return DropInPaymentMethod.GOOGLE_PAY;
            case 11:
                return DropInPaymentMethod.HIPERCARD;
            case 12:
                return DropInPaymentMethod.DINERS_CLUB;
            default:
                return null;
        }
    }

    private String getPaymentMethodCanonicalName(PaymentMethodNonce paymentMethodNonce) {
        if (paymentMethodNonce instanceof CardNonce) {
            return ((CardNonce) paymentMethodNonce).getCardType();
        }
        if (paymentMethodNonce instanceof PayPalAccountNonce) {
            return PAYMENT_METHOD_PAYPAL;
        }
        if (paymentMethodNonce instanceof VenmoAccountNonce) {
            return PAYMENT_METHOD_VENMO;
        }
        if (paymentMethodNonce instanceof GooglePayCardNonce) {
            return PAYMENT_METHOD_GOOGLE_PAY;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CardType getCardTypeFromString(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1802816241:
                if (str.equals(PAYMENT_METHOD_MAESTRO)) {
                    c = 0;
                    break;
                }
                break;
            case -298759312:
                if (str.equals(PAYMENT_METHOD_AMEX)) {
                    c = 1;
                    break;
                }
                break;
            case -231891079:
                if (str.equals(PAYMENT_METHOD_UNION_PAY)) {
                    c = 2;
                    break;
                }
                break;
            case -46205774:
                if (str.equals(PAYMENT_METHOD_MASTERCARD)) {
                    c = 3;
                    break;
                }
                break;
            case 73257:
                if (str.equals(PAYMENT_METHOD_JCB)) {
                    c = 4;
                    break;
                }
                break;
            case 2666593:
                if (str.equals(PAYMENT_METHOD_VISA)) {
                    c = 5;
                    break;
                }
                break;
            case 69732444:
                if (str.equals(PAYMENT_METHOD_HIPER)) {
                    c = 6;
                    break;
                }
                break;
            case 337828873:
                if (str.equals(PAYMENT_METHOD_DISCOVER)) {
                    c = 7;
                    break;
                }
                break;
            case 639825260:
                if (str.equals(PAYMENT_METHOD_HIPERCARD)) {
                    c = 8;
                    break;
                }
                break;
            case 2047129693:
                if (str.equals(PAYMENT_METHOD_DINERS_CLUB)) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return CardType.MAESTRO;
            case 1:
                return CardType.AMEX;
            case 2:
                return CardType.UNIONPAY;
            case 3:
                return CardType.MASTERCARD;
            case 4:
                return CardType.JCB;
            case 5:
                return CardType.VISA;
            case 6:
                return CardType.HIPER;
            case 7:
                return CardType.DISCOVER;
            case 8:
                return CardType.HIPERCARD;
            case 9:
                return CardType.DINERS_CLUB;
            default:
                return null;
        }
    }
}
