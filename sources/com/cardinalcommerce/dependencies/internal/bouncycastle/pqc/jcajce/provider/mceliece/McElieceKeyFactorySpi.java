package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece;

import com.cardinalcommerce.a.ButtonCustomization;
import com.cardinalcommerce.a.DirectoryServerID;
import com.cardinalcommerce.a.SDKRuntimeException;
import com.cardinalcommerce.a.createTransaction;
import com.cardinalcommerce.a.getCause;
import com.cardinalcommerce.a.getDeviceData;
import com.cardinalcommerce.a.getSDKReferenceNumber;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.removeParam;
import com.cardinalcommerce.a.setCCAImageIcon;
import com.cardinalcommerce.a.setImageURI;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class McElieceKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    /* access modifiers changed from: protected */
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }

    /* access modifiers changed from: protected */
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                SubjectPublicKeyInfo configure = SubjectPublicKeyInfo.configure(getThreeDSRequestorAppURL.Cardinal(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (PQCObjectIdentifiers.Cardinal.equals(configure.cca_continue.cca_continue)) {
                        getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(configure.Cardinal.init());
                        getSDKReferenceNumber getsdkreferencenumber = Cardinal != null ? new getSDKReferenceNumber(isEnableLogging.getInstance((Object) Cardinal)) : null;
                        return new setCCAImageIcon(new createTransaction(getsdkreferencenumber.getInstance, getsdkreferencenumber.cca_continue, new getCause(getsdkreferencenumber.init)));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException e) {
                    throw new InvalidKeySpecException(new StringBuilder("Unable to decode X509EncodedKeySpec: ").append(e.getMessage()).toString());
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("Unsupported key specification: ").append(keySpec.getClass()).append(".").toString());
        }
    }

    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                PrivateKeyInfo cca_continue = PrivateKeyInfo.cca_continue(getThreeDSRequestorAppURL.Cardinal(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (PQCObjectIdentifiers.Cardinal.equals(cca_continue.cca_continue.cca_continue)) {
                        getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(cca_continue.Cardinal.getInstance());
                        getDeviceData getdevicedata = Cardinal != null ? new getDeviceData(isEnableLogging.getInstance((Object) Cardinal)) : null;
                        return new setImageURI(new removeParam(getdevicedata.cca_continue, getdevicedata.Cardinal, new DirectoryServerID(getdevicedata.configure), new SDKRuntimeException(new DirectoryServerID(getdevicedata.configure), getdevicedata.getInstance), new ButtonCustomization(getdevicedata.getWarnings), new ButtonCustomization(getdevicedata.onCReqSuccess), new getCause(getdevicedata.init)));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: ".concat(String.valueOf(e)));
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("Unsupported key specification: ").append(keySpec.getClass()).append(".").toString());
        }
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(subjectPublicKeyInfo.Cardinal.init());
        getSDKReferenceNumber getsdkreferencenumber = Cardinal != null ? new getSDKReferenceNumber(isEnableLogging.getInstance((Object) Cardinal)) : null;
        return new setCCAImageIcon(new createTransaction(getsdkreferencenumber.getInstance, getsdkreferencenumber.cca_continue, new getCause(getsdkreferencenumber.init)));
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        getThreeDSRequestorAppURL onCReqSuccess = getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance()).onCReqSuccess();
        getDeviceData getdevicedata = onCReqSuccess != null ? new getDeviceData(isEnableLogging.getInstance((Object) onCReqSuccess)) : null;
        return new setImageURI(new removeParam(getdevicedata.cca_continue, getdevicedata.Cardinal, new DirectoryServerID(getdevicedata.configure), new SDKRuntimeException(new DirectoryServerID(getdevicedata.configure), getdevicedata.getInstance), new ButtonCustomization(getdevicedata.getWarnings), new ButtonCustomization(getdevicedata.onCReqSuccess), new getCause(getdevicedata.init)));
    }
}
