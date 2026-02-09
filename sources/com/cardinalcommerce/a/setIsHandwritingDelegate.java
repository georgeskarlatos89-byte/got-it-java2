package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.DirectEncrypter;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;

public final class setIsHandwritingDelegate extends DirectEncrypter {
    private static int getInstance = 12;
    private static int getSDKVersion = 1;
    private static int init;
    private byte Cardinal;

    static {
        int i = 0 + 77;
        getSDKVersion = i % 128;
        if ((i % 2 == 0 ? 'B' : 'K') == 'B') {
            throw null;
        }
    }

    public setIsHandwritingDelegate(byte[] bArr, byte b) throws KeyLengthException {
        super(new SecretKeySpec(bArr, "AES"));
        this.Cardinal = b;
        getInstance = 12;
    }

    private static byte[] cca_continue(byte b) {
        int i = (getSDKVersion + 11) - 1;
        int i2 = (i ^ -1) + ((i & -1) << 1);
        init = i2 % 128;
        if ((i2 % 2 != 0 ? Typography.amp : 'N') == 'N') {
            byte[] configure = configure(b);
            int i3 = init;
            int i4 = (((i3 ^ 123) | (i3 & 123)) << 1) - (((~i3) & 123) | (i3 & -124));
            getSDKVersion = i4 % 128;
            int i5 = i4 % 2;
            return configure;
        }
        configure(b);
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private static byte[] configure(byte b) {
        int i = (init + 28) - 1;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        int cleanup = cleanup();
        byte[] bArr = new byte[cleanup];
        Arrays.fill(bArr, (byte) 0);
        int i3 = cleanup & -1;
        bArr[(((cleanup | -1) & (~i3)) - (~(-(-(i3 << 1))))) - 1] = b;
        int i4 = getSDKVersion;
        int i5 = ((i4 ^ 9) - (~((i4 & 9) << 1))) - 1;
        init = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    private static int cleanup() {
        int i = getSDKVersion;
        int i2 = i & 113;
        int i3 = (i ^ 113) | i2;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        init = i4 % 128;
        int i5 = i4 % 2;
        int i6 = getInstance;
        int i7 = i & 65;
        int i8 = ((i | 65) & (~i7)) + (i7 << 1);
        init = i8 % 128;
        int i9 = i8 % 2;
        return i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        if ((r3.configure == null) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        if ((r3.configure == null) != true) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        r3 = r3.cca_continue;
        r4 = init;
        r7 = r4 & 61;
        r5 = ((r4 ^ 61) | r7) << 1;
        r4 = -((r4 | 61) & (~r7));
        r7 = ((r5 | r4) << 1) - (r4 ^ r5);
        getSDKVersion = r7 % 128;
        r7 = r7 % 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts getInstance(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader r14, byte[] r15) throws com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException {
        /*
            r13 = this;
            int r0 = init
            r1 = r0 ^ 9
            r0 = r0 & 9
            r0 = r0 | r1
            r2 = 1
            int r0 = r0 << r2
            int r1 = -r1
            int r1 = ~r1
            int r0 = r0 - r1
            int r0 = r0 - r2
            int r1 = r0 % 128
            getSDKVersion = r1
            int r0 = r0 % 2
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm r0 = r14.init()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm.getWarnings
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0212
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r14.Cardinal
            int r1 = r0.getInstance
            javax.crypto.SecretKey r3 = r13.configure()
            byte[] r3 = r3.getEncoded()
            int r3 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils.init(r3)
            if (r1 != r3) goto L_0x020a
            r6 = 0
            int r1 = r0.getInstance
            javax.crypto.SecretKey r3 = r13.configure()
            byte[] r3 = r3.getEncoded()
            int r3 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils.init(r3)
            if (r1 != r3) goto L_0x01e3
            byte[] r9 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.DeflateHelper.Cardinal(r14, r15)
            byte[] r10 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AAD.configure(r14)
            byte r15 = r13.Cardinal
            byte[] r15 = cca_continue(r15)
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r14.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.init
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x005d
            r0 = r2
            goto L_0x005e
        L_0x005d:
            r0 = r1
        L_0x005e:
            if (r0 == 0) goto L_0x013b
            int r0 = init
            r3 = r0 & 115(0x73, float:1.61E-43)
            r0 = r0 ^ 115(0x73, float:1.61E-43)
            r0 = r0 | r3
            r4 = r3 & r0
            r0 = r0 | r3
            int r4 = r4 + r0
            int r0 = r4 % 128
            getSDKVersion = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0075
            r0 = r2
            goto L_0x0076
        L_0x0075:
            r0 = r1
        L_0x0076:
            if (r0 == 0) goto L_0x008f
            javax.crypto.SecretKey r0 = r13.configure()
            com.cardinalcommerce.a.setNextFocusLeftId r3 = r13.init()
            java.security.Provider r4 = r3.configure
            r5 = 40
            int r5 = r5 / r1
            if (r4 == 0) goto L_0x0089
            r4 = r1
            goto L_0x008a
        L_0x0089:
            r4 = r2
        L_0x008a:
            if (r4 == 0) goto L_0x00a0
            goto L_0x00bb
        L_0x008d:
            r14 = move-exception
            throw r14
        L_0x008f:
            javax.crypto.SecretKey r0 = r13.configure()
            com.cardinalcommerce.a.setNextFocusLeftId r3 = r13.init()
            java.security.Provider r4 = r3.configure
            if (r4 == 0) goto L_0x009d
            r4 = r1
            goto L_0x009e
        L_0x009d:
            r4 = r2
        L_0x009e:
            if (r4 == r2) goto L_0x00bb
        L_0x00a0:
            int r4 = init
            r5 = r4 & 95
            r4 = r4 ^ 95
            r4 = r4 | r5
            int r5 = r5 + r4
            int r4 = r5 % 128
            getSDKVersion = r4
            int r5 = r5 % 2
            java.security.Provider r3 = r3.configure
            int r4 = getSDKVersion
            int r4 = r4 + 21
            int r5 = r4 % 128
            init = r5
            int r4 = r4 % 2
            goto L_0x00d5
        L_0x00bb:
            java.security.Provider r3 = r3.cca_continue
            int r4 = init
            r5 = r4 ^ 61
            r7 = r4 & 61
            r5 = r5 | r7
            int r5 = r5 << r2
            int r7 = ~r7
            r4 = r4 | 61
            r4 = r4 & r7
            int r4 = -r4
            r7 = r5 | r4
            int r7 = r7 << r2
            r4 = r4 ^ r5
            int r7 = r7 - r4
            int r4 = r7 % 128
            getSDKVersion = r4
            int r7 = r7 % 2
        L_0x00d5:
            r7 = r0
            r11 = r3
            com.cardinalcommerce.a.setNextFocusLeftId r0 = r13.init()
            java.security.Provider r3 = r0.getInstance
            if (r3 == 0) goto L_0x00e1
            r3 = r2
            goto L_0x00e2
        L_0x00e1:
            r3 = r1
        L_0x00e2:
            if (r3 == r2) goto L_0x00fe
            java.security.Provider r0 = r0.cca_continue
            int r3 = init
            r4 = r3 & 89
            int r5 = ~r4
            r3 = r3 | 89
            r3 = r3 & r5
            int r4 = r4 << r2
            int r4 = -r4
            int r4 = -r4
            r5 = r3 | r4
            int r5 = r5 << r2
            r3 = r3 ^ r4
            int r5 = r5 - r3
            int r3 = r5 % 128
            getSDKVersion = r3
            int r5 = r5 % 2
        L_0x00fc:
            r12 = r0
            goto L_0x0127
        L_0x00fe:
            int r3 = init
            r4 = r3 & -66
            int r5 = ~r3
            r8 = 65
            r5 = r5 & r8
            r4 = r4 | r5
            r3 = r3 & r8
            int r3 = r3 << r2
            r5 = r4 & r3
            r3 = r3 | r4
            int r5 = r5 + r3
            int r3 = r5 % 128
            getSDKVersion = r3
            int r5 = r5 % 2
            java.security.Provider r0 = r0.getInstance
            int r3 = getSDKVersion
            int r3 = r3 + 61
            int r3 = r3 - r2
            r4 = r3 ^ -1
            r3 = r3 & -1
            int r3 = r3 << r2
            int r4 = r4 + r3
            int r3 = r4 % 128
            init = r3
            int r4 = r4 % 2
            goto L_0x00fc
        L_0x0127:
            r8 = r15
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AuthenticatedCipherText r0 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESCBC.init(r7, r8, r9, r10, r11, r12)
            int r3 = init
            r4 = r3 & 113(0x71, float:1.58E-43)
            r3 = r3 ^ 113(0x71, float:1.58E-43)
            r3 = r3 | r4
            int r4 = r4 + r3
        L_0x0134:
            int r3 = r4 % 128
            getSDKVersion = r3
            int r4 = r4 % 2
            goto L_0x01a2
        L_0x013b:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r14.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r3 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.onValidated
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01d5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Container r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Container
            r0.<init>(r15)
            javax.crypto.SecretKey r3 = r13.configure()
            com.cardinalcommerce.a.setNextFocusLeftId r4 = r13.init()
            java.security.Provider r5 = r4.configure
            if (r5 == 0) goto L_0x0158
            r5 = r2
            goto L_0x0159
        L_0x0158:
            r5 = r1
        L_0x0159:
            if (r5 == 0) goto L_0x0180
            int r5 = getSDKVersion
            int r5 = r5 + 65
            int r5 = r5 - r2
            r7 = r5 ^ -1
            r5 = r5 & -1
            int r5 = r5 << r2
            int r7 = r7 + r5
            int r5 = r7 % 128
            init = r5
            int r7 = r7 % 2
            java.security.Provider r4 = r4.configure
            int r5 = getSDKVersion
            int r5 = r5 + 3
            int r5 = r5 - r2
            r7 = r5 ^ -1
            r5 = r5 & -1
            int r5 = r5 << r2
            int r7 = r7 + r5
            int r5 = r7 % 128
            init = r5
            int r7 = r7 % 2
            goto L_0x0194
        L_0x0180:
            java.security.Provider r4 = r4.cca_continue
            int r5 = getSDKVersion
            r7 = r5 & 33
            r5 = r5 ^ 33
            r5 = r5 | r7
            r8 = r7 | r5
            int r8 = r8 << r2
            r5 = r5 ^ r7
            int r8 = r8 - r5
            int r5 = r8 % 128
            init = r5
            int r8 = r8 % 2
        L_0x0194:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AuthenticatedCipherText r0 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESGCM.cca_continue(r3, r0, r9, r10, r4)
            int r3 = init
            r4 = r3 & 50
            r3 = r3 | 50
            int r4 = r4 + r3
            int r4 = r4 - r1
            int r4 = r4 - r2
            goto L_0x0134
        L_0x01a2:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts r3 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r7 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.init(r15)
            byte[] r15 = r0.configure
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r8 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.init(r15)
            byte[] r15 = r0.init
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r9 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.init(r15)
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            int r14 = getSDKVersion
            r15 = r14 & 45
            r14 = r14 ^ 45
            r14 = r14 | r15
            int r15 = r15 + r14
            int r14 = r15 % 128
            init = r14
            int r15 = r15 % 2
            if (r15 == 0) goto L_0x01cb
            r14 = r2
            goto L_0x01cc
        L_0x01cb:
            r14 = r1
        L_0x01cc:
            if (r14 == r2) goto L_0x01cf
            return r3
        L_0x01cf:
            r14 = 91
            int r14 = r14 / r1
            return r3
        L_0x01d3:
            r14 = move-exception
            throw r14
        L_0x01d5:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r15 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r14 = r14.Cardinal
            java.util.Set r0 = configure
            java.lang.String r14 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.init((com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod) r14, (java.util.Collection<com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod>) r0)
            r15.<init>(r14)
            throw r15
        L_0x01e3:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r14 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "The Content Encryption Key (CEK) length for "
            r15.<init>(r1)
            java.lang.StringBuilder r15 = r15.append(r0)
            java.lang.String r1 = " must be "
            java.lang.StringBuilder r15 = r15.append(r1)
            int r0 = r0.getInstance
            java.lang.StringBuilder r15 = r15.append(r0)
            java.lang.String r0 = " bits"
            java.lang.StringBuilder r15 = r15.append(r0)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x020a:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r14 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException
            int r15 = r0.getInstance
            r14.<init>(r15, r0)
            throw r14
        L_0x0212:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r14 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            java.lang.String r15 = "Invalid alg "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r15 = r15.concat(r0)
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setIsHandwritingDelegate.getInstance(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader, byte[]):com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts");
    }
}
