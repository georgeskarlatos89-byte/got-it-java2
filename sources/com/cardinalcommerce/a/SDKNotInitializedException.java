package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;

public final class SDKNotInitializedException {
    public SDKRuntimeException[] Cardinal;
    private SDKRuntimeException cca_continue;
    private SDKRuntimeException[] getInstance;
    private DirectoryServerID init;

    public SDKNotInitializedException(DirectoryServerID directoryServerID, SDKRuntimeException sDKRuntimeException) {
        int i;
        int[] iArr;
        this.init = directoryServerID;
        this.cca_continue = sDKRuntimeException;
        int length = sDKRuntimeException.cca_continue.length - 1;
        int i2 = -1;
        length = sDKRuntimeException.cca_continue[length] == 0 ? -1 : length;
        this.getInstance = new SDKRuntimeException[length];
        int i3 = 0;
        while (true) {
            i = length >> 1;
            if (i3 >= i) {
                break;
            }
            int i4 = i3 << 1;
            int[] iArr2 = new int[(i4 + 1)];
            iArr2[i4] = 1;
            this.getInstance[i3] = new SDKRuntimeException(this.init, iArr2);
            i3++;
        }
        while (i < length) {
            int i5 = i << 1;
            int[] iArr3 = new int[(i5 + 1)];
            iArr3[i5] = 1;
            SDKRuntimeException sDKRuntimeException2 = new SDKRuntimeException(this.init, iArr3);
            SDKRuntimeException[] sDKRuntimeExceptionArr = this.getInstance;
            SDKRuntimeException sDKRuntimeException3 = this.cca_continue;
            int[] iArr4 = sDKRuntimeException2.cca_continue;
            int[] iArr5 = sDKRuntimeException3.cca_continue;
            int length2 = iArr5.length - 1;
            while (length2 >= 0 && iArr5[length2] == 0) {
                length2--;
            }
            if (length2 != -1) {
                int length3 = iArr4.length;
                int[] iArr6 = new int[length3];
                int init2 = SDKRuntimeException.init(iArr5);
                DirectoryServerID directoryServerID2 = sDKRuntimeException2.getInstance;
                int instance = directoryServerID2.getInstance(init2, (1 << directoryServerID2.Cardinal) - 2);
                System.arraycopy(iArr4, 0, iArr6, 0, length3);
                while (true) {
                    int length4 = iArr6.length - 1;
                    while (length4 >= 0 && iArr6[length4] == 0) {
                        length4--;
                    }
                    if (length2 > length4) {
                        break;
                    }
                    int instance2 = KeyAgreementSpi.MQVwithSHA1KDF.getInstance(SDKRuntimeException.init(iArr6), instance, sDKRuntimeException2.getInstance.getInstance);
                    int length5 = iArr6.length - 1;
                    while (length5 >= 0 && iArr6[length5] == 0) {
                        length5--;
                    }
                    int i6 = length5 - length2;
                    int length6 = iArr5.length - 1;
                    while (length6 >= 0 && iArr5[length6] == 0) {
                        length6--;
                    }
                    if (length6 == -1) {
                        iArr = new int[1];
                    } else {
                        int[] iArr7 = new int[(length6 + i6 + 1)];
                        System.arraycopy(iArr5, 0, iArr7, i6, length6 + 1);
                        iArr = iArr7;
                    }
                    iArr6 = sDKRuntimeException2.init(sDKRuntimeException2.cca_continue(iArr, instance2), iArr6);
                }
                sDKRuntimeExceptionArr[i] = new SDKRuntimeException(sDKRuntimeException2.getInstance, iArr6);
                i++;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
        SDKRuntimeException sDKRuntimeException4 = this.cca_continue;
        int length7 = sDKRuntimeException4.cca_continue.length - 1;
        i2 = sDKRuntimeException4.cca_continue[length7] != 0 ? length7 : i2;
        SDKRuntimeException[] sDKRuntimeExceptionArr2 = new SDKRuntimeException[i2];
        int i7 = i2 - 1;
        for (int i8 = i7; i8 >= 0; i8--) {
            sDKRuntimeExceptionArr2[i8] = new SDKRuntimeException(this.getInstance[i8]);
        }
        this.Cardinal = new SDKRuntimeException[i2];
        while (i7 >= 0) {
            this.Cardinal[i7] = new SDKRuntimeException(this.init, i7);
            i7--;
        }
        int i9 = 0;
        while (i9 < i2) {
            SDKRuntimeException sDKRuntimeException5 = sDKRuntimeExceptionArr2[i9];
            if (((i9 < 0 || i9 > sDKRuntimeException5.init) ? 0 : sDKRuntimeException5.cca_continue[i9]) == 0) {
                int i10 = i9 + 1;
                boolean z = false;
                while (i10 < i2) {
                    SDKRuntimeException sDKRuntimeException6 = sDKRuntimeExceptionArr2[i10];
                    if (((i9 < 0 || i9 > sDKRuntimeException6.init) ? 0 : sDKRuntimeException6.cca_continue[i9]) != 0) {
                        SDKRuntimeException sDKRuntimeException7 = sDKRuntimeExceptionArr2[i9];
                        sDKRuntimeExceptionArr2[i9] = sDKRuntimeExceptionArr2[i10];
                        sDKRuntimeExceptionArr2[i10] = sDKRuntimeException7;
                        SDKRuntimeException[] sDKRuntimeExceptionArr3 = this.Cardinal;
                        SDKRuntimeException sDKRuntimeException8 = sDKRuntimeExceptionArr3[i9];
                        sDKRuntimeExceptionArr3[i9] = sDKRuntimeExceptionArr3[i10];
                        sDKRuntimeExceptionArr3[i10] = sDKRuntimeException8;
                        z = true;
                        i10 = i2;
                    }
                    i10++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            SDKRuntimeException sDKRuntimeException9 = sDKRuntimeExceptionArr2[i9];
            int i11 = (i9 < 0 || i9 > sDKRuntimeException9.init) ? 0 : sDKRuntimeException9.cca_continue[i9];
            DirectoryServerID directoryServerID3 = this.init;
            int instance3 = directoryServerID3.getInstance(i11, (1 << directoryServerID3.Cardinal) - 2);
            sDKRuntimeExceptionArr2[i9].init(instance3);
            this.Cardinal[i9].init(instance3);
            for (int i12 = 0; i12 < i2; i12++) {
                if (i12 != i9) {
                    SDKRuntimeException sDKRuntimeException10 = sDKRuntimeExceptionArr2[i12];
                    int i13 = (i9 < 0 || i9 > sDKRuntimeException10.init) ? 0 : sDKRuntimeException10.cca_continue[i9];
                    if (i13 != 0) {
                        SDKRuntimeException cca_continue2 = sDKRuntimeExceptionArr2[i9].cca_continue(i13);
                        SDKRuntimeException cca_continue3 = this.Cardinal[i9].cca_continue(i13);
                        SDKRuntimeException sDKRuntimeException11 = sDKRuntimeExceptionArr2[i12];
                        sDKRuntimeException11.cca_continue = sDKRuntimeException11.init(sDKRuntimeException11.cca_continue, cca_continue2.cca_continue);
                        sDKRuntimeException11.configure();
                        SDKRuntimeException sDKRuntimeException12 = this.Cardinal[i12];
                        sDKRuntimeException12.cca_continue = sDKRuntimeException12.init(sDKRuntimeException12.cca_continue, cca_continue3.cca_continue);
                        sDKRuntimeException12.configure();
                    }
                }
            }
            i9++;
        }
    }
}
