package com.cardinalcommerce.a;

import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AuthenticatedCipherText;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

@Deprecated
public final class setAccessibilityPaneTitle {
    private final SecretKey cca_continue;
    public final SecretKey configure;
    public final int getInstance;
    public final SecretKey init;

    public static byte[] getInstance(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    public setAccessibilityPaneTitle() {
    }

    public setAccessibilityPaneTitle(SecretKey secretKey) throws KeyLengthException {
        this.cca_continue = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.configure = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.init = new SecretKeySpec(encoded, 16, 16, "AES");
            this.getInstance = 16;
        } else if (encoded.length == 48) {
            this.configure = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.init = new SecretKeySpec(encoded, 24, 24, "AES");
            this.getInstance = 24;
        } else if (encoded.length == 64) {
            this.configure = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            this.init = new SecretKeySpec(encoded, 32, 32, "AES");
            this.getInstance = 32;
        } else {
            throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
    }

    public static Signature getInstance(JWSAlgorithm jWSAlgorithm, Provider provider) throws JOSEException {
        String str = "SHA256withECDSA";
        if (!jWSAlgorithm.equals(JWSAlgorithm.onCReqSuccess) && !jWSAlgorithm.equals(JWSAlgorithm.getSDKVersion)) {
            if (jWSAlgorithm.equals(JWSAlgorithm.onValidated)) {
                str = "SHA384withECDSA";
            } else if (jWSAlgorithm.equals(JWSAlgorithm.cleanup)) {
                str = "SHA512withECDSA";
            } else {
                throw new JOSEException(AlgorithmSupportMessage.Cardinal(jWSAlgorithm, setStateDescription.Cardinal));
            }
        }
        if (provider == null) {
            return Signature.getInstance(str);
        }
        try {
            return Signature.getInstance(str, provider);
        } catch (NoSuchAlgorithmException e) {
            throw new JOSEException(new StringBuilder("Unsupported ECDSA algorithm: ").append(e.getMessage()).toString(), e);
        }
    }

    private static setCCAElevation Cardinal(SecretKey secretKey, boolean z, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        int i;
        SignatureSpi.ecDSASha3_224 ecdsasha3_224 = new SignatureSpi.ecDSASha3_224();
        ecdsasha3_224.getInstance(z, new CipherSpi.ISO9796d1Padding(secretKey.getEncoded()));
        setCCAElevation setccaelevation = new setCCAElevation(ecdsasha3_224);
        setCCAFocusableInTouchMode setccafocusableintouchmode = new setCCAFocusableInTouchMode(new CipherSpi.ISO9796d1Padding(secretKey.getEncoded()), bArr, bArr2);
        setccaelevation.init = z;
        byte[] bArr5 = null;
        setccaelevation.CardinalRenderType = null;
        setccaelevation.cca_continue = true;
        setCCAFocusableInTouchMode setccafocusableintouchmode2 = setccafocusableintouchmode;
        byte[] bArr6 = setccafocusableintouchmode.cca_continue;
        if (bArr6 == null) {
            bArr3 = null;
        } else {
            bArr3 = new byte[bArr6.length];
            System.arraycopy(bArr6, 0, bArr3, 0, bArr6.length);
        }
        byte[] bArr7 = setccafocusableintouchmode.Cardinal;
        if (bArr7 == null) {
            bArr4 = null;
        } else {
            bArr4 = new byte[bArr7.length];
            System.arraycopy(bArr7, 0, bArr4, 0, bArr7.length);
        }
        setccaelevation.getSDKVersion = bArr4;
        int i2 = setccafocusableintouchmode.getInstance;
        if (i2 < 32 || i2 > 128 || i2 % 8 != 0) {
            throw new IllegalArgumentException("Invalid value for MAC size: ".concat(String.valueOf(i2)));
        }
        setccaelevation.cleanup = i2 / 8;
        CipherSpi.ISO9796d1Padding iSO9796d1Padding = setccafocusableintouchmode.init;
        if (z) {
            i = 16;
        } else {
            i = setccaelevation.cleanup + 16;
        }
        setccaelevation.CardinalError = new byte[i];
        if (bArr3 == null || bArr3.length <= 0) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && setccaelevation.getWarnings != null && getBackgroundColor.Cardinal(setccaelevation.getWarnings, bArr3)) {
            if (iSO9796d1Padding == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            } else if (setccaelevation.onValidated != null && getBackgroundColor.Cardinal(setccaelevation.onValidated, iSO9796d1Padding.getInstance)) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        setccaelevation.getWarnings = bArr3;
        if (iSO9796d1Padding != null) {
            setccaelevation.onValidated = iSO9796d1Padding.getInstance;
        }
        if (iSO9796d1Padding != null) {
            setccaelevation.configure.getInstance(true, iSO9796d1Padding);
            setccaelevation.onCReqSuccess = new byte[16];
            setccaelevation.configure.Cardinal(setccaelevation.onCReqSuccess, 0, setccaelevation.onCReqSuccess, 0);
            setccaelevation.Cardinal.Cardinal(setccaelevation.onCReqSuccess);
            setccaelevation.getInstance = null;
        } else if (setccaelevation.onCReqSuccess == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        setccaelevation.values = new byte[16];
        if (setccaelevation.getWarnings.length == 12) {
            System.arraycopy(setccaelevation.getWarnings, 0, setccaelevation.values, 0, setccaelevation.getWarnings.length);
            setccaelevation.values[15] = 1;
        } else {
            byte[] bArr8 = setccaelevation.values;
            byte[] bArr9 = setccaelevation.getWarnings;
            int length = setccaelevation.getWarnings.length;
            for (int i3 = 0; i3 < length; i3 += 16) {
                int min = Math.min(length - i3, 16);
                while (true) {
                    min--;
                    if (min < 0) {
                        break;
                    }
                    bArr8[min] = (byte) (bArr8[min] ^ bArr9[i3 + min]);
                }
                setccaelevation.Cardinal.getInstance(bArr8);
            }
            byte[] bArr10 = new byte[16];
            long length2 = ((long) setccaelevation.getWarnings.length) << 3;
            setTextFontSize.init((int) (length2 >>> 32), bArr10, 8);
            setTextFontSize.init((int) length2, bArr10, 12);
            byte[] bArr11 = setccaelevation.values;
            KeyAgreementSpi.ECVKO512.cca_continue(bArr11, bArr10);
            setccaelevation.Cardinal.getInstance(bArr11);
        }
        setccaelevation.CardinalEnvironment = new byte[16];
        setccaelevation.valueOf = new byte[16];
        setccaelevation.getString = new byte[16];
        setccaelevation.CardinalConfigurationParameters = new byte[16];
        setccaelevation.getChallengeTimeout = 0;
        setccaelevation.setRequestTimeout = 0;
        setccaelevation.setChallengeTimeout = 0;
        byte[] bArr12 = setccaelevation.values;
        if (bArr12 != null) {
            bArr5 = new byte[bArr12.length];
            System.arraycopy(bArr12, 0, bArr5, 0, bArr12.length);
        }
        setccaelevation.CardinalUiType = bArr5;
        setccaelevation.CardinalActionCode = -2;
        setccaelevation.CardinalChallengeObserver = 0;
        setccaelevation.getActionCode = 0;
        if (setccaelevation.getSDKVersion != null) {
            setccaelevation.Cardinal(setccaelevation.getSDKVersion, setccaelevation.getSDKVersion.length);
        }
        return setccaelevation;
    }

    public static AuthenticatedCipherText configure(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws JOSEException {
        setCCAElevation Cardinal = Cardinal(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[Cardinal.init(bArr2.length)];
        int cca_continue2 = Cardinal.cca_continue(bArr2, 0, bArr2.length, bArr4);
        try {
            int init2 = (cca_continue2 + Cardinal.init(bArr4, cca_continue2)) - 16;
            byte[] bArr5 = new byte[init2];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, init2);
            System.arraycopy(bArr4, init2, bArr6, 0, 16);
            return new AuthenticatedCipherText(bArr5, bArr6);
        } catch (KeyAgreementSpi.AnonymousClass1 e) {
            throw new JOSEException(new StringBuilder("Couldn't generate GCM authentication tag: ").append(e.getMessage()).toString(), e);
        }
    }

    public static byte[] getInstance(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws JOSEException {
        setCCAElevation Cardinal = Cardinal(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[Cardinal.init(length)];
        try {
            Cardinal.init(bArr6, Cardinal.cca_continue(bArr5, 0, length, bArr6));
            return bArr6;
        } catch (KeyAgreementSpi.AnonymousClass1 e) {
            throw new JOSEException(new StringBuilder("Couldn't validate GCM authentication tag: ").append(e.getMessage()).toString(), e);
        }
    }

    public static byte[] cca_continue(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        Cipher cipher;
        if (provider == null) {
            try {
                cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            } catch (IllegalBlockSizeException e) {
                throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
            } catch (Exception e2) {
                throw new JOSEException(new StringBuilder("Couldn't encrypt Content Encryption Key (CEK): ").append(e2.getMessage()).toString(), e2);
            }
        } else {
            cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", provider);
        }
        cipher.init(1, rSAPublicKey);
        return cipher.doFinal(secretKey.getEncoded());
    }

    public static boolean getInstance(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        byte b = 0;
        for (int i = 0; i < bArr.length; i++) {
            b |= bArr[i] ^ bArr2[i];
        }
        if (b == 0) {
            return true;
        }
        return false;
    }

    public static boolean configure(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a = curve.getA();
        BigInteger b = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p).equals(bigInteger.pow(3).add(a.multiply(bigInteger)).add(b).mod(p));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] configure(byte[] r5) throws java.io.IOException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.util.zip.Deflater r2 = new java.util.zip.Deflater     // Catch:{ all -> 0x0026 }
            r3 = 8
            r4 = 1
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0026 }
            java.util.zip.DeflaterOutputStream r3 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0024 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x0024 }
            r3.write(r5)     // Catch:{ all -> 0x0021 }
            r3.close()
            r2.end()
            byte[] r5 = r0.toByteArray()
            return r5
        L_0x0021:
            r5 = move-exception
            r1 = r3
            goto L_0x0028
        L_0x0024:
            r5 = move-exception
            goto L_0x0028
        L_0x0026:
            r5 = move-exception
            r2 = r1
        L_0x0028:
            if (r1 == 0) goto L_0x002d
            r1.close()
        L_0x002d:
            if (r2 == 0) goto L_0x0032
            r2.end()
        L_0x0032:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setAccessibilityPaneTitle.configure(byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] init(byte[] r5) throws java.io.IOException {
        /*
            r0 = 0
            java.util.zip.Inflater r1 = new java.util.zip.Inflater     // Catch:{ all -> 0x0035 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x0035 }
            java.util.zip.InflaterInputStream r2 = new java.util.zip.InflaterInputStream     // Catch:{ all -> 0x0033 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0033 }
            r3.<init>(r5)     // Catch:{ all -> 0x0033 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0033 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0030 }
            r5.<init>()     // Catch:{ all -> 0x0030 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0030 }
        L_0x001a:
            int r3 = r2.read(r0)     // Catch:{ all -> 0x0030 }
            if (r3 <= 0) goto L_0x0025
            r4 = 0
            r5.write(r0, r4, r3)     // Catch:{ all -> 0x0030 }
            goto L_0x001a
        L_0x0025:
            byte[] r5 = r5.toByteArray()     // Catch:{ all -> 0x0030 }
            r2.close()
            r1.end()
            return r5
        L_0x0030:
            r5 = move-exception
            r0 = r2
            goto L_0x0037
        L_0x0033:
            r5 = move-exception
            goto L_0x0037
        L_0x0035:
            r5 = move-exception
            r1 = r0
        L_0x0037:
            if (r0 == 0) goto L_0x003c
            r0.close()
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.end()
        L_0x0041:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setAccessibilityPaneTitle.init(byte[]):byte[]");
    }

    public static JSONObject getInstance(String str) throws ParseException {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(640);
            if (setborderwidth.getSDKVersion == null) {
                setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
            }
            Object configure2 = setborderwidth.getSDKVersion.configure(str);
            if (configure2 instanceof JSONObject) {
                return (JSONObject) configure2;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (getToolbarCustomization e) {
            throw new ParseException(new StringBuilder("Invalid JSON: ").append(e.getMessage()).toString(), 0);
        } catch (Exception e2) {
            throw new ParseException(new StringBuilder("Unexpected exception: ").append(e2.getMessage()).toString(), 0);
        }
    }

    public static <T> T init(JSONObject jSONObject, String str, Class<T> cls) throws ParseException {
        if (jSONObject.get(str) == null) {
            return null;
        }
        T t = jSONObject.get(str);
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        throw new ParseException(new StringBuilder("Unexpected type of JSON object member with key \"").append(str).append("\"").toString(), 0);
    }

    public static long init(JSONObject jSONObject, String str) throws ParseException {
        Number number = (Number) init(jSONObject, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException(new StringBuilder("JSON object member with key \"").append(str).append("\" is missing or null").toString(), 0);
    }

    public static URI getInstance(JSONObject jSONObject, String str) throws ParseException {
        String str2 = (String) init(jSONObject, str, String.class);
        if (str2 == null) {
            return null;
        }
        try {
            return new URI(str2);
        } catch (URISyntaxException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public static String[] configure(JSONObject jSONObject, String str) throws ParseException {
        JSONArray jSONArray = (JSONArray) init(jSONObject, str, JSONArray.class);
        if (jSONArray == null) {
            return null;
        }
        try {
            return (String[]) jSONArray.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException(new StringBuilder("JSON object member with key \"").append(str).append("\" is not an array of strings").toString(), 0);
        }
    }

    public static List<Base64> configure(JSONArray jSONArray) throws ParseException {
        if (jSONArray == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (i < jSONArray.size()) {
            Object obj = jSONArray.get(i);
            if (obj == null) {
                throw new ParseException(new StringBuilder("The X.509 certificate at position ").append(i).append(" must not be null").toString(), 0);
            } else if (obj instanceof String) {
                linkedList.add(new Base64((String) obj));
                i++;
            } else {
                throw new ParseException(new StringBuilder("The X.509 certificate at position ").append(i).append(" must be encoded as a Base64 string").toString(), 0);
            }
        }
        return linkedList;
    }
}
