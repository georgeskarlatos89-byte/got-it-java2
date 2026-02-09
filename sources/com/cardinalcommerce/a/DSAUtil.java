package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;

public final class DSAUtil extends setRenderType implements getChallengeTimeout {
    public getThreeDSRequestorAppURL cca_continue;

    public DSAUtil(GMCipherSpi gMCipherSpi) {
        this.cca_continue = null;
        this.cca_continue = gMCipherSpi.onCReqSuccess();
    }

    private DSAUtil(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        this.cca_continue = getthreedsrequestorappurl;
    }

    public DSAUtil(setUiType setuitype) {
        this.cca_continue = setuitype;
    }

    public DSAUtil(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.cca_continue = aSN1ObjectIdentifier;
    }

    public static DSAUtil Cardinal(Object obj) {
        if (obj == null || (obj instanceof DSAUtil)) {
            return (DSAUtil) obj;
        }
        if (obj instanceof getThreeDSRequestorAppURL) {
            return new DSAUtil((getThreeDSRequestorAppURL) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return new DSAUtil(getThreeDSRequestorAppURL.Cardinal((byte[]) obj));
            } catch (Exception e) {
                throw new IllegalArgumentException(new StringBuilder("unable to parse encoded data: ").append(e.getMessage()).toString());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        return this.cca_continue;
    }
}
