package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.DSAUtil;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X509CRLObject;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.a.setUiType;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private String Cardinal;
    private ECParameterSpec configure;

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded("ASN.1");
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "EC AlgorithmParameters ";
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
            GMCipherSpi instance = ECUtils.getInstance(eCGenParameterSpec);
            if (instance != null) {
                this.Cardinal = eCGenParameterSpec.getName();
                ECParameterSpec Cardinal2 = EC5Util.Cardinal(instance);
                this.configure = new X509CRLObject(this.Cardinal, Cardinal2.getCurve(), Cardinal2.getGenerator(), Cardinal2.getOrder(), BigInteger.valueOf((long) Cardinal2.getCofactor()));
                return;
            }
            throw new InvalidParameterSpecException(new StringBuilder("EC curve name not recognized: ").append(eCGenParameterSpec.getName()).toString());
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            this.Cardinal = algorithmParameterSpec instanceof X509CRLObject ? ((X509CRLObject) algorithmParameterSpec).cca_continue : null;
            this.configure = (ECParameterSpec) algorithmParameterSpec;
        } else {
            throw new InvalidParameterSpecException(new StringBuilder("AlgorithmParameterSpec class not recognized: ").append(algorithmParameterSpec.getClass().getName()).toString());
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (str == null || str.equals("ASN.1")) {
            DSAUtil Cardinal2 = DSAUtil.Cardinal(bArr);
            toJSONString Cardinal3 = EC5Util.Cardinal(KeyFactory.init, Cardinal2);
            if (Cardinal2.cca_continue instanceof ASN1ObjectIdentifier) {
                ASN1ObjectIdentifier cca_continue = ASN1ObjectIdentifier.cca_continue((Object) Cardinal2.cca_continue);
                String cca_continue2 = SignatureSpi.cca_continue(cca_continue);
                this.Cardinal = cca_continue2;
                if (cca_continue2 == null) {
                    this.Cardinal = cca_continue.init;
                }
            }
            this.configure = EC5Util.getInstance(Cardinal2, Cardinal3);
            return;
        }
        throw new IOException("Unknown encoded parameters format in AlgorithmParameters object: ".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: protected */
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.configure;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            String str = this.Cardinal;
            if (str != null) {
                ASN1ObjectIdentifier cca_continue = ECUtil.cca_continue(str);
                return cca_continue != null ? new ECGenParameterSpec(cca_continue.init) : new ECGenParameterSpec(this.Cardinal);
            }
            ASN1ObjectIdentifier Cardinal2 = ECUtil.Cardinal(EC5Util.getInstance(this.configure));
            if (Cardinal2 != null) {
                return new ECGenParameterSpec(Cardinal2.init);
            }
        }
        throw new InvalidParameterSpecException(new StringBuilder("EC AlgorithmParameters cannot convert to ").append(cls.getName()).toString());
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) throws IOException {
        DSAUtil dSAUtil;
        if (str == null || str.equals("ASN.1")) {
            ECParameterSpec eCParameterSpec = this.configure;
            if (eCParameterSpec == null) {
                dSAUtil = new DSAUtil((setUiType) isEnabledVisaCheckout.configure);
            } else if (this.Cardinal != null) {
                dSAUtil = new DSAUtil(ECUtil.cca_continue(this.Cardinal));
            } else {
                X509CertificateObject instance = EC5Util.getInstance(eCParameterSpec);
                dSAUtil = new DSAUtil(new GMCipherSpi(instance.cca_continue, instance.configure, instance.getInstance, instance.getWarnings, instance.init));
            }
            return dSAUtil.getEncoded();
        }
        throw new IOException("Unknown parameters format in AlgorithmParameters object: ".concat(String.valueOf(str)));
    }
}
