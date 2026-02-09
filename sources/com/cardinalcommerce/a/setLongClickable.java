package com.cardinalcommerce.a;

import android.app.Activity;
import android.os.CountDownTimer;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.ECKey;
import com.cardinalcommerce.emvco.events.ThreeDSEvent;
import com.cardinalcommerce.emvco.parameters.AuthenticationRequestParameters;
import com.cardinalcommerce.emvco.parameters.ChallengeParameters;
import com.cardinalcommerce.emvco.services.ChallengeStatusReceiver;
import com.cardinalcommerce.emvco.services.Transaction;
import com.cardinalcommerce.emvco.utils.EMVCoError;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.userinterfaces.ProgressDialog;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.util.UUID;
import lib.android.paypal.com.magnessdk.c;

public final class setLongClickable implements setEnabled, Transaction {
    private static int CardinalError = 0;
    private static int CardinalRenderType = 1;
    public static ChallengeStatusReceiver cca_continue;
    private static CountDownTimer cleanup;
    private static setLongClickable configure;
    private static setWillNotDraw onCReqSuccess;
    private ChallengeParameters Cardinal;
    private Activity getInstance;
    private char[] getSDKVersion;
    private setFocusable getWarnings;
    private AuthenticationRequestParameters init;
    private setSoundEffectsEnabled onValidated;

    static /* synthetic */ CountDownTimer Cardinal(CountDownTimer countDownTimer) {
        int i = CardinalRenderType;
        int i2 = i & 119;
        int i3 = i2 + ((i ^ 119) | i2);
        CardinalError = i3 % 128;
        char c = i3 % 2 != 0 ? (char) 27 : 5;
        cleanup = countDownTimer;
        if (c == 5) {
            return countDownTimer;
        }
        throw null;
    }

    static /* synthetic */ CountDownTimer getInstance() {
        int i = CardinalError;
        boolean z = true;
        int i2 = ((((i ^ 65) | (i & 65)) << 1) - (~(-(((~i) & 65) | (i & -66))))) - 1;
        int i3 = i2 % 128;
        CardinalRenderType = i3;
        int i4 = i2 % 2;
        CountDownTimer countDownTimer = cleanup;
        int i5 = (i3 & 96) + (i3 | 96);
        int i6 = ((i5 | -1) << 1) - (i5 ^ -1);
        CardinalError = i6 % 128;
        if (i6 % 2 != 0) {
            z = false;
        }
        if (z) {
            return countDownTimer;
        }
        throw null;
    }

    static /* synthetic */ void getInstance(setLongClickable setlongclickable) {
        int i = CardinalError;
        int i2 = ((i | 101) << 1) - (i ^ 101);
        CardinalRenderType = i2 % 128;
        char c = i2 % 2 == 0 ? 'L' : 4;
        setlongclickable.Cardinal();
        if (c == 'L') {
            int i3 = 63 / 0;
        }
    }

    private setLongClickable() {
    }

    public static synchronized setLongClickable cca_continue() {
        setLongClickable setlongclickable;
        synchronized (setLongClickable.class) {
            int i = CardinalRenderType;
            int i2 = (i & 111) + (i | 111);
            CardinalError = i2 % 128;
            if (!(i2 % 2 != 0)) {
                setWillNotDraw instance = setWillNotDraw.getInstance();
                onCReqSuccess = instance;
                instance.Cardinal("EMVCoTransaction", ThreeDSStrings.THREE_DS_TRANSACTION_INSTANCE_CALLED);
                if (configure == null) {
                    configure = new setLongClickable();
                    onCReqSuccess.Cardinal("EMVCoTransaction", ThreeDSStrings.THREE_DS_TRANSACTION_INSTANCE_CREATED);
                    int i3 = CardinalError;
                    int i4 = i3 | 83;
                    int i5 = (i4 << 1) - ((~(i3 & 83)) & i4);
                    CardinalRenderType = i5 % 128;
                    int i6 = i5 % 2;
                }
                setlongclickable = configure;
                int i7 = (CardinalRenderType + 42) - 1;
                CardinalError = i7 % 128;
                int i8 = i7 % 2;
            } else {
                setWillNotDraw instance2 = setWillNotDraw.getInstance();
                onCReqSuccess = instance2;
                instance2.Cardinal("EMVCoTransaction", ThreeDSStrings.THREE_DS_TRANSACTION_INSTANCE_CALLED);
                Throwable th = null;
                super.hashCode();
                throw th;
            }
        }
        return setlongclickable;
    }

