package com.cardinalcommerce.a;

import com.cardinalcommerce.a.setCCAOnTouchListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public final class setImageDrawable extends setPadding {
    public final setFocusableInTouchMode Cardinal;
    private final byte[] cca_continue;
    private final byte[] configure;
    private final byte[] getInstance;
    private final byte[] getWarnings;
    private final doChallenge onValidated;

    public static class Cardinal {
        public int Cardinal = 0;
        final setFocusableInTouchMode cca_continue;
        public doChallenge cleanup = null;
        public byte[] configure = null;
        public byte[] getInstance = null;
        public byte[] getSDKVersion = null;
        byte[] getWarnings = null;
        public byte[] init = null;
        setFocusableInTouchMode onValidated = null;

        public Cardinal(setFocusableInTouchMode setfocusableintouchmode) {
            this.cca_continue = setfocusableintouchmode;
        }
    }

    public /* synthetic */ setImageDrawable(Cardinal cardinal, byte b) {
        this(cardinal);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private setImageDrawable(Cardinal cardinal) {
        super(true, cardinal.cca_continue.getInstance.configure.cca_continue.configure());
        boolean z = true;
        setFocusableInTouchMode setfocusableintouchmode = cardinal.cca_continue;
        this.Cardinal = setfocusableintouchmode;
        if (setfocusableintouchmode != null) {
            int i = setfocusableintouchmode.getInstance.configure.getInstance;
            byte[] bArr = cardinal.getWarnings;
            if (bArr == null) {
                byte[] bArr2 = cardinal.configure;
                if (bArr2 == null) {
                    this.configure = new byte[i];
                } else if (bArr2.length == i) {
                    this.configure = bArr2;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] bArr3 = cardinal.init;
                if (bArr3 == null) {
                    this.getInstance = new byte[i];
                } else if (bArr3.length == i) {
                    this.getInstance = bArr3;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] bArr4 = cardinal.getInstance;
                if (bArr4 == null) {
                    this.cca_continue = new byte[i];
                } else if (bArr4.length == i) {
                    this.cca_continue = bArr4;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] bArr5 = cardinal.getSDKVersion;
                if (bArr5 == null) {
                    this.getWarnings = new byte[i];
                } else if (bArr5.length == i) {
                    this.getWarnings = bArr5;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                doChallenge dochallenge = cardinal.cleanup;
                if (dochallenge != null) {
                    this.onValidated = dochallenge;
                } else if (cardinal.Cardinal >= (1 << setfocusableintouchmode.cca_continue) - 2 || bArr4 == null || bArr2 == null) {
                    this.onValidated = new doChallenge(setfocusableintouchmode, cardinal.Cardinal);
                } else {
                    setCCAOnTouchListener setccaontouchlistener = new setCCAOnTouchListener(new setCCAOnTouchListener.getInstance(), (byte) 0);
                    setCCAOnTouchListener setccaontouchlistener2 = setccaontouchlistener;
                    this.onValidated = new doChallenge(setfocusableintouchmode, bArr4, bArr2, setccaontouchlistener, cardinal.Cardinal);
                }
            } else if (cardinal.onValidated != null) {
                int i2 = setfocusableintouchmode.cca_continue;
                int instance = setTextFontSize.getInstance(bArr, 0);
                long j = (long) instance;
                if (j >= 0) {
                    if (j >= (1 << i2) ? false : z) {
                        this.configure = setCCAFocusableInTouchMode.configure(bArr, 4, i);
                        int i3 = i + 4;
                        this.getInstance = setCCAFocusableInTouchMode.configure(bArr, i3, i);
                        int i4 = i3 + i;
                        this.cca_continue = setCCAFocusableInTouchMode.configure(bArr, i4, i);
                        int i5 = i4 + i;
                        this.getWarnings = setCCAFocusableInTouchMode.configure(bArr, i5, i);
                        int i6 = i5 + i;
                        try {
                            doChallenge dochallenge2 = (doChallenge) setCCAFocusableInTouchMode.cca_continue(setCCAFocusableInTouchMode.configure(bArr, i6, bArr.length - i6), doChallenge.class);
                            if (dochallenge2.cca_continue == instance) {
                                this.onValidated = new doChallenge(dochallenge2, ChallengeUtils.Cardinal(ChallengeUtils.cca_continue(cardinal.onValidated.getInstance.configure.cca_continue.configure())));
                                return;
                            }
                            throw new IllegalStateException("serialized BDS has wrong index");
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

    public final byte[] Cardinal() {
        int i = this.Cardinal.getInstance.configure.getInstance;
        int i2 = i + 4;
        int i3 = i2 + i;
        int i4 = i3 + i;
        byte[] bArr = new byte[(i + i4)];
        setTextFontSize.init(this.onValidated.cca_continue, bArr, 0);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.configure, 4);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.getInstance, i2);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.cca_continue, i3);
        setCCAFocusableInTouchMode.Cardinal(bArr, this.getWarnings, i4);
        try {
            doChallenge dochallenge = this.onValidated;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(dochallenge);
            objectOutputStream.flush();
            return getBackgroundColor.configure(bArr, byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(new StringBuilder("error serializing bds state: ").append(e.getMessage()).toString());
        }
    }
}
