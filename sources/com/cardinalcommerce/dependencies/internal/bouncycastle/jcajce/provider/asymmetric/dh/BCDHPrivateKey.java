package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.BCDSTU4145PrivateKey;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

public class BCDHPrivateKey implements GMCipherSpi.SM2withRMD, DHPrivateKey {
    private transient DHParameterSpec Cardinal;
    private transient PrivateKeyInfo cca_continue;
    private BigInteger configure;
    private transient KeyAgreementSpi.X25519UwithSHA256CKDF getInstance;
    private transient PKCS12BagAttributeCarrierImpl init = new PKCS12BagAttributeCarrierImpl();

    protected BCDHPrivateKey() {
    }

    BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.configure = dHPrivateKey.getX();
        this.Cardinal = dHPrivateKey.getParams();
    }

    BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.configure = dHPrivateKeySpec.getX();
        this.Cardinal = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.Cardinal = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.cca_continue = null;
        this.init = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.Cardinal.getP());
        objectOutputStream.writeObject(this.Cardinal.getG());
        objectOutputStream.writeInt(this.Cardinal.getL());
    }

    /* access modifiers changed from: package-private */
    public final KeyAgreementSpi.X25519UwithSHA256CKDF configure() {
        KeyAgreementSpi.X25519UwithSHA256CKDF x25519UwithSHA256CKDF = this.getInstance;
        return x25519UwithSHA256CKDF != null ? x25519UwithSHA256CKDF : this.Cardinal instanceof X931SignatureSpi.SHA512WithRSAEncryption ? new KeyAgreementSpi.X25519UwithSHA256CKDF(this.configure, ((X931SignatureSpi.SHA512WithRSAEncryption) this.Cardinal).init()) : new KeyAgreementSpi.X25519UwithSHA256CKDF(this.configure, new KeyAgreementSpi.X25519withSHA256CKDF(this.Cardinal.getP(), this.Cardinal.getG(), (BigInteger) null, this.Cardinal.getL()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    public String getAlgorithm() {
        return "DH";
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public DHParameterSpec getParams() {
        return this.Cardinal;
    }

    public BigInteger getX() {
        return this.configure;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.getInstance("DH", this.configure, new KeyAgreementSpi.X25519withSHA256CKDF(this.Cardinal.getP(), this.Cardinal.getG()));
    }

    public BCDHPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        isEnableLogging instance = isEnableLogging.getInstance((Object) privateKeyInfo.cca_continue.Cardinal);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = privateKeyInfo.cca_continue.cca_continue;
        this.cca_continue = privateKeyInfo;
        this.configure = new BigInteger(((setEnvironment) getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance())).getInstance);
        BigInteger bigInteger5 = null;
        if (aSN1ObjectIdentifier.equals(KeyAgreementSpi.DHUwithSHA224CKDF.getActionCode)) {
            KeyAgreementSpi.DHUwithSHA1CKDF dHUwithSHA1CKDF = instance != null ? new KeyAgreementSpi.DHUwithSHA1CKDF(isEnableLogging.getInstance((Object) instance)) : null;
            if (dHUwithSHA1CKDF.getInstance == null) {
                bigInteger2 = null;
            } else {
                bigInteger2 = new BigInteger(1, dHUwithSHA1CKDF.getInstance.getInstance);
            }
            if (bigInteger2 != null) {
                BigInteger bigInteger6 = new BigInteger(1, dHUwithSHA1CKDF.Cardinal.getInstance);
                BigInteger bigInteger7 = new BigInteger(1, dHUwithSHA1CKDF.configure.getInstance);
                if (dHUwithSHA1CKDF.getInstance == null) {
                    bigInteger3 = null;
                } else {
                    bigInteger3 = new BigInteger(1, dHUwithSHA1CKDF.getInstance.getInstance);
                }
                this.Cardinal = new DHParameterSpec(bigInteger6, bigInteger7, bigInteger3.intValue());
                BigInteger bigInteger8 = this.configure;
                BigInteger bigInteger9 = new BigInteger(1, dHUwithSHA1CKDF.Cardinal.getInstance);
                BigInteger bigInteger10 = new BigInteger(1, dHUwithSHA1CKDF.configure.getInstance);
                if (dHUwithSHA1CKDF.getInstance == null) {
                    bigInteger4 = null;
                } else {
                    bigInteger4 = new BigInteger(1, dHUwithSHA1CKDF.getInstance.getInstance);
                }
                this.getInstance = new KeyAgreementSpi.X25519UwithSHA256CKDF(bigInteger8, new KeyAgreementSpi.X25519withSHA256CKDF(bigInteger9, bigInteger10, (BigInteger) null, bigInteger4.intValue()));
                return;
            }
            this.Cardinal = new DHParameterSpec(new BigInteger(1, dHUwithSHA1CKDF.Cardinal.getInstance), new BigInteger(1, dHUwithSHA1CKDF.configure.getInstance));
            this.getInstance = new KeyAgreementSpi.X25519UwithSHA256CKDF(this.configure, new KeyAgreementSpi.X25519withSHA256CKDF(new BigInteger(1, dHUwithSHA1CKDF.Cardinal.getInstance), new BigInteger(1, dHUwithSHA1CKDF.configure.getInstance)));
        } else if (aSN1ObjectIdentifier.equals(GMCipherSpi.SM2withMD5.getSignatureVerification)) {
            BCDSTU4145PrivateKey bCDSTU4145PrivateKey = instance != null ? new BCDSTU4145PrivateKey(isEnableLogging.getInstance((Object) instance)) : null;
            BigInteger bigInteger11 = new BigInteger(1, bCDSTU4145PrivateKey.getInstance.getInstance);
            BigInteger bigInteger12 = new BigInteger(1, bCDSTU4145PrivateKey.Cardinal.getInstance);
            BigInteger bigInteger13 = new BigInteger(1, bCDSTU4145PrivateKey.cca_continue.getInstance);
            if (bCDSTU4145PrivateKey.init == null) {
                bigInteger = null;
            } else {
                bigInteger = new BigInteger(1, bCDSTU4145PrivateKey.init.getInstance);
            }
            this.Cardinal = new X931SignatureSpi.SHA512WithRSAEncryption(bigInteger11, bigInteger12, bigInteger13, bigInteger);
            this.getInstance = new KeyAgreementSpi.X25519UwithSHA256CKDF(this.configure, new KeyAgreementSpi.X25519withSHA256CKDF(new BigInteger(1, bCDSTU4145PrivateKey.getInstance.getInstance), new BigInteger(1, bCDSTU4145PrivateKey.cca_continue.getInstance), new BigInteger(1, bCDSTU4145PrivateKey.Cardinal.getInstance), bCDSTU4145PrivateKey.init != null ? new BigInteger(1, bCDSTU4145PrivateKey.init.getInstance) : bigInteger5, (KeyAgreementSpi.X448UwithSHA512CKDF) null));
        } else {
            throw new IllegalArgumentException("unknown algorithm type: ".concat(String.valueOf(aSN1ObjectIdentifier)));
        }
    }

    BCDHPrivateKey(KeyAgreementSpi.X25519UwithSHA256CKDF x25519UwithSHA256CKDF) {
        this.configure = x25519UwithSHA256CKDF.configure;
        this.Cardinal = new X931SignatureSpi.SHA512WithRSAEncryption(x25519UwithSHA256CKDF.Cardinal);
    }

    public byte[] getEncoded() {
        PrivateKeyInfo privateKeyInfo;
        KeyFactorySpi.AnonymousClass1 r12;
        byte[] bArr;
        try {
            PrivateKeyInfo privateKeyInfo2 = this.cca_continue;
            if (privateKeyInfo2 != null) {
                return privateKeyInfo2.configure("DER");
            }
            DHParameterSpec dHParameterSpec = this.Cardinal;
            if (!(dHParameterSpec instanceof X931SignatureSpi.SHA512WithRSAEncryption) || ((X931SignatureSpi.SHA512WithRSAEncryption) dHParameterSpec).Cardinal == null) {
                privateKeyInfo = new PrivateKeyInfo(new BCDSAPrivateKey(KeyAgreementSpi.DHUwithSHA224CKDF.getActionCode, new KeyAgreementSpi.DHUwithSHA1CKDF(this.Cardinal.getP(), this.Cardinal.getG(), this.Cardinal.getL()).onCReqSuccess()), new setEnvironment(getX()));
            } else {
                KeyAgreementSpi.X25519withSHA256CKDF init2 = ((X931SignatureSpi.SHA512WithRSAEncryption) this.Cardinal).init();
                KeyAgreementSpi.X448UwithSHA512CKDF x448UwithSHA512CKDF = init2.onValidated;
                if (x448UwithSHA512CKDF != null) {
                    byte[] bArr2 = x448UwithSHA512CKDF.init;
                    if (bArr2 == null) {
                        bArr = null;
                    } else {
                        bArr = new byte[bArr2.length];
                        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                    }
                    r12 = new KeyFactorySpi.AnonymousClass1(bArr, x448UwithSHA512CKDF.configure);
                } else {
                    r12 = null;
                }
                privateKeyInfo = new PrivateKeyInfo(new BCDSAPrivateKey(GMCipherSpi.SM2withMD5.getSignatureVerification, new BCDSTU4145PrivateKey(init2.Cardinal, init2.init, init2.getInstance, init2.configure, r12).onCReqSuccess()), new setEnvironment(getX()));
            }
            return privateKeyInfo.configure("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
