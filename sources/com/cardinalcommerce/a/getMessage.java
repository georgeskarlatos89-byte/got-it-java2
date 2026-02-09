package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public final class getMessage implements setImageBitmap, PrivateKey {
    private transient ASN1ObjectIdentifier cca_continue;
    private transient setButtonDrawable configure;
    private transient setEnableDFSync init;

    public getMessage(PrivateKeyInfo privateKeyInfo) throws IOException {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getMessage) {
            getMessage getmessage = (getMessage) obj;
            return this.cca_continue.equals(getmessage.cca_continue) && getBackgroundColor.Cardinal(this.configure.getInstance(), getmessage.configure.getInstance());
        }
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public final byte[] getEncoded() {
        try {
            return KeyAgreementSpi.MQVwithSHA1KDF.configure((setCCAImageUri) this.configure, this.init).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.cca_continue.hashCode() + (getBackgroundColor.init(this.configure.getInstance()) * 37);
    }

    private void cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.init = privateKeyInfo.getInstance;
        CardinalConfigurationParameters cardinalConfigurationParameters = privateKeyInfo.cca_continue.Cardinal;
        this.cca_continue = (cardinalConfigurationParameters instanceof getAcsTransactionID ? (getAcsTransactionID) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new getAcsTransactionID(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null).cca_continue.cca_continue;
        this.configure = (setButtonDrawable) getProgressView.getInstance(privateKeyInfo);
    }
}
