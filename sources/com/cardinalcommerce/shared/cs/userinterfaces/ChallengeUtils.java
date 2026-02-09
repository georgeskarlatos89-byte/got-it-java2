package com.cardinalcommerce.shared.cs.userinterfaces;

import android.content.Context;
import android.content.Intent;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.lang.ref.WeakReference;

public class ChallengeUtils {
    private static WeakReference<Context> Cardinal = null;
    private static int cca_continue = 1;
    public static boolean configure;
    private static int getInstance;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void configure(android.content.Context r11, com.cardinalcommerce.a.setTransitionVisibility r12, com.cardinalcommerce.shared.userinterfaces.UiCustomization r13) {
        /*
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.content.Context r1 = r11.getApplicationContext()
            r0.<init>(r1)
            Cardinal = r0
            java.lang.String r0 = r12.configure()
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = -1
            r5 = 0
            r6 = 2
            r7 = 1
            switch(r1) {
                case 1537: goto L_0x00f1;
                case 1538: goto L_0x00c3;
                case 1539: goto L_0x007e;
                case 1540: goto L_0x0056;
                case 1541: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0122
        L_0x001e:
            java.lang.String r1 = "05"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = r7
            goto L_0x0029
        L_0x0028:
            r0 = r5
        L_0x0029:
            if (r0 == 0) goto L_0x0122
            int r0 = getInstance
            r1 = r0 ^ 25
            r8 = r0 & 25
            r1 = r1 | r8
            int r1 = r1 << r7
            r8 = r0 & -26
            int r9 = ~r0
            r10 = 25
            r9 = r9 & r10
            r8 = r8 | r9
            int r8 = -r8
            r9 = r1 & r8
            r1 = r1 | r8
            int r9 = r9 + r1
            int r1 = r9 % 128
            cca_continue = r1
            int r9 = r9 % r6
            r1 = r0 & 77
            r0 = r0 | 77
            int r0 = -r0
            int r0 = -r0
            r8 = r1 & r0
            r0 = r0 | r1
            int r8 = r8 + r0
            int r0 = r8 % 128
            cca_continue = r0
            int r8 = r8 % r6
            r8 = r5
            goto L_0x0123
        L_0x0056:
            java.lang.String r1 = "04"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0060
            r0 = r7
            goto L_0x0061
        L_0x0060:
            r0 = r5
        L_0x0061:
            if (r0 == 0) goto L_0x0122
            int r0 = getInstance
            r1 = r0 ^ 13
            r0 = r0 & 13
            r0 = r0 | r1
            int r0 = r0 << r7
            int r0 = r0 - r1
            int r1 = r0 % 128
            cca_continue = r1
            int r0 = r0 % r6
            r1 = 48
            r8 = 5
            if (r0 != 0) goto L_0x0078
            r0 = r1
            goto L_0x0079
        L_0x0078:
            r0 = r8
        L_0x0079:
            if (r0 == r1) goto L_0x0123
            r8 = r2
            goto L_0x0123
        L_0x007e:
            java.lang.String r1 = "03"
            boolean r0 = r0.equals(r1)
            r1 = 74
            if (r0 == 0) goto L_0x008a
            r0 = r1
            goto L_0x008c
        L_0x008a:
            r0 = 45
        L_0x008c:
            if (r0 == r1) goto L_0x0090
            goto L_0x0122
        L_0x0090:
            int r0 = cca_continue
            r1 = r0 ^ 101(0x65, float:1.42E-43)
            r8 = r0 & 101(0x65, float:1.42E-43)
            r1 = r1 | r8
            int r1 = r1 << r7
            r8 = r0 & -102(0xffffffffffffff9a, float:NaN)
            int r0 = ~r0
            r9 = 101(0x65, float:1.42E-43)
            r0 = r0 & r9
            r0 = r0 | r8
            int r1 = r1 - r0
            int r0 = r1 % 128
            getInstance = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L_0x00aa
            r1 = 47
            goto L_0x00ab
        L_0x00aa:
            r1 = r6
        L_0x00ab:
            if (r1 == r6) goto L_0x00af
            r8 = r2
            goto L_0x00b0
        L_0x00af:
            r8 = r6
        L_0x00b0:
            r1 = r0 & 9
            r0 = r0 ^ 9
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r9 = r1 | r0
            int r9 = r9 << r7
            r0 = r0 ^ r1
            int r9 = r9 - r0
            int r0 = r9 % 128
            cca_continue = r0
            int r9 = r9 % r6
            goto L_0x0123
        L_0x00c3:
            java.lang.String r1 = "02"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cd
            r0 = r7
            goto L_0x00ce
        L_0x00cd:
            r0 = r5
        L_0x00ce:
            if (r0 == r7) goto L_0x00d1
            goto L_0x0122
        L_0x00d1:
            int r0 = getInstance
            r1 = r0 ^ 55
            r0 = r0 & 55
            int r0 = r0 << r7
            int r1 = r1 + r0
            int r0 = r1 % 128
            cca_continue = r0
            int r1 = r1 % r6
            r1 = r0 & 57
            int r8 = ~r1
            r0 = r0 | 57
            r0 = r0 & r8
            int r1 = r1 << r7
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r0 = r0 - r1
            int r0 = r0 - r7
            int r1 = r0 % 128
            getInstance = r1
            int r0 = r0 % r6
            r8 = r7
            goto L_0x0123
        L_0x00f1:
            java.lang.String r1 = "01"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fb
            r0 = r5
            goto L_0x00fc
        L_0x00fb:
            r0 = r7
        L_0x00fc:
            if (r0 == 0) goto L_0x00ff
            goto L_0x0122
        L_0x00ff:
            int r0 = getInstance
            int r1 = r0 + 86
            r8 = r1 | -1
            int r8 = r8 << r7
            r1 = r1 ^ r4
            int r8 = r8 - r1
            int r1 = r8 % 128
            cca_continue = r1
            int r8 = r8 % r6
            r1 = r0 & 21
            int r8 = ~r1
            r0 = r0 | 21
            r0 = r0 & r8
            int r1 = r1 << r7
            int r1 = -r1
            int r1 = -r1
            r8 = r0 | r1
            int r8 = r8 << r7
            r0 = r0 ^ r1
            int r8 = r8 - r0
            int r0 = r8 % 128
            cca_continue = r0
            int r8 = r8 % r6
            r8 = r3
            goto L_0x0123
        L_0x0122:
            r8 = r4
        L_0x0123:
            r0 = 0
            if (r8 == 0) goto L_0x014e
            if (r8 == r7) goto L_0x0130
            if (r8 == r6) goto L_0x0130
            if (r8 == r3) goto L_0x0130
            if (r8 == r2) goto L_0x0130
            r1 = r0
            goto L_0x0162
        L_0x0130:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r11 = r11.getApplicationContext()
            java.lang.Class<com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView> r2 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeNativeView.class
            r1.<init>(r11, r2)
            int r11 = getInstance
            r2 = r11 ^ 49
            r8 = r11 & 49
            r2 = r2 | r8
            int r2 = r2 << r7
            int r8 = ~r8
            r11 = r11 | 49
            r11 = r11 & r8
            int r2 = r2 - r11
        L_0x0148:
            int r11 = r2 % 128
            cca_continue = r11
            int r2 = r2 % r6
            goto L_0x0162
        L_0x014e:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r11 = r11.getApplicationContext()
            java.lang.Class<com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView> r2 = com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView.class
            r1.<init>(r11, r2)
            int r11 = getInstance
            int r11 = r11 + 26
            r2 = r11 & -1
            r11 = r11 | r4
            int r2 = r2 + r11
            goto L_0x0148
        L_0x0162:
            r11 = 40
            if (r1 == 0) goto L_0x0168
            r2 = r11
            goto L_0x016a
        L_0x0168:
            r2 = 33
        L_0x016a:
            if (r2 == r11) goto L_0x016d
            goto L_0x01b3
        L_0x016d:
            int r11 = getInstance
            r2 = r11 ^ 3
            r8 = r11 & 3
            r2 = r2 | r8
            int r2 = r2 << r7
            int r8 = ~r8
            r11 = r11 | r3
            r11 = r11 & r8
            int r11 = -r11
            r3 = r2 | r11
            int r3 = r3 << r7
            r11 = r11 ^ r2
            int r3 = r3 - r11
            int r11 = r3 % 128
            cca_continue = r11
            int r3 = r3 % r6
            if (r3 != 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r5 = r7
        L_0x0187:
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r3 = "UiCustomization"
            java.lang.String r8 = "StepUpData"
            if (r5 != r7) goto L_0x01c2
            r1.putExtra(r8, r12)
            r1.putExtra(r3, r13)
            android.content.Intent r12 = r1.addFlags(r2)
            r12.addFlags(r11)
            java.lang.ref.WeakReference<android.content.Context> r11 = Cardinal
            java.lang.Object r11 = r11.get()
            android.content.Context r11 = (android.content.Context) r11
            r11.startActivity(r1)
            int r11 = cca_continue
            int r11 = r11 + 92
            int r11 = r11 - r7
            int r12 = r11 % 128
            getInstance = r12
            int r11 = r11 % r6
        L_0x01b3:
            int r11 = cca_continue
            int r11 = r11 + 68
            r12 = r11 ^ -1
            r11 = r11 & r4
            int r11 = r11 << r7
            int r12 = r12 + r11
            int r11 = r12 % 128
            getInstance = r11
            int r12 = r12 % r6
            return
        L_0x01c2:
            r1.putExtra(r8, r12)
            r1.putExtra(r3, r13)
            android.content.Intent r12 = r1.addFlags(r2)
            r12.addFlags(r11)
            java.lang.ref.WeakReference<android.content.Context> r11 = Cardinal
            java.lang.Object r11 = r11.get()
            android.content.Context r11 = (android.content.Context) r11
            r11.startActivity(r1)
            throw r0     // Catch:{ all -> 0x01db }
        L_0x01db:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeUtils.configure(android.content.Context, com.cardinalcommerce.a.setTransitionVisibility, com.cardinalcommerce.shared.userinterfaces.UiCustomization):void");
    }

    public static void getInstance() {
        int i = getInstance;
        int i2 = (((i & -42) | ((~i) & 41)) - (~(-(-((i & 41) << 1))))) - 1;
        cca_continue = i2 % 128;
        if ((i2 % 2 == 0 ? '(' : '?') != '(') {
            if (Cardinal != null) {
                Intent intent = new Intent(ThreeDSStrings.FINISH_ACTIVITY);
                configure = true;
                Cardinal.get().sendBroadcast(intent);
                int i3 = cca_continue;
                int i4 = i3 & 9;
                int i5 = (i3 | 9) & (~i4);
                int i6 = -(-(i4 << 1));
                int i7 = (i5 & i6) + (i5 | i6);
                getInstance = i7 % 128;
                int i8 = i7 % 2;
            }
            int i9 = getInstance;
            int i10 = (i9 & 71) + (i9 | 71);
            cca_continue = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        Throwable th = null;
        super.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if ((!configure ? '#' : 25) != 25) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if ((!configure) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void cca_continue(com.cardinalcommerce.a.setTransitionVisibility r6, android.content.Context r7, com.cardinalcommerce.shared.userinterfaces.UiCustomization r8) {
        /*
            int r0 = cca_continue
            r1 = r0 ^ 97
            r0 = r0 & 97
            r2 = 1
            int r0 = r0 << r2
            int r0 = -r0
            int r0 = -r0
            r3 = r1 | r0
            int r3 = r3 << r2
            r0 = r0 ^ r1
            int r3 = r3 - r0
            int r0 = r3 % 128
            getInstance = r0
            int r3 = r3 % 2
            r0 = 84
            if (r3 == 0) goto L_0x001c
            r1 = 32
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            r3 = 0
            r4 = 0
            if (r1 == r0) goto L_0x0035
            com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r0 = com.cardinalcommerce.a.setLongClickable.cca_continue
            boolean r1 = configure
            r5 = 79
            int r5 = r5 / r4
            r5 = 25
            if (r1 != 0) goto L_0x002f
            r1 = 35
            goto L_0x0030
        L_0x002f:
            r1 = r5
        L_0x0030:
            if (r1 == r5) goto L_0x0136
            goto L_0x0040
        L_0x0033:
            r6 = move-exception
            throw r6
        L_0x0035:
            com.cardinalcommerce.emvco.services.ChallengeStatusReceiver r0 = com.cardinalcommerce.a.setLongClickable.cca_continue
            boolean r1 = configure
            if (r1 != 0) goto L_0x003d
            r1 = r2
            goto L_0x003e
        L_0x003d:
            r1 = r4
        L_0x003e:
            if (r1 == 0) goto L_0x0136
        L_0x0040:
            int r1 = cca_continue
            r5 = r1 & 65
            r1 = r1 | 65
            int r5 = r5 + r1
            int r1 = r5 % 128
            getInstance = r1
            int r5 = r5 % 2
            java.lang.String r1 = r6.CardinalConfigurationParameters()
            java.lang.String r5 = "Y"
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 != 0) goto L_0x005b
            r1 = r4
            goto L_0x005c
        L_0x005b:
            r1 = r2
        L_0x005c:
            if (r1 == r2) goto L_0x00fe
            int r1 = cca_continue
            r5 = r1 | 88
            int r5 = r5 << r2
            r1 = r1 ^ 88
            int r5 = r5 - r1
            int r5 = r5 - r4
            int r5 = r5 - r2
            int r1 = r5 % 128
            getInstance = r1
            int r5 = r5 % 2
            java.lang.String r1 = r6.CardinalConfigurationParameters()
            java.lang.String r5 = "N"
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x007c
            goto L_0x00fe
        L_0x007c:
            java.lang.String r1 = r6.onCReqSuccess()
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0088
            r1 = r2
            goto L_0x0089
        L_0x0088:
            r1 = r4
        L_0x0089:
            if (r1 == r2) goto L_0x00c5
            com.cardinalcommerce.emvco.events.RuntimeErrorEvent r7 = new com.cardinalcommerce.emvco.events.RuntimeErrorEvent
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.CardinalConfigurationParameters()
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = " : "
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "101"
            r7.<init>(r8, r6)
            r0.runtimeError(r7)
            com.cardinalcommerce.a.setLongClickable.cca_continue()
            com.cardinalcommerce.a.setLongClickable.init()
            int r6 = cca_continue
            int r6 = r6 + 37
            int r6 = r6 - r2
            r7 = r6 ^ -1
            r6 = r6 & -1
            int r6 = r6 << r2
            int r7 = r7 + r6
            int r6 = r7 % 128
            getInstance = r6
            int r7 = r7 % 2
            goto L_0x0136
        L_0x00c5:
            int r0 = getInstance
            r1 = r0 ^ 97
            r0 = r0 & 97
            r0 = r0 | r1
            int r0 = r0 << r2
            int r1 = -r1
            r3 = r0 ^ r1
            r0 = r0 & r1
            int r0 = r0 << r2
            int r3 = r3 + r0
            int r0 = r3 % 128
            cca_continue = r0
            int r3 = r3 % 2
            configure(r7, r6, r8)
            int r6 = cca_continue
            r7 = r6 ^ 3
            r6 = r6 & 3
            int r6 = r6 << r2
            r8 = r7 & r6
            r6 = r6 | r7
            int r8 = r8 + r6
            int r6 = r8 % 128
            getInstance = r6
            int r8 = r8 % 2
            r6 = 44
            if (r8 == 0) goto L_0x00f4
            r7 = 76
            goto L_0x00f5
        L_0x00f4:
            r7 = r6
        L_0x00f5:
            if (r7 == r6) goto L_0x00fd
            r6 = 66
            int r6 = r6 / r4
            return
        L_0x00fb:
            r6 = move-exception
            throw r6
        L_0x00fd:
            return
        L_0x00fe:
            com.cardinalcommerce.emvco.events.CompletionEvent r7 = new com.cardinalcommerce.emvco.events.CompletionEvent
            java.lang.String r8 = r6.setChallengeTimeout()
            java.lang.String r6 = r6.CardinalConfigurationParameters()
            r7.<init>(r8, r6)
            getInstance()
            com.cardinalcommerce.a.setLongClickable.cca_continue()
            com.cardinalcommerce.a.setLongClickable.init()
            r0.completed(r7)
            int r6 = getInstance
            r7 = r6 & 41
            r6 = r6 ^ 41
            r6 = r6 | r7
            int r7 = r7 + r6
            int r6 = r7 % 128
            cca_continue = r6
            int r7 = r7 % 2
            r6 = 71
            if (r7 != 0) goto L_0x012c
            r7 = 69
            goto L_0x012d
        L_0x012c:
            r7 = r6
        L_0x012d:
            if (r7 != r6) goto L_0x0130
            return
        L_0x0130:
            super.hashCode()     // Catch:{ all -> 0x0134 }
            throw r3     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r6 = move-exception
            throw r6
        L_0x0136:
            int r6 = cca_continue
            int r6 = r6 + 110
            int r6 = r6 - r2
            int r7 = r6 % 128
            getInstance = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r4 = r2
        L_0x0145:
            if (r4 != r2) goto L_0x0148
            return
        L_0x0148:
            super.hashCode()     // Catch:{ all -> 0x014c }
            throw r3     // Catch:{ all -> 0x014c }
        L_0x014c:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeUtils.cca_continue(com.cardinalcommerce.a.setTransitionVisibility, android.content.Context, com.cardinalcommerce.shared.userinterfaces.UiCustomization):void");
    }
}
