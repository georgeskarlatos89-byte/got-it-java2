package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.BCDSTU4145PublicKey;
import com.cardinalcommerce.a.Customization;
import com.cardinalcommerce.a.ElGamal;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GOST3410Util;
import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PEMUtil;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X509;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.merge;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.a.setCornerRadius;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Enumeration;
import java.util.Vector;

public class ECUtil {
    public static GMCipherSpi Cardinal(String str) {
        GMCipherSpi Cardinal = SignatureSpi.ecCVCDSA384.Cardinal(str);
        return Cardinal == null ? SignatureSpi.cca_continue(str) : Cardinal;
    }

    public static String Cardinal(String str, JSONNavi jSONNavi, X509CertificateObject x509CertificateObject) {
        StringBuffer stringBuffer = new StringBuffer();
        String instance = getTextFontSize.getInstance();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(init(jSONNavi, x509CertificateObject)).append("]").append(instance);
        stringBuffer.append("            X: ").append(jSONNavi.onCReqSuccess().cca_continue().toString(16)).append(instance);
        stringBuffer.append("            Y: ").append(jSONNavi.getWarnings().cca_continue().toString(16)).append(instance);
        return stringBuffer.toString();
    }

    public static ASN1ObjectIdentifier cca_continue(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return new ASN1ObjectIdentifier(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return SignatureSpi.getInstance(str);
    }

    public static String cca_continue(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return SignatureSpi.cca_continue(aSN1ObjectIdentifier);
    }

    public static GMCipherSpi getInstance(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        GMCipherSpi configure = SignatureSpi.ecCVCDSA384.configure(aSN1ObjectIdentifier);
        return configure == null ? SignatureSpi.Cardinal(aSN1ObjectIdentifier) : configure;
    }

    static int[] getInstance(int[] iArr) {
        int i;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else if (iArr.length == 3) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (i2 >= i3 || i2 >= (i = iArr[2])) {
                int i4 = iArr[2];
                if (i3 < i4) {
                    iArr2[0] = i3;
                    int i5 = iArr[0];
                    if (i5 < i4) {
                        iArr2[1] = i5;
                        iArr2[2] = i4;
                    } else {
                        iArr2[1] = i4;
                        iArr2[2] = i5;
                    }
                } else {
                    iArr2[0] = i4;
                    int i6 = iArr[0];
                    if (i6 < i3) {
                        iArr2[1] = i6;
                        iArr2[2] = iArr[1];
                    } else {
                        iArr2[1] = i3;
                        iArr2[2] = i6;
                    }
                }
            } else {
                iArr2[0] = i2;
                if (i3 < i) {
                    iArr2[1] = i3;
                    iArr2[2] = i;
                } else {
                    iArr2[1] = i;
                    iArr2[2] = iArr[1];
                }
            }
        } else {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        return iArr2;
    }

    public static KeyFactorySpi.EDDSA cca_continue(PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA, X509CertificateObject x509CertificateObject) {
        if (x509CertificateObject instanceof PEMUtil.Boundaries) {
            PEMUtil.Boundaries boundaries = (PEMUtil.Boundaries) x509CertificateObject;
            return new KeyFactorySpi.XDH(cca_continue(boundaries.Cardinal), boundaries.cca_continue, boundaries.configure, boundaries.getInstance, boundaries.getWarnings, boundaries.init);
        } else if (x509CertificateObject != null) {
            return new KeyFactorySpi.EDDSA(x509CertificateObject.cca_continue, x509CertificateObject.configure, x509CertificateObject.getInstance, x509CertificateObject.getWarnings, x509CertificateObject.init);
        } else {
            X509CertificateObject cca_continue = sHA512_256withRSA.cca_continue();
            return new KeyFactorySpi.EDDSA(cca_continue.cca_continue, cca_continue.configure, cca_continue.getInstance, cca_continue.getWarnings, cca_continue.init);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.cardinalcommerce.a.GMCipherSpi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cardinalcommerce.a.KeyFactorySpi.EDDSA cca_continue(com.cardinalcommerce.a.PSSSignatureSpi.SHA512_256withRSA r10, com.cardinalcommerce.a.DSAUtil r11) {
        /*
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r0 = r11.cca_continue
            boolean r0 = r0 instanceof com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0045
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r11 = r11.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r4 = com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier.cca_continue((java.lang.Object) r11)
            com.cardinalcommerce.a.GMCipherSpi r11 = com.cardinalcommerce.a.SignatureSpi.ecCVCDSA384.configure(r4)
            if (r11 != 0) goto L_0x0018
            com.cardinalcommerce.a.GMCipherSpi r11 = com.cardinalcommerce.a.SignatureSpi.Cardinal(r4)
        L_0x0018:
            if (r11 != 0) goto L_0x0025
            java.util.Map r10 = r10.getInstance()
            java.lang.Object r10 = r10.get(r4)
            r11 = r10
            com.cardinalcommerce.a.GMCipherSpi r11 = (com.cardinalcommerce.a.GMCipherSpi) r11
        L_0x0025:
            com.cardinalcommerce.a.KeyFactorySpi$XDH r10 = new com.cardinalcommerce.a.KeyFactorySpi$XDH
            com.cardinalcommerce.a.toJSONString r5 = r11.init
            com.cardinalcommerce.a.ECUtils r0 = r11.getInstance
            com.cardinalcommerce.a.JSONNavi r6 = r0.cca_continue()
            java.math.BigInteger r7 = r11.cca_continue
            java.math.BigInteger r8 = r11.configure
            byte[] r11 = r11.Cardinal
            if (r11 != 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            int r0 = r11.length
            byte[] r1 = new byte[r0]
            int r0 = r11.length
            java.lang.System.arraycopy(r11, r2, r1, r2, r0)
        L_0x003f:
            r9 = r1
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x0087
        L_0x0045:
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r0 = r11.cca_continue
            boolean r0 = r0 instanceof com.cardinalcommerce.a.setUiType
            if (r0 == 0) goto L_0x0061
            com.cardinalcommerce.a.X509CertificateObject r10 = r10.cca_continue()
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r11 = new com.cardinalcommerce.a.KeyFactorySpi$EDDSA
            com.cardinalcommerce.a.toJSONString r1 = r10.cca_continue
            com.cardinalcommerce.a.JSONNavi r2 = r10.configure
            java.math.BigInteger r3 = r10.getInstance
            java.math.BigInteger r4 = r10.getWarnings
            byte[] r5 = r10.init
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x005f:
            r10 = r11
            goto L_0x0087
        L_0x0061:
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r10 = r11.cca_continue
            com.cardinalcommerce.a.GMCipherSpi r10 = com.cardinalcommerce.a.GMCipherSpi.cca_continue(r10)
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r11 = new com.cardinalcommerce.a.KeyFactorySpi$EDDSA
            com.cardinalcommerce.a.toJSONString r4 = r10.init
            com.cardinalcommerce.a.ECUtils r0 = r10.getInstance
            com.cardinalcommerce.a.JSONNavi r5 = r0.cca_continue()
            java.math.BigInteger r6 = r10.cca_continue
            java.math.BigInteger r7 = r10.configure
            byte[] r10 = r10.Cardinal
            if (r10 != 0) goto L_0x007a
            goto L_0x0081
        L_0x007a:
            int r0 = r10.length
            byte[] r1 = new byte[r0]
            int r0 = r10.length
            java.lang.System.arraycopy(r10, r2, r1, r2, r0)
        L_0x0081:
            r8 = r1
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x005f
        L_0x0087:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.cca_continue(com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA, com.cardinalcommerce.a.DSAUtil):com.cardinalcommerce.a.KeyFactorySpi$EDDSA");
    }

    public static setCCAImageUri init(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ExtendedInvalidKeySpecException) {
            ExtendedInvalidKeySpecException extendedInvalidKeySpecException = (ExtendedInvalidKeySpecException) publicKey;
            X509CertificateObject configure = extendedInvalidKeySpecException.configure();
            return new KeyPairGeneratorSpi.XDH(extendedInvalidKeySpecException.Cardinal(), new KeyFactorySpi.EDDSA(configure.cca_continue, configure.configure, configure.getInstance, configure.getWarnings, configure.init));
        } else if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            X509CertificateObject instance = EC5Util.getInstance(eCPublicKey.getParams());
            return new KeyPairGeneratorSpi.XDH(EC5Util.init(eCPublicKey.getParams(), eCPublicKey.getW()), new KeyFactorySpi.EDDSA(instance.cca_continue, instance.configure, instance.getInstance, instance.getWarnings, instance.init));
        } else {
            try {
                byte[] encoded = publicKey.getEncoded();
                if (encoded != null) {
                    PublicKey init = KeyFactory.init(SubjectPublicKeyInfo.configure(encoded));
                    if (init instanceof ECPublicKey) {
                        return init(init);
                    }
                    throw new InvalidKeyException("cannot identify EC public key.");
                }
                throw new InvalidKeyException("no encoding for EC public key");
            } catch (Exception e) {
                throw new InvalidKeyException(new StringBuilder("cannot identify EC public key: ").append(e.toString()).toString());
            }
        }
    }

    public static setCCAImageUri Cardinal(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof GOST3410Util) {
            GOST3410Util gOST3410Util = (GOST3410Util) privateKey;
            X509CertificateObject configure = gOST3410Util.configure();
            if (configure == null) {
                configure = KeyFactory.init.cca_continue();
            }
            if (!(gOST3410Util.configure() instanceof PEMUtil.Boundaries)) {
                return new KeyPairGeneratorSpi.EdDSA(gOST3410Util.Cardinal(), new KeyFactorySpi.EDDSA(configure.cca_continue, configure.configure, configure.getInstance, configure.getWarnings, configure.init));
            }
            return new KeyPairGeneratorSpi.EdDSA(gOST3410Util.Cardinal(), new KeyFactorySpi.XDH(SignatureSpi.getInstance(((PEMUtil.Boundaries) gOST3410Util.configure()).Cardinal), configure.cca_continue, configure.configure, configure.getInstance, configure.getWarnings, configure.init));
        } else if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            X509CertificateObject instance = EC5Util.getInstance(eCPrivateKey.getParams());
            return new KeyPairGeneratorSpi.EdDSA(eCPrivateKey.getS(), new KeyFactorySpi.EDDSA(instance.cca_continue, instance.configure, instance.getInstance, instance.getWarnings, instance.init));
        } else {
            try {
                byte[] encoded = privateKey.getEncoded();
                if (encoded != null) {
                    PrivateKey Cardinal = KeyFactory.Cardinal(PrivateKeyInfo.cca_continue(encoded));
                    if (Cardinal instanceof ECPrivateKey) {
                        return Cardinal(Cardinal);
                    }
                    throw new InvalidKeyException("can't identify EC private key.");
                }
                throw new InvalidKeyException("no encoding for EC private key");
            } catch (Exception e) {
                throw new InvalidKeyException(new StringBuilder("cannot identify EC private key: ").append(e.toString()).toString());
            }
        }
    }

    public static int getInstance(PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        X509CertificateObject cca_continue = sHA512_256withRSA.cca_continue();
        return cca_continue == null ? bigInteger2.bitLength() : cca_continue.getInstance.bitLength();
    }

    public static ASN1ObjectIdentifier Cardinal(X509CertificateObject x509CertificateObject) {
        Vector vector = new Vector();
        Enumeration cca_continue = BCDSTU4145PublicKey.cca_continue();
        while (cca_continue.hasMoreElements()) {
            vector.addElement(cca_continue.nextElement());
        }
        Enumeration instance = KeyAgreementSpi.DHwithSHA224KDF.getInstance();
        while (instance.hasMoreElements()) {
            vector.addElement(instance.nextElement());
        }
        Enumeration init = IESCipher.IES.init();
        while (init.hasMoreElements()) {
            vector.addElement(init.nextElement());
        }
        Enumeration Cardinal = KeyAgreementSpi.DHwithSHA1KDF.Cardinal();
        while (Cardinal.hasMoreElements()) {
            vector.addElement(Cardinal.nextElement());
        }
        Enumeration configure = ElGamal.configure();
        while (configure.hasMoreElements()) {
            vector.addElement(configure.nextElement());
        }
        Enumeration instance2 = IES.Mappings.getInstance();
        while (instance2.hasMoreElements()) {
            vector.addElement(instance2.nextElement());
        }
        Enumeration Cardinal2 = X509.Cardinal();
        while (Cardinal2.hasMoreElements()) {
            vector.addElement(Cardinal2.nextElement());
        }
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            String str = (String) elements.nextElement();
            GMCipherSpi cca_continue2 = SignatureSpi.cca_continue(str);
            if (cca_continue2.cca_continue.equals(x509CertificateObject.getInstance) && cca_continue2.configure.equals(x509CertificateObject.getWarnings) && cca_continue2.init.configure(x509CertificateObject.cca_continue) && cca_continue2.getInstance.cca_continue().init(x509CertificateObject.configure)) {
                return SignatureSpi.getInstance(str);
            }
        }
        return null;
    }

    public static String init(String str, BigInteger bigInteger, X509CertificateObject x509CertificateObject) {
        StringBuffer stringBuffer = new StringBuffer();
        String instance = getTextFontSize.getInstance();
        JSONNavi CardinalRenderType = x509CertificateObject.configure.Cardinal(bigInteger).CardinalRenderType();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(init(CardinalRenderType, x509CertificateObject)).append("]").append(instance);
        stringBuffer.append("            X: ").append(CardinalRenderType.onCReqSuccess().cca_continue().toString(16)).append(instance);
        stringBuffer.append("            Y: ").append(CardinalRenderType.getWarnings().cca_continue().toString(16)).append(instance);
        return stringBuffer.toString();
    }

    private static String init(JSONNavi jSONNavi, X509CertificateObject x509CertificateObject) {
        toJSONString tojsonstring = x509CertificateObject.cca_continue;
        JSONNavi jSONNavi2 = x509CertificateObject.configure;
        if (tojsonstring == null) {
            return new Customization(jSONNavi.Cardinal(false)).toString();
        }
        byte[] Cardinal = jSONNavi.Cardinal(false);
        merge sDKVersion = tojsonstring.getSDKVersion();
        byte[] instance = setCornerRadius.getInstance((sDKVersion.Cardinal() + 7) / 8, sDKVersion.cca_continue());
        merge cleanup = tojsonstring.cleanup();
        return new Customization(getBackgroundColor.configure(Cardinal, instance, setCornerRadius.getInstance((cleanup.Cardinal() + 7) / 8, cleanup.cca_continue()), jSONNavi2.Cardinal(false))).toString();
    }
}
