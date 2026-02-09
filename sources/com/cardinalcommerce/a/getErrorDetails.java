package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public final class getErrorDetails implements PublicKey {
    private transient ASN1ObjectIdentifier Cardinal;
    private transient setCCAOnCheckedChangeListener getInstance;

    public getErrorDetails(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        Cardinal(subjectPublicKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Cardinal(SubjectPublicKeyInfo.configure((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getErrorDetails) {
            getErrorDetails geterrordetails = (getErrorDetails) obj;
            return this.Cardinal.equals(geterrordetails.Cardinal) && getBackgroundColor.Cardinal(this.getInstance.Cardinal(), geterrordetails.getInstance.Cardinal());
        }
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public final byte[] getEncoded() {
        try {
            return KeyAgreementSpi.MQVwithSHA1KDF.cca_continue((setCCAImageUri) this.getInstance).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.Cardinal.hashCode() + (getBackgroundColor.init(this.getInstance.Cardinal()) * 37);
    }

    private void Cardinal(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
        this.Cardinal = (cardinalConfigurationParameters instanceof get3DSServerTransactionID ? (get3DSServerTransactionID) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new get3DSServerTransactionID(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null).getInstance.cca_continue;
        this.getInstance = (setCCAOnCheckedChangeListener) ChallengeHTMLView.init(subjectPublicKeyInfo);
    }
}
