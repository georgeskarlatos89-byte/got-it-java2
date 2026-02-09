package com.cardinalcommerce.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public final class getEciFlag extends setUICustomization {
    final setUICustomization[] Cardinal;
    private final int configure;

    public getEciFlag(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private getEciFlag(byte[] bArr, byte b) {
        this(bArr, (setUICustomization[]) null, 1000);
    }

    private getEciFlag(byte[] bArr, setUICustomization[] setuicustomizationArr, int i) {
        super(bArr);
        this.Cardinal = setuicustomizationArr;
        this.configure = 1000;
    }

    public getEciFlag(setUICustomization[] setuicustomizationArr) {
        this(setuicustomizationArr, (byte) 0);
    }

    private getEciFlag(setUICustomization[] setuicustomizationArr, byte b) {
        this(getInstance(setuicustomizationArr), setuicustomizationArr, 1000);
    }

    private static byte[] getInstance(setUICustomization[] setuicustomizationArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i != setuicustomizationArr.length) {
            try {
                byteArrayOutputStream.write(setuicustomizationArr[i].getInstance());
                i++;
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(new StringBuilder().append(setuicustomizationArr[i].getClass().getName()).append(" found in input should only contain DEROctetString").toString());
            } catch (IOException e) {
                throw new IllegalArgumentException(new StringBuilder("exception converting octets ").append(e.toString()).toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        Enumeration cleanup = cleanup();
        int i = 0;
        while (cleanup.hasMoreElements()) {
            i += ((CardinalConfigurationParameters) cleanup.nextElement()).onCReqSuccess().Cardinal();
        }
        return i + 2 + 2;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return true;
    }

    public final void getInstance(getRenderType getrendertype) throws IOException {
        getrendertype.getInstance(36);
        getrendertype.getInstance(128);
        Enumeration cleanup = cleanup();
        while (cleanup.hasMoreElements()) {
            getrendertype.getInstance((CardinalConfigurationParameters) cleanup.nextElement());
        }
        getrendertype.getInstance(0);
        getrendertype.getInstance(0);
    }

    public final byte[] getInstance() {
        return this.getInstance;
    }

    public final Enumeration cleanup() {
        if (this.Cardinal != null) {
            return new Enumeration() {
                private int cca_continue = 0;

                public final boolean hasMoreElements() {
                    return this.cca_continue < getEciFlag.this.Cardinal.length;
                }

                public final Object nextElement() {
                    setUICustomization[] setuicustomizationArr = getEciFlag.this.Cardinal;
                    int i = this.cca_continue;
                    this.cca_continue = i + 1;
                    return setuicustomizationArr[i];
                }
            };
        }
        Vector vector = new Vector();
        int i = 0;
        while (i < this.getInstance.length) {
            int length = (this.configure + i > this.getInstance.length ? this.getInstance.length : this.configure + i) - i;
            byte[] bArr = new byte[length];
            System.arraycopy(this.getInstance, i, bArr, 0, length);
            vector.addElement(new setEnabledVisaCheckout(bArr));
            i += this.configure;
        }
        return vector.elements();
    }
}
