package com.cardinalcommerce.a;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

final class setScaleX implements LocationListener {
    private static int Cardinal = 1;
    private static int getInstance;
    private final LocationManager cca_continue;
    private final setDefaultFocusHighlightEnabled init;

    public final void onProviderDisabled(String str) {
        int i = (Cardinal + 76) - 1;
        getInstance = i % 128;
        int i2 = i % 2;
    }

    public final void onProviderEnabled(String str) {
        int i = (getInstance + 72) - 1;
        Cardinal = i % 128;
        int i2 = i % 2;
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
        int i2 = Cardinal;
        int i3 = (i2 & 41) + (i2 | 41);
        getInstance = i3 % 128;
        if (!(i3 % 2 == 0)) {
            int i4 = 19 / 0;
        }
    }

    public setScaleX(setScaleY setscaley, Context context) {
        this.init = setscaley;
        this.cca_continue = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        cca_continue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if ((r3 == null) != true) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if ((r3 != null ? 20 : 'V') != 'V') goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        r8 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void cca_continue() {
        /*
            r15 = this;
            int r0 = Cardinal
            r1 = r0 ^ 55
            r2 = r0 & 55
            r1 = r1 | r2
            r2 = 1
            int r1 = r1 << r2
            r3 = r0 & -56
            int r0 = ~r0
            r4 = 55
            r0 = r0 & r4
            r0 = r0 | r3
            int r0 = -r0
            r3 = r1 & r0
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            getInstance = r0
            r0 = 2
            int r3 = r3 % r0
            r1 = 0
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r2
        L_0x0021:
            java.lang.String r4 = "network"
            java.lang.String r5 = "gps"
            r6 = 0
            if (r3 == 0) goto L_0x003d
            android.location.LocationManager r3 = r15.cca_continue
            android.location.Location r3 = r3.getLastKnownLocation(r5)
            android.location.LocationManager r5 = r15.cca_continue
            android.location.Location r4 = r5.getLastKnownLocation(r4)
            if (r3 == 0) goto L_0x0039
            r5 = r1
            goto L_0x003a
        L_0x0039:
            r5 = r2
        L_0x003a:
            if (r5 == r2) goto L_0x007c
            goto L_0x0053
        L_0x003d:
            android.location.LocationManager r3 = r15.cca_continue
            android.location.Location r3 = r3.getLastKnownLocation(r5)
            android.location.LocationManager r5 = r15.cca_continue
            android.location.Location r4 = r5.getLastKnownLocation(r4)
            r5 = 86
            if (r3 == 0) goto L_0x0050
            r8 = 20
            goto L_0x0051
        L_0x0050:
            r8 = r5
        L_0x0051:
            if (r8 == r5) goto L_0x007c
        L_0x0053:
            int r5 = Cardinal
            r8 = r5 & -4
            int r9 = ~r5
            r9 = r9 & 3
            r8 = r8 | r9
            r5 = r5 & 3
            int r5 = r5 << r2
            r9 = r8 ^ r5
            r5 = r5 & r8
            int r5 = r5 << r2
            int r9 = r9 + r5
            int r5 = r9 % 128
            getInstance = r5
            int r9 = r9 % r0
            long r8 = r3.getTime()
            int r5 = Cardinal
            r10 = r5 & 73
            int r11 = ~r10
            r5 = r5 | 73
            r5 = r5 & r11
            int r10 = r10 << r2
            int r5 = r5 + r10
            int r10 = r5 % 128
            getInstance = r10
            int r5 = r5 % r0
            goto L_0x007d
        L_0x007c:
            r8 = r6
        L_0x007d:
            r5 = 81
            if (r4 == 0) goto L_0x0083
            r10 = r5
            goto L_0x0085
        L_0x0083:
            r10 = 37
        L_0x0085:
            r11 = 95
            r12 = 0
            if (r10 == r5) goto L_0x008c
            r13 = r6
            goto L_0x00a9
        L_0x008c:
            int r10 = Cardinal
            r13 = r10 & 95
            int r14 = ~r13
            r10 = r10 | r11
            r10 = r10 & r14
            int r13 = r13 << r2
            r14 = r10 | r13
            int r14 = r14 << r2
            r10 = r10 ^ r13
            int r14 = r14 - r10
            int r10 = r14 % 128
            getInstance = r10
            int r14 = r14 % r0
            if (r14 == 0) goto L_0x00a2
            r10 = r1
            goto L_0x00a3
        L_0x00a2:
            r10 = r2
        L_0x00a3:
            if (r10 == 0) goto L_0x014c
            long r13 = r4.getTime()
        L_0x00a9:
            long r8 = r8 - r13
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r7 = 47
            r8 = 44
            if (r6 >= 0) goto L_0x00b4
            r6 = r7
            goto L_0x00b5
        L_0x00b4:
            r6 = r8
        L_0x00b5:
            if (r6 == r8) goto L_0x0105
            int r6 = Cardinal
            r8 = r6 & 105(0x69, float:1.47E-43)
            r9 = r6 ^ 105(0x69, float:1.47E-43)
            r9 = r9 | r8
            int r9 = -r9
            int r9 = -r9
            r10 = r8 ^ r9
            r8 = r8 & r9
            int r8 = r8 << r2
            int r10 = r10 + r8
            int r8 = r10 % 128
            getInstance = r8
            int r10 = r10 % r0
            r8 = 33
            if (r3 == 0) goto L_0x00d1
            r9 = 54
            goto L_0x00d2
        L_0x00d1:
            r9 = r8
        L_0x00d2:
            if (r9 == r8) goto L_0x0105
            r4 = r6 | 85
            int r4 = r4 << r2
            r6 = r6 ^ 85
            int r4 = r4 - r6
            int r6 = r4 % 128
            getInstance = r6
            int r4 = r4 % r0
            if (r4 == 0) goto L_0x00e3
            r4 = r2
            goto L_0x00e4
        L_0x00e3:
            r4 = r1
        L_0x00e4:
            if (r4 == r2) goto L_0x00ff
            r15.init(r3)
            int r3 = getInstance
            r4 = r3 & 81
            r3 = r3 ^ r5
            r3 = r3 | r4
            int r4 = r4 + r3
            int r3 = r4 % 128
            Cardinal = r3
            int r4 = r4 % r0
            if (r4 != 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r1 = r2
        L_0x00f9:
            if (r1 != r2) goto L_0x00fc
            return
        L_0x00fc:
            throw r12     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            throw r0
        L_0x00ff:
            r15.init(r3)
            throw r12     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            throw r0
        L_0x0105:
            if (r4 == 0) goto L_0x0108
            r1 = r2
        L_0x0108:
            if (r1 == r2) goto L_0x010b
            goto L_0x0130
        L_0x010b:
            int r1 = getInstance
            r3 = r1 ^ 47
            r1 = r1 & r7
            int r1 = r1 << r2
            r5 = r3 & r1
            r1 = r1 | r3
            int r5 = r5 + r1
            int r1 = r5 % 128
            Cardinal = r1
            int r5 = r5 % r0
            r15.init(r4)
            int r1 = Cardinal
            r3 = r1 & -96
            int r4 = ~r1
            r4 = r4 & r11
            r3 = r3 | r4
            r1 = r1 & r11
            int r1 = r1 << r2
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r3 = r3 - r1
            int r3 = r3 - r2
            int r1 = r3 % 128
            getInstance = r1
            int r3 = r3 % r0
        L_0x0130:
            int r1 = Cardinal
            r3 = r1 & 11
            r1 = r1 | 11
            int r1 = ~r1
            int r3 = r3 - r1
            int r3 = r3 - r2
            int r1 = r3 % 128
            getInstance = r1
            int r3 = r3 % r0
            r1 = 62
            if (r3 == 0) goto L_0x0143
            r0 = r1
        L_0x0143:
            if (r0 == r1) goto L_0x0146
            return
        L_0x0146:
            super.hashCode()     // Catch:{ all -> 0x014a }
            throw r12     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            throw r0
        L_0x014c:
            r4.getTime()
            throw r12     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setScaleX.cca_continue():void");
    }

    private void init(Location location) {
        this.init.init(new setPivotX(location));
        int i = (Cardinal + 84) - 1;
        getInstance = i % 128;
        int i2 = i % 2;
    }

    public final void onLocationChanged(Location location) {
        this.init.init(new setPivotX(location));
        int i = Cardinal;
        int i2 = i & 47;
        int i3 = i2 + ((i ^ 47) | i2);
        getInstance = i3 % 128;
        int i4 = i3 % 2;
    }
}
