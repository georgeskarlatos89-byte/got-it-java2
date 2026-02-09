package com.cardinalcommerce.a;

import android.os.Build;
import java.io.Serializable;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public final class setRotationX implements Serializable {
    private static int CardinalRenderType = 1;
    private static char[] cleanup = setHorizontalScrollBarEnabled.configure("Android");
    private static int valueOf;
    public char[] Cardinal;
    public char[] cca_continue = setHorizontalScrollBarEnabled.configure(Build.VERSION.RELEASE);
    public char[] configure = setHorizontalScrollBarEnabled.configure(String.valueOf(Build.VERSION.SDK_INT));
    public char[] getInstance = ((char[]) cleanup.clone());
    public int getSDKVersion;
    public int getWarnings;
    public char[] init = setHorizontalScrollBarEnabled.configure(Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName());
    public char[] onCReqSuccess;
    public char[] onValidated;

    static {
        int i = CardinalRenderType;
        int i2 = ((i | 73) << 1) - (i ^ 73);
        valueOf = i2 % 128;
        int i3 = i2 % 2;
    }

    setRotationX() {
        Cardinal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 109 ? '?' : 7) != '?') goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Cardinal() {
        /*
            r5 = this;
            int r0 = CardinalRenderType
            r1 = r0 & 15
            r0 = r0 | 15
            int r1 = r1 + r0
            int r0 = r1 % 128
            valueOf = r0
            int r1 = r1 % 2
            r0 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0013
            r1 = r2
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = android.os.Build.VERSION.CODENAME
            char[] r1 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r1)
            r5.Cardinal = r1
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            char[] r1 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r1)
            r5.onValidated = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 109(0x6d, float:1.53E-43)
            r4 = 63
            if (r1 < r3) goto L_0x0030
            r1 = r4
            goto L_0x0031
        L_0x0030:
            r1 = 7
        L_0x0031:
            if (r1 == r4) goto L_0x0044
            goto L_0x0061
        L_0x0034:
            java.lang.String r1 = android.os.Build.VERSION.CODENAME
            char[] r1 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r1)
            r5.Cardinal = r1
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            char[] r1 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r1)
            r5.onValidated = r1
        L_0x0044:
            int r1 = valueOf
            r3 = r1 | 105(0x69, float:1.47E-43)
            int r3 = r3 << r2
            r1 = r1 ^ 105(0x69, float:1.47E-43)
            int r3 = r3 - r1
            int r1 = r3 % 128
            CardinalRenderType = r1
            int r3 = r3 % 2
            int r1 = android.os.Build.VERSION.PREVIEW_SDK_INT
            r5.getSDKVersion = r1
            int r1 = CardinalRenderType
            int r1 = r1 + 8
            int r1 = r1 - r2
            int r3 = r1 % 128
            valueOf = r3
            int r1 = r1 % 2
        L_0x0061:
            int r1 = android.os.Build.VERSION.SDK_INT
            r5.getWarnings = r1
            int r1 = CardinalRenderType
            r3 = r1 & -100
            int r4 = ~r1
            r4 = r4 & 99
            r3 = r3 | r4
            r1 = r1 & 99
            int r1 = r1 << r2
            r4 = r3 & r1
            r1 = r1 | r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            valueOf = r1
            int r4 = r4 % 2
            java.lang.String r1 = android.os.Build.VERSION.SECURITY_PATCH
            char[] r1 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r1)
            r5.onCReqSuccess = r1
            int r1 = CardinalRenderType
            r3 = r1 & 3
            r1 = r1 ^ 3
            r1 = r1 | r3
            int r3 = r3 + r1
            int r1 = r3 % 128
            valueOf = r1
            int r3 = r3 % 2
            int r1 = valueOf
            r3 = r1 & 103(0x67, float:1.44E-43)
            r1 = r1 | 103(0x67, float:1.44E-43)
            int r3 = r3 + r1
            int r1 = r3 % 128
            CardinalRenderType = r1
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x00a0
            r0 = r2
        L_0x00a0:
            if (r0 != 0) goto L_0x00a3
            return
        L_0x00a3:
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x00a8 }
            throw r0     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setRotationX.Cardinal():void");
    }

    public final JSONObject configure() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("ApiVersion", setHorizontalScrollBarEnabled.cca_continue(this.configure));
            jSONObject.putOpt("CodeName", setHorizontalScrollBarEnabled.cca_continue(this.Cardinal));
            jSONObject.putOpt("Incremental", setHorizontalScrollBarEnabled.cca_continue(this.onValidated));
            jSONObject.putOpt("OsName", setHorizontalScrollBarEnabled.cca_continue(this.init));
            jSONObject.putOpt("PreviewSdkInt", Integer.valueOf(this.getSDKVersion));
            jSONObject.putOpt("SdkInt", Integer.valueOf(this.getWarnings));
            jSONObject.putOpt("SecurityPatch", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess));
            jSONObject.putOpt("Type", setHorizontalScrollBarEnabled.cca_continue(this.getInstance));
            jSONObject.putOpt("Version", setHorizontalScrollBarEnabled.cca_continue(this.cca_continue));
            int i = CardinalRenderType;
            int i2 = i & 61;
            int i3 = (i ^ 61) | i2;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            valueOf = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException e) {
            setTranslationY.cca_continue().configure("13101", e.getLocalizedMessage(), (String) null);
        }
        int i6 = CardinalRenderType;
        int i7 = (i6 & -104) | ((~i6) & 103);
        int i8 = (i6 & 103) << 1;
        int i9 = (i7 & i8) + (i8 | i7);
        valueOf = i9 % 128;
        int i10 = i9 % 2;
        return jSONObject;
    }

    public final void getInstance() {
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            private static int configure = 0;
            private static int init = 1;

            public final void run() {
                int i = init;
                int i2 = i ^ 55;
                int i3 = (i & 55) << 1;
                int i4 = (i2 & i3) + (i3 | i2);
                configure = i4 % 128;
                int i5 = i4 % 2;
                setHorizontalScrollBarEnabled.getInstance(setRotationX.this.getInstance);
                setHorizontalScrollBarEnabled.getInstance(setRotationX.this.cca_continue);
                setHorizontalScrollBarEnabled.getInstance(setRotationX.this.configure);
                setHorizontalScrollBarEnabled.getInstance(setRotationX.this.init);
                setHorizontalScrollBarEnabled.getInstance(setRotationX.this.Cardinal);
                setHorizontalScrollBarEnabled.getInstance(setRotationX.this.onValidated);
                boolean z = false;
                setRotationX.this.getSDKVersion = 0;
                setRotationX.this.getWarnings = 0;
                setHorizontalScrollBarEnabled.getInstance(setRotationX.this.onCReqSuccess);
                int i6 = configure;
                int i7 = i6 & 93;
                int i8 = i7 + ((i6 ^ 93) | i7);
                init = i8 % 128;
                if (i8 % 2 == 0) {
                    z = true;
                }
                if (z) {
                    throw null;
                }
            }
        });
        int i = valueOf;
        int i2 = i & 105;
        int i3 = i | 105;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        CardinalRenderType = i4 % 128;
        int i5 = i4 % 2;
    }
}
