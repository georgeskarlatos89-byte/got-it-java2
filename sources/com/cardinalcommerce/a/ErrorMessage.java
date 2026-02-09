package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public final class ErrorMessage implements GMCipherSpi.SM2withRMD, PublicKey {
    private transient ASN1ObjectIdentifier Cardinal;
    private transient ThreeDS2Service cca_continue;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public final String getFormat() {
        return "X.509";
    }

    public ErrorMessage(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
        this.Cardinal = (cardinalConfigurationParameters instanceof ChallengeParameters ? (ChallengeParameters) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new ChallengeParameters(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null).configure.cca_continue;
        this.cca_continue = (ThreeDS2Service) ChallengeHTMLView.init(subjectPublicKeyInfo);
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ErrorMessage) {
            ErrorMessage errorMessage = (ErrorMessage) obj;
            if (this.Cardinal.equals(errorMessage.Cardinal)) {
                byte[] bArr2 = this.cca_continue.configure;
                byte[] bArr3 = null;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                }
                byte[] bArr4 = errorMessage.cca_continue.configure;
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
        int hashCode = this.Cardinal.hashCode();
        byte[] bArr2 = this.cca_continue.configure;
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
        SubjectPublicKeyInfo subjectPublicKeyInfo;
        byte[] bArr;
        try {
            if (this.cca_continue.getInstance != null) {
                subjectPublicKeyInfo = KeyAgreementSpi.MQVwithSHA1KDF.cca_continue((setCCAImageUri) this.cca_continue);
            } else {
                BCDSAPrivateKey bCDSAPrivateKey = new BCDSAPrivateKey(PQCObjectIdentifiers.configure, new ChallengeParameters(new BCDSAPrivateKey(this.Cardinal)));
                byte[] bArr2 = this.cca_continue.configure;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                }
                subjectPublicKeyInfo = new SubjectPublicKeyInfo(bCDSAPrivateKey, bArr);
            }
            return subjectPublicKeyInfo.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        SubjectPublicKeyInfo configure = SubjectPublicKeyInfo.configure((byte[]) objectInputStream.readObject());
        CardinalConfigurationParameters cardinalConfigurationParameters = configure.cca_continue.Cardinal;
        this.Cardinal = (cardinalConfigurationParameters instanceof ChallengeParameters ? (ChallengeParameters) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new ChallengeParameters(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null).configure.cca_continue;
        this.cca_continue = (ThreeDS2Service) ChallengeHTMLView.init(configure);
    }
}
