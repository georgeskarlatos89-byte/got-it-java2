package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class atNext extends merge.init {
    private static BigInteger cca_continue = object.getWarnings;
    protected int[] configure;

    public atNext(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(cca_continue) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.configure = store.cca_continue(bigInteger);
    }

    protected atNext(int[] iArr) {
        this.configure = iArr;
    }

    public final int Cardinal() {
        return cca_continue.bitLength();
    }

    public final BigInteger cca_continue() {
        return ProtocolErrorEvent.getInstance(this.configure);
    }

    public final int hashCode() {
        return cca_continue.hashCode() ^ getBackgroundColor.cca_continue(this.configure, 5);
    }

    public atNext() {
        this.configure = new int[5];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.configure;
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean cleanup() {
        int[] iArr = this.configure;
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean values() {
        return (this.configure[0] & 1) == 1;
    }

    public final merge cca_continue(merge merge) {
        int[] iArr = new int[5];
        store.cca_continue(this.configure, ((atNext) merge).configure, iArr);
        return new atNext(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[5];
        store.cca_continue(this.configure, iArr);
        return new atNext(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[5];
        store.configure(this.configure, ((atNext) merge).configure, iArr);
        return new atNext(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[5];
        store.getInstance(this.configure, ((atNext) merge).configure, iArr);
        return new atNext(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[5];
        X509CertUtils.init(store.getInstance, ((atNext) merge).configure, iArr);
        store.getInstance(iArr, this.configure, iArr);
        return new atNext(iArr);
    }

    public final merge init() {
        int[] iArr = new int[5];
        store.getInstance(this.configure, iArr);
        return new atNext(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[5];
        store.Cardinal(this.configure, iArr);
        return new atNext(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[5];
        X509CertUtils.init(store.getInstance, this.configure, iArr);
        return new atNext(iArr);
    }

    public final merge getWarnings() {
        boolean z;
        boolean z2;
        int[] iArr = this.configure;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= 5) {
                z = true;
                break;
            } else if (iArr[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            if (iArr[0] == 1) {
                int i2 = 1;
                while (true) {
                    if (i2 >= 5) {
                        z2 = true;
                        break;
                    } else if (iArr[i2] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                int[] iArr2 = new int[5];
                store.Cardinal(iArr, iArr2);
                store.getInstance(iArr2, iArr, iArr2);
                int[] iArr3 = new int[5];
                store.cca_continue(iArr2, 2, iArr3);
                store.getInstance(iArr3, iArr2, iArr3);
                int i3 = 4;
                store.cca_continue(iArr3, 4, iArr2);
                store.getInstance(iArr2, iArr3, iArr2);
                store.cca_continue(iArr2, 8, iArr3);
                store.getInstance(iArr3, iArr2, iArr3);
                store.cca_continue(iArr3, 16, iArr2);
                store.getInstance(iArr2, iArr3, iArr2);
                store.cca_continue(iArr2, 32, iArr3);
                store.getInstance(iArr3, iArr2, iArr3);
                store.cca_continue(iArr3, 64, iArr2);
                store.getInstance(iArr2, iArr3, iArr2);
                store.Cardinal(iArr2, iArr3);
                store.getInstance(iArr3, iArr, iArr3);
                store.cca_continue(iArr3, 29, iArr3);
                store.Cardinal(iArr3, iArr2);
                while (true) {
                    if (i3 < 0) {
                        z3 = true;
                        break;
                    } else if (iArr[i3] != iArr2[i3]) {
                        break;
                    } else {
                        i3--;
                    }
                }
                if (z3) {
                    return new atNext(iArr3);
                }
                return null;
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof atNext)) {
            return false;
        }
        int[] iArr = this.configure;
        int[] iArr2 = ((atNext) obj).configure;
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
