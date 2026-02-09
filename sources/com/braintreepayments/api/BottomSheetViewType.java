package com.braintreepayments.api;

enum BottomSheetViewType {
    SUPPORTED_PAYMENT_METHODS(0),
    VAULT_MANAGER(1);
    
    private final long id;

    private BottomSheetViewType(long j) {
        this.id = j;
    }

    /* access modifiers changed from: package-private */
    public long getId() {
        return this.id;
    }

    /* access modifiers changed from: package-private */
    public boolean hasId(long j) {
        return this.id == j;
    }
}
