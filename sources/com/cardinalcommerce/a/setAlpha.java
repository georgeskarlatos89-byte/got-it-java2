package com.cardinalcommerce.a;

import android.content.Context;
import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.emvco.events.ProtocolErrorEvent;
import com.cardinalcommerce.emvco.events.RuntimeErrorEvent;
import com.cardinalcommerce.emvco.events.ThreeDSEvent;
import com.cardinalcommerce.emvco.services.ChallengeStatusReceiver;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.objectweb.asm.signature.SignatureVisitor;

public final class setAlpha implements getSDKVersion, setEnabled {
    private static setAlpha configure = null;
    private static int getWarnings = 0;
    private static int onValidated = 1;
    private setFocusedByDefault Cardinal;
    private final WeakReference<Context> cca_continue;
    private setSoundEffectsEnabled cleanup;
    private final setTranslationY getInstance = setTranslationY.cca_continue();
    private String init;
    private CardinalError onCReqSuccess;

    private setAlpha(Context context) {
        this.cca_continue = new WeakReference<>(context.getApplicationContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r6 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        if (r6 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        throw new com.cardinalcommerce.shared.models.exceptions.InvalidInputException("InvalidInputException", new java.lang.Throwable("Caught in UIInteractionFactory getInstance(), null Context passed"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.cardinalcommerce.a.setAlpha cca_continue(android.content.Context r6) throws com.cardinalcommerce.shared.models.exceptions.InvalidInputException {
        /*
            java.lang.Class<com.cardinalcommerce.a.setAlpha> r0 = com.cardinalcommerce.a.setAlpha.class
            monitor-enter(r0)
            int r1 = getWarnings     // Catch:{ all -> 0x0098 }
            int r1 = r1 + 73
            int r2 = r1 % 128
            onValidated = r2     // Catch:{ all -> 0x0098 }
            int r1 = r1 % 2
            r3 = 24
            if (r1 != 0) goto L_0x0014
            r1 = 77
            goto L_0x0015
        L_0x0014:
            r1 = r3
        L_0x0015:
            r4 = 0
            if (r1 != r3) goto L_0x0092
            com.cardinalcommerce.a.setAlpha r1 = configure     // Catch:{ all -> 0x0098 }
            r3 = 19
            if (r1 != 0) goto L_0x0021
            r1 = 88
            goto L_0x0022
        L_0x0021:
            r1 = r3
        L_0x0022:
            r5 = 1
            if (r1 == r3) goto L_0x0073
            r1 = r2 & 55
            r2 = r2 | 55
            int r1 = r1 + r2
            int r2 = r1 % 128
            getWarnings = r2     // Catch:{ all -> 0x0098 }
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L_0x0035
            r1 = r2
            goto L_0x0036
        L_0x0035:
            r1 = r5
        L_0x0036:
            if (r1 == r5) goto L_0x0040
            r1 = 9
            int r1 = r1 / r2
            if (r6 == 0) goto L_0x0064
            goto L_0x0042
        L_0x003e:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0098 }
        L_0x0040:
            if (r6 == 0) goto L_0x0064
        L_0x0042:
            com.cardinalcommerce.a.setAlpha r1 = new com.cardinalcommerce.a.setAlpha     // Catch:{ all -> 0x0098 }
            android.content.Context r6 = r6.getApplicationContext()     // Catch:{ all -> 0x0098 }
            r1.<init>(r6)     // Catch:{ all -> 0x0098 }
            configure = r1     // Catch:{ all -> 0x0098 }
            int r6 = getWarnings     // Catch:{ all -> 0x0098 }
            r1 = r6 & 75
            int r2 = ~r1     // Catch:{ all -> 0x0098 }
            r6 = r6 | 75
            r6 = r6 & r2
            int r1 = r1 << r5
            int r1 = -r1
            int r1 = -r1
            r2 = r6 | r1
            int r2 = r2 << r5
            r6 = r6 ^ r1
            int r2 = r2 - r6
            int r6 = r2 % 128
            onValidated = r6     // Catch:{ all -> 0x0098 }
            int r2 = r2 % 2
            goto L_0x0073
        L_0x0064:
            java.lang.Throwable r6 = new java.lang.Throwable     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "Caught in UIInteractionFactory getInstance(), null Context passed"
            r6.<init>(r1)     // Catch:{ all -> 0x0098 }
            com.cardinalcommerce.shared.models.exceptions.InvalidInputException r1 = new com.cardinalcommerce.shared.models.exceptions.InvalidInputException     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "InvalidInputException"
            r1.<init>(r2, r6)     // Catch:{ all -> 0x0098 }
            throw r1     // Catch:{ all -> 0x0098 }
        L_0x0073:
            com.cardinalcommerce.a.setAlpha r6 = configure     // Catch:{ all -> 0x0098 }
            int r1 = onValidated     // Catch:{ all -> 0x0098 }
            r2 = r1 | 41
            int r2 = r2 << r5
            r1 = r1 ^ 41
            int r2 = r2 - r1
            int r1 = r2 % 128
            getWarnings = r1     // Catch:{ all -> 0x0098 }
            int r2 = r2 % 2
            r1 = 39
            if (r2 == 0) goto L_0x0089
            r2 = r1
            goto L_0x008b
        L_0x0089:
            r2 = 92
        L_0x008b:
            if (r2 == r1) goto L_0x008f
            monitor-exit(r0)
            return r6
        L_0x008f:
            throw r4     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0098 }
        L_0x0092:
            super.hashCode()     // Catch:{ all -> 0x0096 }
            throw r4     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setAlpha.cca_continue(android.content.Context):com.cardinalcommerce.a.setAlpha");
    }

    public static void Cardinal(setSaveEnabled setsaveenabled, UiCustomization uiCustomization) {
        int i = getWarnings + 59;
        onValidated = i % 128;
        int i2 = i % 2;
        setScrollBarFadeDuration.cca_continue().getInstance(setsaveenabled, uiCustomization);
        int i3 = ((getWarnings + 102) + 0) - 1;
        onValidated = i3 % 128;
        if ((i3 % 2 == 0 ? '%' : 'J') != 'J') {
            int i4 = 32 / 0;
        }
    }

    public final void Cardinal(setSaveEnabled setsaveenabled, UiCustomization uiCustomization, cleanup cleanup2, onValidated onvalidated, String str, String str2, String str3, String str4) {
        int i = onValidated;
        int i2 = i ^ 77;
        int i3 = ((i & 77) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        getWarnings = i5 % 128;
        Throwable th = null;
        if (i5 % 2 != 0 ? true : true) {
            setScrollBarFadeDuration.cca_continue().getInstance(setsaveenabled, uiCustomization, cleanup2, onvalidated, str, str2, str3, str4);
            this.getInstance.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, "UI Interaction Factory Configured", onvalidated.init());
            int i6 = getWarnings;
            int i7 = (i6 ^ 123) + ((i6 & 123) << 1);
            onValidated = i7 % 128;
            if ((i7 % 2 == 0 ? 31 : SignatureVisitor.SUPER) == 31) {
                super.hashCode();
                throw th;
            }
            return;
        }
        setScrollBarFadeDuration.cca_continue().getInstance(setsaveenabled, uiCustomization, cleanup2, onvalidated, str, str2, str3, str4);
        this.getInstance.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, "UI Interaction Factory Configured", onvalidated.init());
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0103, code lost:
        if ((java.util.Arrays.equals(r7.getInstance(), com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR) ? '3' : '`') != '`') goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cardinal(com.cardinalcommerce.a.setAccessibilityLiveRegion r7, com.cardinalcommerce.a.setFocusedByDefault r8, java.lang.String r9) {
        /*
            r6 = this;
            int r0 = getWarnings
            r1 = r0 & 47
            r0 = r0 | 47
            r2 = r1 ^ r0
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 << r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            onValidated = r0
            int r2 = r2 % 2
            r6.Cardinal = r8
            r6.init = r9
            com.cardinalcommerce.a.setScrollBarFadeDuration r9 = com.cardinalcommerce.a.setScrollBarFadeDuration.cca_continue()
            com.cardinalcommerce.a.setSaveEnabled r9 = r9.configure()
            com.cardinalcommerce.a.setSaveEnabled r0 = com.cardinalcommerce.a.setSaveEnabled.EMVCO
            r2 = 0
            r3 = 0
            if (r9 != r0) goto L_0x00a2
            com.cardinalcommerce.a.setTranslationY r8 = r6.getInstance
            java.lang.String r9 = "UI Interaction Factory sendUserResponse EMVCo"
            java.lang.String r0 = "EMVCoDoChallenge"
            r8.cca_continue(r0, r9, r3)
            com.cardinalcommerce.a.setSoundEffectsEnabled r8 = new com.cardinalcommerce.a.setSoundEffectsEnabled     // Catch:{ JSONException -> 0x0045 }
            r8.<init>(r6, r7)     // Catch:{ JSONException -> 0x0045 }
            r6.cleanup = r8     // Catch:{ JSONException -> 0x0045 }
            int r7 = onValidated
            r8 = r7 & 117(0x75, float:1.64E-43)
            int r9 = ~r8
            r7 = r7 | 117(0x75, float:1.64E-43)
            r7 = r7 & r9
            int r8 = r8 << r1
            int r7 = r7 + r8
            int r8 = r7 % 128
            getWarnings = r8
            int r7 = r7 % 2
            goto L_0x006a
        L_0x0045:
            r7 = move-exception
            com.cardinalcommerce.a.setTranslationY r8 = r6.getInstance
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "Error while creating new ChallengeTask \n"
            r9.<init>(r4)
            java.lang.String r7 = r7.getLocalizedMessage()
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "11417"
            r8.configure((java.lang.String) r9, (java.lang.String) r7, (java.lang.String) r3)
            com.cardinalcommerce.emvco.events.ThreeDSEvent r7 = new com.cardinalcommerce.emvco.events.ThreeDSEvent
            r7.<init>()
            java.lang.String r8 = ""
            r6.init((java.lang.String) r8, (com.cardinalcommerce.emvco.events.ThreeDSEvent) r7)
        L_0x006a:
            com.cardinalcommerce.a.setSoundEffectsEnabled r7 = r6.cleanup
            if (r7 == 0) goto L_0x0070
            r8 = r2
            goto L_0x0071
        L_0x0070:
            r8 = r1
        L_0x0071:
            if (r8 == 0) goto L_0x0075
            goto L_0x012d
        L_0x0075:
            int r8 = getWarnings
            r9 = r8 & 78
            r8 = r8 | 78
            int r9 = r9 + r8
            int r9 = r9 - r2
            int r9 = r9 - r1
            int r8 = r9 % 128
            onValidated = r8
            int r9 = r9 % 2
            if (r9 != 0) goto L_0x0087
            r2 = r1
        L_0x0087:
            java.lang.String r8 = "Challenge Task started 02"
            if (r2 == r1) goto L_0x0094
            r7.cca_continue()
            com.cardinalcommerce.a.setTranslationY r7 = r6.getInstance
            r7.cca_continue(r0, r8, r3)
            return
        L_0x0094:
            r7.cca_continue()
            com.cardinalcommerce.a.setTranslationY r7 = r6.getInstance
            r7.cca_continue(r0, r8, r3)
            super.hashCode()     // Catch:{ all -> 0x00a0 }
            throw r3     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r7 = move-exception
            throw r7
        L_0x00a2:
            com.cardinalcommerce.a.setTranslationY r9 = r6.getInstance
            com.cardinalcommerce.a.setScrollBarFadeDuration r0 = com.cardinalcommerce.a.setScrollBarFadeDuration.cca_continue()
            com.cardinalcommerce.a.onValidated r0 = r0.init()
            java.lang.String r0 = r0.init()
            java.lang.String r4 = "CardinalContinue"
            java.lang.String r5 = "UI Interaction Factory sendUserResponse"
            r9.cca_continue(r4, r5, r0)
            r6.getInstance(r7)
            char[] r9 = r7.getInstance()
            boolean r9 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.Cardinal((char[]) r9)
            r0 = 35
            if (r9 != 0) goto L_0x00c9
            r9 = 46
            goto L_0x00ca
        L_0x00c9:
            r9 = r0
        L_0x00ca:
            if (r9 == r0) goto L_0x012d
            int r9 = onValidated
            r0 = r9 ^ 109(0x6d, float:1.53E-43)
            r9 = r9 & 109(0x6d, float:1.53E-43)
            r9 = r9 | r0
            int r9 = r9 << r1
            int r9 = r9 - r0
            int r0 = r9 % 128
            getWarnings = r0
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x00df
            r9 = r2
            goto L_0x00e0
        L_0x00df:
            r9 = r1
        L_0x00e0:
            if (r9 == 0) goto L_0x011e
            char[] r9 = r7.getInstance()
            char[] r0 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR
            boolean r9 = java.util.Arrays.equals(r9, r0)
            if (r9 != 0) goto L_0x00ef
            r2 = r1
        L_0x00ef:
            if (r2 == 0) goto L_0x0105
            char[] r7 = r7.getInstance()
            char[] r9 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_ERROR
            boolean r7 = java.util.Arrays.equals(r7, r9)
            r9 = 96
            if (r7 == 0) goto L_0x0102
            r7 = 51
            goto L_0x0103
        L_0x0102:
            r7 = r9
        L_0x0103:
            if (r7 == r9) goto L_0x012d
        L_0x0105:
            r8.configure()
            int r7 = getWarnings
            r8 = r7 & -48
            int r9 = ~r7
            r9 = r9 & 47
            r8 = r8 | r9
            r7 = r7 & 47
            int r7 = r7 << r1
            r9 = r8 & r7
            r7 = r7 | r8
            int r9 = r9 + r7
            int r7 = r9 % 128
            onValidated = r7
            int r9 = r9 % 2
            goto L_0x012d
        L_0x011e:
            char[] r7 = r7.getInstance()
            char[] r8 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.CHALLENGE_CANCEL_CHAR
            java.util.Arrays.equals(r7, r8)
            super.hashCode()     // Catch:{ all -> 0x012b }
            throw r3     // Catch:{ all -> 0x012b }
        L_0x012b:
            r7 = move-exception
            throw r7
        L_0x012d:
            int r7 = onValidated
            r8 = r7 ^ 113(0x71, float:1.58E-43)
            r9 = r7 & 113(0x71, float:1.58E-43)
            r8 = r8 | r9
            int r8 = r8 << r1
            r9 = r7 & -114(0xffffffffffffff8e, float:NaN)
            int r7 = ~r7
            r7 = r7 & 113(0x71, float:1.58E-43)
            r7 = r7 | r9
            int r7 = -r7
            int r7 = ~r7
            int r8 = r8 - r7
            int r8 = r8 - r1
            int r7 = r8 % 128
            getWarnings = r7
            int r8 = r8 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setAlpha.Cardinal(com.cardinalcommerce.a.setAccessibilityLiveRegion, com.cardinalcommerce.a.setFocusedByDefault, java.lang.String):void");
    }

    public final void init() {
        int i = getWarnings;
        int i2 = i & 125;
        int i3 = (i ^ 125) | i2;
        int i4 = i2 ^ i3;
        int i5 = i2 & i3;
        boolean z = true;
        int i6 = i4 + (i5 << 1);
        onValidated = i6 % 128;
        int i7 = i6 % 2;
        setSoundEffectsEnabled setsoundeffectsenabled = this.cleanup;
        Throwable th = null;
        if ((setsoundeffectsenabled != null ? 25 : '\'') == 25) {
            int i8 = (i | 21) << 1;
            int i9 = -(((~i) & 21) | (i & -22));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            onValidated = i10 % 128;
            if (i10 % 2 != 0) {
                setsoundeffectsenabled.configure();
            } else {
                setsoundeffectsenabled.configure();
                super.hashCode();
                throw th;
            }
        }
        CardinalError cardinalError = this.onCReqSuccess;
        if ((cardinalError != null ? 20 : '0') != '0') {
            int i11 = ((getWarnings + 49) - 1) - 1;
            onValidated = i11 % 128;
            int i12 = i11 % 2;
            cardinalError.configure();
            int i13 = getWarnings;
            int i14 = i13 ^ 5;
            int i15 = ((i13 & 5) | i14) << 1;
            int i16 = -i14;
            int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
            onValidated = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = onValidated;
        int i20 = i19 & 95;
        int i21 = (i19 | 95) & (~i20);
        int i22 = i20 << 1;
        int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
        getWarnings = i23 % 128;
        if (i23 % 2 == 0) {
            z = false;
        }
        if (z) {
            super.hashCode();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if ((!r7.configure().equalsIgnoreCase(r6.init)) != true) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if ((r7.configure().equalsIgnoreCase(r6.init) ? true : true) != true) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCReqSuccess(com.cardinalcommerce.a.setTransitionVisibility r7) {
        /*
            r6 = this;
            int r0 = getWarnings
            r1 = r0 ^ 13
            r0 = r0 & 13
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            onValidated = r0
            int r1 = r1 % 2
            r0 = 22
            if (r1 != 0) goto L_0x0015
            r1 = r0
            goto L_0x0017
        L_0x0015:
            r1 = 19
        L_0x0017:
            r3 = 80
            r4 = 0
            r5 = 0
            if (r1 == r0) goto L_0x002f
            java.lang.String r0 = r7.configure()
            java.lang.String r1 = r6.init
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x002b
            r0 = r5
            goto L_0x002c
        L_0x002b:
            r0 = r2
        L_0x002c:
            if (r0 == r2) goto L_0x0056
            goto L_0x0045
        L_0x002f:
            java.lang.String r0 = r7.configure()
            java.lang.String r1 = r6.init
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 8
            int r1 = r1 / r5
            r1 = 4
            if (r0 == 0) goto L_0x0041
            r0 = r1
            goto L_0x0042
        L_0x0041:
            r0 = r3
        L_0x0042:
            if (r0 == r1) goto L_0x0045
            goto L_0x0056
        L_0x0045:
            java.lang.String r0 = r7.onCReqSuccess()
            java.lang.String r1 = "N"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0053
            r0 = r5
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            if (r0 == 0) goto L_0x0088
        L_0x0056:
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.cca_continue
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            com.cardinalcommerce.a.setScrollBarFadeDuration r1 = com.cardinalcommerce.a.setScrollBarFadeDuration.cca_continue()
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r1 = r1.getInstance()
            com.cardinalcommerce.shared.cs.userinterfaces.ChallengeUtils.cca_continue(r7, r0, r1)
            int r7 = onValidated
            r0 = r7 ^ 75
            r7 = r7 & 75
            int r7 = r7 << r2
            int r7 = ~r7
            int r0 = r0 - r7
            int r0 = r0 - r2
            int r7 = r0 % 128
            getWarnings = r7
            int r0 = r0 % 2
            r7 = 74
            if (r0 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r3 = r7
        L_0x007f:
            if (r3 != r7) goto L_0x0082
            return
        L_0x0082:
            super.hashCode()     // Catch:{ all -> 0x0086 }
            throw r4     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r7 = move-exception
            throw r7
        L_0x0088:
            int r0 = getWarnings
            int r0 = r0 + 10
            int r0 = r0 - r2
            int r1 = r0 % 128
            onValidated = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r5 = r2
        L_0x0097:
            com.cardinalcommerce.a.setFocusedByDefault r0 = r6.Cardinal
            r0.configure(r7)
            if (r5 == 0) goto L_0x00aa
            int r7 = getWarnings
            int r7 = r7 + 56
            int r7 = r7 - r2
            int r0 = r7 % 128
            onValidated = r0
            int r7 = r7 % 2
            return
        L_0x00aa:
            super.hashCode()     // Catch:{ all -> 0x00ae }
            throw r4     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r7 = move-exception
            throw r7
        L_0x00b0:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setAlpha.onCReqSuccess(com.cardinalcommerce.a.setTransitionVisibility):void");
    }

    public final void init(String str, ThreeDSEvent threeDSEvent) {
        int i;
        int i2 = onValidated + 81;
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        ChallengeStatusReceiver challengeStatusReceiver = setLongClickable.cca_continue;
        setLongClickable.cca_continue();
        setLongClickable.init();
        if ((Objects.equals(str, "ProtocolError") ? '%' : 'N') != '%') {
            if (!Objects.equals(str, ThreeDSStrings.ERROR_TYPE_RUNTIME)) {
                if (!(Objects.equals(str, ThreeDSStrings.ERROR_TYPE_TIMEOUT))) {
                    if ((Objects.equals(str, ThreeDSStrings.ERROR_TYPE_CANCEL) ? ';' : '\"') != '\"') {
                        int i4 = getWarnings;
                        int i5 = (i4 & 31) + (i4 | 31);
                        onValidated = i5 % 128;
                        int i6 = i5 % 2;
                        setScrollBarFadeDuration.cca_continue().configure();
                        setSaveEnabled setsaveenabled = setSaveEnabled.EMVCO;
                        challengeStatusReceiver.cancelled();
                        int i7 = onValidated;
                        i = ((((i7 | 66) << 1) - (i7 ^ 66)) - 0) - 1;
                    }
                } else {
                    int i8 = onValidated;
                    int i9 = ((i8 | 106) << 1) - (i8 ^ 106);
                    int i10 = (i9 ^ -1) + ((i9 & -1) << 1);
                    getWarnings = i10 % 128;
                    int i11 = i10 % 2;
                    challengeStatusReceiver.timedout();
                    int i12 = getWarnings;
                    int i13 = i12 & 85;
                    i = (((i12 ^ 85) | i13) << 1) - ((i12 | 85) & (~i13));
                    onValidated = i % 128;
                    int i14 = i % 2;
                }
            } else {
                int i15 = getWarnings;
                int i16 = ((i15 ^ 118) + ((i15 & 118) << 1)) - 1;
                onValidated = i16 % 128;
                int i17 = i16 % 2;
                challengeStatusReceiver.runtimeError((RuntimeErrorEvent) threeDSEvent);
                int i18 = onValidated;
                i = ((i18 & -18) | ((~i18) & 17)) + ((i18 & 17) << 1);
            }
            getWarnings = i % 128;
            int i142 = i % 2;
        } else {
            int i19 = getWarnings;
            int i20 = ((i19 | 33) << 1) - (i19 ^ 33);
            onValidated = i20 % 128;
            boolean z = i20 % 2 != 0;
            challengeStatusReceiver.protocolError((ProtocolErrorEvent) threeDSEvent);
            if (!z) {
                int i21 = 6 / 0;
            }
        }
        this.Cardinal.configure();
        int i22 = onValidated;
        int i23 = i22 ^ 93;
        int i24 = (((i22 & 93) | i23) << 1) - i23;
        getWarnings = i24 % 128;
        int i25 = i24 % 2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private void getInstance(setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = getWarnings;
        int i2 = i & 37;
        int i3 = i2 - (~((i ^ 37) | i2));
        boolean z = true;
        int i4 = i3 - 1;
        onValidated = i4 % 128;
        boolean z2 = false;
        ? r3 = 0;
        if (!(i4 % 2 == 0)) {
            if (this.cca_continue.get() != null) {
                if (setaccessibilityliveregion == null) {
                    init(new ValidateResponse(false, CardinalActionCode.ERROR, new CardinalError(CardinalError.SEND_STEPUP_DATA_STARTED_USER_INPUT_ERROR_CODE)), this.cca_continue.get());
                    int i5 = (getWarnings + 10) - 1;
                    onValidated = i5 % 128;
                    if ((i5 % 2 == 0 ? '\"' : 'T') == '\"') {
                        int i6 = 94 / 0;
                        return;
                    }
                    return;
                }
                if (setScrollBarFadeDuration.cca_continue().init() == null) {
                    init(new ValidateResponse(false, CardinalActionCode.ERROR, new CardinalError(CardinalError.SEND_STEPUP_DATA_STARTED_SESSION_ID_ERROR_CODE)), this.cca_continue.get());
                    int i7 = getWarnings;
                    int i8 = ((i7 & -22) | ((~i7) & 21)) + ((i7 & 21) << 1);
                    onValidated = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    int i10 = getWarnings;
                    int i11 = (i10 ^ 11) + ((i10 & 11) << 1);
                    onValidated = i11 % 128;
                    if (i11 % 2 == 0 ? true : true) {
                        if (!(setScrollBarFadeDuration.cca_continue().init().init() == null)) {
                            int i12 = getWarnings;
                            int i13 = (i12 & 25) + (25 | i12);
                            onValidated = i13 % 128;
                            if ((i13 % 2 == 0 ? 'Y' : 30) != 'Y') {
                                String init2 = setScrollBarFadeDuration.cca_continue().init().init();
                                this.getInstance.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, ThreeDSStrings.CARDINAL_STEPUP_EVENT.concat(String.valueOf(init2)), init2);
                                if (!(setaccessibilityliveregion.valueOf().cca_continue())) {
                                    init(new ValidateResponse(false, CardinalActionCode.ERROR, new CardinalError(CardinalError.SEND_STEPUP_DATA_INVALID_USER_INPUT_ERROR_CODE)), this.cca_continue.get());
                                    int i14 = onValidated;
                                    int i15 = i14 & 45;
                                    int i16 = (i14 ^ 45) | i15;
                                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                                    getWarnings = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        z = false;
                                    }
                                    if (!z) {
                                        super.hashCode();
                                        throw r3;
                                    }
                                    return;
                                }
                                int i18 = getWarnings;
                                int i19 = ((i18 | 3) << 1) - (((~i18) & 3) | (i18 & -4));
                                onValidated = i19 % 128;
                                if ((i19 % 2 == 0 ? 'W' : 'L') != 'W') {
                                    setaccessibilityliveregion.init(setHorizontalScrollBarEnabled.configure(setScrollBarFadeDuration.cca_continue().getSDKVersion()));
                                    setaccessibilityliveregion.Cardinal(setHorizontalScrollBarEnabled.configure(init2));
                                    setaccessibilityliveregion.getInstance(setHorizontalScrollBarEnabled.configure(setScrollBarFadeDuration.cca_continue().onCReqSuccess()));
                                    if (setScrollBarFadeDuration.cca_continue().cleanup().equals("")) {
                                        z2 = true;
                                    }
                                    if (!z2) {
                                        setaccessibilityliveregion.cca_continue(setHorizontalScrollBarEnabled.configure(setScrollBarFadeDuration.cca_continue().cleanup()));
                                        int i20 = getWarnings;
                                        int i21 = i20 & 43;
                                        int i22 = (i20 | 43) & (~i21);
                                        int i23 = -(-(i21 << 1));
                                        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                                        onValidated = i24 % 128;
                                        int i25 = i24 % 2;
                                    }
                                    CardinalError cardinalError = new CardinalError(setaccessibilityliveregion, this, setScrollBarFadeDuration.cca_continue().getWarnings());
                                    this.onCReqSuccess = cardinalError;
                                    cardinalError.cca_continue();
                                    int i26 = onValidated + 83;
                                    getWarnings = i26 % 128;
                                    if ((i26 % 2 != 0 ? 'Z' : 16) != 16) {
                                        throw r3;
                                    }
                                    return;
                                }
                                setaccessibilityliveregion.init(setHorizontalScrollBarEnabled.configure(setScrollBarFadeDuration.cca_continue().getSDKVersion()));
                                setaccessibilityliveregion.Cardinal(setHorizontalScrollBarEnabled.configure(init2));
                                setaccessibilityliveregion.getInstance(setHorizontalScrollBarEnabled.configure(setScrollBarFadeDuration.cca_continue().onCReqSuccess()));
                                setScrollBarFadeDuration.cca_continue().cleanup().equals("");
                                throw r3;
                            }
                            String init3 = setScrollBarFadeDuration.cca_continue().init().init();
                            this.getInstance.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, ThreeDSStrings.CARDINAL_STEPUP_EVENT.concat(String.valueOf(init3)), init3);
                            setaccessibilityliveregion.valueOf().cca_continue();
                            super.hashCode();
                            throw r3;
                        }
                        this.getInstance.configure("10711", ThreeDSStrings.INTERNAL_ERROR, (String) r3);
                        init(new ValidateResponse(false, CardinalActionCode.ERROR, new CardinalError(CardinalError.SEND_STEPUP_DATA_STARTED_SESSION_ID_ERROR_CODE)), this.cca_continue.get());
                        int i27 = getWarnings;
                        int i28 = i27 & 19;
                        int i29 = -(-(i27 | 19));
                        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                        onValidated = i30 % 128;
                        int i31 = i30 % 2;
                        return;
                    }
                    setScrollBarFadeDuration.cca_continue().init().init();
                    super.hashCode();
                    throw r3;
                }
            }
            int i32 = getWarnings;
            int i33 = i32 & 5;
            int i34 = (i32 | 5) & (~i33);
            int i35 = i33 << 1;
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            onValidated = i36 % 128;
            int i37 = i36 % 2;
            return;
        }
        this.cca_continue.get();
        super.hashCode();
        throw r3;
    }

    private static void init(ValidateResponse validateResponse, Context context) {
        int i = onValidated;
        int i2 = i & 119;
        int i3 = (i ^ 119) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getWarnings = i4 % 128;
        boolean z = false;
        if (i4 % 2 == 0) {
            if (context == null) {
                z = true;
            }
            if (!z) {
                setScrollBarFadeDuration.cca_continue().Cardinal().configure(validateResponse, "");
                int i5 = onValidated + 103;
                getWarnings = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = (getWarnings + 99) - 1;
            int i8 = (i7 & -1) + (i7 | -1);
            onValidated = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r4.Cardinal != null ? '9' : 'V') != 'V') goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if ((r4.Cardinal == null) != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onValidated(com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse r5, java.lang.String r6) {
        /*
            r4 = this;
            int r0 = getWarnings
            r1 = r0 | 52
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 52
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r0 = r1 % 128
            onValidated = r0
            int r1 = r1 % 2
            r0 = 23
            if (r1 != 0) goto L_0x0016
            r1 = r0
            goto L_0x0018
        L_0x0016:
            r1 = 72
        L_0x0018:
            r3 = 0
            if (r1 == r0) goto L_0x0028
            com.cardinalcommerce.a.setFocusedByDefault r0 = r4.Cardinal
            r1 = 86
            if (r0 == 0) goto L_0x0024
            r0 = 57
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            if (r0 == r1) goto L_0x0048
            goto L_0x0035
        L_0x0028:
            com.cardinalcommerce.a.setFocusedByDefault r0 = r4.Cardinal
            r1 = 67
            int r1 = r1 / r3
            if (r0 == 0) goto L_0x0031
            r0 = r3
            goto L_0x0032
        L_0x0031:
            r0 = r2
        L_0x0032:
            if (r0 == 0) goto L_0x0035
            goto L_0x0048
        L_0x0035:
            com.cardinalcommerce.a.setFocusedByDefault r0 = r4.Cardinal
            r0.configure()
            int r0 = onValidated
            r1 = r0 | 47
            int r1 = r1 << r2
            r0 = r0 ^ 47
            int r1 = r1 - r0
            int r0 = r1 % 128
            getWarnings = r0
            int r1 = r1 % 2
        L_0x0048:
            com.cardinalcommerce.a.setScrollBarFadeDuration r0 = com.cardinalcommerce.a.setScrollBarFadeDuration.cca_continue()
            com.cardinalcommerce.a.cleanup r0 = r0.Cardinal()
            r0.configure(r5, r6)
            int r5 = onValidated
            r6 = r5 ^ 89
            r5 = r5 & 89
            int r5 = r5 << r2
            int r5 = ~r5
            int r6 = r6 - r5
            int r6 = r6 - r2
            int r5 = r6 % 128
            getWarnings = r5
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r3 = r2
        L_0x0067:
            if (r3 != r2) goto L_0x006a
            return
        L_0x006a:
            r5 = 0
            throw r5     // Catch:{ all -> 0x006c }
        L_0x006c:
            r5 = move-exception
            throw r5
        L_0x006e:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setAlpha.onValidated(com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, com.cardinalcommerce.a.setAlpha, com.cardinalcommerce.a.setFocusedByDefault, java.lang.Object] */
    public final void cca_continue() {
        int i = onValidated;
        int i2 = (i & 107) + (i | 107);
        getWarnings = i2 % 128;
        ? r2 = 0;
        if (!(i2 % 2 != 0)) {
            configure = r2;
            this.Cardinal = r2;
            this.cca_continue.clear();
            return;
        }
        configure = r2;
        this.Cardinal = r2;
        this.cca_continue.clear();
        super.hashCode();
        throw r2;
    }
}
