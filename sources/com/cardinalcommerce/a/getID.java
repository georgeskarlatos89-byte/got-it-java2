package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public final class getID implements PublicKey {
    private transient ASN1ObjectIdentifier cca_continue;
    private transient setOnCheckedChangeListener getInstance;

    public getID(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        init(subjectPublicKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(SubjectPublicKeyInfo.configure((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getID) {
            getID getid = (getID) obj;
            return this.cca_continue.equals(getid.cca_continue) && getBackgroundColor.Cardinal(this.getInstance.init(), getid.getInstance.init());
        }
    }

    public final String getAlgorithm() {
        return "XMSSMT";
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
        return this.cca_continue.hashCode() + (getBackgroundColor.init(this.getInstance.init()) * 37);
    }

    private void init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        CardinalConfigurationParameters cardinalConfigurationParameters = subjectPublicKeyInfo.cca_continue.Cardinal;
        this.cca_continue = (cardinalConfigurationParameters instanceof getAcsTransactionID ? (getAcsTransactionID) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new getAcsTransactionID(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null).cca_continue.cca_continue;
        this.getInstance = (setOnCheckedChangeListener) ChallengeHTMLView.init(subjectPublicKeyInfo);
    }
}
