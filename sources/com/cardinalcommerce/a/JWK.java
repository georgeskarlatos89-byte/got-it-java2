package com.cardinalcommerce.a;

final class JWK implements JWTClaimsSet {
    private int[] Cardinal;

    public final int cca_continue() {
        int[] iArr = this.Cardinal;
        return iArr[iArr.length - 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWK)) {
            return false;
        }
        return getBackgroundColor.cca_continue(this.Cardinal, ((JWK) obj).Cardinal);
    }

    public final int hashCode() {
        return getBackgroundColor.init(this.Cardinal);
    }

    JWK(int[] iArr) {
        int[] iArr2;
        if (iArr == null) {
            iArr2 = null;
        } else {
            int[] iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr2 = iArr3;
        }
        this.Cardinal = iArr2;
    }

    public final int[] getInstance() {
        int[] iArr = this.Cardinal;
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }
}
