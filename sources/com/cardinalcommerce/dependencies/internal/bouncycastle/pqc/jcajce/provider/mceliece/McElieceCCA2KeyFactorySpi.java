package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece;

import com.cardinalcommerce.a.ButtonCustomization;
import com.cardinalcommerce.a.CardinalThreeDS2ServiceImpl;
import com.cardinalcommerce.a.DirectoryServerID;
import com.cardinalcommerce.a.SDKRuntimeException;
import com.cardinalcommerce.a.addParam;
import com.cardinalcommerce.a.getMessageVersion;
import com.cardinalcommerce.a.getSDKEphemeralPublicKey;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setCCAImageDrawable;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.a.setImageIcon;
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

public class McElieceCCA2KeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
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
                    if (PQCObjectIdentifiers.getInstance.equals(configure.cca_continue.cca_continue)) {
                        getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(configure.Cardinal.init());
                        getMessageVersion getmessageversion = Cardinal != null ? new getMessageVersion(isEnableLogging.getInstance((Object) Cardinal)) : null;
                        return new setCCAImageDrawable(new CardinalThreeDS2ServiceImpl(getmessageversion.Cardinal, getmessageversion.cca_continue, getmessageversion.init, setCCAImageUri.init(getmessageversion.configure).configure()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
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
                    if (PQCObjectIdentifiers.getInstance.equals(cca_continue.cca_continue.cca_continue)) {
                        getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(cca_continue.Cardinal.getInstance());
                        getSDKEphemeralPublicKey getsdkephemeralpublickey = Cardinal != null ? new getSDKEphemeralPublicKey(isEnableLogging.getInstance((Object) Cardinal)) : null;
                        return new setImageIcon(new addParam(getsdkephemeralpublickey.configure, getsdkephemeralpublickey.getInstance, new DirectoryServerID(getsdkephemeralpublickey.Cardinal), new SDKRuntimeException(new DirectoryServerID(getsdkephemeralpublickey.Cardinal), getsdkephemeralpublickey.cca_continue), new ButtonCustomization(getsdkephemeralpublickey.init), setCCAImageUri.init(getsdkephemeralpublickey.getSDKVersion).configure()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
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
        getMessageVersion getmessageversion = Cardinal != null ? new getMessageVersion(isEnableLogging.getInstance((Object) Cardinal)) : null;
        return new setCCAImageDrawable(new CardinalThreeDS2ServiceImpl(getmessageversion.Cardinal, getmessageversion.cca_continue, getmessageversion.init, setCCAImageUri.init(getmessageversion.configure).configure()));
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        getThreeDSRequestorAppURL onCReqSuccess = getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance()).onCReqSuccess();
        getSDKEphemeralPublicKey getsdkephemeralpublickey = onCReqSuccess != null ? new getSDKEphemeralPublicKey(isEnableLogging.getInstance((Object) onCReqSuccess)) : null;
        return new setImageIcon(new addParam(getsdkephemeralpublickey.configure, getsdkephemeralpublickey.getInstance, new DirectoryServerID(getsdkephemeralpublickey.Cardinal), new SDKRuntimeException(new DirectoryServerID(getsdkephemeralpublickey.Cardinal), getsdkephemeralpublickey.cca_continue), new ButtonCustomization(getsdkephemeralpublickey.init), (String) null));
    }
}
