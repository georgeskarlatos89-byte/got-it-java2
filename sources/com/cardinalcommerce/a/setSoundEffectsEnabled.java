package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.Payload;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.DirectDecrypter;
import com.cardinalcommerce.emvco.events.ProtocolErrorEvent;
import com.cardinalcommerce.emvco.events.RuntimeErrorEvent;
import com.cardinalcommerce.emvco.events.ThreeDSEvent;
import com.cardinalcommerce.emvco.parameters.ChallengeParameters;
import com.cardinalcommerce.emvco.utils.EMVCoError;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.models.ErrorMessage;
import com.cardinalcommerce.shared.models.exceptions.SDKRuntimeException;
import java.security.KeyPair;
import java.text.ParseException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import javax.crypto.SecretKey;
import org.json.JSONException;
import org.json.JSONObject;

public final class setSoundEffectsEnabled extends setKeyboardNavigationCluster implements Runnable {
    private static int CardinalEnvironment = 1;
    private static int CardinalError;
    private final setEnabled Cardinal;
    private setAutofillHints cca_continue;
    private final char[] cleanup;
    private byte[] configure;
    private SecretKey getInstance;
    private char[] getSDKVersion;
    private final char[] getWarnings;
    private char[] init;
    private final char[] onCReqSuccess;
    private setAccessibilityLiveRegion onValidated;
    private final setWillNotDraw values;

    private static /* synthetic */ setAutofillHints Cardinal(setSoundEffectsEnabled setsoundeffectsenabled) {
        int i = CardinalError;
        int i2 = i & 111;
        int i3 = -(-(i | 111));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        CardinalEnvironment = i5;
        int i6 = i4 % 2;
        setAutofillHints setautofillhints = setsoundeffectsenabled.cca_continue;
        int i7 = (i5 + 102) - 1;
        CardinalError = i7 % 128;
        int i8 = i7 % 2;
        return setautofillhints;
    }

    private static /* synthetic */ setAutofillHints Cardinal(setSoundEffectsEnabled setsoundeffectsenabled, setAutofillHints setautofillhints) {
        int i = CardinalEnvironment;
        int i2 = i & 47;
        int i3 = (i2 - (~((i ^ 47) | i2))) - 1;
        CardinalError = i3 % 128;
        int i4 = i3 % 2;
        setsoundeffectsenabled.cca_continue = setautofillhints;
        int i5 = ((i ^ 83) - (~((i & 83) << 1))) - 1;
        CardinalError = i5 % 128;
        int i6 = i5 % 2;
        return setautofillhints;
    }

    private static /* synthetic */ byte[] cca_continue(setSoundEffectsEnabled setsoundeffectsenabled, byte[] bArr) {
        int i = CardinalError;
        int i2 = i & 115;
        int i3 = i2 + ((i ^ 115) | i2);
        int i4 = i3 % 128;
        CardinalEnvironment = i4;
        char c = i3 % 2 == 0 ? ',' : 29;
        setsoundeffectsenabled.configure = bArr;
        if (c == ',') {
            int i5 = 14 / 0;
        }
        int i6 = ((i4 + 91) - 1) - 1;
        CardinalError = i6 % 128;
        int i7 = i6 % 2;
        return bArr;
    }

