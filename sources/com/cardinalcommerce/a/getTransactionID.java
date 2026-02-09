package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public final class getTransactionID implements GMCipherSpi.SM2withRMD, PrivateKey {
    private transient setEnableDFSync Cardinal;
    private transient getAuthenticationRequestParameters cca_continue;
    private transient ASN1ObjectIdentifier getInstance;

    public getTransactionID(PrivateKeyInfo privateKeyInfo) throws IOException {
        cca_continue(privateKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        cca_continue(PrivateKeyInfo.cca_continue((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    private void cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.Cardinal = privateKeyInfo.getInstance;
        CardinalConfigurationParameters cardinalConfigurationParameters = privateKeyInfo.cca_continue.Cardinal;
        this.getInstance = (cardinalConfigurationParameters instanceof ChallengeParameters ? (ChallengeParameters) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new ChallengeParameters(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null).configure.cca_continue;
        this.cca_continue = (getAuthenticationRequestParameters) getProgressView.getInstance(privateKeyInfo);
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof getTransactionID) {
            getTransactionID gettransactionid = (getTransactionID) obj;
            if (this.getInstance.equals(gettransactionid.getInstance)) {
                byte[] bArr2 = this.cca_continue.cca_continue;
                byte[] bArr3 = null;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                }
                byte[] bArr4 = gettransactionid.cca_continue.cca_continue;
                if (bArr4 != null) {
                    bArr3 = new byte[bArr4.length];
                    System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
                }
                if (getBackgroundColor.Cardinal(bArr, bArr3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr;
        int hashCode = this.getInstance.hashCode();
        byte[] bArr2 = this.cca_continue.cca_continue;
        if (bArr2 == null) {
            bArr = null;
        } else {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        return hashCode + (getBackgroundColor.init(bArr) * 37);
    }

    public final byte[] getEncoded() {
        PrivateKeyInfo privateKeyInfo;
        byte[] bArr;
        try {
            if (this.cca_continue.getInstance != null) {
                privateKeyInfo = KeyAgreementSpi.MQVwithSHA1KDF.configure((setCCAImageUri) this.cca_continue, this.Cardinal);
            } else {
                BCDSAPrivateKey bCDSAPrivateKey = new BCDSAPrivateKey(PQCObjectIdentifiers.configure, new ChallengeParameters(new BCDSAPrivateKey(this.getInstance)));
                byte[] bArr2 = this.cca_continue.cca_continue;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                }
                privateKeyInfo = new PrivateKeyInfo(bCDSAPrivateKey, new setEnabledVisaCheckout(bArr), this.Cardinal);
            }
            return privateKeyInfo.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }
}
