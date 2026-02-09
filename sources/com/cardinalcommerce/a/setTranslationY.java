package com.cardinalcommerce.a;

import android.util.Log;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class setTranslationY {
    protected static boolean cca_continue = false;
    private static int cleanup = 0;
    protected static String configure = null;
    private static volatile setTranslationY getInstance = null;
    protected static String init = null;
    private static int onValidated = 1;
    private final String Cardinal = "setTranslationY";

    public static setTranslationY cca_continue() {
        if (getInstance == null) {
            synchronized (setTranslationY.class) {
                if (getInstance == null) {
                    getInstance = new setTranslationY();
                }
            }
        }
        return getInstance;
    }

    public setTranslationY() {
        cca_continue = true;
    }

    public void configure(String str, String str2, String str3) {
        int i = cleanup;
        int i2 = i & 29;
        int i3 = i | 29;
        int i4 = (i2 & i3) + (i3 | i2);
        onValidated = i4 % 128;
        int i5 = i4 % 2;
        configure(setStateListAnimator.configure(str, str2, str3));
        int i6 = cleanup;
        int i7 = ((i6 & -84) | ((~i6) & 83)) + ((i6 & 83) << 1);
        onValidated = i7 % 128;
        int i8 = i7 % 2;
    }

    public void cca_continue(String str, String str2, String str3) {
        boolean z = true;
        int i = (onValidated + 19) - 1;
        int i2 = (i & -1) + (i | -1);
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            z = false;
        }
        if (z) {
            configure(setStateListAnimator.getInstance(str, str2, str3));
            int i3 = 44 / 0;
            return;
        }
        configure(setStateListAnimator.getInstance(str, str2, str3));
    }

    public static void getInstance(boolean z) {
        int i = onValidated;
        int i2 = i + 89;
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        cca_continue = z;
        int i4 = i & 45;
        int i5 = -(-((i ^ 45) | i4));
        int i6 = (i4 & i5) + (i4 | i5);
        cleanup = i6 % 128;
        if ((i6 % 2 != 0 ? '9' : 'N') == '9') {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        if ((r8.equals("SANDBOX") ? true : true) != true) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String cca_continue(java.lang.String r8) {
        /*
            int r0 = onValidated
            r1 = r0 ^ 45
            r2 = r0 & 45
            r1 = r1 | r2
            r3 = 1
            int r1 = r1 << r3
            int r2 = ~r2
            r4 = r0 | 45
            r2 = r2 & r4
            int r2 = -r2
            int r2 = ~r2
            int r1 = r1 - r2
            int r1 = r1 - r3
            int r2 = r1 % 128
            cleanup = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L_0x001c
            r1 = r2
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            r4 = 0
            if (r1 != r3) goto L_0x0117
            r1 = 74
            if (r8 != 0) goto L_0x0027
            r5 = 42
            goto L_0x0028
        L_0x0027:
            r5 = r1
        L_0x0028:
            java.lang.String r6 = "https://cmsdk.cardinalcommerce.com/prod_logs"
            r7 = 26
            if (r5 == r1) goto L_0x004b
            int r0 = r0 + 94
            r8 = r0 ^ -1
            r0 = r0 & -1
            int r0 = r0 << r3
            int r8 = r8 + r0
            int r0 = r8 % 128
            cleanup = r0
            int r8 = r8 % 2
            r0 = 19
            if (r8 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r7 = r0
        L_0x0042:
            if (r7 != r0) goto L_0x0045
            return r6
        L_0x0045:
            super.hashCode()     // Catch:{ all -> 0x0049 }
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r8 = move-exception
            throw r8
        L_0x004b:
            boolean r0 = com.cardinalcommerce.shared.cs.utils.ThreeDSStrings.IS_EXTERNAL_BUILD
            if (r0 != 0) goto L_0x0051
            r0 = r3
            goto L_0x0052
        L_0x0051:
            r0 = r2
        L_0x0052:
            if (r0 == r3) goto L_0x0055
            goto L_0x009e
        L_0x0055:
            int r0 = onValidated
            r1 = r0 ^ 115(0x73, float:1.61E-43)
            r5 = r0 & 115(0x73, float:1.61E-43)
            r1 = r1 | r5
            int r1 = r1 << r3
            int r5 = ~r5
            r0 = r0 | 115(0x73, float:1.61E-43)
            r0 = r0 & r5
            int r0 = -r0
            r5 = r1 & r0
            r0 = r0 | r1
            int r5 = r5 + r0
            int r0 = r5 % 128
            cleanup = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0070
            r0 = r3
            goto L_0x0071
        L_0x0070:
            r0 = r2
        L_0x0071:
            java.lang.String r1 = "QA"
            if (r0 != 0) goto L_0x010e
            boolean r0 = r8.equals(r1)
            r1 = 34
            if (r0 != 0) goto L_0x007f
            r0 = r1
            goto L_0x0081
        L_0x007f:
            r0 = 53
        L_0x0081:
            if (r0 == r1) goto L_0x0084
            goto L_0x00ed
        L_0x0084:
            int r0 = cleanup
            int r0 = r0 + 62
            int r0 = r0 - r3
            int r1 = r0 % 128
            onValidated = r1
            int r0 = r0 % 2
            java.lang.String r0 = "SANDBOX"
            boolean r0 = r8.equals(r0)
            r1 = 97
            if (r0 == 0) goto L_0x009b
            r0 = r1
            goto L_0x009c
        L_0x009b:
            r0 = r7
        L_0x009c:
            if (r0 == r1) goto L_0x00ed
        L_0x009e:
            java.lang.String r0 = "STAGING"
            boolean r8 = r8.equals(r0)
            r0 = 65
            if (r8 == 0) goto L_0x00a9
            r7 = r0
        L_0x00a9:
            if (r7 == r0) goto L_0x00c4
            int r8 = onValidated
            r0 = r8 & -12
            int r1 = ~r8
            r2 = 11
            r1 = r1 & r2
            r0 = r0 | r1
            r8 = r8 & r2
            int r8 = r8 << r3
            int r8 = -r8
            int r8 = -r8
            r1 = r0 ^ r8
            r8 = r8 & r0
            int r8 = r8 << r3
            int r1 = r1 + r8
            int r8 = r1 % 128
            cleanup = r8
            int r1 = r1 % 2
            return r6
        L_0x00c4:
            int r8 = cleanup
            r0 = r8 & 71
            r1 = r8 | 71
            int r0 = r0 + r1
            int r1 = r0 % 128
            onValidated = r1
            int r0 = r0 % 2
            r0 = r8 | 107(0x6b, float:1.5E-43)
            int r0 = r0 << r3
            r8 = r8 ^ 107(0x6b, float:1.5E-43)
            int r0 = r0 - r8
            int r8 = r0 % 128
            onValidated = r8
            int r0 = r0 % 2
            r8 = 73
            if (r0 != 0) goto L_0x00e3
            r0 = r8
            goto L_0x00e5
        L_0x00e3:
            r0 = 28
        L_0x00e5:
            if (r0 == r8) goto L_0x00ea
            java.lang.String r8 = "https://cmsdk.cardinalcommerce.com/stag_logs"
            return r8
        L_0x00ea:
            throw r4     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r8 = move-exception
            throw r8
        L_0x00ed:
            int r8 = cleanup
            r0 = r8 ^ 113(0x71, float:1.58E-43)
            r1 = r8 & 113(0x71, float:1.58E-43)
            r0 = r0 | r1
            int r0 = r0 << r3
            int r1 = ~r1
            r8 = r8 | 113(0x71, float:1.58E-43)
            r8 = r8 & r1
            int r0 = r0 - r8
            int r8 = r0 % 128
            onValidated = r8
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0103
            r3 = r2
        L_0x0103:
            if (r3 == 0) goto L_0x0108
            java.lang.String r8 = ""
            return r8
        L_0x0108:
            super.hashCode()     // Catch:{ all -> 0x010c }
            throw r4     // Catch:{ all -> 0x010c }
        L_0x010c:
            r8 = move-exception
            throw r8
        L_0x010e:
            r8.equals(r1)
            super.hashCode()     // Catch:{ all -> 0x0115 }
            throw r4     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r8 = move-exception
            throw r8
        L_0x0117:
            throw r4     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setTranslationY.cca_continue(java.lang.String):java.lang.String");
    }

    private setOutlineProvider getInstance(String str, String str2, setStateListAnimator setstatelistanimator) {
        setOutlineProvider configure2 = configure();
        HashMap hashMap = new HashMap();
        hashMap.put(ThreeDSStrings.MUTATOR_KEY, str2);
        hashMap.put("identifier", str);
        hashMap.put(ThreeDSStrings.SESSION_ID_KEY, setstatelistanimator.Cardinal());
        JSONObject instance = configure2.getInstance(hashMap, ThreeDSStrings.SESSION_ID_KEY);
        boolean z = false;
        if (instance != null) {
            try {
                setClipToOutline setcliptooutline = new setClipToOutline(instance);
                setcliptooutline.Cardinal(setstatelistanimator.Cardinal());
                setcliptooutline.configure(setstatelistanimator.configure());
                configure2.configure(instance, setcliptooutline.init());
                int i = cleanup + 84;
                int i2 = (i ^ -1) + ((i & -1) << 1);
                onValidated = i2 % 128;
                if (i2 % 2 == 0) {
                    z = true;
                }
                if (!z) {
                    return configure2;
                }
                Throwable th = null;
                super.hashCode();
                throw th;
            } catch (JSONException e) {
                Log.e(this.Cardinal, new StringBuilder("Exception during creating logs JSON. Error: ").append(e.getLocalizedMessage()).toString());
            }
        }
        if (configure2.length() == 100) {
            configure2 = new setOutlineProvider();
            int i3 = onValidated;
            int i4 = i3 & 5;
            int i5 = ((i3 | 5) & (~i4)) + (i4 << 1);
            cleanup = i5 % 128;
            int i6 = i5 % 2;
        }
        setClipToOutline setcliptooutline2 = new setClipToOutline(str, str2, setstatelistanimator.Cardinal());
        setcliptooutline2.configure(setstatelistanimator.configure());
        configure2.put(setcliptooutline2.init());
        int i7 = cleanup;
        int i8 = i7 & 83;
        int i9 = (i7 ^ 83) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        onValidated = i10 % 128;
        if ((i10 % 2 == 0 ? 'B' : 'M') != 'B') {
            return configure2;
        }
        int i11 = 85 / 0;
        return configure2;
    }

    private void configure(setStateListAnimator setstatelistanimator) {
        int i = onValidated;
        int i2 = (i & 122) + (i | 122);
        int i3 = ((i2 | -1) << 1) - (i2 ^ -1);
        cleanup = i3 % 128;
        int i4 = i3 % 2;
        boolean z = false;
        if (!(!cca_continue)) {
            int i5 = (i + 22) - 1;
            cleanup = i5 % 128;
            if (i5 % 2 != 0) {
                z = true;
            }
            configure(configure, init, setstatelistanimator);
            if (z) {
                Throwable th = null;
                super.hashCode();
                throw th;
            }
        }
        int i6 = cleanup + 27;
        onValidated = i6 % 128;
        int i7 = i6 % 2;
    }

    private void configure(String str, String str2, setStateListAnimator setstatelistanimator) {
        int i = cleanup;
        int i2 = i & 117;
        int i3 = ((((i ^ 117) | i2) << 1) - (~(-((i | 117) & (~i2))))) - 1;
        onValidated = i3 % 128;
        boolean z = i3 % 2 != 0;
        Throwable th = null;
        if (z) {
            if (cca_continue) {
                new setOutlineAmbientShadowColor().configure(getInstance(str, str2, setstatelistanimator).toString());
                int i4 = cleanup;
                int i5 = ((i4 | 59) << 1) - (i4 ^ 59);
                onValidated = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = cleanup;
            int i8 = i7 & 121;
            int i9 = (i7 | 121) & (~i8);
            int i10 = -(-(i8 << 1));
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            onValidated = i11 % 128;
            if ((i11 % 2 == 0 ? '9' : 16) == '9') {
                super.hashCode();
                throw th;
            }
            return;
        }
        super.hashCode();
        throw th;
    }

    private static String getInstance() {
        int i = (onValidated + 36) - 1;
        int i2 = i % 128;
        cleanup = i2;
        if ((i % 2 != 0 ? '9' : 27) != 27) {
            throw null;
        } else if (cca_continue) {
            String configure2 = new setOutlineAmbientShadowColor().configure();
            int i3 = onValidated;
            int i4 = ((i3 | 51) << 1) - (i3 ^ 51);
            cleanup = i4 % 128;
            int i5 = i4 % 2;
            return configure2;
        } else {
            int i6 = (i2 | 113) << 1;
            int i7 = -(i2 ^ 113);
            int i8 = (i6 & i7) + (i6 | i7);
            onValidated = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
    }

    public setOutlineProvider configure() {
        String configure2 = new setOutlineAmbientShadowColor().configure();
        if (!configure2.isEmpty()) {
            try {
                setOutlineProvider setoutlineprovider = new setOutlineProvider(configure2);
                int i = cleanup;
                int i2 = ((i & 57) - (~(i | 57))) - 1;
                onValidated = i2 % 128;
                int i3 = i2 % 2;
                return setoutlineprovider;
            } catch (JSONException e) {
                Log.e(this.Cardinal, new StringBuilder("Exception during creating logs JSON. Error: ").append(e.getLocalizedMessage()).toString());
            }
        }
        setOutlineProvider setoutlineprovider2 = new setOutlineProvider();
        int i4 = onValidated;
        int i5 = (((i4 ^ 2) + ((i4 & 2) << 1)) + 0) - 1;
        cleanup = i5 % 128;
        int i6 = i5 % 2;
        return setoutlineprovider2;
    }

    public void init(String str) {
        int i = onValidated;
        int i2 = i & 107;
        int i3 = ((((i ^ 107) | i2) << 1) - (~(-((i | 107) & (~i2))))) - 1;
        cleanup = i3 % 128;
        int i4 = i3 % 2;
        if (cca_continue) {
            new configure(getInstance(), cca_continue(str)).cca_continue();
            int i5 = onValidated + 9;
            cleanup = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = onValidated;
        int i8 = i7 & 59;
        int i9 = -(-(i7 | 59));
        int i10 = (i8 & i9) + (i9 | i8);
        cleanup = i10 % 128;
        int i11 = i10 % 2;
    }

    public void init() {
        int i = onValidated;
        int i2 = i & 39;
        int i3 = (i | 39) & (~i2);
        boolean z = true;
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        cleanup = i5 % 128;
        int i6 = i5 % 2;
        if (cca_continue) {
            new setOutlineAmbientShadowColor().init();
            int i7 = onValidated;
            int i8 = ((i7 & -16) | ((~i7) & 15)) + ((i7 & 15) << 1);
            cleanup = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = cleanup;
        int i11 = ((i10 ^ 20) + ((i10 & 20) << 1)) - 1;
        onValidated = i11 % 128;
        if (i11 % 2 == 0) {
            z = false;
        }
        if (!z) {
            int i12 = 48 / 0;
        }
    }

    static class configure extends setKeyboardNavigationCluster {
        private static int Cardinal = 0;
        private static int configure = 1;

        public final void cca_continue(Exception exc, setContextClickable setcontextclickable) {
            int i = configure;
            int i2 = i & 65;
            int i3 = (i | 65) & (~i2);
            boolean z = true;
            int i4 = i2 << 1;
            int i5 = (i3 & i4) + (i3 | i4);
            Cardinal = i5 % 128;
            if (i5 % 2 != 0) {
                z = false;
            }
            if (!z) {
                throw null;
            }
        }

        public final void configure(String str, int i) {
            int i2 = configure;
            int i3 = i2 & 69;
            int i4 = ((i2 ^ 69) | i3) << 1;
            int i5 = -((i2 | 69) & (~i3));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            Cardinal = i6 % 128;
            int i7 = i6 % 2;
        }

        public configure(String str, String str2) {
            Log.d("CARDINAL EVENT LOG \n", str);
            super.Cardinal(str2, str, 10000);
        }

        public final void getInstance(String str) {
            int i = configure;
            int i2 = (i & 31) + (i | 31);
            Cardinal = i2 % 128;
            if ((i2 % 2 != 0 ? 'B' : 26) == 26) {
                setTranslationY.cca_continue().init();
                int i3 = configure;
                int i4 = ((i3 | 101) << 1) - (i3 ^ 101);
                Cardinal = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            setTranslationY.cca_continue().init();
            throw null;
        }
    }
}
