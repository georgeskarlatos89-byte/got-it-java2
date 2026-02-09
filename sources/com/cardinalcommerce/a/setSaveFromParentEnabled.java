package com.cardinalcommerce.a;

import android.content.Context;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters;

public final class setSaveFromParentEnabled {
    private static int cca_continue = 0;
    private static setScaleY configure = null;
    private static int getInstance = 1;
    private static setSaveFromParentEnabled init;
    private setTop Cardinal;

    public static synchronized setSaveFromParentEnabled getInstance() {
        setSaveFromParentEnabled setsavefromparentenabled;
        synchronized (setSaveFromParentEnabled.class) {
            int i = cca_continue + 80;
            int i2 = ((i | -1) << 1) - (i ^ -1);
            getInstance = i2 % 128;
            int i3 = i2 % 2;
            if (init == null) {
                init = new setSaveFromParentEnabled();
                configure = new setScaleY();
                int i4 = getInstance;
                int i5 = (((i4 & 58) + (i4 | 58)) + 0) - 1;
                cca_continue = i5 % 128;
                if (i5 % 2 != 0) {
                }
            }
            setsavefromparentenabled = init;
            int i6 = cca_continue;
            int i7 = (i6 & -54) | ((~i6) & 53);
            int i8 = -(-((i6 & 53) << 1));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            getInstance = i9 % 128;
            int i10 = i9 % 2;
        }
        return setsavefromparentenabled;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0 != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if ((configure != null ? 'Z' : ']') != 'Z') goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init() {
        /*
            int r0 = getInstance
            r1 = r0 & 71
            int r2 = ~r1
            r0 = r0 | 71
            r0 = r0 & r2
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 & r1
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            cca_continue = r0
            int r3 = r3 % 2
            r0 = 0
            if (r3 == 0) goto L_0x0019
            r1 = r0
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            if (r1 == r2) goto L_0x002a
            com.cardinalcommerce.a.setScaleY r1 = configure
            r3 = 32
            int r3 = r3 / r0
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            if (r0 == 0) goto L_0x0037
            goto L_0x0056
        L_0x0028:
            r0 = move-exception
            throw r0
        L_0x002a:
            com.cardinalcommerce.a.setScaleY r0 = configure
            r1 = 90
            if (r0 == 0) goto L_0x0032
            r0 = r1
            goto L_0x0034
        L_0x0032:
            r0 = 93
        L_0x0034:
            if (r0 == r1) goto L_0x0037
            goto L_0x0056
        L_0x0037:
            com.cardinalcommerce.a.setScaleY r0 = configure
            r0.onValidated()
            int r0 = cca_continue
            r1 = r0 ^ 7
            r3 = r0 & 7
            r1 = r1 | r3
            int r1 = r1 << r2
            r3 = r0 & -8
            int r0 = ~r0
            r0 = r0 & 7
            r0 = r0 | r3
            int r0 = -r0
            r3 = r1 | r0
            int r3 = r3 << r2
            r0 = r0 ^ r1
            int r3 = r3 - r0
            int r0 = r3 % 128
            getInstance = r0
            int r3 = r3 % 2
        L_0x0056:
            r0 = 0
            configure = r0
            init = r0
            int r0 = cca_continue
            r1 = r0 ^ 74
            r0 = r0 & 74
            int r0 = r0 << r2
            int r1 = r1 + r0
            r0 = r1 | -1
            int r0 = r0 << r2
            r1 = r1 ^ -1
            int r0 = r0 - r1
            int r1 = r0 % 128
            getInstance = r1
            int r0 = r0 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setSaveFromParentEnabled.init():void");
    }

    public final void cca_continue(Context context, CardinalConfigurationParameters cardinalConfigurationParameters, boolean z) {
        int i = cca_continue;
        boolean z2 = true;
        int i2 = ((i | 91) << 1) - (i ^ 91);
        getInstance = i2 % 128;
        if (i2 % 2 != 0) {
            z2 = false;
        }
        if (!z2) {
            configure.getInstance(context, cardinalConfigurationParameters);
            init(z, context);
            return;
        }
        configure.getInstance(context, cardinalConfigurationParameters);
        init(z, context);
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public static void getInstance(Context context, boolean z) {
        int i = cca_continue;
        int i2 = i & 123;
        int i3 = (i2 - (~(-(-((i ^ 123) | i2))))) - 1;
        getInstance = i3 % 128;
        int i4 = i3 % 2;
        configure.getInstance(context.getApplicationContext(), z);
        int i5 = cca_continue;
        int i6 = (i5 | 119) << 1;
        int i7 = -(((~i5) & 119) | (i5 & -120));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        getInstance = i8 % 128;
        if ((i8 % 2 == 0 ? (char) 13 : 16) != 16) {
            throw null;
        }
    }

    public static setScaleY Cardinal() {
        int i = cca_continue;
        int i2 = i & 73;
        int i3 = ((((i ^ 73) | i2) << 1) - (~(-((i | 73) & (~i2))))) - 1;
        int i4 = i3 % 128;
        getInstance = i4;
        int i5 = i3 % 2;
        setScaleY setscaley = configure;
        int i6 = (i4 & -80) | ((~i4) & 79);
        int i7 = -(-((i4 & 79) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        cca_continue = i8 % 128;
        int i9 = i8 % 2;
        return setscaley;
    }

    private void init(boolean z, Context context) {
        setTop settop = new setTop(z, context);
        this.Cardinal = settop;
        configure.cca_continue(settop);
        int i = cca_continue;
        int i2 = i & 125;
        int i3 = -(-((i ^ 125) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getInstance = i4 % 128;
        int i5 = i4 % 2;
    }

    public final setTop cca_continue() {
        int i = getInstance;
        int i2 = i & 87;
        int i3 = -(-((i ^ 87) | i2));
        int i4 = (i2 & i3) + (i2 | i3);
        cca_continue = i4 % 128;
        int i5 = i4 % 2;
        setTop settop = this.Cardinal;
        int i6 = ((i | 119) << 1) - (i ^ 119);
        cca_continue = i6 % 128;
        int i7 = i6 % 2;
        return settop;
    }
}
