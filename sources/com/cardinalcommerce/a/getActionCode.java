package com.cardinalcommerce.a;

import android.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.X509CertUtils;
import com.cardinalcommerce.emvco.parameters.ChallengeParameters;
import com.cardinalcommerce.emvco.utils.EMVCoError;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.models.exceptions.SDKRuntimeException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

public final class getActionCode {
    private static int getWarnings = 0;
    private static int onCReqSuccess = 1;
    private setFitsSystemWindows Cardinal;
    private String cca_continue;
    private char[] cleanup;
    private setFitsSystemWindows configure;
    private setWillNotDraw getInstance;
    private final setFocusable init;

    public getActionCode() {
    }

    private static String init(String str) throws InvalidInputException {
        byte[] bArr;
        int i = onCReqSuccess;
        int i2 = i & 11;
        int i3 = i2 + ((i ^ 11) | i2);
        getWarnings = i3 % 128;
        if ((i3 % 2 != 0 ? Typography.greater : 'T') == 'T' ? (bArr = Base64.decode(str, 8)) == null : (bArr = Base64.decode(str, 41)) == null) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Null decodedBytes"));
        }
        String str2 = new String(bArr, StandardCharsets.UTF_8);
        int i4 = getWarnings;
        int i5 = (((i4 ^ 124) + ((i4 & 124) << 1)) + 0) - 1;
        onCReqSuccess = i5 % 128;
        int i6 = i5 % 2;
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        r4 = (getWarnings + 54) - 1;
        onCReqSuccess = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r0 != true) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String Cardinal(java.lang.String r4) {
        /*
            int r0 = getWarnings
            r1 = r0 | 5
            int r2 = r1 << 1
            r0 = r0 & 5
            int r0 = ~r0
            r0 = r0 & r1
            int r0 = -r0
            r1 = r2 ^ r0
            r0 = r0 & r2
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            onCReqSuccess = r0
            int r1 = r1 % 2
            r0 = 0
            if (r1 != 0) goto L_0x001c
            r1 = r0
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            java.lang.String r3 = "\\."
            if (r1 == 0) goto L_0x002d
            java.lang.String[] r4 = r4.split(r3)
            int r1 = r4.length
            if (r1 <= r2) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == r2) goto L_0x0068
            goto L_0x0037
        L_0x002d:
            java.lang.String[] r4 = r4.split(r3)
            int r1 = r4.length
            if (r1 <= r2) goto L_0x0035
            r0 = r2
        L_0x0035:
            if (r0 == 0) goto L_0x0068
        L_0x0037:
            int r0 = getWarnings
            r1 = r0 ^ 81
            r0 = r0 & 81
            int r0 = r0 << r2
            int r0 = -r0
            int r0 = -r0
            r3 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r2
            int r3 = r3 + r0
            int r0 = r3 % 128
            onCReqSuccess = r0
            int r3 = r3 % 2
            r4 = r4[r2]
            java.lang.String r4 = init((java.lang.String) r4)
            int r0 = onCReqSuccess
            r1 = r0 | 73
            int r3 = r1 << 1
            r0 = r0 & 73
            int r0 = ~r0
            r0 = r0 & r1
            int r0 = -r0
            r1 = r3 ^ r0
            r0 = r0 & r3
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            getWarnings = r0
            int r1 = r1 % 2
            return r4
        L_0x0068:
            int r4 = getWarnings
            int r4 = r4 + 54
            int r4 = r4 - r2
            int r0 = r4 % 128
            onCReqSuccess = r0
            int r4 = r4 % 2
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getActionCode.Cardinal(java.lang.String):java.lang.String");
    }

    public getActionCode(ChallengeParameters challengeParameters, setFocusable setfocusable) throws SDKRuntimeException {
        this.getInstance = setWillNotDraw.getInstance();
        this.init = setfocusable;
        this.cleanup = setHorizontalScrollBarEnabled.configure(challengeParameters.get3DSServerTransactionID());
        try {
            cca_continue(challengeParameters.getAcsSignedContent());
        } catch (Exception e) {
            this.getInstance.getInstance(new EMVCoError(EMVCoError.ACS_SIGNED_CONTENT_ERROR_CODE, new StringBuilder(EMVCoError.ACS_SIGNED_CONTENT_EXCEPTION_MESSAGE).append(e.getLocalizedMessage()).toString()));
            throw new SDKRuntimeException("ACSSignedContent Exception ", e.getCause());
        }
    }

    public final char[] Cardinal() {
        int i = getWarnings;
        int i2 = i & 115;
        int i3 = ((i | 115) & (~i2)) + (i2 << 1);
        int i4 = i3 % 128;
        onCReqSuccess = i4;
        if ((i3 % 2 == 0 ? Typography.greater : 11) == 11) {
            char[] cArr = this.cleanup;
            int i5 = (((i4 ^ 99) | (i4 & 99)) << 1) - (((~i4) & 99) | (i4 & -100));
            getWarnings = i5 % 128;
            if ((i5 % 2 != 0 ? 'D' : 'I') == 'I') {
                return cArr;
            }
            throw null;
        }
        throw null;
    }

    public final String init() {
        int i = getWarnings;
        int i2 = (((i | 68) << 1) - (i ^ 68)) - 1;
        onCReqSuccess = i2 % 128;
        int i3 = i2 % 2;
        String str = this.cca_continue;
        int i4 = ((i & 74) + (i | 74)) - 1;
        onCReqSuccess = i4 % 128;
        if ((i4 % 2 == 0 ? 6 : 'D') != 6) {
            return str;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final setFitsSystemWindows configure() {
        int i = onCReqSuccess;
        int i2 = i | 97;
        int i3 = i2 << 1;
        int i4 = -(i2 & (~(i & 97)));
        int i5 = (i3 & i4) + (i4 | i3);
        getWarnings = i5 % 128;
        if (i5 % 2 == 0) {
            setFitsSystemWindows setfitssystemwindows = this.Cardinal;
            int i6 = (((i ^ 45) | (i & 45)) << 1) - (((~i) & 45) | (i & -46));
            getWarnings = i6 % 128;
            int i7 = i6 % 2;
            return setfitssystemwindows;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private X509Certificate configure(String str) {
        CertificateFactory certificateFactory;
        int i = onCReqSuccess;
        int i2 = (i ^ 58) + ((i & 58) << 1);
        int i3 = ((i2 | -1) << 1) - (i2 ^ -1);
        getWarnings = i3 % 128;
        int i4 = i3 % 2;
        Certificate certificate = null;
        try {
            certificateFactory = CertificateFactory.getInstance("X.509", setAllowClickWhenDisabled.getInstance);
            int i5 = onCReqSuccess;
            int i6 = (i5 ^ 79) + ((i5 & 79) << 1);
            getWarnings = i6 % 128;
            int i7 = i6 % 2;
        } catch (CertificateException e) {
            this.getInstance.cca_continue("EMVCoInitialize", new StringBuilder("Certificate Exception \n").append(e.getLocalizedMessage()).toString());
            certificateFactory = null;
        }
        if (certificateFactory != null) {
            try {
                certificate = certificateFactory.generateCertificate(new ByteArrayInputStream(str.getBytes()));
                int i8 = getWarnings;
                int i9 = ((i8 ^ 5) | (i8 & 5)) << 1;
                int i10 = -(((~i8) & 5) | (i8 & -6));
                int i11 = (i9 & i10) + (i10 | i9);
                onCReqSuccess = i11 % 128;
                int i12 = i11 % 2;
            } catch (CertificateException e2) {
                this.getInstance.getInstance(new EMVCoError(EMVCoError.ACS_SIGNED_CONTENT_ERROR_CODE, new StringBuilder("Certificate Exception \n").append(e2.getLocalizedMessage()).toString()));
                throw new SDKRuntimeException("ACSSignedContent Exception ", e2.getCause());
            }
        } else {
            int i13 = getWarnings;
            int i14 = (i13 & 7) + (i13 | 7);
            onCReqSuccess = i14 % 128;
            int i15 = i14 % 2;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        int i16 = getWarnings;
        int i17 = (i16 & 97) + (i16 | 97);
        onCReqSuccess = i17 % 128;
        int i18 = i17 % 2;
        return x509Certificate;
    }

    private X509Certificate getInstance() {
        X509Certificate cca_continue2 = X509CertUtils.cca_continue(new setHapticFeedbackEnabled(this.init.Cardinal()).configure(this.init.init()));
        int i = onCReqSuccess;
        int i2 = i | 73;
        int i3 = i2 << 1;
        int i4 = -((~(i & 73)) & i2);
        boolean z = true;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getWarnings = i5 % 128;
        if (i5 % 2 != 0) {
            z = false;
        }
        if (z) {
            return cca_continue2;
        }
        throw null;
    }

    private void cca_continue(String str) throws ParseException, JSONException, RuntimeException {
        JSONObject jSONObject = new JSONObject(cca_continue(str, getInstance()));
        if ((jSONObject.has("acsURL") ? 16 : '_') != '_') {
            int i = getWarnings;
            int i2 = i & 73;
            int i3 = (i ^ 73) | i2;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            onCReqSuccess = i4 % 128;
            int i5 = i4 % 2;
            this.cca_continue = jSONObject.optString("acsURL");
            int i6 = getWarnings;
            int i7 = i6 | 97;
            int i8 = i7 << 1;
            int i9 = -((~(i6 & 97)) & i7);
            int i10 = (i8 & i9) + (i9 | i8);
            onCReqSuccess = i10 % 128;
            int i11 = i10 % 2;
            this.Cardinal = new setFitsSystemWindows(jSONObject.optJSONObject("acsEphemPubKey"));
            this.configure = new setFitsSystemWindows(jSONObject.optJSONObject("sdkEphemPubKey"));
            int i12 = getWarnings;
            int i13 = i12 & 31;
            int i14 = (((i12 ^ 31) | i13) << 1) - ((i12 | 31) & (~i13));
            onCReqSuccess = i14 % 128;
            if ((i14 % 2 == 0 ? 'K' : '!') != '!') {
                int i15 = 22 / 0;
                return;
            }
            return;
        }
        throw new SDKRuntimeException("Invalid ACSUrl \n", new Throwable("ACS signed content failed"));
    }

    private String cca_continue(String str, X509Certificate x509Certificate) throws ParseException {
        int i = onCReqSuccess;
        int i2 = (i ^ 115) + ((i & 115) << 1);
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        JWSObject Cardinal2 = JWSObject.Cardinal(str);
        if (ThreeDSStrings.IS_EXTERNAL_BUILD) {
            int i4 = onCReqSuccess;
            int i5 = (i4 & -36) | ((~i4) & 35);
            int i6 = -(-((i4 & 35) << 1));
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            getWarnings = i7 % 128;
            int i8 = i7 % 2;
            configure(Cardinal2, x509Certificate);
            int i9 = (onCReqSuccess + 62) - 1;
            getWarnings = i9 % 128;
            int i10 = i9 % 2;
        }
        String obj = Cardinal2.cca_continue.toString();
        int i11 = getWarnings;
        int i12 = (((i11 | 106) << 1) - (i11 ^ 106)) - 1;
        onCReqSuccess = i12 % 128;
        if ((i12 % 2 == 0 ? Typography.quote : '`') == '`') {
            return obj;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private void configure(JWSObject jWSObject, X509Certificate x509Certificate) {
        List<com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64> cca_continue2 = jWSObject.configure.cca_continue();
        ArrayList arrayList = new ArrayList();
        int i = onCReqSuccess;
        int i2 = i & 13;
        int i3 = ((i ^ 13) | i2) << 1;
        int i4 = -((i | 13) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getWarnings = i5 % 128;
        int i6 = i5 % 2;
        for (com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64 obj : cca_continue2) {
            try {
                arrayList.add(configure(new StringBuilder("-----BEGIN CERTIFICATE-----\n").append(obj.toString()).append("\n-----END CERTIFICATE-----").toString()));
                int i7 = onCReqSuccess;
                int i8 = i7 & 35;
                int i9 = (i8 - (~(-(-((i7 ^ 35) | i8))))) - 1;
                getWarnings = i9 % 128;
                int i10 = i9 % 2;
            } catch (Exception e) {
                this.getInstance.getInstance(new EMVCoError(EMVCoError.ACS_SIGNED_CONTENT_ERROR_CODE, new StringBuilder(EMVCoError.INVALID_SIGNATURE_EXCEPTION).append(e.getLocalizedMessage()).toString()));
                throw new SDKRuntimeException("ACSSignedContent Exception ", e.getCause());
            }
        }
        try {
            getInstance(x509Certificate, arrayList);
            int i11 = getWarnings;
            int i12 = (i11 & 25) + (i11 | 25);
            onCReqSuccess = i12 % 128;
            int i13 = i12 % 2;
            init(jWSObject);
            int i14 = onCReqSuccess;
            int i15 = (i14 ^ 87) + ((i14 & 87) << 1);
            getWarnings = i15 % 128;
            if (!(i15 % 2 == 0)) {
                throw null;
            }
        } catch (Exception e2) {
            this.getInstance.getInstance(new EMVCoError(EMVCoError.ACS_SIGNED_CONTENT_ERROR_CODE, new StringBuilder(EMVCoError.INVALID_SIGNATURE_EXCEPTION).append(e2.getLocalizedMessage()).toString()));
            throw new RuntimeException("JWS certificate chain validation failed.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6 A[SYNTHETIC, Splitter:B:41:0x00e6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSObject r7) {
        /*
            r6 = this;
            java.lang.String r0 = "JWS validation failed."
            int r1 = getWarnings
            r2 = r1 | 119(0x77, float:1.67E-43)
            int r3 = r2 << 1
            r1 = r1 & 119(0x77, float:1.67E-43)
            int r1 = ~r1
            r1 = r1 & r2
            int r1 = -r1
            r2 = r3 | r1
            int r2 = r2 << 1
            r1 = r1 ^ r3
            int r2 = r2 - r1
            int r1 = r2 % 128
            onCReqSuccess = r1
            int r2 = r2 % 2
            com.cardinalcommerce.a.setOnKeyListener r1 = r7.configure
            java.util.List r1 = r1.cca_continue()
            com.cardinalcommerce.a.setOnKeyListener r2 = r7.configure
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r2 = r2.init()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r3 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm.getWarnings     // Catch:{ JOSEException -> 0x00ec }
            boolean r3 = r2.equals(r3)     // Catch:{ JOSEException -> 0x00ec }
            r4 = 20
            if (r3 != 0) goto L_0x0032
            r3 = 72
            goto L_0x0033
        L_0x0032:
            r3 = r4
        L_0x0033:
            r5 = 0
            if (r3 == r4) goto L_0x00a9
            int r3 = getWarnings
            int r3 = r3 + 76
            int r3 = r3 + -1
            int r4 = r3 % 128
            onCReqSuccess = r4
            int r3 = r3 % 2
            r4 = 96
            if (r3 != 0) goto L_0x0048
            r3 = r4
            goto L_0x004a
        L_0x0048:
            r3 = 45
        L_0x004a:
            if (r3 == r4) goto L_0x009d
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r3 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm.init     // Catch:{ JOSEException -> 0x00ec }
            boolean r3 = r2.equals(r3)     // Catch:{ JOSEException -> 0x00ec }
            if (r3 == 0) goto L_0x0055
            goto L_0x00a9
        L_0x0055:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r3 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm.onCReqSuccess     // Catch:{ JOSEException -> 0x00ec }
            boolean r2 = r2.equals(r3)     // Catch:{ JOSEException -> 0x00ec }
            if (r2 == 0) goto L_0x0090
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.ECDSAVerifier r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.ECDSAVerifier     // Catch:{ JOSEException -> 0x00ec }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ JOSEException -> 0x00ec }
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64 r1 = (com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64) r1     // Catch:{ JOSEException -> 0x00ec }
            java.lang.String r1 = r1.cca_continue     // Catch:{ JOSEException -> 0x00ec }
            byte[] r1 = com.cardinalcommerce.a.setPreferKeepClear.cca_continue(r1)     // Catch:{ JOSEException -> 0x00ec }
            java.security.cert.X509Certificate r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.X509CertUtils.cca_continue((byte[]) r1)     // Catch:{ JOSEException -> 0x00ec }
            java.security.PublicKey r1 = r1.getPublicKey()     // Catch:{ JOSEException -> 0x00ec }
            java.security.interfaces.ECPublicKey r1 = (java.security.interfaces.ECPublicKey) r1     // Catch:{ JOSEException -> 0x00ec }
            r2.<init>(r1)     // Catch:{ JOSEException -> 0x00ec }
            com.cardinalcommerce.a.setNextFocusUpId r1 = r2.getInstance()     // Catch:{ JOSEException -> 0x00ec }
            com.cardinalcommerce.a.KeyFactory r3 = com.cardinalcommerce.a.setAllowClickWhenDisabled.getInstance     // Catch:{ JOSEException -> 0x00ec }
            r1.cca_continue = r3     // Catch:{ JOSEException -> 0x00ec }
            int r1 = onCReqSuccess
            r3 = r1 | 5
            int r3 = r3 << 1
            r1 = r1 ^ 5
            int r3 = r3 - r1
        L_0x0089:
            int r1 = r3 % 128
            getWarnings = r1
            int r3 = r3 % 2
            goto L_0x00d5
        L_0x0090:
            java.lang.Throwable r7 = new java.lang.Throwable     // Catch:{ JOSEException -> 0x00ec }
            java.lang.String r1 = "Invalid JWSAlgorithm"
            r7.<init>(r1)     // Catch:{ JOSEException -> 0x00ec }
            com.cardinalcommerce.shared.models.exceptions.SDKRuntimeException r1 = new com.cardinalcommerce.shared.models.exceptions.SDKRuntimeException     // Catch:{ JOSEException -> 0x00ec }
            r1.<init>(r0, r7)     // Catch:{ JOSEException -> 0x00ec }
            throw r1     // Catch:{ JOSEException -> 0x00ec }
        L_0x009d:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r7 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm.init     // Catch:{ JOSEException -> 0x00ec }
            r2.equals(r7)     // Catch:{ JOSEException -> 0x00ec }
            r7 = 0
            super.hashCode()     // Catch:{ all -> 0x00a7 }
            throw r7     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r7 = move-exception
            throw r7
        L_0x00a9:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.RSASSAVerifier r2 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.RSASSAVerifier     // Catch:{ JOSEException -> 0x00ec }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ JOSEException -> 0x00ec }
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64 r1 = (com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64) r1     // Catch:{ JOSEException -> 0x00ec }
            java.lang.String r1 = r1.cca_continue     // Catch:{ JOSEException -> 0x00ec }
            byte[] r1 = com.cardinalcommerce.a.setPreferKeepClear.cca_continue(r1)     // Catch:{ JOSEException -> 0x00ec }
            java.security.cert.X509Certificate r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.X509CertUtils.cca_continue((byte[]) r1)     // Catch:{ JOSEException -> 0x00ec }
            java.security.PublicKey r1 = r1.getPublicKey()     // Catch:{ JOSEException -> 0x00ec }
            java.security.interfaces.RSAPublicKey r1 = (java.security.interfaces.RSAPublicKey) r1     // Catch:{ JOSEException -> 0x00ec }
            r2.<init>(r1)     // Catch:{ JOSEException -> 0x00ec }
            com.cardinalcommerce.a.setNextFocusUpId r1 = r2.getInstance()     // Catch:{ JOSEException -> 0x00ec }
            com.cardinalcommerce.a.KeyFactory r3 = com.cardinalcommerce.a.setAllowClickWhenDisabled.getInstance     // Catch:{ JOSEException -> 0x00ec }
            r1.cca_continue = r3     // Catch:{ JOSEException -> 0x00ec }
            int r1 = onCReqSuccess
            r3 = r1 & 5
            r1 = r1 ^ 5
            r1 = r1 | r3
            int r3 = r3 + r1
            goto L_0x0089
        L_0x00d5:
            boolean r7 = r7.getInstance(r2)     // Catch:{ JOSEException -> 0x00ec }
            if (r7 == 0) goto L_0x00e6
            int r7 = getWarnings
            int r7 = r7 + 71
            int r0 = r7 % 128
            onCReqSuccess = r0
            int r7 = r7 % 2
            return
        L_0x00e6:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ JOSEException -> 0x00ec }
            r7.<init>(r0)     // Catch:{ JOSEException -> 0x00ec }
            throw r7     // Catch:{ JOSEException -> 0x00ec }
        L_0x00ec:
            r7 = move-exception
            com.cardinalcommerce.a.setWillNotDraw r1 = r6.getInstance
            com.cardinalcommerce.emvco.utils.EMVCoError r2 = new com.cardinalcommerce.emvco.utils.EMVCoError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid Algorithm JOSE Exception: "
            r3.<init>(r4)
            java.lang.String r4 = r7.getLocalizedMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 11404(0x2c8c, float:1.598E-41)
            r2.<init>(r4, r3)
            r1.getInstance(r2)
            com.cardinalcommerce.shared.models.exceptions.SDKRuntimeException r1 = new com.cardinalcommerce.shared.models.exceptions.SDKRuntimeException
            java.lang.Throwable r7 = r7.getCause()
            r1.<init>(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getActionCode.init(com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSObject):void");
    }

    private static void getInstance(X509Certificate x509Certificate, ArrayList<X509Certificate> arrayList) throws CertificateException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, CertPathValidatorException {
        Set singleton = Collections.singleton(new TrustAnchor(x509Certificate, (byte[]) null));
        CertPath generateCertPath = CertificateFactory.getInstance("X.509").generateCertPath(arrayList);
        PKIXParameters pKIXParameters = new PKIXParameters(singleton);
        pKIXParameters.setRevocationEnabled(false);
        CertPathValidator.getInstance("PKIX").validate(generateCertPath, pKIXParameters);
        int i = onCReqSuccess;
        int i2 = ((i ^ 115) | (i & 115)) << 1;
        int i3 = -(((~i) & 115) | (i & -116));
        int i4 = (i2 & i3) + (i3 | i2);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
    }
}
