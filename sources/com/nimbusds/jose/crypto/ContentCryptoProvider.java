package com.nimbusds.jose.crypto;

import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerOverflowException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

class ContentCryptoProvider {
    public static final Map<Integer, Set<EncryptionMethod>> COMPATIBLE_ENCRYPTION_METHODS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;

    ContentCryptoProvider() {
    }

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(EncryptionMethod.A128CBC_HS256);
        linkedHashSet.add(EncryptionMethod.A192CBC_HS384);
        linkedHashSet.add(EncryptionMethod.A256CBC_HS512);
        linkedHashSet.add(EncryptionMethod.A128GCM);
        linkedHashSet.add(EncryptionMethod.A192GCM);
        linkedHashSet.add(EncryptionMethod.A256GCM);
        linkedHashSet.add(EncryptionMethod.A128CBC_HS256_DEPRECATED);
        linkedHashSet.add(EncryptionMethod.A256CBC_HS512_DEPRECATED);
        SUPPORTED_ENCRYPTION_METHODS = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(EncryptionMethod.A128GCM);
        hashSet2.add(EncryptionMethod.A192GCM);
        hashSet3.add(EncryptionMethod.A256GCM);
        hashSet3.add(EncryptionMethod.A128CBC_HS256);
        hashSet3.add(EncryptionMethod.A128CBC_HS256_DEPRECATED);
        hashSet4.add(EncryptionMethod.A192CBC_HS384);
        hashSet5.add(EncryptionMethod.A256CBC_HS512);
        hashSet5.add(EncryptionMethod.A256CBC_HS512_DEPRECATED);
        hashMap.put(128, Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(Integer.valueOf(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), Collections.unmodifiableSet(hashSet4));
        hashMap.put(512, Collections.unmodifiableSet(hashSet5));
        COMPATIBLE_ENCRYPTION_METHODS = Collections.unmodifiableMap(hashMap);
    }

    public static SecretKey generateCEK(EncryptionMethod encryptionMethod, SecureRandom secureRandom) throws JOSEException {
        Set<EncryptionMethod> set = SUPPORTED_ENCRYPTION_METHODS;
        if (set.contains(encryptionMethod)) {
            byte[] bArr = new byte[ByteUtils.byteLength(encryptionMethod.cekBitLength())];
            secureRandom.nextBytes(bArr);
            return new SecretKeySpec(bArr, "AES");
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(encryptionMethod, set));
    }

