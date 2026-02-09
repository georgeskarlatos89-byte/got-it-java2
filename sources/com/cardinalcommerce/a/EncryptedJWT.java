package com.cardinalcommerce.a;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;

public class EncryptedJWT implements GMCipherSpi.SM2withSha512 {
    private byte[] Cardinal;
    private int cca_continue;
    private byte[] configure;
    private IESCipher.ECIESwithAESCBC getInstance;

    public EncryptedJWT() {
    }

    public static int Cardinal(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    public static void Cardinal(long j, long[] jArr, int i) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i] = j11 & 6148914691236517205L;
        jArr[i + 1] = (j11 >>> 1) & 6148914691236517205L;
    }

    public static int configure(int i) {
        int i2 = i & 255;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        return (i4 | (i4 << 1)) & 21845;
    }

    public static void configure(long j, long[] jArr, int i) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i] = j11 & -6148914691236517206L;
        jArr[i + 1] = (j11 << 1) & -6148914691236517206L;
    }

    public static long getInstance(int i) {
        int i2 = ((i >>> 8) ^ i) & MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        int i3 = i ^ (i2 ^ (i2 << 8));
        int i4 = ((i3 >>> 4) ^ i3) & 15728880;
        int i5 = i3 ^ (i4 ^ (i4 << 4));
        int i6 = ((i5 >>> 2) ^ i5) & 202116108;
        int i7 = i5 ^ (i6 ^ (i6 << 2));
        int i8 = ((i7 >>> 1) ^ i7) & 572662306;
        int i9 = i7 ^ (i8 ^ (i8 << 1));
        return ((((long) (i9 >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) i9));
    }

    public static long getInstance(long j) {
        long j2 = ((j >>> 1) ^ j) & 2459565876494606882L;
        long j3 = j ^ (j2 ^ (j2 << 1));
        long j4 = ((j3 >>> 2) ^ j3) & 868082074056920076L;
        long j5 = j3 ^ (j4 ^ (j4 << 2));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 8) ^ j7) & 280375465148160L;
        long j9 = j7 ^ (j8 ^ (j8 << 8));
        long j10 = ((j9 >>> 16) ^ j9) & 4294901760L;
        return j9 ^ (j10 ^ (j10 << 16));
    }

    public EncryptedJWT(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
        this.cca_continue = 1;
        this.getInstance = eCIESwithAESCBC;
    }

    public final void getInstance(GMCipherSpi.SM2withRMD sM2withRMD) {
        if (sM2withRMD instanceof CipherSpi.OAEPPadding) {
            CipherSpi.OAEPPadding oAEPPadding = (CipherSpi.OAEPPadding) sM2withRMD;
            this.Cardinal = oAEPPadding.Cardinal;
            this.configure = oAEPPadding.getInstance;
        } else if (sM2withRMD instanceof BCRSAPrivateCrtKey) {
            this.Cardinal = ((BCRSAPrivateCrtKey) sM2withRMD).getInstance;
            this.configure = null;
        } else {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
    }

    public final int cca_continue(byte[] bArr, int i, int i2) throws GMSignatureSpi, IllegalArgumentException {
        byte[] bArr2 = bArr;
        int i3 = i2;
        if (bArr2.length - i3 >= 0) {
            long j = (long) i3;
            int instance = this.getInstance.getInstance();
            if (j <= 8589934591L) {
                long j2 = (long) instance;
                int i4 = (int) (((j + j2) - 1) / j2);
                byte[] bArr3 = new byte[this.getInstance.getInstance()];
                byte[] bArr4 = new byte[4];
                setTextFontSize.init(this.cca_continue, bArr4, 0);
                int i5 = this.cca_continue & InputDeviceCompat.SOURCE_ANY;
                int i6 = i3;
                int i7 = i;
                for (int i8 = 0; i8 < i4; i8++) {
                    IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.getInstance;
                    byte[] bArr5 = this.Cardinal;
                    eCIESwithAESCBC.init(bArr5, 0, bArr5.length);
                    this.getInstance.init(bArr4, 0, 4);
                    byte[] bArr6 = this.configure;
                    if (bArr6 != null) {
                        this.getInstance.init(bArr6, 0, bArr6.length);
                    }
                    this.getInstance.init(bArr3, 0);
                    if (i6 > instance) {
                        System.arraycopy(bArr3, 0, bArr2, i7, instance);
                        i7 += instance;
                        i6 -= instance;
                    } else {
                        System.arraycopy(bArr3, 0, bArr2, i7, i6);
                    }
                    byte b = (byte) (bArr4[3] + 1);
                    bArr4[3] = b;
                    if (b == 0) {
                        i5 += 256;
                        setTextFontSize.init(i5, bArr4, 0);
                    }
                }
                this.getInstance.init();
                return (int) j;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("output buffer too small");
    }
}
