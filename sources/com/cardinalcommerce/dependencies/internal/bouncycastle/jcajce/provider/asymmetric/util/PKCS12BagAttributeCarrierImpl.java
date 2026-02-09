package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.GMCipherSpi;
import java.util.Hashtable;
import java.util.Vector;

public class PKCS12BagAttributeCarrierImpl implements GMCipherSpi.SM2withRMD {
    private Hashtable getInstance;
    private Vector init;

    public PKCS12BagAttributeCarrierImpl() {
        this(new Hashtable(), new Vector());
    }

    private PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector) {
        this.getInstance = hashtable;
        this.init = vector;
    }
}
