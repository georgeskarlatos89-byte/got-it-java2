package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public final class Warning implements setImageBitmap, PrivateKey {
    private transient ASN1ObjectIdentifier Cardinal;
    private transient setEnableDFSync getInstance;
    private transient setImageDrawable init;

    public Warning(PrivateKeyInfo privateKeyInfo) throws IOException {
        getInstance(privateKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getInstance(PrivateKeyInfo.cca_continue((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Warning) {
            Warning warning = (Warning) obj;
            return this.Cardinal.equals(warning.Cardinal) && getBackgroundColor.Cardinal(this.init.Cardinal(), warning.init.Cardinal());
        }
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public final byte[] getEncoded() {
        try {
            return KeyAgreementSpi.MQVwithSHA1KDF.configure((setCCAImageUri) this.init, this.getInstance).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.Cardinal.hashCode() + (getBackgroundColor.init(this.init.Cardinal()) * 37);
    }

    private void getInstance(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.getInstance = privateKeyInfo.getInstance;
        CardinalConfigurationParameters cardinalConfigurationParameters = privateKeyInfo.cca_continue.Cardinal;
        this.Cardinal = (cardinalConfigurationParameters instanceof get3DSServerTransactionID ? (get3DSServerTransactionID) cardinalConfigurationParameters : cardinalConfigurationParameters != null ? new get3DSServerTransactionID(isEnableLogging.getInstance((Object) cardinalConfigurationParameters)) : null).getInstance.cca_continue;
        this.init = (setImageDrawable) getProgressView.getInstance(privateKeyInfo);
    }
}
