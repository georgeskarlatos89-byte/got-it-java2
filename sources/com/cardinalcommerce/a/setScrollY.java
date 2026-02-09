package com.cardinalcommerce.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class setScrollY implements Serializable, Runnable {
    private static int getProxyAddress = 0;
    private static int getUiType = 1;
    public long Cardinal;
    public char[] CardinalActionCode;
    public char[] CardinalChallengeObserver;
    public long CardinalConfigurationParameters;
    public char[] CardinalEnvironment;
    public char[] CardinalError;
    public char[] CardinalRenderType;
    public float CardinalUiType;
    public char[] cca_continue;
    public char[] cleanup;
    public char[] configure;
    public char[] getActionCode;
    public float getChallengeTimeout;
    private char[] getEnvironment;
    public char[] getInstance;
    public double getRequestTimeout;
    public char[] getSDKVersion;
    public char[] getString;
    public char[] getWarnings;
    public char[] init;
    public char[] onCReqSuccess;
    public char[] onValidated = setHorizontalScrollBarEnabled.configure(cca_continue());
    public double setChallengeTimeout;
    private int setEnvironment;
    private char[] setProxyAddress;
    public int setRequestTimeout;
    public char[] valueOf;
    public char[] values;

    setScrollY(Context context) {
        cca_continue(String.valueOf(context.getResources().getDisplayMetrics().densityDpi));
        Cardinal((int) context.getResources().getDisplayMetrics().density);
        cca_continue(context);
        getSDKVersion();
        Cardinal(context);
        configure();
        getInstance(context);
        onValidated();
        getWarnings();
        cleanup();
        Cardinal();
    }

    private void Cardinal() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getPath());
        this.CardinalConfigurationParameters = statFs.getTotalBytes();
        this.setProxyAddress = setHorizontalScrollBarEnabled.configure(statFs.toString());
        int i = (getProxyAddress + 92) - 1;
        getUiType = i % 128;
        int i2 = i % 2;
    }

    private void configure() {
        int i = getUiType;
        int i2 = i & 105;
        int i3 = -(-(i | 105));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getProxyAddress = i4 % 128;
        int i5 = i4 % 2;
        this.cleanup = setHorizontalScrollBarEnabled.configure(Build.BOOTLOADER);
        this.cca_continue = setHorizontalScrollBarEnabled.configure(Build.BRAND);
        this.getWarnings = setHorizontalScrollBarEnabled.configure(Build.DEVICE);
        this.CardinalRenderType = setHorizontalScrollBarEnabled.configure(Build.DISPLAY);
        this.valueOf = setHorizontalScrollBarEnabled.configure(Build.HARDWARE);
        this.getInstance = setHorizontalScrollBarEnabled.configure(Build.MANUFACTURER);
        this.CardinalEnvironment = setHorizontalScrollBarEnabled.configure(Build.PRODUCT);
        this.values = setHorizontalScrollBarEnabled.configure(Build.RADIO);
        this.getActionCode = setHorizontalScrollBarEnabled.configure(Arrays.toString(Build.SUPPORTED_32_BIT_ABIS));
        this.CardinalChallengeObserver = setHorizontalScrollBarEnabled.configure(Arrays.toString(Build.SUPPORTED_64_BIT_ABIS));
        this.getString = setHorizontalScrollBarEnabled.configure(Build.TAGS);
        this.Cardinal = Build.TIME;
        this.CardinalActionCode = setHorizontalScrollBarEnabled.configure(Build.TYPE);
        this.CardinalError = setHorizontalScrollBarEnabled.configure(Build.USER);
        int i6 = (getUiType + 32) - 1;
        getProxyAddress = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private void getInstance(Context context) {
        int i = getProxyAddress;
        int i2 = ((i | 15) << 1) - (i ^ 15);
        getUiType = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.CardinalUiType = displayMetrics.density;
        this.setRequestTimeout = displayMetrics.densityDpi;
        this.getChallengeTimeout = displayMetrics.scaledDensity;
        this.setChallengeTimeout = (double) displayMetrics.xdpi;
        this.getRequestTimeout = (double) displayMetrics.ydpi;
        int i4 = getUiType + 90;
        int i5 = (i4 ^ -1) + ((i4 & -1) << 1);
        getProxyAddress = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if ((androidx.core.content.ContextCompat.checkSelfPermission(r10, "android.permission.BLUETOOTH_CONNECT") == 0 ? true : true) != true) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if ((androidx.core.content.ContextCompat.checkSelfPermission(r10, "android.permission.BLUETOOTH_CONNECT") == 0 ? true : true) != true) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Cardinal(android.content.Context r10) {
        /*
            r9 = this;
            int r0 = getProxyAddress
            r1 = r0 ^ 83
            r0 = r0 & 83
            r2 = 1
            int r0 = r0 << r2
            int r1 = r1 + r0
            int r0 = r1 % 128
            getUiType = r0
            int r1 = r1 % 2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r3 = 0
            if (r0 < r1) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            r4 = 11
            r5 = 56
            r6 = 0
            if (r0 == r2) goto L_0x0021
            goto L_0x005f
        L_0x0021:
            int r0 = getUiType
            r7 = r0 & 27
            r0 = r0 ^ 27
            r0 = r0 | r7
            int r0 = -r0
            int r0 = -r0
            r8 = r7 | r0
            int r8 = r8 << r2
            r0 = r0 ^ r7
            int r8 = r8 - r0
            int r0 = r8 % 128
            getProxyAddress = r0
            int r8 = r8 % 2
            r0 = 73
            if (r8 == 0) goto L_0x003b
            r7 = r1
            goto L_0x003c
        L_0x003b:
            r7 = r0
        L_0x003c:
            java.lang.String r8 = "android.permission.BLUETOOTH_CONNECT"
            if (r7 == r0) goto L_0x0052
            int r7 = androidx.core.content.ContextCompat.checkSelfPermission(r10, r8)
            r8 = 26
            int r8 = r8 / r3
            if (r7 != 0) goto L_0x004b
            r7 = r4
            goto L_0x004c
        L_0x004b:
            r7 = r1
        L_0x004c:
            if (r7 == r1) goto L_0x005f
            goto L_0x0119
        L_0x0050:
            r10 = move-exception
            throw r10
        L_0x0052:
            int r7 = androidx.core.content.ContextCompat.checkSelfPermission(r10, r8)
            r8 = 38
            if (r7 != 0) goto L_0x005c
            r7 = r8
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            if (r7 == r8) goto L_0x0119
        L_0x005f:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r1) goto L_0x0065
            r0 = r2
            goto L_0x0066
        L_0x0065:
            r0 = r3
        L_0x0066:
            if (r0 == 0) goto L_0x00f8
            int r0 = getUiType
            r1 = r0 ^ 115(0x73, float:1.61E-43)
            r7 = r0 & 115(0x73, float:1.61E-43)
            r1 = r1 | r7
            int r1 = r1 << r2
            int r7 = ~r7
            r0 = r0 | 115(0x73, float:1.61E-43)
            r0 = r0 & r7
            int r0 = -r0
            r7 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r2
            int r7 = r7 + r0
            int r0 = r7 % 128
            getProxyAddress = r0
            int r7 = r7 % 2
            r0 = 37
            if (r7 == 0) goto L_0x0087
            r1 = 25
            goto L_0x0088
        L_0x0087:
            r1 = r0
        L_0x0088:
            java.lang.String r7 = "android.permission.BLUETOOTH"
            if (r1 != r0) goto L_0x00ef
            int r10 = androidx.core.content.ContextCompat.checkSelfPermission(r10, r7)
            r0 = 40
            if (r10 != 0) goto L_0x0097
            r10 = 68
            goto L_0x0098
        L_0x0097:
            r10 = r0
        L_0x0098:
            if (r10 == r0) goto L_0x00f8
            android.bluetooth.BluetoothAdapter r10 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            r0 = 91
            if (r10 == 0) goto L_0x00a3
            r5 = r0
        L_0x00a3:
            if (r5 == r0) goto L_0x00a6
            goto L_0x00c5
        L_0x00a6:
            int r1 = getUiType
            r3 = r1 ^ 85
            r1 = r1 & 85
            int r1 = r1 << r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            getProxyAddress = r1
            int r3 = r3 % 2
            r1 = 28
            if (r3 == 0) goto L_0x00b9
            r0 = r1
        L_0x00b9:
            if (r0 == r1) goto L_0x00df
            java.lang.String r10 = r10.getName()
            char[] r10 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r10)
            r9.onCReqSuccess = r10
        L_0x00c5:
            int r10 = getUiType
            r0 = r10 ^ 11
            r10 = r10 & r4
            int r10 = r10 << r2
            int r0 = r0 + r10
            int r10 = r0 % 128
            getProxyAddress = r10
            int r0 = r0 % 2
            r10 = 6
            if (r0 == 0) goto L_0x00d7
            r0 = r10
            goto L_0x00d9
        L_0x00d7:
            r0 = 98
        L_0x00d9:
            if (r0 == r10) goto L_0x00dc
            return
        L_0x00dc:
            throw r6     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r10 = move-exception
            throw r10
        L_0x00df:
            java.lang.String r10 = r10.getName()
            char[] r10 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r10)
            r9.onCReqSuccess = r10
            super.hashCode()     // Catch:{ all -> 0x00ed }
            throw r6     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r10 = move-exception
            throw r10
        L_0x00ef:
            androidx.core.content.ContextCompat.checkSelfPermission(r10, r7)
            super.hashCode()     // Catch:{ all -> 0x00f6 }
            throw r6     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r10 = move-exception
            throw r10
        L_0x00f8:
            java.lang.String r10 = "N/A"
            char[] r10 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r10)
            r9.onCReqSuccess = r10
            int r10 = getUiType
            int r10 = r10 + 72
            int r10 = r10 - r2
            int r0 = r10 % 128
            getProxyAddress = r0
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x010f
            r10 = r3
            goto L_0x0110
        L_0x010f:
            r10 = r2
        L_0x0110:
            if (r10 == r2) goto L_0x0118
            r10 = 63
            int r10 = r10 / r3
            return
        L_0x0116:
            r10 = move-exception
            throw r10
        L_0x0118:
            return
        L_0x0119:
            android.bluetooth.BluetoothAdapter r10 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r10 == 0) goto L_0x0120
            r3 = r2
        L_0x0120:
            if (r3 == r2) goto L_0x0123
            goto L_0x015c
        L_0x0123:
            int r1 = getProxyAddress
            r3 = r1 & 103(0x67, float:1.44E-43)
            r1 = r1 ^ 103(0x67, float:1.44E-43)
            r1 = r1 | r3
            r4 = r3 & r1
            r1 = r1 | r3
            int r4 = r4 + r1
            int r1 = r4 % 128
            getUiType = r1
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0138
            r1 = r0
            goto L_0x013a
        L_0x0138:
            r1 = 64
        L_0x013a:
            java.lang.String r10 = r10.getName()
            char[] r10 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r10)
            if (r1 == r0) goto L_0x0177
            r9.onCReqSuccess = r10
            int r10 = getUiType
            r0 = r10 | 39
            int r1 = r0 << 1
            r10 = r10 & 39
            int r10 = ~r10
            r10 = r10 & r0
            int r10 = -r10
            r0 = r1 ^ r10
            r10 = r10 & r1
            int r10 = r10 << r2
            int r0 = r0 + r10
            int r10 = r0 % 128
            getProxyAddress = r10
            int r0 = r0 % 2
        L_0x015c:
            int r10 = getProxyAddress
            r0 = r10 ^ 23
            r1 = r10 & 23
            r0 = r0 | r1
            int r0 = r0 << r2
            r1 = r10 & -24
            int r10 = ~r10
            r10 = r10 & 23
            r10 = r10 | r1
            int r10 = -r10
            r1 = r0 ^ r10
            r10 = r10 & r0
            int r10 = r10 << r2
            int r1 = r1 + r10
            int r10 = r1 % 128
            getUiType = r10
            int r1 = r1 % 2
            return
        L_0x0177:
            r9.onCReqSuccess = r10
            super.hashCode()     // Catch:{ all -> 0x017d }
            throw r6     // Catch:{ all -> 0x017d }
        L_0x017d:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScrollY.Cardinal(android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if ((r6 != null ? '!' : '^') != '!') goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if ((r6 != null ? '@' : 'U') != 'U') goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void cca_continue(android.content.Context r6) {
        /*
            r5 = this;
            int r0 = getProxyAddress
            r1 = r0 & 45
            r0 = r0 ^ 45
            r0 = r0 | r1
            r2 = r1 ^ r0
            r0 = r0 & r1
            r1 = 1
            int r0 = r0 << r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            getUiType = r0
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x0018
            r0 = 53
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            r2 = 0
            r3 = 0
            java.lang.String r4 = "window"
            if (r0 == r1) goto L_0x0035
            java.lang.Object r6 = r6.getSystemService(r4)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            r0 = 42
            int r0 = r0 / r2
            r0 = 33
            if (r6 == 0) goto L_0x002e
            r4 = r0
            goto L_0x0030
        L_0x002e:
            r4 = 94
        L_0x0030:
            if (r4 == r0) goto L_0x0045
            goto L_0x0065
        L_0x0033:
            r6 = move-exception
            throw r6
        L_0x0035:
            java.lang.Object r6 = r6.getSystemService(r4)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            r0 = 85
            if (r6 == 0) goto L_0x0042
            r4 = 64
            goto L_0x0043
        L_0x0042:
            r4 = r0
        L_0x0043:
            if (r4 == r0) goto L_0x0065
        L_0x0045:
            int r0 = getProxyAddress
            r3 = r0 | 35
            int r3 = r3 << r1
            r0 = r0 ^ 35
            int r3 = r3 - r0
            int r0 = r3 % 128
            getUiType = r0
            int r3 = r3 % 2
            android.view.Display r3 = r6.getDefaultDisplay()
            int r6 = getUiType
            r0 = r6 | 79
            int r0 = r0 << r1
            r6 = r6 ^ 79
            int r0 = r0 - r6
            int r6 = r0 % 128
            getProxyAddress = r6
            int r0 = r0 % 2
        L_0x0065:
            android.util.DisplayMetrics r6 = new android.util.DisplayMetrics
            r6.<init>()
            if (r3 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r2 = r1
        L_0x006e:
            if (r2 == 0) goto L_0x0071
            goto L_0x0093
        L_0x0071:
            int r0 = getUiType
            r2 = r0 ^ 95
            r0 = r0 & 95
            int r0 = r0 << r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            getProxyAddress = r0
            int r2 = r2 % 2
            r3.getMetrics(r6)
            int r0 = getUiType
            r2 = r0 & 27
            int r3 = ~r2
            r0 = r0 | 27
            r0 = r0 & r3
            int r1 = r2 << 1
            int r0 = r0 + r1
            int r1 = r0 % 128
            getProxyAddress = r1
            int r0 = r0 % 2
        L_0x0093:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.widthPixels
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "*"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6.heightPixels
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            char[] r6 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r6)
            r5.init = r6
            int r6 = getUiType
            r0 = r6 & 117(0x75, float:1.64E-43)
            r6 = r6 | 117(0x75, float:1.64E-43)
            int r0 = r0 + r6
            int r6 = r0 % 128
            getProxyAddress = r6
            int r0 = r0 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScrollY.cca_continue(android.content.Context):void");
    }

    private static String cca_continue() {
        String str;
        int i = getUiType;
        int i2 = ((i & 45) - (~(-(-(i | 45))))) - 1;
        getProxyAddress = i2 % 128;
        if ((i2 % 2 != 0 ? ',' : ']') != ',') {
            str = Resources.getSystem().getConfiguration().locale.toString().replaceAll("_", "-");
        } else {
            str = Resources.getSystem().getConfiguration().locale.toString().replaceAll("_", "-");
            int i3 = 29 / 0;
        }
        int i4 = getUiType;
        int i5 = i4 & 55;
        int i6 = i5 + ((i4 ^ 55) | i5);
        getProxyAddress = i6 % 128;
        if ((i6 % 2 != 0 ? 'V' : '[') == '[') {
            return str;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private void getSDKVersion() {
        int i = getUiType;
        int i2 = ((((i ^ 33) | (i & 33)) << 1) - (~(-((i & -34) | ((~i) & 33))))) - 1;
        getProxyAddress = i2 % 128;
        int i3 = i2 % 2;
        this.getSDKVersion = null;
        int i4 = i ^ 17;
        int i5 = ((i & 17) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        getProxyAddress = i7 % 128;
        int i8 = i7 % 2;
    }

    private void onValidated() {
        int i = getProxyAddress;
        int i2 = i | 83;
        int i3 = i2 << 1;
        int i4 = -((~(i & 83)) & i2);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        getUiType = i5 % 128;
        int i6 = i5 % 2;
        this.configure = setHorizontalScrollBarEnabled.configure(Build.MODEL);
        int i7 = getUiType;
        int i8 = (((i7 ^ 71) | (i7 & 71)) << 1) - (((~i7) & 71) | (i7 & -72));
        getProxyAddress = i8 % 128;
        if ((i8 % 2 != 0 ? 31 : '!') != '!') {
            throw null;
        }
    }

    private void getWarnings() {
        int i = (getUiType + 118) - 1;
        getProxyAddress = i % 128;
        if ((i % 2 != 0 ? 'Y' : '4') != 'Y') {
            this.cca_continue = setHorizontalScrollBarEnabled.configure(Build.BRAND);
            int i2 = getProxyAddress;
            int i3 = (i2 & -98) | ((~i2) & 97);
            int i4 = (i2 & 97) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            getUiType = i5 % 128;
            if (!(i5 % 2 != 0)) {
                int i6 = 71 / 0;
                return;
            }
            return;
        }
        this.cca_continue = setHorizontalScrollBarEnabled.configure(Build.BRAND);
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private void cleanup() {
        int i = getProxyAddress;
        int i2 = i & 39;
        int i3 = i2 + ((i ^ 39) | i2);
        getUiType = i3 % 128;
        int i4 = i3 % 2;
        this.getInstance = setHorizontalScrollBarEnabled.configure(Build.MANUFACTURER);
        int i5 = getProxyAddress;
        boolean z = true;
        int i6 = (i5 ^ 6) + ((i5 & 6) << 1);
        int i7 = (i6 & -1) + (i6 | -1);
        getUiType = i7 % 128;
        if (i7 % 2 == 0) {
            z = false;
        }
        if (!z) {
            int i8 = 98 / 0;
        }
    }

    private void Cardinal(int i) {
        int i2 = getUiType;
        int i3 = (i2 + 38) - 1;
        getProxyAddress = i3 % 128;
        int i4 = i3 % 2;
        this.setEnvironment = i;
        int i5 = (i2 ^ 2) + ((i2 & 2) << 1);
        int i6 = (i5 ^ -1) + ((i5 & -1) << 1);
        getProxyAddress = i6 % 128;
        int i7 = i6 % 2;
    }

    private void cca_continue(String str) {
        int i = getUiType;
        int i2 = ((i | 8) << 1) - (i ^ 8);
        int i3 = (i2 & -1) + (i2 | -1);
        getProxyAddress = i3 % 128;
        char c = i3 % 2 != 0 ? 7 : 'N';
        char[] configure2 = setHorizontalScrollBarEnabled.configure(str);
        if (c == 'N') {
            this.getEnvironment = configure2;
            int i4 = getProxyAddress;
            int i5 = ((i4 | 67) << 1) - (i4 ^ 67);
            getUiType = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.getEnvironment = configure2;
        throw null;
    }

    public final JSONObject getInstance() {
        JSONObject jSONObject = new JSONObject();
        boolean z = true;
        try {
            jSONObject.putOpt("AdvertisingId", setHorizontalScrollBarEnabled.cca_continue(this.getSDKVersion));
            jSONObject.putOpt("BootLoader", setHorizontalScrollBarEnabled.cca_continue(this.cleanup));
            jSONObject.putOpt("Brand", setHorizontalScrollBarEnabled.cca_continue(this.cca_continue));
            jSONObject.putOpt("ColorDepth", setHorizontalScrollBarEnabled.cca_continue(this.getEnvironment));
            jSONObject.putOpt("Density", Integer.valueOf(Integer.parseInt(String.valueOf(Math.round(this.CardinalUiType)))));
            jSONObject.putOpt("DensityDpi", Integer.valueOf(this.setRequestTimeout));
            jSONObject.putOpt("Device", setHorizontalScrollBarEnabled.cca_continue(this.getWarnings));
            jSONObject.putOpt("DeviceName", setHorizontalScrollBarEnabled.cca_continue(this.onCReqSuccess));
            jSONObject.putOpt("Display", setHorizontalScrollBarEnabled.cca_continue(this.CardinalRenderType));
            jSONObject.putOpt("GetTotalBytes", Long.valueOf(this.CardinalConfigurationParameters));
            jSONObject.putOpt("Hardware", setHorizontalScrollBarEnabled.cca_continue(this.valueOf));
            jSONObject.putOpt("Locale", setHorizontalScrollBarEnabled.cca_continue(this.onValidated));
            jSONObject.putOpt("Manufacturer", setHorizontalScrollBarEnabled.cca_continue(this.getInstance));
            jSONObject.putOpt(ExifInterface.TAG_MODEL, setHorizontalScrollBarEnabled.cca_continue(this.configure));
            jSONObject.putOpt("Product", setHorizontalScrollBarEnabled.cca_continue(this.CardinalEnvironment));
            jSONObject.putOpt("Radio", setHorizontalScrollBarEnabled.cca_continue(this.values));
            jSONObject.putOpt("ScaledDensity", Float.valueOf(this.getChallengeTimeout));
            jSONObject.putOpt("ScreenDensity", Integer.valueOf(this.setEnvironment));
            jSONObject.putOpt("ScreenResolution", setHorizontalScrollBarEnabled.cca_continue(this.init));
            if (setHorizontalScrollBarEnabled.Cardinal(this.getActionCode)) {
                jSONObject.putOpt("Supported32BitAbis", new JSONArray(Collections.singletonList(setHorizontalScrollBarEnabled.cca_continue(this.getActionCode))));
                int i = getUiType + 102;
                int i2 = (i & -1) + (i | -1);
                getProxyAddress = i2 % 128;
                int i3 = i2 % 2;
            }
            if (setHorizontalScrollBarEnabled.Cardinal(this.CardinalChallengeObserver)) {
                jSONObject.putOpt("Supported64BitAbis", new JSONArray(Collections.singletonList(setHorizontalScrollBarEnabled.cca_continue(this.CardinalChallengeObserver))));
                int i4 = getUiType;
                int i5 = (((i4 | 111) << 1) - (~(-(((~i4) & 111) | (i4 & -112))))) - 1;
                getProxyAddress = i5 % 128;
                int i6 = i5 % 2;
            }
            jSONObject.putOpt("Tags", setHorizontalScrollBarEnabled.cca_continue(this.getString));
            jSONObject.putOpt("Time", String.valueOf(this.Cardinal));
            jSONObject.putOpt("Type", setHorizontalScrollBarEnabled.cca_continue(this.CardinalActionCode));
            jSONObject.putOpt("User", setHorizontalScrollBarEnabled.cca_continue(this.CardinalError));
            jSONObject.putOpt("Xdpi", Double.valueOf(this.setChallengeTimeout));
            jSONObject.putOpt("Ydpi", Double.valueOf(this.getRequestTimeout));
            int i7 = getUiType;
            int i8 = i7 & 87;
            int i9 = -(-(i7 | 87));
            int i10 = (i8 & i9) + (i9 | i8);
            getProxyAddress = i10 % 128;
            int i11 = i10 % 2;
        } catch (JSONException e) {
            setTranslationY.cca_continue().configure("13101", e.getLocalizedMessage(), (String) null);
        }
        int i12 = getProxyAddress;
        int i13 = i12 ^ 15;
        int i14 = (((i12 & 15) | i13) << 1) - i13;
        getUiType = i14 % 128;
        if (i14 % 2 == 0) {
            z = false;
        }
        if (z) {
            return jSONObject;
        }
        int i15 = 91 / 0;
        return jSONObject;
    }

    public final void init() {
        int i = getUiType;
        int i2 = (i ^ 27) + ((i & 27) << 1);
        getProxyAddress = i2 % 128;
        int i3 = i2 % 2;
        Executors.newSingleThreadExecutor().execute(this);
        int i4 = getUiType;
        int i5 = (i4 & 11) + (i4 | 11);
        getProxyAddress = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void run() {
        int i = getUiType + 80;
        int i2 = (i ^ -1) + ((i & -1) << 1);
        getProxyAddress = i2 % 128;
        int i3 = i2 % 2;
        setHorizontalScrollBarEnabled.getInstance(this.configure);
        setHorizontalScrollBarEnabled.getInstance(this.cca_continue);
        setHorizontalScrollBarEnabled.getInstance(this.getInstance);
        this.Cardinal = 0;
        setHorizontalScrollBarEnabled.getInstance(this.init);
        this.setEnvironment = 0;
        setHorizontalScrollBarEnabled.getInstance(this.getEnvironment);
        setHorizontalScrollBarEnabled.getInstance(this.onValidated);
        setHorizontalScrollBarEnabled.getInstance(this.getSDKVersion);
        setHorizontalScrollBarEnabled.getInstance(this.onCReqSuccess);
        setHorizontalScrollBarEnabled.getInstance(this.cleanup);
        setHorizontalScrollBarEnabled.getInstance(this.getWarnings);
        setHorizontalScrollBarEnabled.getInstance(this.CardinalRenderType);
        setHorizontalScrollBarEnabled.getInstance(this.valueOf);
        setHorizontalScrollBarEnabled.getInstance(this.CardinalEnvironment);
        setHorizontalScrollBarEnabled.getInstance(this.values);
        setHorizontalScrollBarEnabled.getInstance(this.CardinalError);
        setHorizontalScrollBarEnabled.getInstance(this.CardinalActionCode);
        setHorizontalScrollBarEnabled.getInstance(this.getString);
        setHorizontalScrollBarEnabled.getInstance(this.getActionCode);
        setHorizontalScrollBarEnabled.getInstance(this.CardinalChallengeObserver);
        this.CardinalUiType = 0.0f;
        this.setRequestTimeout = 0;
        this.getChallengeTimeout = 0.0f;
        this.setChallengeTimeout = 0.0d;
        this.getRequestTimeout = 0.0d;
        setHorizontalScrollBarEnabled.getInstance(this.setProxyAddress);
        this.CardinalConfigurationParameters = 0;
        int i4 = (getProxyAddress + 56) - 1;
        getUiType = i4 % 128;
        int i5 = i4 % 2;
    }
}
