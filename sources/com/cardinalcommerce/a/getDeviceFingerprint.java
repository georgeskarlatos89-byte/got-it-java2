package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;

public class getDeviceFingerprint extends getRequestTimeout {
    public getDeviceFingerprint(CardinalConfigurationParameters cardinalConfigurationParameters) throws IOException {
        super(cardinalConfigurationParameters.onCReqSuccess().configure("DER"), 0);
    }

    public getDeviceFingerprint(byte[] bArr) {
        this(bArr, 0);
    }

    public getDeviceFingerprint(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static getDeviceFingerprint Cardinal(Object obj) {
        if (obj == null || (obj instanceof getDeviceFingerprint)) {
            return (getDeviceFingerprint) obj;
        }
        if (obj instanceof PrivateKeyInfo) {
            PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) obj;
            return new getDeviceFingerprint(privateKeyInfo.getInstance, privateKeyInfo.init);
        } else if (obj instanceof byte[]) {
            try {
                return (getDeviceFingerprint) Cardinal((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(new StringBuilder("encoding error in getInstance: ").append(e.toString()).toString());
            }
        } else {
            throw new IllegalArgumentException(new StringBuilder("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        return GM.Mappings.Cardinal(this.getInstance.length + 1) + 1 + this.getInstance.length + 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    public static getDeviceFingerprint Cardinal(setEnableLogging setenablelogging) {
        getThreeDSRequestorAppURL onCReqSuccess = setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null;
        if (onCReqSuccess instanceof getDeviceFingerprint) {
            return Cardinal((Object) onCReqSuccess);
        }
        byte[] instance = ((setUICustomization) onCReqSuccess).getInstance();
        if (instance.length > 0) {
            byte b = instance[0];
            int length = instance.length - 1;
            byte[] bArr = new byte[length];
            if (length != 0) {
                System.arraycopy(instance, 1, bArr, 0, instance.length - 1);
            }
            return new getDeviceFingerprint(bArr, b);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] bArr;
        byte[] bArr2 = this.getInstance;
        int i = this.init;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        if (i > 0) {
            int length = bArr2.length - 1;
            bArr[length] = (byte) ((255 << i) & bArr[length]);
        }
        int length2 = bArr.length + 1;
        byte[] bArr3 = new byte[length2];
        bArr3[0] = (byte) onValidated();
        System.arraycopy(bArr, 0, bArr3, 1, length2 - 1);
        getrendertype.getInstance(3);
        getrendertype.configure(length2);
        getrendertype.configure.write(bArr3);
    }
}
