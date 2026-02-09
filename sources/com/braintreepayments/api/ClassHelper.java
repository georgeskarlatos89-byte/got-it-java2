package com.braintreepayments.api;

class ClassHelper {
    ClassHelper() {
    }

    /* access modifiers changed from: package-private */
    public boolean isClassAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
