package com.braintreepayments.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

class DropInEvent {
    static final String REQUEST_KEY = "DROP_IN_EVENT_REQUEST_KEY";
    private static final String TYPE_KEY = "DROP_IN_EVENT_TYPE";
    private final Bundle bundle;

    static DropInEvent createSendAnalyticsEvent(String str) {
        DropInEvent dropInEvent = new DropInEvent(DropInEventType.SEND_ANALYTICS);
        dropInEvent.putString(DropInEventProperty.ANALYTICS_EVENT_NAME, str);
        return dropInEvent;
    }

    static DropInEvent createAddCardSubmitEvent(String str) {
        DropInEvent dropInEvent = new DropInEvent(DropInEventType.ADD_CARD_SUBMIT);
        dropInEvent.putString(DropInEventProperty.CARD_NUMBER, str);
        return dropInEvent;
    }

    static DropInEvent createCardDetailsSubmitEvent(Card card) {
        DropInEvent dropInEvent = new DropInEvent(DropInEventType.CARD_DETAILS_SUBMIT);
        dropInEvent.putParcelable(DropInEventProperty.CARD, card);
        return dropInEvent;
    }

    static DropInEvent createEditCardNumberEvent(String str) {
        DropInEvent dropInEvent = new DropInEvent(DropInEventType.EDIT_CARD_NUMBER);
        dropInEvent.putString(DropInEventProperty.CARD_NUMBER, str);
        return dropInEvent;
    }

    static DropInEvent createDeleteVaultedPaymentMethodNonceEvent(PaymentMethodNonce paymentMethodNonce) {
        DropInEvent dropInEvent = new DropInEvent(DropInEventType.DELETE_VAULTED_PAYMENT_METHOD);
        dropInEvent.putParcelable(DropInEventProperty.VAULTED_PAYMENT_METHOD, paymentMethodNonce);
        return dropInEvent;
    }

    static DropInEvent createVaultedPaymentMethodSelectedEvent(PaymentMethodNonce paymentMethodNonce) {
        DropInEvent dropInEvent = new DropInEvent(DropInEventType.VAULTED_PAYMENT_METHOD_SELECTED);
        dropInEvent.putParcelable(DropInEventProperty.VAULTED_PAYMENT_METHOD, paymentMethodNonce);
        return dropInEvent;
    }

    static DropInEvent createSupportedPaymentMethodSelectedEvent(DropInPaymentMethod dropInPaymentMethod) {
        DropInEvent dropInEvent = new DropInEvent(DropInEventType.SUPPORTED_PAYMENT_METHOD_SELECTED);
        dropInEvent.putString(DropInEventProperty.SUPPORTED_PAYMENT_METHOD, dropInPaymentMethod.name());
        return dropInEvent;
    }

    static DropInEvent fromBundle(Bundle bundle2) {
        return new DropInEvent(bundle2);
    }

    DropInEvent(DropInEventType dropInEventType) {
        this(new Bundle());
        this.bundle.putString(TYPE_KEY, dropInEventType.name());
    }

    private DropInEvent(Bundle bundle2) {
        this.bundle = bundle2;
        bundle2.setClassLoader(getClass().getClassLoader());
    }

    protected DropInEvent(Parcel parcel) {
        this.bundle = parcel.readBundle(getClass().getClassLoader());
    }

    /* access modifiers changed from: package-private */
    public void putParcelable(DropInEventProperty dropInEventProperty, Parcelable parcelable) {
        this.bundle.putParcelable(dropInEventProperty.getBundleKey(), parcelable);
    }

    private void putString(DropInEventProperty dropInEventProperty, String str) {
        this.bundle.putString(dropInEventProperty.getBundleKey(), str);
    }

    /* access modifiers changed from: package-private */
    public String getString(DropInEventProperty dropInEventProperty) {
        return this.bundle.getString(dropInEventProperty.getBundleKey());
    }

    /* access modifiers changed from: package-private */
    public DropInPaymentMethod getDropInPaymentMethodType(DropInEventProperty dropInEventProperty) {
        return DropInPaymentMethod.valueOf(this.bundle.getString(dropInEventProperty.getBundleKey()));
    }

    /* access modifiers changed from: package-private */
    public PaymentMethodNonce getPaymentMethodNonce(DropInEventProperty dropInEventProperty) {
        return (PaymentMethodNonce) this.bundle.getParcelable(dropInEventProperty.getBundleKey());
    }

    /* access modifiers changed from: package-private */
    public Card getCard(DropInEventProperty dropInEventProperty) {
        return (Card) this.bundle.getParcelable(dropInEventProperty.getBundleKey());
    }

    /* access modifiers changed from: package-private */
    public DropInEventType getType() {
        return DropInEventType.valueOf(this.bundle.getString(TYPE_KEY));
    }

    /* access modifiers changed from: package-private */
    public Bundle toBundle() {
        return this.bundle;
    }
}
