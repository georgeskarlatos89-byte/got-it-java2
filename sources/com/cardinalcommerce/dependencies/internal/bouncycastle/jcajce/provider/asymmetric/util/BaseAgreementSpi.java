package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.BCDHPublicKey;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.DHUtil;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.isSpecialOpen;
import com.cardinalcommerce.a.writeObject;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.objectweb.asm.Opcodes;

public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map<String, String> cleanup;
    private static final Map<String, ASN1ObjectIdentifier> configure;
    private static final Hashtable getWarnings;
    private static final Map<String, Integer> init;
    private static final Hashtable onCReqSuccess;
    public final String Cardinal;
    public final GMCipherSpi.SM2withSha512 cca_continue;
    public byte[] getInstance;

    public BaseAgreementSpi(String str, GMCipherSpi.SM2withSha512 sM2withSha512) {
        this.Cardinal = str;
        this.cca_continue = sM2withSha512;
    }

    protected static byte[] Cardinal(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] Cardinal();

    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        byte[] engineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i >= engineGenerateSecret.length) {
            System.arraycopy(engineGenerateSecret, 0, bArr, i, engineGenerateSecret.length);
            return engineGenerateSecret.length;
        }
        throw new ShortBufferException(new StringBuilder().append(this.Cardinal).append(" key agreement: need ").append(engineGenerateSecret.length).append(" bytes").toString());
    }

    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.cca_continue == null) {
            return Cardinal();
        }
        byte[] Cardinal2 = Cardinal();
        try {
            return init(Cardinal2, (String) null, Cardinal2.length << 3);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        String str2;
        int i;
        String cca_continue2 = getTextFontSize.cca_continue(str);
        Hashtable hashtable = getWarnings;
        if (hashtable.containsKey(cca_continue2)) {
            str2 = ((ASN1ObjectIdentifier) hashtable.get(cca_continue2)).init;
        } else {
            str2 = str;
        }
        if (str2.indexOf(91) > 0) {
            i = Integer.parseInt(str2.substring(str2.indexOf(91) + 1, str2.indexOf(93)));
        } else {
            String cca_continue3 = getTextFontSize.cca_continue(str2);
            Map<String, Integer> map = init;
            i = !map.containsKey(cca_continue3) ? -1 : map.get(cca_continue3).intValue();
        }
        byte[] init2 = init(Cardinal(), str2, i);
        if (str.indexOf(91) > 0) {
            str = str.substring(0, str.indexOf(91));
        } else if (str.startsWith(IESCipher.IESwithDESedeCBC.values.init)) {
            str = "AES";
        } else if (str.startsWith(writeObject.cca_continue.init)) {
            str = "Serpent";
        } else {
            String str3 = cleanup.get(getTextFontSize.cca_continue(str));
            if (str3 != null) {
                str = str3;
            }
        }
        if (onCReqSuccess.containsKey(str)) {
            for (int i2 = 0; i2 < init2.length; i2++) {
                byte b = init2[i2];
                init2[i2] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
            }
        }
        return new SecretKeySpec(init2, str);
    }

    private byte[] init(byte[] bArr, String str, int i) throws NoSuchAlgorithmException {
        GMCipherSpi.SM2withRMD sM2withRMD;
        GMCipherSpi.SM2withSha512 sM2withSha512 = this.cca_continue;
        if (sM2withSha512 != null) {
            if (i >= 0) {
                int i2 = i / 8;
                byte[] bArr2 = new byte[i2];
                if (!(sM2withSha512 instanceof KeyAgreementSpi.ECKAEGwithSHA384KDF)) {
                    sM2withRMD = new CipherSpi.OAEPPadding(bArr, this.getInstance);
                } else if (str != null) {
                    try {
                        sM2withRMD = new isSpecialOpen(new ASN1ObjectIdentifier(str), i, bArr, this.getInstance);
                    } catch (IllegalArgumentException unused) {
                        throw new NoSuchAlgorithmException("no OID for algorithm: ".concat(String.valueOf(str)));
                    }
                } else {
                    throw new NoSuchAlgorithmException("algorithm OID is null");
                }
                this.cca_continue.getInstance(sM2withRMD);
                this.cca_continue.cca_continue(bArr2, 0, i2);
                if (bArr != null) {
                    for (int i3 = 0; i3 < bArr.length; i3++) {
                        bArr[i3] = 0;
                    }
                }
                return bArr2;
            }
            throw new NoSuchAlgorithmException("unknown algorithm encountered: ".concat(String.valueOf(str)));
        } else if (i <= 0) {
            return bArr;
        } else {
            int i4 = i / 8;
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, 0, bArr3, 0, i4);
            if (bArr != null) {
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    bArr[i5] = 0;
                }
            }
            return bArr3;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        configure = hashMap;
        HashMap hashMap2 = new HashMap();
        init = hashMap2;
        HashMap hashMap3 = new HashMap();
        cleanup = hashMap3;
        Hashtable hashtable = new Hashtable();
        getWarnings = hashtable;
        Hashtable hashtable2 = new Hashtable();
        onCReqSuccess = hashtable2;
        hashMap2.put("DES", 64);
        hashMap2.put("DESEDE", 192);
        hashMap2.put("BLOWFISH", 128);
        hashMap2.put("AES", 256);
        hashMap2.put(IESCipher.IESwithDESedeCBC.CardinalUiType.init, 128);
        hashMap2.put(IESCipher.IESwithDESedeCBC.getChallengeTimeout.init, 192);
        hashMap2.put(IESCipher.IESwithDESedeCBC.getProxyAddress.init, 256);
        hashMap2.put(IESCipher.IESwithDESedeCBC.getActionCode.init, 128);
        hashMap2.put(IESCipher.IESwithDESedeCBC.setChallengeTimeout.init, 192);
        hashMap2.put(IESCipher.IESwithDESedeCBC.setUICustomization.init, 256);
        hashMap2.put(IESCipher.IESwithDESedeCBC.CardinalActionCode.init, 128);
        hashMap2.put(IESCipher.IESwithDESedeCBC.setEnvironment.init, 192);
        hashMap2.put(IESCipher.IESwithDESedeCBC.getRenderType.init, 256);
        hashMap2.put(IESCipher.IESwithDESedeCBC.getString.init, 128);
        hashMap2.put(IESCipher.IESwithDESedeCBC.setRequestTimeout.init, 192);
        hashMap2.put(IESCipher.IESwithDESedeCBC.setUiType.init, 256);
        hashMap2.put(IESCipher.IESwithDESedeCBC.CardinalChallengeObserver.init, 128);
        hashMap2.put(IESCipher.IESwithDESedeCBC.getUiType.init, 192);
        hashMap2.put(IESCipher.IESwithDESedeCBC.setRenderType.init, 256);
        hashMap2.put(IESCipher.IESwithDESedeCBC.getRequestTimeout.init, 128);
        hashMap2.put(IESCipher.IESwithDESedeCBC.getEnvironment.init, 192);
        hashMap2.put(IESCipher.IESwithDESedeCBC.isEnableLogging.init, 256);
        hashMap2.put(IESCipher.IESwithDESedeCBC.CardinalConfigurationParameters.init, 128);
        hashMap2.put(IESCipher.IESwithDESedeCBC.setProxyAddress.init, 192);
        hashMap2.put(IESCipher.IESwithDESedeCBC.getUICustomization.init, 256);
        hashMap2.put(IESCipher.AnonymousClass1.Cardinal.init, 128);
        hashMap2.put(IESCipher.AnonymousClass1.init.init, 192);
        hashMap2.put(IESCipher.AnonymousClass1.onValidated.init, 256);
        hashMap2.put(BCDHPublicKey.getInstance.init, 128);
        hashMap2.put(KeyAgreementSpi.DHUwithSHA224CKDF.setLocationDataConsentGiven.init, 192);
        hashMap2.put(KeyAgreementSpi.DHUwithSHA224CKDF.getString.init, 192);
        hashMap2.put(KeyAgreementSpi.DHUwithSHA1KDF.Cardinal.init, 64);
        hashMap2.put(IES.Cardinal.init, 256);
        hashMap2.put(IES.cca_continue.init, 256);
        hashMap2.put(IES.getInstance.init, 256);
        hashMap2.put(KeyAgreementSpi.DHUwithSHA224CKDF.setRequestTimeout.init, Integer.valueOf(Opcodes.IF_ICMPNE));
        hashMap2.put(KeyAgreementSpi.DHUwithSHA224CKDF.getEnvironment.init, 256);
        hashMap2.put(KeyAgreementSpi.DHUwithSHA224CKDF.setProxyAddress.init, Integer.valueOf(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        hashMap2.put(KeyAgreementSpi.DHUwithSHA224CKDF.getProxyAddress.init, 512);
        hashMap.put("DESEDE", KeyAgreementSpi.DHUwithSHA224CKDF.getString);
        hashMap.put("AES", IESCipher.IESwithDESedeCBC.setUICustomization);
        hashMap.put("CAMELLIA", IESCipher.AnonymousClass1.cca_continue);
        hashMap.put("SEED", BCDHPublicKey.configure);
        hashMap.put("DES", KeyAgreementSpi.DHUwithSHA1KDF.Cardinal);
        hashMap3.put(DHUtil.getWarnings.init, "CAST5");
        hashMap3.put(DHUtil.onCReqSuccess.init, "IDEA");
        hashMap3.put(DHUtil.cleanup.init, "Blowfish");
        hashMap3.put(DHUtil.CardinalEnvironment.init, "Blowfish");
        hashMap3.put(DHUtil.values.init, "Blowfish");
        hashMap3.put(DHUtil.CardinalError.init, "Blowfish");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA1KDF.configure.init, "DES");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA1KDF.Cardinal.init, "DES");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA1KDF.init.init, "DES");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA1KDF.getInstance.init, "DES");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA1KDF.cca_continue.init, "DESede");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA224CKDF.getString.init, "DESede");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA224CKDF.setLocationDataConsentGiven.init, "DESede");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA224CKDF.getPaResStatus.init, "RC2");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA224CKDF.setRequestTimeout.init, "HmacSHA1");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA224CKDF.setEnvironment.init, "HmacSHA224");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA224CKDF.getEnvironment.init, "HmacSHA256");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA224CKDF.setProxyAddress.init, "HmacSHA384");
        hashMap3.put(KeyAgreementSpi.DHUwithSHA224CKDF.getProxyAddress.init, "HmacSHA512");
        hashMap3.put(IESCipher.AnonymousClass1.configure.init, "Camellia");
        hashMap3.put(IESCipher.AnonymousClass1.getInstance.init, "Camellia");
        hashMap3.put(IESCipher.AnonymousClass1.cca_continue.init, "Camellia");
        hashMap3.put(IESCipher.AnonymousClass1.Cardinal.init, "Camellia");
        hashMap3.put(IESCipher.AnonymousClass1.init.init, "Camellia");
        hashMap3.put(IESCipher.AnonymousClass1.onValidated.init, "Camellia");
        hashMap3.put(BCDHPublicKey.getInstance.init, "SEED");
        hashMap3.put(BCDHPublicKey.configure.init, "SEED");
        hashMap3.put(BCDHPublicKey.init.init, "SEED");
        hashMap3.put(IES.Cardinal.init, "GOST28147");
        hashMap3.put(IESCipher.IESwithDESedeCBC.CardinalChallengeObserver.init, "AES");
        hashMap3.put(IESCipher.IESwithDESedeCBC.getRequestTimeout.init, "AES");
        hashMap3.put(IESCipher.IESwithDESedeCBC.getRequestTimeout.init, "AES");
        hashtable.put("DESEDE", KeyAgreementSpi.DHUwithSHA224CKDF.getString);
        hashtable.put("AES", IESCipher.IESwithDESedeCBC.setUICustomization);
        hashtable.put("DES", KeyAgreementSpi.DHUwithSHA1KDF.Cardinal);
        hashtable2.put("DES", "DES");
        hashtable2.put("DESEDE", "DES");
        hashtable2.put(KeyAgreementSpi.DHUwithSHA1KDF.Cardinal.init, "DES");
        hashtable2.put(KeyAgreementSpi.DHUwithSHA224CKDF.getString.init, "DES");
        hashtable2.put(KeyAgreementSpi.DHUwithSHA224CKDF.setLocationDataConsentGiven.init, "DES");
    }
}
