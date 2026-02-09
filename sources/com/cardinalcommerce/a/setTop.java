package com.cardinalcommerce.a;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import com.cardinalcommerce.shared.models.Warning;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class setTop {
    private static int cleanup = 1;
    private static int onCReqSuccess;
    private final boolean Cardinal = configure();
    private final boolean cca_continue = getInstance();
    private boolean configure;
    private final boolean getInstance = onCReqSuccess();
    private JSONArray getSDKVersion;
    private final boolean getWarnings;
    private final boolean init = cleanup();
    private List<Warning> onValidated;

    public setTop(boolean z, Context context) {
        this.configure = z;
        this.getWarnings = cca_continue(context);
        CardinalEnvironment();
    }

    private boolean cca_continue(Context context) {
        boolean contains = new ArrayList<String>() {
            {
                add("com.android.vending");
                add("com.amazon.venezia");
                add("com.sec.android.app.samsungapps");
                add("com.amazon.mshop.android");
            }
        }.contains(context.getPackageManager().getInstallerPackageName(context.getPackageName()));
        int i = cleanup + 124;
        int i2 = (i ^ -1) + ((i & -1) << 1);
        onCReqSuccess = i2 % 128;
        if ((i2 % 2 != 0 ? 14 : '6') == '6') {
            return contains;
        }
        int i3 = 32 / 0;
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if ((!android.os.Build.DEVICE.startsWith("generic") ? true : true) != true) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean configure() {
        /*
            int r0 = onCReqSuccess
            r1 = r0 | 31
            r2 = 1
            int r1 = r1 << r2
            r3 = 31
            r0 = r0 ^ r3
            int r1 = r1 - r0
            int r0 = r1 % 128
            cleanup = r0
            r0 = 2
            int r1 = r1 % r0
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r4 = "generic"
            boolean r1 = r1.startsWith(r4)
            r5 = 7
            if (r1 == 0) goto L_0x001d
            r1 = r5
            goto L_0x001f
        L_0x001d:
            r1 = 35
        L_0x001f:
            r6 = 39
            r7 = 47
            if (r1 == r5) goto L_0x0026
            goto L_0x0040
        L_0x0026:
            int r1 = cleanup
            r8 = r1 | 73
            int r8 = r8 << r2
            r1 = r1 ^ 73
            int r8 = r8 - r1
            int r1 = r8 % 128
            onCReqSuccess = r1
            int r8 = r8 % r0
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r1 = r1.startsWith(r4)
            if (r1 != 0) goto L_0x003d
            r1 = r6
            goto L_0x003e
        L_0x003d:
            r1 = r7
        L_0x003e:
            if (r1 == r7) goto L_0x027d
        L_0x0040:
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r1 = r1.startsWith(r4)
            r4 = 38
            r8 = 46
            if (r1 != 0) goto L_0x004e
            r1 = r8
            goto L_0x004f
        L_0x004e:
            r1 = r4
        L_0x004f:
            if (r1 == r4) goto L_0x027d
            int r1 = cleanup
            r4 = r1 ^ 123(0x7b, float:1.72E-43)
            r9 = r1 & 123(0x7b, float:1.72E-43)
            r4 = r4 | r9
            int r4 = r4 << r2
            r9 = r1 & -124(0xffffffffffffff84, float:NaN)
            int r1 = ~r1
            r10 = 123(0x7b, float:1.72E-43)
            r1 = r1 & r10
            r1 = r1 | r9
            int r1 = -r1
            r9 = r4 & r1
            r1 = r1 | r4
            int r9 = r9 + r1
            int r1 = r9 % 128
            onCReqSuccess = r1
            int r9 = r9 % r0
            r1 = 0
            if (r9 == 0) goto L_0x006f
            r4 = r2
            goto L_0x0070
        L_0x006f:
            r4 = r1
        L_0x0070:
            java.lang.String r9 = "unknown"
            r10 = 0
            if (r4 != 0) goto L_0x0275
            java.lang.String r4 = android.os.Build.FINGERPRINT
            boolean r4 = r4.startsWith(r9)
            if (r4 != 0) goto L_0x0080
            r4 = 98
            goto L_0x0081
        L_0x0080:
            r4 = r8
        L_0x0081:
            if (r4 == r8) goto L_0x027d
            int r4 = onCReqSuccess
            r8 = r4 & 45
            r4 = r4 | 45
            int r8 = r8 + r4
            int r4 = r8 % 128
            cleanup = r4
            int r8 = r8 % r0
            java.lang.String r4 = android.os.Build.HARDWARE
            java.lang.String r8 = "goldfish"
            boolean r4 = r4.contains(r8)
            r8 = 52
            if (r4 != 0) goto L_0x009e
            r4 = 77
            goto L_0x009f
        L_0x009e:
            r4 = r8
        L_0x009f:
            if (r4 == r8) goto L_0x027d
            int r4 = onCReqSuccess
            r9 = r4 ^ 57
            r4 = r4 & 57
            int r4 = r4 << r2
            int r4 = ~r4
            int r9 = r9 - r4
            int r9 = r9 - r2
            int r4 = r9 % 128
            cleanup = r4
            int r9 = r9 % r0
            java.lang.String r4 = android.os.Build.HARDWARE
            java.lang.String r9 = "ranchu"
            boolean r4 = r4.contains(r9)
            r9 = 19
            if (r4 != 0) goto L_0x00be
            r4 = r7
            goto L_0x00bf
        L_0x00be:
            r4 = r9
        L_0x00bf:
            if (r4 == r9) goto L_0x027d
            int r4 = onCReqSuccess
            r9 = r4 | 95
            int r9 = r9 << r2
            r4 = r4 ^ 95
            int r9 = r9 - r4
            int r4 = r9 % 128
            cleanup = r4
            int r9 = r9 % r0
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r9 = "google_sdk"
            boolean r4 = r4.contains(r9)
            if (r4 != 0) goto L_0x00da
            r4 = r2
            goto L_0x00db
        L_0x00da:
            r4 = r1
        L_0x00db:
            if (r4 == r2) goto L_0x00df
            goto L_0x027d
        L_0x00df:
            int r4 = onCReqSuccess
            r11 = r4 ^ 97
            r12 = 97
            r4 = r4 & r12
            int r4 = r4 << r2
            int r11 = r11 + r4
            int r4 = r11 % 128
            cleanup = r4
            int r11 = r11 % r0
            r4 = 81
            if (r11 != 0) goto L_0x00f3
            r11 = r5
            goto L_0x00f4
        L_0x00f3:
            r11 = r4
        L_0x00f4:
            java.lang.String r13 = "Emulator"
            if (r11 == r5) goto L_0x026d
            java.lang.String r5 = android.os.Build.MODEL
            boolean r5 = r5.contains(r13)
            r11 = 51
            if (r5 != 0) goto L_0x0104
            r5 = r11
            goto L_0x0106
        L_0x0104:
            r5 = 17
        L_0x0106:
            if (r5 == r11) goto L_0x010a
            goto L_0x027d
        L_0x010a:
            int r5 = onCReqSuccess
            r11 = r5 & 67
            r5 = r5 ^ 67
            r5 = r5 | r11
            r13 = r11 | r5
            int r13 = r13 << r2
            r5 = r5 ^ r11
            int r13 = r13 - r5
            int r5 = r13 % 128
            cleanup = r5
            int r13 = r13 % r0
            java.lang.String r5 = android.os.Build.MODEL
            java.lang.String r11 = "Android SDK built for x86"
            boolean r5 = r5.contains(r11)
            if (r5 != 0) goto L_0x0127
            r5 = r2
            goto L_0x0128
        L_0x0127:
            r5 = r1
        L_0x0128:
            if (r5 == 0) goto L_0x027d
            int r5 = cleanup
            r11 = r5 & -32
            int r13 = ~r5
            r13 = r13 & r3
            r11 = r11 | r13
            r5 = r5 & r3
            int r5 = r5 << r2
            int r11 = r11 + r5
            int r5 = r11 % 128
            onCReqSuccess = r5
            int r11 = r11 % r0
            if (r11 == 0) goto L_0x013e
            r5 = 90
            goto L_0x013f
        L_0x013e:
            r5 = r3
        L_0x013f:
            if (r5 != r3) goto L_0x0263
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "Genymotion"
            boolean r3 = r3.contains(r5)
            r5 = 96
            if (r3 != 0) goto L_0x014f
            r3 = r5
            goto L_0x0151
        L_0x014f:
            r3 = 30
        L_0x0151:
            if (r3 == r5) goto L_0x0155
            goto L_0x027d
        L_0x0155:
            int r3 = cleanup
            r11 = r3 & -40
            int r13 = ~r3
            r13 = r13 & r6
            r11 = r11 | r13
            r3 = r3 & r6
            int r3 = r3 << r2
            int r11 = r11 + r3
            int r3 = r11 % 128
            onCReqSuccess = r3
            int r11 = r11 % r0
            java.lang.String r3 = android.os.Build.PRODUCT
            java.lang.String r6 = "sdk_google"
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x0170
            r7 = 36
        L_0x0170:
            r3 = 36
            if (r7 == r3) goto L_0x0176
            goto L_0x027d
        L_0x0176:
            int r3 = onCReqSuccess
            r6 = r3 & 44
            r3 = r3 | 44
            int r6 = r6 + r3
            int r6 = r6 - r2
            int r3 = r6 % 128
            cleanup = r3
            int r6 = r6 % r0
            java.lang.String r3 = android.os.Build.PRODUCT
            boolean r3 = r3.contains(r9)
            if (r3 != 0) goto L_0x018d
            r3 = r2
            goto L_0x018e
        L_0x018d:
            r3 = r12
        L_0x018e:
            if (r3 == r12) goto L_0x027d
            int r3 = onCReqSuccess
            r6 = r3 & -16
            int r7 = ~r3
            r9 = 15
            r7 = r7 & r9
            r6 = r6 | r7
            r3 = r3 & r9
            int r3 = r3 << r2
            r7 = r6 | r3
            int r7 = r7 << r2
            r3 = r3 ^ r6
            int r7 = r7 - r3
            int r3 = r7 % 128
            cleanup = r3
            int r7 = r7 % r0
            java.lang.String r3 = android.os.Build.PRODUCT
            java.lang.String r6 = "sdk"
            boolean r3 = r3.contains(r6)
            r6 = 99
            if (r3 != 0) goto L_0x01b4
            r3 = 23
            goto L_0x01b5
        L_0x01b4:
            r3 = r6
        L_0x01b5:
            if (r3 == r6) goto L_0x027d
            int r3 = onCReqSuccess
            r7 = r3 & 23
            r3 = r3 | 23
            int r7 = r7 + r3
            int r3 = r7 % 128
            cleanup = r3
            int r7 = r7 % r0
            java.lang.String r3 = android.os.Build.PRODUCT
            java.lang.String r7 = "sdk_x86"
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x01cf
            r3 = r2
            goto L_0x01d0
        L_0x01cf:
            r3 = r1
        L_0x01d0:
            if (r3 == 0) goto L_0x027d
            int r3 = cleanup
            int r3 = r3 + 13
            int r3 = r3 - r2
            r7 = r3 | -1
            int r7 = r7 << r2
            r3 = r3 ^ -1
            int r7 = r7 - r3
            int r3 = r7 % 128
            onCReqSuccess = r3
            int r7 = r7 % r0
            if (r7 == 0) goto L_0x01e6
            r3 = r2
            goto L_0x01e7
        L_0x01e6:
            r3 = r1
        L_0x01e7:
            if (r3 != 0) goto L_0x0256
            java.lang.String r3 = android.os.Build.PRODUCT
            java.lang.String r7 = "vbox86p"
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x01f5
            r3 = r1
            goto L_0x01f6
        L_0x01f5:
            r3 = r2
        L_0x01f6:
            if (r3 == r2) goto L_0x027d
            int r3 = onCReqSuccess
            r7 = r3 & 49
            int r9 = ~r7
            r3 = r3 | 49
            r3 = r3 & r9
            int r7 = r7 << r2
            r9 = r3 ^ r7
            r3 = r3 & r7
            int r3 = r3 << r2
            int r9 = r9 + r3
            int r3 = r9 % 128
            cleanup = r3
            int r9 = r9 % r0
            java.lang.String r3 = android.os.Build.PRODUCT
            java.lang.String r7 = "emulator"
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x0217
            r3 = r2
            goto L_0x0218
        L_0x0217:
            r3 = r1
        L_0x0218:
            if (r3 == r2) goto L_0x021b
            goto L_0x027d
        L_0x021b:
            int r3 = onCReqSuccess
            r7 = r3 | 96
            int r7 = r7 << r2
            r3 = r3 ^ r5
            int r7 = r7 - r3
            r3 = r7 ^ -1
            r5 = r7 & -1
            int r5 = r5 << r2
            int r3 = r3 + r5
            int r5 = r3 % 128
            cleanup = r5
            int r3 = r3 % r0
            java.lang.String r3 = android.os.Build.PRODUCT
            java.lang.String r5 = "simulator"
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x0238
            goto L_0x0239
        L_0x0238:
            r8 = r4
        L_0x0239:
            if (r8 == r4) goto L_0x023c
            goto L_0x027d
        L_0x023c:
            int r2 = cleanup
            r3 = r2 & 99
            r2 = r2 | r6
            int r3 = r3 + r2
            int r2 = r3 % 128
            onCReqSuccess = r2
            int r3 = r3 % r0
            if (r3 == 0) goto L_0x024c
            r2 = 65
            goto L_0x024d
        L_0x024c:
            r2 = r0
        L_0x024d:
            if (r2 == r0) goto L_0x0255
            r0 = 50
            int r0 = r0 / r1
            return r1
        L_0x0253:
            r0 = move-exception
            throw r0
        L_0x0255:
            return r1
        L_0x0256:
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "vbox86p"
            r0.contains(r1)
            super.hashCode()     // Catch:{ all -> 0x0261 }
            throw r10     // Catch:{ all -> 0x0261 }
        L_0x0261:
            r0 = move-exception
            throw r0
        L_0x0263:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Genymotion"
            r0.contains(r1)
            throw r10     // Catch:{ all -> 0x026b }
        L_0x026b:
            r0 = move-exception
            throw r0
        L_0x026d:
            java.lang.String r0 = android.os.Build.MODEL
            r0.contains(r13)
            throw r10     // Catch:{ all -> 0x0273 }
        L_0x0273:
            r0 = move-exception
            throw r0
        L_0x0275:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            r0.startsWith(r9)
            throw r10     // Catch:{ all -> 0x027b }
        L_0x027b:
            r0 = move-exception
            throw r0
        L_0x027d:
            int r1 = cleanup
            r3 = r1 | 105(0x69, float:1.47E-43)
            int r4 = r3 << 1
            r1 = r1 & 105(0x69, float:1.47E-43)
            int r1 = ~r1
            r1 = r1 & r3
            int r1 = -r1
            r3 = r4 ^ r1
            r1 = r1 & r4
            int r1 = r1 << r2
            int r3 = r3 + r1
            int r1 = r3 % 128
            onCReqSuccess = r1
            int r3 = r3 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setTop.configure():boolean");
    }

    private static boolean getInstance() {
        int i = (onCReqSuccess + 60) - 1;
        cleanup = i % 128;
        int i2 = i % 2;
        int i3 = (cleanup + 121) - 1;
        int i4 = (i3 ^ -1) + ((i3 & -1) << 1);
        int i5 = i4 % 128;
        onCReqSuccess = i5;
        boolean z = (i4 % 2 != 0 ? 27 : 'U') != 27;
        int i6 = (i5 + 38) - 1;
        cleanup = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    private static boolean onCReqSuccess() {
        int i = (onCReqSuccess + 120) - 1;
        cleanup = i % 128;
        if ((i % 2 == 0 ? 'O' : 'D') != 'O') {
            boolean isDebuggerConnected = Debug.isDebuggerConnected();
            int i2 = onCReqSuccess;
            int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
            cleanup = i3 % 128;
            int i4 = i3 % 2;
            return isDebuggerConnected;
        }
        Debug.isDebuggerConnected();
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    private static boolean cleanup() {
        int i = cleanup;
        int i2 = i & 99;
        int i3 = (((i | 99) & (~i2)) - (~(i2 << 1))) - 1;
        onCReqSuccess = i3 % 128;
        Throwable th = null;
        if ((i3 % 2 != 0 ? (char) 15 : 23) == 23) {
            boolean z = false;
            if ((!getSDKVersion() ? 'S' : '&') != '&') {
                if (!(onValidated())) {
                    int i4 = cleanup;
                    int i5 = (i4 ^ 23) + ((i4 & 23) << 1);
                    onCReqSuccess = i5 % 128;
                    if ((i5 % 2 != 0 ? 25 : 'G') == 'G') {
                        if ((getWarnings() ? 'A' : 22) == 22) {
                            int i6 = cleanup;
                            int i7 = (i6 ^ 93) + ((i6 & 93) << 1);
                            onCReqSuccess = i7 % 128;
                            int i8 = i7 % 2;
                            return false;
                        }
                    } else {
                        getWarnings();
                        throw th;
                    }
                }
            }
            int i9 = onCReqSuccess;
            int i10 = (i9 ^ 121) + ((i9 & 121) << 1);
            cleanup = i10 % 128;
            if (i10 % 2 != 0) {
                z = true;
            }
            if (z) {
                return true;
            }
            throw th;
        }
        getSDKVersion();
        super.hashCode();
        throw th;
    }

    private static boolean getSDKVersion() {
        int i = cleanup;
        boolean z = true;
        int i2 = ((i | 30) << 1) - (i ^ 30);
        int i3 = ((i2 | -1) << 1) - (i2 ^ -1);
        onCReqSuccess = i3 % 128;
        int i4 = i3 % 2;
        String str = Build.TAGS;
        Throwable th = null;
        if ((str != null ? '=' : ']') == '=') {
            int i5 = onCReqSuccess;
            int i6 = (i5 & -52) | ((~i5) & 51);
            int i7 = -(-((i5 & 51) << 1));
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            cleanup = i8 % 128;
            int i9 = i8 % 2;
            if ((str.contains("test-keys") ? (char) 13 : 1) != 1) {
                int i10 = onCReqSuccess;
                int i11 = (i10 ^ 57) + ((i10 & 57) << 1);
                cleanup = i11 % 128;
                int i12 = i11 % 2;
                int i13 = (i10 + 56) - 1;
                cleanup = i13 % 128;
                if ((i13 % 2 == 0 ? (char) 18 : 11) != 18) {
                    return true;
                }
                throw th;
            }
        }
        int i14 = (onCReqSuccess + 38) - 1;
        cleanup = i14 % 128;
        if (i14 % 2 == 0) {
            z = false;
        }
        if (z) {
            return false;
        }
        super.hashCode();
        throw th;
    }

    private static boolean onValidated() {
        int i = onCReqSuccess;
        int i2 = i + 113;
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        int i4 = ((((i | 118) << 1) - (i ^ 118)) - 0) - 1;
        cleanup = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < 10) {
            if (new File(strArr[i6]).exists()) {
                int i7 = onCReqSuccess;
                int i8 = ((i7 | 7) << 1) - (i7 ^ 7);
                int i9 = i8 % 128;
                cleanup = i9;
                int i10 = i8 % 2;
                int i11 = (i9 & 100) + (i9 | 100);
                int i12 = ((i11 | -1) << 1) - (i11 ^ -1);
                onCReqSuccess = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
            i6 = ((((i6 ^ 1) | (i6 & 1)) << 1) - (~(-(((~i6) & 1) | (i6 & -2))))) - 1;
            int i14 = onCReqSuccess;
            int i15 = i14 ^ 65;
            int i16 = (((i14 & 65) | i15) << 1) - i15;
            cleanup = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = onCReqSuccess;
        int i19 = i18 & 85;
        int i20 = i18 | 85;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        cleanup = i21 % 128;
        if (!(i21 % 2 == 0)) {
            return false;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getWarnings() {
        /*
            r0 = 0
            r1 = 1
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "/system/xbin/which"
            java.lang.String r4 = "su"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ all -> 0x00bc }
            java.lang.Process r2 = r2.exec(r3)     // Catch:{ all -> 0x00bc }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x00bd }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x00bd }
            java.io.InputStream r5 = r2.getInputStream()     // Catch:{ all -> 0x00bd }
            r4.<init>(r5)     // Catch:{ all -> 0x00bd }
            r3.<init>(r4)     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = r3.readLine()     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x0028
            r3 = r1
            goto L_0x0029
        L_0x0028:
            r3 = r0
        L_0x0029:
            if (r3 == 0) goto L_0x0052
            int r3 = cleanup
            r4 = r3 & 55
            r3 = r3 | 55
            int r3 = -r3
            int r3 = -r3
            r5 = r4 ^ r3
            r3 = r3 & r4
            int r3 = r3 << r1
            int r5 = r5 + r3
            int r3 = r5 % 128
            onCReqSuccess = r3
            int r5 = r5 % 2
            r4 = r3 | 12
            int r4 = r4 << r1
            r3 = r3 ^ 12
            int r4 = r4 - r3
            r3 = r4 ^ -1
            r4 = r4 & -1
            int r4 = r4 << r1
            int r3 = r3 + r4
            int r4 = r3 % 128
            cleanup = r4
            int r3 = r3 % 2
            r3 = r1
            goto L_0x0065
        L_0x0052:
            int r3 = onCReqSuccess
            r4 = r3 & -96
            int r5 = ~r3
            r5 = r5 & 95
            r4 = r4 | r5
            r3 = r3 & 95
            int r3 = r3 << r1
            int r4 = r4 + r3
            int r3 = r4 % 128
            cleanup = r3
            int r4 = r4 % 2
            r3 = r0
        L_0x0065:
            r4 = 59
            if (r2 == 0) goto L_0x006b
            r5 = r4
            goto L_0x006d
        L_0x006b:
            r5 = 60
        L_0x006d:
            if (r5 == r4) goto L_0x0070
            goto L_0x00a5
        L_0x0070:
            int r4 = cleanup
            int r4 = r4 + 20
            int r4 = r4 - r1
            int r5 = r4 % 128
            onCReqSuccess = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x007f
            r4 = r1
            goto L_0x0080
        L_0x007f:
            r4 = r0
        L_0x0080:
            if (r4 == r1) goto L_0x0086
            r2.destroy()
            goto L_0x008c
        L_0x0086:
            r2.destroy()
            r2 = 16
            int r2 = r2 / r0
        L_0x008c:
            int r0 = onCReqSuccess
            r2 = r0 ^ 95
            r4 = r0 & 95
            r2 = r2 | r4
            int r2 = r2 << r1
            r4 = r0 & -96
            int r0 = ~r0
            r0 = r0 & 95
            r0 = r0 | r4
            int r0 = -r0
            r4 = r2 & r0
            r0 = r0 | r2
            int r4 = r4 + r0
            int r0 = r4 % 128
            cleanup = r0
            int r4 = r4 % 2
        L_0x00a5:
            int r0 = cleanup
            r2 = r0 ^ 8
            r0 = r0 & 8
            int r0 = r0 << r1
            int r2 = r2 + r0
            r0 = r2 | -1
            int r0 = r0 << r1
            r1 = r2 ^ -1
            int r0 = r0 - r1
            int r1 = r0 % 128
            onCReqSuccess = r1
            int r0 = r0 % 2
            return r3
        L_0x00ba:
            r0 = move-exception
            throw r0
        L_0x00bc:
            r2 = 0
        L_0x00bd:
            if (r2 == 0) goto L_0x00dc
            r2.destroy()
            int r2 = onCReqSuccess
            r3 = r2 ^ 81
            r4 = r2 & 81
            r3 = r3 | r4
            int r3 = r3 << r1
            r4 = r2 & -82
            int r2 = ~r2
            r2 = r2 & 81
            r2 = r2 | r4
            int r2 = -r2
            r4 = r3 ^ r2
            r2 = r2 & r3
            int r2 = r2 << r1
            int r4 = r4 + r2
            int r2 = r4 % 128
            cleanup = r2
            int r4 = r4 % 2
        L_0x00dc:
            int r2 = cleanup
            r3 = r2 | 121(0x79, float:1.7E-43)
            int r3 = r3 << r1
            r4 = r2 & -122(0xffffffffffffff86, float:NaN)
            int r2 = ~r2
            r2 = r2 & 121(0x79, float:1.7E-43)
            r2 = r2 | r4
            int r2 = -r2
            r4 = r3 | r2
            int r1 = r4 << 1
            r2 = r2 ^ r3
            int r1 = r1 - r2
            int r2 = r1 % 128
            onCReqSuccess = r2
            int r1 = r1 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setTop.getWarnings():boolean");
    }

    public final void init(boolean z) {
        int i = cleanup;
        int i2 = i & 99;
        int i3 = (i ^ 99) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        onCReqSuccess = i5;
        char c = i4 % 2 != 0 ? 5 : 'c';
        this.configure = z;
        if (c != 'c') {
            int i6 = 50 / 0;
        }
        int i7 = i5 & 39;
        int i8 = (i5 | 39) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        cleanup = i10 % 128;
        int i11 = i10 % 2;
    }

    public final JSONArray Cardinal() {
        int i = cleanup;
        int i2 = (i & -106) | ((~i) & 105);
        int i3 = (i & 105) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        onCReqSuccess = i4 % 128;
        if ((i4 % 2 != 0 ? '.' : '/') != '.') {
            return this.getSDKVersion;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    public final List<Warning> cca_continue() {
        List<Warning> list;
        int i = onCReqSuccess;
        int i2 = ((((i ^ 69) | (i & 69)) << 1) - (~(-(((~i) & 69) | (i & -70))))) - 1;
        int i3 = i2 % 128;
        cleanup = i3;
        if (!(i2 % 2 == 0)) {
            list = this.onValidated;
        } else {
            list = this.onValidated;
            int i4 = 88 / 0;
        }
        int i5 = i3 & 55;
        int i6 = -(-((i3 ^ 55) | i5));
        int i7 = (i5 & i6) + (i6 | i5);
        onCReqSuccess = i7 % 128;
        int i8 = i7 % 2;
        return list;
    }

    private void CardinalEnvironment() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        if (this.init) {
            jSONArray.put("SW01");
            arrayList.add(new Warning("SW01", "The device is jailbroken.", setAccessibilityHeading.HIGH));
            int i = (cleanup + 11) - 1;
            int i2 = (i ^ -1) + ((i & -1) << 1);
            onCReqSuccess = i2 % 128;
            int i3 = i2 % 2;
        }
        if (this.configure) {
            jSONArray.put("SW02");
            arrayList.add(new Warning("SW02", "The integrity of the SDK has been tampered.", setAccessibilityHeading.HIGH));
            int i4 = onCReqSuccess;
            int i5 = (((i4 | 51) << 1) - (~(-(i4 ^ 51)))) - 1;
            cleanup = i5 % 128;
            int i6 = i5 % 2;
        }
        if (this.Cardinal) {
            jSONArray.put("SW03");
            arrayList.add(new Warning("SW03", "An emulator is being used to run the App.", setAccessibilityHeading.HIGH));
            int i7 = onCReqSuccess;
            int i8 = (i7 & 85) + (i7 | 85);
            cleanup = i8 % 128;
            int i9 = i8 % 2;
        }
        if (this.getInstance) {
            jSONArray.put("SW04");
            arrayList.add(new Warning("SW04", "A debugger is attached to the App.", setAccessibilityHeading.MEDIUM));
            int i10 = ((onCReqSuccess + 104) + 0) - 1;
            cleanup = i10 % 128;
            int i11 = i10 % 2;
        }
        if (!this.cca_continue) {
            jSONArray.put("SW05");
            arrayList.add(new Warning("SW05", "The OS or the OS version is not supported.", setAccessibilityHeading.HIGH));
            int i12 = cleanup;
            int i13 = i12 & 59;
            int i14 = (i12 ^ 59) | i13;
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            onCReqSuccess = i15 % 128;
            int i16 = i15 % 2;
        }
        if (!this.getWarnings) {
            jSONArray.put("SW06");
            arrayList.add(new Warning("SW06", "The App is not installed from trusted source.", setAccessibilityHeading.HIGH));
            int i17 = cleanup;
            int i18 = i17 & 99;
            int i19 = (i17 | 99) & (~i18);
            int i20 = i18 << 1;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            onCReqSuccess = i21 % 128;
            int i22 = i21 % 2;
        }
        this.getSDKVersion = jSONArray;
        this.onValidated = arrayList;
        int i23 = (onCReqSuccess + 45) - 1;
        int i24 = (i23 ^ -1) + ((i23 & -1) << 1);
        cleanup = i24 % 128;
        if ((i24 % 2 == 0 ? '(' : 5) == '(') {
            int i25 = 68 / 0;
        }
    }

    public final JSONObject init() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("IsAppTrusted", Boolean.valueOf(this.getWarnings));
            jSONObject.putOpt("IsJailbroken", Boolean.valueOf(this.init));
            jSONObject.putOpt("IsSDKTempered", Boolean.valueOf(this.configure));
            jSONObject.putOpt("IsEmulator", Boolean.valueOf(this.Cardinal));
            jSONObject.putOpt("IsDebuggerAttached", Boolean.valueOf(this.getInstance));
            jSONObject.putOpt("IsOSSupported", Boolean.valueOf(this.cca_continue));
            int i = cleanup;
            int i2 = i & 41;
            int i3 = i | 41;
            int i4 = (i2 & i3) + (i3 | i2);
            onCReqSuccess = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException e) {
            setTranslationY.cca_continue().configure("13101", e.getLocalizedMessage(), (String) null);
        }
        int i6 = cleanup;
        int i7 = ((i6 & 49) - (~(-(-(i6 | 49))))) - 1;
        onCReqSuccess = i7 % 128;
        int i8 = i7 % 2;
        return jSONObject;
    }
}
