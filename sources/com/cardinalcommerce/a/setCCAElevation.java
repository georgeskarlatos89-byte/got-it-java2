package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.setCCAText;

public final class setCCAElevation {
    public BCEdDSAPublicKey Cardinal;
    public int CardinalActionCode;
    public int CardinalChallengeObserver;
    public byte[] CardinalConfigurationParameters;
    public byte[] CardinalEnvironment;
    public byte[] CardinalError;
    public byte[] CardinalRenderType;
    public byte[] CardinalUiType;
    public boolean cca_continue;
    public int cleanup;
    public GMCipherSpi.SM2withSha256 configure;
    public long getActionCode;
    public int getChallengeTimeout;
    public BCECGOST3410_2012PublicKey getInstance;
    public byte[] getSDKVersion;
    public byte[] getString;
    public byte[] getWarnings;
    public boolean init;
    public byte[] onCReqSuccess;
    public byte[] onValidated;
    public long setChallengeTimeout;
    public long setRequestTimeout;
    public byte[] valueOf;
    public byte[] values;

    setCCAElevation() {
    }

    static setId getInstance(setVisibility setvisibility, setElevation setelevation, setCCAText setccatext) {
        int i;
        if (setelevation != null) {
            int i2 = setvisibility.configure.configure;
            byte[][] init2 = setCCAFocusableInTouchMode.init(setelevation.configure);
            setId[] setidArr = new setId[init2.length];
            for (int i3 = 0; i3 < init2.length; i3++) {
                setidArr[i3] = new setId(0, init2[i3]);
            }
            setCCAText.init init3 = (setCCAText.init) ((setCCAText.init) new setCCAText.init().cca_continue(setccatext.configure)).getInstance(setccatext.getWarnings);
            init3.init = setccatext.cca_continue;
            init3.configure = 0;
            init3.Cardinal = setccatext.init;
            setCCAText setccatext2 = new setCCAText((setCCAText.init) init3.init(setccatext.cleanup), (byte) 0);
            while (true) {
                setCCAText setccatext3 = setccatext2;
                if (i2 <= 1) {
                    return setidArr[0];
                }
                int i4 = 0;
                while (true) {
                    i = i2 / 2;
                    if (i4 >= i) {
                        break;
                    }
                    setCCAText.init init4 = (setCCAText.init) ((setCCAText.init) new setCCAText.init().cca_continue(setccatext2.configure)).getInstance(setccatext2.getWarnings);
                    init4.init = setccatext2.cca_continue;
                    init4.configure = setccatext2.getInstance;
                    init4.Cardinal = i4;
                    setCCAText setccatext4 = new setCCAText((setCCAText.init) init4.init(setccatext2.cleanup), (byte) 0);
                    setCCAText setccatext5 = setccatext4;
                    int i5 = i4 * 2;
                    setidArr[i4] = getInstance(setvisibility, setidArr[i5], setidArr[i5 + 1], setccatext4);
                    i4++;
                    setccatext2 = setccatext4;
                }
                if (i2 % 2 == 1) {
                    setidArr[i] = setidArr[i2 - 1];
                }
                i2 = (int) Math.ceil(((double) i2) / 2.0d);
                setCCAText.init init5 = (setCCAText.init) ((setCCAText.init) new setCCAText.init().cca_continue(setccatext2.configure)).getInstance(setccatext2.getWarnings);
                init5.init = setccatext2.cca_continue;
                init5.configure = setccatext2.getInstance + 1;
                init5.Cardinal = setccatext2.init;
                setccatext2 = new setCCAText((setCCAText.init) init5.init(setccatext2.cleanup), (byte) 0);
            }
        } else {
            throw new NullPointerException("publicKey == null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x017f A[LOOP:0: B:30:0x017d->B:31:0x017f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0190 A[LOOP:1: B:32:0x018e->B:33:0x0190, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.cardinalcommerce.a.setId getInstance(com.cardinalcommerce.a.setVisibility r8, com.cardinalcommerce.a.setId r9, com.cardinalcommerce.a.setId r10, com.cardinalcommerce.a.setCCAOnFocusChangeListener r11) {
        /*
            if (r9 == 0) goto L_0x01bf
            if (r10 == 0) goto L_0x01b7
            int r0 = r9.cca_continue
            int r1 = r10.cca_continue
            if (r0 != r1) goto L_0x01af
            byte[] r0 = r8.cca_continue
            r1 = 0
            if (r0 != 0) goto L_0x0011
            r0 = 0
            goto L_0x0019
        L_0x0011:
            int r2 = r0.length
            byte[] r2 = new byte[r2]
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
            r0 = r2
        L_0x0019:
            boolean r2 = r11 instanceof com.cardinalcommerce.a.setCCAText
            if (r2 == 0) goto L_0x0050
            com.cardinalcommerce.a.setCCAText r11 = (com.cardinalcommerce.a.setCCAText) r11
            com.cardinalcommerce.a.setCCAText$init r2 = new com.cardinalcommerce.a.setCCAText$init
            r2.<init>()
            int r3 = r11.configure
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r2 = r2.cca_continue(r3)
            com.cardinalcommerce.a.setCCAText$init r2 = (com.cardinalcommerce.a.setCCAText.init) r2
            long r3 = r11.getWarnings
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r2 = r2.getInstance(r3)
            com.cardinalcommerce.a.setCCAText$init r2 = (com.cardinalcommerce.a.setCCAText.init) r2
            int r3 = r11.cca_continue
            r2.init = r3
            int r3 = r11.getInstance
            r2.configure = r3
            int r11 = r11.init
            r2.Cardinal = r11
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r11 = r2.init(r1)
            com.cardinalcommerce.a.setCCAText$init r11 = (com.cardinalcommerce.a.setCCAText.init) r11
            com.cardinalcommerce.a.setCCAText r2 = new com.cardinalcommerce.a.setCCAText
            r2.<init>(r11, r1)
            r11 = r2
            com.cardinalcommerce.a.setCCAText r11 = (com.cardinalcommerce.a.setCCAText) r11
        L_0x004e:
            r11 = r2
            goto L_0x0082
        L_0x0050:
            boolean r2 = r11 instanceof com.cardinalcommerce.a.ChallengeNativeView
            if (r2 == 0) goto L_0x0082
            com.cardinalcommerce.a.ChallengeNativeView r11 = (com.cardinalcommerce.a.ChallengeNativeView) r11
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r2 = new com.cardinalcommerce.a.ChallengeNativeView$cca_continue
            r2.<init>()
            int r3 = r11.configure
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r2 = r2.cca_continue(r3)
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r2 = (com.cardinalcommerce.a.ChallengeNativeView.cca_continue) r2
            long r3 = r11.getWarnings
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r2 = r2.getInstance(r3)
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r2 = (com.cardinalcommerce.a.ChallengeNativeView.cca_continue) r2
            int r3 = r11.cca_continue
            r2.init = r3
            int r11 = r11.Cardinal
            r2.cca_continue = r11
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r11 = r2.init(r1)
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r11 = (com.cardinalcommerce.a.ChallengeNativeView.cca_continue) r11
            com.cardinalcommerce.a.ChallengeNativeView r2 = new com.cardinalcommerce.a.ChallengeNativeView
            r2.<init>(r11, r1)
            r11 = r2
            com.cardinalcommerce.a.ChallengeNativeView r11 = (com.cardinalcommerce.a.ChallengeNativeView) r11
            goto L_0x004e
        L_0x0082:
            com.cardinalcommerce.a.setCCAOnClickListener r2 = r8.init
            byte[] r3 = r11.Cardinal()
            byte[] r2 = r2.init(r0, r3)
            boolean r3 = r11 instanceof com.cardinalcommerce.a.setCCAText
            r4 = 1
            if (r3 == 0) goto L_0x00c4
            com.cardinalcommerce.a.setCCAText r11 = (com.cardinalcommerce.a.setCCAText) r11
            com.cardinalcommerce.a.setCCAText$init r3 = new com.cardinalcommerce.a.setCCAText$init
            r3.<init>()
            int r5 = r11.configure
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r3 = r3.cca_continue(r5)
            com.cardinalcommerce.a.setCCAText$init r3 = (com.cardinalcommerce.a.setCCAText.init) r3
            long r5 = r11.getWarnings
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r3 = r3.getInstance(r5)
            com.cardinalcommerce.a.setCCAText$init r3 = (com.cardinalcommerce.a.setCCAText.init) r3
            int r5 = r11.cca_continue
            r3.init = r5
            int r5 = r11.getInstance
            r3.configure = r5
            int r11 = r11.init
            r3.Cardinal = r11
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r11 = r3.init(r4)
            com.cardinalcommerce.a.setCCAText$init r11 = (com.cardinalcommerce.a.setCCAText.init) r11
            com.cardinalcommerce.a.setCCAText r3 = new com.cardinalcommerce.a.setCCAText
            r3.<init>(r11, r1)
            r11 = r3
            com.cardinalcommerce.a.setCCAText r11 = (com.cardinalcommerce.a.setCCAText) r11
        L_0x00c2:
            r11 = r3
            goto L_0x00f6
        L_0x00c4:
            boolean r3 = r11 instanceof com.cardinalcommerce.a.ChallengeNativeView
            if (r3 == 0) goto L_0x00f6
            com.cardinalcommerce.a.ChallengeNativeView r11 = (com.cardinalcommerce.a.ChallengeNativeView) r11
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r3 = new com.cardinalcommerce.a.ChallengeNativeView$cca_continue
            r3.<init>()
            int r5 = r11.configure
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r3 = r3.cca_continue(r5)
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r3 = (com.cardinalcommerce.a.ChallengeNativeView.cca_continue) r3
            long r5 = r11.getWarnings
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r3 = r3.getInstance(r5)
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r3 = (com.cardinalcommerce.a.ChallengeNativeView.cca_continue) r3
            int r5 = r11.cca_continue
            r3.init = r5
            int r11 = r11.Cardinal
            r3.cca_continue = r11
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r11 = r3.init(r4)
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r11 = (com.cardinalcommerce.a.ChallengeNativeView.cca_continue) r11
            com.cardinalcommerce.a.ChallengeNativeView r3 = new com.cardinalcommerce.a.ChallengeNativeView
            r3.<init>(r11, r1)
            r11 = r3
            com.cardinalcommerce.a.ChallengeNativeView r11 = (com.cardinalcommerce.a.ChallengeNativeView) r11
            goto L_0x00c2
        L_0x00f6:
            com.cardinalcommerce.a.setCCAOnClickListener r3 = r8.init
            byte[] r4 = r11.Cardinal()
            byte[] r3 = r3.init(r0, r4)
            boolean r4 = r11 instanceof com.cardinalcommerce.a.setCCAText
            r5 = 2
            if (r4 == 0) goto L_0x0138
            com.cardinalcommerce.a.setCCAText r11 = (com.cardinalcommerce.a.setCCAText) r11
            com.cardinalcommerce.a.setCCAText$init r4 = new com.cardinalcommerce.a.setCCAText$init
            r4.<init>()
            int r6 = r11.configure
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r4 = r4.cca_continue(r6)
            com.cardinalcommerce.a.setCCAText$init r4 = (com.cardinalcommerce.a.setCCAText.init) r4
            long r6 = r11.getWarnings
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r4 = r4.getInstance(r6)
            com.cardinalcommerce.a.setCCAText$init r4 = (com.cardinalcommerce.a.setCCAText.init) r4
            int r6 = r11.cca_continue
            r4.init = r6
            int r6 = r11.getInstance
            r4.configure = r6
            int r11 = r11.init
            r4.Cardinal = r11
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r11 = r4.init(r5)
            com.cardinalcommerce.a.setCCAText$init r11 = (com.cardinalcommerce.a.setCCAText.init) r11
            com.cardinalcommerce.a.setCCAText r4 = new com.cardinalcommerce.a.setCCAText
            r4.<init>(r11, r1)
            r11 = r4
            com.cardinalcommerce.a.setCCAText r11 = (com.cardinalcommerce.a.setCCAText) r11
        L_0x0136:
            r11 = r4
            goto L_0x016a
        L_0x0138:
            boolean r4 = r11 instanceof com.cardinalcommerce.a.ChallengeNativeView
            if (r4 == 0) goto L_0x016a
            com.cardinalcommerce.a.ChallengeNativeView r11 = (com.cardinalcommerce.a.ChallengeNativeView) r11
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r4 = new com.cardinalcommerce.a.ChallengeNativeView$cca_continue
            r4.<init>()
            int r6 = r11.configure
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r4 = r4.cca_continue(r6)
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r4 = (com.cardinalcommerce.a.ChallengeNativeView.cca_continue) r4
            long r6 = r11.getWarnings
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r4 = r4.getInstance(r6)
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r4 = (com.cardinalcommerce.a.ChallengeNativeView.cca_continue) r4
            int r6 = r11.cca_continue
            r4.init = r6
            int r11 = r11.Cardinal
            r4.cca_continue = r11
            com.cardinalcommerce.a.setCCAOnFocusChangeListener$init r11 = r4.init(r5)
            com.cardinalcommerce.a.ChallengeNativeView$cca_continue r11 = (com.cardinalcommerce.a.ChallengeNativeView.cca_continue) r11
            com.cardinalcommerce.a.ChallengeNativeView r4 = new com.cardinalcommerce.a.ChallengeNativeView
            r4.<init>(r11, r1)
            r11 = r4
            com.cardinalcommerce.a.ChallengeNativeView r11 = (com.cardinalcommerce.a.ChallengeNativeView) r11
            goto L_0x0136
        L_0x016a:
            com.cardinalcommerce.a.setCCAOnClickListener r4 = r8.init
            byte[] r11 = r11.Cardinal()
            byte[] r11 = r4.init(r0, r11)
            com.cardinalcommerce.a.setCheckState r0 = r8.configure
            int r0 = r0.getInstance
            int r4 = r0 * 2
            byte[] r4 = new byte[r4]
            r5 = r1
        L_0x017d:
            if (r5 >= r0) goto L_0x018e
            byte[] r6 = r9.cca_continue()
            byte r6 = r6[r5]
            byte r7 = r3[r5]
            r6 = r6 ^ r7
            byte r6 = (byte) r6
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x017d
        L_0x018e:
            if (r1 >= r0) goto L_0x01a1
            int r3 = r1 + r0
            byte[] r5 = r10.cca_continue()
            byte r5 = r5[r1]
            byte r6 = r11[r1]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r4[r3] = r5
            int r1 = r1 + 1
            goto L_0x018e
        L_0x01a1:
            com.cardinalcommerce.a.setCCAOnClickListener r8 = r8.init
            byte[] r8 = r8.Cardinal(r2, r4)
            com.cardinalcommerce.a.setId r10 = new com.cardinalcommerce.a.setId
            int r9 = r9.cca_continue
            r10.<init>(r9, r8)
            return r10
        L_0x01af:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "height of both nodes must be equal"
            r8.<init>(r9)
            throw r8
        L_0x01b7:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "right == null"
            r8.<init>(r9)
            throw r8
        L_0x01bf:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "left == null"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setCCAElevation.getInstance(com.cardinalcommerce.a.setVisibility, com.cardinalcommerce.a.setId, com.cardinalcommerce.a.setId, com.cardinalcommerce.a.setCCAOnFocusChangeListener):com.cardinalcommerce.a.setId");
    }

    public setCCAElevation(GMCipherSpi.SM2withSha256 sM2withSha256) {
        this(sM2withSha256, (BCEdDSAPublicKey) null);
    }

    private setCCAElevation(GMCipherSpi.SM2withSha256 sM2withSha256, BCEdDSAPublicKey bCEdDSAPublicKey) {
        if (sM2withSha256.getInstance() == 16) {
            bCEdDSAPublicKey = bCEdDSAPublicKey == null ? new KeyAgreementSpi.ECVKO256() : bCEdDSAPublicKey;
            this.configure = sM2withSha256;
            this.Cardinal = bCEdDSAPublicKey;
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    public final int init(int i) {
        int i2 = i + this.CardinalChallengeObserver;
        if (this.init) {
            return i2 + this.cleanup;
        }
        int i3 = this.cleanup;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    public final void Cardinal(byte[] bArr, int i) {
        configure();
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr2 = this.CardinalConfigurationParameters;
            int i3 = this.getChallengeTimeout;
            bArr2[i3] = bArr[i2];
            int i4 = i3 + 1;
            this.getChallengeTimeout = i4;
            if (i4 == 16) {
                byte[] bArr3 = this.valueOf;
                KeyAgreementSpi.ECVKO512.cca_continue(bArr3, bArr2);
                this.Cardinal.getInstance(bArr3);
                this.getChallengeTimeout = 0;
                this.setRequestTimeout += 16;
            }
        }
    }

    private void Cardinal() {
        if (this.setRequestTimeout > 0) {
            System.arraycopy(this.valueOf, 0, this.getString, 0, 16);
            this.setChallengeTimeout = this.setRequestTimeout;
        }
        int i = this.getChallengeTimeout;
        if (i > 0) {
            byte[] bArr = this.getString;
            byte[] bArr2 = this.CardinalConfigurationParameters;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i + 0]);
            }
            this.Cardinal.getInstance(bArr);
            this.setChallengeTimeout += (long) this.getChallengeTimeout;
        }
        if (this.setChallengeTimeout > 0) {
            System.arraycopy(this.getString, 0, this.CardinalEnvironment, 0, 16);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032 A[LOOP:1: B:12:0x0030->B:13:0x0032, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int cca_continue(byte[] r7, int r8, int r9, byte[] r10) throws com.cardinalcommerce.a.GMSignatureSpi {
        /*
            r6 = this;
            r6.configure()
            int r0 = r7.length
            if (r0 < r9) goto L_0x006d
            boolean r0 = r6.init
            r1 = 16
            r2 = 0
            if (r0 == 0) goto L_0x0046
            int r0 = r6.CardinalChallengeObserver
            if (r0 == 0) goto L_0x002f
        L_0x0011:
            if (r9 <= 0) goto L_0x002f
            int r9 = r9 + -1
            byte[] r0 = r6.CardinalError
            int r3 = r6.CardinalChallengeObserver
            int r4 = r8 + 1
            byte r8 = r7[r8]
            r0[r3] = r8
            int r3 = r3 + 1
            r6.CardinalChallengeObserver = r3
            if (r3 != r1) goto L_0x002d
            r6.init(r0, r2, r10, r2)
            r6.CardinalChallengeObserver = r2
            r0 = r1
            r8 = r4
            goto L_0x0030
        L_0x002d:
            r8 = r4
            goto L_0x0011
        L_0x002f:
            r0 = r2
        L_0x0030:
            if (r9 < r1) goto L_0x003c
            r6.init(r7, r8, r10, r0)
            int r8 = r8 + 16
            int r9 = r9 + -16
            int r0 = r0 + 16
            goto L_0x0030
        L_0x003c:
            if (r9 <= 0) goto L_0x006c
            byte[] r10 = r6.CardinalError
            java.lang.System.arraycopy(r7, r8, r10, r2, r9)
            r6.CardinalChallengeObserver = r9
            goto L_0x006c
        L_0x0046:
            r8 = r2
            r0 = r8
        L_0x0048:
            if (r8 >= r9) goto L_0x006c
            byte[] r3 = r6.CardinalError
            int r4 = r6.CardinalChallengeObserver
            byte r5 = r7[r8]
            r3[r4] = r5
            int r4 = r4 + 1
            r6.CardinalChallengeObserver = r4
            int r5 = r3.length
            if (r4 != r5) goto L_0x0069
            r6.init(r3, r2, r10, r0)
            byte[] r3 = r6.CardinalError
            int r4 = r6.cleanup
            java.lang.System.arraycopy(r3, r1, r3, r2, r4)
            int r3 = r6.cleanup
            r6.CardinalChallengeObserver = r3
            int r0 = r0 + 16
        L_0x0069:
            int r8 = r8 + 1
            goto L_0x0048
        L_0x006c:
            return r0
        L_0x006d:
            com.cardinalcommerce.a.GMSignatureSpi r7 = new com.cardinalcommerce.a.GMSignatureSpi
            java.lang.String r8 = "Input buffer too short"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.setCCAElevation.cca_continue(byte[], int, int, byte[]):int");
    }

    public final int init(byte[] bArr, int i) throws IllegalStateException, KeyAgreementSpi.AnonymousClass1 {
        byte[] bArr2;
        byte[] bArr3 = bArr;
        int i2 = i;
        configure();
        if (this.getActionCode == 0) {
            Cardinal();
        }
        int i3 = this.CardinalChallengeObserver;
        if (!this.init) {
            int i4 = this.cleanup;
            if (i3 >= i4) {
                i3 -= i4;
                if (bArr3.length - i2 < i3) {
                    throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("Output buffer too short");
                }
            } else {
                throw new KeyAgreementSpi.AnonymousClass1("data too short");
            }
        } else if (bArr3.length - i2 < this.cleanup + i3) {
            throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("Output buffer too short");
        }
        if (i3 > 0) {
            byte[] bArr4 = this.CardinalError;
            byte[] bArr5 = new byte[16];
            init(bArr5);
            if (!this.init) {
                byte[] bArr6 = this.CardinalEnvironment;
                int i5 = i3;
                while (true) {
                    i5--;
                    if (i5 < 0) {
                        break;
                    }
                    bArr6[i5] = (byte) (bArr6[i5] ^ bArr4[i5 + 0]);
                }
                this.Cardinal.getInstance(bArr6);
                int i6 = i3;
                while (true) {
                    i6--;
                    if (i6 < 0) {
                        break;
                    }
                    int i7 = i6 + 0;
                    bArr4[i7] = (byte) (bArr4[i7] ^ bArr5[i6]);
                }
            } else {
                int i8 = i3;
                while (true) {
                    i8--;
                    if (i8 < 0) {
                        break;
                    }
                    int i9 = i8 + 0;
                    bArr4[i9] = (byte) (bArr4[i9] ^ bArr5[i8]);
                }
                byte[] bArr7 = this.CardinalEnvironment;
                int i10 = i3;
                while (true) {
                    i10--;
                    if (i10 < 0) {
                        break;
                    }
                    bArr7[i10] = (byte) (bArr7[i10] ^ bArr4[i10 + 0]);
                }
                this.Cardinal.getInstance(bArr7);
            }
            System.arraycopy(bArr4, 0, bArr3, i2, i3);
            this.getActionCode += (long) i3;
        }
        long j = this.setRequestTimeout;
        int i11 = this.getChallengeTimeout;
        long j2 = j + ((long) i11);
        this.setRequestTimeout = j2;
        if (j2 > this.setChallengeTimeout) {
            if (i11 > 0) {
                byte[] bArr8 = this.valueOf;
                byte[] bArr9 = this.CardinalConfigurationParameters;
                while (true) {
                    i11--;
                    if (i11 < 0) {
                        break;
                    }
                    bArr8[i11] = (byte) (bArr8[i11] ^ bArr9[i11 + 0]);
                }
                this.Cardinal.getInstance(bArr8);
            }
            if (this.setChallengeTimeout > 0) {
                KeyAgreementSpi.ECVKO512.cca_continue(this.valueOf, this.getString);
            }
            long j3 = ((this.getActionCode << 3) + 127) >>> 7;
            byte[] bArr10 = new byte[16];
            if (this.getInstance == null) {
                ECGOST2012SignatureSpi256 eCGOST2012SignatureSpi256 = new ECGOST2012SignatureSpi256();
                this.getInstance = eCGOST2012SignatureSpi256;
                eCGOST2012SignatureSpi256.getInstance(this.onCReqSuccess);
            }
            this.getInstance.cca_continue(j3, bArr10);
            byte[] bArr11 = this.valueOf;
            long[] init2 = KeyAgreementSpi.ECVKO512.init(bArr11);
            KeyAgreementSpi.ECVKO512.configure(init2, KeyAgreementSpi.ECVKO512.init(bArr10));
            int i12 = 0;
            int i13 = 0;
            while (i12 < init2.length) {
                long j4 = init2[i12];
                setTextFontSize.init((int) (j4 >>> 32), bArr11, i13);
                setTextFontSize.init((int) j4, bArr11, i13 + 4);
                i13 += 8;
                i12++;
                init2 = init2;
            }
            KeyAgreementSpi.ECVKO512.cca_continue(this.CardinalEnvironment, this.valueOf);
        }
        byte[] bArr12 = new byte[16];
        long j5 = this.setRequestTimeout << 3;
        setTextFontSize.init((int) (j5 >>> 32), bArr12, 0);
        setTextFontSize.init((int) j5, bArr12, 4);
        long j6 = this.getActionCode << 3;
        setTextFontSize.init((int) (j6 >>> 32), bArr12, 8);
        setTextFontSize.init((int) j6, bArr12, 12);
        byte[] bArr13 = this.CardinalEnvironment;
        KeyAgreementSpi.ECVKO512.cca_continue(bArr13, bArr12);
        this.Cardinal.getInstance(bArr13);
        byte[] bArr14 = new byte[16];
        this.configure.Cardinal(this.values, 0, bArr14, 0);
        KeyAgreementSpi.ECVKO512.cca_continue(bArr14, this.CardinalEnvironment);
        int i14 = this.cleanup;
        byte[] bArr15 = new byte[i14];
        this.CardinalRenderType = bArr15;
        System.arraycopy(bArr14, 0, bArr15, 0, i14);
        if (this.init) {
            System.arraycopy(this.CardinalRenderType, 0, bArr3, i2 + this.CardinalChallengeObserver, this.cleanup);
            i3 += this.cleanup;
        } else {
            int i15 = this.cleanup;
            byte[] bArr16 = new byte[i15];
            System.arraycopy(this.CardinalError, i3, bArr16, 0, i15);
            if (!getBackgroundColor.init(this.CardinalRenderType, bArr16)) {
                throw new KeyAgreementSpi.AnonymousClass1("mac check in GCM failed");
            }
        }
        this.configure.Cardinal();
        this.CardinalEnvironment = new byte[16];
        this.valueOf = new byte[16];
        this.getString = new byte[16];
        this.CardinalConfigurationParameters = new byte[16];
        this.getChallengeTimeout = 0;
        this.setRequestTimeout = 0;
        this.setChallengeTimeout = 0;
        byte[] bArr17 = this.values;
        if (bArr17 == null) {
            bArr2 = null;
        } else {
            byte[] bArr18 = new byte[bArr17.length];
            System.arraycopy(bArr17, 0, bArr18, 0, bArr17.length);
            bArr2 = bArr18;
        }
        this.CardinalUiType = bArr2;
        this.CardinalActionCode = -2;
        this.CardinalChallengeObserver = 0;
        this.getActionCode = 0;
        byte[] bArr19 = this.CardinalError;
        if (bArr19 != null) {
            for (int i16 = 0; i16 < bArr19.length; i16++) {
                bArr19[i16] = 0;
            }
        }
        if (this.init) {
            this.cca_continue = false;
        } else {
            byte[] bArr20 = this.getSDKVersion;
            if (bArr20 != null) {
                Cardinal(bArr20, bArr20.length);
            }
        }
        return i3;
    }

    private void init(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 >= 16) {
            if (this.getActionCode == 0) {
                Cardinal();
            }
            byte[] bArr3 = new byte[16];
            init(bArr3);
            if (this.init) {
                KeyAgreementSpi.ECVKO512.init(bArr3, bArr, i);
                byte[] bArr4 = this.CardinalEnvironment;
                KeyAgreementSpi.ECVKO512.cca_continue(bArr4, bArr3);
                this.Cardinal.getInstance(bArr4);
                System.arraycopy(bArr3, 0, bArr2, i2, 16);
            } else {
                byte[] bArr5 = this.CardinalEnvironment;
                KeyAgreementSpi.ECVKO512.init(bArr5, bArr, i);
                this.Cardinal.getInstance(bArr5);
                KeyAgreementSpi.ECVKO512.Cardinal(bArr3, bArr, i, bArr2, i2);
            }
            this.getActionCode += 16;
            return;
        }
        throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("Output buffer too short");
    }

    private void init(byte[] bArr) {
        int i = this.CardinalActionCode;
        if (i != 0) {
            this.CardinalActionCode = i - 1;
            byte[] bArr2 = this.CardinalUiType;
            int i2 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i2;
            int i3 = (i2 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i3;
            int i4 = (i3 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i4;
            bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
            this.configure.Cardinal(bArr2, 0, bArr, 0);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    private void configure() {
        if (this.cca_continue) {
            return;
        }
        if (this.init) {
            throw new IllegalStateException("GCM cipher cannot be reused for encryption");
        }
        throw new IllegalStateException("GCM cipher needs to be initialised");
    }
}
