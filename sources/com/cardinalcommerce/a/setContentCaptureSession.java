package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AAD;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESCBC;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESGCM;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.DeflateHelper;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class setContentCaptureSession {
    public static final Map<Integer, Set<EncryptionMethod>> Cardinal;
    public static final Set<EncryptionMethod> cca_continue;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(EncryptionMethod.init);
        linkedHashSet.add(EncryptionMethod.Cardinal);
        linkedHashSet.add(EncryptionMethod.onCReqSuccess);
        linkedHashSet.add(EncryptionMethod.onValidated);
        linkedHashSet.add(EncryptionMethod.cleanup);
        linkedHashSet.add(EncryptionMethod.valueOf);
        linkedHashSet.add(EncryptionMethod.getSDKVersion);
        linkedHashSet.add(EncryptionMethod.getWarnings);
        cca_continue = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(EncryptionMethod.onValidated);
        hashSet2.add(EncryptionMethod.cleanup);
        hashSet3.add(EncryptionMethod.valueOf);
        hashSet3.add(EncryptionMethod.init);
        hashSet3.add(EncryptionMethod.getSDKVersion);
        hashSet4.add(EncryptionMethod.Cardinal);
        hashSet5.add(EncryptionMethod.onCReqSuccess);
        hashSet5.add(EncryptionMethod.getWarnings);
        hashMap.put(128, Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(Integer.valueOf(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), Collections.unmodifiableSet(hashSet4));
        hashMap.put(512, Collections.unmodifiableSet(hashSet5));
        Cardinal = Collections.unmodifiableMap(hashMap);
    }

    public static SecretKey cca_continue(EncryptionMethod encryptionMethod, SecureRandom secureRandom) throws JOSEException {
        Set<EncryptionMethod> set = cca_continue;
        if (set.contains(encryptionMethod)) {
            byte[] bArr = new byte[ByteUtils.Cardinal(encryptionMethod.getInstance)];
            secureRandom.nextBytes(bArr);
            return new SecretKeySpec(bArr, "AES");
        }
        throw new JOSEException(AlgorithmSupportMessage.init(encryptionMethod, (Collection<EncryptionMethod>) set));
    }

    private static void configure(SecretKey secretKey, EncryptionMethod encryptionMethod) throws KeyLengthException {
        try {
            if (encryptionMethod.getInstance != ByteUtils.getInstance(secretKey.getEncoded())) {
                throw new KeyLengthException(new StringBuilder("The Content Encryption Key (CEK) length for ").append(encryptionMethod).append(" must be ").append(encryptionMethod.getInstance).append(" bits").toString());
            }
        } catch (setHandwritingBoundsOffsets e) {
            throw new KeyLengthException(new StringBuilder("The Content Encryption Key (CEK) is too long: ").append(e.getMessage()).toString());
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [T] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts configure(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader r8, byte[] r9, javax.crypto.SecretKey r10, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r11, com.cardinalcommerce.a.setNextFocusLeftId r12) throws com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException {
        /*
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r8.Cardinal
            configure(r10, r0)
            byte[] r9 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.DeflateHelper.Cardinal(r8, r9)
            byte[] r4 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AAD.configure(r8)
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r8.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.init
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r8.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.Cardinal
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r8.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.onCReqSuccess
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002d
            goto L_0x00c5
        L_0x002d:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r8.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.onValidated
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009d
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r8.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.cleanup
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009d
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r8.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.valueOf
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            goto L_0x009d
        L_0x004c:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r8.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.getSDKVersion
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006f
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r0 = r8.Cardinal
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.getWarnings
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x006f
        L_0x0061:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException r9 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r8 = r8.Cardinal
            java.util.Set<com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod> r10 = cca_continue
            java.lang.String r8 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.init((com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod) r8, (java.util.Collection<com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod>) r10)
            r9.<init>(r8)
            throw r9
        L_0x006f:
            java.security.SecureRandom r0 = r12.Cardinal
            if (r0 == 0) goto L_0x0076
            java.security.SecureRandom r0 = r12.Cardinal
            goto L_0x007b
        L_0x0076:
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
        L_0x007b:
            byte[] r0 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESCBC.init(r0)
            java.security.Provider r1 = r12.configure
            if (r1 == 0) goto L_0x0086
            java.security.Provider r1 = r12.configure
            goto L_0x0088
        L_0x0086:
            java.security.Provider r1 = r12.cca_continue
        L_0x0088:
            r6 = r1
            java.security.Provider r1 = r12.getInstance
            if (r1 == 0) goto L_0x0090
            java.security.Provider r12 = r12.getInstance
            goto L_0x0092
        L_0x0090:
            java.security.Provider r12 = r12.cca_continue
        L_0x0092:
            r7 = r12
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r0
            r5 = r9
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AuthenticatedCipherText r9 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESCBC.getInstance((com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader) r1, (javax.crypto.SecretKey) r2, (com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL) r3, (byte[]) r4, (byte[]) r5, (java.security.Provider) r6, (java.security.Provider) r7)
            goto L_0x00f0
        L_0x009d:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Container r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Container
            java.security.SecureRandom r1 = r12.Cardinal
            if (r1 == 0) goto L_0x00a6
            java.security.SecureRandom r1 = r12.Cardinal
            goto L_0x00ab
        L_0x00a6:
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
        L_0x00ab:
            byte[] r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESGCM.getInstance(r1)
            r0.<init>(r1)
            java.security.Provider r1 = r12.configure
            if (r1 == 0) goto L_0x00b9
            java.security.Provider r12 = r12.configure
            goto L_0x00bb
        L_0x00b9:
            java.security.Provider r12 = r12.cca_continue
        L_0x00bb:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AuthenticatedCipherText r9 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESGCM.cca_continue(r10, r0, r9, r4, r12)
            T r10 = r0.init
            r0 = r10
            byte[] r0 = (byte[]) r0
            goto L_0x00f0
        L_0x00c5:
            java.security.SecureRandom r0 = r12.Cardinal
            if (r0 == 0) goto L_0x00cc
            java.security.SecureRandom r0 = r12.Cardinal
            goto L_0x00d1
        L_0x00cc:
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
        L_0x00d1:
            byte[] r0 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESCBC.init(r0)
            java.security.Provider r1 = r12.configure
            if (r1 == 0) goto L_0x00dc
            java.security.Provider r1 = r12.configure
            goto L_0x00de
        L_0x00dc:
            java.security.Provider r1 = r12.cca_continue
        L_0x00de:
            r5 = r1
            java.security.Provider r1 = r12.getInstance
            if (r1 == 0) goto L_0x00e6
            java.security.Provider r12 = r12.getInstance
            goto L_0x00e8
        L_0x00e6:
            java.security.Provider r12 = r12.cca_continue
        L_0x00e8:
            r6 = r12
            r1 = r10
            r2 = r0
            r3 = r9
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AuthenticatedCipherText r9 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AESCBC.init(r1, r2, r3, r4, r5, r6)
        L_0x00f0:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts r10 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r4 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.init(r0)
            byte[] r12 = r9.configure
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r5 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.init(r12)
            byte[] r9 = r9.init
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r6 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.init(r9)
            r1 = r10
            r2 = r8
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setContentCaptureSession.configure(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader, byte[], javax.crypto.SecretKey, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.a.setNextFocusLeftId):com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts");
    }

    public static byte[] cca_continue(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, SecretKey secretKey, setNextFocusLeftId setnextfocusleftid) throws JOSEException {
        byte[] bArr;
        configure(secretKey, jWEHeader.Cardinal);
        byte[] configure = AAD.configure(jWEHeader);
        if (jWEHeader.Cardinal.equals(EncryptionMethod.init) || jWEHeader.Cardinal.equals(EncryptionMethod.Cardinal) || jWEHeader.Cardinal.equals(EncryptionMethod.onCReqSuccess)) {
            bArr = AESCBC.getInstance(secretKey, setPreferKeepClear.cca_continue(base64URL2.cca_continue), setPreferKeepClear.cca_continue(base64URL3.cca_continue), configure, setPreferKeepClear.cca_continue(base64URL4.cca_continue), setnextfocusleftid.configure != null ? setnextfocusleftid.configure : setnextfocusleftid.cca_continue, setnextfocusleftid.getInstance != null ? setnextfocusleftid.getInstance : setnextfocusleftid.cca_continue);
        } else if (jWEHeader.Cardinal.equals(EncryptionMethod.onValidated) || jWEHeader.Cardinal.equals(EncryptionMethod.cleanup) || jWEHeader.Cardinal.equals(EncryptionMethod.valueOf)) {
            bArr = AESGCM.getInstance(secretKey, setPreferKeepClear.cca_continue(base64URL2.cca_continue), setPreferKeepClear.cca_continue(base64URL3.cca_continue), configure, setPreferKeepClear.cca_continue(base64URL4.cca_continue), setnextfocusleftid.configure != null ? setnextfocusleftid.configure : setnextfocusleftid.cca_continue);
        } else if (jWEHeader.Cardinal.equals(EncryptionMethod.getSDKVersion) || jWEHeader.Cardinal.equals(EncryptionMethod.getWarnings)) {
            bArr = AESCBC.init(jWEHeader, secretKey, base64URL, base64URL2, base64URL3, base64URL4, setnextfocusleftid.configure != null ? setnextfocusleftid.configure : setnextfocusleftid.cca_continue, setnextfocusleftid.getInstance != null ? setnextfocusleftid.getInstance : setnextfocusleftid.cca_continue);
        } else {
            throw new JOSEException(AlgorithmSupportMessage.init(jWEHeader.Cardinal, (Collection<EncryptionMethod>) cca_continue));
        }
        return DeflateHelper.getInstance(jWEHeader, bArr);
    }
}
