package com.cardinalcommerce.a;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentActivity;
import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.userinterfaces.ProgressDialog;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.text.Typography;
import lib.android.paypal.com.magnessdk.c;
import org.objectweb.asm.signature.SignatureVisitor;

public class init implements getSDKVersion {
    private static CardinalError cca_continue = null;
    private static int cleanup = 0;
    private static final getString configure = getString.getInstance();
    private static CountDownTimer getWarnings = null;
    private static int onValidated = 1;
    private final WeakReference<FragmentActivity> Cardinal;
    private final ActivityResultLauncher<Intent> getInstance;
    private ProgressDialog getSDKVersion;
    private final CardinalValidateReceiver init;

    static /* synthetic */ CountDownTimer Cardinal() {
        int i = onValidated;
        int i2 = ((i ^ 59) | (i & 59)) << 1;
        int i3 = -(((~i) & 59) | (i & -60));
        int i4 = (i2 & i3) + (i3 | i2);
        cleanup = i4 % 128;
        if ((i4 % 2 != 0 ? (char) 10 : 19) == 19) {
            return getWarnings;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    static /* synthetic */ WeakReference cca_continue(init init2) {
        int i = cleanup;
        boolean z = true;
        int i2 = ((((i ^ 11) | (i & 11)) << 1) - (~(-(((~i) & 11) | (i & -12))))) - 1;
        onValidated = i2 % 128;
        if (i2 % 2 == 0) {
            z = false;
        }
        WeakReference<FragmentActivity> weakReference = init2.Cardinal;
        if (z) {
            return weakReference;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    static /* synthetic */ void cca_continue() {
        int i = cleanup;
        int i2 = ((((i ^ 107) | (i & 107)) << 1) - (~(-(((~i) & 107) | (i & -108))))) - 1;
        onValidated = i2 % 128;
        boolean z = i2 % 2 != 0;
        getInstance();
        if (z) {
            int i3 = cleanup;
            int i4 = i3 & 77;
            int i5 = ((i3 ^ 77) | i4) << 1;
            int i6 = -((i3 | 77) & (~i4));
            int i7 = (i5 & i6) + (i6 | i5);
            onValidated = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    static /* synthetic */ void getInstance(init init2, ActivityResult activityResult) {
        int i = onValidated;
        int i2 = ((i ^ 63) | (i & 63)) << 1;
        int i3 = -(((~i) & 63) | (i & -64));
        int i4 = (i2 & i3) + (i3 | i2);
        cleanup = i4 % 128;
        boolean z = i4 % 2 == 0;
        init2.init(activityResult);
        if (!z) {
            int i5 = 94 / 0;
        }
    }

    static {
        int i = onValidated;
        int i2 = i & 67;
        int i3 = i2 + ((i ^ 67) | i2);
        cleanup = i3 % 128;
        int i4 = i3 % 2;
    }

    public init(FragmentActivity fragmentActivity, CardinalValidateReceiver cardinalValidateReceiver) throws InvalidInputException {
        getString getstring = configure;
        getstring.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, "CardinalChallengeObserverImpl Initialized ", "");
        if (cardinalValidateReceiver == null) {
            getstring.cca_continue(new CardinalError(10602), (String) null);
            throw new InvalidInputException("InvalidInputException", new Throwable("Null CardinalValidateReceiver received on CardinalChallengeObserver"));
        } else if (fragmentActivity != null) {
            this.init = cardinalValidateReceiver;
            this.Cardinal = new WeakReference<>(fragmentActivity);
            this.getInstance = fragmentActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                private static int cca_continue = 1;
                private static int getInstance;

                public final /* synthetic */ void onActivityResult(Object obj) {
                    int i = cca_continue;
                    int i2 = i & 51;
                    int i3 = (i2 - (~((i ^ 51) | i2))) - 1;
                    getInstance = i3 % 128;
                    char c = i3 % 2 != 0 ? '#' : 'A';
                    getInstance((ActivityResult) obj);
                    if (c != 'A') {
                        int i4 = 26 / 0;
                    }
                    int i5 = getInstance;
                    int i6 = ((i5 ^ 121) | (i5 & 121)) << 1;
                    int i7 = -(((~i5) & 121) | (i5 & -122));
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    cca_continue = i8 % 128;
                    int i9 = i8 % 2;
                }

                private void getInstance(ActivityResult activityResult) {
                    int i = getInstance;
                    int i2 = (i ^ 63) + ((i & 63) << 1);
                    cca_continue = i2 % 128;
                    int i3 = i2 % 2;
                    init.getInstance(init.this, activityResult);
                    int i4 = (getInstance + 80) - 1;
                    cca_continue = i4 % 128;
                    if ((i4 % 2 == 0 ? '7' : 'c') != 'c') {
                        throw null;
                    }
                }
            });
        } else {
            getstring.cca_continue(new CardinalError(10609), (String) null);
            throw new InvalidInputException("InvalidInputException", new Throwable("Null FragmentActivity received on CardinalChallengeObserver"));
        }
    }

    protected static void Cardinal(UiCustomization uiCustomization, onValidated onvalidated, String str, String str2, String str3, String str4) {
        int i = cleanup;
        int i2 = i & 1;
        boolean z = true;
        int i3 = -(-(i | 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        onValidated = i4 % 128;
        if (i4 % 2 != 0) {
            configure.configure().getInstance(uiCustomization, setHorizontalScrollBarEnabled.configure(onvalidated.init()), str, str2, str3, str4);
            configure.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, "CardinalChallengeObserverImpl Configured", onvalidated.init());
            int i5 = cleanup;
            int i6 = (i5 | 27) << 1;
            int i7 = -(((~i5) & 27) | (i5 & -28));
            int i8 = (i6 & i7) + (i7 | i6);
            onValidated = i8 % 128;
            if (i8 % 2 == 0) {
                z = false;
            }
            if (!z) {
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            configure.configure().getInstance(uiCustomization, setHorizontalScrollBarEnabled.configure(onvalidated.init()), str, str2, str3, str4);
            configure.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, "CardinalChallengeObserverImpl Configured", onvalidated.init());
            try {
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void init(setTransitionVisibility settransitionvisibility, CardinalConfigurationParameters cardinalConfigurationParameters, String str) {
        int i = onValidated;
        int i2 = i & 7;
        int i3 = (i ^ 7) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        cleanup = i4 % 128;
        int i5 = i4 % 2;
        configure(cardinalConfigurationParameters.getChallengeTimeout());
        if ((!settransitionvisibility.CardinalConfigurationParameters().equalsIgnoreCase("Y") ? '(' : '\'') == '(') {
            int i6 = cleanup;
            char c = 'B';
            int i7 = (i6 & 66) + (i6 | 66);
            int i8 = ((i7 | -1) << 1) - (i7 ^ -1);
            onValidated = i8 % 128;
            int i9 = i8 % 2;
            if (!settransitionvisibility.CardinalConfigurationParameters().equalsIgnoreCase("N")) {
                if (!settransitionvisibility.onCReqSuccess().equalsIgnoreCase("N")) {
                    c = ',';
                }
                if (c != ',') {
                    int i10 = onValidated;
                    int i11 = (((i10 ^ 91) | (i10 & 91)) << 1) - (((~i10) & 91) | (i10 & -92));
                    cleanup = i11 % 128;
                    int i12 = i11 % 2;
                    Cardinal(settransitionvisibility, cardinalConfigurationParameters.getUICustomization());
                    int i13 = onValidated;
                    int i14 = (i13 ^ 19) + ((i13 & 19) << 1);
                    cleanup = i14 % 128;
                    int i15 = i14 % 2;
                    return;
                }
                Cardinal(new CardinalError(10608), cardinalConfigurationParameters, str);
                int i16 = (onValidated + 108) - 1;
                cleanup = i16 % 128;
                int i17 = i16 % 2;
                return;
            }
        }
        Cardinal(new CardinalError(10607), cardinalConfigurationParameters, str);
        int i18 = cleanup;
        int i19 = i18 & 107;
        int i20 = (i18 ^ 107) | i19;
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        onValidated = i21 % 128;
        if ((i21 % 2 == 0 ? 18 : 'L') == 18) {
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private void init(ActivityResult activityResult) {
        int i = cleanup;
        int i2 = i & 123;
        int i3 = ((i ^ 123) | i2) << 1;
        int i4 = -((i | 123) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onValidated = i5 % 128;
        ? r4 = 0;
        if (i5 % 2 != 0) {
            try {
                int resultCode = activityResult.getResultCode();
                if (!(resultCode != -1)) {
                    int i6 = cleanup;
                    int i7 = (((i6 & -54) | ((~i6) & 53)) - (~((i6 & 53) << 1))) - 1;
                    onValidated = i7 % 128;
                    if ((i7 % 2 == 0 ? Typography.greater : '&') == '&') {
                        init();
                        if (activityResult.getData() != null) {
                            cca_continue((setAccessibilityLiveRegion) ((Bundle) Objects.requireNonNull(activityResult.getData().getExtras())).getSerializable(ThreeDSStrings.CCA_CREQ));
                            int i8 = cleanup;
                            int i9 = (i8 | 27) << 1;
                            int i10 = -(i8 ^ 27);
                            int i11 = (i9 & i10) + (i10 | i9);
                            onValidated = i11 % 128;
                            int i12 = i11 % 2;
                        }
                        int i13 = (cleanup + 29) - 1;
                        int i14 = (i13 ^ -1) + ((i13 & -1) << 1);
                        onValidated = i14 % 128;
                        int i15 = i14 % 2;
                        return;
                    }
                    init();
                    activityResult.getData();
                    super.hashCode();
                    throw r4;
                } else if (resultCode == 0) {
                    configure();
                    cca_continue(CardinalActionCode.TIMEOUT, new CardinalError(0), "");
                    int i16 = onValidated;
                    int i17 = (i16 & -28) | ((~i16) & 27);
                    int i18 = (i16 & 27) << 1;
                    int i19 = (i17 & i18) + (i18 | i17);
                    cleanup = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    configure();
                    cca_continue(CardinalActionCode.ERROR, new CardinalError(0), "");
                    int i21 = cleanup;
                    int i22 = ((i21 & -92) | ((~i21) & 91)) + ((i21 & 91) << 1);
                    onValidated = i22 % 128;
                    int i23 = i22 % 2;
                }
            } catch (Exception e) {
                configure.configure("10714", e.getLocalizedMessage(), (String) r4);
                configure();
                cca_continue(CardinalActionCode.ERROR, new CardinalError(0), "");
            }
        } else {
            activityResult.getResultCode();
            super.hashCode();
            throw r4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ab A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Cardinal(com.cardinalcommerce.a.setTransitionVisibility r12, com.cardinalcommerce.shared.userinterfaces.UiCustomization r13) {
        /*
            r11 = this;
            int r0 = cleanup
            r1 = r0 ^ 33
            r2 = r0 & 33
            r1 = r1 | r2
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 & -34
            int r0 = ~r0
            r4 = 33
            r0 = r0 & r4
            r0 = r0 | r3
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r2
            int r0 = r1 % 128
            onValidated = r0
            r0 = 2
            int r1 = r1 % r0
            java.lang.String r1 = r12.configure()
            int r3 = r1.hashCode()
            r5 = 4
            r6 = 3
            r7 = 8
            r8 = 30
            r9 = -1
            r10 = 0
            switch(r3) {
                case 1537: goto L_0x00d0;
                case 1538: goto L_0x00ae;
                case 1539: goto L_0x0089;
                case 1540: goto L_0x005f;
                case 1541: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0103
        L_0x002f:
            java.lang.String r3 = "05"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            r1 = 59
            goto L_0x003b
        L_0x003a:
            r1 = r4
        L_0x003b:
            if (r1 == r4) goto L_0x0103
            int r1 = cleanup
            int r1 = r1 + 9
            int r1 = r1 - r2
            r3 = r1 & -1
            r1 = r1 | r9
            int r3 = r3 + r1
            int r1 = r3 % 128
            onValidated = r1
            int r3 = r3 % r0
            r3 = r1 & 29
            r1 = r1 ^ 29
            r1 = r1 | r3
            int r1 = -r1
            int r1 = -r1
            r4 = r3 ^ r1
            r1 = r1 & r3
            int r1 = r1 << r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            cleanup = r1
            int r4 = r4 % r0
            r9 = r10
            goto L_0x0103
        L_0x005f:
            java.lang.String r3 = "04"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0069
            r1 = r10
            goto L_0x006a
        L_0x0069:
            r1 = r2
        L_0x006a:
            if (r1 == r2) goto L_0x0103
            int r1 = cleanup
            int r3 = r1 + 46
            int r3 = r3 - r2
            int r4 = r3 % 128
            onValidated = r4
            int r3 = r3 % r0
            r3 = r1 | 22
            int r3 = r3 << r2
            r1 = r1 ^ 22
            int r3 = r3 - r1
            r1 = r3 ^ -1
            r3 = r3 & r9
            int r3 = r3 << r2
            int r1 = r1 + r3
            int r3 = r1 % 128
            onValidated = r3
            int r1 = r1 % r0
            r9 = r5
            goto L_0x0103
        L_0x0089:
            java.lang.String r3 = "03"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0094
            r1 = 39
            goto L_0x0095
        L_0x0094:
            r1 = r7
        L_0x0095:
            if (r1 == r7) goto L_0x0103
            int r1 = cleanup
            int r3 = r1 + 41
            int r4 = r3 % 128
            onValidated = r4
            int r3 = r3 % r0
            r3 = r1 | 30
            int r3 = r3 << r2
            r1 = r1 ^ r8
            int r3 = r3 - r1
            int r3 = r3 - r10
            int r3 = r3 - r2
            int r1 = r3 % 128
            onValidated = r1
            int r3 = r3 % r0
            r9 = r0
            goto L_0x0103
        L_0x00ae:
            java.lang.String r3 = "02"
            boolean r1 = r1.equals(r3)
            r3 = 17
            if (r1 == 0) goto L_0x00b9
            r7 = r3
        L_0x00b9:
            if (r7 == r3) goto L_0x00bc
            goto L_0x0103
        L_0x00bc:
            int r1 = onValidated
            int r1 = r1 + 126
            int r1 = r1 - r2
            int r3 = r1 % 128
            cleanup = r3
            int r1 = r1 % r0
            int r3 = r3 + 52
            int r3 = r3 - r2
            int r1 = r3 % 128
            onValidated = r1
            int r3 = r3 % r0
            r9 = r2
            goto L_0x0103
        L_0x00d0:
            java.lang.String r3 = "01"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00da
            r1 = r8
            goto L_0x00dc
        L_0x00da:
            r1 = 63
        L_0x00dc:
            if (r1 == r8) goto L_0x00df
            goto L_0x0103
        L_0x00df:
            int r1 = cleanup
            r3 = r1 ^ 41
            r4 = r1 & 41
            r4 = r4 | r3
            int r4 = r4 << r2
            int r3 = -r3
            r7 = r4 & r3
            r3 = r3 | r4
            int r7 = r7 + r3
            int r3 = r7 % 128
            onValidated = r3
            int r7 = r7 % r0
            r3 = r1 & 119(0x77, float:1.67E-43)
            r1 = r1 ^ 119(0x77, float:1.67E-43)
            r1 = r1 | r3
            int r1 = -r1
            int r1 = -r1
            r4 = r3 | r1
            int r4 = r4 << r2
            r1 = r1 ^ r3
            int r4 = r4 - r1
            int r1 = r4 % 128
            onValidated = r1
            int r4 = r4 % r0
            r9 = r6
        L_0x0103:
            r1 = 0
            if (r9 == 0) goto L_0x0139
            if (r9 == r2) goto L_0x0110
            if (r9 == r0) goto L_0x0110
            if (r9 == r6) goto L_0x0110
            if (r9 == r5) goto L_0x0110
            r3 = r1
            goto L_0x015b
        L_0x0110:
            android.content.Intent r3 = new android.content.Intent
            java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> r4 = r11.Cardinal
            java.lang.Object r4 = r4.get()
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.Class<com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView> r5 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.class
            r3.<init>(r4, r5)
            int r4 = cleanup
            r5 = r4 ^ 103(0x67, float:1.44E-43)
            r6 = r4 & 103(0x67, float:1.44E-43)
            r5 = r5 | r6
            int r5 = r5 << r2
            r6 = r4 & -104(0xffffffffffffff98, float:NaN)
            int r4 = ~r4
            r7 = 103(0x67, float:1.44E-43)
            r4 = r4 & r7
            r4 = r4 | r6
            int r5 = r5 - r4
            int r4 = r5 % 128
            onValidated = r4
        L_0x0137:
            int r5 = r5 % r0
            goto L_0x015b
        L_0x0139:
            android.content.Intent r3 = new android.content.Intent
            java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity> r4 = r11.Cardinal
            java.lang.Object r4 = r4.get()
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.Class<com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView> r5 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView.class
            r3.<init>(r4, r5)
            int r4 = onValidated
            r5 = r4 ^ 10
            r4 = r4 & 10
            int r4 = r4 << r2
            int r5 = r5 + r4
            int r5 = r5 - r10
            int r5 = r5 - r2
            int r4 = r5 % 128
            cleanup = r4
            goto L_0x0137
        L_0x015b:
            r4 = 99
            if (r3 == 0) goto L_0x0162
            r5 = 21
            goto L_0x0163
        L_0x0162:
            r5 = r4
        L_0x0163:
            if (r5 == r4) goto L_0x019a
            int r4 = onValidated
            int r4 = r4 + 16
            int r4 = r4 - r2
            int r5 = r4 % 128
            cleanup = r5
            int r4 = r4 % r0
            java.lang.String r4 = "StepUpData"
            r3.putExtra(r4, r12)
            java.lang.String r12 = "UiCustomization"
            r3.putExtra(r12, r13)
            java.lang.String r12 = "ActivityObserverDriven"
            r3.putExtra(r12, r2)
            r12 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r12)
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r12 = r11.getInstance
            r12.launch(r3)
            int r12 = cleanup
            r13 = r12 ^ 9
            r12 = r12 & 9
            r12 = r12 | r13
            int r12 = r12 << r2
            int r13 = -r13
            r3 = r12 & r13
            r12 = r12 | r13
            int r3 = r3 + r12
            int r12 = r3 % 128
            onValidated = r12
            int r3 = r3 % r0
        L_0x019a:
            int r12 = cleanup
            int r12 = r12 + 12
            int r12 = r12 - r2
            int r13 = r12 % 128
            onValidated = r13
            int r12 = r12 % r0
            if (r12 != 0) goto L_0x01a7
            goto L_0x01a8
        L_0x01a7:
            r2 = r10
        L_0x01a8:
            if (r2 != 0) goto L_0x01ab
            return
        L_0x01ab:
            throw r1     // Catch:{ all -> 0x01ac }
        L_0x01ac:
            r12 = move-exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.init.Cardinal(com.cardinalcommerce.a.setTransitionVisibility, com.cardinalcommerce.shared.userinterfaces.UiCustomization):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private void cca_continue(setAccessibilityLiveRegion setaccessibilityliveregion) {
        int i = onValidated;
        int i2 = i & 107;
        int i3 = i | 107;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        cleanup = i4 % 128;
        int i5 = i4 % 2;
        boolean z = false;
        if (setaccessibilityliveregion == null) {
            cca_continue(new ValidateResponse(false, CardinalActionCode.ERROR, new CardinalError(CardinalError.SEND_STEPUP_DATA_STARTED_USER_INPUT_ERROR_CODE)), "");
            int i6 = cleanup;
            int i7 = (i6 & 91) + (i6 | 91);
            onValidated = i7 % 128;
            if ((i7 % 2 == 0 ? 'N' : 'F') != 'F') {
                int i8 = 60 / 0;
                return;
            }
            return;
        }
        ? r5 = 0;
        if ((!setHorizontalScrollBarEnabled.Cardinal(configure.configure().cca_continue()) ? (char) 27 : 13) != 13) {
            int i9 = onValidated;
            int i10 = i9 & 3;
            int i11 = (((i9 | 3) & (~i10)) - (~(-(-(i10 << 1))))) - 1;
            cleanup = i11 % 128;
            int i12 = i11 % 2;
            String valueOf = String.valueOf(configure.configure().cca_continue());
            configure.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, ThreeDSStrings.CARDINAL_STEPUP_EVENT.concat(String.valueOf(valueOf)), valueOf);
            if (setaccessibilityliveregion.valueOf().cca_continue()) {
                int i13 = onValidated;
                int i14 = (i13 & 29) + (i13 | 29);
                cleanup = i14 % 128;
                if ((i14 % 2 != 0 ? '2' : 'U') == 'U') {
                    setaccessibilityliveregion.init(setHorizontalScrollBarEnabled.configure(configure.configure().init()));
                    setaccessibilityliveregion.Cardinal(setHorizontalScrollBarEnabled.configure(valueOf));
                    setaccessibilityliveregion.getInstance(setHorizontalScrollBarEnabled.configure(configure.configure().Cardinal()));
                    if (configure.configure().getWarnings().equals("")) {
                        z = true;
                    }
                    if (!z) {
                        int i15 = onValidated;
                        int i16 = (((i15 ^ 59) | (i15 & 59)) << 1) - (((~i15) & 59) | (i15 & -60));
                        cleanup = i16 % 128;
                        int i17 = i16 % 2;
                        setaccessibilityliveregion.cca_continue(setHorizontalScrollBarEnabled.configure(configure.configure().getWarnings()));
                        int i18 = onValidated;
                        int i19 = ((i18 ^ 29) - (~((i18 & 29) << 1))) - 1;
                        cleanup = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    CardinalError cardinalError = new CardinalError(setaccessibilityliveregion, this, configure.configure().getInstance());
                    cca_continue = cardinalError;
                    cardinalError.cca_continue();
                    int i21 = onValidated;
                    int i22 = (i21 ^ 31) + ((i21 & 31) << 1);
                    cleanup = i22 % 128;
                    if ((i22 % 2 != 0 ? 'Z' : SignatureVisitor.INSTANCEOF) == 'Z') {
                        super.hashCode();
                        throw r5;
                    }
                    return;
                }
                setaccessibilityliveregion.init(setHorizontalScrollBarEnabled.configure(configure.configure().init()));
                setaccessibilityliveregion.Cardinal(setHorizontalScrollBarEnabled.configure(valueOf));
                setaccessibilityliveregion.getInstance(setHorizontalScrollBarEnabled.configure(configure.configure().Cardinal()));
                configure.configure().getWarnings().equals("");
                super.hashCode();
                throw r5;
            }
            cca_continue(new ValidateResponse(false, CardinalActionCode.ERROR, new CardinalError(CardinalError.SEND_STEPUP_DATA_INVALID_USER_INPUT_ERROR_CODE)), "");
            int i23 = cleanup;
            int i24 = ((i23 | 41) << 1) - (i23 ^ 41);
            onValidated = i24 % 128;
            if ((i24 % 2 == 0 ? '`' : 'X') == '`') {
                int i25 = 25 / 0;
                return;
            }
            return;
        }
        configure.configure("10711", ThreeDSStrings.INTERNAL_ERROR, (String) r5);
        cca_continue(new ValidateResponse(false, CardinalActionCode.ERROR, new CardinalError(CardinalError.SEND_STEPUP_DATA_STARTED_SESSION_ID_ERROR_CODE)), "");
        int i26 = onValidated;
        int i27 = i26 & 7;
        int i28 = (((i26 | 7) & (~i27)) - (~(i27 << 1))) - 1;
        cleanup = i28 % 128;
        int i29 = i28 % 2;
    }

    private void init() {
        ProgressDialog progressDialog = new ProgressDialog(this.Cardinal.get(), "");
        this.getSDKVersion = progressDialog;
        progressDialog.show();
        int i = cleanup;
        int i2 = i & 93;
        int i3 = (i ^ 93) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        onValidated = i4 % 128;
        if (!(i4 % 2 != 0)) {
            throw null;
        }
    }

    private void configure() {
        int i = onValidated;
        int i2 = i & 17;
        int i3 = (i2 - (~(-(-((i ^ 17) | i2))))) - 1;
        cleanup = i3 % 128;
        if ((i3 % 2 != 0 ? 13 : '3') != 13) {
            ProgressDialog progressDialog = this.getSDKVersion;
            if ((progressDialog != null ? (char) 5 : 15) != 15) {
                int i4 = i & 17;
                int i5 = ((i ^ 17) | i4) << 1;
                int i6 = -((i | 17) & (~i4));
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                cleanup = i7 % 128;
                if ((i7 % 2 != 0 ? (char) 19 : 20) == 20) {
                    progressDialog.dismiss();
                    int i8 = onValidated;
                    int i9 = ((i8 | 45) << 1) - (i8 ^ 45);
                    cleanup = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    progressDialog.dismiss();
                    throw null;
                }
            }
            int i11 = onValidated;
            int i12 = i11 & 27;
            int i13 = (i11 ^ 27) | i12;
            int i14 = (i12 & i13) + (i13 | i12);
            cleanup = i14 % 128;
            int i15 = i14 % 2;
            return;
        }
        throw null;
    }

    private void Cardinal(CardinalError cardinalError, CardinalConfigurationParameters cardinalConfigurationParameters, String str) {
        int i = onValidated;
        int i2 = i & 63;
        int i3 = (i | 63) & (~i2);
        boolean z = true;
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        cleanup = i5 % 128;
        if (i5 % 2 != 0) {
            z = false;
        }
        if (z) {
            getString getstring = configure;
            getstring.cca_continue(cardinalError, str);
            getstring.init(cardinalConfigurationParameters.getEnvironment().toString());
            cca_continue(CardinalActionCode.ERROR, cardinalError, "");
            return;
        }
        getString getstring2 = configure;
        getstring2.cca_continue(cardinalError, str);
        getstring2.init(cardinalConfigurationParameters.getEnvironment().toString());
        cca_continue(CardinalActionCode.ERROR, cardinalError, "");
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void cca_continue(CardinalActionCode cardinalActionCode, CardinalError cardinalError, String str) throws InvalidInputException {
        int i = onValidated;
        int i2 = (i ^ 115) + ((i & 115) << 1);
        cleanup = i2 % 128;
        Throwable th = null;
        if (!(i2 % 2 != 0 ? true : true)) {
            super.hashCode();
            throw th;
        } else if (this.init != null) {
            cca_continue(new ValidateResponse(false, cardinalActionCode, cardinalError), str);
            int i3 = cleanup;
            int i4 = i3 ^ 113;
            int i5 = ((i3 & 113) | i4) << 1;
            int i6 = -i4;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            onValidated = i7 % 128;
            if ((i7 % 2 == 0 ? 16 : 'I') != 'I') {
                super.hashCode();
                throw th;
            }
        } else {
            throw new InvalidInputException("InvalidInputException", new Throwable("Null CardinalValidateReceiver received on cca_continue"));
        }
    }

    private void cca_continue(ValidateResponse validateResponse, String str) {
        int i = cleanup;
        boolean z = true;
        int i2 = (((i | 58) << 1) - (i ^ 58)) - 1;
        onValidated = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (this.init == null) {
                configure.cca_continue(new CardinalError((int) CardinalError.NULL_CALLBACK_IN_CHALLENGE_OBSERVER_CODE, new StringBuilder(CardinalError.NULL_CALLBACK_IN_CHALLENGE_OBSERVER_MESSAGE).append(validateResponse.getErrorNumber()).append(validateResponse.getErrorDescription()).toString()), "");
                int i4 = cleanup;
                int i5 = (i4 ^ 70) + ((i4 & 70) << 1);
                int i6 = ((i5 | -1) << 1) - (i5 ^ -1);
                onValidated = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            int i8 = i & 71;
            int i9 = ((i ^ 71) | i8) << 1;
            int i10 = -((i | 71) & (~i8));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            onValidated = i11 % 128;
            int i12 = i11 % 2;
            configure();
            getInstance.getInstance();
            if (getInstance.init() != Cardinal.New) {
                int i13 = onValidated;
                int i14 = (i13 & -124) | ((~i13) & 123);
                int i15 = -(-((i13 & 123) << 1));
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                cleanup = i16 % 128;
                int i17 = i16 % 2;
                getInstance.getInstance();
                getInstance.configure();
                int i18 = cleanup;
                int i19 = ((i18 | 59) << 1) - (((~i18) & 59) | (i18 & -60));
                onValidated = i19 % 128;
                int i20 = i19 % 2;
            }
            this.init.onValidated(this.Cardinal.get(), validateResponse, str);
            int i21 = (cleanup + 115) - 1;
            int i22 = ((i21 | -1) << 1) - (i21 ^ -1);
            onValidated = i22 % 128;
            if (i22 % 2 != 0) {
                z = false;
            }
            if (z) {
                int i23 = 63 / 0;
            }
        } catch (Exception e) {
            configure.cca_continue(new CardinalError((int) CardinalError.OBSERVER_SEND_RESULT_TO_MERCHANT_EXCEPTION_CODE, new StringBuilder().append(validateResponse.getErrorNumber()).append(validateResponse.getErrorDescription()).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).append(e.getLocalizedMessage()).toString()), "");
        }
    }

    public void onCReqSuccess(setTransitionVisibility settransitionvisibility) {
        int i = onValidated;
        int i2 = i & 23;
        int i3 = (((i | 23) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        cleanup = i3 % 128;
        int i4 = i3 % 2;
        boolean z = false;
        if ((settransitionvisibility.onCReqSuccess().equalsIgnoreCase("N") ? '*' : 27) == '*') {
            int i5 = (onValidated + 60) - 1;
            cleanup = i5 % 128;
            int i6 = i5 % 2;
            configure();
            Cardinal(settransitionvisibility, configure.configure().getSDKVersion());
            int i7 = cleanup;
            int i8 = (((i7 ^ 116) + ((i7 & 116) << 1)) - 0) - 1;
            onValidated = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = cleanup;
        int i11 = ((i10 | 44) << 1) - (i10 ^ 44);
        int i12 = (i11 ^ -1) + ((i11 & -1) << 1);
        onValidated = i12 % 128;
        if (i12 % 2 == 0) {
            z = true;
        }
        if (z) {
            throw null;
        }
    }

    public void onValidated(ValidateResponse validateResponse, String str) {
        int i = cleanup;
        int i2 = i & 39;
        boolean z = true;
        int i3 = (((i ^ 39) | i2) << 1) - ((i | 39) & (~i2));
        onValidated = i3 % 128;
        if (i3 % 2 == 0) {
            z = false;
        }
        cca_continue(validateResponse, str);
        if (!z) {
            int i4 = 80 / 0;
        }
    }

    private void configure(int i) {
        int i2 = onValidated;
        int i3 = i2 & 3;
        int i4 = (i2 | 3) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        int i7 = i6 % 128;
        cleanup = i7;
        int i8 = i6 % 2;
        CountDownTimer countDownTimer = getWarnings;
        if (countDownTimer != null) {
            int i9 = (i7 & 40) + (i7 | 40);
            int i10 = ((i9 | -1) << 1) - (i9 ^ -1);
            onValidated = i10 % 128;
            int i11 = i10 % 2;
            countDownTimer.cancel();
            int i12 = cleanup;
            int i13 = i12 & 89;
            int i14 = i12 | 89;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            onValidated = i15 % 128;
            int i16 = i15 % 2;
        }
        this.Cardinal.get().runOnUiThread(new init$$ExternalSyntheticLambda0(this, i));
        int i17 = (((cleanup + 85) - 1) - 0) - 1;
        onValidated = i17 % 128;
        int i18 = i17 % 2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void cca_continue(int i) {
        long j = (long) (i * c.b.q);
        AnonymousClass3 r0 = new CountDownTimer(j, j) {
            private static int Cardinal = 1;
            private static int cca_continue;

            public final void onTick(long j) {
                int i = Cardinal;
                char c = 15;
                int i2 = ((i & -16) | ((~i) & 15)) + ((i & 15) << 1);
                cca_continue = i2 % 128;
                if (i2 % 2 == 0) {
                    c = 19;
                }
                if (c != 19) {
                    int i3 = 68 / 0;
                }
            }

            public final void onFinish() {
                int i = Cardinal;
                int i2 = i & 51;
                int i3 = -(-(i | 51));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                cca_continue = i4 % 128;
                int i5 = i4 % 2;
                if ((init.Cardinal() != null ? Typography.amp : ')') != ')') {
                    int i6 = Cardinal;
                    int i7 = ((i6 & 113) - (~(i6 | 113))) - 1;
                    cca_continue = i7 % 128;
                    int i8 = i7 % 2;
                    init.Cardinal().cancel();
                    int i9 = Cardinal;
                    int i10 = (i9 ^ 104) + ((i9 & 104) << 1);
                    int i11 = (i10 ^ -1) + ((i10 & -1) << 1);
                    cca_continue = i11 % 128;
                    int i12 = i11 % 2;
                }
                init.cca_continue();
                ((FragmentActivity) init.cca_continue(init.this).get()).getApplicationContext().sendBroadcast(new Intent(ThreeDSStrings.CHALLENGE_TIMEOUT_ACTIVITY));
                int i13 = cca_continue;
                int i14 = i13 & 55;
                int i15 = (i13 | 55) & (~i14);
                int i16 = i14 << 1;
                int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
                Cardinal = i17 % 128;
                int i18 = i17 % 2;
            }
        };
        getWarnings = r0;
        r0.start();
        int i2 = cleanup;
        int i3 = ((i2 ^ 93) | (i2 & 93)) << 1;
        int i4 = -(((~i2) & 93) | (i2 & -94));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onValidated = i5 % 128;
        if ((i5 % 2 == 0 ? (char) 9 : 19) != 19) {
            int i6 = 87 / 0;
        }
    }

    private static void getInstance() {
        int i = cleanup;
        boolean z = false;
        int i2 = (((i + 39) - 1) - 0) - 1;
        onValidated = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        }
        if (z) {
            CardinalError cardinalError = cca_continue;
            if ((cardinalError != null ? (char) 9 : 20) == 9) {
                int i3 = i & 83;
                int i4 = (i | 83) & (~i3);
                int i5 = i3 << 1;
                int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                onValidated = i6 % 128;
                int i7 = i6 % 2;
                cardinalError.configure();
                int i8 = onValidated;
                int i9 = (i8 ^ 59) + ((i8 & 59) << 1);
                cleanup = i9 % 128;
                int i10 = i9 % 2;
            }
            int i11 = cleanup;
            int i12 = i11 & 97;
            int i13 = i12 + ((i11 ^ 97) | i12);
            onValidated = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }
}
