package com.cardinalcommerce.a;

import java.io.Serializable;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public final class setRotationY implements Serializable, Runnable {
    private static int CardinalRenderType = 0;
    private static int values = 1;
    public int Cardinal;
    private final setTranslationY CardinalEnvironment = setTranslationY.cca_continue();
    public boolean CardinalError;
    public char[] cca_continue;
    public boolean cleanup;
    public char[] configure = setHorizontalScrollBarEnabled.configure(Cardinal());
    public boolean getInstance;
    public boolean getSDKVersion;
    public boolean getWarnings;
    public char[] init;
    public boolean onCReqSuccess;
    public boolean onValidated;

    setRotationY() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 41 ? 19 : kotlin.text.Typography.greater) != 19) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configure(android.content.Context r6) {
        /*
            r5 = this;
            int r0 = values
            r1 = r0 ^ 13
            r2 = r0 & 13
            r1 = r1 | r2
            r3 = 1
            int r1 = r1 << r3
            int r2 = ~r2
            r0 = r0 | 13
            r0 = r0 & r2
            int r0 = -r0
            r2 = r1 ^ r0
            r0 = r0 & r1
            int r0 = r0 << r3
            int r2 = r2 + r0
            int r0 = r2 % 128
            CardinalRenderType = r0
            int r2 = r2 % 2
            r0 = 28
            if (r2 == 0) goto L_0x001f
            r1 = 6
            goto L_0x0020
        L_0x001f:
            r1 = r0
        L_0x0020:
            r2 = 0
            if (r1 == r0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 41
            r4 = 19
            if (r0 < r1) goto L_0x002d
            r0 = r4
            goto L_0x002f
        L_0x002d:
            r0 = 62
        L_0x002f:
            if (r0 == r4) goto L_0x0033
            goto L_0x00de
        L_0x0033:
            android.content.Context r6 = r6.getApplicationContext()
            java.lang.String r0 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6
            if (r6 == 0) goto L_0x0043
            r0 = r2
            goto L_0x0044
        L_0x0043:
            r0 = r3
        L_0x0044:
            if (r0 == 0) goto L_0x0048
            r0 = 0
            goto L_0x0070
        L_0x0048:
            int r0 = CardinalRenderType
            r1 = r0 ^ 119(0x77, float:1.67E-43)
            r0 = r0 & 119(0x77, float:1.67E-43)
            r0 = r0 | r1
            int r0 = r0 << r3
            int r1 = -r1
            r4 = r0 & r1
            r0 = r0 | r1
            int r4 = r4 + r0
            int r0 = r4 % 128
            values = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x005f
            r0 = r3
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            if (r0 == 0) goto L_0x006c
            android.net.wifi.WifiInfo r0 = r6.getConnectionInfo()
            r1 = 97
            int r1 = r1 / r2
            goto L_0x0070
        L_0x006a:
            r6 = move-exception
            throw r6
        L_0x006c:
            android.net.wifi.WifiInfo r0 = r6.getConnectionInfo()
        L_0x0070:
            r1 = 69
            if (r0 == 0) goto L_0x0076
            r4 = r1
            goto L_0x0077
        L_0x0076:
            r4 = 5
        L_0x0077:
            if (r4 == r1) goto L_0x007a
            goto L_0x00de
        L_0x007a:
            int r1 = CardinalRenderType
            int r1 = r1 + 43
            int r1 = r1 - r3
            int r1 = r1 - r3
            int r4 = r1 % 128
            values = r4
            int r1 = r1 % 2
            java.lang.String r1 = r0.getBSSID()
            char[] r1 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r1)
            r5.cca_continue = r1
            java.lang.String r1 = r0.getSSID()
            char[] r1 = com.cardinalcommerce.a.setHorizontalScrollBarEnabled.configure(r1)
            r5.init = r1
            int r0 = r0.getNetworkId()
            r5.Cardinal = r0
            boolean r0 = r6.is5GHzBandSupported()
            r5.getInstance = r0
            boolean r0 = r6.isDeviceToApRttSupported()
            r5.cleanup = r0
            boolean r0 = r6.isEnhancedPowerReportingSupported()
            r5.getWarnings = r0
            boolean r0 = r6.isP2pSupported()
            r5.getSDKVersion = r0
            boolean r0 = r6.isPreferredNetworkOffloadSupported()
            r5.onValidated = r0
            boolean r0 = r6.isTdlsSupported()
            r5.onCReqSuccess = r0
            boolean r6 = r6.isScanAlwaysAvailable()
            r5.CardinalError = r6
            int r6 = CardinalRenderType
            r0 = r6 | 48
            int r0 = r0 << r3
            r6 = r6 ^ 48
            int r0 = r0 - r6
            r6 = r0 | -1
            int r6 = r6 << r3
            r0 = r0 ^ -1
            int r6 = r6 - r0
            int r0 = r6 % 128
            values = r0
            int r6 = r6 % 2
        L_0x00de:
            int r6 = CardinalRenderType
            r0 = r6 & 73
            r6 = r6 ^ 73
            r6 = r6 | r0
            int r6 = -r6
            int r6 = -r6
            r1 = r0 ^ r6
            r6 = r6 & r0
            int r6 = r6 << r3
            int r1 = r1 + r6
            int r6 = r1 % 128
            values = r6
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x00f6
            r6 = r3
            goto L_0x00f7
        L_0x00f6:
            r6 = r2
        L_0x00f7:
            if (r6 == r3) goto L_0x00fa
            return
        L_0x00fa:
            r6 = 84
            int r6 = r6 / r2
            return
        L_0x00fe:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setRotationY.configure(android.content.Context):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r3 = values;
        r4 = r3 & 95;
        r4 = (r4 - (~(-(-((r3 ^ 95) | r4))))) - 1;
        CardinalRenderType = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
        if ((r4 % 2) == 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (r8 != true) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = r6.getHostAddress();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        r2 = CardinalRenderType;
        r3 = (r2 & 46) + (r2 | 46);
        r2 = (r3 ^ -1) + ((r3 & -1) << 1);
        values = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e2, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.getHostAddress();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e9, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String Cardinal() {
        /*
            r9 = this;
            int r0 = CardinalRenderType
            int r0 = r0 + 64
            r1 = 1
            int r0 = r0 - r1
            int r2 = r0 % 128
            values = r2
            int r0 = r0 % 2
            r0 = 69
            r2 = 0
            java.util.Enumeration r3 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x0105 }
            int r4 = values
            r5 = r4 | 88
            int r5 = r5 << r1
            r4 = r4 ^ 88
            int r5 = r5 - r4
            int r5 = r5 - r1
            int r4 = r5 % 128
            CardinalRenderType = r4
            int r5 = r5 % 2
        L_0x0022:
            boolean r4 = r3.hasMoreElements()     // Catch:{ Exception -> 0x0105 }
            r5 = 3
            if (r4 == 0) goto L_0x002b
            r4 = r5
            goto L_0x002c
        L_0x002b:
            r4 = r0
        L_0x002c:
            if (r4 == r5) goto L_0x0044
            int r3 = CardinalRenderType
            r4 = r3 & 69
            r3 = r3 ^ r0
            r3 = r3 | r4
            int r3 = -r3
            int r3 = -r3
            r5 = r4 | r3
            int r1 = r5 << 1
            r3 = r3 ^ r4
            int r1 = r1 - r3
            int r3 = r1 % 128
            values = r3
            int r1 = r1 % 2
            goto L_0x0111
        L_0x0044:
            int r4 = values
            r6 = r4 | 38
            int r6 = r6 << r1
            r4 = r4 ^ 38
            int r6 = r6 - r4
            r4 = r6 | -1
            int r4 = r4 << r1
            r6 = r6 ^ -1
            int r4 = r4 - r6
            int r6 = r4 % 128
            CardinalRenderType = r6
            int r4 = r4 % 2
            java.lang.Object r4 = r3.nextElement()     // Catch:{ Exception -> 0x0105 }
            java.net.NetworkInterface r4 = (java.net.NetworkInterface) r4     // Catch:{ Exception -> 0x0105 }
            java.util.Enumeration r4 = r4.getInetAddresses()     // Catch:{ Exception -> 0x0105 }
            int r6 = values
            int r6 = r6 + 66
            r7 = r6 ^ -1
            r6 = r6 & -1
            int r6 = r6 << r1
            int r7 = r7 + r6
            int r6 = r7 % 128
            CardinalRenderType = r6
            int r7 = r7 % 2
        L_0x0072:
            boolean r6 = r4.hasMoreElements()     // Catch:{ Exception -> 0x0105 }
            if (r6 == 0) goto L_0x007a
            r6 = r5
            goto L_0x007c
        L_0x007a:
            r6 = 29
        L_0x007c:
            if (r6 == r5) goto L_0x008f
            int r4 = CardinalRenderType
            r5 = r4 & 71
            int r6 = ~r5
            r4 = r4 | 71
            r4 = r4 & r6
            int r5 = r5 << r1
            int r4 = r4 + r5
            int r5 = r4 % 128
            values = r5
            int r4 = r4 % 2
            goto L_0x0022
        L_0x008f:
            int r6 = CardinalRenderType
            r7 = r6 | 27
            int r7 = r7 << r1
            r6 = r6 ^ 27
            int r6 = -r6
            int r6 = ~r6
            int r7 = r7 - r6
            int r7 = r7 - r1
            int r6 = r7 % 128
            values = r6
            int r7 = r7 % 2
            java.lang.Object r6 = r4.nextElement()     // Catch:{ Exception -> 0x0105 }
            java.net.InetAddress r6 = (java.net.InetAddress) r6     // Catch:{ Exception -> 0x0105 }
            boolean r7 = r6.isLoopbackAddress()     // Catch:{ Exception -> 0x0105 }
            r8 = 0
            if (r7 != 0) goto L_0x00af
            r7 = r8
            goto L_0x00b0
        L_0x00af:
            r7 = r1
        L_0x00b0:
            if (r7 == r1) goto L_0x00ec
            int r3 = values
            r4 = r3 & 95
            r3 = r3 ^ 95
            r3 = r3 | r4
            int r3 = -r3
            int r3 = -r3
            int r3 = ~r3
            int r4 = r4 - r3
            int r4 = r4 - r1
            int r3 = r4 % 128
            CardinalRenderType = r3
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r8 = r1
        L_0x00c8:
            if (r8 != r1) goto L_0x00e3
            java.lang.String r0 = r6.getHostAddress()     // Catch:{ Exception -> 0x0105 }
            int r2 = CardinalRenderType
            r3 = r2 & 46
            r2 = r2 | 46
            int r3 = r3 + r2
            r2 = r3 ^ -1
            r3 = r3 & -1
            int r1 = r3 << 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            values = r1
            int r2 = r2 % 2
            return r0
        L_0x00e3:
            r6.getHostAddress()     // Catch:{ Exception -> 0x0105 }
            super.hashCode()     // Catch:{ all -> 0x00ea }
            throw r2     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            throw r0
        L_0x00ec:
            int r6 = values
            r7 = r6 ^ 19
            r8 = r6 & 19
            r7 = r7 | r8
            int r7 = r7 << r1
            int r8 = ~r8
            r6 = r6 | 19
            r6 = r6 & r8
            int r6 = -r6
            r8 = r7 & r6
            r6 = r6 | r7
            int r8 = r8 + r6
            int r6 = r8 % 128
            CardinalRenderType = r6
            int r8 = r8 % 2
            goto L_0x0072
        L_0x0105:
            r1 = move-exception
            com.cardinalcommerce.a.setTranslationY r3 = r9.CardinalEnvironment
            java.lang.String r4 = "IP Address"
            java.lang.String r1 = r1.toString()
            r3.configure((java.lang.String) r4, (java.lang.String) r1, (java.lang.String) r2)
        L_0x0111:
            int r1 = values
            r3 = r1 & 39
            r1 = r1 | 39
            int r3 = r3 + r1
            int r1 = r3 % 128
            CardinalRenderType = r1
            int r3 = r3 % 2
            r1 = 97
            if (r3 == 0) goto L_0x0123
            r0 = r1
        L_0x0123:
            if (r0 == r1) goto L_0x0126
            return r2
        L_0x0126:
            throw r2     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setRotationY.Cardinal():java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public final JSONObject configure() {
        JSONObject jSONObject = new JSONObject();
        ? r1 = 0;
        try {
            jSONObject.putOpt("Is5GHzBandSupport", Boolean.valueOf(this.getInstance));
            jSONObject.putOpt("IsDeviceToApRttSupported", Boolean.valueOf(this.cleanup));
            jSONObject.putOpt("IsEnhancedPowerReportingSupported", Boolean.valueOf(this.getWarnings));
            jSONObject.putOpt("IsP2pSupported", Boolean.valueOf(this.getSDKVersion));
            jSONObject.putOpt("IsPreferredNetworkOffloadSupported", Boolean.valueOf(this.onValidated));
            jSONObject.putOpt("IsScanAlwaysAvailable", Boolean.valueOf(this.CardinalError));
            jSONObject.putOpt("IsTdlsSupported", Boolean.valueOf(this.onCReqSuccess));
            jSONObject.putOpt("BSSID", setHorizontalScrollBarEnabled.cca_continue(this.cca_continue));
            jSONObject.putOpt("NetworkID", Integer.valueOf(this.Cardinal));
            jSONObject.putOpt("SSID", setHorizontalScrollBarEnabled.cca_continue(this.init));
            int i = values + 97;
            CardinalRenderType = i % 128;
            int i2 = i % 2;
        } catch (JSONException e) {
            setTranslationY.cca_continue().configure("13101", e.getLocalizedMessage(), (String) r1);
        }
        int i3 = values;
        int i4 = i3 & 19;
        int i5 = (i3 ^ 19) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        CardinalRenderType = i6 % 128;
        if (!(i6 % 2 != 0)) {
            return jSONObject;
        }
        super.hashCode();
        throw r1;
    }

    public final void init() {
        int i = values;
        int i2 = ((i | 55) << 1) - (i ^ 55);
        CardinalRenderType = i2 % 128;
        int i3 = i2 % 2;
        Executors.newSingleThreadExecutor().execute(this);
        int i4 = values;
        int i5 = ((i4 | 4) << 1) - (i4 ^ 4);
        int i6 = (i5 & -1) + (i5 | -1);
        CardinalRenderType = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void run() {
        int i = (values + 50) - 1;
        CardinalRenderType = i % 128;
        int i2 = i % 2;
        setHorizontalScrollBarEnabled.getInstance(this.configure);
        setHorizontalScrollBarEnabled.getInstance(this.cca_continue);
        setHorizontalScrollBarEnabled.getInstance(this.init);
        this.Cardinal = 0;
        this.getInstance = false;
        this.cleanup = false;
        this.getWarnings = false;
        this.getSDKVersion = false;
        this.onValidated = false;
        this.onCReqSuccess = false;
        this.CardinalError = false;
        int i3 = CardinalRenderType;
        int i4 = (i3 ^ 97) + ((i3 & 97) << 1);
        values = i4 % 128;
        int i5 = i4 % 2;
    }
}
