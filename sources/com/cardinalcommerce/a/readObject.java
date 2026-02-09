package com.cardinalcommerce.a;

public final class readObject extends getDeviceFingerprint {
    public readObject(getDeviceFingerprint getdevicefingerprint) {
        super(getdevicefingerprint.getInstance(), getdevicefingerprint.onValidated());
    }

    public final String toString() {
        return new StringBuilder("NetscapeCertType: 0x").append(Integer.toHexString(this.getInstance[0] & 255)).toString();
    }
}
