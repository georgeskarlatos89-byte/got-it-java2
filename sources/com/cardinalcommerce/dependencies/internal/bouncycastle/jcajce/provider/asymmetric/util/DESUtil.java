package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.util.HashSet;
import java.util.Set;

public class DESUtil {
    private static final Set<String> getInstance;

    static {
        HashSet hashSet = new HashSet();
        getInstance = hashSet;
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(KeyAgreementSpi.DHUwithSHA1KDF.Cardinal.init);
        hashSet.add(KeyAgreementSpi.DHUwithSHA224CKDF.getString.init);
        hashSet.add(KeyAgreementSpi.DHUwithSHA224CKDF.getString.init);
        hashSet.add(KeyAgreementSpi.DHUwithSHA224CKDF.setLocationDataConsentGiven.init);
    }
}
