package com.braintreepayments.cardform.utils;

public class SelectableCardType {
    CardType cardType;
    boolean disabled = false;

    public SelectableCardType(CardType cardType2) {
        this.cardType = cardType2;
    }

    public void setDisabled(boolean z) {
        this.disabled = z;
    }

    public boolean isDisabled() {
        return this.disabled;
    }

    public CardType getCardType() {
        return this.cardType;
    }
}