    private static /* synthetic */ char[] cca_continue(setSoundEffectsEnabled setsoundeffectsenabled) {
        int i = CardinalEnvironment;
        int i2 = i & 93;
        int i3 = -(-((i ^ 93) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        CardinalError = i5;
        char c = i4 % 2 != 0 ? '(' : 'X';
        char[] cArr = setsoundeffectsenabled.cleanup;
        if (c == 'X') {
            int i6 = (((i5 | 32) << 1) - (i5 ^ 32)) - 1;
            CardinalEnvironment = i6 % 128;
            int i7 = i6 % 2;
            return cArr;
        }
        throw null;
    }

    private static /* synthetic */ char[] cleanup(setSoundEffectsEnabled setsoundeffectsenabled) {
        int i = CardinalEnvironment;
        int i2 = i & 67;
        boolean z = true;
        int i3 = ((((i ^ 67) | i2) << 1) - (~(-((i | 67) & (~i2))))) - 1;
        CardinalError = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        char[] cArr = setsoundeffectsenabled.getSDKVersion;
        if (z) {
            return cArr;
        }
        throw null;
    }

    private static /* synthetic */ char[] configure(setSoundEffectsEnabled setsoundeffectsenabled) {
        int i = CardinalEnvironment + 4;
        boolean z = true;
        int i2 = ((i | -1) << 1) - (i ^ -1);
        int i3 = i2 % 128;
        CardinalError = i3;
        int i4 = i2 % 2;
        char[] cArr = setsoundeffectsenabled.onCReqSuccess;
        int i5 = i3 & 21;
        int i6 = (i3 | 21) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        CardinalEnvironment = i8 % 128;
        if (i8 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return cArr;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private static /* synthetic */ SecretKey getInstance(setSoundEffectsEnabled setsoundeffectsenabled, SecretKey secretKey) {
        int i = CardinalError;
        int i2 = (i & 82) + (i | 82);
        int i3 = (i2 & -1) + (i2 | -1);
        CardinalEnvironment = i3 % 128;
        boolean z = i3 % 2 != 0;
        setsoundeffectsenabled.getInstance = secretKey;
        if (!z) {
            int i4 = 31 / 0;
        }
        int i5 = i + 86;
        int i6 = (i5 & -1) + (i5 | -1);
        CardinalEnvironment = i6 % 128;
        if ((i6 % 2 == 0 ? 'Q' : 'c') != 'Q') {
            return secretKey;
        }
        throw null;
    }

    private static /* synthetic */ char[] getInstance(setSoundEffectsEnabled setsoundeffectsenabled) {
        int i = CardinalError;
        int i2 = i & 49;
        int i3 = i2 + ((i ^ 49) | i2);
        int i4 = i3 % 128;
        CardinalEnvironment = i4;
        int i5 = i3 % 2;
        char[] cArr = setsoundeffectsenabled.getWarnings;
        int i6 = (i4 ^ 39) + ((i4 & 39) << 1);
        CardinalError = i6 % 128;
        int i7 = i6 % 2;
        return cArr;
    }

    private static /* synthetic */ setAccessibilityLiveRegion getSDKVersion(setSoundEffectsEnabled setsoundeffectsenabled) {
        int i = CardinalEnvironment;
        int i2 = i & 39;
        int i3 = i | 39;
        int i4 = (i2 & i3) + (i2 | i3);
        CardinalError = i4 % 128;
        int i5 = i4 % 2;
        setAccessibilityLiveRegion setaccessibilityliveregion = setsoundeffectsenabled.onValidated;
        int i6 = i & 77;
        int i7 = (i | 77) & (~i6);
        int i8 = i6 << 1;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        CardinalError = i9 % 128;
        if ((i9 % 2 != 0 ? 'C' : '`') == '`') {
            return setaccessibilityliveregion;
        }
        int i10 = 68 / 0;
        return setaccessibilityliveregion;
    }

    private static /* synthetic */ setAccessibilityLiveRegion init(setSoundEffectsEnabled setsoundeffectsenabled, setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = CardinalError;
        int i2 = i & 37;
        int i3 = -(-(i | 37));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        CardinalEnvironment = i4 % 128;
        char c = 'N';
        boolean z = i4 % 2 == 0 ? true : true;
        Throwable th = null;
        setsoundeffectsenabled.onValidated = setaccessibilityliveregion;
        if (z) {
            int i5 = (i ^ 65) + ((i & 65) << 1);
            CardinalEnvironment = i5 % 128;
            if (i5 % 2 == 0) {
                c = '+';
            }
            if (c != '+') {
                return setaccessibilityliveregion;
            }
            throw th;
        }
        super.hashCode();
        throw th;
    }

    private static /* synthetic */ char[] init(setSoundEffectsEnabled setsoundeffectsenabled) {
        int i = CardinalEnvironment + 67;
        CardinalError = i % 128;
        boolean z = i % 2 == 0;
        char[] cArr = setsoundeffectsenabled.init;
        if (z) {
            return cArr;
        }
        throw null;
    }

    public setSoundEffectsEnabled(setEnabled setenabled, ChallengeParameters challengeParameters, setFocusable setfocusable) throws JSONException {
        setWillNotDraw instance = setWillNotDraw.getInstance();
        this.values = instance;
        setAutofillHints.getInstance();
        setAutofillHints init2 = setAutofillHints.init();
        this.cca_continue = init2;
        init2.cca_continue(setfocusable.cca_continue());
        KeyPair warnings = setfocusable.getWarnings();
        this.cleanup = setHorizontalScrollBarEnabled.configure(setfocusable.onCReqSuccess());
        this.getWarnings = setHorizontalScrollBarEnabled.configure(challengeParameters.getAcsTransactionID());
        this.onCReqSuccess = setHorizontalScrollBarEnabled.configure(challengeParameters.get3DSServerTransactionID());
        this.Cardinal = setenabled;
        try {
            getActionCode getactioncode = new getActionCode(challengeParameters, setfocusable);
            this.init = setHorizontalScrollBarEnabled.configure(getactioncode.init());
            this.cca_continue.init = getactioncode;
            if (challengeParameters.getThreeDSRequestorAppURL() != null) {
                this.cca_continue.configure(setHorizontalScrollBarEnabled.configure(challengeParameters.getThreeDSRequestorAppURL()));
            }
            this.onValidated = new setAccessibilityLiveRegion(setHorizontalScrollBarEnabled.configure(challengeParameters.get3DSServerTransactionID()), setHorizontalScrollBarEnabled.configure(challengeParameters.getAcsTransactionID()), this.cca_continue.getInstance, setHorizontalScrollBarEnabled.configure(setfocusable.onCReqSuccess()), setfocusable.cca_continue(), setHorizontalScrollBarEnabled.configure(challengeParameters.getThreeDSRequestorAppURL()));
            SecretKey configure2 = setAllowClickWhenDisabled.configure(getactioncode.configure(), warnings, setfocusable.cleanup());
            this.getInstance = configure2;
            this.cca_continue.cca_continue = configure2;
            this.configure = cca_continue(this.onValidated.getString());
            this.getSDKVersion = this.onValidated.getInstance();
            super.cca_continue(new String(this.init), this.configure);
            instance.Cardinal("EMVCoTransaction", ThreeDSStrings.CHALLENGE_TASK_ENCRYPTED_CREQ_CREATED);
            getWarnings();
        } catch (SDKRuntimeException e) {
            this.values.getInstance(new EMVCoError(EMVCoError.DO_CHALLENGE_INVALID_ACS_SIGNED_CONTENT_CODE, new StringBuilder(EMVCoError.CHALLENGE_TASK_INVALID_ACS_SIGNED_CONTENT_MESSAGE).append(e.getLocalizedMessage()).toString()));
            throw e;
        } catch (JSONException e2) {
            this.values.getInstance(new EMVCoError(EMVCoError.DO_CHALLENGE_INVALID_CREQ_CODE, new StringBuilder(EMVCoError.CHALLENGE_TASK_INVALID_CRES_MESSAGE).append(e2.getLocalizedMessage()).toString()));
            throw e2;
        } catch (Throwable th) {
            getWarnings();
            throw th;
        }
    }

    public setSoundEffectsEnabled(setEnabled setenabled, setAccessibilityLiveRegion setaccessibilityliveregion) throws JSONException {
        this.cca_continue = setAutofillHints.init();
        this.values = setWillNotDraw.getInstance();
        this.onValidated = setaccessibilityliveregion;
        if (this.cca_continue.configure() != null) {
            this.onValidated.cca_continue(this.cca_continue.configure());
        }
        this.Cardinal = setenabled;
        this.onCReqSuccess = this.cca_continue.Cardinal().Cardinal();
        this.cleanup = setaccessibilityliveregion.onValidated();
        this.getWarnings = setaccessibilityliveregion.init();
        if (setaccessibilityliveregion.valueOf().cca_continue()) {
            this.onValidated = setaccessibilityliveregion;
            if (this.cca_continue.configure() != null) {
                this.onValidated.cca_continue(this.cca_continue.configure());
            }
            setaccessibilityliveregion.Cardinal(this.cca_continue.getInstance);
            this.init = setHorizontalScrollBarEnabled.configure(this.cca_continue.init.init());
            this.getInstance = this.cca_continue.cca_continue;
            this.configure = cca_continue(setaccessibilityliveregion.CardinalActionCode());
            this.getSDKVersion = setaccessibilityliveregion.getInstance();
            super.cca_continue(new String(this.init), this.configure);
        } else {
            configure(setaccessibilityliveregion);
        }
        getWarnings();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if ((java.util.Arrays.equals(r5.getSDKVersion, com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR)) != true) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getInstance() {
        /*
            r5 = this;
            int r0 = CardinalEnvironment
            r1 = r0 & 57
            r0 = r0 | 57
            int r1 = r1 + r0
            int r0 = r1 % 128
            CardinalError = r0
            int r1 = r1 % 2
            r0 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 == 0) goto L_0x0097
            super.getInstance()
            char[] r1 = r5.getSDKVersion
            boolean r1 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.Cardinal((char[]) r1)
            r3 = 92
            if (r1 != 0) goto L_0x0025
            r1 = r3
            goto L_0x0027
        L_0x0025:
            r1 = 67
        L_0x0027:
            if (r1 == r3) goto L_0x002a
            goto L_0x007e
        L_0x002a:
            int r1 = CardinalError
            r3 = r1 ^ 6
            r1 = r1 & 6
            int r1 = r1 << r2
            int r3 = r3 + r1
            int r3 = r3 - r2
            int r1 = r3 % 128
            CardinalEnvironment = r1
            int r3 = r3 % 2
            char[] r1 = r5.getSDKVersion
            char[] r3 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR
            boolean r1 = java.util.Arrays.equals(r1, r3)
            r3 = 83
            if (r1 != 0) goto L_0x0048
            r1 = 33
            goto L_0x0049
        L_0x0048:
            r1 = r3
        L_0x0049:
            if (r1 == r3) goto L_0x006a
            int r1 = CardinalEnvironment
            r3 = r1 ^ 28
            r1 = r1 & 28
            int r1 = r1 << r2
            int r3 = r3 + r1
            int r3 = r3 - r2
            int r1 = r3 % 128
            CardinalError = r1
            int r3 = r3 % 2
            char[] r1 = r5.getSDKVersion
            char[] r3 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L_0x0066
            r1 = r2
            goto L_0x0067
        L_0x0066:
            r1 = r0
        L_0x0067:
            if (r1 == r2) goto L_0x006a
            goto L_0x007e
        L_0x006a:
            r5.onValidated()
            int r1 = CardinalEnvironment
            r3 = r1 & 57
            r1 = r1 ^ 57
            r1 = r1 | r3
            r4 = r3 & r1
            r1 = r1 | r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            CardinalError = r1
            int r4 = r4 % 2
        L_0x007e:
            int r1 = CardinalError
            int r1 = r1 + 42
            int r1 = r1 - r2
            int r3 = r1 % 128
            CardinalEnvironment = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x008d
            r1 = r2
            goto L_0x008e
        L_0x008d:
            r1 = r0
        L_0x008e:
            if (r1 == r2) goto L_0x0091
            return
        L_0x0091:
            r1 = 74
            int r1 = r1 / r0
            return
        L_0x0095:
            r0 = move-exception
            throw r0
        L_0x0097:
            super.getInstance()
            char[] r0 = r5.getSDKVersion
            com.cardinalcommerce.a.setHorizontalScrollBarEnabled.Cardinal((char[]) r0)
            r0 = 0
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setSoundEffectsEnabled.getInstance():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if ((!java.util.Arrays.equals(r7.getSDKVersion, com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR) ? 'T' : 'V') != 'V') goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getInstance(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Challenge Task finished"
            java.lang.String r1 = "EMVCoTransaction"
            int r2 = CardinalEnvironment
            r3 = r2 & 43
            r2 = r2 | 43
            int r2 = -r2
            int r2 = -r2
            r4 = r3 & r2
            r2 = r2 | r3
            int r4 = r4 + r2
            int r2 = r4 % 128
            CardinalError = r2
            int r4 = r4 % 2
            char[] r2 = r7.getSDKVersion
            boolean r2 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.Cardinal((char[]) r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0022
            r2 = r4
            goto L_0x0023
        L_0x0022:
            r2 = r3
        L_0x0023:
            r5 = 0
            if (r2 == r4) goto L_0x0027
            goto L_0x005a
        L_0x0027:
            int r2 = CardinalEnvironment
            int r2 = r2 + 11
            int r6 = r2 % 128
            CardinalError = r6
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x0035
            r2 = r4
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            if (r2 == r4) goto L_0x012f
            char[] r2 = r7.getSDKVersion
            char[] r6 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR
            boolean r2 = java.util.Arrays.equals(r2, r6)
            if (r2 == 0) goto L_0x0044
            r2 = r4
            goto L_0x0045
        L_0x0044:
            r2 = r3
        L_0x0045:
            if (r2 == 0) goto L_0x0073
            char[] r2 = r7.getSDKVersion
            char[] r6 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR
            boolean r2 = java.util.Arrays.equals(r2, r6)
            r6 = 86
            if (r2 != 0) goto L_0x0056
            r2 = 84
            goto L_0x0057
        L_0x0056:
            r2 = r6
        L_0x0057:
            if (r2 == r6) goto L_0x005a
            goto L_0x0073
        L_0x005a:
            int r8 = CardinalError
            int r8 = r8 + 13
            int r8 = r8 - r4
            int r8 = r8 - r4
            int r0 = r8 % 128
            CardinalEnvironment = r0
            int r8 = r8 % 2
            r0 = 62
            if (r8 != 0) goto L_0x006c
            r8 = r0
            goto L_0x006d
        L_0x006c:
            r8 = 5
        L_0x006d:
            if (r8 == r0) goto L_0x0070
            return
        L_0x0070:
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r8 = move-exception
            throw r8
        L_0x0073:
            r2 = 12101(0x2f45, float:1.6957E-41)
            boolean r5 = r8.isEmpty()     // Catch:{ JOSEException -> 0x0102, ParseException -> 0x0100, JSONException -> 0x00d4 }
            if (r5 == 0) goto L_0x007c
            r3 = r4
        L_0x007c:
            if (r3 == 0) goto L_0x00a2
            int r8 = CardinalError
            r3 = r8 & 11
            int r5 = ~r3
            r8 = r8 | 11
            r8 = r8 & r5
            int r3 = r3 << r4
            int r8 = r8 + r3
            int r3 = r8 % 128
            CardinalEnvironment = r3
            int r8 = r8 % 2
            java.lang.String r8 = "Message is not CRes"
            r7.init((java.lang.String) r8)     // Catch:{ JOSEException -> 0x0102, ParseException -> 0x0100, JSONException -> 0x00d4 }
            int r8 = CardinalError
            r2 = r8 & 81
            r8 = r8 ^ 81
            r8 = r8 | r2
            int r2 = r2 + r8
            int r8 = r2 % 128
            CardinalEnvironment = r8
            int r2 = r2 % 2
            goto L_0x00bb
        L_0x00a2:
            r7.cca_continue((java.lang.String) r8)     // Catch:{ JOSEException -> 0x0102, ParseException -> 0x0100, JSONException -> 0x00d4 }
            int r8 = CardinalEnvironment
            r2 = r8 & 121(0x79, float:1.7E-43)
            int r3 = ~r2
            r8 = r8 | 121(0x79, float:1.7E-43)
            r8 = r8 & r3
            int r2 = r2 << r4
            int r2 = -r2
            int r2 = -r2
            r3 = r8 | r2
            int r3 = r3 << r4
            r8 = r8 ^ r2
            int r3 = r3 - r8
            int r8 = r3 % 128
            CardinalError = r8
            int r3 = r3 % 2
        L_0x00bb:
            com.cardinalcommerce.a.setWillNotDraw r8 = r7.values
            r8.Cardinal(r1, r0)
            r7.getWarnings()
            int r8 = CardinalEnvironment
            r0 = r8 | 109(0x6d, float:1.53E-43)
            int r0 = r0 << r4
            r8 = r8 ^ 109(0x6d, float:1.53E-43)
            int r0 = r0 - r8
            int r8 = r0 % 128
            CardinalError = r8
            int r0 = r0 % 2
            return
        L_0x00d2:
            r8 = move-exception
            goto L_0x0126
        L_0x00d4:
            r8 = move-exception
            com.cardinalcommerce.a.setWillNotDraw r3 = r7.values     // Catch:{ all -> 0x00d2 }
            com.cardinalcommerce.emvco.utils.EMVCoError r4 = new com.cardinalcommerce.emvco.utils.EMVCoError     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = "Error 101 Created: Response is in invalid format"
            r5.<init>(r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r8.getLocalizedMessage()     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r8 = r5.append(r8)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00d2 }
            r4.<init>(r2, r8)     // Catch:{ all -> 0x00d2 }
            r3.getInstance(r4)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "Invalid Formatted Message"
            r7.init((java.lang.String) r8)     // Catch:{ all -> 0x00d2 }
        L_0x00f7:
            com.cardinalcommerce.a.setWillNotDraw r8 = r7.values
            r8.Cardinal(r1, r0)
            r7.getWarnings()
            return
        L_0x0100:
            r8 = move-exception
            goto L_0x0103
        L_0x0102:
            r8 = move-exception
        L_0x0103:
            com.cardinalcommerce.a.setWillNotDraw r3 = r7.values     // Catch:{ all -> 0x00d2 }
            com.cardinalcommerce.emvco.utils.EMVCoError r4 = new com.cardinalcommerce.emvco.utils.EMVCoError     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = "Error 101 Created: Error Decrypting response"
            r5.<init>(r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r8.getLocalizedMessage()     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r8 = r5.append(r8)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00d2 }
            r4.<init>(r2, r8)     // Catch:{ all -> 0x00d2 }
            r3.getInstance(r4)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "Invalid Message from the ACS"
            r7.init((java.lang.String) r8)     // Catch:{ all -> 0x00d2 }
            goto L_0x00f7
        L_0x0126:
            com.cardinalcommerce.a.setWillNotDraw r2 = r7.values
            r2.Cardinal(r1, r0)
            r7.getWarnings()
            throw r8
        L_0x012f:
            char[] r8 = r7.getSDKVersion
            char[] r0 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR
            java.util.Arrays.equals(r8, r0)
            super.hashCode()     // Catch:{ all -> 0x013a }
            throw r5     // Catch:{ all -> 0x013a }
        L_0x013a:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setSoundEffectsEnabled.getInstance(java.lang.String):void");
    }

    public final void configure(String str, int i) {
        int i2 = CardinalEnvironment;
        int i3 = (i2 ^ 117) + ((i2 & 117) << 1);
        CardinalError = i3 % 128;
        if (!(i3 % 2 != 0)) {
            this.values.cca_continue(String.valueOf(i), str);
            super.configure(str, i);
            configure(ThreeDSStrings.MESSAGE_DETAIL_ACS_NOT_REACHABLE);
            this.values.Cardinal("EMVCoTransaction", ThreeDSStrings.CHALLENGE_TASK_ENDED);
            getWarnings();
            return;
        }
        this.values.cca_continue(String.valueOf(i), str);
        super.configure(str, i);
        configure(ThreeDSStrings.MESSAGE_DETAIL_ACS_NOT_REACHABLE);
        this.values.Cardinal("EMVCoTransaction", ThreeDSStrings.CHALLENGE_TASK_ENDED);
        getWarnings();
        throw null;
    }

    /* renamed from: com.cardinalcommerce.a.setSoundEffectsEnabled$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        private static int Cardinal = 1;
        static final /* synthetic */ int[] configure;
        private static int getInstance;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|(1:17)|(1:19)(4:20|21|22|23)) */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0057 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0025 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0040 */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0090 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
        static {
            /*
                com.cardinalcommerce.a.setContextClickable[] r0 = com.cardinalcommerce.a.setContextClickable.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                configure = r0
                r1 = 1
                r2 = 2
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0025 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r0 = getInstance
                r3 = r0 & 7
                r0 = r0 ^ 7
                r0 = r0 | r3
                int r0 = -r0
                int r0 = -r0
                r4 = r3 & r0
                r0 = r0 | r3
                int r4 = r4 + r0
                int r0 = r4 % 128
                Cardinal = r0
                int r4 = r4 % r2
            L_0x0025:
                int[] r0 = configure     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.IO_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r0 = Cardinal
                r3 = r0 & 115(0x73, float:1.61E-43)
                r0 = r0 ^ 115(0x73, float:1.61E-43)
                r0 = r0 | r3
                r4 = r3 | r0
                int r4 = r4 << r1
                r0 = r0 ^ r3
                int r4 = r4 - r0
                int r0 = r4 % 128
                getInstance = r0
                int r4 = r4 % r2
            L_0x0040:
                int[] r0 = configure     // Catch:{ NoSuchFieldError -> 0x0057 }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.PROTOCOL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0057 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0057 }
                int r0 = getInstance
                r3 = r0 & 65
                r0 = r0 | 65
                int r3 = r3 + r0
                int r0 = r3 % 128
                Cardinal = r0
                int r3 = r3 % r2
            L_0x0057:
                int[] r0 = configure     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.MALFORMED_URL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r4 = 4
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r0 = Cardinal
                r3 = r0 & 19
                r0 = r0 ^ 19
                r0 = r0 | r3
                r4 = r3 | r0
                int r4 = r4 << r1
                r0 = r0 ^ r3
                int r4 = r4 - r0
                int r0 = r4 % 128
                getInstance = r0
                int r4 = r4 % r2
            L_0x0073:
                int[] r0 = configure     // Catch:{ NoSuchFieldError -> 0x0098 }
                com.cardinalcommerce.a.setContextClickable r3 = com.cardinalcommerce.a.setContextClickable.SOCKET_TIMEOUT_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r4 = 5
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r0 = Cardinal
                r3 = r0 ^ 41
                r0 = r0 & 41
                int r0 = r0 << r1
                int r3 = r3 + r0
                int r0 = r3 % 128
                getInstance = r0
                int r3 = r3 % r2
                if (r3 == 0) goto L_0x008e
                r1 = 0
            L_0x008e:
                if (r1 == 0) goto L_0x0091
                return
            L_0x0091:
                r0 = 0
                super.hashCode()     // Catch:{ all -> 0x0096 }
                throw r0     // Catch:{ all -> 0x0096 }
            L_0x0096:
                r0 = move-exception
                throw r0
            L_0x0098:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setSoundEffectsEnabled.AnonymousClass4.<clinit>():void");
        }
    }

    public final void cca_continue(Exception exc, setContextClickable setcontextclickable) {
        int i;
        int i2 = CardinalEnvironment;
        int i3 = i2 & 31;
        int i4 = (i2 ^ 31) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        CardinalError = i5 % 128;
        if (i5 % 2 == 0) {
            super.cca_continue(exc, setcontextclickable);
            int i6 = AnonymousClass4.configure[setcontextclickable.ordinal()];
            if (i6 == 1 || i6 == 2) {
                this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_101_ERROR, new StringBuilder(EMVCoError.CHALLENGE_TASK_101_MESSAGE_NOT_CRES).append(exc.getLocalizedMessage()).toString()));
                configure(ThreeDSStrings.MESSAGE_DETAIL_INVALID_MESSAGE);
                int i7 = CardinalError;
                i = ((i7 & 95) - (~(i7 | 95))) - 1;
                CardinalEnvironment = i % 128;
            } else {
                if (i6 == 3 || i6 == 4 || i6 == 5) {
                    getSDKVersion();
                    int i8 = CardinalEnvironment + 56;
                    i = (i8 ^ -1) + ((i8 & -1) << 1);
                    CardinalError = i % 128;
                }
                this.values.Cardinal("EMVCoTransaction", ThreeDSStrings.CHALLENGE_TASK_ENDED);
                getWarnings();
                int i9 = CardinalEnvironment;
                int i10 = i9 ^ 99;
                int i11 = ((((i9 & 99) | i10) << 1) - (~(-i10))) - 1;
                CardinalError = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            int i13 = i % 2;
            this.values.Cardinal("EMVCoTransaction", ThreeDSStrings.CHALLENGE_TASK_ENDED);
            getWarnings();
            int i92 = CardinalEnvironment;
            int i102 = i92 ^ 99;
            int i112 = ((((i92 & 99) | i102) << 1) - (~(-i102))) - 1;
            CardinalError = i112 % 128;
            int i122 = i112 % 2;
            return;
        }
        super.cca_continue(exc, setcontextclickable);
        int i14 = AnonymousClass4.configure[setcontextclickable.ordinal()];
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if ((r5.onValidated != null ? '%' : 6) != 6) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r3 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getWarnings() {
        /*
            r5 = this;
            int r0 = CardinalEnvironment
            r1 = r0 & -22
            int r2 = ~r0
            r2 = r2 & 21
            r1 = r1 | r2
            r0 = r0 & 21
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            CardinalError = r0
            int r1 = r1 % 2
            r0 = 83
            if (r1 == 0) goto L_0x0019
            r1 = r0
            goto L_0x001b
        L_0x0019:
            r1 = 60
        L_0x001b:
            r3 = 0
            if (r1 == r0) goto L_0x0026
            com.cardinalcommerce.a.setAccessibilityLiveRegion r0 = r5.onValidated
            if (r0 == 0) goto L_0x0023
            r3 = r2
        L_0x0023:
            if (r3 == 0) goto L_0x004e
            goto L_0x0033
        L_0x0026:
            com.cardinalcommerce.a.setAccessibilityLiveRegion r0 = r5.onValidated
            r1 = 3
            int r1 = r1 / r3
            r1 = 6
            if (r0 == 0) goto L_0x0030
            r0 = 37
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            if (r0 == r1) goto L_0x004e
        L_0x0033:
            com.cardinalcommerce.a.setAccessibilityLiveRegion r0 = r5.onValidated
            r0.CardinalUiType()
            int r0 = CardinalEnvironment
            r1 = r0 ^ 13
            r3 = r0 & 13
            r1 = r1 | r3
            int r1 = r1 << r2
            r3 = r0 & -14
            int r0 = ~r0
            r4 = 13
            r0 = r0 & r4
            r0 = r0 | r3
            int r1 = r1 - r0
            int r0 = r1 % 128
            CardinalError = r0
            int r1 = r1 % 2
        L_0x004e:
            int r0 = CardinalError
            r1 = r0 & 53
            r0 = r0 ^ 53
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r0 = r1 % 128
            CardinalEnvironment = r0
            int r1 = r1 % 2
            return
        L_0x0061:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setSoundEffectsEnabled.getWarnings():void");
    }

    private void cca_continue(String str) throws ParseException, JOSEException, JSONException {
        int i = (CardinalError + 12) - 1;
        CardinalEnvironment = i % 128;
        int i2 = i % 2;
        if (!Cardinal(str)) {
            init(new setTransitionVisibility(Cardinal(str, this.getInstance)));
            int i3 = CardinalEnvironment;
            int i4 = ((i3 ^ 61) | (i3 & 61)) << 1;
            int i5 = -(((~i3) & 61) | (i3 & -62));
            int i6 = (i4 & i5) + (i5 | i4);
            CardinalError = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        configure(new JSONObject(str));
        int i8 = CardinalEnvironment + 46;
        int i9 = (i8 ^ -1) + ((i8 & -1) << 1);
        CardinalError = i9 % 128;
        if ((i9 % 2 != 0 ? '0' : 15) == '0') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    private static boolean Cardinal(String str) {
        int i = CardinalEnvironment + 104;
        boolean z = true;
        int i2 = ((i | -1) << 1) - (i ^ -1);
        CardinalError = i2 % 128;
        boolean z2 = i2 % 2 == 0;
        Throwable th = null;
        String replaceAll = str.replaceAll("[\\s|\\u00A0]+", "");
        if (z2) {
            boolean contains = replaceAll.contains("\"messageType\":\"Erro\"");
            int i3 = CardinalError;
            int i4 = i3 & 33;
            int i5 = i4 + ((i3 ^ 33) | i4);
            CardinalEnvironment = i5 % 128;
            if (i5 % 2 != 0) {
                z = false;
            }
            if (!z) {
                return contains;
            }
            super.hashCode();
            throw th;
        }
        replaceAll.contains("\"messageType\":\"Erro\"");
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0.isEmpty() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        r5.values.getInstance(new com.cardinalcommerce.emvco.utils.EMVCoError(com.cardinalcommerce.emvco.utils.EMVCoError.CHALLENGE_TASK_CREATE_101_ERROR, com.cardinalcommerce.emvco.utils.EMVCoError.CHALLENGE_TASK_101_MESSAGE_NOT_CRES_MESSAGE));
        configure("Message is not CRes ".concat(java.lang.String.valueOf(r6.optString("errorDescription", "Challenge Decrypted CardinalError"))));
        r6 = CardinalEnvironment;
        r0 = r6 & 89;
        r0 = r0 + ((r6 ^ 89) | r0);
        CardinalError = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r0.isEmpty() == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void configure(org.json.JSONObject r6) {
        /*
            r5 = this;
            int r0 = CardinalError
            r1 = r0 & -10
            int r2 = ~r0
            r3 = 9
            r2 = r2 & r3
            r1 = r1 | r2
            r0 = r0 & r3
            int r0 = r0 << 1
            int r1 = r1 + r0
            int r0 = r1 % 128
            CardinalEnvironment = r0
            int r1 = r1 % 2
            r0 = 91
            if (r1 != 0) goto L_0x0019
            r1 = r0
            goto L_0x001b
        L_0x0019:
            r1 = 83
        L_0x001b:
            java.lang.String r2 = "errorDescription"
            java.lang.String r3 = "errorCode"
            java.lang.String r4 = ""
            if (r1 == r0) goto L_0x002e
            java.lang.String r0 = r6.optString(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x007e
            goto L_0x003c
        L_0x002e:
            java.lang.String r0 = r6.optString(r3, r4)
            boolean r1 = r0.isEmpty()
            r3 = 92
            int r3 = r3 / 0
            if (r1 != 0) goto L_0x007e
        L_0x003c:
            java.lang.String r1 = r6.optString(r2, r4)
            java.lang.String r2 = "errorDetail"
            java.lang.String r6 = r6.optString(r2, r4)
            com.cardinalcommerce.a.setVerticalScrollBarEnabled r2 = new com.cardinalcommerce.a.setVerticalScrollBarEnabled
            java.lang.String r3 = new java.lang.String
            com.cardinalcommerce.a.setAutofillHints r4 = r5.cca_continue
            char[] r4 = r4.cca_continue()
            r3.<init>(r4)
            r2.<init>((java.lang.String) r3)
            r2.Cardinal(r0)
            r2.cca_continue((java.lang.String) r1)
            r2.getInstance(r6)
            com.cardinalcommerce.shared.models.ErrorMessage r6 = configure((com.cardinalcommerce.a.setVerticalScrollBarEnabled) r2)
            r5.init((com.cardinalcommerce.shared.models.ErrorMessage) r6)
            int r6 = CardinalError
            r0 = 11
            int r6 = r6 + r0
            int r1 = r6 % 128
            CardinalEnvironment = r1
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0076
            r6 = 54
            goto L_0x0077
        L_0x0076:
            r6 = r0
        L_0x0077:
            if (r6 != r0) goto L_0x007a
            return
        L_0x007a:
            r6 = 0
            throw r6     // Catch:{ all -> 0x007c }
        L_0x007c:
            r6 = move-exception
            throw r6
        L_0x007e:
            com.cardinalcommerce.a.setWillNotDraw r0 = r5.values
            com.cardinalcommerce.emvco.utils.EMVCoError r1 = new com.cardinalcommerce.emvco.utils.EMVCoError
            r3 = 12101(0x2f45, float:1.6957E-41)
            java.lang.String r4 = "Error 101 Created: Message is not CRes - Challenge Decrypted CardinalError"
            r1.<init>(r3, r4)
            r0.getInstance(r1)
            java.lang.String r0 = "Challenge Decrypted CardinalError"
            java.lang.String r6 = r6.optString(r2, r0)
            java.lang.String r0 = "Message is not CRes "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r0.concat(r6)
            r5.configure((java.lang.String) r6)
            int r6 = CardinalEnvironment
            r0 = r6 & 89
            r6 = r6 ^ 89
            r6 = r6 | r0
            int r0 = r0 + r6
            int r6 = r0 % 128
            CardinalError = r6
            int r0 = r0 % 2
            return
        L_0x00ae:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setSoundEffectsEnabled.configure(org.json.JSONObject):void");
    }

    private void init(setTransitionVisibility settransitionvisibility) {
        int i = CardinalError;
        boolean z = true;
        int i2 = ((((i | 102) << 1) - (i ^ 102)) - 0) - 1;
        CardinalEnvironment = i2 % 128;
        Throwable th = null;
        if ((i2 % 2 == 0 ? 9 : '=') == '=') {
            char c = ')';
            if (!settransitionvisibility.CardinalUiType().equals(ThreeDSStrings.MESSAGE_TYPE_CRES)) {
                this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_101_ERROR, EMVCoError.CHALLENGE_TASK_101_ERROR_MESSAGE));
                init(ThreeDSStrings.MESSAGE_DESCRIPTION_INVALID_MESSAGE);
                int i3 = CardinalError;
                int i4 = i3 & 41;
                int i5 = (i3 ^ 41) | i4;
                int i6 = (i4 & i5) + (i5 | i4);
                CardinalEnvironment = i6 % 128;
                if ((i6 % 2 == 0 ? (char) 12 : 14) != 14) {
                    super.hashCode();
                    throw th;
                }
            } else if (!setHapticFeedbackEnabled.configure(settransitionvisibility).cca_continue()) {
                this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_201_ERROR, EMVCoError.CHALLENGE_TASK_201_ERROR_MESSAGE));
                init(settransitionvisibility, setHapticFeedbackEnabled.configure(settransitionvisibility));
                int i7 = CardinalEnvironment + 118;
                int i8 = (i7 & -1) + (i7 | -1);
                CardinalError = i8 % 128;
                int i9 = i8 % 2;
            } else if (!ThreeDSStrings.supportedMessageVersions.contains(settransitionvisibility.CardinalChallengeObserver())) {
                this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_102_ERROR, EMVCoError.CHALLENGE_TASK_102_ERROR_MESSAGE));
                Cardinal(settransitionvisibility);
                int i10 = CardinalError;
                int i11 = ((i10 | 53) << 1) - (i10 ^ 53);
                CardinalEnvironment = i11 % 128;
                int i12 = i11 % 2;
            } else if (settransitionvisibility.init) {
                this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_202_ERROR, EMVCoError.CHALLENGE_TASK_202_ERROR_MESSAGE));
                cca_continue(settransitionvisibility);
                int i13 = CardinalError;
                int i14 = ((i13 & 31) - (~(i13 | 31))) - 1;
                CardinalEnvironment = i14 % 128;
                int i15 = i14 % 2;
            } else {
                if (!settransitionvisibility.getInstance.cca_continue()) {
                    int i16 = CardinalError;
                    int i17 = i16 ^ 29;
                    int i18 = ((i16 & 29) | i17) << 1;
                    int i19 = -i17;
                    int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                    CardinalEnvironment = i20 % 128;
                    if ((i20 % 2 == 0 ? 'D' : 'P') != 'D') {
                        configure(settransitionvisibility, settransitionvisibility.getInstance);
                        int i21 = CardinalError;
                        int i22 = (i21 & 57) + (i21 | 57);
                        CardinalEnvironment = i22 % 128;
                        int i23 = i22 % 2;
                        return;
                    }
                    configure(settransitionvisibility, settransitionvisibility.getInstance);
                    super.hashCode();
                    throw th;
                } else if (!settransitionvisibility.init().equals(new String(this.onCReqSuccess))) {
                    this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_301_ERROR, EMVCoError.CHALLENGE_TASK_301_3DS_TRANS_ID_ERROR_MESSAGE));
                    configure(settransitionvisibility, "ThreeDSServerTransID");
                    int i24 = CardinalError;
                    int i25 = (((i24 ^ 29) | (i24 & 29)) << 1) - (((~i24) & 29) | (i24 & -30));
                    CardinalEnvironment = i25 % 128;
                    int i26 = i25 % 2;
                } else if (!settransitionvisibility.Cardinal().equals(new String(this.getWarnings))) {
                    this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_301_ERROR, EMVCoError.CHALLENGE_TASK_301_ACS_TRANS_ID_ERROR_MESSAGE));
                    configure(settransitionvisibility, "AcsTransId");
                    int i27 = CardinalEnvironment;
                    int i28 = (((i27 & 50) + (i27 | 50)) - 0) - 1;
                    CardinalError = i28 % 128;
                    if (i28 % 2 == 0) {
                        z = false;
                    }
                    if (z) {
                        throw th;
                    }
                } else if (!settransitionvisibility.setChallengeTimeout().equalsIgnoreCase(new String(this.cleanup))) {
                    this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_301_ERROR, EMVCoError.CHALLENGE_TASK_301_SDK_TRANS_ID_ERROR_MESSAGE));
                    configure(settransitionvisibility, "sdkTransactionID");
                    int i29 = CardinalEnvironment + 103;
                    CardinalError = i29 % 128;
                    int i30 = i29 % 2;
                } else {
                    int parseInt = Integer.parseInt(settransitionvisibility.setProxyAddress());
                    int i31 = this.cca_continue.getInstance;
                    if (parseInt != (i31 & -1) + (i31 | -1)) {
                        this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_302_ERROR, EMVCoError.CHALLENGE_TASK_302_ERROR_MESSAGE));
                        cca_continue(settransitionvisibility, "AcsCounterAtoS");
                        int i32 = (CardinalError + 121) - 1;
                        int i33 = (i32 & -1) + (i32 | -1);
                        CardinalEnvironment = i33 % 128;
                        if (i33 % 2 != 0) {
                            c = '=';
                        }
                        if (c != '=') {
                            super.hashCode();
                            throw th;
                        }
                        return;
                    }
                    this.Cardinal.onCReqSuccess(settransitionvisibility);
                    int i34 = CardinalEnvironment;
                    int i35 = (i34 & 56) + (i34 | 56);
                    int i36 = ((i35 | -1) << 1) - (i35 ^ -1);
                    CardinalError = i36 % 128;
                    if (i36 % 2 == 0) {
                        z = false;
                    }
                    if (z) {
                        super.hashCode();
                        throw th;
                    }
                }
            }
        } else {
            settransitionvisibility.CardinalUiType().equals(ThreeDSStrings.MESSAGE_TYPE_CRES);
            throw th;
        }
    }

    private void cca_continue(setTransitionVisibility settransitionvisibility, String str) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal("302");
        setverticalscrollbarenabled.cca_continue("Data could not be decrypted by the receiving system due to technical or other reason.");
        setverticalscrollbarenabled.getInstance(str);
        setverticalscrollbarenabled.cca_continue(settransitionvisibility);
        Cardinal(setverticalscrollbarenabled);
        init(configure(setverticalscrollbarenabled));
        int i = CardinalEnvironment + 121;
        CardinalError = i % 128;
        int i2 = i % 2;
    }

    private void cca_continue(setTransitionVisibility settransitionvisibility) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal("202");
        setverticalscrollbarenabled.cca_continue("Critical message extension not recognised.");
        setverticalscrollbarenabled.getInstance(settransitionvisibility.Cardinal);
        setverticalscrollbarenabled.cca_continue(settransitionvisibility);
        Cardinal(setverticalscrollbarenabled);
        init(configure(setverticalscrollbarenabled));
        int i = CardinalEnvironment;
        int i2 = i | 89;
        int i3 = i2 << 1;
        int i4 = -((~(i & 89)) & i2);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        CardinalError = i5 % 128;
        int i6 = i5 % 2;
    }

    private void configure(setTransitionVisibility settransitionvisibility, String str) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal("301");
        setverticalscrollbarenabled.cca_continue("Transaction ID received is not valid for the receiving component.");
        setverticalscrollbarenabled.getInstance(str);
        setverticalscrollbarenabled.cca_continue(settransitionvisibility);
        Cardinal(setverticalscrollbarenabled);
        init(configure(setverticalscrollbarenabled));
        int i = CardinalError;
        int i2 = ((i ^ 106) + ((i & 106) << 1)) - 1;
        CardinalEnvironment = i2 % 128;
        int i3 = i2 % 2;
    }

    private void init(String str) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal(ThreeDSStrings.MESSAGE_CODE_INVALID_ACS_CONTENT);
        setverticalscrollbarenabled.cca_continue(str);
        setverticalscrollbarenabled.getInstance(ThreeDSStrings.MESSAGE_TYPE_CRES);
        setverticalscrollbarenabled.configure(new String(this.onCReqSuccess));
        setverticalscrollbarenabled.cleanup(new String(this.getWarnings));
        setverticalscrollbarenabled.init(new String(this.cleanup));
        Cardinal(setverticalscrollbarenabled);
        init(configure(setverticalscrollbarenabled));
        int i = CardinalError;
        int i2 = i & 41;
        int i3 = (i | 41) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        CardinalEnvironment = i5 % 128;
        int i6 = i5 % 2;
    }

    private void configure(String str) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal(ThreeDSStrings.MESSAGE_CODE_INVALID_ACS_CONTENT);
        setverticalscrollbarenabled.cca_continue(str);
        setverticalscrollbarenabled.getInstance(ThreeDSStrings.MESSAGE_TYPE_CRES);
        setverticalscrollbarenabled.configure(new String(this.onCReqSuccess));
        setverticalscrollbarenabled.cleanup(new String(this.getWarnings));
        setverticalscrollbarenabled.init(new String(this.cleanup));
        cca_continue(configure(setverticalscrollbarenabled));
        int i = CardinalEnvironment;
        int i2 = ((i ^ 33) | (i & 33)) << 1;
        int i3 = -(((~i) & 33) | (i & -34));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        CardinalError = i4 % 128;
        int i5 = i4 % 2;
    }

    private void Cardinal(setTransitionVisibility settransitionvisibility) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal("102");
        setverticalscrollbarenabled.cca_continue("Message Version Number received is not valid for the receiving component.");
        setverticalscrollbarenabled.getInstance(new String(this.cca_continue.cca_continue()));
        setverticalscrollbarenabled.cca_continue(settransitionvisibility);
        Cardinal(setverticalscrollbarenabled);
        init(configure(setverticalscrollbarenabled));
        int i = CardinalEnvironment;
        int i2 = (((i | 86) << 1) - (i ^ 86)) - 1;
        CardinalError = i2 % 128;
        int i3 = i2 % 2;
    }

    private void init(setTransitionVisibility settransitionvisibility, setScrollX setscrollx) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal(ThreeDSStrings.REQUIRED_DATA_MISSING_ERROR_CODE);
        setverticalscrollbarenabled.cca_continue("A message element required as defined in Table A.1 is missing from the message.");
        setverticalscrollbarenabled.getInstance(setscrollx.init());
        setverticalscrollbarenabled.cca_continue(settransitionvisibility);
        Cardinal(setverticalscrollbarenabled);
        init(configure(setverticalscrollbarenabled));
        int i = CardinalError;
        int i2 = (((i & -68) | ((~i) & 67)) - (~((i & 67) << 1))) - 1;
        CardinalEnvironment = i2 % 128;
        int i3 = i2 % 2;
    }

    private static ErrorMessage configure(setVerticalScrollBarEnabled setverticalscrollbarenabled) {
        ErrorMessage errorMessage = new ErrorMessage(setverticalscrollbarenabled.cca_continue(), setverticalscrollbarenabled.Cardinal(), setverticalscrollbarenabled.getInstance(), setverticalscrollbarenabled.configure());
        int i = CardinalEnvironment;
        int i2 = i & 21;
        int i3 = ((((i ^ 21) | i2) << 1) - (~(-((i | 21) & (~i2))))) - 1;
        CardinalError = i3 % 128;
        int i4 = i3 % 2;
        return errorMessage;
    }

    private void cca_continue(ErrorMessage errorMessage) {
        this.Cardinal.init(ThreeDSStrings.ERROR_TYPE_RUNTIME, new RuntimeErrorEvent(errorMessage.getErrorCode(), errorMessage.getErrorDescription()));
        int i = CardinalEnvironment;
        int i2 = ((i ^ 121) | (i & 121)) << 1;
        int i3 = -(((~i) & 121) | (i & -122));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        CardinalError = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void onValidated() {
        int i = CardinalError;
        int i2 = i & 59;
        boolean z = true;
        int i3 = ((i | 59) & (~i2)) + (i2 << 1);
        CardinalEnvironment = i3 % 128;
        if ((i3 % 2 == 0 ? 'V' : 'A') != 'V') {
            this.Cardinal.init(ThreeDSStrings.ERROR_TYPE_CANCEL, (ThreeDSEvent) null);
        } else {
            this.Cardinal.init(ThreeDSStrings.ERROR_TYPE_CANCEL, (ThreeDSEvent) null);
            int i4 = 10 / 0;
        }
        int i5 = CardinalEnvironment;
        int i6 = (i5 & 55) + (i5 | 55);
        CardinalError = i6 % 128;
        if (i6 % 2 != 0) {
            z = false;
        }
        if (!z) {
            throw null;
        }
    }

    private void init(ErrorMessage errorMessage) {
        this.Cardinal.init("ProtocolError", new ProtocolErrorEvent(new String(this.cleanup), errorMessage));
        int i = CardinalEnvironment;
        int i2 = (i & -54) | ((~i) & 53);
        int i3 = -(-((i & 53) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        CardinalError = i4 % 128;
        int i5 = i4 % 2;
    }

    private void getSDKVersion() {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal(ThreeDSStrings.TIMEOUT_ERROR_CODE);
        setverticalscrollbarenabled.cca_continue("Transaction Timed Out");
        setverticalscrollbarenabled.getInstance("For example, a slowly processing back-end system.");
        setverticalscrollbarenabled.configure(new String(this.onCReqSuccess));
        setverticalscrollbarenabled.cleanup(new String(this.getWarnings));
        setverticalscrollbarenabled.init(new String(this.cleanup));
        Cardinal(setverticalscrollbarenabled);
        cca_continue(configure(setverticalscrollbarenabled));
        int i = (CardinalEnvironment + 62) - 1;
        CardinalError = i % 128;
        if ((i % 2 != 0 ? (char) 26 : 6) != 6) {
            throw null;
        }
    }

    private void configure(setTransitionVisibility settransitionvisibility, setScrollX setscrollx) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal("203");
        setverticalscrollbarenabled.cca_continue("Data element not in the required format or value is invalid as defined in Table A.1,");
        setverticalscrollbarenabled.getInstance(setscrollx.init());
        setverticalscrollbarenabled.cca_continue(settransitionvisibility);
        Cardinal(setverticalscrollbarenabled);
        init(configure(setverticalscrollbarenabled));
        this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_203_ERROR, new StringBuilder(EMVCoError.CHALLENGE_TASK_203_ERROR_MESSAGE).append(setverticalscrollbarenabled.getInstance()).append(" - ").append(setverticalscrollbarenabled.configure()).toString()));
        int i = CardinalEnvironment;
        int i2 = ((i ^ 99) | (i & 99)) << 1;
        int i3 = -(((~i) & 99) | (i & -100));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        CardinalError = i4 % 128;
        if ((i4 % 2 != 0 ? '\\' : '[') != '[') {
            throw null;
        }
    }

    private void configure(setAccessibilityLiveRegion setaccessibilityliveregion) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this.cca_continue.cca_continue());
        setverticalscrollbarenabled.Cardinal("203");
        setverticalscrollbarenabled.cca_continue("Data element not in the required format or value is invalid as defined in Table A.1,");
        setverticalscrollbarenabled.getInstance(setaccessibilityliveregion.valueOf().init());
        setverticalscrollbarenabled.init(setaccessibilityliveregion);
        Cardinal(setverticalscrollbarenabled);
        init(configure(setverticalscrollbarenabled));
        this.values.getInstance(new EMVCoError(EMVCoError.CHALLENGE_TASK_CREATE_203_ERROR, new StringBuilder(EMVCoError.CHALLENGE_TASK_203_ERROR_MESSAGE).append(setverticalscrollbarenabled.getInstance()).append(" - ").append(setverticalscrollbarenabled.configure()).toString()));
        int i = CardinalEnvironment;
        int i2 = (i ^ 57) + ((i & 57) << 1);
        CardinalError = i2 % 128;
        int i3 = i2 % 2;
    }

    private byte[] cca_continue(JSONObject jSONObject) {
        int i = CardinalEnvironment;
        int i2 = ((((i ^ 37) | (i & 37)) << 1) - (~(-(((~i) & 37) | (i & -38))))) - 1;
        CardinalError = i2 % 128;
        boolean z = i2 % 2 != 0;
        byte[] Cardinal2 = Cardinal(jSONObject);
        if (z) {
            int i3 = 94 / 0;
        }
        return Cardinal2;
    }

    private static String Cardinal(String str, SecretKey secretKey) throws ParseException, JOSEException {
        int i = CardinalError;
        int i2 = (i & -50) | ((~i) & 49);
        int i3 = (i & 49) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        CardinalEnvironment = i4 % 128;
        int i5 = i4 % 2;
        String instance = getInstance(str, secretKey);
        int i6 = CardinalError;
        int i7 = (i6 ^ 125) + ((i6 & 125) << 1);
        CardinalEnvironment = i7 % 128;
        int i8 = i7 % 2;
        return instance;
    }

    private byte[] Cardinal(JSONObject jSONObject) {
        try {
            int i = this.cca_continue.getInstance;
            byte parseByte = Byte.parseByte(String.valueOf(i));
            JWEHeader.getInstance getinstance = new JWEHeader.getInstance(JWEAlgorithm.getWarnings, EncryptionMethod.onValidated);
            getinstance.getWarnings = (String) jSONObject.get("acsTransID");
            JWEHeader configure2 = getinstance.configure();
            jSONObject.put("sdkCounterStoA", String.format("%03d", new Object[]{Byte.valueOf(parseByte)}));
            JWEObject jWEObject = new JWEObject(configure2, new Payload(jSONObject.toString()));
            jWEObject.getInstance(new setIsHandwritingDelegate(Arrays.copyOfRange(this.getInstance.getEncoded(), 0, 16), parseByte));
            byte[] bytes = jWEObject.cca_continue().getBytes();
            int i2 = i - 24;
            int i3 = (((((i2 ^ -1) + ((i2 & -1) << 1)) + 28) - 1) - 0) - 1;
            if (i3 != 0) {
                this.cca_continue.getInstance = i3;
                int i4 = (CardinalEnvironment + 113) - 1;
                int i5 = ((i4 | -1) << 1) - (i4 ^ -1);
                CardinalError = i5 % 128;
                int i6 = i5 % 2;
                return bytes;
            }
            throw new RuntimeException("SdkCounterStoA zero");
        } catch (Exception e) {
            this.values.getInstance(new EMVCoError(EMVCoError.DO_CHALLENGE_CHALLENGE_TASK_128GCM_JWE_ENCRYPTION_ERROR, new StringBuilder(EMVCoError.CHALLENGE_TASK_JWE_ENCRYPTION_MESSAGE).append(e.getLocalizedMessage()).toString()));
            return jSONObject.toString().getBytes();
        }
    }

    private static String getInstance(String str, SecretKey secretKey) throws ParseException, JOSEException {
        int i = CardinalEnvironment;
        int i2 = i & 99;
        int i3 = i2 - (~(-(-((i ^ 99) | i2))));
        boolean z = true;
        int i4 = i3 - 1;
        CardinalError = i4 % 128;
        if (i4 % 2 == 0) {
            z = false;
        }
        String cca_continue2 = cca_continue(JWEObject.cca_continue(str), secretKey);
        if (z) {
            int i5 = 17 / 0;
        }
        int i6 = CardinalError;
        int i7 = i6 & 77;
        int i8 = i7 + ((i6 ^ 77) | i7);
        CardinalEnvironment = i8 % 128;
        int i9 = i8 % 2;
        return cca_continue2;
    }

    private static String cca_continue(JWEObject jWEObject, SecretKey secretKey) throws JOSEException {
        jWEObject.configure(new DirectDecrypter(Arrays.copyOfRange(secretKey.getEncoded(), 16, 32)));
        String obj = jWEObject.cca_continue.toString();
        int i = CardinalEnvironment;
        int i2 = (i & 51) + (i | 51);
        CardinalError = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    private void Cardinal(setVerticalScrollBarEnabled setverticalscrollbarenabled) {
        int i = CardinalError;
        int i2 = i & 91;
        int i3 = (i | 91) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        CardinalEnvironment = i5 % 128;
        if (i5 % 2 != 0) {
            char[] cArr = this.init;
            if ((cArr != null ? 'H' : 10) == 'H' && cArr.length > 0) {
                new setHasTransientState(setverticalscrollbarenabled, new String(this.init)).cca_continue();
                int i6 = CardinalError;
                int i7 = i6 | 23;
                int i8 = i7 << 1;
                int i9 = -((~(i6 & 23)) & i7);
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                CardinalEnvironment = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = CardinalEnvironment;
            int i13 = (((i12 | 124) << 1) - (i12 ^ 124)) - 1;
            CardinalError = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final void Cardinal() {
        int i = CardinalError + 11;
        CardinalEnvironment = i % 128;
        if ((i % 2 == 0 ? '3' : 28) == 28) {
            Executors.newSingleThreadExecutor().execute(this);
            int i2 = CardinalError;
            int i3 = ((i2 ^ 15) - (~(-(-((i2 & 15) << 1))))) - 1;
            CardinalEnvironment = i3 % 128;
            if (!(i3 % 2 != 0)) {
                int i4 = 74 / 0;
                return;
            }
            return;
        }
        Executors.newSingleThreadExecutor().execute(this);
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final void run() {
        int i = CardinalEnvironment;
        int i2 = i & 3;
        boolean z = true;
        int i3 = ((i | 3) & (~i2)) + (i2 << 1);
        CardinalError = i3 % 128;
        int i4 = i3 % 2;
        setHorizontalScrollBarEnabled.getInstance(init(this));
        getInstance(this, (SecretKey) null);
        cca_continue(this, (byte[]) null);
        Cardinal(this);
        setAutofillHints.getInstance();
        Cardinal(this, (setAutofillHints) null);
        setHorizontalScrollBarEnabled.getInstance(cca_continue(this));
        setHorizontalScrollBarEnabled.getInstance(configure(this));
        setHorizontalScrollBarEnabled.getInstance(getInstance(this));
        getSDKVersion(this).CardinalChallengeObserver();
        init(this, (setAccessibilityLiveRegion) null);
        setHorizontalScrollBarEnabled.getInstance(cleanup(this));
        int i5 = CardinalEnvironment;
        int i6 = ((i5 ^ 45) | (i5 & 45)) << 1;
        int i7 = -(((~i5) & 45) | (i5 & -46));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        CardinalError = i8 % 128;
        if (i8 % 2 != 0) {
            z = false;
        }
        if (!z) {
            int i9 = 85 / 0;
        }
    }
}
