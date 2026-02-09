package com.cardinalcommerce.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public final class setButtonDrawable extends setCCAVisibility {
    public final setCCAId Cardinal;
    private final byte[] cca_continue;
    private final byte[] cleanup;
    private final byte[] configure;
    private final long init;
    private final EMVCoError onCReqSuccess;
    private final byte[] onValidated;

    public static class configure {
        public byte[] Cardinal = null;
        public long cca_continue = 0;
        public byte[] cleanup = null;
        public byte[] configure = null;
        public byte[] getInstance = null;
        setFocusableInTouchMode getSDKVersion = null;
        public EMVCoError getWarnings = null;
        final setCCAId init;
        byte[] onValidated = null;

        public configure(setCCAId setccaid) {
            this.init = setccaid;
        }
    }

    public /* synthetic */ setButtonDrawable(configure configure2, byte b) {
        this(configure2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private setButtonDrawable(configure configure2) {
        super(true, configure2.init.init().configure());
        boolean z = true;
        setCCAId setccaid = configure2.init;
        this.Cardinal = setccaid;
        if (setccaid != null) {
            int i = setccaid.Cardinal.getInstance.configure.getInstance;
            byte[] bArr = configure2.onValidated;
            if (bArr == null) {
                this.init = configure2.cca_continue;
                byte[] bArr2 = configure2.getInstance;
                if (bArr2 == null) {
                    this.configure = new byte[i];
                } else if (bArr2.length == i) {
                    this.configure = bArr2;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] bArr3 = configure2.configure;
                if (bArr3 == null) {
                    this.cca_continue = new byte[i];
                } else if (bArr3.length == i) {
                    this.cca_continue = bArr3;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] bArr4 = configure2.Cardinal;
                if (bArr4 == null) {
                    this.onValidated = new byte[i];
                } else if (bArr4.length == i) {
                    this.onValidated = bArr4;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] bArr5 = configure2.cleanup;
                if (bArr5 == null) {
                    this.cleanup = new byte[i];
                } else if (bArr5.length == i) {
                    this.cleanup = bArr5;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                EMVCoError eMVCoError = configure2.getWarnings;
                if (eMVCoError != null) {
                    this.onCReqSuccess = eMVCoError;
                    return;
                }
                long j = configure2.cca_continue;
                int i2 = setccaid.configure;
                if (j >= 0) {
                    if (!(j >= (1 << i2) ? false : z) || bArr4 == null || bArr2 == null) {
                        this.onCReqSuccess = new EMVCoError();
                    } else {
                        this.onCReqSuccess = new EMVCoError(setccaid, configure2.cca_continue, bArr4, bArr2);
                    }
                } else {
                    throw new IllegalStateException("index must not be negative");
                }
            } else if (configure2.getSDKVersion != null) {
                int i3 = setccaid.configure;
                int i4 = (i3 + 7) / 8;
                long cca_continue2 = setCCAFocusableInTouchMode.cca_continue(bArr, i4);
                this.init = cca_continue2;
                if (cca_continue2 >= 0) {
                    if (cca_continue2 >= (1 << i3) ? false : z) {
                        this.configure = setCCAFocusableInTouchMode.configure(bArr, i4, i);
                        int i5 = i4 + i;
                        this.cca_continue = setCCAFocusableInTouchMode.configure(bArr, i5, i);
                        int i6 = i5 + i;
                        this.onValidated = setCCAFocusableInTouchMode.configure(bArr, i6, i);
                        int i7 = i6 + i;
                        this.cleanup = setCCAFocusableInTouchMode.configure(bArr, i7, i);
                        int i8 = i7 + i;
                        try {
                            this.onCReqSuccess = ((EMVCoError) setCCAFocusableInTouchMode.cca_continue(setCCAFocusableInTouchMode.configure(bArr, i8, bArr.length - i8), EMVCoError.class)).cca_continue(ChallengeUtils.cca_continue(configure2.getSDKVersion.getInstance.configure.cca_continue.configure()));
                        } catch (IOException e) {
                            throw new IllegalArgumentException(e.getMessage(), e);
                        } catch (ClassNotFoundException e2) {
                            throw new IllegalArgumentException(e2.getMessage(), e2);
                        }
                    } else {
                        throw new IllegalArgumentException("index out of bounds");
                    }
                } else {
                    throw new IllegalStateException("index must not be negative");
                }
            } else {
                throw new NullPointerException("xmss == null");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }

    public final byte[] getInstance() {
        int i = this.Cardinal.Cardinal.getInstance.configure.getInstance;
        int i2 = (this.Cardinal.configure + 7) / 8;
        int i3 = i2 + i;
        int i4 = i3 + i;
        int i5 = i4 + i;
        byte[] bArr = new byte[(i + i5)];
        long j = this.init;
        byte[] bArr2 = new byte[i2];
        for (int i6 = i2 - 1; i6 >= 0; i6--) {
            bArr2[i6] = (byte) ((int) j);
            j >>>= 8;
        }
        setCCAFocusableInTouchMode.Cardinal(bArr, bArr2, 0);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.configure, i2);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.cca_continue, i3);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.onValidated, i4);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.cleanup, i5);
        try {
            EMVCoError eMVCoError = this.onCReqSuccess;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(eMVCoError);
            objectOutputStream.flush();
            return getBackgroundColor.configure(bArr, byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException(new StringBuilder("error serializing bds state: ").append(e.getMessage()).toString(), e);
        }
    }
}
