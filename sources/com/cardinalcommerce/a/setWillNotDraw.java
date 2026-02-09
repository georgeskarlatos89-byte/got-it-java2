package com.cardinalcommerce.a;

import com.cardinalcommerce.emvco.utils.EMVCoError;
import kotlin.text.Typography;

public class setWillNotDraw extends setTranslationY {
    private static volatile setWillNotDraw Cardinal = null;
    private static int getInstance = 0;
    private static int onValidated = 1;

    public static setWillNotDraw getInstance() {
        if (Cardinal == null) {
            synchronized (setWillNotDraw.class) {
                if (Cardinal == null) {
                    Cardinal = new setWillNotDraw();
                }
            }
        }
        return Cardinal;
    }

    private setWillNotDraw() {
        if (Cardinal != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance.");
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (cca_continue != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (cca_continue != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cardinal(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = onValidated
            r1 = r0 ^ 17
            r0 = r0 & 17
            r0 = r0 | r1
            r2 = 1
            int r0 = r0 << r2
            int r1 = -r1
            r3 = r0 & r1
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            getInstance = r0
            int r3 = r3 % 2
            r0 = 0
            if (r3 == 0) goto L_0x0019
            r1 = r2
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            r3 = 0
            if (r1 == 0) goto L_0x0027
            boolean r1 = cca_continue
            r4 = 96
            int r4 = r4 / r0
            if (r1 == 0) goto L_0x004b
            goto L_0x002b
        L_0x0025:
            r6 = move-exception
            throw r6
        L_0x0027:
            boolean r1 = cca_continue
            if (r1 == 0) goto L_0x004b
        L_0x002b:
            com.cardinalcommerce.a.setFocusable r1 = new com.cardinalcommerce.a.setFocusable
            r1.<init>()
            java.lang.String r1 = r1.getInstance()
            configure = r1
            java.lang.String r1 = "EMVCoLoggerV1"
            init = r1
            super.cca_continue(r6, r7, r3)
            int r6 = onValidated
            r7 = r6 | 67
            int r7 = r7 << r2
            r6 = r6 ^ 67
            int r7 = r7 - r6
            int r6 = r7 % 128
            getInstance = r6
            int r7 = r7 % 2
        L_0x004b:
            int r6 = getInstance
            r7 = r6 ^ 31
            r1 = r6 & 31
            r7 = r7 | r1
            int r7 = r7 << r2
            int r1 = ~r1
            r6 = r6 | 31
            r6 = r6 & r1
            int r6 = -r6
            int r6 = ~r6
            int r7 = r7 - r6
            int r7 = r7 - r2
            int r6 = r7 % 128
            onValidated = r6
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x0064
            r2 = r0
        L_0x0064:
            if (r2 == 0) goto L_0x0067
            return
        L_0x0067:
            super.hashCode()     // Catch:{ all -> 0x006b }
            throw r3     // Catch:{ all -> 0x006b }
        L_0x006b:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setWillNotDraw.Cardinal(java.lang.String, java.lang.String):void");
    }

    public final void cca_continue(String str, String str2) {
        int i = getInstance;
        int i2 = i & 67;
        int i3 = (((i ^ 67) | i2) << 1) - ((i | 67) & (~i2));
        onValidated = i3 % 128;
        if (!(i3 % 2 == 0)) {
            if (cca_continue) {
                configure = new setFocusable().getInstance();
                init = "EMVCoLoggerV1";
                super.configure(str, str2, (String) null);
                int i4 = getInstance;
                int i5 = i4 & 23;
                int i6 = -(-((i4 ^ 23) | i5));
                int i7 = (i5 & i6) + (i6 | i5);
                onValidated = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = getInstance;
            int i10 = i9 ^ 121;
            int i11 = (i9 & 121) << 1;
            int i12 = (i10 & i11) + (i11 | i10);
            onValidated = i12 % 128;
            if ((i12 % 2 == 0 ? 1 : 'F') == 1) {
                throw null;
            }
            return;
        }
        boolean z = cca_continue;
        throw null;
    }

    public final void getInstance(EMVCoError eMVCoError) {
        int i = getInstance;
        int i2 = i & 1;
        int i3 = (i ^ 1) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        onValidated = i4 % 128;
        if ((i4 % 2 == 0 ? Typography.quote : 'P') != 'P') {
            cca_continue(String.valueOf(eMVCoError.getErrorCode()), eMVCoError.getErrorDescription());
            int i5 = 21 / 0;
            return;
        }
        cca_continue(String.valueOf(eMVCoError.getErrorCode()), eMVCoError.getErrorDescription());
    }

    public final void Cardinal() {
        int i = onValidated;
        int i2 = i & 81;
        int i3 = (i ^ 81) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getInstance = i4 % 128;
        boolean z = i4 % 2 != 0;
        super.init((String) null);
        if (z) {
            int i5 = 30 / 0;
        }
    }

    public final setOutlineProvider configure() {
        int i = ((onValidated + 84) + 0) - 1;
        getInstance = i % 128;
        if ((i % 2 != 0 ? ')' : '$') == '$') {
            return super.configure();
        }
        super.configure();
        throw null;
    }

    public final void init() {
        int i = getInstance;
        int i2 = (i & 33) + (i | 33);
        onValidated = i2 % 128;
        int i3 = i2 % 2;
        super.init();
        int i4 = getInstance;
        int i5 = ((((i4 ^ 87) | (i4 & 87)) << 1) - (~(-(((~i4) & 87) | (i4 & -88))))) - 1;
        onValidated = i5 % 128;
        if (!(i5 % 2 != 0)) {
            int i6 = 36 / 0;
        }
    }
}
