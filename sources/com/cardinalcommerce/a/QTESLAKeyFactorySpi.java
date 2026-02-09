package com.cardinalcommerce.a;

import com.cardinalcommerce.a.RSA;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public final class QTESLAKeyFactorySpi implements CertificateFactory, AlgorithmParameterSpec {
    public String Cardinal;
    public NHKeyFactorySpi cca_continue;
    public String configure;
    public String init;

    private QTESLAKeyFactorySpi(String str, String str2) {
        this(str, str2, (String) null);
    }

    public final NHKeyFactorySpi Cardinal() {
        return this.cca_continue;
    }

    public final String cca_continue() {
        return this.init;
    }

    public final String configure() {
        return this.Cardinal;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof QTESLAKeyFactorySpi) {
            QTESLAKeyFactorySpi qTESLAKeyFactorySpi = (QTESLAKeyFactorySpi) obj;
            if (this.cca_continue.equals(qTESLAKeyFactorySpi.cca_continue) && this.Cardinal.equals(qTESLAKeyFactorySpi.Cardinal)) {
                String str = this.init;
                String str2 = qTESLAKeyFactorySpi.init;
                if (str != str2) {
                    return str != null && str.equals(str2);
                }
                return true;
            }
        }
    }

    public final String getInstance() {
        return this.configure;
    }

    public final int hashCode() {
        int hashCode = this.cca_continue.hashCode() ^ this.Cardinal.hashCode();
        String str = this.init;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }

    public QTESLAKeyFactorySpi(String str, String str2, String str3) {
        RSA rsa;
        try {
            rsa = RSA.Mappings.getInstance(new ASN1ObjectIdentifier(str));
        } catch (IllegalArgumentException unused) {
            ASN1ObjectIdentifier cca_continue2 = RSA.Mappings.cca_continue(str);
            if (cca_continue2 != null) {
                str = cca_continue2.init;
                rsa = RSA.Mappings.getInstance(cca_continue2);
            } else {
                rsa = null;
            }
        }
        if (rsa != null) {
            this.cca_continue = new NHKeyFactorySpi(new BigInteger(1, rsa.configure.getInstance), new BigInteger(1, rsa.cca_continue.getInstance), new BigInteger(1, rsa.Cardinal.getInstance));
            this.configure = str;
            this.Cardinal = str2;
            this.init = str3;
            return;
        }
        throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
    }

    public QTESLAKeyFactorySpi(String str) {
        this(str, IES.getWarnings.init, (String) null);
    }

    public QTESLAKeyFactorySpi(NHKeyFactorySpi nHKeyFactorySpi) {
        this.cca_continue = nHKeyFactorySpi;
        this.Cardinal = IES.getWarnings.init;
        this.init = null;
    }

    public static QTESLAKeyFactorySpi init(AlgorithmParameterGeneratorSpi algorithmParameterGeneratorSpi) {
        if (algorithmParameterGeneratorSpi.getInstance != null) {
            return new QTESLAKeyFactorySpi(algorithmParameterGeneratorSpi.configure.init, algorithmParameterGeneratorSpi.Cardinal.init, algorithmParameterGeneratorSpi.getInstance.init);
        }
        return new QTESLAKeyFactorySpi(algorithmParameterGeneratorSpi.configure.init, algorithmParameterGeneratorSpi.Cardinal.init);
    }
}
