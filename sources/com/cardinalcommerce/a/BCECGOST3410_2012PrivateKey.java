package com.cardinalcommerce.a;

import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import java.util.Hashtable;

public final class BCECGOST3410_2012PrivateKey implements KeyAgreementSpi.CDHwithSHA384KDFAndSharedInfo {
    private static Hashtable getWarnings;
    private setBackgroundColor Cardinal;
    public int cca_continue;
    private byte[] cleanup;
    private setBackgroundColor configure;
    public IESCipher.ECIESwithAESCBC getInstance;
    private int init;
    private byte[] onCReqSuccess;

    private BCECGOST3410_2012PrivateKey(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, int i) {
        this.getInstance = eCIESwithAESCBC;
        int instance = eCIESwithAESCBC.getInstance();
        this.cca_continue = instance;
        this.init = i;
        this.onCReqSuccess = new byte[i];
        this.cleanup = new byte[(i + instance)];
    }

    public final int getInstance() {
        return this.cca_continue;
    }

    public final int getInstance(byte[] bArr) {
        this.getInstance.init(this.cleanup, this.init);
        setBackgroundColor setbackgroundcolor = this.configure;
        if (setbackgroundcolor != null) {
            ((setBackgroundColor) this.getInstance).cca_continue(setbackgroundcolor);
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.getInstance;
            eCIESwithAESCBC.init(this.cleanup, this.init, eCIESwithAESCBC.getInstance());
        } else {
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC2 = this.getInstance;
            byte[] bArr2 = this.cleanup;
            eCIESwithAESCBC2.init(bArr2, 0, bArr2.length);
        }
        int init2 = this.getInstance.init(bArr, 0);
        int i = this.init;
        while (true) {
            byte[] bArr3 = this.cleanup;
            if (i >= bArr3.length) {
                break;
            }
            bArr3[i] = 0;
            i++;
        }
        setBackgroundColor setbackgroundcolor2 = this.Cardinal;
        if (setbackgroundcolor2 != null) {
            ((setBackgroundColor) this.getInstance).cca_continue(setbackgroundcolor2);
        } else {
            IESCipher.ECIESwithAESCBC eCIESwithAESCBC3 = this.getInstance;
            byte[] bArr4 = this.onCReqSuccess;
            eCIESwithAESCBC3.init(bArr4, 0, bArr4.length);
        }
        return init2;
    }

    public final void getInstance(byte[] bArr, int i, int i2) {
        this.getInstance.init(bArr, i, i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BCECGOST3410_2012PrivateKey(com.cardinalcommerce.a.IESCipher.ECIESwithAESCBC r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.cardinalcommerce.a.IESCipher.ECIESwithDESedeCBC
            if (r0 == 0) goto L_0x000c
            r0 = r4
            com.cardinalcommerce.a.IESCipher$ECIESwithDESedeCBC r0 = (com.cardinalcommerce.a.IESCipher.ECIESwithDESedeCBC) r0
            int r0 = r0.cca_continue()
            goto L_0x001e
        L_0x000c:
            java.util.Hashtable r0 = getWarnings
            java.lang.String r1 = r4.configure()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0022
            int r0 = r0.intValue()
        L_0x001e:
            r3.<init>(r4, r0)
            return
        L_0x0022:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unknown digest passed: "
            r1.<init>(r2)
            java.lang.String r4 = r4.configure()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.BCECGOST3410_2012PrivateKey.<init>(com.cardinalcommerce.a.IESCipher$ECIESwithAESCBC):void");
    }

    public final void configure(GMCipherSpi.SM2withRMD sM2withRMD) {
        byte[] bArr;
        this.getInstance.init();
        byte[] bArr2 = ((CipherSpi.ISO9796d1Padding) sM2withRMD).getInstance;
        int length = bArr2.length;
        if (length > this.init) {
            this.getInstance.init(bArr2, 0, length);
            this.getInstance.init(this.onCReqSuccess, 0);
            length = this.cca_continue;
        } else {
            System.arraycopy(bArr2, 0, this.onCReqSuccess, 0, length);
        }
        while (true) {
            bArr = this.onCReqSuccess;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.cleanup, 0, this.init);
        byte[] bArr3 = this.onCReqSuccess;
        int i = this.init;
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ 54);
        }
        byte[] bArr4 = this.cleanup;
        int i3 = this.init;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr4[i4] = (byte) (bArr4[i4] ^ 92);
        }
        IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.getInstance;
        if (eCIESwithAESCBC instanceof setBackgroundColor) {
            setBackgroundColor Cardinal2 = ((setBackgroundColor) eCIESwithAESCBC).Cardinal();
            this.configure = Cardinal2;
            ((IESCipher.ECIESwithAESCBC) Cardinal2).init(this.cleanup, 0, this.init);
        }
        IESCipher.ECIESwithAESCBC eCIESwithAESCBC2 = this.getInstance;
        byte[] bArr5 = this.onCReqSuccess;
        eCIESwithAESCBC2.init(bArr5, 0, bArr5.length);
        IESCipher.ECIESwithAESCBC eCIESwithAESCBC3 = this.getInstance;
        if (eCIESwithAESCBC3 instanceof setBackgroundColor) {
            this.Cardinal = ((setBackgroundColor) eCIESwithAESCBC3).Cardinal();
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        getWarnings = hashtable;
        hashtable.put("GOST3411", 32);
        getWarnings.put("MD2", 16);
        getWarnings.put("MD4", 64);
        getWarnings.put("MD5", 64);
        getWarnings.put("RIPEMD128", 64);
        getWarnings.put("RIPEMD160", 64);
        getWarnings.put("SHA-1", 64);
        getWarnings.put("SHA-224", 64);
        getWarnings.put("SHA-256", 64);
        getWarnings.put("SHA-384", 128);
        getWarnings.put("SHA-512", 128);
        getWarnings.put("Tiger", 64);
        getWarnings.put("Whirlpool", 64);
    }
}
