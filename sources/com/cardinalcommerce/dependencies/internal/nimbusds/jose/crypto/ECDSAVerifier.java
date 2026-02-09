package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto;

import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.a.setAccessibilityTraversalBefore;
import com.cardinalcommerce.a.setOnKeyListener;
import com.cardinalcommerce.a.setPreferKeepClear;
import com.cardinalcommerce.a.setStateDescription;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSVerifier;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Set;

public class ECDSAVerifier extends setStateDescription implements JWSVerifier {
    private final setAccessibilityTraversalBefore getInstance;
    private final ECPublicKey init;

    public ECDSAVerifier(ECPublicKey eCPublicKey) throws JOSEException {
        this(eCPublicKey, (Set<String>) null);
    }

    public final boolean cca_continue(setOnKeyListener setonkeylistener, byte[] bArr, Base64URL base64URL) throws JOSEException {
        byte[] bArr2;
        JWSAlgorithm init2 = setonkeylistener.init();
        if (!cca_continue().contains(init2)) {
            throw new JOSEException(AlgorithmSupportMessage.Cardinal(init2, cca_continue()));
        } else if (!this.getInstance.init(setonkeylistener)) {
            return false;
        } else {
            byte[] cca_continue = setPreferKeepClear.cca_continue(base64URL.cca_continue);
            try {
                int length = cca_continue.length / 2;
                int i = length;
                while (i > 0 && cca_continue[length - i] == 0) {
                    i--;
                }
                int i2 = length - i;
                int i3 = cca_continue[i2] < 0 ? i + 1 : i;
                int i4 = length;
                while (i4 > 0 && cca_continue[(length * 2) - i4] == 0) {
                    i4--;
                }
                int i5 = (length * 2) - i4;
                int i6 = cca_continue[i5] < 0 ? i4 + 1 : i4;
                int i7 = i3 + 2 + 2 + i6;
                if (i7 <= 255) {
                    int i8 = 1;
                    if (i7 < 128) {
                        bArr2 = new byte[(i3 + 4 + 2 + i6)];
                    } else {
                        bArr2 = new byte[(i3 + 5 + 2 + i6)];
                        bArr2[1] = -127;
                        i8 = 2;
                    }
                    bArr2[0] = 48;
                    int i9 = i8 + 1;
                    bArr2[i8] = (byte) i7;
                    int i10 = i9 + 1;
                    bArr2[i9] = 2;
                    bArr2[i10] = (byte) i3;
                    int i11 = i10 + 1 + i3;
                    System.arraycopy(cca_continue, i2, bArr2, i11 - i, i);
                    int i12 = i11 + 1;
                    bArr2[i11] = 2;
                    bArr2[i12] = (byte) i6;
                    System.arraycopy(cca_continue, i5, bArr2, ((i12 + 1) + i6) - i4, i4);
                    Signature instance = setAccessibilityPaneTitle.getInstance(init2, getInstance().cca_continue);
                    try {
                        instance.initVerify(this.init);
                        instance.update(bArr);
                        return instance.verify(bArr2);
                    } catch (InvalidKeyException e) {
                        throw new JOSEException(new StringBuilder("Invalid EC public key: ").append(e.getMessage()).toString(), e);
                    } catch (SignatureException unused) {
                        return false;
                    }
                } else {
                    throw new JOSEException("Invalid ECDSA signature format");
                }
            } catch (JOSEException unused2) {
                return false;
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ECDSAVerifier(java.security.interfaces.ECPublicKey r4, java.util.Set<java.lang.String> r5) throws com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException {
        /*
            r3 = this;
            java.security.spec.ECParameterSpec r0 = r4.getParams()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve r0 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve.init(r0)
            if (r0 == 0) goto L_0x0097
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve.getInstance
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0015
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r0 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm.onCReqSuccess
            goto L_0x0035
        L_0x0015:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve.configure
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0020
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r0 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm.getSDKVersion
            goto L_0x0035
        L_0x0020:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve.cca_continue
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x002b
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r0 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm.onValidated
            goto L_0x0035
        L_0x002b:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve.init
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r0 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm.cleanup
        L_0x0035:
            r3.<init>(r0)
            com.cardinalcommerce.a.setAccessibilityTraversalBefore r0 = new com.cardinalcommerce.a.setAccessibilityTraversalBefore
            r0.<init>()
            r3.getInstance = r0
            r3.init = r4
            java.util.Set r1 = r3.cca_continue()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r1 = (com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm) r1
            java.util.Set r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve.getInstance(r1)
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve r1 = (com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve) r1
            java.security.spec.ECParameterSpec r1 = com.cardinalcommerce.a.setNextFocusDownId.cca_continue(r1)
            java.security.spec.ECPoint r4 = r4.getW()
            java.math.BigInteger r2 = r4.getAffineX()
            java.math.BigInteger r4 = r4.getAffineY()
            boolean r4 = com.cardinalcommerce.a.setAccessibilityPaneTitle.configure(r2, r4, r1)
            if (r4 == 0) goto L_0x007f
            if (r5 != 0) goto L_0x007c
            java.util.Set r4 = java.util.Collections.emptySet()
            r0.getInstance = r4
            return
        L_0x007c:
            r0.getInstance = r5
            return
        L_0x007f:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r4 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r5 = "Curve / public key parameters mismatch"
            r4.<init>(r5)
            throw r4
        L_0x0087:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r4 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r5 = "Unexpected curve: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = r5.concat(r0)
            r4.<init>(r5)
            throw r4
        L_0x0097:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r4 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r5 = "The EC key curve is not supported, must be P-256, P-384 or P-521"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.ECDSAVerifier.<init>(java.security.interfaces.ECPublicKey, java.util.Set):void");
    }
}
