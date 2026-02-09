package com.cardinalcommerce.a;

import android.content.Context;
import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters;
import java.io.Serializable;
import java.util.Locale;
import kotlin.text.Typography;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

public final class setScaleY implements setDefaultFocusHighlightEnabled, Serializable {
    private static int CardinalEnvironment = 1;
    private static int CardinalRenderType;
    private char[] Cardinal;
    private boolean CardinalError;
    private setRotationX cca_continue = new setRotationX();
    private setTransitionAlpha cleanup;
    private char[] configure = getSDKVersion();
    private char[] getInstance = setHorizontalScrollBarEnabled.configure(Locale.getDefault().getDisplayLanguage());
    private JSONObject getSDKVersion;
    private setPivotX getWarnings = new setPivotX();
    private setPivotY init;
    private setTouchDelegate onCReqSuccess;
    private setScrollY onValidated;
    private final setTranslationY valueOf = setTranslationY.cca_continue();
    private setTop values;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public final void getInstance(Context context, CardinalConfigurationParameters cardinalConfigurationParameters) {
        ? r0 = 0;
        try {
            this.CardinalError = cardinalConfigurationParameters.isLocationDataConsentGiven();
            this.onCReqSuccess = new setTouchDelegate();
            configure(context);
            this.init = new setPivotY(context);
            this.onValidated = new setScrollY(context);
            this.Cardinal = setHorizontalScrollBarEnabled.configure(onCReqSuccess());
            this.getSDKVersion = cardinalConfigurationParameters.getJSON();
            boolean z = false;
            int i = (((CardinalEnvironment + 49) - 1) - 0) - 1;
            CardinalRenderType = i % 128;
            if (i % 2 != 0) {
                z = true;
            }
            if (z) {
                super.hashCode();
                throw r0;
            }
        } catch (Exception e) {
            getString.getInstance().cca_continue(new CardinalError((int) CardinalError.CONFIGURATION_EXCEPTION_ERROR_CODE, e.getLocalizedMessage()), r0);
        }
    }

