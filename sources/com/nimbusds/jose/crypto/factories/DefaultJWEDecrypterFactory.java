package com.nimbusds.jose.crypto.factories;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.crypto.AESDecrypter;
import com.nimbusds.jose.crypto.DirectDecrypter;
import com.nimbusds.jose.crypto.ECDHDecrypter;
import com.nimbusds.jose.crypto.PasswordBasedDecrypter;
import com.nimbusds.jose.crypto.RSADecrypter;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.proc.JWEDecrypterFactory;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class DefaultJWEDecrypterFactory implements JWEDecrypterFactory {
    public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;
    private final JWEJCAContext jcaContext = new JWEJCAContext();

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(RSADecrypter.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(ECDHDecrypter.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(DirectDecrypter.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(AESDecrypter.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(PasswordBasedDecrypter.SUPPORTED_ALGORITHMS);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(RSADecrypter.SUPPORTED_ENCRYPTION_METHODS);
        linkedHashSet2.addAll(ECDHDecrypter.SUPPORTED_ENCRYPTION_METHODS);
        linkedHashSet2.addAll(DirectDecrypter.SUPPORTED_ENCRYPTION_METHODS);
        linkedHashSet2.addAll(AESDecrypter.SUPPORTED_ENCRYPTION_METHODS);
        linkedHashSet2.addAll(PasswordBasedDecrypter.SUPPORTED_ENCRYPTION_METHODS);
        SUPPORTED_ENCRYPTION_METHODS = Collections.unmodifiableSet(linkedHashSet2);
    }

    public Set<JWEAlgorithm> supportedJWEAlgorithms() {
        return SUPPORTED_ALGORITHMS;
    }

    public Set<EncryptionMethod> supportedEncryptionMethods() {
        return SUPPORTED_ENCRYPTION_METHODS;
    }

    public JWEJCAContext getJCAContext() {
        return this.jcaContext;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: com.nimbusds.jose.crypto.AESDecrypter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: com.nimbusds.jose.crypto.AESDecrypter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: com.nimbusds.jose.crypto.AESDecrypter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.nimbusds.jose.JWEDecrypter createJWEDecrypter(com.nimbusds.jose.JWEHeader r3, java.security.Key r4) throws com.nimbusds.jose.JOSEException {
        /*
            r2 = this;
            java.util.Set r0 = com.nimbusds.jose.crypto.RSADecrypter.SUPPORTED_ALGORITHMS
            com.nimbusds.jose.JWEAlgorithm r1 = r3.getAlgorithm()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002d
            java.util.Set r0 = com.nimbusds.jose.crypto.RSADecrypter.SUPPORTED_ENCRYPTION_METHODS
            com.nimbusds.jose.EncryptionMethod r1 = r3.getEncryptionMethod()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002d
            boolean r3 = r4 instanceof java.security.interfaces.RSAPrivateKey
            if (r3 == 0) goto L_0x0025
            java.security.interfaces.RSAPrivateKey r4 = (java.security.interfaces.RSAPrivateKey) r4
            com.nimbusds.jose.crypto.RSADecrypter r3 = new com.nimbusds.jose.crypto.RSADecrypter
            r3.<init>((java.security.PrivateKey) r4)
            goto L_0x0112
        L_0x0025:
            com.nimbusds.jose.KeyTypeException r3 = new com.nimbusds.jose.KeyTypeException
            java.lang.Class<java.security.interfaces.RSAPrivateKey> r4 = java.security.interfaces.RSAPrivateKey.class
            r3.<init>(r4)
            throw r3
        L_0x002d:
            java.util.Set r0 = com.nimbusds.jose.crypto.ECDHDecrypter.SUPPORTED_ALGORITHMS
            com.nimbusds.jose.JWEAlgorithm r1 = r3.getAlgorithm()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005a
            java.util.Set r0 = com.nimbusds.jose.crypto.ECDHDecrypter.SUPPORTED_ENCRYPTION_METHODS
            com.nimbusds.jose.EncryptionMethod r1 = r3.getEncryptionMethod()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005a
            boolean r3 = r4 instanceof java.security.interfaces.ECPrivateKey
            if (r3 == 0) goto L_0x0052
            java.security.interfaces.ECPrivateKey r4 = (java.security.interfaces.ECPrivateKey) r4
            com.nimbusds.jose.crypto.ECDHDecrypter r3 = new com.nimbusds.jose.crypto.ECDHDecrypter
            r3.<init>((java.security.interfaces.ECPrivateKey) r4)
            goto L_0x0112
        L_0x0052:
            com.nimbusds.jose.KeyTypeException r3 = new com.nimbusds.jose.KeyTypeException
            java.lang.Class<java.security.interfaces.ECPrivateKey> r4 = java.security.interfaces.ECPrivateKey.class
            r3.<init>(r4)
            throw r3
        L_0x005a:
            java.util.Set r0 = com.nimbusds.jose.crypto.DirectDecrypter.SUPPORTED_ALGORITHMS
            com.nimbusds.jose.JWEAlgorithm r1 = r3.getAlgorithm()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00a8
            java.util.Set r0 = com.nimbusds.jose.crypto.DirectDecrypter.SUPPORTED_ENCRYPTION_METHODS
            com.nimbusds.jose.EncryptionMethod r1 = r3.getEncryptionMethod()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r4 instanceof javax.crypto.SecretKey
            if (r0 == 0) goto L_0x00a0
            javax.crypto.SecretKey r4 = (javax.crypto.SecretKey) r4
            com.nimbusds.jose.crypto.DirectDecrypter r0 = new com.nimbusds.jose.crypto.DirectDecrypter
            r0.<init>((javax.crypto.SecretKey) r4)
            java.util.Set r4 = r0.supportedEncryptionMethods()
            com.nimbusds.jose.EncryptionMethod r1 = r3.getEncryptionMethod()
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L_0x008e
        L_0x008b:
            r3 = r0
            goto L_0x0112
        L_0x008e:
            com.nimbusds.jose.KeyLengthException r4 = new com.nimbusds.jose.KeyLengthException
            com.nimbusds.jose.EncryptionMethod r0 = r3.getEncryptionMethod()
            int r0 = r0.cekBitLength()
            com.nimbusds.jose.EncryptionMethod r3 = r3.getEncryptionMethod()
            r4.<init>(r0, r3)
            throw r4
        L_0x00a0:
            com.nimbusds.jose.KeyTypeException r3 = new com.nimbusds.jose.KeyTypeException
            java.lang.Class<javax.crypto.SecretKey> r4 = javax.crypto.SecretKey.class
            r3.<init>(r4)
            throw r3
        L_0x00a8:
            java.util.Set r0 = com.nimbusds.jose.crypto.AESDecrypter.SUPPORTED_ALGORITHMS
            com.nimbusds.jose.JWEAlgorithm r1 = r3.getAlgorithm()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00ec
            java.util.Set r0 = com.nimbusds.jose.crypto.AESDecrypter.SUPPORTED_ENCRYPTION_METHODS
            com.nimbusds.jose.EncryptionMethod r1 = r3.getEncryptionMethod()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r4 instanceof javax.crypto.SecretKey
            if (r0 == 0) goto L_0x00e4
            javax.crypto.SecretKey r4 = (javax.crypto.SecretKey) r4
            com.nimbusds.jose.crypto.AESDecrypter r0 = new com.nimbusds.jose.crypto.AESDecrypter
            r0.<init>((javax.crypto.SecretKey) r4)
            java.util.Set r4 = r0.supportedJWEAlgorithms()
            com.nimbusds.jose.JWEAlgorithm r1 = r3.getAlgorithm()
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L_0x00da
            goto L_0x008b
        L_0x00da:
            com.nimbusds.jose.KeyLengthException r4 = new com.nimbusds.jose.KeyLengthException
            com.nimbusds.jose.JWEAlgorithm r3 = r3.getAlgorithm()
            r4.<init>((com.nimbusds.jose.Algorithm) r3)
            throw r4
        L_0x00e4:
            com.nimbusds.jose.KeyTypeException r3 = new com.nimbusds.jose.KeyTypeException
            java.lang.Class<javax.crypto.SecretKey> r4 = javax.crypto.SecretKey.class
            r3.<init>(r4)
            throw r3
        L_0x00ec:
            java.util.Set r0 = com.nimbusds.jose.crypto.PasswordBasedDecrypter.SUPPORTED_ALGORITHMS
            com.nimbusds.jose.JWEAlgorithm r1 = r3.getAlgorithm()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0166
            java.util.Set r0 = com.nimbusds.jose.crypto.PasswordBasedDecrypter.SUPPORTED_ENCRYPTION_METHODS
            com.nimbusds.jose.EncryptionMethod r3 = r3.getEncryptionMethod()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x0166
            boolean r3 = r4 instanceof javax.crypto.SecretKey
            if (r3 == 0) goto L_0x015e
            byte[] r3 = r4.getEncoded()
            com.nimbusds.jose.crypto.PasswordBasedDecrypter r4 = new com.nimbusds.jose.crypto.PasswordBasedDecrypter
            r4.<init>((byte[]) r3)
            r3 = r4
        L_0x0112:
            com.nimbusds.jose.jca.JCAContext r4 = r3.getJCAContext()
            com.nimbusds.jose.jca.JWEJCAContext r4 = (com.nimbusds.jose.jca.JWEJCAContext) r4
            com.nimbusds.jose.jca.JWEJCAContext r0 = r2.jcaContext
            java.security.SecureRandom r0 = r0.getSecureRandom()
            r4.setSecureRandom(r0)
            com.nimbusds.jose.jca.JCAContext r4 = r3.getJCAContext()
            com.nimbusds.jose.jca.JWEJCAContext r4 = (com.nimbusds.jose.jca.JWEJCAContext) r4
            com.nimbusds.jose.jca.JWEJCAContext r0 = r2.jcaContext
            java.security.Provider r0 = r0.getProvider()
            r4.setProvider(r0)
            com.nimbusds.jose.jca.JCAContext r4 = r3.getJCAContext()
            com.nimbusds.jose.jca.JWEJCAContext r4 = (com.nimbusds.jose.jca.JWEJCAContext) r4
            com.nimbusds.jose.jca.JWEJCAContext r0 = r2.jcaContext
            java.security.Provider r0 = r0.getKeyEncryptionProvider()
            r4.setKeyEncryptionProvider(r0)
            com.nimbusds.jose.jca.JCAContext r4 = r3.getJCAContext()
            com.nimbusds.jose.jca.JWEJCAContext r4 = (com.nimbusds.jose.jca.JWEJCAContext) r4
            com.nimbusds.jose.jca.JWEJCAContext r0 = r2.jcaContext
            java.security.Provider r0 = r0.getMACProvider()
            r4.setMACProvider(r0)
            com.nimbusds.jose.jca.JCAContext r4 = r3.getJCAContext()
            com.nimbusds.jose.jca.JWEJCAContext r4 = (com.nimbusds.jose.jca.JWEJCAContext) r4
            com.nimbusds.jose.jca.JWEJCAContext r0 = r2.jcaContext
            java.security.Provider r0 = r0.getContentEncryptionProvider()
            r4.setContentEncryptionProvider(r0)
            return r3
        L_0x015e:
            com.nimbusds.jose.KeyTypeException r3 = new com.nimbusds.jose.KeyTypeException
            java.lang.Class<javax.crypto.SecretKey> r4 = javax.crypto.SecretKey.class
            r3.<init>(r4)
            throw r3
        L_0x0166:
            com.nimbusds.jose.JOSEException r3 = new com.nimbusds.jose.JOSEException
            java.lang.String r4 = "Unsupported JWE algorithm or encryption method"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nimbusds.jose.crypto.factories.DefaultJWEDecrypterFactory.createJWEDecrypter(com.nimbusds.jose.JWEHeader, java.security.Key):com.nimbusds.jose.JWEDecrypter");
    }
}
