package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class setStateDescription extends setImportantForAutofill {
    public static final Set<JWSAlgorithm> Cardinal;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.onCReqSuccess);
        linkedHashSet.add(JWSAlgorithm.getSDKVersion);
        linkedHashSet.add(JWSAlgorithm.onValidated);
        linkedHashSet.add(JWSAlgorithm.cleanup);
        Cardinal = Collections.unmodifiableSet(linkedHashSet);
    }

    public setStateDescription(JWSAlgorithm jWSAlgorithm) throws JOSEException {
        super(new HashSet(Collections.singletonList(jWSAlgorithm)));
        if (!Cardinal.contains(jWSAlgorithm)) {
            throw new JOSEException("Unsupported EC DSA algorithm: ".concat(String.valueOf(jWSAlgorithm)));
        }
    }
}
