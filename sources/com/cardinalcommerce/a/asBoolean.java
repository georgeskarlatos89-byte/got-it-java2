package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class asBoolean extends merge.init {
    private static BigInteger cca_continue = asInt.getSDKVersion;
    protected int[] getInstance;

    public asBoolean(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(cca_continue) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.getInstance = asLong.cca_continue(bigInteger);
    }

    protected asBoolean(int[] iArr) {
        this.getInstance = iArr;
    }

    public final int Cardinal() {
        return cca_continue.bitLength();
    }

    public final int hashCode() {
        return cca_continue.hashCode() ^ getBackgroundColor.cca_continue(this.getInstance, 4);
    }

    public asBoolean() {
        this.getInstance = new int[4];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.getInstance;
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean cleanup() {
        int[] iArr = this.getInstance;
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean values() {
        return (this.getInstance[0] & 1) == 1;
    }

    public final BigInteger cca_continue() {
        int[] iArr = this.getInstance;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                setTextFontSize.init(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final merge cca_continue(merge merge) {
        int[] iArr = new int[4];
        asLong.cca_continue(this.getInstance, ((asBoolean) merge).getInstance, iArr);
        return new asBoolean(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[4];
        asLong.Cardinal(this.getInstance, iArr);
        return new asBoolean(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[4];
        asLong.Cardinal(this.getInstance, ((asBoolean) merge).getInstance, iArr);
        return new asBoolean(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[4];
        asLong.init(this.getInstance, ((asBoolean) merge).getInstance, iArr);
        return new asBoolean(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[4];
        X509CertUtils.init(asLong.cca_continue, ((asBoolean) merge).getInstance, iArr);
        asLong.init(iArr, this.getInstance, iArr);
        return new asBoolean(iArr);
    }

    public final merge init() {
        int[] iArr = new int[4];
        asLong.getInstance(this.getInstance, iArr);
        return new asBoolean(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[4];
        asLong.init(this.getInstance, iArr);
        return new asBoolean(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[4];
        X509CertUtils.init(asLong.cca_continue, this.getInstance, iArr);
        return new asBoolean(iArr);
    }

    public final merge getWarnings() {
        boolean z;
        boolean z2;
        int[] iArr = this.getInstance;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= 4) {
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
                    if (i2 >= 4) {
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
                int[] iArr2 = new int[4];
                asLong.init(iArr, iArr2);
                asLong.init(iArr2, iArr, iArr2);
                int[] iArr3 = new int[4];
                asLong.cca_continue(iArr2, 2, iArr3);
                asLong.init(iArr3, iArr2, iArr3);
                int[] iArr4 = new int[4];
                asLong.cca_continue(iArr3, 4, iArr4);
                asLong.init(iArr4, iArr3, iArr4);
                asLong.cca_continue(iArr4, 2, iArr3);
                asLong.init(iArr3, iArr2, iArr3);
                asLong.cca_continue(iArr3, 10, iArr2);
                asLong.init(iArr2, iArr3, iArr2);
                asLong.cca_continue(iArr2, 10, iArr4);
                asLong.init(iArr4, iArr3, iArr4);
                asLong.init(iArr4, iArr3);
                asLong.init(iArr3, iArr, iArr3);
                asLong.cca_continue(iArr3, 95, iArr3);
                asLong.init(iArr3, iArr4);
                int i3 = 3;
                while (true) {
                    if (i3 < 0) {
                        z3 = true;
                        break;
                    } else if (iArr[i3] != iArr4[i3]) {
                        break;
                    } else {
                        i3--;
                    }
                }
                if (z3) {
                    return new asBoolean(iArr3);
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
        if (!(obj instanceof asBoolean)) {
            return false;
        }
        int[] iArr = this.getInstance;
        int[] iArr2 = ((asBoolean) obj).getInstance;
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
