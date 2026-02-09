package com.cardinalcommerce.a;

import com.cardinalcommerce.a.setCCAOnTouchListener;

public final class setVisibility {
    byte[] cca_continue;
    public final setCheckState configure;
    private byte[] getInstance;
    final setCCAOnClickListener init;

    protected setVisibility(setCheckState setcheckstate) {
        this.configure = setcheckstate;
        int i = setcheckstate.getInstance;
        this.init = new setCCAOnClickListener(setcheckstate.cca_continue, i);
        this.getInstance = new byte[i];
        this.cca_continue = new byte[i];
    }

    /* access modifiers changed from: package-private */
    public final void configure(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        } else if (bArr.length != this.configure.getInstance) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        } else if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        } else if (bArr2.length == this.configure.getInstance) {
            this.getInstance = bArr;
            this.cca_continue = bArr2;
        } else {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
    }

    private byte[] getInstance(byte[] bArr, int i, int i2, setCCAOnTouchListener setccaontouchlistener) {
        int i3 = this.configure.getInstance;
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        } else if (bArr.length != i3) {
            throw new IllegalArgumentException(new StringBuilder("startHash needs to be ").append(i3).append("bytes").toString());
        } else if (setccaontouchlistener == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (setccaontouchlistener.Cardinal() != null) {
            int i4 = i + i2;
            if (i4 > this.configure.Cardinal - 1) {
                throw new IllegalArgumentException("max chain length must not be greater than w");
            } else if (i2 == 0) {
                return bArr;
            } else {
                byte[] instance = getInstance(bArr, i, i2 - 1, setccaontouchlistener);
                setCCAOnTouchListener.getInstance getinstance = (setCCAOnTouchListener.getInstance) ((setCCAOnTouchListener.getInstance) new setCCAOnTouchListener.getInstance().cca_continue(setccaontouchlistener.configure)).getInstance(setccaontouchlistener.getWarnings);
                getinstance.getInstance = setccaontouchlistener.Cardinal;
                getinstance.cca_continue = setccaontouchlistener.cca_continue;
                getinstance.configure = i4 - 1;
                setCCAOnTouchListener setccaontouchlistener2 = new setCCAOnTouchListener((setCCAOnTouchListener.getInstance) getinstance.init(0), (byte) 0);
                setCCAOnTouchListener setccaontouchlistener3 = setccaontouchlistener2;
                byte[] init2 = this.init.init(this.cca_continue, setccaontouchlistener2.Cardinal());
                setCCAOnTouchListener.getInstance getinstance2 = (setCCAOnTouchListener.getInstance) ((setCCAOnTouchListener.getInstance) new setCCAOnTouchListener.getInstance().cca_continue(setccaontouchlistener2.configure)).getInstance(setccaontouchlistener2.getWarnings);
                getinstance2.getInstance = setccaontouchlistener2.Cardinal;
                getinstance2.cca_continue = setccaontouchlistener2.cca_continue;
                getinstance2.configure = setccaontouchlistener2.init;
                setCCAOnTouchListener setccaontouchlistener4 = new setCCAOnTouchListener((setCCAOnTouchListener.getInstance) getinstance2.init(1), (byte) 0);
                setCCAOnTouchListener setccaontouchlistener5 = setccaontouchlistener4;
                byte[] init3 = this.init.init(this.cca_continue, setccaontouchlistener4.Cardinal());
                byte[] bArr2 = new byte[i3];
                for (int i5 = 0; i5 < i3; i5++) {
                    bArr2[i5] = (byte) (instance[i5] ^ init3[i5]);
                }
                setCCAOnClickListener setccaonclicklistener = this.init;
                if (init2.length != setccaonclicklistener.Cardinal) {
                    throw new IllegalArgumentException("wrong key length");
                } else if (i3 == setccaonclicklistener.Cardinal) {
                    return setccaonclicklistener.init(0, init2, bArr2);
                } else {
                    throw new IllegalArgumentException("wrong in length");
                }
            }
        } else {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
    }

    /* access modifiers changed from: protected */
    public final byte[] getInstance(byte[] bArr, setCCAOnTouchListener setccaontouchlistener) {
        setCCAOnTouchListener.getInstance getinstance = (setCCAOnTouchListener.getInstance) ((setCCAOnTouchListener.getInstance) new setCCAOnTouchListener.getInstance().cca_continue(setccaontouchlistener.configure)).getInstance(setccaontouchlistener.getWarnings);
        getinstance.getInstance = setccaontouchlistener.Cardinal;
        setCCAOnTouchListener setccaontouchlistener2 = new setCCAOnTouchListener(getinstance, (byte) 0);
        setCCAOnTouchListener setccaontouchlistener3 = setccaontouchlistener2;
        return this.init.init(bArr, setccaontouchlistener2.Cardinal());
    }

    /* access modifiers changed from: protected */
    public final setElevation cca_continue(setCCAOnTouchListener setccaontouchlistener) {
        byte[][] bArr = new byte[this.configure.configure][];
        int i = 0;
        while (i < this.configure.configure) {
            setCCAOnTouchListener.getInstance getinstance = (setCCAOnTouchListener.getInstance) ((setCCAOnTouchListener.getInstance) new setCCAOnTouchListener.getInstance().cca_continue(setccaontouchlistener.configure)).getInstance(setccaontouchlistener.getWarnings);
            getinstance.getInstance = setccaontouchlistener.Cardinal;
            getinstance.cca_continue = i;
            getinstance.configure = setccaontouchlistener.init;
            setCCAOnTouchListener setccaontouchlistener2 = new setCCAOnTouchListener((setCCAOnTouchListener.getInstance) getinstance.init(setccaontouchlistener.cleanup), (byte) 0);
            setCCAOnTouchListener setccaontouchlistener3 = setccaontouchlistener2;
            if (i < 0 || i >= this.configure.configure) {
                throw new IllegalArgumentException("index out of bounds");
            }
            setCCAOnClickListener setccaonclicklistener = this.init;
            byte[] bArr2 = this.getInstance;
            long j = (long) i;
            byte[] bArr3 = new byte[32];
            for (int i2 = 31; i2 >= 0; i2--) {
                bArr3[i2] = (byte) ((int) j);
                j >>>= 8;
            }
            bArr[i] = getInstance(setccaonclicklistener.init(bArr2, bArr3), 0, this.configure.Cardinal - 1, setccaontouchlistener2);
            i++;
            setccaontouchlistener = setccaontouchlistener2;
        }
        return new setElevation(this.configure, bArr);
    }
}
