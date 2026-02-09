package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import java.util.Collections;
import java.util.Set;

abstract class setOnReceiveContentListener implements setOnDragListener {
    private final Set<EncryptionMethod> Cardinal;
    private final setNextFocusLeftId cca_continue = new setNextFocusLeftId();
    private final Set<JWEAlgorithm> init;

    public setOnReceiveContentListener(Set<JWEAlgorithm> set, Set<EncryptionMethod> set2) {
        if (set != null) {
            this.init = Collections.unmodifiableSet(set);
            if (set2 != null) {
                this.Cardinal = set2;
                return;
            }
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
    }

    public Set<JWEAlgorithm> Cardinal() {
        return this.init;
    }

    public Set<EncryptionMethod> cca_continue() {
        return this.Cardinal;
    }

    /* renamed from: init */
    public setNextFocusLeftId getInstance() {
        return this.cca_continue;
    }
}
