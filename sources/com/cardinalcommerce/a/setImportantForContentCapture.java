package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

public abstract class setImportantForContentCapture extends setOnReceiveContentListener {
    public static final Set<JWEAlgorithm> cca_continue;
    public static final Set<EncryptionMethod> configure = setContentCaptureSession.cca_continue;
    private final SecretKey getInstance;

    public final /* bridge */ /* synthetic */ Set Cardinal() {
        return super.Cardinal();
    }

    public final /* bridge */ /* synthetic */ Set cca_continue() {
        return super.cca_continue();
    }

    public final /* bridge */ /* synthetic */ setNextFocusLeftId init() {
        return super.getInstance();
    }

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.getWarnings);
        cca_continue = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public setImportantForContentCapture(javax.crypto.SecretKey r4) throws com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException {
        /*
            r3 = this;
            java.util.Set<com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm> r0 = cca_continue
            byte[] r1 = r4.getEncoded()
            int r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils.init(r1)
            java.util.Map<java.lang.Integer, java.util.Set<com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod>> r2 = com.cardinalcommerce.a.setContentCaptureSession.Cardinal
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.get(r1)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x001e
            r3.<init>(r0, r1)
            r3.getInstance = r4
            return
        L_0x001e:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r4 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException
            java.lang.String r0 = "The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setImportantForContentCapture.<init>(javax.crypto.SecretKey):void");
    }

    public final SecretKey configure() {
        return this.getInstance;
    }
}