    private static void checkCEKLength(SecretKey secretKey, EncryptionMethod encryptionMethod) throws KeyLengthException {
        try {
            if (encryptionMethod.cekBitLength() != ByteUtils.safeBitLength(secretKey.getEncoded())) {
                throw new KeyLengthException("The Content Encryption Key (CEK) length for " + encryptionMethod + " must be " + encryptionMethod.cekBitLength() + " bits");
            }
        } catch (IntegerOverflowException e) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader r8, byte[] r9, javax.crypto.SecretKey r10, com.nimbusds.jose.util.Base64URL r11, com.nimbusds.jose.jca.JWEJCAContext r12) throws com.nimbusds.jose.JOSEException {
        /*
            com.nimbusds.jose.EncryptionMethod r0 = r8.getEncryptionMethod()
            checkCEKLength(r10, r0)
            byte[] r9 = com.nimbusds.jose.crypto.DeflateHelper.applyCompression(r8, r9)
            byte[] r4 = com.nimbusds.jose.crypto.AAD.compute((com.nimbusds.jose.JWEHeader) r8)
            com.nimbusds.jose.EncryptionMethod r0 = r8.getEncryptionMethod()
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.A128CBC_HS256
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00ba
            com.nimbusds.jose.EncryptionMethod r0 = r8.getEncryptionMethod()
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.A192CBC_HS384
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00ba
            com.nimbusds.jose.EncryptionMethod r0 = r8.getEncryptionMethod()
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.A256CBC_HS512
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            goto L_0x00ba
        L_0x0035:
            com.nimbusds.jose.EncryptionMethod r0 = r8.getEncryptionMethod()
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.A128GCM
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009d
            com.nimbusds.jose.EncryptionMethod r0 = r8.getEncryptionMethod()
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.A192GCM
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009d
            com.nimbusds.jose.EncryptionMethod r0 = r8.getEncryptionMethod()
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.A256GCM
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005a
            goto L_0x009d
        L_0x005a:
            com.nimbusds.jose.EncryptionMethod r0 = r8.getEncryptionMethod()
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.A128CBC_HS256_DEPRECATED
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0083
            com.nimbusds.jose.EncryptionMethod r0 = r8.getEncryptionMethod()
            com.nimbusds.jose.EncryptionMethod r1 = com.nimbusds.jose.EncryptionMethod.A256CBC_HS512_DEPRECATED
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            goto L_0x0083
        L_0x0073:
            com.nimbusds.jose.JOSEException r9 = new com.nimbusds.jose.JOSEException
            com.nimbusds.jose.EncryptionMethod r8 = r8.getEncryptionMethod()
            java.util.Set<com.nimbusds.jose.EncryptionMethod> r10 = SUPPORTED_ENCRYPTION_METHODS
            java.lang.String r8 = com.nimbusds.jose.crypto.AlgorithmSupportMessage.unsupportedEncryptionMethod(r8, r10)
            r9.<init>(r8)
            throw r9
        L_0x0083:
            java.security.SecureRandom r0 = r12.getSecureRandom()
            byte[] r0 = com.nimbusds.jose.crypto.AESCBC.generateIV(r0)
            java.security.Provider r6 = r12.getContentEncryptionProvider()
            java.security.Provider r7 = r12.getMACProvider()
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r0
            r5 = r9
            com.nimbusds.jose.crypto.AuthenticatedCipherText r9 = com.nimbusds.jose.crypto.AESCBC.encryptWithConcatKDF(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00d1
        L_0x009d:
            com.nimbusds.jose.util.Container r0 = new com.nimbusds.jose.util.Container
            java.security.SecureRandom r1 = r12.getSecureRandom()
            byte[] r1 = com.nimbusds.jose.crypto.AESGCM.generateIV(r1)
            r0.<init>(r1)
            java.security.Provider r12 = r12.getContentEncryptionProvider()
            com.nimbusds.jose.crypto.AuthenticatedCipherText r9 = com.nimbusds.jose.crypto.AESGCM.encrypt(r10, r0, r9, r4, r12)
            java.lang.Object r10 = r0.get()
            r0 = r10
            byte[] r0 = (byte[]) r0
            goto L_0x00d1
        L_0x00ba:
            java.security.SecureRandom r0 = r12.getSecureRandom()
            byte[] r0 = com.nimbusds.jose.crypto.AESCBC.generateIV(r0)
            java.security.Provider r5 = r12.getContentEncryptionProvider()
            java.security.Provider r6 = r12.getMACProvider()
            r1 = r10
            r2 = r0
            r3 = r9
            com.nimbusds.jose.crypto.AuthenticatedCipherText r9 = com.nimbusds.jose.crypto.AESCBC.encryptAuthenticated(r1, r2, r3, r4, r5, r6)
        L_0x00d1:
            com.nimbusds.jose.JWECryptoParts r10 = new com.nimbusds.jose.JWECryptoParts
            com.nimbusds.jose.util.Base64URL r4 = com.nimbusds.jose.util.Base64URL.encode((byte[]) r0)
            byte[] r12 = r9.getCipherText()
            com.nimbusds.jose.util.Base64URL r5 = com.nimbusds.jose.util.Base64URL.encode((byte[]) r12)
            byte[] r9 = r9.getAuthenticationTag()
            com.nimbusds.jose.util.Base64URL r6 = com.nimbusds.jose.util.Base64URL.encode((byte[]) r9)
            r1 = r10
            r2 = r8
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nimbusds.jose.crypto.ContentCryptoProvider.encrypt(com.nimbusds.jose.JWEHeader, byte[], javax.crypto.SecretKey, com.nimbusds.jose.util.Base64URL, com.nimbusds.jose.jca.JWEJCAContext):com.nimbusds.jose.JWECryptoParts");
    }

    public static byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, SecretKey secretKey, JWEJCAContext jWEJCAContext) throws JOSEException {
        byte[] bArr;
        checkCEKLength(secretKey, jWEHeader.getEncryptionMethod());
        byte[] compute = AAD.compute(jWEHeader);
        if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            bArr = AESCBC.decryptAuthenticated(secretKey, base64URL2.decode(), base64URL3.decode(), compute, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
            byte[] decode = base64URL2.decode();
            byte[] decode2 = base64URL3.decode();
            byte[] decode3 = base64URL4.decode();
            bArr = AESGCM.decrypt(secretKey, decode, decode2, compute, decode3, jWEJCAContext.getContentEncryptionProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
            bArr = AESCBC.decryptWithConcatKDF(jWEHeader, secretKey, base64URL, base64URL2, base64URL3, base64URL4, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
        }
        return DeflateHelper.applyDecompression(jWEHeader, bArr);
    }
}