    public final void getInstance(Context context, boolean z) {
        this.CardinalError = z;
        this.onCReqSuccess = new setTouchDelegate();
        configure(context);
        this.init = new setPivotY(context);
        this.onValidated = new setScrollY(context);
        this.Cardinal = setHorizontalScrollBarEnabled.configure(onCReqSuccess());
        int i = CardinalEnvironment + 63;
        CardinalRenderType = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    private static char[] getSDKVersion() {
        int i = CardinalEnvironment;
        int i2 = (i & -34) | ((~i) & 33);
        int i3 = -(-((i & 33) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        CardinalRenderType = i4 % 128;
        int i5 = i4 % 2;
        char[] configure2 = setHorizontalScrollBarEnabled.configure("2.2.7-5");
        int i6 = (((CardinalEnvironment + 71) - 1) + 0) - 1;
        CardinalRenderType = i6 % 128;
        int i7 = i6 % 2;
        return configure2;
    }

    private static String onCReqSuccess() {
        String str;
        int i = CardinalRenderType;
        int i2 = i ^ 19;
        int i3 = (((i & 19) | i2) << 1) - i2;
        CardinalEnvironment = i3 % 128;
        boolean z = i3 % 2 == 0;
        getInstance.getInstance();
        if (z) {
            str = getInstance.getSDKVersion();
            int i4 = 15 / 0;
        } else {
            str = getInstance.getSDKVersion();
        }
        int i5 = CardinalRenderType;
        int i6 = (i5 & -68) | ((~i5) & 67);
        int i7 = -(-((i5 & 67) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        CardinalEnvironment = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        if (r0.getInstance() != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r0.getInstance() != false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void configure(android.content.Context r10) {
        /*
            r9 = this;
            com.cardinalcommerce.a.setHorizontalFadingEdgeEnabled r0 = new com.cardinalcommerce.a.setHorizontalFadingEdgeEnabled
            r0.<init>(r10)
            boolean r1 = r0.cca_continue()
            java.lang.String r2 = "NativeData Data"
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L_0x002e
            com.cardinalcommerce.a.setTransitionAlpha r1 = new com.cardinalcommerce.a.setTransitionAlpha     // Catch:{ Exception -> 0x0024 }
            r1.<init>(r10)     // Catch:{ Exception -> 0x0024 }
            r9.getInstance(r1)     // Catch:{ Exception -> 0x0024 }
            int r1 = CardinalEnvironment
            r5 = r1 & 41
            r1 = r1 | 41
            int r5 = r5 + r1
            int r1 = r5 % 128
            CardinalRenderType = r1
            int r5 = r5 % r4
            goto L_0x002e
        L_0x0024:
            r1 = move-exception
            com.cardinalcommerce.a.setTranslationY r5 = r9.valueOf
            java.lang.String r1 = r1.getMessage()
            r5.configure((java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
        L_0x002e:
            com.cardinalcommerce.a.setTranslationY r1 = r9.valueOf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Location Data Consent Given : "
            r5.<init>(r6)
            boolean r6 = r9.CardinalError
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "LASSOEvent"
            r1.cca_continue(r6, r5, r3)
            boolean r1 = r9.CardinalError
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x004e
            r1 = r6
            goto L_0x004f
        L_0x004e:
            r1 = r5
        L_0x004f:
            if (r1 == r6) goto L_0x0052
            goto L_0x00b2
        L_0x0052:
            int r1 = CardinalEnvironment
            r7 = r1 & 47
            r1 = r1 ^ 47
            r1 = r1 | r7
            r8 = r7 & r1
            r1 = r1 | r7
            int r8 = r8 + r1
            int r1 = r8 % 128
            CardinalRenderType = r1
            int r8 = r8 % r4
            boolean r1 = r0.init()
            if (r1 != 0) goto L_0x006a
            r1 = r5
            goto L_0x006b
        L_0x006a:
            r1 = r6
        L_0x006b:
            if (r1 == 0) goto L_0x006e
            goto L_0x0098
        L_0x006e:
            int r1 = CardinalEnvironment
            r7 = r1 | 94
            int r7 = r7 << r6
            r1 = r1 ^ 94
            int r7 = r7 - r1
            r1 = r7 & -1
            r7 = r7 | -1
            int r1 = r1 + r7
            int r7 = r1 % 128
            CardinalRenderType = r7
            int r1 = r1 % r4
            if (r1 == 0) goto L_0x0084
            r1 = r6
            goto L_0x0085
        L_0x0084:
            r1 = r5
        L_0x0085:
            if (r1 == 0) goto L_0x0092
            boolean r1 = r0.getInstance()
            int r5 = r4 / 0
            if (r1 == 0) goto L_0x00b2
            goto L_0x0098
        L_0x0090:
            r10 = move-exception
            throw r10
        L_0x0092:
            boolean r1 = r0.getInstance()
            if (r1 == 0) goto L_0x00b2
        L_0x0098:
            com.cardinalcommerce.a.setScaleX r1 = new com.cardinalcommerce.a.setScaleX     // Catch:{ Exception -> 0x00a8 }
            r1.<init>(r9, r10)     // Catch:{ Exception -> 0x00a8 }
            int r1 = CardinalRenderType
            int r1 = r1 + 62
            int r1 = r1 - r6
            int r2 = r1 % 128
            CardinalEnvironment = r2
            int r1 = r1 % r4
            goto L_0x00b2
        L_0x00a8:
            r1 = move-exception
            com.cardinalcommerce.a.setTranslationY r5 = r9.valueOf
            java.lang.String r1 = r1.getMessage()
            r5.configure((java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
        L_0x00b2:
            boolean r1 = r0.configure()
            if (r1 == 0) goto L_0x00d3
            com.cardinalcommerce.a.setRotation r1 = new com.cardinalcommerce.a.setRotation
            r1.<init>(r10)
            com.cardinalcommerce.a.setTouchDelegate r2 = r9.onCReqSuccess
            r2.Cardinal(r1)
            int r1 = CardinalEnvironment
            r2 = r1 & 111(0x6f, float:1.56E-43)
            r1 = r1 | 111(0x6f, float:1.56E-43)
            int r1 = -r1
            int r1 = -r1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            CardinalRenderType = r1
            int r3 = r3 % r4
        L_0x00d3:
            boolean r0 = r0.Cardinal()
            r1 = 44
            if (r0 == 0) goto L_0x00dd
            r0 = r1
            goto L_0x00df
        L_0x00dd:
            r0 = 31
        L_0x00df:
            if (r0 == r1) goto L_0x00e2
            goto L_0x010d
        L_0x00e2:
            int r0 = CardinalRenderType
            r1 = r0 | 125(0x7d, float:1.75E-43)
            int r1 = r1 << r6
            r0 = r0 ^ 125(0x7d, float:1.75E-43)
            int r1 = r1 - r0
            int r0 = r1 % 128
            CardinalEnvironment = r0
            int r1 = r1 % r4
            com.cardinalcommerce.a.setTouchDelegate r0 = r9.onCReqSuccess
            com.cardinalcommerce.a.setRotationY r0 = r0.cca_continue()
            r0.configure(r10)
            int r10 = CardinalRenderType
            r0 = r10 ^ 105(0x69, float:1.47E-43)
            r1 = r10 & 105(0x69, float:1.47E-43)
            r0 = r0 | r1
            int r0 = r0 << r6
            int r1 = ~r1
            r10 = r10 | 105(0x69, float:1.47E-43)
            r10 = r10 & r1
            int r10 = -r10
            int r10 = ~r10
            int r0 = r0 - r10
            int r0 = r0 - r6
            int r10 = r0 % 128
            CardinalEnvironment = r10
            int r0 = r0 % r4
        L_0x010d:
            int r10 = CardinalRenderType
            r0 = r10 | 64
            int r0 = r0 << r6
            r10 = r10 ^ 64
            int r0 = r0 - r10
            r10 = r0 | -1
            int r10 = r10 << r6
            r0 = r0 ^ -1
            int r10 = r10 - r0
            int r0 = r10 % 128
            CardinalEnvironment = r0
            int r10 = r10 % r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScaleY.configure(android.content.Context):void");
    }

    public final void cca_continue(setTop settop) {
        int i = CardinalEnvironment;
        int i2 = i & 91;
        int i3 = (~i2) & (i | 91);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        CardinalRenderType = i5 % 128;
        int i6 = i5 % 2;
        this.values = settop;
        int i7 = ((i | 95) << 1) - (i ^ 95);
        CardinalRenderType = i7 % 128;
        int i8 = i7 % 2;
    }

    public final setTouchDelegate Cardinal() {
        int i = CardinalEnvironment;
        int i2 = i ^ 3;
        int i3 = ((i & 3) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i4 | i3);
        CardinalRenderType = i5 % 128;
        int i6 = i5 % 2;
        setTouchDelegate settouchdelegate = this.onCReqSuccess;
        int i7 = i & 73;
        int i8 = i | 73;
        int i9 = (i7 & i8) + (i8 | i7);
        CardinalRenderType = i9 % 128;
        int i10 = i9 % 2;
        return settouchdelegate;
    }

    public final setPivotY cca_continue() {
        int i = CardinalEnvironment;
        int i2 = i & 41;
        int i3 = -(-(i | 41));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        CardinalRenderType = i4 % 128;
        int i5 = i4 % 2;
        setPivotY setpivoty = this.init;
        int i6 = (i & -80) | ((~i) & 79);
        int i7 = -(-((i & 79) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        CardinalRenderType = i8 % 128;
        int i9 = i8 % 2;
        return setpivoty;
    }

    public final setTransitionAlpha init() {
        setTransitionAlpha settransitionalpha;
        int i = CardinalRenderType;
        int i2 = i + 27;
        CardinalEnvironment = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 14 : 21) != 21) {
            settransitionalpha = this.cleanup;
            int i3 = 61 / 0;
        } else {
            settransitionalpha = this.cleanup;
        }
        int i4 = i & 29;
        int i5 = (i | 29) & (~i4);
        int i6 = i4 << 1;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        CardinalEnvironment = i7 % 128;
        int i8 = i7 % 2;
        return settransitionalpha;
    }

    private void getInstance(setTransitionAlpha settransitionalpha) {
        int i = CardinalEnvironment;
        boolean z = true;
        int i2 = (i | 81) << 1;
        int i3 = -(i ^ 81);
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        CardinalRenderType = i5;
        int i6 = i4 % 2;
        this.cleanup = settransitionalpha;
        int i7 = ((i5 | 67) << 1) - (i5 ^ 67);
        CardinalEnvironment = i7 % 128;
        if (i7 % 2 == 0) {
            z = false;
        }
        if (!z) {
            int i8 = 50 / 0;
        }
    }

    public final setScrollY configure() {
        int i = CardinalRenderType;
        int i2 = i ^ 49;
        boolean z = true;
        int i3 = -(-((i & 49) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        CardinalEnvironment = i4 % 128;
        if (i4 % 2 != 0) {
            z = false;
        }
        setScrollY setscrolly = this.onValidated;
        if (z) {
            int i5 = 98 / 0;
        }
        return setscrolly;
    }

    public final setRotationX getInstance() {
        int i = CardinalEnvironment;
        int i2 = (i & 107) + (i | 107);
        int i3 = i2 % 128;
        CardinalRenderType = i3;
        int i4 = i2 % 2;
        setRotationX setrotationx = this.cca_continue;
        int i5 = (((i3 & -100) | ((~i3) & 99)) - (~(-(-((i3 & 99) << 1))))) - 1;
        CardinalEnvironment = i5 % 128;
        int i6 = i5 % 2;
        return setrotationx;
    }

    public final setPivotX getWarnings() {
        setPivotX setpivotx;
        int i = CardinalEnvironment;
        int i2 = (i & 107) + (i | 107);
        int i3 = i2 % 128;
        CardinalRenderType = i3;
        if ((i2 % 2 != 0 ? ',' : '%') != '%') {
            setpivotx = this.getWarnings;
            int i4 = 28 / 0;
        } else {
            setpivotx = this.getWarnings;
        }
        int i5 = i3 & 3;
        int i6 = (i3 | 3) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        CardinalEnvironment = i8 % 128;
        int i9 = i8 % 2;
        return setpivotx;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ac, code lost:
        if ((r12.CardinalError ? 9 : 'b') != 'b') goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject cleanup() {
        /*
            r12 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            com.cardinalcommerce.a.setTouchDelegate r5 = r12.onCReqSuccess     // Catch:{ JSONException -> 0x0312 }
            r6 = 46
            if (r5 == 0) goto L_0x0011
            r7 = r6
            goto L_0x0013
        L_0x0011:
            r7 = 43
        L_0x0013:
            if (r7 == r6) goto L_0x0016
            goto L_0x0047
        L_0x0016:
            int r7 = CardinalEnvironment
            r8 = r7 ^ 103(0x67, float:1.44E-43)
            r9 = r7 & 103(0x67, float:1.44E-43)
            r8 = r8 | r9
            int r8 = r8 << r4
            int r9 = ~r9
            r7 = r7 | 103(0x67, float:1.44E-43)
            r7 = r7 & r9
            int r7 = -r7
            int r7 = ~r7
            int r8 = r8 - r7
            int r8 = r8 - r4
            int r7 = r8 % 128
            CardinalRenderType = r7
            int r8 = r8 % r3
            java.lang.String r7 = "ConnectionData"
            org.json.JSONObject r5 = r5.Cardinal()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
            int r5 = CardinalEnvironment
            r7 = r5 | 48
            int r7 = r7 << r4
            r5 = r5 ^ 48
            int r7 = r7 - r5
            r5 = r7 ^ -1
            r7 = r7 & -1
            int r7 = r7 << r4
            int r5 = r5 + r7
            int r7 = r5 % 128
            CardinalRenderType = r7
            int r5 = r5 % r3
        L_0x0047:
            char[] r5 = r12.getInstance     // Catch:{ JSONException -> 0x0312 }
            if (r5 == 0) goto L_0x004d
            r7 = r2
            goto L_0x004e
        L_0x004d:
            r7 = r4
        L_0x004e:
            if (r7 == r4) goto L_0x006f
            int r7 = CardinalRenderType
            r8 = r7 ^ 123(0x7b, float:1.72E-43)
            r7 = r7 & 123(0x7b, float:1.72E-43)
            int r7 = r7 << r4
            int r8 = r8 + r7
            int r7 = r8 % 128
            CardinalEnvironment = r7
            int r8 = r8 % r3
            java.lang.String r7 = "Language"
            java.lang.String r5 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r5)     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
            int r5 = CardinalRenderType
            int r5 = r5 + 21
            int r7 = r5 % 128
            CardinalEnvironment = r7
            int r5 = r5 % r3
        L_0x006f:
            com.cardinalcommerce.a.setPivotX r5 = r12.getWarnings     // Catch:{ JSONException -> 0x0312 }
            if (r5 == 0) goto L_0x0075
            r7 = r2
            goto L_0x0076
        L_0x0075:
            r7 = r4
        L_0x0076:
            r8 = 77
            if (r7 == r4) goto L_0x00d2
            int r7 = CardinalRenderType
            r9 = r7 & -24
            int r10 = ~r7
            r11 = 23
            r10 = r10 & r11
            r9 = r9 | r10
            r10 = r7 & 23
            int r10 = r10 << r4
            int r9 = r9 + r10
            int r10 = r9 % 128
            CardinalEnvironment = r10
            int r9 = r9 % r3
            r10 = 39
            if (r9 != 0) goto L_0x0092
            r9 = r10
            goto L_0x0093
        L_0x0092:
            r9 = r8
        L_0x0093:
            if (r9 == r10) goto L_0x009f
            boolean r9 = r12.CardinalError     // Catch:{ JSONException -> 0x0312 }
            if (r9 == 0) goto L_0x009b
            r9 = r4
            goto L_0x009c
        L_0x009b:
            r9 = r2
        L_0x009c:
            if (r9 == r4) goto L_0x00ae
            goto L_0x00d2
        L_0x009f:
            boolean r9 = r12.CardinalError     // Catch:{ JSONException -> 0x0312 }
            r10 = 78
            int r10 = r10 / r2
            r10 = 98
            if (r9 == 0) goto L_0x00ab
            r9 = 9
            goto L_0x00ac
        L_0x00ab:
            r9 = r10
        L_0x00ac:
            if (r9 == r10) goto L_0x00d2
        L_0x00ae:
            r9 = r7 & 58
            r7 = r7 | 58
            int r9 = r9 + r7
            r7 = r9 & -1
            r9 = r9 | -1
            int r7 = r7 + r9
            int r9 = r7 % 128
            CardinalEnvironment = r9
            int r7 = r7 % r3
            java.lang.String r7 = "LocationData"
            org.json.JSONObject r5 = r5.Cardinal()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
            int r5 = CardinalEnvironment
            int r5 = r5 + 101
            int r7 = r5 % 128
            CardinalRenderType = r7
            int r5 = r5 % r3
            goto L_0x00d2
        L_0x00d0:
            r0 = move-exception
            throw r0
        L_0x00d2:
            com.cardinalcommerce.a.setScrollY r5 = r12.onValidated     // Catch:{ JSONException -> 0x0312 }
            if (r5 == 0) goto L_0x00d8
            r7 = r2
            goto L_0x00d9
        L_0x00d8:
            r7 = r4
        L_0x00d9:
            r9 = 19
            if (r7 == 0) goto L_0x00de
            goto L_0x0110
        L_0x00de:
            int r7 = CardinalEnvironment
            r10 = r7 | 71
            int r10 = r10 << r4
            r7 = r7 ^ 71
            int r7 = -r7
            r11 = r10 & r7
            r7 = r7 | r10
            int r11 = r11 + r7
            int r7 = r11 % 128
            CardinalRenderType = r7
            int r11 = r11 % r3
            if (r11 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r6 = r2
        L_0x00f3:
            java.lang.String r7 = "DeviceData"
            if (r6 != 0) goto L_0x0305
            org.json.JSONObject r5 = r5.getInstance()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
            int r5 = CardinalRenderType
            r6 = r5 & 19
            int r7 = ~r6
            r5 = r5 | r9
            r5 = r5 & r7
            int r6 = r6 << r4
            int r6 = -r6
            int r6 = -r6
            int r6 = ~r6
            int r5 = r5 - r6
            int r5 = r5 - r4
            int r6 = r5 % 128
            CardinalEnvironment = r6
            int r5 = r5 % r3
        L_0x0110:
            com.cardinalcommerce.a.setRotationX r5 = r12.cca_continue     // Catch:{ JSONException -> 0x0312 }
            if (r5 == 0) goto L_0x0116
            r6 = r4
            goto L_0x0117
        L_0x0116:
            r6 = r2
        L_0x0117:
            if (r6 == r4) goto L_0x011a
            goto L_0x0142
        L_0x011a:
            int r6 = CardinalRenderType
            r7 = r6 & -26
            int r10 = ~r6
            r10 = r10 & 25
            r7 = r7 | r10
            r6 = r6 & 25
            int r6 = r6 << r4
            int r6 = -r6
            int r6 = -r6
            r10 = r7 | r6
            int r10 = r10 << r4
            r6 = r6 ^ r7
            int r10 = r10 - r6
            int r6 = r10 % 128
            CardinalEnvironment = r6
            int r10 = r10 % r3
            if (r10 != 0) goto L_0x0136
            r6 = 79
            goto L_0x0137
        L_0x0136:
            r6 = r3
        L_0x0137:
            java.lang.String r7 = "OS"
            if (r6 != r3) goto L_0x02f8
            org.json.JSONObject r5 = r5.configure()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
        L_0x0142:
            com.cardinalcommerce.a.setTransitionAlpha r5 = r12.cleanup     // Catch:{ JSONException -> 0x0312 }
            r6 = 73
            if (r5 == 0) goto L_0x014a
            r7 = r8
            goto L_0x014b
        L_0x014a:
            r7 = r6
        L_0x014b:
            if (r7 == r6) goto L_0x0180
            int r6 = CardinalEnvironment
            r7 = r6 | 77
            int r7 = r7 << r4
            r6 = r6 ^ r8
            int r7 = r7 - r6
            int r6 = r7 % 128
            CardinalRenderType = r6
            int r7 = r7 % r3
            if (r7 == 0) goto L_0x015d
            r6 = r2
            goto L_0x015e
        L_0x015d:
            r6 = r4
        L_0x015e:
            java.lang.String r7 = "TelephonyData"
            if (r6 == r4) goto L_0x016f
            org.json.JSONObject r5 = r5.init()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
            r5 = 83
            int r5 = r5 / r2
            goto L_0x0176
        L_0x016d:
            r0 = move-exception
            throw r0
        L_0x016f:
            org.json.JSONObject r5 = r5.init()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
        L_0x0176:
            int r5 = CardinalRenderType
            int r5 = r5 + 48
            int r5 = r5 - r4
            int r6 = r5 % 128
            CardinalEnvironment = r6
            int r5 = r5 % r3
        L_0x0180:
            org.json.JSONObject r5 = r12.getSDKVersion     // Catch:{ JSONException -> 0x0312 }
            r6 = 28
            if (r5 == 0) goto L_0x0189
            r7 = 76
            goto L_0x018a
        L_0x0189:
            r7 = r6
        L_0x018a:
            if (r7 == r6) goto L_0x01ad
            int r6 = CardinalRenderType
            r7 = r6 & 7
            r6 = r6 | 7
            int r6 = -r6
            int r6 = -r6
            r8 = r7 ^ r6
            r6 = r6 & r7
            int r6 = r6 << r4
            int r8 = r8 + r6
            int r6 = r8 % 128
            CardinalEnvironment = r6
            int r8 = r8 % r3
            java.lang.String r6 = "ConfigurationData"
            r0.putOpt(r6, r5)     // Catch:{ JSONException -> 0x0312 }
            int r5 = CardinalEnvironment
            int r5 = r5 + 70
            int r5 = r5 - r4
            int r6 = r5 % 128
            CardinalRenderType = r6
            int r5 = r5 % r3
        L_0x01ad:
            com.cardinalcommerce.a.setPivotY r5 = r12.init     // Catch:{ JSONException -> 0x0312 }
            r6 = 12
            if (r5 == 0) goto L_0x01b5
            r7 = r6
            goto L_0x01b7
        L_0x01b5:
            r7 = 54
        L_0x01b7:
            if (r7 == r6) goto L_0x01ba
            goto L_0x01e2
        L_0x01ba:
            int r6 = CardinalEnvironment
            r7 = r6 & -104(0xffffffffffffff98, float:NaN)
            int r8 = ~r6
            r8 = r8 & 103(0x67, float:1.44E-43)
            r7 = r7 | r8
            r6 = r6 & 103(0x67, float:1.44E-43)
            int r6 = r6 << r4
            int r6 = -r6
            int r6 = -r6
            r8 = r7 | r6
            int r8 = r8 << r4
            r6 = r6 ^ r7
            int r8 = r8 - r6
            int r6 = r8 % 128
            CardinalRenderType = r6
            int r8 = r8 % r3
            if (r8 == 0) goto L_0x01d5
            r6 = r9
            goto L_0x01d7
        L_0x01d5:
            r6 = 37
        L_0x01d7:
            java.lang.String r7 = "UserData"
            if (r6 == r9) goto L_0x02ee
            org.json.JSONObject r5 = r5.getInstance()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
        L_0x01e2:
            com.cardinalcommerce.a.setTop r5 = r12.values     // Catch:{ JSONException -> 0x0312 }
            if (r5 == 0) goto L_0x01e8
            r6 = r4
            goto L_0x01e9
        L_0x01e8:
            r6 = r2
        L_0x01e9:
            if (r6 == r4) goto L_0x01ec
            goto L_0x0215
        L_0x01ec:
            int r6 = CardinalEnvironment
            r7 = r6 & 71
            r6 = r6 ^ 71
            r6 = r6 | r7
            r8 = r7 & r6
            r6 = r6 | r7
            int r8 = r8 + r6
            int r6 = r8 % 128
            CardinalRenderType = r6
            int r8 = r8 % r3
            java.lang.String r6 = "SecurityWarnings"
            org.json.JSONObject r5 = r5.init()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r6, r5)     // Catch:{ JSONException -> 0x0312 }
            int r5 = CardinalRenderType
            int r5 = r5 + 23
            int r5 = r5 - r4
            r6 = r5 | -1
            int r6 = r6 << r4
            r5 = r5 ^ -1
            int r6 = r6 - r5
            int r5 = r6 % 128
            CardinalEnvironment = r5
            int r6 = r6 % r3
        L_0x0215:
            char[] r5 = r12.configure     // Catch:{ JSONException -> 0x0312 }
            r6 = 17
            if (r5 == 0) goto L_0x021e
            r7 = 47
            goto L_0x021f
        L_0x021e:
            r7 = r6
        L_0x021f:
            if (r7 == r6) goto L_0x024c
            int r6 = CardinalRenderType
            r7 = r6 & 13
            r6 = r6 | 13
            int r6 = -r6
            int r6 = -r6
            r8 = r7 ^ r6
            r6 = r6 & r7
            int r6 = r6 << r4
            int r8 = r8 + r6
            int r6 = r8 % 128
            CardinalEnvironment = r6
            int r8 = r8 % r3
            java.lang.String r6 = "SdkVersion"
            java.lang.String r5 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r5)     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r6, r5)     // Catch:{ JSONException -> 0x0312 }
            int r5 = CardinalRenderType
            r6 = r5 & 53
            r5 = r5 ^ 53
            r5 = r5 | r6
            r7 = r6 & r5
            r5 = r5 | r6
            int r7 = r7 + r5
            int r5 = r7 % 128
            CardinalEnvironment = r5
            int r7 = r7 % r3
        L_0x024c:
            char[] r5 = r12.Cardinal     // Catch:{ JSONException -> 0x0312 }
            if (r5 == 0) goto L_0x0252
            r6 = r4
            goto L_0x0253
        L_0x0252:
            r6 = r2
        L_0x0253:
            if (r6 == r4) goto L_0x0256
            goto L_0x027b
        L_0x0256:
            int r6 = CardinalRenderType
            r7 = r6 & 119(0x77, float:1.67E-43)
            r6 = r6 ^ 119(0x77, float:1.67E-43)
            r6 = r6 | r7
            r8 = r7 ^ r6
            r6 = r6 & r7
            int r6 = r6 << r4
            int r8 = r8 + r6
            int r6 = r8 % 128
            CardinalEnvironment = r6
            int r8 = r8 % r3
            if (r8 != 0) goto L_0x026c
            r6 = 35
            goto L_0x026e
        L_0x026c:
            r6 = 52
        L_0x026e:
            r7 = 35
            if (r6 == r7) goto L_0x02df
            java.lang.String r6 = "SDKAppId"
            java.lang.String r5 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r5)     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r6, r5)     // Catch:{ JSONException -> 0x0312 }
        L_0x027b:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0312 }
            r5.<init>()     // Catch:{ JSONException -> 0x0312 }
            java.util.List<java.lang.String> r6 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.supportedMessageVersions     // Catch:{ JSONException -> 0x0312 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ JSONException -> 0x0312 }
            int r7 = CardinalRenderType
            r8 = r7 & 19
            int r10 = ~r8
            r7 = r7 | r9
            r7 = r7 & r10
            int r8 = r8 << r4
            r9 = r7 & r8
            r7 = r7 | r8
            int r9 = r9 + r7
            int r7 = r9 % 128
            CardinalEnvironment = r7
            int r9 = r9 % r3
        L_0x0297:
            boolean r7 = r6.hasNext()     // Catch:{ JSONException -> 0x0312 }
            if (r7 == 0) goto L_0x029f
            r7 = r4
            goto L_0x02a0
        L_0x029f:
            r7 = r2
        L_0x02a0:
            if (r7 == 0) goto L_0x02c8
            int r7 = CardinalRenderType
            r8 = r7 & 13
            int r9 = ~r8
            r7 = r7 | 13
            r7 = r7 & r9
            int r8 = r8 << r4
            int r7 = r7 + r8
            int r8 = r7 % 128
            CardinalEnvironment = r8
            int r7 = r7 % r3
            java.lang.Object r7 = r6.next()     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ JSONException -> 0x0312 }
            r5.put(r7)     // Catch:{ JSONException -> 0x0312 }
            int r7 = CardinalEnvironment
            r8 = r7 & 51
            r7 = r7 ^ 51
            r7 = r7 | r8
            int r8 = r8 + r7
            int r7 = r8 % 128
            CardinalRenderType = r7
            int r8 = r8 % r3
            goto L_0x0297
        L_0x02c8:
            java.lang.String r6 = "SDK3DSSupport"
            r0.putOpt(r6, r5)     // Catch:{ JSONException -> 0x0312 }
            int r5 = CardinalRenderType
            r6 = r5 | 95
            int r6 = r6 << r4
            r5 = r5 ^ 95
            int r5 = -r5
            r7 = r6 & r5
            r5 = r5 | r6
            int r7 = r7 + r5
            int r5 = r7 % 128
            CardinalEnvironment = r5
            int r7 = r7 % r3
            goto L_0x0320
        L_0x02df:
            java.lang.String r6 = "SDKAppId"
            java.lang.String r5 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.cca_continue((char[]) r5)     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r6, r5)     // Catch:{ JSONException -> 0x0312 }
            super.hashCode()     // Catch:{ all -> 0x02ec }
            throw r1     // Catch:{ all -> 0x02ec }
        L_0x02ec:
            r0 = move-exception
            throw r0
        L_0x02ee:
            org.json.JSONObject r5 = r5.getInstance()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
            throw r1     // Catch:{ all -> 0x02f6 }
        L_0x02f6:
            r0 = move-exception
            throw r0
        L_0x02f8:
            org.json.JSONObject r5 = r5.configure()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
            super.hashCode()     // Catch:{ all -> 0x0303 }
            throw r1     // Catch:{ all -> 0x0303 }
        L_0x0303:
            r0 = move-exception
            throw r0
        L_0x0305:
            org.json.JSONObject r5 = r5.getInstance()     // Catch:{ JSONException -> 0x0312 }
            r0.putOpt(r7, r5)     // Catch:{ JSONException -> 0x0312 }
            super.hashCode()     // Catch:{ all -> 0x0310 }
            throw r1     // Catch:{ all -> 0x0310 }
        L_0x0310:
            r0 = move-exception
            throw r0
        L_0x0312:
            r5 = move-exception
            com.cardinalcommerce.a.setTranslationY r6 = com.cardinalcommerce.a.setTranslationY.cca_continue()
            java.lang.String r7 = "13101"
            java.lang.String r5 = r5.getLocalizedMessage()
            r6.configure((java.lang.String) r7, (java.lang.String) r5, (java.lang.String) r1)
        L_0x0320:
            int r5 = CardinalEnvironment
            r6 = r5 ^ 57
            r5 = r5 & 57
            int r5 = r5 << r4
            int r6 = r6 + r5
            int r5 = r6 % 128
            CardinalRenderType = r5
            int r6 = r6 % r3
            if (r6 == 0) goto L_0x0330
            r2 = r4
        L_0x0330:
            if (r2 == r4) goto L_0x0333
            return r0
        L_0x0333:
            throw r1     // Catch:{ all -> 0x0334 }
        L_0x0334:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScaleY.cleanup():org.json.JSONObject");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Throwable, com.cardinalcommerce.a.setScrollY, org.json.JSONObject, com.cardinalcommerce.a.setRotationX, com.cardinalcommerce.a.setPivotX, java.lang.Object, com.cardinalcommerce.a.setTransitionAlpha, char[]] */
    public final void onValidated() {
        int i = CardinalEnvironment;
        int i2 = i & 3;
        int i3 = -(-(i | 3));
        int i4 = i2 ^ i3;
        int i5 = i3 & i2;
        boolean z = true;
        int i6 = i4 + (i5 << 1);
        int i7 = i6 % 128;
        CardinalRenderType = i7;
        int i8 = i6 % 2;
        setTouchDelegate settouchdelegate = this.onCReqSuccess;
        ? r5 = 0;
        if (!(settouchdelegate == null)) {
            int i9 = (i7 ^ 120) + ((i7 & 120) << 1);
            int i10 = (i9 & -1) + (i9 | -1);
            CardinalEnvironment = i10 % 128;
            int i11 = i10 % 2;
            settouchdelegate.getInstance();
            this.getSDKVersion = r5;
            int i12 = CardinalRenderType;
            int i13 = i12 | 27;
            int i14 = ((i13 << 1) - (~(-((~(i12 & 27)) & i13)))) - 1;
            CardinalEnvironment = i14 % 128;
            int i15 = i14 % 2;
        }
        char[] cArr = this.getInstance;
        if (cArr != null) {
            int i16 = CardinalRenderType;
            int i17 = i16 & 89;
            int i18 = ((i16 ^ 89) | i17) << 1;
            int i19 = -((i16 | 89) & (~i17));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            CardinalEnvironment = i20 % 128;
            if ((i20 % 2 == 0 ? 'I' : 'R') == 'R') {
                setHorizontalScrollBarEnabled.getInstance(cArr);
                this.getInstance = r5;
            } else {
                setHorizontalScrollBarEnabled.getInstance(cArr);
                this.getInstance = r5;
                throw r5;
            }
        }
        setPivotX setpivotx = this.getWarnings;
        if (setpivotx != null) {
            int i21 = (CardinalRenderType + 32) - 1;
            CardinalEnvironment = i21 % 128;
            if (i21 % 2 != 0) {
                setpivotx.configure();
                this.getWarnings = r5;
            } else {
                setpivotx.configure();
                this.getWarnings = r5;
                super.hashCode();
                throw r5;
            }
        }
        setScrollY setscrolly = this.onValidated;
        if ((setscrolly != null ? 7 : '/') != '/') {
            int i22 = CardinalEnvironment;
            int i23 = i22 | 1;
            int i24 = ((i23 << 1) - (~(-((~(i22 & 1)) & i23)))) - 1;
            CardinalRenderType = i24 % 128;
            int i25 = i24 % 2;
            setscrolly.init();
            this.onValidated = r5;
            int i26 = CardinalEnvironment;
            int i27 = i26 & 103;
            int i28 = (i26 | 103) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            CardinalRenderType = i30 % 128;
            int i31 = i30 % 2;
        }
        setRotationX setrotationx = this.cca_continue;
        if (!(setrotationx == null)) {
            int i32 = CardinalRenderType;
            int i33 = i32 & 25;
            int i34 = (((i32 ^ 25) | i33) << 1) - ((i32 | 25) & (~i33));
            CardinalEnvironment = i34 % 128;
            if ((i34 % 2 == 0 ? 28 : '`') != 28) {
                setrotationx.getInstance();
                this.cca_continue = r5;
            } else {
                setrotationx.getInstance();
                this.cca_continue = r5;
                super.hashCode();
                throw r5;
            }
        }
        setTransitionAlpha settransitionalpha = this.cleanup;
        if ((settransitionalpha != null ? Typography.dollar : 9) != 9) {
            int i35 = CardinalRenderType;
            int i36 = i35 & 1;
            int i37 = (i35 ^ 1) | i36;
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            CardinalEnvironment = i38 % 128;
            int i39 = i38 % 2;
            settransitionalpha.getInstance();
            this.cleanup = r5;
            int i40 = CardinalRenderType;
            int i41 = i40 & 43;
            int i42 = (i40 ^ 43) | i41;
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            CardinalEnvironment = i43 % 128;
            int i44 = i43 % 2;
        }
        if ((this.getSDKVersion != null ? '7' : 'F') != 'F') {
            int i45 = CardinalEnvironment;
            int i46 = ((i45 ^ 33) | (i45 & 33)) << 1;
            int i47 = -((i45 & -34) | ((~i45) & 33));
            int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
            CardinalRenderType = i48 % 128;
            int i49 = i48 % 2;
            this.getSDKVersion = r5;
            int i50 = i45 & 41;
            int i51 = (i45 ^ 41) | i50;
            int i52 = (i50 & i51) + (i51 | i50);
            CardinalRenderType = i52 % 128;
            int i53 = i52 % 2;
        }
        char[] cArr2 = this.configure;
        if ((cArr2 != null ? SignatureVisitor.SUPER : ')') != ')') {
            int i54 = CardinalEnvironment;
            int i55 = (i54 & -96) | ((~i54) & 95);
            int i56 = -(-((i54 & 95) << 1));
            int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
            CardinalRenderType = i57 % 128;
            if (i57 % 2 == 0) {
                setHorizontalScrollBarEnabled.getInstance(cArr2);
                this.configure = r5;
            } else {
                setHorizontalScrollBarEnabled.getInstance(cArr2);
                this.configure = r5;
                throw r5;
            }
        }
        char[] cArr3 = this.Cardinal;
        if ((cArr3 != null ? 11 : '?') != '?') {
            int i58 = ((CardinalRenderType + 111) - 1) - 1;
            CardinalEnvironment = i58 % 128;
            if (!(i58 % 2 != 0)) {
                setHorizontalScrollBarEnabled.getInstance(cArr3);
                this.Cardinal = r5;
                int i59 = 99 / 0;
            } else {
                setHorizontalScrollBarEnabled.getInstance(cArr3);
                this.Cardinal = r5;
            }
            int i60 = CardinalEnvironment;
            int i61 = i60 & 63;
            int i62 = -(-((i60 ^ 63) | i61));
            int i63 = (i61 & i62) + (i62 | i61);
            CardinalRenderType = i63 % 128;
            int i64 = i63 % 2;
        }
        int i65 = CardinalEnvironment;
        int i66 = i65 & 125;
        int i67 = (((i65 | 125) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
        CardinalRenderType = i67 % 128;
        if (i67 % 2 != 0) {
            z = false;
        }
        if (!z) {
            int i68 = 0 / 0;
        }
    }

    public final void init(setPivotX setpivotx) {
        int i = CardinalEnvironment;
        int i2 = (i & -118) | ((~i) & 117);
        int i3 = -(-((i & 117) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        CardinalRenderType = i5;
        int i6 = i4 % 2;
        this.getWarnings = setpivotx;
        int i7 = (i5 + 44) - 1;
        CardinalEnvironment = i7 % 128;
        int i8 = i7 % 2;
    }
}
