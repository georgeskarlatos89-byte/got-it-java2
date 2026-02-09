package com.cardinalcommerce.a;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import com.cardinalcommerce.cardinalmobilesdk.Cardinal;
import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalInitService;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.cardinalcommerce.shared.models.Warning;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;
import lib.android.paypal.com.magnessdk.c;
import org.json.JSONException;
import org.objectweb.asm.signature.SignatureVisitor;

public class getInstance implements cleanup {
    private static final Object CardinalChallengeObserver = new Object();
    private static boolean CardinalUiType = false;
    private static WeakReference<Context> cca_continue = null;
    private static CountDownTimer configure = null;
    private static int getActionCode = 0;
    private static getInstance getInstance = null;
    private static int getString = 1;
    private static Cardinal getWarnings;
    private static String init;
    private static getString values;
    private WeakReference<Activity> Cardinal;
    private String CardinalEnvironment;
    private WeakReference<Context> CardinalError;
    private boolean CardinalRenderType = true;
    private CardinalValidateReceiver cleanup;
    private String getSDKVersion;
    private CardinalInitService onCReqSuccess;
    private onValidated onValidated;
    private CardinalConfigurationParameters valueOf;

    static /* synthetic */ CountDownTimer cleanup() {
        int i = getActionCode;
        int i2 = (i & 17) + (i | 17);
        getString = i2 % 128;
        if (!(i2 % 2 == 0)) {
            return configure;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    static /* synthetic */ CountDownTimer init(CountDownTimer countDownTimer) {
        int i = getString;
        int i2 = (i ^ 106) + ((i & 106) << 1);
        int i3 = (i2 & -1) + (i2 | -1);
        int i4 = i3 % 128;
        getActionCode = i4;
        boolean z = i3 % 2 == 0;
        configure = countDownTimer;
        if (z) {
            int i5 = ((i4 ^ 7) | (i4 & 7)) << 1;
            int i6 = -(((~i4) & 7) | (i4 & -8));
            int i7 = (i5 & i6) + (i5 | i6);
            getString = i7 % 128;
            int i8 = i7 % 2;
            return countDownTimer;
        }
        throw null;
    }

    static /* synthetic */ void init(getInstance getinstance) {
        int i = getActionCode;
        int i2 = i & 33;
        int i3 = -(-((i ^ 33) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        getString = i4 % 128;
        char c = i4 % 2 == 0 ? '[' : '0';
        getinstance.getWarnings();
        if (c != '0') {
            int i5 = 62 / 0;
        }
        int i6 = getActionCode;
        int i7 = (i6 ^ 103) + ((i6 & 103) << 1);
        getString = i7 % 128;
        int i8 = i7 % 2;
    }

    static {
        int i = getString;
        int i2 = ((i & 118) + (i | 118)) - 1;
        getActionCode = i2 % 128;
        int i3 = i2 % 2;
    }

    private getInstance() {
    }

    public static synchronized getInstance getInstance() {
        getInstance getinstance;
        synchronized (getInstance.class) {
            if (getInstance == null) {
                synchronized (CardinalChallengeObserver) {
                    if (getInstance == null) {
                        getInstance = new getInstance();
                        getWarnings = Cardinal.New;
                        values = getString.getInstance();
                    }
                }
            }
            getinstance = getInstance;
        }
        return getinstance;
    }

    public final void configure(Context context, CardinalConfigurationParameters cardinalConfigurationParameters, boolean z) throws InvalidInputException {
        int i = getString;
        int i2 = (i ^ 12) + ((i & 12) << 1);
        int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
        getActionCode = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = false;
        if (getWarnings.init(getWarnings, Cardinal.Configured)) {
            int i5 = getActionCode;
            int i6 = i5 & 61;
            int i7 = -(-((i5 ^ 61) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            getString = i8 % 128;
            int i9 = i8 % 2;
            if (context != null) {
                if (cardinalConfigurationParameters == null) {
                    values.cca_continue(new CardinalError(10103), (String) null);
                    cardinalConfigurationParameters = new CardinalConfigurationParameters();
                    int i10 = getActionCode;
                    int i11 = (i10 & 106) + (i10 | 106);
                    int i12 = (i11 ^ -1) + ((i11 & -1) << 1);
                    getString = i12 % 128;
                    int i13 = i12 % 2;
                }
                getString.getInstance(cardinalConfigurationParameters.isEnableLogging());
                values.Cardinal("CardinalConfigure", new StringBuilder("SDKAppID: ").append(Cardinal(context)).toString());
                getWarnings = Cardinal.Configured;
                cca_continue = new WeakReference<>(context.getApplicationContext());
                init(cardinalConfigurationParameters);
                if (!z) {
                    int i14 = getString;
                    int i15 = ((((i14 ^ 125) | (i14 & 125)) << 1) - (~(-(((~i14) & 125) | (i14 & -126))))) - 1;
                    getActionCode = i15 % 128;
                    Class<getInstance> cls = getInstance.class;
                    if ((i15 % 2 != 0 ? 'G' : '3') != 'G') {
                        if (!(!setVerticalScrollBarEnabled.cca_continue((Class<?>) cls).equals(Cardinal.class.getName()))) {
                            int i16 = getString;
                            int i17 = ((i16 ^ 11) - (~((i16 & 11) << 1))) - 1;
                            getActionCode = i17 % 128;
                            int i18 = i17 % 2;
                            CardinalUiType = z2;
                            values.Cardinal("CardinalConfigure", "LASSO started");
                            setSaveFromParentEnabled.getInstance().cca_continue(context, cardinalConfigurationParameters, CardinalUiType);
                            int i19 = getString;
                            int i20 = i19 | 11;
                            int i21 = i20 << 1;
                            int i22 = -((~(i19 & 11)) & i20);
                            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                            getActionCode = i23 % 128;
                            int i24 = i23 % 2;
                            return;
                        }
                    } else {
                        setVerticalScrollBarEnabled.cca_continue((Class<?>) cls).equals(Cardinal.class.getName());
                        throw null;
                    }
                }
                int i25 = getActionCode;
                int i26 = (i25 & -112) | ((~i25) & 111);
                int i27 = -(-((i25 & 111) << 1));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                getString = i28 % 128;
                int i29 = i28 % 2;
                z2 = true;
                CardinalUiType = z2;
                values.Cardinal("CardinalConfigure", "LASSO started");
                setSaveFromParentEnabled.getInstance().cca_continue(context, cardinalConfigurationParameters, CardinalUiType);
                int i192 = getString;
                int i202 = i192 | 11;
                int i212 = i202 << 1;
                int i222 = -((~(i192 & 11)) & i202);
                int i232 = (i212 ^ i222) + ((i222 & i212) << 1);
                getActionCode = i232 % 128;
                int i242 = i232 % 2;
                return;
            }
            values.cca_continue(new CardinalError(10102), (String) null);
            throw new InvalidInputException("InvalidInputException", new Throwable("Invalid Input Exception - Application Context"));
        }
        values.cca_continue(new CardinalError(10101, new StringBuilder("Error: Current State, Next state  :").append(getWarnings).append(", ").append(Cardinal.Configured).toString()), (String) null);
        int i30 = ((getActionCode + 110) - 0) - 1;
        getString = i30 % 128;
        int i31 = i30 % 2;
    }

    private void init(CardinalConfigurationParameters cardinalConfigurationParameters) {
        int i = getString;
        int i2 = ((i ^ 61) | (i & 61)) << 1;
        int i3 = -(((~i) & 61) | (i & -62));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getActionCode = i4 % 128;
        int i5 = i4 % 2;
        init = CardinalActionCode.Cardinal(cardinalConfigurationParameters);
        this.valueOf = cardinalConfigurationParameters;
        int i6 = getActionCode;
        int i7 = ((i6 ^ 33) - (~(-(-((i6 & 33) << 1))))) - 1;
        getString = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void configure(String str, CardinalInitService cardinalInitService) throws InvalidInputException {
        int i = getString;
        int i2 = i & 77;
        boolean z = true;
        int i3 = ((i ^ 77) | i2) << 1;
        int i4 = -((i | 77) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getActionCode = i5 % 128;
        int i6 = i5 % 2;
        values.Cardinal("CardinalInit", "Init started");
        if (cardinalInitService != null) {
            this.onCReqSuccess = cardinalInitService;
            if ((getWarnings.init(getWarnings, Cardinal.InitStarted) ? 4 : 'E') != 4) {
                values.cca_continue(new CardinalError(10201, new StringBuilder("Error: Current State, Next state  :").append(getWarnings).append(", ").append(Cardinal.InitStarted).toString()), (String) null);
                init(new CardinalError(10201));
                int i7 = (getActionCode + 7) - 1;
                int i8 = (i7 ^ -1) + ((i7 & -1) << 1);
                getString = i8 % 128;
                if ((i8 % 2 == 0 ? 'V' : 'B') != 'B') {
                    int i9 = 57 / 0;
                    return;
                }
                return;
            }
            int i10 = getString;
            int i11 = ((i10 & -74) | ((~i10) & 73)) + ((i10 & 73) << 1);
            getActionCode = i11 % 128;
            if (i11 % 2 != 0) {
                z = false;
            }
            Cardinal(str);
            if (!z) {
                throw null;
            }
            return;
        }
        values.cca_continue(new CardinalError(10203), (String) null);
        throw new InvalidInputException("InvalidInputException", new Throwable("Null CardinalInitService received on init"));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public final void Cardinal(String str, String str2, CardinalInitService cardinalInitService) throws InvalidInputException {
        int i = (getString + 108) - 1;
        getActionCode = i % 128;
        ? r3 = 0;
        if ((i % 2 != 0 ? '\\' : 17) == '\\') {
            super.hashCode();
            throw r3;
        } else if (cardinalInitService != null) {
            this.onCReqSuccess = cardinalInitService;
            if (getWarnings.init(getWarnings, Cardinal.InitStarted)) {
                int i2 = getString;
                int i3 = (i2 & -38) | ((~i2) & 37);
                int i4 = -(-((i2 & 37) << 1));
                int i5 = (i3 & i4) + (i4 | i3);
                getActionCode = i5 % 128;
                int i6 = i5 % 2;
                values.Cardinal("CardinalInit", "Init started");
                if (!(str2 == null)) {
                    int i7 = getActionCode;
                    int i8 = i7 & 57;
                    int i9 = (i7 ^ 57) | i8;
                    int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                    int i11 = i10 % 128;
                    getString = i11;
                    boolean z = i10 % 2 != 0;
                    this.CardinalEnvironment = str2;
                    if (!z) {
                        int i12 = 16 / 0;
                    }
                    int i13 = (i11 ^ 77) + ((i11 & 77) << 1);
                    getActionCode = i13 % 128;
                    int i14 = i13 % 2;
                }
                Cardinal(str);
                int i15 = getActionCode + 41;
                getString = i15 % 128;
                int i16 = i15 % 2;
                return;
            }
            values.cca_continue(new CardinalError(10201, new StringBuilder("Error: Current State, Next state  :").append(getWarnings).append(", ").append(Cardinal.InitStarted).toString()), r3);
            init(new CardinalError(10201));
            int i17 = getString;
            int i18 = (((i17 | 16) << 1) - (i17 ^ 16)) - 1;
            getActionCode = i18 % 128;
            if ((i18 % 2 != 0 ? Typography.less : ':') != ':') {
                super.hashCode();
                throw r3;
            }
        } else {
            values.cca_continue(new CardinalError(10203), r3);
            throw new InvalidInputException("InvalidInputException", new Throwable("Null CardinalInitService received on init"));
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02e5, code lost:
        values.cca_continue(new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError(10602), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ff, code lost:
        throw new com.cardinalcommerce.shared.models.exceptions.InvalidInputException("InvalidInputException", new java.lang.Throwable("Null CardinalValidateReceiver received on cca_continue"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r0 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r0 != null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getInstance(java.lang.String r17, java.lang.String r18, android.app.Activity r19, com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver r20) throws com.cardinalcommerce.shared.models.exceptions.InvalidInputException {
        /*
            r16 = this;
            r10 = r16
            r11 = r19
            r0 = r20
            int r1 = getActionCode
            r2 = r1 ^ 67
            r3 = 67
            r1 = r1 & r3
            r12 = 1
            int r1 = r1 << r12
            int r2 = r2 + r1
            int r1 = r2 % 128
            getString = r1
            int r2 = r2 % 2
            r1 = 88
            if (r2 != 0) goto L_0x001d
            r2 = 47
            goto L_0x001e
        L_0x001d:
            r2 = r1
        L_0x001e:
            r13 = 0
            r14 = 0
            if (r2 == r1) goto L_0x002b
            r1 = 44
            int r1 = r1 / r14
            if (r0 == 0) goto L_0x02e5
            goto L_0x002d
        L_0x0028:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x002b:
            if (r0 == 0) goto L_0x02e5
        L_0x002d:
            r10.cleanup = r0
            com.cardinalcommerce.a.Cardinal r0 = getWarnings
            com.cardinalcommerce.a.Cardinal r1 = com.cardinalcommerce.a.Cardinal.Continue
            boolean r0 = com.cardinalcommerce.a.getWarnings.init(r0, r1)
            r1 = 91
            if (r0 == 0) goto L_0x003e
            r0 = 98
            goto L_0x003f
        L_0x003e:
            r0 = r1
        L_0x003f:
            java.lang.String r15 = ""
            if (r0 == r1) goto L_0x0297
            int r0 = getString
            int r0 = r0 + 49
            int r1 = r0 % 128
            getActionCode = r1
            int r0 = r0 % 2
            if (r17 == 0) goto L_0x0051
            r0 = r14
            goto L_0x0052
        L_0x0051:
            r0 = r12
        L_0x0052:
            if (r0 == 0) goto L_0x0055
            goto L_0x0068
        L_0x0055:
            r0 = r1 ^ 87
            r1 = r1 & 87
            r1 = r1 | r0
            int r1 = r1 << r12
            int r1 = r1 - r0
            int r0 = r1 % 128
            getString = r0
            int r1 = r1 % 2
            boolean r0 = r17.isEmpty()
            if (r0 == 0) goto L_0x0091
        L_0x0068:
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10603(0x296b, float:1.4858E-41)
            r1.<init>(r2)
            r10.cca_continue(r0, r1, r11, r15)
            int r0 = getActionCode
            r1 = r0 & 7
            int r2 = ~r1
            r0 = r0 | 7
            r0 = r0 & r2
            int r1 = r1 << r12
            int r0 = r0 + r1
            int r1 = r0 % 128
            getString = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r12 = r14
        L_0x0088:
            if (r12 != 0) goto L_0x008b
            return
        L_0x008b:
            super.hashCode()     // Catch:{ all -> 0x008f }
            throw r13     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            r0 = 63
            if (r18 == 0) goto L_0x0098
            r1 = 13
            goto L_0x0099
        L_0x0098:
            r1 = r0
        L_0x0099:
            if (r1 == r0) goto L_0x0269
            int r0 = getActionCode
            r1 = r0 | 29
            int r1 = r1 << r12
            r0 = r0 ^ 29
            int r1 = r1 - r0
            int r0 = r1 % 128
            getString = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x00ad
            r0 = r14
            goto L_0x00ae
        L_0x00ad:
            r0 = r12
        L_0x00ae:
            if (r0 != r12) goto L_0x0260
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x00b8
            goto L_0x0269
        L_0x00b8:
            if (r11 == 0) goto L_0x00bd
            r0 = 57
            goto L_0x00be
        L_0x00bd:
            r0 = r12
        L_0x00be:
            if (r0 == r12) goto L_0x023d
            int r0 = getString
            r1 = r0 & 9
            r0 = r0 ^ 9
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r2 = r1 | r0
            int r2 = r2 << r12
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            getActionCode = r0
            int r2 = r2 % 2
            r0 = 34
            if (r2 == 0) goto L_0x00da
            r1 = r0
            goto L_0x00dc
        L_0x00da:
            r1 = 16
        L_0x00dc:
            if (r1 == r0) goto L_0x0236
            android.content.Context r0 = r19.getApplicationContext()
            if (r0 != 0) goto L_0x00e6
            goto L_0x023d
        L_0x00e6:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r10.Cardinal = r0     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.getString r0 = values     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.String r1 = "CardinalContinue"
            java.lang.String r2 = "Continue started with transactionID: "
            java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.onValidated r3 = r10.onValidated     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.String r3 = r3.init()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r0.cca_continue(r1, r2, r3)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.String r0 = com.cardinalcommerce.a.setScrollbarFadingEnabled.Cardinal(r18)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.setTransitionVisibility r9 = new com.cardinalcommerce.a.setTransitionVisibility     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.setScrollX r0 = r9.getInstance     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            boolean r0 = r0.cca_continue()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            if (r0 == 0) goto L_0x0190
            com.cardinalcommerce.shared.cs.userinterfaces.ChallengeUtils.configure = r14     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r0 = r10.valueOf     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            int r0 = r0.getChallengeTimeout()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r10.getInstance((int) r0)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            android.content.Context r1 = r19.getApplicationContext()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r10.CardinalError = r0     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            android.content.Context r0 = r19.getApplicationContext()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.setAlpha r1 = com.cardinalcommerce.a.setAlpha.cca_continue(r0)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.setSaveEnabled r2 = com.cardinalcommerce.a.setSaveEnabled.CARDINAL     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r0 = r10.valueOf     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r3 = r0.getUICustomization()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.onValidated r5 = r10.onValidated     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.String r6 = r10.getSDKVersion     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r0 = r10.valueOf     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.String r8 = com.cardinalcommerce.a.CardinalActionCode.Cardinal(r0)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r0 = r10.valueOf     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.String r0 = r0.getThreeDSRequestorAppURL()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r4 = r16
            r7 = r17
            r14 = r9
            r9 = r0
            r1.Cardinal(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.ref.WeakReference<android.app.Activity> r0 = r10.Cardinal     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.Object r0 = r0.get()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r1 = r10.valueOf     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver r2 = r10.cleanup     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.onValidated r3 = r10.onValidated     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.String r3 = r3.init()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.cca_continue.cca_continue(r14, r0, r1, r2, r3)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.Cardinal r0 = com.cardinalcommerce.a.Cardinal.Continue     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            getWarnings = r0     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            int r0 = getString
            r1 = r0 & -66
            int r2 = ~r0
            r3 = 65
            r2 = r2 & r3
            r1 = r1 | r2
            r0 = r0 & r3
            int r0 = r0 << r12
            int r1 = r1 + r0
            int r0 = r1 % 128
            getActionCode = r0
            int r1 = r1 % 2
            r0 = 74
            if (r1 == 0) goto L_0x0185
            r1 = r0
            goto L_0x0187
        L_0x0185:
            r1 = 82
        L_0x0187:
            if (r1 == r0) goto L_0x018a
            return
        L_0x018a:
            super.hashCode()     // Catch:{ all -> 0x018e }
            throw r13     // Catch:{ all -> 0x018e }
        L_0x018e:
            r0 = move-exception
            throw r0
        L_0x0190:
            com.cardinalcommerce.a.getString r0 = values     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r2 = 10606(0x296e, float:1.4862E-41)
            r1.<init>(r2)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.a.onValidated r3 = r10.onValidated     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            java.lang.String r3 = r3.init()     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r0.cca_continue(r1, r3)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            r10.cca_continue(r0, r1, r11, r15)     // Catch:{ JSONException -> 0x01c1, UnsupportedOperationException -> 0x01bf, NullPointerException -> 0x01bd }
            int r0 = getActionCode
            r1 = r0 & 7
            int r2 = ~r1
            r0 = r0 | 7
            r0 = r0 & r2
            int r1 = r1 << r12
            int r0 = r0 + r1
            int r1 = r0 % 128
            getString = r1
            int r0 = r0 % 2
            return
        L_0x01bd:
            r0 = move-exception
            goto L_0x01c2
        L_0x01bf:
            r0 = move-exception
            goto L_0x01c2
        L_0x01c1:
            r0 = move-exception
        L_0x01c2:
            boolean r1 = r0 instanceof java.lang.NullPointerException
            if (r1 == 0) goto L_0x01f5
            com.cardinalcommerce.a.getString r1 = values
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r2 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            java.lang.NullPointerException r0 = (java.lang.NullPointerException) r0
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r3 = 10617(0x2979, float:1.4878E-41)
            r2.<init>((int) r3, (java.lang.String) r0)
            com.cardinalcommerce.a.onValidated r0 = r10.onValidated
            java.lang.String r0 = r0.init()
            r1.cca_continue(r2, r0)
            int r0 = getActionCode
            r1 = r0 & 83
            r0 = r0 ^ 83
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r12
            int r0 = r1 % 128
            getString = r0
            int r1 = r1 % 2
            goto L_0x0218
        L_0x01f5:
            com.cardinalcommerce.a.getString r1 = values
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r2 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r3 = 10610(0x2972, float:1.4868E-41)
            java.lang.String r0 = r0.getLocalizedMessage()
            r2.<init>((int) r3, (java.lang.String) r0)
            com.cardinalcommerce.a.onValidated r0 = r10.onValidated
            java.lang.String r0 = r0.init()
            r1.cca_continue(r2, r0)
            int r0 = getString
            r1 = r0 & 53
            r0 = r0 | 53
            int r1 = r1 + r0
            int r0 = r1 % 128
            getActionCode = r0
            int r1 = r1 % 2
        L_0x0218:
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10605(0x296d, float:1.4861E-41)
            r1.<init>(r2)
            r10.cca_continue(r0, r1, r11, r15)
            int r0 = getString
            r1 = r0 | 102(0x66, float:1.43E-43)
            int r1 = r1 << r12
            r0 = r0 ^ 102(0x66, float:1.43E-43)
            int r1 = r1 - r0
            r2 = 0
            int r1 = r1 - r2
            int r1 = r1 - r12
            int r0 = r1 % 128
            getActionCode = r0
            int r1 = r1 % 2
            return
        L_0x0236:
            r19.getApplicationContext()
            throw r13     // Catch:{ all -> 0x023a }
        L_0x023a:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x023d:
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10609(0x2971, float:1.4866E-41)
            r1.<init>(r2)
            r10.cca_continue(r0, r1, r11, r15)
            int r0 = getActionCode
            r1 = r0 & 35
            int r2 = ~r1
            r0 = r0 | 35
            r0 = r0 & r2
            int r1 = r1 << r12
            int r1 = -r1
            int r1 = -r1
            r2 = r0 | r1
            int r2 = r2 << r12
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            getString = r0
            int r2 = r2 % 2
            return
        L_0x0260:
            r18.isEmpty()
            super.hashCode()     // Catch:{ all -> 0x0267 }
            throw r13     // Catch:{ all -> 0x0267 }
        L_0x0267:
            r0 = move-exception
            throw r0
        L_0x0269:
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10604(0x296c, float:1.486E-41)
            r1.<init>(r2)
            r10.cca_continue(r0, r1, r11, r15)
            int r0 = getString
            r1 = r0 & 33
            r0 = r0 ^ 33
            r0 = r0 | r1
            r2 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r12
            int r2 = r2 + r0
            int r0 = r2 % 128
            getActionCode = r0
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x028b
            r2 = 0
            goto L_0x028c
        L_0x028b:
            r2 = r12
        L_0x028c:
            if (r2 == r12) goto L_0x0296
            r0 = 14
            r1 = 0
            int r0 = r0 / r1
            return
        L_0x0293:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0296:
            return
        L_0x0297:
            com.cardinalcommerce.a.getString r0 = values
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid Transition: An error occurred during Cardinal Init."
            r2.<init>(r4)
            com.cardinalcommerce.a.Cardinal r4 = getWarnings
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = ", "
            java.lang.StringBuilder r2 = r2.append(r4)
            com.cardinalcommerce.a.Cardinal r4 = com.cardinalcommerce.a.Cardinal.Continue
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 10601(0x2969, float:1.4855E-41)
            r1.<init>((int) r4, (java.lang.String) r2)
            com.cardinalcommerce.a.onValidated r2 = r10.onValidated
            java.lang.String r2 = r2.init()
            r0.cca_continue(r1, r2)
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r1.<init>(r4)
            r10.cca_continue(r0, r1, r11, r15)
            int r0 = getString
            r1 = r0 & -68
            int r2 = ~r0
            r2 = r2 & r3
            r1 = r1 | r2
            r0 = r0 & r3
            int r0 = r0 << r12
            int r0 = -r0
            int r0 = -r0
            int r0 = ~r0
            int r1 = r1 - r0
            int r1 = r1 - r12
            int r0 = r1 % 128
            getActionCode = r0
            int r1 = r1 % 2
            return
        L_0x02e5:
            com.cardinalcommerce.a.getString r0 = values
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r1 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r2 = 10602(0x296a, float:1.4857E-41)
            r1.<init>(r2)
            r0.cca_continue(r1, r13)
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r1 = "Null CardinalValidateReceiver received on cca_continue"
            r0.<init>(r1)
            com.cardinalcommerce.shared.models.exceptions.InvalidInputException r1 = new com.cardinalcommerce.shared.models.exceptions.InvalidInputException
            java.lang.String r2 = "InvalidInputException"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getInstance.getInstance(java.lang.String, java.lang.String, android.app.Activity, com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver):void");
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r18.isEmpty() != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        if (r18.isEmpty() != false) goto L_0x01d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void cca_continue(java.lang.String r17, java.lang.String r18, com.cardinalcommerce.cardinalmobilesdk.models.CardinalChallengeObserver r19) throws com.cardinalcommerce.shared.models.exceptions.InvalidInputException {
        /*
            r16 = this;
            r1 = r16
            r2 = r19
            int r0 = getString
            r3 = r0 & 65
            int r4 = ~r3
            r5 = r0 | 65
            r4 = r4 & r5
            r5 = 1
            int r3 = r3 << r5
            r6 = r4 | r3
            int r6 = r6 << r5
            r3 = r3 ^ r4
            int r6 = r6 - r3
            int r3 = r6 % 128
            getActionCode = r3
            int r6 = r6 % 2
            r3 = 22
            if (r2 == 0) goto L_0x001f
            r4 = r3
            goto L_0x0021
        L_0x001f:
            r4 = 36
        L_0x0021:
            r6 = 0
            if (r4 != r3) goto L_0x0292
            r3 = r0 | 39
            int r4 = r3 << 1
            r0 = r0 & 39
            int r0 = ~r0
            r0 = r0 & r3
            int r4 = r4 - r0
            int r0 = r4 % 128
            getActionCode = r0
            int r4 = r4 % 2
            r0 = 76
            r3 = 24
            if (r4 == 0) goto L_0x003b
            r4 = r0
            goto L_0x003c
        L_0x003b:
            r4 = r3
        L_0x003c:
            if (r4 == r0) goto L_0x0287
            com.cardinalcommerce.a.Cardinal r0 = getWarnings
            com.cardinalcommerce.a.Cardinal r4 = com.cardinalcommerce.a.Cardinal.Continue
            boolean r0 = com.cardinalcommerce.a.getWarnings.init(r0, r4)
            r4 = 57
            r7 = 86
            if (r0 == 0) goto L_0x004e
            r0 = r4
            goto L_0x004f
        L_0x004e:
            r0 = r7
        L_0x004f:
            java.lang.String r8 = ""
            r9 = 0
            if (r0 == r7) goto L_0x0229
            r0 = 15
            if (r17 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r3 = r0
        L_0x005a:
            if (r3 == r0) goto L_0x0204
            int r0 = getActionCode
            int r0 = r0 + 92
            int r0 = r0 - r5
            int r3 = r0 % 128
            getString = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x006b
            r0 = r9
            goto L_0x006c
        L_0x006b:
            r0 = r5
        L_0x006c:
            if (r0 == 0) goto L_0x01fb
            boolean r0 = r17.isEmpty()
            if (r0 == 0) goto L_0x0076
            goto L_0x0204
        L_0x0076:
            if (r18 == 0) goto L_0x007a
            r0 = r9
            goto L_0x007b
        L_0x007a:
            r0 = r5
        L_0x007b:
            if (r0 == r5) goto L_0x01d1
            int r0 = getString
            r3 = r0 | 39
            int r3 = r3 << r5
            r0 = r0 ^ 39
            int r3 = r3 - r0
            int r0 = r3 % 128
            getActionCode = r0
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x008f
            r0 = r9
            goto L_0x0090
        L_0x008f:
            r0 = r5
        L_0x0090:
            if (r0 == 0) goto L_0x009a
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x00a5
            goto L_0x01d1
        L_0x009a:
            boolean r0 = r18.isEmpty()
            r3 = 44
            int r3 = r3 / r9
            if (r0 == 0) goto L_0x00a5
            goto L_0x01d1
        L_0x00a5:
            com.cardinalcommerce.a.getString r0 = values     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            java.lang.String r3 = "CardinalContinue"
            java.lang.String r4 = "Continue started with transactionID: "
            java.lang.String r6 = java.lang.String.valueOf(r17)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            java.lang.String r4 = r4.concat(r6)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.a.onValidated r6 = r1.onValidated     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            java.lang.String r6 = r6.init()     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r0.cca_continue(r3, r4, r6)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            java.lang.String r0 = com.cardinalcommerce.a.setScrollbarFadingEnabled.Cardinal(r18)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.a.setTransitionVisibility r3 = new com.cardinalcommerce.a.setTransitionVisibility     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.a.setScrollX r0 = r3.getInstance     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            boolean r0 = r0.cca_continue()     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            if (r0 == 0) goto L_0x00ce
            r9 = r5
        L_0x00ce:
            if (r9 == r5) goto L_0x0109
            com.cardinalcommerce.a.getString r0 = values     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r3 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r4 = 10606(0x296e, float:1.4862E-41)
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.a.onValidated r6 = r1.onValidated     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            java.lang.String r6 = r6.init()     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r0.cca_continue(r3, r6)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r0 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r1.getInstance((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r0)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r3 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r2.cca_continue(r0, r3, r8)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            int r0 = getString
            r2 = r0 ^ 115(0x73, float:1.61E-43)
            r0 = r0 & 115(0x73, float:1.61E-43)
            int r0 = r0 << r5
            int r0 = -r0
            int r0 = -r0
            r3 = r2 ^ r0
            r0 = r0 & r2
            int r0 = r0 << r5
            int r3 = r3 + r0
            int r0 = r3 % 128
            getActionCode = r0
            int r3 = r3 % 2
            return
        L_0x0109:
            int r0 = getActionCode
            r4 = r0 & 126(0x7e, float:1.77E-43)
            r0 = r0 | 126(0x7e, float:1.77E-43)
            int r4 = r4 + r0
            int r4 = r4 - r5
            int r0 = r4 % 128
            getString = r0
            int r4 = r4 % 2
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r0 = r1.valueOf     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.shared.userinterfaces.UiCustomization r10 = r0.getUICustomization()     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.a.onValidated r11 = r1.onValidated     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            java.lang.String r12 = r1.getSDKVersion     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r0 = r1.valueOf     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            java.lang.String r14 = com.cardinalcommerce.a.CardinalActionCode.Cardinal(r0)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r0 = r1.valueOf     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            java.lang.String r15 = r0.getThreeDSRequestorAppURL()     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r13 = r17
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalChallengeObserver.Cardinal(r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r0 = r1.valueOf     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.a.onValidated r4 = r1.onValidated     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            java.lang.String r4 = r4.init()     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            r2.init(r3, r0, r4)     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            com.cardinalcommerce.a.Cardinal r0 = com.cardinalcommerce.a.Cardinal.Continue     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            getWarnings = r0     // Catch:{ JSONException -> 0x0154, UnsupportedOperationException -> 0x0152, NullPointerException -> 0x0150 }
            int r0 = getActionCode
            r2 = r0 ^ 111(0x6f, float:1.56E-43)
            r0 = r0 & 111(0x6f, float:1.56E-43)
            int r0 = r0 << r5
            int r2 = r2 + r0
            int r0 = r2 % 128
            getString = r0
            int r2 = r2 % 2
            return
        L_0x0150:
            r0 = move-exception
            goto L_0x0155
        L_0x0152:
            r0 = move-exception
            goto L_0x0155
        L_0x0154:
            r0 = move-exception
        L_0x0155:
            boolean r3 = r0 instanceof java.lang.NullPointerException
            if (r3 == 0) goto L_0x0184
            com.cardinalcommerce.a.getString r3 = values
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r4 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            java.lang.NullPointerException r0 = (java.lang.NullPointerException) r0
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r6 = 10617(0x2979, float:1.4878E-41)
            r4.<init>((int) r6, (java.lang.String) r0)
            com.cardinalcommerce.a.onValidated r0 = r1.onValidated
            java.lang.String r0 = r0.init()
            r3.cca_continue(r4, r0)
            int r0 = getActionCode
            r3 = r0 | 41
            int r3 = r3 << r5
            r0 = r0 ^ 41
            int r3 = r3 - r0
            int r0 = r3 % 128
            getString = r0
        L_0x0181:
            int r3 = r3 % 2
            goto L_0x01a8
        L_0x0184:
            com.cardinalcommerce.a.getString r3 = values
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r4 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r6 = 10610(0x2972, float:1.4868E-41)
            java.lang.String r0 = r0.getLocalizedMessage()
            r4.<init>((int) r6, (java.lang.String) r0)
            com.cardinalcommerce.a.onValidated r0 = r1.onValidated
            java.lang.String r0 = r0.init()
            r3.cca_continue(r4, r0)
            int r0 = getString
            r3 = r0 ^ 62
            r0 = r0 & 62
            int r0 = r0 << r5
            int r3 = r3 + r0
            int r3 = r3 - r5
            int r0 = r3 % 128
            getActionCode = r0
            goto L_0x0181
        L_0x01a8:
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r0 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r3 = 10605(0x296d, float:1.4861E-41)
            r0.<init>(r3)
            r1.getInstance((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r0)
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r4 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r4.<init>(r3)
            r2.cca_continue(r0, r4, r8)
            int r0 = getString
            r2 = r0 & 21
            r0 = r0 | 21
            r3 = r2 ^ r0
            r0 = r0 & r2
            int r0 = r0 << r5
            int r3 = r3 + r0
            int r0 = r3 % 128
            getActionCode = r0
            int r3 = r3 % 2
            return
        L_0x01ce:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x01d1:
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r0 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r3 = 10604(0x296c, float:1.486E-41)
            r0.<init>(r3)
            r1.getInstance((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r0)
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r4 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r4.<init>(r3)
            r2.cca_continue(r0, r4, r8)
            int r0 = getString
            r2 = r0 & -86
            int r3 = ~r0
            r3 = r3 & 85
            r2 = r2 | r3
            r0 = r0 & 85
            int r0 = r0 << r5
            r3 = r2 & r0
            r0 = r0 | r2
            int r3 = r3 + r0
            int r0 = r3 % 128
            getActionCode = r0
            int r3 = r3 % 2
            return
        L_0x01fb:
            r17.isEmpty()
            super.hashCode()     // Catch:{ all -> 0x0202 }
            throw r6     // Catch:{ all -> 0x0202 }
        L_0x0202:
            r0 = move-exception
            throw r0
        L_0x0204:
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r0 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r3 = 10603(0x296b, float:1.4858E-41)
            r0.<init>(r3)
            r1.getInstance((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r0)
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r5 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r5.<init>(r3)
            r2.cca_continue(r0, r5, r8)
            int r0 = getString
            r2 = r0 & 57
            r0 = r0 ^ r4
            r0 = r0 | r2
            r3 = r2 & r0
            r0 = r0 | r2
            int r3 = r3 + r0
            int r0 = r3 % 128
            getActionCode = r0
            int r3 = r3 % 2
            return
        L_0x0229:
            com.cardinalcommerce.a.getString r0 = values
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r3 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid Transition: An error occurred during Cardinal Init."
            r4.<init>(r6)
            com.cardinalcommerce.a.Cardinal r6 = getWarnings
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = ", "
            java.lang.StringBuilder r4 = r4.append(r6)
            com.cardinalcommerce.a.Cardinal r6 = com.cardinalcommerce.a.Cardinal.Continue
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 10601(0x2969, float:1.4855E-41)
            r3.<init>((int) r6, (java.lang.String) r4)
            com.cardinalcommerce.a.onValidated r4 = r1.onValidated
            java.lang.String r4 = r4.init()
            r0.cca_continue(r3, r4)
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r0 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r0.<init>(r6)
            r1.getInstance((com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError) r0)
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r0 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r3 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r3.<init>(r6)
            r2.cca_continue(r0, r3, r8)
            int r0 = getActionCode
            r2 = r0 & 101(0x65, float:1.42E-43)
            r0 = r0 ^ 101(0x65, float:1.42E-43)
            r0 = r0 | r2
            int r2 = r2 + r0
            int r0 = r2 % 128
            getString = r0
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x027c
            r0 = r5
            goto L_0x027d
        L_0x027c:
            r0 = r9
        L_0x027d:
            if (r0 == r5) goto L_0x0280
            return
        L_0x0280:
            r0 = 8
            int r0 = r0 / r9
            return
        L_0x0284:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0287:
            com.cardinalcommerce.a.Cardinal r0 = getWarnings
            com.cardinalcommerce.a.Cardinal r2 = com.cardinalcommerce.a.Cardinal.Continue
            com.cardinalcommerce.a.getWarnings.init(r0, r2)
            throw r6     // Catch:{ all -> 0x028f }
        L_0x028f:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0292:
            com.cardinalcommerce.a.getString r0 = values
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r2 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r3 = 10602(0x296a, float:1.4857E-41)
            r2.<init>(r3)
            r0.cca_continue(r2, r6)
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r2 = "Null CardinalChallengeObserver received on cca_continue"
            r0.<init>(r2)
            com.cardinalcommerce.shared.models.exceptions.InvalidInputException r2 = new com.cardinalcommerce.shared.models.exceptions.InvalidInputException
            java.lang.String r3 = "InvalidInputException"
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getInstance.cca_continue(java.lang.String, java.lang.String, com.cardinalcommerce.cardinalmobilesdk.models.CardinalChallengeObserver):void");
    }

    public static List<Warning> Cardinal() {
        int i = getActionCode;
        int i2 = (i & 101) + (i | 101);
        getString = i2 % 128;
        Throwable th = null;
        if (!(i2 % 2 == 0 ? true : true)) {
            values.Cardinal("CardinalInit", "Warnings accessed");
            setTop cca_continue2 = setSaveFromParentEnabled.getInstance().cca_continue();
            if (cca_continue2 != null) {
                ArrayList arrayList = new ArrayList(cca_continue2.cca_continue());
                int i3 = getString;
                int i4 = ((i3 | 68) << 1) - (i3 ^ 68);
                int i5 = (i4 & -1) + (i4 | -1);
                getActionCode = i5 % 128;
                if ((i5 % 2 != 0 ? 'A' : 'M') != 'A') {
                    return arrayList;
                }
                super.hashCode();
                throw th;
            }
            ArrayList arrayList2 = new ArrayList();
            int i6 = getString;
            int i7 = i6 & 39;
            int i8 = ((i6 ^ 39) | i7) << 1;
            int i9 = -((i6 | 39) & (~i7));
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            getActionCode = i10 % 128;
            int i11 = i10 % 2;
            return arrayList2;
        }
        values.Cardinal("CardinalInit", "Warnings accessed");
        setSaveFromParentEnabled.getInstance().cca_continue();
        throw th;
    }

    public static String cca_continue() {
        int i = getActionCode;
        int i2 = (i & 55) + (i | 55);
        getString = i2 % 128;
        if ((i2 % 2 == 0 ? 'G' : SignatureVisitor.SUPER) != 'G') {
            return ThreeDSStrings.SDKVersion;
        }
        String str = ThreeDSStrings.SDKVersion;
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private void Cardinal(String str) {
        int i = getActionCode;
        int i2 = i & 37;
        int i3 = (i ^ 37) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getString = i4 % 128;
        int i5 = i4 % 2;
        boolean z = false;
        ? r4 = 0;
        if (!(this.valueOf.getUiType() != CardinalUiType.NATIVE)) {
            int i6 = getString;
            int i7 = i6 & 7;
            int i8 = i6 | 7;
            int i9 = (i7 & i8) + (i8 | i7);
            getActionCode = i9 % 128;
            int i10 = i9 % 2;
            if (this.valueOf.getRenderType().toString().contains(CardinalRenderType.HTML.toString())) {
                CardinalError cardinalError = new CardinalError(10207);
                values.cca_continue(cardinalError, r4);
                init(cardinalError);
                int i11 = getActionCode;
                int i12 = ((i11 ^ 50) + ((i11 & 50) << 1)) - 1;
                getString = i12 % 128;
                if (i12 % 2 != 0) {
                    z = true;
                }
                if (!z) {
                    super.hashCode();
                    throw r4;
                }
                return;
            }
        }
        if ((str != null ? 'P' : '_') != '_') {
            int i13 = getString + 75;
            getActionCode = i13 % 128;
            int i14 = i13 % 2;
            if (!str.isEmpty()) {
                this.getSDKVersion = str;
                try {
                    CardinalEnvironment cardinalEnvironment = new CardinalEnvironment(this, str, init);
                    if (getWarnings != Cardinal.InitStarted) {
                        z = true;
                    }
                    if (!z) {
                        int i15 = getActionCode;
                        int i16 = i15 & 29;
                        int i17 = (i15 | 29) & (~i16);
                        int i18 = i16 << 1;
                        int i19 = (i17 & i18) + (i17 | i18);
                        getString = i19 % 128;
                        int i20 = i19 % 2;
                        values.Cardinal("CardinalInit", "Previous centinel API init task cancelled");
                        cardinalEnvironment.configure();
                        int i21 = getString;
                        int i22 = (i21 ^ 33) + ((i21 & 33) << 1);
                        getActionCode = i22 % 128;
                        int i23 = i22 % 2;
                    }
                    cardinalEnvironment.cca_continue();
                    getWarnings = Cardinal.InitStarted;
                    int i24 = getString;
                    int i25 = ((i24 ^ 39) | (i24 & 39)) << 1;
                    int i26 = -(((~i24) & 39) | (i24 & -40));
                    int i27 = (i25 & i26) + (i26 | i25);
                    getActionCode = i27 % 128;
                    if ((i27 % 2 != 0 ? ']' : '2') != '2') {
                        throw r4;
                    }
                    return;
                } catch (JSONException e) {
                    values.cca_continue(new CardinalError(10205, new StringBuilder("Cardinal Init Error").append(e.getLocalizedMessage()).toString()), r4);
                    init(new CardinalError(10205));
                    return;
                }
            }
        }
        values.cca_continue(new CardinalError(10202), r4);
        init(new CardinalError(10202));
        int i28 = getString;
        int i29 = ((i28 | 105) << 1) - (i28 ^ 105);
        getActionCode = i29 % 128;
        if ((i29 % 2 != 0 ? ' ' : 'F') != 'F') {
            super.hashCode();
            throw r4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r5.onCReqSuccess != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r5.onCReqSuccess != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r6) {
        /*
            r5 = this;
            int r0 = getActionCode
            r1 = r0 | 115(0x73, float:1.61E-43)
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 115(0x73, float:1.61E-43)
            int r1 = r1 - r0
            int r0 = r1 % 128
            getString = r0
            int r1 = r1 % 2
            r0 = 0
            if (r1 != 0) goto L_0x0014
            r1 = r2
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            if (r1 == r2) goto L_0x001c
            com.cardinalcommerce.cardinalmobilesdk.services.CardinalInitService r1 = r5.onCReqSuccess
            if (r1 == 0) goto L_0x009c
            goto L_0x0023
        L_0x001c:
            com.cardinalcommerce.cardinalmobilesdk.services.CardinalInitService r1 = r5.onCReqSuccess
            r3 = 28
            int r3 = r3 / r0
            if (r1 == 0) goto L_0x009c
        L_0x0023:
            com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse r1 = new com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r3 = com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode.ERROR
            r1.<init>(r0, r3, r6)
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r6 = r5.valueOf
            r3 = 9
            if (r6 == 0) goto L_0x0032
            r4 = r3
            goto L_0x0034
        L_0x0032:
            r4 = 13
        L_0x0034:
            if (r4 == r3) goto L_0x0050
            com.cardinalcommerce.a.getString r6 = values
            java.lang.String r3 = "CardinalInit"
            java.lang.String r4 = "ConfigParameters are null"
            r6.Cardinal(r3, r4)
            int r6 = getActionCode
            r3 = r6 & 3
            int r4 = ~r3
            r6 = r6 | 3
            r6 = r6 & r4
            int r3 = r3 << r2
            int r6 = r6 + r3
            int r3 = r6 % 128
            getString = r3
            int r6 = r6 % 2
            goto L_0x0082
        L_0x0050:
            int r3 = getString
            r4 = r3 ^ 118(0x76, float:1.65E-43)
            r3 = r3 & 118(0x76, float:1.65E-43)
            int r3 = r3 << r2
            int r4 = r4 + r3
            r3 = r4 ^ -1
            r4 = r4 & -1
            int r4 = r4 << r2
            int r3 = r3 + r4
            int r4 = r3 % 128
            getActionCode = r4
            int r3 = r3 % 2
            com.cardinalcommerce.a.getString r3 = values
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment r6 = r6.getEnvironment()
            java.lang.String r6 = r6.toString()
            r3.init(r6)
            int r6 = getString
            int r6 = r6 + 119
            int r6 = r6 - r2
            r3 = r6 ^ -1
            r6 = r6 & -1
            int r6 = r6 << r2
            int r3 = r3 + r6
            int r6 = r3 % 128
            getActionCode = r6
            int r3 = r3 % 2
        L_0x0082:
            com.cardinalcommerce.cardinalmobilesdk.services.CardinalInitService r6 = r5.onCReqSuccess
            java.lang.String r3 = ""
            r6.onValidated(r1, r3)
            int r6 = getString
            r1 = r6 & 123(0x7b, float:1.72E-43)
            r6 = r6 | 123(0x7b, float:1.72E-43)
            int r6 = -r6
            int r6 = -r6
            r3 = r1 | r6
            int r3 = r3 << r2
            r6 = r6 ^ r1
            int r3 = r3 - r6
            int r6 = r3 % 128
            getActionCode = r6
            int r3 = r3 % 2
        L_0x009c:
            int r6 = getString
            r1 = r6 & 75
            int r3 = ~r1
            r4 = 75
            r6 = r6 | r4
            r6 = r6 & r3
            int r1 = r1 << r2
            r2 = r6 & r1
            r6 = r6 | r1
            int r2 = r2 + r6
            int r6 = r2 % 128
            getActionCode = r6
            int r2 = r2 % 2
            r6 = 4
            if (r2 == 0) goto L_0x00b5
            r1 = r6
            goto L_0x00b7
        L_0x00b5:
            r1 = 64
        L_0x00b7:
            if (r1 == r6) goto L_0x00ba
            return
        L_0x00ba:
            int r4 = r4 / r0
            return
        L_0x00bc:
            r6 = move-exception
            throw r6
        L_0x00be:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getInstance.init(com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if ((configure != null) != true) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if ((configure == null) != true) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void cca_continue(com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode r6, com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r7, android.content.Context r8, java.lang.String r9) throws com.cardinalcommerce.shared.models.exceptions.InvalidInputException {
        /*
            r5 = this;
            int r0 = getActionCode
            r1 = r0 ^ 13
            r2 = r0 & 13
            r3 = 1
            int r2 = r2 << r3
            int r1 = r1 + r2
            int r2 = r1 % 128
            getString = r2
            int r1 = r1 % 2
            com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver r1 = r5.cleanup
            r2 = 0
            if (r1 == 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            if (r1 != 0) goto L_0x00b4
            r1 = r0 & 109(0x6d, float:1.53E-43)
            r0 = r0 ^ 109(0x6d, float:1.53E-43)
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r4 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r3
            int r4 = r4 + r0
            int r0 = r4 % 128
            getString = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x002f
            r1 = r2
            goto L_0x0030
        L_0x002f:
            r1 = r3
        L_0x0030:
            if (r1 == r3) goto L_0x0041
            android.os.CountDownTimer r1 = configure
            r4 = 36
            int r4 = r4 / r2
            if (r1 == 0) goto L_0x003b
            r1 = r3
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            if (r1 == r3) goto L_0x004a
            goto L_0x0078
        L_0x003f:
            r6 = move-exception
            throw r6
        L_0x0041:
            android.os.CountDownTimer r1 = configure
            if (r1 == 0) goto L_0x0047
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r3
        L_0x0048:
            if (r1 == r3) goto L_0x0078
        L_0x004a:
            r1 = r0 & 121(0x79, float:1.7E-43)
            int r4 = ~r1
            r0 = r0 | 121(0x79, float:1.7E-43)
            r0 = r0 & r4
            int r1 = r1 << r3
            int r1 = -r1
            int r1 = -r1
            r4 = r0 & r1
            r0 = r0 | r1
            int r4 = r4 + r0
            int r0 = r4 % 128
            getActionCode = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0060
            r3 = r2
        L_0x0060:
            r0 = 0
            if (r3 == 0) goto L_0x006b
            android.os.CountDownTimer r1 = configure
            r1.cancel()
            configure = r0
            goto L_0x0078
        L_0x006b:
            android.os.CountDownTimer r1 = configure
            r1.cancel()
            configure = r0
            r0 = 61
            int r0 = r0 / r2
            goto L_0x0078
        L_0x0076:
            r6 = move-exception
            throw r6
        L_0x0078:
            com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse r0 = new com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse
            r0.<init>(r2, r6, r7)
            com.cardinalcommerce.a.getString r6 = values
            com.cardinalcommerce.a.onValidated r1 = r5.onValidated
            java.lang.String r1 = r1.init()
            r6.cca_continue(r7, r1)
            com.cardinalcommerce.a.getString r6 = values
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r7 = r5.valueOf
            com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment r7 = r7.getEnvironment()
            java.lang.String r7 = r7.toString()
            r6.init(r7)
            com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver r6 = r5.cleanup
            r6.onValidated(r8, r0, r9)
            com.cardinalcommerce.a.Cardinal r6 = com.cardinalcommerce.a.Cardinal.Validated
            getWarnings = r6
            int r6 = getActionCode
            r7 = r6 & 59
            r6 = r6 ^ 59
            r6 = r6 | r7
            int r6 = -r6
            int r6 = -r6
            r8 = r7 & r6
            r6 = r6 | r7
            int r8 = r8 + r6
            int r6 = r8 % 128
            getString = r6
            int r8 = r8 % 2
            return
        L_0x00b4:
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r7 = "Null CardinalValidateReceiver received on cca_continue"
            r6.<init>(r7)
            com.cardinalcommerce.shared.models.exceptions.InvalidInputException r7 = new com.cardinalcommerce.shared.models.exceptions.InvalidInputException
            java.lang.String r8 = "InvalidInputException"
            r7.<init>(r8, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getInstance.cca_continue(com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode, com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError, android.content.Context, java.lang.String):void");
    }

    private void getInstance(CardinalError cardinalError) throws InvalidInputException {
        int i = getActionCode;
        int i2 = i & 79;
        int i3 = (i ^ 79) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getString = i4 % 128;
        int i5 = i4 % 2;
        values.cca_continue(cardinalError, this.onValidated.init());
        values.init(this.valueOf.getEnvironment().toString());
        int i6 = getString;
        int i7 = ((i6 ^ 58) + ((i6 & 58) << 1)) - 1;
        getActionCode = i7 % 128;
        int i8 = i7 % 2;
    }

    protected static void configure() {
        int i = getString;
        int i2 = ((i & 1) - (~(-(-(i | 1))))) - 1;
        getActionCode = i2 % 128;
        int i3 = i2 % 2;
        getWarnings = Cardinal.Validated;
        int i4 = getActionCode;
        int i5 = i4 & 29;
        int i6 = i5 + ((i4 ^ 29) | i5);
        getString = i6 % 128;
        int i7 = i6 % 2;
    }

    protected static Cardinal init() {
        int i = getString;
        int i2 = (i & 73) + (i | 73);
        getActionCode = i2 % 128;
        if (i2 % 2 == 0) {
            return getWarnings;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final void cca_continue(onValidated onvalidated) {
        int i = getString;
        int i2 = i & 37;
        int i3 = (i | 37) & (~i2);
        boolean z = true;
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        getActionCode = i6;
        int i7 = i5 % 2;
        onValidated onvalidated2 = this.onValidated;
        Throwable th = null;
        if ((onvalidated2 != null ? 22 : 'X') == 22) {
            int i8 = i6 & 95;
            int i9 = (i8 - (~(-(-((i6 ^ 95) | i8))))) - 1;
            getString = i9 % 128;
            int i10 = i9 % 2;
            if ((onvalidated2.init().equals(onvalidated.init()) ? 'Q' : 'U') != 'U') {
                int i11 = getActionCode;
                int i12 = i11 & 109;
                int i13 = (((i11 ^ 109) | i12) << 1) - ((i11 | 109) & (~i12));
                getString = i13 % 128;
                int i14 = i13 % 2;
                if (this.CardinalRenderType) {
                    getInstance(this.onValidated);
                    int i15 = (getString + 72) - 1;
                    getActionCode = i15 % 128;
                    if ((i15 % 2 != 0 ? 'I' : '_') != '_') {
                        super.hashCode();
                        throw th;
                    }
                    return;
                }
            }
        }
        this.onValidated = onvalidated;
        if (!(this.valueOf.isEnableDFSync())) {
            int i16 = getActionCode;
            int i17 = i16 & 11;
            int i18 = (((i16 | 11) & (~i17)) - (~(i17 << 1))) - 1;
            getString = i18 % 128;
            int i19 = i18 % 2;
            getInstance(onvalidated);
            int i20 = getString;
            int i21 = ((i20 | 56) << 1) - (i20 ^ 56);
            int i22 = ((i21 | -1) << 1) - (i21 ^ -1);
            getActionCode = i22 % 128;
            int i23 = i22 % 2;
        }
        try {
            new CardinalRenderType(this, this.onValidated, this.valueOf.getRequestTimeout()).cca_continue();
            int i24 = getActionCode;
            int i25 = i24 ^ 37;
            int i26 = ((((i24 & 37) | i25) << 1) - (~(-i25))) - 1;
            getString = i26 % 128;
            if (i26 % 2 != 0) {
                z = false;
            }
            if (z) {
                super.hashCode();
                throw th;
            }
        } catch (JSONException e) {
            values.cca_continue(new CardinalError(10217, (Exception) e), this.onValidated.init());
            cca_continue(new CardinalError(10215));
        }
    }

    private void getInstance(onValidated onvalidated) {
        int i = getActionCode;
        boolean z = true;
        int i2 = (i ^ 5) + ((i & 5) << 1);
        getString = i2 % 128;
        if (!(i2 % 2 == 0)) {
            values.cca_continue("CardinalInit", "Init completed", onvalidated.init());
            getWarnings = Cardinal.InitCompleted;
            values.init(this.valueOf.getEnvironment().toString());
            this.onCReqSuccess.onSetupCompleted(onvalidated.init());
            int i3 = getString + 95;
            getActionCode = i3 % 128;
            if (i3 % 2 != 0) {
                z = false;
            }
            if (!z) {
                int i4 = 91 / 0;
                return;
            }
            return;
        }
        values.cca_continue("CardinalInit", "Init completed", onvalidated.init());
        getWarnings = Cardinal.InitCompleted;
        values.init(this.valueOf.getEnvironment().toString());
        this.onCReqSuccess.onSetupCompleted(onvalidated.init());
        throw null;
    }

    public final void configure(CardinalError cardinalError) {
        this.CardinalRenderType = true;
        ValidateResponse validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, cardinalError);
        values.init(this.valueOf.getEnvironment().toString());
        this.onCReqSuccess.onValidated(validateResponse, (String) null);
        int i = getString;
        int i2 = i & 69;
        int i3 = (i | 69) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getActionCode = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if ((r7.valueOf.isEnableDFSync()) != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if ((!r7.valueOf.isEnableDFSync()) != true) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCReqSuccess() {
        /*
            r7 = this;
            int r0 = getActionCode
            r1 = r0 ^ 73
            r0 = r0 & 73
            r2 = 1
            int r0 = r0 << r2
            int r0 = -r0
            int r0 = -r0
            r3 = r1 & r0
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            getString = r0
            int r3 = r3 % 2
            r0 = 63
            r1 = 38
            if (r3 != 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r1
        L_0x001d:
            r4 = 83
            r5 = 0
            if (r3 == r1) goto L_0x0035
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r1 = r7.valueOf
            boolean r1 = r1.isEnableDFSync()
            r3 = 85
            int r3 = r3 / r5
            if (r1 == 0) goto L_0x002f
            r1 = r2
            goto L_0x0030
        L_0x002f:
            r1 = r5
        L_0x0030:
            if (r1 == 0) goto L_0x006f
            goto L_0x0042
        L_0x0033:
            r0 = move-exception
            throw r0
        L_0x0035:
            com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters r1 = r7.valueOf
            boolean r1 = r1.isEnableDFSync()
            if (r1 == 0) goto L_0x003f
            r1 = r5
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            if (r1 == r2) goto L_0x006f
        L_0x0042:
            int r1 = getActionCode
            r3 = r1 ^ 97
            r6 = r1 & 97
            r3 = r3 | r6
            int r3 = r3 << r2
            int r6 = ~r6
            r1 = r1 | 97
            r1 = r1 & r6
            int r1 = -r1
            r6 = r3 & r1
            r1 = r1 | r3
            int r6 = r6 + r1
            int r1 = r6 % 128
            getString = r1
            int r6 = r6 % 2
            com.cardinalcommerce.a.onValidated r1 = r7.onValidated
            r7.getInstance((com.cardinalcommerce.a.onValidated) r1)
            int r1 = getActionCode
            r3 = r1 ^ 83
            r1 = r1 & r4
            int r1 = r1 << r2
            r6 = r3 | r1
            int r6 = r6 << r2
            r1 = r1 ^ r3
            int r6 = r6 - r1
            int r1 = r6 % 128
            getString = r1
            int r6 = r6 % 2
        L_0x006f:
            r7.CardinalRenderType = r5
            int r1 = getString
            r3 = r1 & -64
            int r5 = ~r1
            r5 = r5 & r0
            r3 = r3 | r5
            r0 = r0 & r1
            int r0 = r0 << r2
            r1 = r3 | r0
            int r1 = r1 << r2
            r0 = r0 ^ r3
            int r1 = r1 - r0
            int r0 = r1 % 128
            getActionCode = r0
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0089
            r0 = r4
            goto L_0x008b
        L_0x0089:
            r0 = 43
        L_0x008b:
            if (r0 == r4) goto L_0x008e
            return
        L_0x008e:
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getInstance.onCReqSuccess():void");
    }

    public final void cca_continue(CardinalError cardinalError) {
        int i = getActionCode;
        int i2 = i & 17;
        int i3 = ((i | 17) & (~i2)) + (i2 << 1);
        getString = i3 % 128;
        int i4 = i3 % 2;
        if (this.valueOf.isEnableDFSync()) {
            this.CardinalRenderType = true;
            values.cca_continue(cardinalError, this.onValidated.init());
            ValidateResponse validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, cardinalError);
            values.init(this.valueOf.getEnvironment().toString());
            this.onCReqSuccess.onValidated(validateResponse, (String) null);
            int i5 = getActionCode + 114;
            int i6 = ((i5 | -1) << 1) - (i5 ^ -1);
            getString = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = getActionCode;
        int i9 = i8 & 95;
        int i10 = i9 + ((i8 ^ 95) | i9);
        getString = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Throwable, android.os.CountDownTimer, java.lang.Object] */
    public final void configure(ValidateResponse validateResponse, String str) {
        values.cca_continue(ThreeDSStrings.CCAEventCardinalContinue, new StringBuilder("Stepup validated with action code: ").append(validateResponse.getActionCode()).toString(), this.onValidated.init());
        CountDownTimer countDownTimer = configure;
        boolean z = false;
        if (countDownTimer != null) {
            int i = getString;
            int i2 = (i & 48) + (i | 48);
            int i3 = (i2 & -1) + (i2 | -1);
            getActionCode = i3 % 128;
            int i4 = i3 % 2;
            countDownTimer.cancel();
            int i5 = getActionCode;
            int i6 = (i5 & 66) + (i5 | 66);
            int i7 = (i6 ^ -1) + ((i6 & -1) << 1);
            getString = i7 % 128;
            int i8 = i7 % 2;
        }
        ? r0 = 0;
        configure = r0;
        getWarnings = Cardinal.Validated;
        values.init(this.valueOf.getEnvironment().toString());
        this.cleanup.onValidated(this.CardinalError.get(), validateResponse, str);
        int i9 = getActionCode;
        int i10 = ((i9 & 65) - (~(-(-(i9 | 65))))) - 1;
        getString = i10 % 128;
        if (i10 % 2 == 0) {
            z = true;
        }
        if (z) {
            super.hashCode();
            throw r0;
        }
    }

    public static String getSDKVersion() {
        int i = getString;
        int i2 = ((i | 2) << 1) - (i ^ 2);
        int i3 = (i2 & -1) + (i2 | -1);
        getActionCode = i3 % 128;
        if ((i3 % 2 != 0 ? 'E' : '\'') == '\'') {
            String Cardinal2 = Cardinal(setOutlineSpotShadowColor.cca_continue());
            int i4 = getActionCode;
            int i5 = i4 & 71;
            int i6 = i5 + ((i4 ^ 71) | i5);
            getString = i6 % 128;
            int i7 = i6 % 2;
            return Cardinal2;
        }
        Cardinal(setOutlineSpotShadowColor.cca_continue());
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        if ((r9 != 0 ? 13 : '.') != 13) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if ((r9 != 0 ? 'C' : '3') != '3') goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String Cardinal(android.content.Context r15) {
        /*
            int r0 = getString
            r1 = r0 & 47
            r0 = r0 | 47
            r2 = r1 | r0
            r3 = 1
            int r2 = r2 << r3
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            getActionCode = r0
            int r2 = r2 % 2
            r0 = 25
            if (r2 == 0) goto L_0x0019
            r1 = 45
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            r4 = 0
            java.lang.String r2 = "LastUpdatedTime"
            r6 = 0
            java.lang.String r7 = "SDKAppID"
            r8 = 0
            if (r1 == r0) goto L_0x0042
            com.cardinalcommerce.a.setLayoutParams r0 = com.cardinalcommerce.a.setLayoutParams.getInstance((android.content.Context) r15)
            java.lang.String r1 = r0.init(r7, r6)
            long r9 = r0.getInstance((java.lang.String) r2)
            android.content.pm.PackageManager r11 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x003f }
            java.lang.String r15 = r15.getPackageName()     // Catch:{ NameNotFoundException -> 0x003f }
            android.content.pm.PackageInfo r15 = r11.getPackageInfo(r15, r8)     // Catch:{ NameNotFoundException -> 0x003f }
            long r11 = r15.lastUpdateTime     // Catch:{ NameNotFoundException -> 0x003f }
            goto L_0x005c
        L_0x003f:
            r11 = 1
            goto L_0x006a
        L_0x0042:
            com.cardinalcommerce.a.setLayoutParams r0 = com.cardinalcommerce.a.setLayoutParams.getInstance((android.content.Context) r15)
            java.lang.String r1 = r0.init(r7, r6)
            long r9 = r0.getInstance((java.lang.String) r2)
            android.content.pm.PackageManager r11 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.String r15 = r15.getPackageName()     // Catch:{ NameNotFoundException -> 0x0069 }
            android.content.pm.PackageInfo r15 = r11.getPackageInfo(r15, r8)     // Catch:{ NameNotFoundException -> 0x0069 }
            long r11 = r15.lastUpdateTime     // Catch:{ NameNotFoundException -> 0x0069 }
        L_0x005c:
            int r15 = getString
            int r15 = r15 + 42
            int r15 = r15 - r8
            int r15 = r15 - r3
            int r6 = r15 % 128
            getActionCode = r6
            int r15 = r15 % 2
            goto L_0x0076
        L_0x0069:
            r11 = r4
        L_0x006a:
            com.cardinalcommerce.a.getString r15 = values
            com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError r13 = new com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError
            r14 = 10220(0x27ec, float:1.4321E-41)
            r13.<init>(r14)
            r15.cca_continue(r13, r6)
        L_0x0076:
            r15 = 70
            if (r1 == 0) goto L_0x007c
            r6 = r15
            goto L_0x007e
        L_0x007c:
            r6 = 53
        L_0x007e:
            if (r6 == r15) goto L_0x0082
            goto L_0x00e0
        L_0x0082:
            int r15 = getString
            r6 = r15 & 41
            r15 = r15 ^ 41
            r15 = r15 | r6
            int r15 = ~r15
            int r6 = r6 - r15
            int r6 = r6 - r3
            int r15 = r6 % 128
            getActionCode = r15
            int r6 = r6 % 2
            r13 = 19
            if (r6 == 0) goto L_0x0098
            r6 = r13
            goto L_0x009a
        L_0x0098:
            r6 = 86
        L_0x009a:
            r14 = 51
            if (r6 == r13) goto L_0x00ab
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r5 = 13
            if (r4 == 0) goto L_0x00a6
            r4 = r5
            goto L_0x00a8
        L_0x00a6:
            r4 = 46
        L_0x00a8:
            if (r4 == r5) goto L_0x00b5
            goto L_0x00e0
        L_0x00ab:
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00b2
            r4 = 67
            goto L_0x00b3
        L_0x00b2:
            r4 = r14
        L_0x00b3:
            if (r4 == r14) goto L_0x00e0
        L_0x00b5:
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r5 = 82
            if (r4 == 0) goto L_0x00bc
            r14 = r5
        L_0x00bc:
            if (r14 == r5) goto L_0x00e0
            r0 = r15 & -30
            int r2 = ~r15
            r4 = 29
            r2 = r2 & r4
            r0 = r0 | r2
            r15 = r15 & r4
            int r15 = r15 << r3
            int r15 = -r15
            int r15 = -r15
            int r15 = ~r15
            int r0 = r0 - r15
            int r0 = r0 - r3
            int r15 = r0 % 128
            getString = r15
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x00d6
            r15 = r3
            goto L_0x00d7
        L_0x00d6:
            r15 = r8
        L_0x00d7:
            if (r15 == r3) goto L_0x00da
            return r1
        L_0x00da:
            r15 = 32
            int r15 = r15 / r8
            return r1
        L_0x00de:
            r15 = move-exception
            throw r15
        L_0x00e0:
            java.util.UUID r15 = java.util.UUID.randomUUID()
            java.lang.String r15 = r15.toString()
            r0.Cardinal((java.lang.String) r7, (java.lang.String) r15)
            r0.Cardinal((java.lang.String) r2, (long) r11)
            int r0 = getActionCode
            r1 = r0 & 121(0x79, float:1.7E-43)
            int r2 = ~r1
            r0 = r0 | 121(0x79, float:1.7E-43)
            r0 = r0 & r2
            int r1 = r1 << r3
            r2 = r0 & r1
            r0 = r0 | r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            getString = r0
            int r2 = r2 % 2
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getInstance.Cardinal(android.content.Context):java.lang.String");
    }

    private void getInstance(final int i) {
        int i2 = getString;
        boolean z = true;
        int i3 = (i2 + 6) - 1;
        getActionCode = i3 % 128;
        int i4 = i3 % 2;
        CountDownTimer countDownTimer = configure;
        if (!(countDownTimer == null)) {
            int i5 = ((i2 & -112) | ((~i2) & 111)) + ((i2 & 111) << 1);
            getActionCode = i5 % 128;
            boolean z2 = i5 % 2 == 0;
            countDownTimer.cancel();
            if (!z2) {
                int i6 = 31 / 0;
            }
            int i7 = getActionCode;
            int i8 = ((i7 | 82) << 1) - (i7 ^ 82);
            int i9 = (i8 & -1) + (i8 | -1);
            getString = i9 % 128;
            int i10 = i9 % 2;
        }
        this.Cardinal.get().runOnUiThread(new Runnable() {
            private static int Cardinal = 0;
            private static int configure = 1;

            public final void run() {
                long j = (long) (i * c.b.q);
                getInstance.init((CountDownTimer) new CountDownTimer(j, j) {
                    private static int cca_continue = 0;
                    private static int getInstance = 1;

                    public final void onTick(long j) {
                        int i = cca_continue;
                        int i2 = i & 9;
                        int i3 = (i | 9) & (~i2);
                        int i4 = -(-(i2 << 1));
                        int i5 = (i3 & i4) + (i3 | i4);
                        getInstance = i5 % 128;
                        int i6 = i5 % 2;
                    }

                    public final void onFinish() {
                        int i = getInstance;
                        int i2 = i & 97;
                        int i3 = (i | 97) & (~i2);
                        boolean z = true;
                        int i4 = i2 << 1;
                        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
                        cca_continue = i5 % 128;
                        char c = i5 % 2 != 0 ? (char) 22 : 2;
                        Throwable th = null;
                        if (c == 2) {
                            if ((getInstance.cleanup() != null ? 3 : '*') != '*') {
                                int i6 = cca_continue;
                                int i7 = i6 ^ 35;
                                int i8 = (((i6 & 35) | i7) << 1) - i7;
                                getInstance = i8 % 128;
                                if ((i8 % 2 == 0 ? '2' : ')') != '2') {
                                    getInstance.cleanup().cancel();
                                } else {
                                    getInstance.cleanup().cancel();
                                    super.hashCode();
                                    throw th;
                                }
                            }
                            getInstance.init(getInstance.this);
                            int i9 = cca_continue;
                            int i10 = ((i9 ^ 27) | (i9 & 27)) << 1;
                            int i11 = -(((~i9) & 27) | (i9 & -28));
                            int i12 = (i10 & i11) + (i11 | i10);
                            getInstance = i12 % 128;
                            if (i12 % 2 == 0) {
                                z = false;
                            }
                            if (!z) {
                                super.hashCode();
                                throw th;
                            }
                            return;
                        }
                        getInstance.cleanup();
                        throw th;
                    }
                });
                getInstance.cleanup().start();
                int i = configure + 85;
                Cardinal = i % 128;
                if (!(i % 2 == 0)) {
                    Throwable th = null;
                    super.hashCode();
                    throw th;
                }
            }
        });
        int i11 = getString;
        int i12 = ((i11 | 118) << 1) - (i11 ^ 118);
        int i13 = ((i12 | -1) << 1) - (i12 ^ -1);
        getActionCode = i13 % 128;
        if (i13 % 2 == 0) {
            z = false;
        }
        if (z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    private void getWarnings() {
        cca_continue.getInstance();
        cca_continue(CardinalActionCode.TIMEOUT, new CardinalError(0), (Context) null, "");
        int i = getActionCode;
        int i2 = (i & -104) | ((~i) & 103);
        int i3 = -(-((i & 103) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        getString = i4 % 128;
        if ((i4 % 2 == 0 ? 7 : 'O') == 7) {
            int i5 = 90 / 0;
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [java.lang.Throwable, android.os.CountDownTimer, com.cardinalcommerce.a.getInstance, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if ((cca_continue != null) != true) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if ((cca_continue == null) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onValidated() {
        /*
            r7 = this;
            int r0 = getActionCode
            r1 = r0 ^ 77
            r2 = r0 & 77
            r1 = r1 | r2
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 & -78
            int r4 = ~r0
            r4 = r4 & 77
            r3 = r3 | r4
            int r3 = -r3
            r4 = r1 ^ r3
            r1 = r1 & r3
            int r1 = r1 << r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            getString = r1
            int r4 = r4 % 2
            r1 = 59
            if (r4 != 0) goto L_0x0022
            r3 = 86
            goto L_0x0023
        L_0x0022:
            r3 = r1
        L_0x0023:
            r4 = 0
            r5 = 0
            if (r3 == r1) goto L_0x0036
            java.lang.ref.WeakReference<android.content.Context> r1 = cca_continue
            r3 = 90
            int r3 = r3 / r5
            if (r1 == 0) goto L_0x0030
            r1 = r2
            goto L_0x0031
        L_0x0030:
            r1 = r5
        L_0x0031:
            if (r1 == r2) goto L_0x0040
            goto L_0x005a
        L_0x0034:
            r0 = move-exception
            throw r0
        L_0x0036:
            java.lang.ref.WeakReference<android.content.Context> r1 = cca_continue
            if (r1 == 0) goto L_0x003c
            r1 = r5
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            if (r1 == 0) goto L_0x0040
            goto L_0x005a
        L_0x0040:
            int r0 = r0 + 30
            r1 = r0 | -1
            int r1 = r1 << r2
            r0 = r0 ^ -1
            int r1 = r1 - r0
            int r0 = r1 % 128
            getString = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0052
            r0 = r2
            goto L_0x0053
        L_0x0052:
            r0 = r5
        L_0x0053:
            if (r0 == r2) goto L_0x0109
            java.lang.ref.WeakReference<android.content.Context> r0 = cca_continue
            r0.clear()
        L_0x005a:
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.CardinalError
            r1 = 40
            if (r0 == 0) goto L_0x0062
            r3 = r1
            goto L_0x0064
        L_0x0062:
            r3 = 36
        L_0x0064:
            if (r3 == r1) goto L_0x0067
            goto L_0x008f
        L_0x0067:
            int r1 = getActionCode
            r3 = r1 & -2
            int r6 = ~r1
            r6 = r6 & r2
            r3 = r3 | r6
            r1 = r1 & r2
            int r1 = r1 << r2
            int r1 = -r1
            int r1 = -r1
            r6 = r3 ^ r1
            r1 = r1 & r3
            int r1 = r1 << r2
            int r6 = r6 + r1
            int r1 = r6 % 128
            getString = r1
            int r6 = r6 % 2
            r0.clear()
            int r0 = getActionCode
            r1 = r0 & 16
            r0 = r0 | 16
            int r1 = r1 + r0
            int r1 = r1 - r5
            int r1 = r1 - r2
            int r0 = r1 % 128
            getString = r0
            int r1 = r1 % 2
        L_0x008f:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r7.Cardinal
            if (r0 == 0) goto L_0x0095
            r1 = r2
            goto L_0x0096
        L_0x0095:
            r1 = r5
        L_0x0096:
            if (r1 == 0) goto L_0x00bb
            int r1 = getString
            r3 = r1 ^ 125(0x7d, float:1.75E-43)
            r1 = r1 & 125(0x7d, float:1.75E-43)
            int r1 = r1 << r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            getActionCode = r1
            int r3 = r3 % 2
            r0.clear()
            int r0 = getString
            r1 = r0 & 8
            r0 = r0 | 8
            int r1 = r1 + r0
            r0 = r1 & -1
            r1 = r1 | -1
            int r0 = r0 + r1
            int r1 = r0 % 128
            getActionCode = r1
            int r0 = r0 % 2
        L_0x00bb:
            getInstance = r4
            android.os.CountDownTimer r0 = configure
            r1 = 81
            if (r0 == 0) goto L_0x00c6
            r3 = 89
            goto L_0x00c7
        L_0x00c6:
            r3 = r1
        L_0x00c7:
            if (r3 == r1) goto L_0x00ea
            int r1 = getString
            r3 = r1 | 73
            int r3 = r3 << r2
            r1 = r1 ^ 73
            int r3 = r3 - r1
            int r1 = r3 % 128
            getActionCode = r1
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x00db
            r1 = r5
            goto L_0x00dc
        L_0x00db:
            r1 = r2
        L_0x00dc:
            if (r1 == r2) goto L_0x00e7
            r0.cancel()
            r0 = 14
            int r0 = r0 / r5
            goto L_0x00ea
        L_0x00e5:
            r0 = move-exception
            throw r0
        L_0x00e7:
            r0.cancel()
        L_0x00ea:
            configure = r4
            com.cardinalcommerce.a.setSaveFromParentEnabled.getInstance()
            com.cardinalcommerce.a.setSaveFromParentEnabled.init()
            int r0 = getActionCode
            r1 = r0 & -68
            int r3 = ~r0
            r4 = 67
            r3 = r3 & r4
            r1 = r1 | r3
            r0 = r0 & r4
            int r0 = r0 << r2
            r3 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r2
            int r3 = r3 + r0
            int r0 = r3 % 128
            getString = r0
            int r3 = r3 % 2
            return
        L_0x0109:
            java.lang.ref.WeakReference<android.content.Context> r0 = cca_continue
            r0.clear()
            super.hashCode()     // Catch:{ all -> 0x0112 }
            throw r4     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.getInstance.onValidated():void");
    }
}
