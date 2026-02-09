package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class EMVCoError implements Serializable {
    private final Map<Integer, doChallenge> Cardinal = new TreeMap();

    EMVCoError() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    EMVCoError(com.cardinalcommerce.a.setCCAId r25, long r26, byte[] r28, byte[] r29) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r28
            r3 = r29
            r24.<init>()
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            r0.Cardinal = r4
            r6 = 0
        L_0x0014:
            int r8 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1))
            if (r8 >= 0) goto L_0x0106
            com.cardinalcommerce.a.setFocusableInTouchMode r8 = r1.Cardinal
            int r9 = r8.cca_continue
            long r10 = r6 >> r9
            r12 = 1
            long r14 = r12 << r9
            long r14 = r14 - r12
            long r12 = r6 & r14
            int r12 = (int) r12
            com.cardinalcommerce.a.setCCAOnTouchListener$getInstance r13 = new com.cardinalcommerce.a.setCCAOnTouchListener$getInstance
            r13.<init>()
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r13 = r13.getInstance(r10)
            com.cardinalcommerce.a.setCCAOnTouchListener$getInstance r13 = (com.cardinalcommerce.a.setCCAOnTouchListener.getInstance) r13
            r13.getInstance = r12
            com.cardinalcommerce.a.setCCAOnTouchListener r4 = new com.cardinalcommerce.a.setCCAOnTouchListener
            r5 = 0
            r4.<init>(r13, r5)
            r13 = r4
            com.cardinalcommerce.a.setCCAOnTouchListener r13 = (com.cardinalcommerce.a.setCCAOnTouchListener) r13
            r13 = 1
            int r5 = r13 << r9
            int r13 = r5 + -1
            if (r12 >= r13) goto L_0x006a
            r21 = r10
            java.util.Map<java.lang.Integer, com.cardinalcommerce.a.doChallenge> r10 = r0.Cardinal
            r23 = r5
            r11 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            java.lang.Object r5 = r10.get(r5)
            com.cardinalcommerce.a.doChallenge r5 = (com.cardinalcommerce.a.doChallenge) r5
            if (r5 == 0) goto L_0x0058
            if (r12 != 0) goto L_0x0066
        L_0x0058:
            com.cardinalcommerce.a.doChallenge r5 = new com.cardinalcommerce.a.doChallenge
            r5.<init>((com.cardinalcommerce.a.setFocusableInTouchMode) r8, (byte[]) r2, (byte[]) r3, (com.cardinalcommerce.a.setCCAOnTouchListener) r4)
            java.util.Map<java.lang.Integer, com.cardinalcommerce.a.doChallenge> r8 = r0.Cardinal
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r8.put(r10, r5)
        L_0x0066:
            r0.getInstance(r11, r2, r3, r4)
            goto L_0x006e
        L_0x006a:
            r23 = r5
            r21 = r10
        L_0x006e:
            r10 = r21
            r4 = 1
        L_0x0071:
            int r5 = r1.getInstance
            if (r4 >= r5) goto L_0x00ff
            long r2 = r10 & r14
            int r2 = (int) r2
            long r10 = r10 >> r9
            com.cardinalcommerce.a.setCCAOnTouchListener$getInstance r3 = new com.cardinalcommerce.a.setCCAOnTouchListener$getInstance
            r3.<init>()
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r3 = r3.cca_continue(r4)
            com.cardinalcommerce.a.setCCAOnTouchListener$getInstance r3 = (com.cardinalcommerce.a.setCCAOnTouchListener.getInstance) r3
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r3 = r3.getInstance(r10)
            com.cardinalcommerce.a.setCCAOnTouchListener$getInstance r3 = (com.cardinalcommerce.a.setCCAOnTouchListener.getInstance) r3
            r3.getInstance = r2
            com.cardinalcommerce.a.setCCAOnTouchListener r5 = new com.cardinalcommerce.a.setCCAOnTouchListener
            r8 = 0
            r5.<init>(r3, r8)
            r3 = r5
            com.cardinalcommerce.a.setCCAOnTouchListener r3 = (com.cardinalcommerce.a.setCCAOnTouchListener) r3
            if (r2 >= r13) goto L_0x00ed
            r2 = 0
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x00b6
            r16 = 1
            long r18 = r6 + r16
            r20 = r9
            r12 = r23
            double r8 = (double) r12
            double r2 = (double) r4
            double r2 = java.lang.Math.pow(r8, r2)
            long r2 = (long) r2
            long r18 = r18 % r2
            r2 = 0
            int r8 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x00ba
            r8 = 1
            goto L_0x00bb
        L_0x00b6:
            r20 = r9
            r12 = r23
        L_0x00ba:
            r8 = 0
        L_0x00bb:
            if (r8 == 0) goto L_0x00e8
            java.util.Map<java.lang.Integer, com.cardinalcommerce.a.doChallenge> r8 = r0.Cardinal
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.lang.Object r8 = r8.get(r9)
            com.cardinalcommerce.a.doChallenge r8 = (com.cardinalcommerce.a.doChallenge) r8
            if (r8 != 0) goto L_0x00e0
            com.cardinalcommerce.a.doChallenge r8 = new com.cardinalcommerce.a.doChallenge
            com.cardinalcommerce.a.setFocusableInTouchMode r9 = r1.Cardinal
            r2 = r28
            r3 = r29
            r8.<init>((com.cardinalcommerce.a.setFocusableInTouchMode) r9, (byte[]) r2, (byte[]) r3, (com.cardinalcommerce.a.setCCAOnTouchListener) r5)
            java.util.Map<java.lang.Integer, com.cardinalcommerce.a.doChallenge> r9 = r0.Cardinal
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r9.put(r1, r8)
            goto L_0x00e4
        L_0x00e0:
            r2 = r28
            r3 = r29
        L_0x00e4:
            r0.getInstance(r4, r2, r3, r5)
            goto L_0x00f5
        L_0x00e8:
            r2 = r28
            r3 = r29
            goto L_0x00f5
        L_0x00ed:
            r2 = r28
            r3 = r29
            r20 = r9
            r12 = r23
        L_0x00f5:
            int r4 = r4 + 1
            r1 = r25
            r23 = r12
            r9 = r20
            goto L_0x0071
        L_0x00ff:
            r4 = 1
            long r6 = r6 + r4
            r1 = r25
            goto L_0x0014
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.EMVCoError.<init>(com.cardinalcommerce.a.setCCAId, long, byte[], byte[]):void");
    }

    private doChallenge getInstance(int i, byte[] bArr, byte[] bArr2, setCCAOnTouchListener setccaontouchlistener) {
        return this.Cardinal.put(Integer.valueOf(i), new doChallenge(this.Cardinal.get(Integer.valueOf(i)), bArr, bArr2, setccaontouchlistener));
    }

    public final EMVCoError cca_continue(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        EMVCoError eMVCoError = new EMVCoError();
        for (Integer next : this.Cardinal.keySet()) {
            eMVCoError.Cardinal.put(next, new doChallenge(this.Cardinal.get(next), ChallengeUtils.Cardinal(aSN1ObjectIdentifier)));
        }
        return eMVCoError;
    }
}
