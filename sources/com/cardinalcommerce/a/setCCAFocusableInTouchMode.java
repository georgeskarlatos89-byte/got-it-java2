package com.cardinalcommerce.a;

import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

public final class setCCAFocusableInTouchMode implements GMCipherSpi.SM2withRMD {
    public byte[] Cardinal;
    public byte[] cca_continue;
    public int getInstance;
    public CipherSpi.ISO9796d1Padding init;

    static class Cardinal extends ObjectInputStream {
        private static final Set init;
        private final Class Cardinal;
        private boolean getInstance = false;

        static {
            HashSet hashSet = new HashSet();
            init = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        Cardinal(Class cls, InputStream inputStream) throws IOException {
            super(inputStream);
            this.Cardinal = cls;
        }

        /* access modifiers changed from: protected */
        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            if (!this.getInstance) {
                if (objectStreamClass.getName().equals(this.Cardinal.getName())) {
                    this.getInstance = true;
                } else {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else if (!init.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public setCCAFocusableInTouchMode() {
    }

    public static void Cardinal(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr[i + i2] = bArr2[i2];
            }
        } else {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
    }

    public static long cca_continue(byte[] bArr, int i) {
        if (bArr != null) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 8) | ((long) (bArr[i2] & 255));
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    public static Object cca_continue(byte[] bArr, Class cls) throws IOException, ClassNotFoundException {
        Cardinal cardinal = new Cardinal(cls, new ByteArrayInputStream(bArr));
        Object readObject = cardinal.readObject();
        if (cardinal.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        } else if (cls.isInstance(readObject)) {
            return readObject;
        } else {
            throw new IOException("unexpected class found in ObjectInputStream");
        }
    }

    public static byte[] configure(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        } else if (i + i2 <= bArr.length) {
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr2[i3] = bArr[i + i3];
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
    }

    public static byte[][] init(byte[][] bArr) {
        boolean z = true;
        if (bArr != null) {
            int i = 0;
            while (true) {
                if (i >= bArr.length) {
                    z = false;
                    break;
                } else if (bArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z) {
            byte[][] bArr2 = new byte[bArr.length][];
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte[] bArr3 = new byte[bArr[i2].length];
                bArr2[i2] = bArr3;
                byte[] bArr4 = bArr[i2];
                System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    public setCCAFocusableInTouchMode(CipherSpi.ISO9796d1Padding iSO9796d1Padding, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        this.init = iSO9796d1Padding;
        byte[] bArr4 = null;
        if (bArr == null) {
            bArr3 = null;
        } else {
            bArr3 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        }
        this.cca_continue = bArr3;
        this.getInstance = 128;
        if (bArr2 != null) {
            bArr4 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        }
        this.Cardinal = bArr4;
    }
}
