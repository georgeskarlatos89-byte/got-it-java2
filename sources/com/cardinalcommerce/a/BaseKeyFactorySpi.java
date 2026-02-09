package com.cardinalcommerce.a;

import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.PEMUtil;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.math.BigInteger;

public final class BaseKeyFactorySpi {
    public PSSSignatureSpi.SHA256withRSA Cardinal;
    public IESCipher.ECIES cca_continue;

    public BaseKeyFactorySpi() {
    }

    public static PEMUtil.Boundaries configure(String str) {
        KeyFactorySpi.EDDSA instance = IES.Mappings.getInstance(str);
        byte[] bArr = null;
        if (instance == null) {
            try {
                instance = IES.Mappings.configure(new ASN1ObjectIdentifier(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (instance == null) {
            return null;
        }
        toJSONString tojsonstring = instance.cca_continue;
        JSONNavi jSONNavi = instance.init;
        BigInteger bigInteger = instance.getInstance;
        BigInteger bigInteger2 = instance.Cardinal;
        byte[] bArr2 = instance.configure;
        if (bArr2 != null) {
            bArr = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        return new PEMUtil.Boundaries(str, tojsonstring, jSONNavi, bigInteger, bigInteger2, bArr);
    }

    public BaseKeyFactorySpi(PSSSignatureSpi.SHA256withRSA sHA256withRSA, IESCipher.ECIES ecies) {
        this.Cardinal = sHA256withRSA;
        this.cca_continue = ecies;
    }
}