    public final void getInstance(setFocusable setfocusable) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
        onCReqSuccess.Cardinal("EMVCoTransaction", ThreeDSStrings.THREE_DS_TRANSACTION_CONFIGURE_CALLED);
        this.getWarnings = setfocusable;
        char[] configure2 = setHorizontalScrollBarEnabled.configure(setfocusable.getInstance());
        char[] configure3 = configure();
        this.getSDKVersion = setHorizontalScrollBarEnabled.configure(UUID.randomUUID().toString());
        setfocusable.getInstance(new String(this.getSDKVersion));
        char[] init2 = init(setfocusable);
        onCReqSuccess.Cardinal("EMVCoTransaction", new StringBuilder(ThreeDSStrings.THREE_DS_TRANSACTION_SDK_APP_ID).append(setfocusable.getInstance()).toString());
        if (this.getSDKVersion != null) {
            onCReqSuccess.Cardinal("EMVCoTransaction", ThreeDSStrings.THREE_DS_TRANSACTION_SDK_TRANSACTION_ID.concat(new String(this.getSDKVersion)));
            this.init = new AuthenticationRequestParameters(this.getSDKVersion, init2, configure3, configure2, setHorizontalScrollBarEnabled.configure(setfocusable.cleanup()), setfocusable.cca_continue());
            int i = CardinalError;
            int i2 = i & 63;
            int i3 = ((i | 63) & (~i2)) + (i2 << 1);
            CardinalRenderType = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        onCReqSuccess.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_NULL_SDK_TRANSACTION_ID_ERROR, EMVCoError.CREATE_TRANSACTION_NULL_SDK_TRANSACTION_ID_ERROR_MESSAGE));
        int i5 = CardinalRenderType;
        int i6 = (i5 ^ 27) + ((i5 & 27) << 1);
        CardinalError = i6 % 128;
        int i7 = i6 % 2;
    }

    private char[] configure() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
        KeyPair init2 = setAllowClickWhenDisabled.init();
        this.getWarnings.Cardinal(init2);
        ECKey cca_continue2 = new ECKey.getInstance(Curve.getInstance, (ECPublicKey) init2.getPublic()).cca_continue();
        onCReqSuccess.Cardinal("EMVCoTransaction", ThreeDSStrings.THREE_DS_TRANSACTION_EPHEMERAL_KEY_GENERATED);
        char[] configure2 = setHorizontalScrollBarEnabled.configure(cca_continue2.toJSONString());
        int i = CardinalError;
        int i2 = i & 71;
        int i3 = (i | 71) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        CardinalRenderType = i5 % 128;
        int i6 = i5 % 2;
        return configure2;
    }

    public final AuthenticationRequestParameters getAuthenticationRequestParameters() {
        int i = CardinalRenderType;
        int i2 = (i & -82) | ((~i) & 81);
        int i3 = -(-((i & 81) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        CardinalError = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return this.init;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if ((r12.getAcsSignedContent() != null) == true) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        if ((r12.getAcsSignedContent() != null ? '[' : 'X') == '[') goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doChallenge(android.app.Activity r11, com.cardinalcommerce.emvco.parameters.ChallengeParameters r12, com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r13, int r14) throws com.cardinalcommerce.shared.models.exceptions.InvalidInputException {
        /*
            r10 = this;
            java.lang.String r0 = "RunTimeError"
            java.lang.String r1 = "101"
            java.lang.String r2 = "Error while creating and executing CReq \n"
            int r3 = CardinalError
            int r3 = r3 + 95
            int r4 = r3 % 128
            CardinalRenderType = r4
            int r3 = r3 % 2
            r4 = 70
            if (r3 != 0) goto L_0x0016
            r3 = r4
            goto L_0x0018
        L_0x0016:
            r3 = 68
        L_0x0018:
            java.lang.String r5 = "doChallenge called"
            r6 = 0
            java.lang.String r7 = "EMVCoTransaction"
            if (r3 == r4) goto L_0x0242
            com.cardinalcommerce.a.setWillNotDraw r3 = onCReqSuccess
            r3.Cardinal(r7, r5)
            r3 = 0
            r4 = 1
            if (r11 == 0) goto L_0x002a
            r5 = r3
            goto L_0x002b
        L_0x002a:
            r5 = r4
        L_0x002b:
            if (r5 == r4) goto L_0x022d
            r10.getInstance = r11
            int r11 = CardinalError
            r5 = r11 ^ 97
            r8 = r11 & 97
            r5 = r5 | r8
            int r5 = r5 << r4
            r8 = r11 & -98
            int r11 = ~r11
            r9 = 97
            r11 = r11 & r9
            r11 = r11 | r8
            int r11 = -r11
            r8 = r5 ^ r11
            r11 = r11 & r5
            int r11 = r11 << r4
            int r8 = r8 + r11
            int r11 = r8 % 128
            CardinalRenderType = r11
            int r8 = r8 % 2
            int r5 = r11 + 6
            int r5 = r5 - r4
            int r8 = r5 % 128
            CardinalError = r8
            int r5 = r5 % 2
            if (r12 == 0) goto L_0x0057
            r5 = r4
            goto L_0x0058
        L_0x0057:
            r5 = r3
        L_0x0058:
            if (r5 != r4) goto L_0x0218
            r5 = r11 & -110(0xffffffffffffff92, float:NaN)
            int r8 = ~r11
            r9 = 109(0x6d, float:1.53E-43)
            r8 = r8 & r9
            r5 = r5 | r8
            r11 = r11 & r9
            int r11 = r11 << r4
            int r11 = ~r11
            int r5 = r5 - r11
            int r5 = r5 - r4
            int r11 = r5 % 128
            CardinalError = r11
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0070
            r11 = r4
            goto L_0x0071
        L_0x0070:
            r11 = r3
        L_0x0071:
            if (r11 == 0) goto L_0x0084
            java.lang.String r11 = r12.getAcsSignedContent()
            r5 = 86
            int r5 = r5 / r3
            if (r11 == 0) goto L_0x007e
            r11 = r4
            goto L_0x007f
        L_0x007e:
            r11 = r3
        L_0x007f:
            if (r11 != r4) goto L_0x0218
            goto L_0x0092
        L_0x0082:
            r11 = move-exception
            throw r11
        L_0x0084:
            java.lang.String r11 = r12.getAcsSignedContent()
            r5 = 91
            if (r11 == 0) goto L_0x008e
            r11 = r5
            goto L_0x0090
        L_0x008e:
            r11 = 88
        L_0x0090:
            if (r11 != r5) goto L_0x0218
        L_0x0092:
            java.lang.String r11 = r12.get3DSServerTransactionID()
            if (r11 == 0) goto L_0x009a
            r11 = r3
            goto L_0x009b
        L_0x009a:
            r11 = r4
        L_0x009b:
            if (r11 == r4) goto L_0x0218
            int r11 = CardinalRenderType
            r5 = r11 & 76
            r11 = r11 | 76
            int r5 = r5 + r11
            r11 = r5 | -1
            int r11 = r11 << r4
            r5 = r5 ^ -1
            int r11 = r11 - r5
            int r5 = r11 % 128
            CardinalError = r5
            int r11 = r11 % 2
            r5 = 20
            if (r11 == 0) goto L_0x00b6
            r11 = r5
            goto L_0x00b8
        L_0x00b6:
            r11 = 29
        L_0x00b8:
            if (r11 == r5) goto L_0x0212
            java.lang.String r11 = r12.getAcsRefNumber()
            if (r11 == 0) goto L_0x00c2
            r11 = r4
            goto L_0x00c3
        L_0x00c2:
            r11 = r3
        L_0x00c3:
            if (r11 == 0) goto L_0x0218
            java.lang.String r11 = r12.getAcsRefNumber()
            if (r11 == 0) goto L_0x0218
            com.cardinalcommerce.a.setWillNotDraw r11 = onCReqSuccess
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ACSTransactionID "
            r5.<init>(r6)
            java.lang.String r6 = r12.getAcsTransactionID()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r11.Cardinal(r7, r5)
            com.cardinalcommerce.a.setWillNotDraw r11 = onCReqSuccess
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "3DSTransactionID "
            r5.<init>(r6)
            java.lang.String r6 = r12.get3DSServerTransactionID()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r11.Cardinal(r7, r5)
            r10.Cardinal = r12
            int r11 = CardinalRenderType
            r5 = r11 ^ 115(0x73, float:1.61E-43)
            r11 = r11 & 115(0x73, float:1.61E-43)
            int r11 = r11 << r4
            r6 = r5 ^ r11
            r11 = r11 & r5
            int r11 = r11 << r4
            int r6 = r6 + r11
            int r11 = r6 % 128
            CardinalError = r11
            int r6 = r6 % 2
            if (r13 == 0) goto L_0x0113
            r5 = r4
            goto L_0x0114
        L_0x0113:
            r5 = r3
        L_0x0114:
            if (r5 == 0) goto L_0x01fd
            r5 = r11 ^ 120(0x78, float:1.68E-43)
            r6 = r11 & 120(0x78, float:1.68E-43)
            int r6 = r6 << r4
            int r5 = r5 + r6
            int r5 = r5 - r4
            int r6 = r5 % 128
            CardinalRenderType = r6
            int r5 = r5 % 2
            cca_continue = r13
            r13 = r11 | 77
            int r5 = r13 << 1
            r11 = r11 & 77
            int r11 = ~r11
            r11 = r11 & r13
            int r11 = -r11
            int r11 = ~r11
            int r5 = r5 - r11
            int r5 = r5 - r4
            int r11 = r5 % 128
            CardinalRenderType = r11
            int r5 = r5 % 2
            r13 = 5
            if (r14 < r13) goto L_0x013c
            r13 = r4
            goto L_0x013d
        L_0x013c:
            r13 = r3
        L_0x013d:
            if (r13 == 0) goto L_0x01e8
            r13 = r11 | 49
            int r13 = r13 << r4
            r11 = r11 ^ 49
            int r13 = r13 - r11
            int r11 = r13 % 128
            CardinalError = r11
            int r13 = r13 % 2
            r10.Cardinal((int) r14)
            int r11 = CardinalError
            int r11 = r11 + 38
            int r11 = r11 - r4
            int r13 = r11 % 128
            CardinalRenderType = r13
            int r11 = r11 % 2
            r11 = 11416(0x2c98, float:1.5997E-41)
            com.cardinalcommerce.a.setSoundEffectsEnabled r13 = new com.cardinalcommerce.a.setSoundEffectsEnabled     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            com.cardinalcommerce.a.setFocusable r14 = r10.getWarnings     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            r13.<init>(r10, r12, r14)     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            r10.onValidated = r13     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            com.cardinalcommerce.shared.cs.userinterfaces.ChallengeUtils.configure = r3     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            com.cardinalcommerce.a.setWillNotDraw r12 = onCReqSuccess     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            java.lang.String r13 = "Transaction Timer started"
            r12.Cardinal(r7, r13)     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            com.cardinalcommerce.a.setSoundEffectsEnabled r12 = r10.onValidated     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            r12.cca_continue()     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            com.cardinalcommerce.a.setWillNotDraw r12 = onCReqSuccess     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            java.lang.String r13 = "Challenge Task started 01"
            r12.Cardinal(r7, r13)     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            com.cardinalcommerce.a.setWillNotDraw r12 = onCReqSuccess     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            r12.Cardinal()     // Catch:{ SDKRuntimeException -> 0x01c1, JSONException -> 0x019a }
            int r11 = CardinalError
            r12 = r11 ^ 79
            r11 = r11 & 79
            int r11 = r11 << r4
            int r12 = r12 + r11
            int r11 = r12 % 128
            CardinalRenderType = r11
            int r12 = r12 % 2
            if (r12 != 0) goto L_0x0190
            r11 = r4
            goto L_0x0191
        L_0x0190:
            r11 = r3
        L_0x0191:
            if (r11 == r4) goto L_0x0194
            return
        L_0x0194:
            r11 = 86
            int r11 = r11 / r3
            return
        L_0x0198:
            r11 = move-exception
            throw r11
        L_0x019a:
            r12 = move-exception
            com.cardinalcommerce.a.setWillNotDraw r13 = onCReqSuccess
            com.cardinalcommerce.emvco.utils.EMVCoError r14 = new com.cardinalcommerce.emvco.utils.EMVCoError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r12 = r12.getLocalizedMessage()
            java.lang.StringBuilder r12 = r3.append(r12)
            java.lang.String r12 = r12.toString()
            r14.<init>(r11, r12)
            r13.getInstance(r14)
            com.cardinalcommerce.emvco.events.RuntimeErrorEvent r11 = new com.cardinalcommerce.emvco.events.RuntimeErrorEvent
            java.lang.String r12 = "Message is not CRes"
            r11.<init>(r1, r12)
            r10.init(r0, r11)
            return
        L_0x01c1:
            r12 = move-exception
            com.cardinalcommerce.a.setWillNotDraw r13 = onCReqSuccess
            com.cardinalcommerce.emvco.utils.EMVCoError r14 = new com.cardinalcommerce.emvco.utils.EMVCoError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r12 = r12.getLocalizedMessage()
            java.lang.StringBuilder r12 = r3.append(r12)
            java.lang.String r12 = r12.toString()
            r14.<init>(r11, r12)
            r13.getInstance(r14)
            com.cardinalcommerce.emvco.events.RuntimeErrorEvent r11 = new com.cardinalcommerce.emvco.events.RuntimeErrorEvent
            java.lang.String r12 = "INVALID ACS CONTENT Failed"
            r11.<init>(r1, r12)
            r10.init(r0, r11)
            return
        L_0x01e8:
            com.cardinalcommerce.a.setWillNotDraw r11 = onCReqSuccess
            com.cardinalcommerce.emvco.utils.EMVCoError r12 = new com.cardinalcommerce.emvco.utils.EMVCoError
            r13 = 11401(0x2c89, float:1.5976E-41)
            java.lang.String r14 = "Invalid Timeout \n"
            r12.<init>(r13, r14)
            r11.getInstance(r12)
            java.lang.String r11 = "Timeout"
            com.cardinalcommerce.shared.models.exceptions.InvalidInputException r11 = r10.Cardinal((java.lang.String) r11)
            throw r11
        L_0x01fd:
            com.cardinalcommerce.a.setWillNotDraw r11 = onCReqSuccess
            com.cardinalcommerce.emvco.utils.EMVCoError r12 = new com.cardinalcommerce.emvco.utils.EMVCoError
            r13 = 11412(0x2c94, float:1.5992E-41)
            java.lang.String r14 = "Null Challenge Status Receiver \n"
            r12.<init>(r13, r14)
            r11.getInstance(r12)
            java.lang.String r11 = "Challenge Status Receiver"
            com.cardinalcommerce.shared.models.exceptions.InvalidInputException r11 = r10.Cardinal((java.lang.String) r11)
            throw r11
        L_0x0212:
            r12.getAcsRefNumber()
            throw r6     // Catch:{ all -> 0x0216 }
        L_0x0216:
            r11 = move-exception
            throw r11
        L_0x0218:
            com.cardinalcommerce.a.setWillNotDraw r11 = onCReqSuccess
            com.cardinalcommerce.emvco.utils.EMVCoError r12 = new com.cardinalcommerce.emvco.utils.EMVCoError
            r13 = 11402(0x2c8a, float:1.5978E-41)
            java.lang.String r14 = " Null Challenge Parameters \n"
            r12.<init>(r13, r14)
            r11.getInstance(r12)
            java.lang.String r11 = "Challenge Parameters"
            com.cardinalcommerce.shared.models.exceptions.InvalidInputException r11 = r10.Cardinal((java.lang.String) r11)
            throw r11
        L_0x022d:
            com.cardinalcommerce.a.setWillNotDraw r11 = onCReqSuccess
            com.cardinalcommerce.emvco.utils.EMVCoError r12 = new com.cardinalcommerce.emvco.utils.EMVCoError
            r13 = 11411(0x2c93, float:1.599E-41)
            java.lang.String r14 = " Null Current Activity \n"
            r12.<init>(r13, r14)
            r11.getInstance(r12)
            java.lang.String r11 = "Current Activity"
            com.cardinalcommerce.shared.models.exceptions.InvalidInputException r11 = r10.Cardinal((java.lang.String) r11)
            throw r11
        L_0x0242:
            com.cardinalcommerce.a.setWillNotDraw r11 = onCReqSuccess
            r11.Cardinal(r7, r5)
            super.hashCode()     // Catch:{ all -> 0x024b }
            throw r6     // Catch:{ all -> 0x024b }
        L_0x024b:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setLongClickable.doChallenge(android.app.Activity, com.cardinalcommerce.emvco.parameters.ChallengeParameters, com.cardinalcommerce.emvco.services.ChallengeStatusReceiver, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if ((r6.onValidated != null ? 'b' : 31) != 31) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r5 != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r6 = this;
            int r0 = CardinalRenderType
            r1 = r0 & 31
            r2 = 31
            r0 = r0 ^ r2
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r3 = r1 | r0
            r4 = 1
            int r3 = r3 << r4
            r0 = r0 ^ r1
            int r3 = r3 - r0
            int r0 = r3 % 128
            CardinalError = r0
            int r3 = r3 % 2
            r1 = 54
            if (r3 == 0) goto L_0x001c
            r3 = r1
            goto L_0x001e
        L_0x001c:
            r3 = 66
        L_0x001e:
            r5 = 0
            if (r3 == r1) goto L_0x002a
            com.cardinalcommerce.a.setSoundEffectsEnabled r1 = r6.onValidated
            if (r1 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r5 = r4
        L_0x0027:
            if (r5 == 0) goto L_0x0037
            goto L_0x005b
        L_0x002a:
            com.cardinalcommerce.a.setSoundEffectsEnabled r1 = r6.onValidated
            r3 = 15
            int r3 = r3 / r5
            if (r1 == 0) goto L_0x0034
            r1 = 98
            goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            if (r1 == r2) goto L_0x005b
        L_0x0037:
            r1 = r0 & 59
            r0 = r0 ^ 59
            r0 = r0 | r1
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r4
            int r0 = r1 % 128
            CardinalRenderType = r0
            int r1 = r1 % 2
            com.cardinalcommerce.a.setSoundEffectsEnabled r0 = r6.onValidated
            r0.Cardinal()
            int r0 = CardinalRenderType
            r1 = r0 & 9
            r0 = r0 ^ 9
            r0 = r0 | r1
            r2 = r1 & r0
            r0 = r0 | r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            CardinalError = r0
            int r2 = r2 % 2
        L_0x005b:
            r0 = 0
            r6.onValidated = r0
            r6.init = r0
            r6.getInstance = r0
            r6.Cardinal = r0
            cca_continue = r0
            char[] r1 = r6.getSDKVersion
            com.cardinalcommerce.a.setHorizontalScrollBarEnabled.getInstance(r1)
            r6.getWarnings = r0
            init()
            configure = r0
            int r0 = CardinalError
            r1 = r0 ^ 105(0x69, float:1.47E-43)
            r0 = r0 & 105(0x69, float:1.47E-43)
            int r0 = r0 << r4
            int r1 = r1 + r0
            int r0 = r1 % 128
            CardinalRenderType = r0
            int r1 = r1 % 2
            return
        L_0x0081:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setLongClickable.close():void");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Throwable, android.os.CountDownTimer, java.lang.Object] */
    public static void init() {
        int i = CardinalError;
        int i2 = i & 47;
        int i3 = (~i2) & (i | 47);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        CardinalRenderType = i5 % 128;
        char c = i5 % 2 == 0 ? 'B' : 'Z';
        ? r4 = 0;
        if (c != 'B') {
            CountDownTimer countDownTimer = cleanup;
            if (countDownTimer != null) {
                int i6 = ((((i ^ 77) | (i & 77)) << 1) - (~(-(((~i) & 77) | (i & -78))))) - 1;
                CardinalRenderType = i6 % 128;
                int i7 = i6 % 2;
                countDownTimer.cancel();
                cleanup = r4;
                int i8 = CardinalRenderType;
                int i9 = ((i8 ^ 7) | (i8 & 7)) << 1;
                int i10 = -(((~i8) & 7) | (i8 & -8));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                CardinalError = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = ((CardinalRenderType + 68) - 0) - 1;
            CardinalError = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        super.hashCode();
        throw r4;
    }

    private void Cardinal(final int i) {
        this.getInstance.runOnUiThread(new Runnable() {
            private static int Cardinal = 1;
            private static int configure;

            public final void run() {
                long j = (long) (i * c.b.q);
                setLongClickable.Cardinal((CountDownTimer) new CountDownTimer(j, j) {
                    private static int configure = 1;
                    private static int getInstance;

                    public final void onTick(long j) {
                        int i = getInstance;
                        int i2 = (i & 118) + (i | 118);
                        int i3 = (i2 & -1) + (i2 | -1);
                        configure = i3 % 128;
                        int i4 = i3 % 2;
                    }

                    public final void onFinish() {
                        int i = getInstance;
                        int i2 = (((i ^ 77) | (i & 77)) << 1) - (((~i) & 77) | (i & -78));
                        configure = i2 % 128;
                        int i3 = i2 % 2;
                        setLongClickable.getInstance(setLongClickable.this);
                        int i4 = configure;
                        int i5 = (i4 & 5) + (i4 | 5);
                        getInstance = i5 % 128;
                        int i6 = i5 % 2;
                    }
                });
                setLongClickable.getInstance().start();
                int i = configure;
                int i2 = i ^ 25;
                int i3 = ((((i & 25) | i2) << 1) - (~(-i2))) - 1;
                Cardinal = i3 % 128;
                if ((i3 % 2 == 0 ? 3 : '>') != '>') {
                    int i4 = 81 / 0;
                }
            }
        });
        int i2 = CardinalError;
        int i3 = i2 & 39;
        int i4 = (i2 ^ 39) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        CardinalRenderType = i5 % 128;
        int i6 = i5 % 2;
    }

    private void Cardinal() {
        onCReqSuccess();
        init(ThreeDSStrings.ERROR_TYPE_TIMEOUT, new ThreeDSEvent());
        int i = CardinalRenderType;
        int i2 = (i & -56) | ((~i) & 55);
        int i3 = (i & 55) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        CardinalError = i4 % 128;
        int i5 = i4 % 2;
    }

    private InvalidInputException Cardinal(String str) {
        InvalidInputException invalidInputException = new InvalidInputException("InvalidInputException", new Throwable(new StringBuilder("Caught in ").append(getClass().getName()).append("\n Invalid ").append(str).toString()));
        int i = CardinalError;
        int i2 = (i ^ 115) + ((i & 115) << 1);
        CardinalRenderType = i2 % 128;
        int i3 = i2 % 2;
        return invalidInputException;
    }

    public final ProgressDialog getProgressView(Activity activity) throws InvalidInputException {
        ProgressDialog progressDialog = new ProgressDialog(activity, this.getWarnings.init());
        int i = CardinalError;
        int i2 = i | 103;
        int i3 = (i2 << 1) - ((~(i & 103)) & i2);
        CardinalRenderType = i3 % 128;
        int i4 = i3 % 2;
        return progressDialog;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if ((!r9.CardinalConfigurationParameters().equalsIgnoreCase("N") ? '@' : ' ') != '@') goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        if ((!r9.CardinalConfigurationParameters().equalsIgnoreCase("N") ? '9' : '?') != '9') goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        if ((r9.onCReqSuccess().equalsIgnoreCase("N")) != false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCReqSuccess(com.cardinalcommerce.a.setTransitionVisibility r9) {
        /*
            r8 = this;
            int r0 = CardinalRenderType
            r1 = r0 & -98
            int r2 = ~r0
            r3 = 97
            r2 = r2 & r3
            r1 = r1 | r2
            r0 = r0 & r3
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            CardinalError = r0
            r0 = 2
            int r1 = r1 % r0
            com.cardinalcommerce.a.setWillNotDraw r1 = onCReqSuccess
            java.lang.String r3 = "onCReqSuccess called"
            java.lang.String r4 = "EMVCoTransaction"
            r1.Cardinal(r4, r3)
            java.lang.String r1 = r9.CardinalConfigurationParameters()
            java.lang.String r3 = "Y"
            boolean r1 = r1.equalsIgnoreCase(r3)
            r3 = 79
            if (r1 != 0) goto L_0x002d
            r1 = 26
            goto L_0x002e
        L_0x002d:
            r1 = r3
        L_0x002e:
            r5 = 0
            if (r1 == r3) goto L_0x00a3
            int r1 = CardinalRenderType
            r6 = r1 & 123(0x7b, float:1.72E-43)
            int r7 = ~r6
            r1 = r1 | 123(0x7b, float:1.72E-43)
            r1 = r1 & r7
            int r6 = r6 << r2
            int r1 = r1 + r6
            int r6 = r1 % 128
            CardinalError = r6
            int r1 = r1 % r0
            r6 = 95
            if (r1 == 0) goto L_0x0046
            r1 = r6
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            java.lang.String r7 = "N"
            if (r1 == r6) goto L_0x005e
            java.lang.String r1 = r9.CardinalConfigurationParameters()
            boolean r1 = r1.equalsIgnoreCase(r7)
            r6 = 64
            if (r1 != 0) goto L_0x0059
            r1 = r6
            goto L_0x005b
        L_0x0059:
            r1 = 32
        L_0x005b:
            if (r1 == r6) goto L_0x0074
            goto L_0x00a3
        L_0x005e:
            java.lang.String r1 = r9.CardinalConfigurationParameters()
            boolean r1 = r1.equalsIgnoreCase(r7)
            r6 = 61
            int r6 = r6 / r5
            r6 = 57
            if (r1 != 0) goto L_0x006f
            r1 = r6
            goto L_0x0071
        L_0x006f:
            r1 = 63
        L_0x0071:
            if (r1 == r6) goto L_0x0074
            goto L_0x00a3
        L_0x0074:
            int r1 = CardinalRenderType
            r6 = r1 & 79
            r1 = r1 | r3
            int r6 = r6 + r1
            int r1 = r6 % 128
            CardinalError = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L_0x0083
            r1 = r5
            goto L_0x0084
        L_0x0083:
            r1 = r2
        L_0x0084:
            if (r1 != r2) goto L_0x0096
            java.lang.String r1 = r9.onCReqSuccess()
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 != 0) goto L_0x0092
            r1 = r5
            goto L_0x0093
        L_0x0092:
            r1 = r2
        L_0x0093:
            if (r1 == 0) goto L_0x00a3
            goto L_0x00c3
        L_0x0096:
            java.lang.String r9 = r9.onCReqSuccess()
            r9.equalsIgnoreCase(r7)
            r9 = 0
            throw r9     // Catch:{ all -> 0x009f }
        L_0x009f:
            r9 = move-exception
            throw r9
        L_0x00a1:
            r9 = move-exception
            throw r9
        L_0x00a3:
            init()
            com.cardinalcommerce.a.setWillNotDraw r1 = onCReqSuccess
            java.lang.String r3 = "Transaction Timer ended"
            r1.Cardinal(r4, r3)
            int r1 = CardinalError
            r3 = r1 ^ 1
            r4 = r1 & 1
            r3 = r3 | r4
            int r3 = r3 << r2
            int r4 = ~r4
            r1 = r1 | r2
            r1 = r1 & r4
            int r1 = -r1
            r4 = r3 | r1
            int r4 = r4 << r2
            r1 = r1 ^ r3
            int r4 = r4 - r1
            int r1 = r4 % 128
            CardinalRenderType = r1
            int r4 = r4 % r0
        L_0x00c3:
            com.cardinalcommerce.a.setSoundEffectsEnabled r1 = r8.onValidated
            boolean r1 = r1.init()
            if (r1 != 0) goto L_0x00cc
            r5 = r2
        L_0x00cc:
            if (r5 == 0) goto L_0x00f3
            int r1 = CardinalError
            int r1 = r1 + 99
            int r1 = r1 - r2
            r3 = r1 ^ -1
            r1 = r1 & -1
            int r1 = r1 << r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            CardinalRenderType = r1
            int r3 = r3 % r0
            android.app.Activity r1 = r8.getInstance
            com.cardinalcommerce.a.setFocusable r3 = r8.getWarnings
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r3 = r3.getSDKVersion()
            com.cardinalcommerce.shared.cs.userinterfaces.ChallengeUtils.cca_continue(r9, r1, r3)
            int r9 = CardinalError
            int r9 = r9 + 12
            int r9 = r9 - r2
            int r1 = r9 % 128
            CardinalRenderType = r1
            int r9 = r9 % r0
        L_0x00f3:
            int r9 = CardinalError
            r1 = r9 ^ 27
            r3 = r9 & 27
            r1 = r1 | r3
            int r1 = r1 << r2
            int r2 = ~r3
            r9 = r9 | 27
            r9 = r9 & r2
            int r1 = r1 - r9
            int r9 = r1 % 128
            CardinalRenderType = r9
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setLongClickable.onCReqSuccess(com.cardinalcommerce.a.setTransitionVisibility):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b7, code lost:
        if ((r9.onValidated != null) != true) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c3, code lost:
        if ((r9.onValidated == null) != true) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init(java.lang.String r10, com.cardinalcommerce.emvco.events.ThreeDSEvent r11) {
        /*
            r9 = this;
            int r0 = CardinalRenderType
            r1 = r0 & 103(0x67, float:1.44E-43)
            r0 = r0 ^ 103(0x67, float:1.44E-43)
            r0 = r0 | r1
            r2 = r1 | r0
            r3 = 1
            int r2 = r2 << r3
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            CardinalError = r0
            int r2 = r2 % 2
            r0 = 31
            r1 = 50
            if (r2 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            java.lang.String r4 = "ProtocolError"
            java.lang.String r5 = "Transaction Timer ended"
            java.lang.String r6 = "onCReqError called"
            java.lang.String r7 = "EMVCoTransaction"
            r8 = 0
            if (r2 != r1) goto L_0x0191
            com.cardinalcommerce.a.setWillNotDraw r1 = onCReqSuccess
            r1.Cardinal(r7, r6)
            com.cardinalcommerce.a.setWillNotDraw r1 = onCReqSuccess
            r1.Cardinal(r7, r5)
            boolean r1 = java.util.Objects.equals(r10, r4)
            r2 = 8
            r4 = 55
            if (r1 == 0) goto L_0x003d
            r1 = r2
            goto L_0x003e
        L_0x003d:
            r1 = r4
        L_0x003e:
            r5 = 0
            if (r1 == r2) goto L_0x0166
            java.lang.String r1 = "RunTimeError"
            boolean r1 = java.util.Objects.equals(r10, r1)
            r2 = 5
            if (r1 == 0) goto L_0x004d
            r1 = 63
            goto L_0x004e
        L_0x004d:
            r1 = r2
        L_0x004e:
            if (r1 == r2) goto L_0x007a
            int r10 = CardinalRenderType
            int r10 = r10 + 89
            int r0 = r10 % 128
            CardinalError = r0
            int r10 = r10 % 2
            r0 = 10
            if (r10 == 0) goto L_0x0060
            r10 = r0
            goto L_0x0062
        L_0x0060:
            r10 = 16
        L_0x0062:
            if (r10 == r0) goto L_0x006d
            com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r10 = cca_continue
            com.cardinalcommerce.emvco.events.RuntimeErrorEvent r11 = (com.cardinalcommerce.emvco.events.RuntimeErrorEvent) r11
            r10.runtimeError(r11)
            goto L_0x0177
        L_0x006d:
            com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r10 = cca_continue
            com.cardinalcommerce.emvco.events.RuntimeErrorEvent r11 = (com.cardinalcommerce.emvco.events.RuntimeErrorEvent) r11
            r10.runtimeError(r11)
            super.hashCode()     // Catch:{ all -> 0x0078 }
            throw r8     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r10 = move-exception
            throw r10
        L_0x007a:
            java.lang.String r11 = "TimeOutError"
            boolean r11 = java.util.Objects.equals(r10, r11)
            if (r11 == 0) goto L_0x0084
            r11 = r5
            goto L_0x0085
        L_0x0084:
            r11 = r3
        L_0x0085:
            if (r11 == 0) goto L_0x0127
            java.lang.String r11 = "CancelTimeout"
            boolean r10 = java.util.Objects.equals(r10, r11)
            if (r10 == 0) goto L_0x0091
            r10 = r5
            goto L_0x0092
        L_0x0091:
            r10 = r3
        L_0x0092:
            if (r10 == r3) goto L_0x010e
            int r10 = CardinalError
            r11 = r10 ^ 81
            r1 = r10 & 81
            r1 = r1 | r11
            int r1 = r1 << r3
            int r1 = r1 - r11
            int r11 = r1 % 128
            CardinalRenderType = r11
            int r1 = r1 % 2
            r11 = 67
            if (r1 != 0) goto L_0x00aa
            r1 = 93
            goto L_0x00ab
        L_0x00aa:
            r1 = r11
        L_0x00ab:
            if (r1 == r11) goto L_0x00bc
            com.cardinalcommerce.a.setSoundEffectsEnabled r11 = r9.onValidated
            r1 = 56
            int r1 = r1 / r5
            if (r11 == 0) goto L_0x00b6
            r11 = r3
            goto L_0x00b7
        L_0x00b6:
            r11 = r5
        L_0x00b7:
            if (r11 == r3) goto L_0x00c5
            goto L_0x010e
        L_0x00ba:
            r10 = move-exception
            throw r10
        L_0x00bc:
            com.cardinalcommerce.a.setSoundEffectsEnabled r11 = r9.onValidated
            if (r11 == 0) goto L_0x00c2
            r11 = r5
            goto L_0x00c3
        L_0x00c2:
            r11 = r3
        L_0x00c3:
            if (r11 == r3) goto L_0x010e
        L_0x00c5:
            r11 = r10 | 123(0x7b, float:1.72E-43)
            int r11 = r11 << r3
            r10 = r10 ^ 123(0x7b, float:1.72E-43)
            int r11 = r11 - r10
            int r10 = r11 % 128
            CardinalRenderType = r10
            int r11 = r11 % 2
            com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r10 = cca_continue
            r10.cancelled()
            com.cardinalcommerce.a.setSoundEffectsEnabled r10 = r9.onValidated
            if (r10 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r5 = r3
        L_0x00dc:
            if (r5 == 0) goto L_0x00e0
            goto L_0x0177
        L_0x00e0:
            int r11 = CardinalRenderType
            r1 = r11 & 55
            r11 = r11 | r4
            int r1 = r1 + r11
            int r11 = r1 % 128
            CardinalError = r11
            int r1 = r1 % 2
            r11 = 23
            if (r1 == 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r0 = r11
        L_0x00f2:
            r10.configure()
            if (r0 != r11) goto L_0x010b
            int r10 = CardinalRenderType
            r11 = r10 ^ 113(0x71, float:1.58E-43)
            r10 = r10 & 113(0x71, float:1.58E-43)
            int r10 = r10 << r3
            int r10 = -r10
            int r10 = -r10
            r0 = r11 & r10
            r10 = r10 | r11
            int r0 = r0 + r10
            int r10 = r0 % 128
            CardinalError = r10
            int r0 = r0 % 2
            goto L_0x0177
        L_0x010b:
            throw r8     // Catch:{ all -> 0x010c }
        L_0x010c:
            r10 = move-exception
            throw r10
        L_0x010e:
            com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r10 = cca_continue
            r10.cancelled()
            int r10 = CardinalRenderType
            r11 = r10 ^ 27
            r0 = r10 & 27
            r11 = r11 | r0
            int r11 = r11 << r3
            int r0 = ~r0
            r10 = r10 | 27
            r10 = r10 & r0
            int r11 = r11 - r10
        L_0x0120:
            int r10 = r11 % 128
            CardinalError = r10
            int r11 = r11 % 2
            goto L_0x0177
        L_0x0127:
            int r10 = CardinalRenderType
            r11 = r10 & 9
            r10 = r10 ^ 9
            r10 = r10 | r11
            int r10 = -r10
            int r10 = -r10
            r0 = r11 ^ r10
            r10 = r10 & r11
            int r10 = r10 << r3
            int r0 = r0 + r10
            int r10 = r0 % 128
            CardinalError = r10
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r5 = r3
        L_0x013f:
            if (r5 != r3) goto L_0x015b
            com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r10 = cca_continue
            r10.timedout()
            int r10 = CardinalError
            r11 = r10 | 28
            int r11 = r11 << r3
            r10 = r10 ^ 28
            int r11 = r11 - r10
            r10 = r11 | -1
            int r10 = r10 << r3
            r11 = r11 ^ -1
            int r10 = r10 - r11
            int r11 = r10 % 128
            CardinalRenderType = r11
            int r10 = r10 % 2
            goto L_0x0177
        L_0x015b:
            com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r10 = cca_continue
            r10.timedout()
            super.hashCode()     // Catch:{ all -> 0x0164 }
            throw r8     // Catch:{ all -> 0x0164 }
        L_0x0164:
            r10 = move-exception
            throw r10
        L_0x0166:
            com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r10 = cca_continue
            com.cardinalcommerce.emvco.events.ProtocolErrorEvent r11 = (com.cardinalcommerce.emvco.events.ProtocolErrorEvent) r11
            r10.protocolError(r11)
            int r10 = CardinalRenderType
            r11 = r10 & 54
            r10 = r10 | 54
            int r11 = r11 + r10
            int r11 = r11 - r5
            int r11 = r11 - r3
            goto L_0x0120
        L_0x0177:
            com.cardinalcommerce.shared.cs.userinterfaces.ChallengeUtils.getInstance()
            init()
            int r10 = CardinalRenderType
            r11 = r10 ^ 111(0x6f, float:1.56E-43)
            r0 = r10 & 111(0x6f, float:1.56E-43)
            r11 = r11 | r0
            int r11 = r11 << r3
            int r0 = ~r0
            r10 = r10 | 111(0x6f, float:1.56E-43)
            r10 = r10 & r0
            int r11 = r11 - r10
            int r10 = r11 % 128
            CardinalError = r10
            int r11 = r11 % 2
            return
        L_0x0191:
            com.cardinalcommerce.a.setWillNotDraw r11 = onCReqSuccess
            r11.Cardinal(r7, r6)
            com.cardinalcommerce.a.setWillNotDraw r11 = onCReqSuccess
            r11.Cardinal(r7, r5)
            java.util.Objects.equals(r10, r4)
            throw r8     // Catch:{ all -> 0x019f }
        L_0x019f:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setLongClickable.init(java.lang.String, com.cardinalcommerce.emvco.events.ThreeDSEvent):void");
    }

    private static char[] init(setFocusable setfocusable) {
        char[] cArr = new char[0];
        try {
            cArr = setHorizontalScrollBarEnabled.configure(new setClickable(setfocusable).init(setfocusable.init()));
            setSaveFromParentEnabled.getInstance();
            setSaveFromParentEnabled.Cardinal().onValidated();
            setSaveFromParentEnabled.getInstance();
            setSaveFromParentEnabled.init();
            onCReqSuccess.Cardinal("EMVCoTransaction", "Encrypted LASSO Created");
            int i = CardinalRenderType;
            int i2 = i & 105;
            int i3 = -(-((i ^ 105) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            CardinalError = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            onCReqSuccess.getInstance(new EMVCoError(EMVCoError.CREATE_TRANSACTION_LASSO_DATA_ENCRYPTION_ERROR, new StringBuilder(EMVCoError.CREATE_TRANSACTION_DEVICE_DATA_ENCRYPTION_MESSAGE).append(e.getLocalizedMessage()).toString()));
        }
        int i6 = CardinalError;
        int i7 = i6 & 121;
        int i8 = i6 | 121;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        CardinalRenderType = i9 % 128;
        int i10 = i9 % 2;
        return cArr;
    }

    private void onCReqSuccess() {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.getWarnings.cca_continue());
        setverticalscrollbarenabled.Cardinal(ThreeDSStrings.TIMEOUT_ERROR_CODE);
        setverticalscrollbarenabled.cca_continue("Transaction Timed Out");
        setverticalscrollbarenabled.getInstance("For example, a slowly processing back-end system.");
        setverticalscrollbarenabled.configure(this.Cardinal.get3DSServerTransactionID());
        setverticalscrollbarenabled.cleanup(this.Cardinal.getAcsTransactionID());
        setverticalscrollbarenabled.init(new String(this.getSDKVersion));
        new setHasTransientState(setverticalscrollbarenabled, (String) null).cca_continue();
        int i = CardinalError;
        int i2 = (i & -56) | ((~i) & 55);
        int i3 = -(-((i & 55) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        CardinalRenderType = i4 % 128;
        int i5 = i4 % 2;
    }
}
