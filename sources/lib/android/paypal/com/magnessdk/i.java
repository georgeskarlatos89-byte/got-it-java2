package lib.android.paypal.com.magnessdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.filesystem.d;
import lib.android.paypal.com.magnessdk.log.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class i extends g {
    private static final int S2 = 255;
    private static final int T2 = 256;
    private static final int U2 = 16;
    private static final int V2 = 32;
    private static final int W2 = 32;
    private static final String X2 = "invalid_input";
    private static final String Y2 = "SG1hY1NIQTI1Ng==";
    private static final String Z2 = "RiskManagerCT";
    private static final String a3 = "fb.bin";
    private static final String b3 = "00:00:00:00:00:00";
    private static final String c3 = "external";
    private int A1 = -1;
    private int A2 = -1;
    private int B1 = -1;
    private TelephonyManager B2;
    private int C1 = -1;
    private WifiManager C2;
    private String D1;
    private ConnectivityManager D2;
    private String E1;
    private BatteryManager E2;
    private String F1;
    private LocationManager F2;
    private String G1;
    private PowerManager G2;
    private String H1;
    private PackageManager H2;
    private String I1;
    private Location I2;
    private String J1;
    private JSONObject J2;
    private String K1;
    private JSONObject K2;
    private String L1;
    private JSONObject L2;
    private String M1;
    private JSONObject M2;
    private String N1;
    private JSONObject N2;
    private String O1;
    private Handler O2;
    private String P1;
    private boolean P2;
    private String Q1;
    private e Q2;
    private String R1;
    private j R2 = j.b();
    private String S1;
    private String T1;
    private String U1;
    private String V1;
    private String W1;
    private String X1;
    private String Y1;
    private String Z1;
    private String a2;
    private List<String> b2;
    private List<String> c2;
    private List<String> d2;
    private long e2 = -1;
    private long f2 = -1;
    private boolean g2;
    private boolean h2;
    private boolean i2;
    private boolean j2;
    private boolean k2;
    private boolean l2;
    private boolean m2;
    private boolean n2;
    private boolean o2;
    private boolean p2;
    private boolean q2;
    private boolean r2;
    private boolean s2;
    private Map<String, String> t2;
    private NetworkInfo u2;
    private WifiInfo v2;
    private long w2 = -1;
    private int x1 = -1;
    private int x2 = -1;
    private long y1 = -1;
    private int y2 = -1;
    private int z1 = -1;
    private int z2 = -1;

    i(boolean z) {
        this.P2 = z;
    }

    private Location a(LocationManager locationManager) {
        Location location = null;
        if (locationManager == null) {
            return null;
        }
        try {
            List<String> providers = locationManager.getProviders(true);
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    break;
                }
            }
        } catch (Exception e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
        }
        return location;
    }

    private String a(TelephonyManager telephonyManager) {
        try {
            return telephonyManager.getSimOperatorName();
        } catch (Exception e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
            return null;
        }
    }

    private String a(String str, String str2, long j, String str3) throws Exception {
        String str4;
        if (!f.b((Object) str) || !f.b((Object) str2) || !f.b((Object) Long.valueOf(j))) {
            if (f.b((Object) str)) {
                str = "";
            }
            if (f.b((Object) str2)) {
                str2 = "";
            }
            str4 = (f.b((Object) Long.valueOf(j)) ? new StringBuilder().append(str) : new StringBuilder().append(str).append(j)).append(str2).toString();
        } else {
            str4 = X2;
        }
        String a = f.a(Y2);
        String a4 = f.b((Object) Long.valueOf(j)) ? f.a(str3) : f.a(str3) + j;
        Mac instance = Mac.getInstance(a);
        instance.init(new SecretKeySpec(a4.getBytes(), a));
        byte[] doFinal = instance.doFinal(str4.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : doFinal) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString().substring(0, 32);
    }

    private ArrayList<String> a(WifiManager wifiManager) {
        String bssid;
        int i;
        if (wifiManager == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null || scanResults.size() == 0 || (bssid = wifiManager.getConnectionInfo().getBSSID()) == null || bssid.equals(b3)) {
            return null;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = -1;
        for (int i5 = 0; i5 < scanResults.size(); i5++) {
            if (!bssid.equals(scanResults.get(i5).BSSID) && i3 < (i = scanResults.get(i5).level)) {
                i4 = i5;
                i3 = i;
            }
        }
        arrayList.add(bssid);
        if (i4 != -1) {
            arrayList.add(scanResults.get(i4).BSSID);
        }
        return arrayList;
    }

    private List<String> a(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses != null && inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (z || !nextElement.isLinkLocalAddress())) {
                        String hostAddress = nextElement.getHostAddress();
                        if (nextElement instanceof Inet6Address) {
                            arrayList3.add(hostAddress);
                        } else {
                            arrayList2.add(hostAddress);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                arrayList.addAll(arrayList3);
            }
        } catch (Exception e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private JSONObject a(Context context, BatteryManager batteryManager, PowerManager powerManager) {
        int i;
        int i3;
        int i4;
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        JSONObject jSONObject = new JSONObject();
        int i5 = 12345;
        double d = 12345.0d;
        if (registerReceiver != null) {
            double intExtra = (double) registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, 12345);
            int intExtra2 = registerReceiver.getIntExtra("scale", 12345);
            i4 = registerReceiver.getIntExtra("temperature", 12345);
            int intExtra3 = registerReceiver.getIntExtra("voltage", 12345);
            i3 = registerReceiver.getIntExtra("status", 12345);
            i = registerReceiver.getIntExtra("plugged", 12345);
            d = (intExtra == 12345.0d || intExtra2 == 12345) ? intExtra : intExtra / ((double) intExtra2);
            i5 = intExtra3;
        } else {
            i = 12345;
            i4 = 12345;
            i3 = 12345;
        }
        int intProperty = batteryManager.getIntProperty(2);
        boolean isPowerSaveMode = powerManager.isPowerSaveMode();
        try {
            jSONObject.put(c.e.a.CURRENT.toString(), a((Object) Integer.valueOf(intProperty)));
            jSONObject.put(c.e.a.LEVEL.toString(), new DecimalFormat(".##").format(a((Object) Double.valueOf(d))));
            jSONObject.put(c.e.a.METHOD.toString(), a((Object) Integer.valueOf(i)));
            jSONObject.put(c.e.a.LOW_POWER.toString(), a((Object) Integer.valueOf(isPowerSaveMode ? 1 : 0)));
            jSONObject.put(c.e.a.STATE.toString(), a((Object) Integer.valueOf(i3)));
            jSONObject.put(c.e.a.TEMP.toString(), a((Object) Integer.valueOf(i4)));
            jSONObject.put(c.e.a.VOLTAGE.toString(), a((Object) Integer.valueOf(i5)));
        } catch (JSONException e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
        }
        return jSONObject;
    }

    private JSONObject a(Location location) {
        if (location != null) {
            try {
                return new JSONObject("{\"lat\":" + location.getLatitude() + ",\"lng\":" + location.getLongitude() + ",\"acc\":" + location.getAccuracy() + ",\"timestamp\":" + location.getTime() + "}");
            } catch (Exception e) {
                a.a((Class<?>) i.class, 3, (Throwable) e);
            }
        }
        return null;
    }

    private String b(String str) throws Exception {
        if (str == null || str.isEmpty()) {
            str = "invalid input in dc method";
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(str.getBytes());
        byte[] digest = instance.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString().substring(0, 32);
    }

    private List<String> b() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String next : this.Q2.e()) {
                if (d.a(this.H2, new Intent().setComponent(ComponentName.unflattenFromString(next)))) {
                    arrayList.add(next);
                }
            }
        } catch (Exception e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: android.telephony.gsm.GsmCellLocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: android.telephony.cdma.CdmaCellLocation} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.telephony.TelephonyManager r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r6.getPhoneType()
            if (r0 == 0) goto L_0x01ac
            r1 = 1
            r2 = 26
            r3 = -1
            r4 = 0
            if (r0 == r1) goto L_0x00b5
            r1 = 2
            if (r0 == r1) goto L_0x002e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unknown ("
            r0.<init>(r1)
            int r6 = r6.getPhoneType()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            goto L_0x01ae
        L_0x002e:
            java.lang.String r0 = "cdma"
            r5.R1 = r0
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01a4 }
            if (r0 < r2) goto L_0x0083
            boolean r0 = r5.h()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x0040
            java.util.List r4 = r6.getAllCellInfo()     // Catch:{ Exception -> 0x01a4 }
        L_0x0040:
            if (r4 == 0) goto L_0x01b0
            int r6 = r4.size()     // Catch:{ Exception -> 0x01a4 }
            if (r6 == 0) goto L_0x01b0
            java.util.Iterator r6 = r4.iterator()     // Catch:{ Exception -> 0x01a4 }
        L_0x004c:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellInfo r0 = (android.telephony.CellInfo) r0     // Catch:{ Exception -> 0x01a4 }
            boolean r1 = r0 instanceof android.telephony.CellInfoCdma     // Catch:{ Exception -> 0x01a4 }
            if (r1 == 0) goto L_0x004c
            r1 = r0
            android.telephony.CellInfoCdma r1 = (android.telephony.CellInfoCdma) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityCdma r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getBasestationId()     // Catch:{ Exception -> 0x01a4 }
            r5.y2 = r1     // Catch:{ Exception -> 0x01a4 }
            r1 = r0
            android.telephony.CellInfoCdma r1 = (android.telephony.CellInfoCdma) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityCdma r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getNetworkId()     // Catch:{ Exception -> 0x01a4 }
            r5.A2 = r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellInfoCdma r0 = (android.telephony.CellInfoCdma) r0     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityCdma r0 = r0.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r0 = r0.getSystemId()     // Catch:{ Exception -> 0x01a4 }
            r5.z2 = r0     // Catch:{ Exception -> 0x01a4 }
            goto L_0x004c
        L_0x0083:
            boolean r0 = r5.h()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x0096
            android.telephony.CellLocation r6 = r6.getCellLocation()     // Catch:{ Exception -> 0x01a4 }
            java.lang.Class<android.telephony.cdma.CdmaCellLocation> r0 = android.telephony.cdma.CdmaCellLocation.class
            java.lang.Object r6 = lib.android.paypal.com.magnessdk.f.a((java.lang.Object) r6, r0)     // Catch:{ Exception -> 0x01a4 }
            r4 = r6
            android.telephony.cdma.CdmaCellLocation r4 = (android.telephony.cdma.CdmaCellLocation) r4     // Catch:{ Exception -> 0x01a4 }
        L_0x0096:
            if (r4 != 0) goto L_0x009a
            r6 = r3
            goto L_0x009e
        L_0x009a:
            int r6 = r4.getBaseStationId()     // Catch:{ Exception -> 0x01a4 }
        L_0x009e:
            r5.y2 = r6     // Catch:{ Exception -> 0x01a4 }
            if (r4 != 0) goto L_0x00a4
            r6 = r3
            goto L_0x00a8
        L_0x00a4:
            int r6 = r4.getNetworkId()     // Catch:{ Exception -> 0x01a4 }
        L_0x00a8:
            r5.A2 = r6     // Catch:{ Exception -> 0x01a4 }
            if (r4 != 0) goto L_0x00ad
            goto L_0x00b1
        L_0x00ad:
            int r3 = r4.getSystemId()     // Catch:{ Exception -> 0x01a4 }
        L_0x00b1:
            r5.z2 = r3     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01b0
        L_0x00b5:
            java.lang.String r0 = "gsm"
            r5.R1 = r0
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01a4 }
            if (r0 < r2) goto L_0x017b
            boolean r0 = r5.h()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x00c7
            java.util.List r4 = r6.getAllCellInfo()     // Catch:{ Exception -> 0x01a4 }
        L_0x00c7:
            if (r4 == 0) goto L_0x01b0
            int r6 = r4.size()     // Catch:{ Exception -> 0x01a4 }
            if (r6 == 0) goto L_0x01b0
            java.util.Iterator r6 = r4.iterator()     // Catch:{ Exception -> 0x01a4 }
        L_0x00d3:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellInfo r0 = (android.telephony.CellInfo) r0     // Catch:{ Exception -> 0x01a4 }
            boolean r1 = r0 instanceof android.telephony.CellInfoGsm     // Catch:{ Exception -> 0x01a4 }
            if (r1 == 0) goto L_0x00fe
            r1 = r0
            android.telephony.CellInfoGsm r1 = (android.telephony.CellInfoGsm) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityGsm r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getLac()     // Catch:{ Exception -> 0x01a4 }
            r5.x2 = r1     // Catch:{ Exception -> 0x01a4 }
            r1 = r0
            android.telephony.CellInfoGsm r1 = (android.telephony.CellInfoGsm) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityGsm r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getCid()     // Catch:{ Exception -> 0x01a4 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x01a4 }
            r5.w2 = r1     // Catch:{ Exception -> 0x01a4 }
        L_0x00fe:
            boolean r1 = r0 instanceof android.telephony.CellInfoLte     // Catch:{ Exception -> 0x01a4 }
            if (r1 == 0) goto L_0x011d
            r1 = r0
            android.telephony.CellInfoLte r1 = (android.telephony.CellInfoLte) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityLte r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getTac()     // Catch:{ Exception -> 0x01a4 }
            r5.x2 = r1     // Catch:{ Exception -> 0x01a4 }
            r1 = r0
            android.telephony.CellInfoLte r1 = (android.telephony.CellInfoLte) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityLte r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getCi()     // Catch:{ Exception -> 0x01a4 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x01a4 }
            r5.w2 = r1     // Catch:{ Exception -> 0x01a4 }
        L_0x011d:
            boolean r1 = r0 instanceof android.telephony.CellInfoWcdma     // Catch:{ Exception -> 0x01a4 }
            if (r1 == 0) goto L_0x013c
            r1 = r0
            android.telephony.CellInfoWcdma r1 = (android.telephony.CellInfoWcdma) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityWcdma r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getLac()     // Catch:{ Exception -> 0x01a4 }
            r5.x2 = r1     // Catch:{ Exception -> 0x01a4 }
            r1 = r0
            android.telephony.CellInfoWcdma r1 = (android.telephony.CellInfoWcdma) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityWcdma r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getCid()     // Catch:{ Exception -> 0x01a4 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x01a4 }
            r5.w2 = r1     // Catch:{ Exception -> 0x01a4 }
        L_0x013c:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01a4 }
            r2 = 29
            if (r1 < r2) goto L_0x00d3
            boolean r1 = r0 instanceof android.telephony.CellInfoTdscdma     // Catch:{ Exception -> 0x01a4 }
            if (r1 == 0) goto L_0x0161
            r1 = r0
            android.telephony.CellInfoTdscdma r1 = (android.telephony.CellInfoTdscdma) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityTdscdma r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getLac()     // Catch:{ Exception -> 0x01a4 }
            r5.x2 = r1     // Catch:{ Exception -> 0x01a4 }
            r1 = r0
            android.telephony.CellInfoTdscdma r1 = (android.telephony.CellInfoTdscdma) r1     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityTdscdma r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            int r1 = r1.getCid()     // Catch:{ Exception -> 0x01a4 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x01a4 }
            r5.w2 = r1     // Catch:{ Exception -> 0x01a4 }
        L_0x0161:
            boolean r1 = r0 instanceof android.telephony.CellInfoNr     // Catch:{ Exception -> 0x01a4 }
            if (r1 == 0) goto L_0x00d3
            android.telephony.CellInfoNr r0 = (android.telephony.CellInfoNr) r0     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentity r0 = r0.getCellIdentity()     // Catch:{ Exception -> 0x01a4 }
            android.telephony.CellIdentityNr r0 = (android.telephony.CellIdentityNr) r0     // Catch:{ Exception -> 0x01a4 }
            int r1 = r0.getTac()     // Catch:{ Exception -> 0x01a4 }
            r5.x2 = r1     // Catch:{ Exception -> 0x01a4 }
            long r0 = r0.getNci()     // Catch:{ Exception -> 0x01a4 }
            r5.w2 = r0     // Catch:{ Exception -> 0x01a4 }
            goto L_0x00d3
        L_0x017b:
            boolean r0 = r5.h()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x018e
            android.telephony.CellLocation r6 = r6.getCellLocation()     // Catch:{ Exception -> 0x01a4 }
            java.lang.Class<android.telephony.gsm.GsmCellLocation> r0 = android.telephony.gsm.GsmCellLocation.class
            java.lang.Object r6 = lib.android.paypal.com.magnessdk.f.a((java.lang.Object) r6, r0)     // Catch:{ Exception -> 0x01a4 }
            r4 = r6
            android.telephony.gsm.GsmCellLocation r4 = (android.telephony.gsm.GsmCellLocation) r4     // Catch:{ Exception -> 0x01a4 }
        L_0x018e:
            if (r4 != 0) goto L_0x0191
            goto L_0x0195
        L_0x0191:
            int r3 = r4.getLac()     // Catch:{ Exception -> 0x01a4 }
        L_0x0195:
            r5.x2 = r3     // Catch:{ Exception -> 0x01a4 }
            if (r4 != 0) goto L_0x019c
            r0 = -1
            goto L_0x01a1
        L_0x019c:
            int r6 = r4.getCid()     // Catch:{ Exception -> 0x01a4 }
            long r0 = (long) r6     // Catch:{ Exception -> 0x01a4 }
        L_0x01a1:
            r5.w2 = r0     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01b0
        L_0x01a4:
            r6 = move-exception
            java.lang.Class<lib.android.paypal.com.magnessdk.i> r0 = lib.android.paypal.com.magnessdk.i.class
            r1 = 3
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r0, (int) r1, (java.lang.Throwable) r6)
            goto L_0x01b0
        L_0x01ac:
            java.lang.String r6 = "none"
        L_0x01ae:
            r5.R1 = r6
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.i.b(android.telephony.TelephonyManager):void");
    }

    private void b(JSONObject jSONObject) {
        Map<String, String> map = this.t2;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue());
                } catch (Exception e) {
                    a.a((Class<?>) i.class, 3, (Throwable) e);
                }
            }
        }
    }

    private long c(String str) {
        StatFs statFs = new StatFs(str);
        return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
    }

    private String c() {
        c.b.a aVar;
        if (Build.VERSION.SDK_INT >= 29) {
            ConnectivityManager connectivityManager = this.D2;
            if (connectivityManager != null) {
                NetworkCapabilities networkCapabilities = this.r2 ? connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) : null;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(0)) {
                        aVar = c.b.a.MOBILE;
                    } else if (networkCapabilities.hasTransport(1)) {
                        aVar = c.b.a.WIFI;
                    } else if (networkCapabilities.hasTransport(3)) {
                        aVar = c.b.a.ETHERNET;
                    } else if (networkCapabilities.hasTransport(4)) {
                        aVar = c.b.a.VPN;
                    } else if (networkCapabilities.hasTransport(2)) {
                        aVar = c.b.a.BLUETOOTH;
                    } else if (networkCapabilities.hasTransport(5)) {
                        aVar = c.b.a.WIFI_AWARE;
                    } else if (networkCapabilities.hasTransport(6)) {
                        aVar = c.b.a.LOWPAN;
                    }
                    return aVar.toString();
                }
            }
        } else {
            NetworkInfo networkInfo = this.u2;
            if (networkInfo != null) {
                return networkInfo.getTypeName();
            }
        }
        return null;
    }

    private String c(Context context) {
        return context.getSharedPreferences(Z2, 0).getInt(Z2, 0) + "";
    }

    private String d() {
        List<String> a = a(false);
        if (a == null) {
            return null;
        }
        return a.get(0);
    }

    private JSONObject d(Context context) {
        File file;
        JSONObject jSONObject = new JSONObject();
        boolean equals = Environment.getExternalStorageState().equals("mounted");
        File[] externalFilesDirs = context.getExternalFilesDirs("");
        boolean z = false;
        if (externalFilesDirs != null && externalFilesDirs.length > 1 && externalFilesDirs[0] != null && (file = externalFilesDirs[1]) != null && equals && Environment.isExternalStorageRemovable(file)) {
            z = true;
        }
        long c = c(Environment.getDataDirectory().getPath());
        long a = super.a(600);
        try {
            jSONObject.put(c.e.b.MOUNTED.toString(), z);
            jSONObject.put(c.e.b.FREE_SD.toString(), a((Object) Long.valueOf(a)));
            jSONObject.put(c.e.b.FREE_UD.toString(), a((Object) Long.valueOf(c)));
        } catch (Exception e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
        }
        return jSONObject;
    }

    private String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.j2 ? 1 : 0);
        sb.append(this.l2 ? 1 : 0);
        sb.append(this.q2 ? 1 : 0);
        sb.append(this.r2 ? 1 : 0);
        sb.append(this.m2 ? 1 : 0);
        sb.append(this.n2 ? 1 : 0);
        return sb.toString();
    }

    private boolean e(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    private String f() {
        String property;
        String property2 = System.getProperty("http.proxyHost");
        if (property2 == null || (property = System.getProperty("http.proxyPort")) == null) {
            return null;
        }
        return "host=" + property2 + ",port=" + property;
    }

    private JSONObject f(Context context) {
        long j;
        long j3;
        JSONObject jSONObject = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j4 = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.availMem;
            j3 = memoryInfo.totalMem;
        } else {
            j = 12345;
            j3 = 12345;
        }
        try {
            jSONObject.put(c.e.C0005c.FREE.toString(), a((Object) Long.valueOf(j)));
            jSONObject.put(c.e.C0005c.TOTAL.toString(), a((Object) Long.valueOf(j3)));
            jSONObject.put(c.e.C0005c.FREE_RUNTIME.toString(), a((Object) Long.valueOf(freeMemory)));
            jSONObject.put(c.e.C0005c.TOTAL_RUNTIME.toString(), a((Object) Long.valueOf(j4)));
            jSONObject.put(c.e.C0005c.MAX_RUNTIME.toString(), a((Object) Long.valueOf(maxMemory)));
        } catch (Exception e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
        }
        return jSONObject;
    }

    private String g() {
        try {
            Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp()) {
                    if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                        String name = networkInterface.getName();
                        String[] strArr = {"ppp", "tun", "tap", "ipsec", "utun"};
                        for (int i = 0; i < 5; i++) {
                            if (name.toLowerCase().startsWith(strArr[i])) {
                                return name;
                            }
                        }
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
            return null;
        }
    }

    private JSONObject g(Context context) {
        int i;
        Class<i> cls = i.class;
        JSONObject jSONObject = new JSONObject();
        try {
            i = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            a.a((Class<?>) cls, 3, (Throwable) e);
            i = g.d;
        }
        try {
            jSONObject.put("brightness", a((Object) Integer.valueOf(i)));
        } catch (JSONException e3) {
            a.a((Class<?>) cls, 3, (Throwable) e3);
        }
        return jSONObject;
    }

    private JSONObject h(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z = false;
            jSONObject.put(c.l.AC.toString(), (sensorManager == null || sensorManager.getDefaultSensor(1) == null) ? false : true);
            jSONObject.put(c.l.GY.toString(), (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true);
            String lVar = c.l.MG.toString();
            if (!(sensorManager == null || sensorManager.getDefaultSensor(2) == null)) {
                z = true;
            }
            jSONObject.put(lVar, z);
        } catch (JSONException e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
        }
        return jSONObject;
    }

    private boolean h() {
        return this.o2 && this.k2;
    }

    private void i(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Z2, 0);
        int i = sharedPreferences.getInt(Z2, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i3 = 1;
        if (i > 0 && i < Integer.MAX_VALUE) {
            i3 = 1 + i;
        }
        edit.putInt(Z2, i3);
        edit.apply();
    }

    private boolean i() {
        return this.o2 && this.j2;
    }

    /* access modifiers changed from: package-private */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(c.b.a, this.F1);
            String eVar = c.e.BASE_STATION_ID.toString();
            int i = this.x1;
            Integer num = null;
            jSONObject.put(eVar, i == -1 ? null : Integer.valueOf(i));
            jSONObject.put(c.e.BSSID.toString(), this.D1);
            jSONObject.put(c.e.BSSID_ARRAY.toString(), this.d2 == null ? null : new JSONArray(this.d2));
            String eVar2 = c.e.CELL_ID.toString();
            long j = this.y1;
            jSONObject.put(eVar2, j == -1 ? null : Long.valueOf(j));
            jSONObject.put(c.e.CONN_TYPE.toString(), this.L1);
            jSONObject.put(c.e.CONF_VERSION.toString(), this.W1);
            jSONObject.put(c.e.IS_DEV_MODE_ON.toString(), this.s2);
            jSONObject.put(c.e.m.toString(), this.M1);
            jSONObject.put(c.e.DC_ID.toString(), this.K1);
            String eVar3 = c.e.DEVICE_UPTIME.toString();
            long j3 = this.f2;
            jSONObject.put(eVar3, j3 == -1 ? null : Long.valueOf(j3));
            jSONObject.put(c.e.IP_ADDRS.toString(), this.N1);
            jSONObject.put(c.e.IP_ADDRESSES.toString(), this.b2 == null ? null : new JSONArray(this.b2));
            jSONObject.put(c.e.KNOWN_APPS.toString(), this.c2 == null ? null : new JSONArray(this.c2));
            jSONObject.put(c.e.LOCALE_COUNTRY.toString(), this.P1);
            jSONObject.put(c.e.LOCALE_LANG.toString(), this.Q1);
            jSONObject.put(c.e.LOCATION.toString(), a(this.I2));
            String eVar4 = c.e.LOCATION_AREA_CODE.toString();
            int i3 = this.C1;
            jSONObject.put(eVar4, i3 == -1 ? null : Integer.valueOf(i3));
            jSONObject.put(c.e.PHONE_TYPE.toString(), this.R1);
            jSONObject.put(c.e.RISK_COMP_SESSION_ID.toString(), this.S1);
            jSONObject.put(c.e.ROAMING.toString(), this.g2);
            jSONObject.put(c.e.SIM_OPERATOR_NAME.toString(), this.Y1);
            jSONObject.put(c.e.SIM_SERIAL_NUMBER.toString(), this.T1);
            jSONObject.put(c.e.SSID.toString(), this.U1);
            String eVar5 = c.e.CDMA_NETWORK_ID.toString();
            int i4 = this.B1;
            jSONObject.put(eVar5, i4 == -1 ? null : Integer.valueOf(i4));
            String eVar6 = c.e.CDMA_SYSTEM_ID.toString();
            int i5 = this.A1;
            jSONObject.put(eVar6, i5 == -1 ? null : Integer.valueOf(i5));
            jSONObject.put(c.e.SUBSCRIBER_ID.toString(), this.V1);
            String eVar7 = c.e.TIMESTAMP.toString();
            long j4 = this.e2;
            jSONObject.put(eVar7, j4 == -1 ? null : Long.valueOf(j4));
            jSONObject.put(c.e.TZ_NAME.toString(), this.O1);
            jSONObject.put(c.e.DS.toString(), this.h2);
            String eVar8 = c.e.TZ.toString();
            int i6 = this.z1;
            if (i6 != -1) {
                num = Integer.valueOf(i6);
            }
            jSONObject.put(eVar8, num);
            jSONObject.put(c.e.NETWORK_OPERATOR.toString(), this.E1);
            jSONObject.put(c.e.SERIAL_NUMBER.toString(), this.G1);
            jSONObject.put(c.e.VPN_SETTING.toString(), this.I1);
            jSONObject.put(c.e.PROXY_SETTING.toString(), this.H1);
            jSONObject.put(c.e.C.toString(), this.J1);
            jSONObject.put(c.e.MG_ID.toString(), this.X1);
            jSONObject.put(c.e.PL.toString(), this.Z1);
            jSONObject.put(c.e.BATTERY.toString(), this.J2);
            jSONObject.put(c.e.MEMORY.toString(), this.K2);
            jSONObject.put(c.e.DISK.toString(), this.L2);
            jSONObject.put(c.e.SCREEN.toString(), this.M2);
            jSONObject.put(c.e.SR.toString(), this.N2);
            jSONObject.put(c.e.O.toString(), g.j1);
            b(jSONObject);
            return jSONObject;
        } catch (Exception e) {
            a.a((Class<?>) i.class, 3, (Throwable) e);
            return jSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(MagnesSettings magnesSettings, d dVar, e eVar) {
        return a(magnesSettings, dVar, eVar, this.a2, (String) null, (HashMap<String, String>) null, this.O2);
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(MagnesSettings magnesSettings, d dVar, e eVar, String str, String str2, HashMap<String, String> hashMap, Handler handler) {
        TelephonyManager telephonyManager;
        MagnesSettings magnesSettings2 = magnesSettings;
        e eVar2 = eVar;
        String str3 = str2;
        Handler handler2 = handler;
        Class<i> cls = i.class;
        a.a((Class<?>) cls, 0, "collecting RiskBlobDynamicData");
        this.Q2 = eVar2;
        Context context = magnesSettings.getContext();
        this.o2 = magnesSettings.hasUserLocationConsent();
        this.B2 = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        this.C2 = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.F2 = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        this.D2 = (ConnectivityManager) context.getSystemService("connectivity");
        int i = Build.VERSION.SDK_INT;
        this.E2 = (BatteryManager) context.getSystemService("batterymanager");
        this.G2 = (PowerManager) context.getSystemService("power");
        this.H2 = context.getPackageManager();
        boolean a = a(context, "android.permission.ACCESS_FINE_LOCATION");
        this.k2 = a;
        boolean z = true;
        this.j2 = a || a(context, "android.permission.ACCESS_COARSE_LOCATION");
        this.m2 = a(context, "android.permission.READ_EXTERNAL_STORAGE");
        this.n2 = a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        this.l2 = a(context, "android.permission.READ_PHONE_STATE");
        this.r2 = a(context, "android.permission.ACCESS_NETWORK_STATE");
        this.q2 = a(context, "android.permission.ACCESS_WIFI_STATE");
        this.t2 = hashMap;
        this.e2 = System.currentTimeMillis();
        this.W1 = eVar.f();
        this.F1 = str3;
        this.a2 = str;
        this.O2 = handler2;
        if (str3 == null) {
            this.F1 = f.a(false);
        }
        b(this.B2);
        WifiManager wifiManager = this.C2;
        NetworkInfo networkInfo = null;
        if (wifiManager != null) {
            this.v2 = this.q2 ? wifiManager.getConnectionInfo() : null;
        }
        ConnectivityManager connectivityManager = this.D2;
        if (connectivityManager != null) {
            if (this.r2) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            this.u2 = networkInfo;
        }
        if (i >= 29) {
            if (!a(context, "android.permission.READ_PRIVILEGED_PHONE_STATE") && ((telephonyManager = this.B2) == null || !telephonyManager.hasCarrierPrivileges())) {
                z = false;
            }
            this.i2 = z;
        }
        this.R2.a(eVar2, handler2, magnesSettings);
        a(82, magnesSettings);
        a(81, magnesSettings);
        a(16, magnesSettings);
        a(21, magnesSettings);
        a(75, magnesSettings);
        a(23, magnesSettings);
        a(27, magnesSettings);
        a(28, magnesSettings);
        a(56, magnesSettings);
        a(72, magnesSettings);
        a(42, magnesSettings);
        a(43, magnesSettings);
        a(45, magnesSettings);
        a(53, magnesSettings);
        a(80, magnesSettings);
        a(71, magnesSettings);
        a(4, magnesSettings);
        a(57, magnesSettings);
        a(58, magnesSettings);
        a(6, magnesSettings);
        a(30, magnesSettings);
        a(29, magnesSettings);
        a(13, magnesSettings);
        a(68, magnesSettings);
        a(49, magnesSettings);
        a(84, magnesSettings);
        a(5, magnesSettings);
        a(48, magnesSettings);
        a(11, magnesSettings);
        a(85, magnesSettings);
        a(46, magnesSettings);
        a(79, magnesSettings);
        a(87, magnesSettings);
        a(98, magnesSettings);
        a(99, magnesSettings);
        g.j1 = false;
        if (this.P2) {
            if (a(dVar, magnesSettings.getMagnesSource(), g.k1, g.q1, magnesSettings.getContext())) {
                this.R2.a(magnesSettings, this.F1, this.N2);
            }
        }
        if (a(dVar, magnesSettings.getMagnesSource(), g.k1, g.r1, magnesSettings.getContext())) {
            a(89, magnesSettings);
            a(92, magnesSettings);
            a(93, magnesSettings);
            a(91, magnesSettings);
        }
        a.a((Class<?>) cls, 0, "finishing RiskBlobDynamicData");
        return a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.location.Location} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x030e, code lost:
        if (r7 != null) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0397, code lost:
        if (r7 != null) goto L_0x0399;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r7, lib.android.paypal.com.magnessdk.MagnesSettings r8) {
        /*
            r6 = this;
            android.content.Context r8 = r8.getContext()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r0 = 4
            if (r7 == r0) goto L_0x03a6
            r0 = 5
            r1 = 27
            r2 = 0
            if (r7 == r0) goto L_0x0383
            r0 = 6
            if (r7 == r0) goto L_0x0376
            r0 = 42
            r3 = 1
            if (r7 == r0) goto L_0x0367
            r0 = 43
            if (r7 == r0) goto L_0x0353
            r0 = 45
            if (r7 == r0) goto L_0x033e
            r0 = 46
            r4 = 29
            if (r7 == r0) goto L_0x031e
            r0 = 48
            if (r7 == r0) goto L_0x02fa
            r0 = 49
            if (r7 == r0) goto L_0x02da
            r0 = 71
            if (r7 == r0) goto L_0x02ca
            r0 = 72
            if (r7 == r0) goto L_0x02ba
            r0 = 84
            if (r7 == r0) goto L_0x02a2
            r0 = 85
            if (r7 == r0) goto L_0x028d
            r0 = 26
            switch(r7) {
                case 11: goto L_0x027d;
                case 13: goto L_0x023e;
                case 16: goto L_0x022e;
                case 21: goto L_0x021e;
                case 23: goto L_0x0206;
                case 27: goto L_0x01f2;
                case 28: goto L_0x01de;
                case 29: goto L_0x01c6;
                case 30: goto L_0x01b8;
                case 53: goto L_0x0195;
                case 68: goto L_0x0170;
                case 75: goto L_0x0160;
                case 87: goto L_0x0158;
                case 89: goto L_0x0144;
                case 98: goto L_0x0134;
                case 99: goto L_0x0124;
                default: goto L_0x0040;
            }     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x0040:
            switch(r7) {
                case 56: goto L_0x010f;
                case 57: goto L_0x0101;
                case 58: goto L_0x00f3;
                default: goto L_0x0043;
            }     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x0043:
            switch(r7) {
                case 79: goto L_0x00da;
                case 80: goto L_0x00bd;
                case 81: goto L_0x00a0;
                case 82: goto L_0x007b;
                default: goto L_0x0046;
            }     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x0046:
            switch(r7) {
                case 91: goto L_0x006b;
                case 92: goto L_0x005b;
                case 93: goto L_0x004b;
                default: goto L_0x0049;
            }     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x0049:
            goto L_0x03bc
        L_0x004b:
            lib.android.paypal.com.magnessdk.e r0 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r0.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            org.json.JSONObject r7 = r6.d(r8)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.L2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x005b:
            lib.android.paypal.com.magnessdk.e r0 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r0.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            org.json.JSONObject r7 = r6.f(r8)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.K2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x006b:
            lib.android.paypal.com.magnessdk.e r0 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r0.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            org.json.JSONObject r7 = r6.g(r8)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.M2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x007b:
            lib.android.paypal.com.magnessdk.e r0 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r0.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            lib.android.paypal.com.magnessdk.MagnesSDK r7 = lib.android.paypal.com.magnessdk.MagnesSDK.getInstance()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            lib.android.paypal.com.magnessdk.MagnesSettings r7 = r7.b     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            int r7 = r7.getMagnesSource()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            lib.android.paypal.com.magnessdk.MagnesSource r0 = lib.android.paypal.com.magnessdk.MagnesSource.PAYPAL     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            int r0 = r0.getVersion()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 != r0) goto L_0x03bc
            r6.i(r8)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r7 = r6.c((android.content.Context) r8)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.J1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x00a0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r7.<init>()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r8 = r6.a2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            long r0 = r6.e2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.StringBuilder r7 = r7.append(r0)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r7 = r7.toString()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r7 = r6.b((java.lang.String) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.K1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x00bd:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.util.Date r8 = new java.util.Date     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r8.<init>()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            long r0 = r8.getTime()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            int r7 = r7.getOffset(r0)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.z1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x00da:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.util.Date r8 = new java.util.Date     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r8.<init>()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r7.inDaylightTime(r8)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.h2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x00f3:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r7 = r6.z2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.A1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0101:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r7 = r6.A2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.B1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x010f:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            android.telephony.TelephonyManager r7 = r6.B2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 != 0) goto L_0x011c
            goto L_0x0120
        L_0x011c:
            java.lang.String r2 = r7.getNetworkOperator()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x0120:
            r6.E1 = r2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0124:
            lib.android.paypal.com.magnessdk.e r0 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r0.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            boolean r7 = r6.e(r8)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.s2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0134:
            lib.android.paypal.com.magnessdk.e r0 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r0.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            org.json.JSONObject r7 = r6.h(r8)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.N2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0144:
            lib.android.paypal.com.magnessdk.e r0 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r0.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            android.os.BatteryManager r7 = r6.E2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            android.os.PowerManager r0 = r6.G2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            org.json.JSONObject r7 = r6.a((android.content.Context) r8, (android.os.BatteryManager) r7, (android.os.PowerManager) r0)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.J2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0158:
            java.lang.String r7 = r6.e()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.Z1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0160:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.util.List r7 = r6.a((boolean) r3)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.b2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0170:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            boolean r7 = r6.l2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            android.telephony.TelephonyManager r7 = r6.B2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 < r0) goto L_0x018f
            if (r7 < r4) goto L_0x018a
            boolean r7 = r6.i2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
        L_0x018a:
            java.lang.String r7 = android.os.Build.getSerial()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x0191
        L_0x018f:
            java.lang.String r7 = android.os.Build.SERIAL     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x0191:
            r6.G1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0195:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.util.TimeZone r8 = java.util.TimeZone.getDefault()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.util.Date r0 = new java.util.Date     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r0.<init>()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r8 = r8.inDaylightTime(r0)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r7 = r7.getDisplayName(r8, r3, r0)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.O1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x01b8:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r7 = r6.x2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.C1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x01c6:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            boolean r7 = r6.i()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x01da
            android.location.LocationManager r7 = r6.F2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            android.location.Location r2 = r6.a((android.location.LocationManager) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x01da:
            r6.I2 = r2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x01de:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r7 = r7.getLanguage()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.Q1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x01f2:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r7 = r7.getCountry()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.P1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0206:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.util.List r7 = r6.b()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r8 = r7.isEmpty()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r8 == 0) goto L_0x0219
            goto L_0x021a
        L_0x0219:
            r2 = r7
        L_0x021a:
            r6.c2 = r2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x021e:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.lang.String r7 = r6.d()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.N1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x022e:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.f2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x023e:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            boolean r7 = r6.l2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            android.telephony.TelephonyManager r7 = r6.B2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r8 < r0) goto L_0x0275
            if (r8 < r4) goto L_0x0258
            boolean r8 = r6.i2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r8 == 0) goto L_0x03bc
        L_0x0258:
            int r7 = r7.getPhoneType()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 != r3) goto L_0x0265
            android.telephony.TelephonyManager r7 = r6.B2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r7 = r7.getImei()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x0279
        L_0x0265:
            android.telephony.TelephonyManager r7 = r6.B2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            int r7 = r7.getPhoneType()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r8 = 2
            if (r7 != r8) goto L_0x03bc
            android.telephony.TelephonyManager r7 = r6.B2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r7 = r7.getMeid()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x0279
        L_0x0275:
            java.lang.String r7 = r7.getDeviceId()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x0279:
            r6.M1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x027d:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.lang.String r7 = r6.c()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.L1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x028d:
            java.lang.String r1 = r6.a2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r2 = r6.F1     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            long r3 = r6.e2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            lib.android.paypal.com.magnessdk.e r7 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.lang.String r5 = r7.h()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r0 = r6
            java.lang.String r7 = r0.a(r1, r2, r3, r5)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.X1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x02a2:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            boolean r7 = r6.h()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x02b6
            android.net.wifi.WifiManager r7 = r6.C2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            java.util.ArrayList r2 = r6.a((android.net.wifi.WifiManager) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x02b6:
            r6.d2 = r2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x02ba:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.lang.String r7 = r6.f()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.H1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x02ca:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.lang.String r7 = r6.g()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.I1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x02da:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            boolean r7 = r6.l2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            android.telephony.TelephonyManager r7 = r6.B2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r8 < r4) goto L_0x02f2
            boolean r8 = r6.i2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r8 == 0) goto L_0x03bc
        L_0x02f2:
            java.lang.String r7 = r7.getSubscriberId()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.V1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x02fa:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 < r1) goto L_0x0315
            boolean r7 = r6.i()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x031a
            android.net.wifi.WifiInfo r7 = r6.v2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x031a
        L_0x0310:
            java.lang.String r2 = r7.getSSID()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x031a
        L_0x0315:
            android.net.wifi.WifiInfo r7 = r6.v2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x031a
            goto L_0x0310
        L_0x031a:
            r6.U1 = r2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x031e:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            boolean r7 = r6.l2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            android.telephony.TelephonyManager r7 = r6.B2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r8 < r4) goto L_0x0336
            boolean r8 = r6.i2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r8 == 0) goto L_0x03bc
        L_0x0336:
            java.lang.String r7 = r7.getSimSerialNumber()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.T1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x033e:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            android.telephony.TelephonyManager r7 = r6.B2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 != 0) goto L_0x034b
            goto L_0x034f
        L_0x034b:
            java.lang.String r2 = r6.a((android.telephony.TelephonyManager) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
        L_0x034f:
            r6.Y1 = r2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0353:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            android.telephony.ServiceState r7 = new android.telephony.ServiceState     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r7.<init>()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r7.getRoaming()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.g2 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0367:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            java.lang.String r7 = lib.android.paypal.com.magnessdk.f.a((boolean) r3)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.S1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0376:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            long r7 = r6.w2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.y1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x0383:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 < r1) goto L_0x039e
            boolean r7 = r6.i()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03a3
            android.net.wifi.WifiInfo r7 = r6.v2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03a3
        L_0x0399:
            java.lang.String r2 = r7.getBSSID()     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03a3
        L_0x039e:
            android.net.wifi.WifiInfo r7 = r6.v2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03a3
            goto L_0x0399
        L_0x03a3:
            r6.D1 = r2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x03a6:
            lib.android.paypal.com.magnessdk.e r8 = r6.Q2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            boolean r7 = r8.a((int) r7)     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            if (r7 == 0) goto L_0x03bc
            int r7 = r6.y2     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            r6.x1 = r7     // Catch:{ AssertionError -> 0x03b5, Exception -> 0x03b3 }
            goto L_0x03bc
        L_0x03b3:
            r7 = move-exception
            goto L_0x03b6
        L_0x03b5:
            r7 = move-exception
        L_0x03b6:
            java.lang.Class<lib.android.paypal.com.magnessdk.i> r8 = lib.android.paypal.com.magnessdk.i.class
            r0 = 3
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) r8, (int) r0, (java.lang.Throwable) r7)
        L_0x03bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.i.a(int, lib.android.paypal.com.magnessdk.MagnesSettings):void");
    }
}
