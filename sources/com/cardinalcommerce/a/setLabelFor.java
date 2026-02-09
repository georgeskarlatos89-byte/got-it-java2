package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class setLabelFor extends setImportantForAutofill {
    public static final Set<JWSAlgorithm> init;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.init);
        linkedHashSet.add(JWSAlgorithm.getInstance);
        linkedHashSet.add(JWSAlgorithm.Cardinal);
        linkedHashSet.add(JWSAlgorithm.getWarnings);
        linkedHashSet.add(JWSAlgorithm.values);
        linkedHashSet.add(JWSAlgorithm.CardinalRenderType);
        init = Collections.unmodifiableSet(linkedHashSet);
    }

    public setLabelFor() {
        super(init);
    }
}
