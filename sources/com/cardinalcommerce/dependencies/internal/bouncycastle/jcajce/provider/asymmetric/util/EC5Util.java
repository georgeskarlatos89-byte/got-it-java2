package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.Base64;
import com.cardinalcommerce.a.CompletionEvent;
import com.cardinalcommerce.a.DSAUtil;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.JWTClaimsSet;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.PEMUtil;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X509CRLObject;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.setUiType;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class EC5Util {
    private static Map configure = new HashMap();

    public static ECPoint cca_continue(JSONNavi jSONNavi) {
        JSONNavi CardinalRenderType = jSONNavi.CardinalRenderType();
        return new ECPoint(CardinalRenderType.onCReqSuccess().cca_continue(), CardinalRenderType.getWarnings().cca_continue());
    }

    public static toJSONString getInstance(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            toJSONString.getInstance getinstance = new toJSONString.getInstance(((ECFieldFp) field).getP(), a, b);
            return configure.containsKey(getinstance) ? (toJSONString) configure.get(getinstance) : getinstance;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] instance = ECUtil.getInstance(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new toJSONString.init(m, instance[0], instance[1], instance[2], a, b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.cardinalcommerce.a.GMCipherSpi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cardinalcommerce.a.toJSONString Cardinal(com.cardinalcommerce.a.PSSSignatureSpi.SHA512_256withRSA r2, com.cardinalcommerce.a.DSAUtil r3) {
        /*
            java.util.Set r0 = r2.init()
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r3.cca_continue
            boolean r1 = r1 instanceof com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier
            if (r1 == 0) goto L_0x0039
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r3.cca_continue
            com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r3 = com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier.cca_continue((java.lang.Object) r3)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0025
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "named curve not acceptable"
            r2.<init>(r3)
            throw r2
        L_0x0025:
            com.cardinalcommerce.a.GMCipherSpi r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getInstance((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r3)
            if (r0 != 0) goto L_0x0036
            java.util.Map r2 = r2.getInstance()
            java.lang.Object r2 = r2.get(r3)
            r0 = r2
            com.cardinalcommerce.a.GMCipherSpi r0 = (com.cardinalcommerce.a.GMCipherSpi) r0
        L_0x0036:
            com.cardinalcommerce.a.toJSONString r2 = r0.init
            goto L_0x0054
        L_0x0039:
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r1 = r3.cca_continue
            boolean r1 = r1 instanceof com.cardinalcommerce.a.setUiType
            if (r1 == 0) goto L_0x0046
            com.cardinalcommerce.a.X509CertificateObject r2 = r2.cca_continue()
            com.cardinalcommerce.a.toJSONString r2 = r2.cca_continue
            goto L_0x0054
        L_0x0046:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0055
            com.cardinalcommerce.a.getThreeDSRequestorAppURL r2 = r3.cca_continue
            com.cardinalcommerce.a.GMCipherSpi r2 = com.cardinalcommerce.a.GMCipherSpi.cca_continue(r2)
            com.cardinalcommerce.a.toJSONString r2 = r2.init
        L_0x0054:
            return r2
        L_0x0055:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "encoded parameters not acceptable"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.Cardinal(com.cardinalcommerce.a.PSSSignatureSpi$SHA512_256withRSA, com.cardinalcommerce.a.DSAUtil):com.cardinalcommerce.a.toJSONString");
    }

    public static KeyFactorySpi.EDDSA Cardinal(PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return ECUtil.cca_continue(sHA512_256withRSA, getInstance(eCParameterSpec));
        }
        X509CertificateObject cca_continue = sHA512_256withRSA.cca_continue();
        return new KeyFactorySpi.EDDSA(cca_continue.cca_continue, cca_continue.configure, cca_continue.getInstance, cca_continue.getWarnings, cca_continue.init);
    }

    public static ECParameterSpec getInstance(DSAUtil dSAUtil, toJSONString tojsonstring) {
        ECParameterSpec eCParameterSpec;
        if (dSAUtil.cca_continue instanceof ASN1ObjectIdentifier) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) dSAUtil.cca_continue;
            GMCipherSpi instance = ECUtil.getInstance(aSN1ObjectIdentifier);
            if (instance == null) {
                Map instance2 = KeyFactory.init.getInstance();
                if (!instance2.isEmpty()) {
                    instance = (GMCipherSpi) instance2.get(aSN1ObjectIdentifier);
                }
            }
            byte[] bArr = instance.Cardinal;
            if (bArr != null) {
                System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
            }
            EllipticCurve cca_continue = cca_continue(tojsonstring);
            String cca_continue2 = ECUtil.cca_continue(aSN1ObjectIdentifier);
            JSONNavi CardinalRenderType = instance.getInstance.cca_continue().CardinalRenderType();
            return new X509CRLObject(cca_continue2, cca_continue, new ECPoint(CardinalRenderType.onCReqSuccess().cca_continue(), CardinalRenderType.getWarnings().cca_continue()), instance.cca_continue, instance.configure);
        } else if (dSAUtil.cca_continue instanceof setUiType) {
            return null;
        } else {
            GMCipherSpi cca_continue3 = GMCipherSpi.cca_continue(dSAUtil.cca_continue);
            byte[] bArr2 = cca_continue3.Cardinal;
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, new byte[bArr2.length], 0, bArr2.length);
            }
            EllipticCurve cca_continue4 = cca_continue(tojsonstring);
            if (cca_continue3.configure != null) {
                JSONNavi CardinalRenderType2 = cca_continue3.getInstance.cca_continue().CardinalRenderType();
                eCParameterSpec = new ECParameterSpec(cca_continue4, new ECPoint(CardinalRenderType2.onCReqSuccess().cca_continue(), CardinalRenderType2.getWarnings().cca_continue()), cca_continue3.cca_continue, cca_continue3.configure.intValue());
            } else {
                JSONNavi CardinalRenderType3 = cca_continue3.getInstance.cca_continue().CardinalRenderType();
                eCParameterSpec = new ECParameterSpec(cca_continue4, new ECPoint(CardinalRenderType3.onCReqSuccess().cca_continue(), CardinalRenderType3.getWarnings().cca_continue()), cca_continue3.cca_continue, 1);
            }
            return eCParameterSpec;
        }
    }

    public static ECParameterSpec Cardinal(GMCipherSpi gMCipherSpi) {
        EllipticCurve cca_continue = cca_continue(gMCipherSpi.init);
        JSONNavi CardinalRenderType = gMCipherSpi.getInstance.cca_continue().CardinalRenderType();
        return new ECParameterSpec(cca_continue, new ECPoint(CardinalRenderType.onCReqSuccess().cca_continue(), CardinalRenderType.getWarnings().cca_continue()), gMCipherSpi.cca_continue, gMCipherSpi.configure.intValue());
    }

    public static EllipticCurve cca_continue(toJSONString tojsonstring) {
        return new EllipticCurve(configure(tojsonstring.cca_continue), tojsonstring.getSDKVersion().cca_continue(), tojsonstring.cleanup().cca_continue(), (byte[]) null);
    }

    private static ECField configure(Base64 base64) {
        if (base64.Cardinal() == 1) {
            return new ECFieldFp(base64.configure());
        }
        JWTClaimsSet cca_continue = ((CompletionEvent) base64).cca_continue();
        int[] instance = cca_continue.getInstance();
        return new ECFieldF2m(cca_continue.cca_continue(), getBackgroundColor.cca_continue(getBackgroundColor.getInstance(instance, instance.length - 1)));
    }

    public static ECParameterSpec cca_continue(EllipticCurve ellipticCurve, X509CertificateObject x509CertificateObject) {
        if (x509CertificateObject instanceof PEMUtil.Boundaries) {
            String str = ((PEMUtil.Boundaries) x509CertificateObject).Cardinal;
            JSONNavi CardinalRenderType = x509CertificateObject.configure.CardinalRenderType();
            return new X509CRLObject(str, ellipticCurve, new ECPoint(CardinalRenderType.onCReqSuccess().cca_continue(), CardinalRenderType.getWarnings().cca_continue()), x509CertificateObject.getInstance, x509CertificateObject.getWarnings);
        }
        JSONNavi CardinalRenderType2 = x509CertificateObject.configure.CardinalRenderType();
        return new ECParameterSpec(ellipticCurve, new ECPoint(CardinalRenderType2.onCReqSuccess().cca_continue(), CardinalRenderType2.getWarnings().cca_continue()), x509CertificateObject.getInstance, x509CertificateObject.getWarnings.intValue());
    }

    public static X509CertificateObject getInstance(ECParameterSpec eCParameterSpec) {
        toJSONString instance = getInstance(eCParameterSpec.getCurve());
        if (eCParameterSpec instanceof X509CRLObject) {
            String str = ((X509CRLObject) eCParameterSpec).cca_continue;
            ECPoint generator = eCParameterSpec.getGenerator();
            return new PEMUtil.Boundaries(str, instance, instance.configure(generator.getAffineX(), generator.getAffineY(), false), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
        }
        ECPoint generator2 = eCParameterSpec.getGenerator();
        return new X509CertificateObject(instance, instance.configure(generator2.getAffineX(), generator2.getAffineY(), false), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static JSONNavi init(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return getInstance(eCParameterSpec.getCurve()).configure(eCPoint.getAffineX(), eCPoint.getAffineY(), false);
    }

    public static JSONNavi cca_continue(toJSONString tojsonstring, ECPoint eCPoint) {
        return tojsonstring.configure(eCPoint.getAffineX(), eCPoint.getAffineY(), false);
    }

    static {
        Enumeration init = SignatureSpi.ecCVCDSA384.init();
        while (init.hasMoreElements()) {
            String str = (String) init.nextElement();
            GMCipherSpi cca_continue = SignatureSpi.cca_continue(str);
            if (cca_continue != null) {
                configure.put(cca_continue.init, SignatureSpi.ecCVCDSA384.Cardinal(str).init);
            }
        }
        toJSONString tojsonstring = SignatureSpi.ecCVCDSA384.Cardinal("Curve25519").init;
        configure.put(new toJSONString.getInstance(tojsonstring.cca_continue.configure(), tojsonstring.getSDKVersion().cca_continue(), tojsonstring.cleanup().cca_continue(), tojsonstring.onCReqSuccess(), tojsonstring.onValidated()), tojsonstring);
    }
}
