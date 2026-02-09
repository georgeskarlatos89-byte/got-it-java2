package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.getBackgroundColor;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public abstract class setEnableDFSync extends getThreeDSRequestorAppURL implements GMCipherSpi.SM2withRMD<CardinalConfigurationParameters> {
    public Vector cca_continue;
    private boolean getInstance;

    protected setEnableDFSync() {
        this.cca_continue = new Vector();
        this.getInstance = false;
    }

    protected setEnableDFSync(CardinalConfigurationParameters cardinalConfigurationParameters) {
        Vector vector = new Vector();
        this.cca_continue = vector;
        this.getInstance = false;
        vector.addElement(cardinalConfigurationParameters);
    }

    protected setEnableDFSync(CardinalConfigurationParameters[] cardinalConfigurationParametersArr) {
        this.cca_continue = new Vector();
        this.getInstance = false;
        for (int i = 0; i != cardinalConfigurationParametersArr.length; i++) {
            this.cca_continue.addElement(cardinalConfigurationParametersArr[i]);
        }
    }

    public static setEnableDFSync cca_continue(Object obj) {
        while (obj != null && !(obj instanceof setEnableDFSync)) {
            if (obj instanceof setLocationDataConsentGiven) {
                obj = ((setLocationDataConsentGiven) obj).onCReqSuccess();
            } else if (obj instanceof byte[]) {
                try {
                    return cca_continue(getThreeDSRequestorAppURL.Cardinal((byte[]) obj));
                } catch (IOException e) {
                    throw new IllegalArgumentException(new StringBuilder("failed to construct set from byte[]: ").append(e.getMessage()).toString());
                }
            } else {
                if (obj instanceof CardinalConfigurationParameters) {
                    getThreeDSRequestorAppURL onCReqSuccess = ((CardinalConfigurationParameters) obj).onCReqSuccess();
                    if (onCReqSuccess instanceof setEnableDFSync) {
                        return (setEnableDFSync) onCReqSuccess;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder("unknown object in getInstance: ").append(obj.getClass().getName()).toString());
            }
        }
        return (setEnableDFSync) obj;
    }

    private void cca_continue() {
        if (!this.getInstance) {
            this.getInstance = true;
            if (this.cca_continue.size() > 1) {
                int size = this.cca_continue.size() - 1;
                boolean z = true;
                while (z) {
                    int i = 0;
                    byte[] configure = configure((CardinalConfigurationParameters) this.cca_continue.elementAt(0));
                    z = false;
                    int i2 = 0;
                    while (i2 != size) {
                        int i3 = i2 + 1;
                        byte[] configure2 = configure((CardinalConfigurationParameters) this.cca_continue.elementAt(i3));
                        if (cca_continue(configure, configure2)) {
                            configure = configure2;
                        } else {
                            Object elementAt = this.cca_continue.elementAt(i2);
                            Vector vector = this.cca_continue;
                            vector.setElementAt(vector.elementAt(i3), i2);
                            this.cca_continue.setElementAt(elementAt, i3);
                            z = true;
                            i = i2;
                        }
                        i2 = i3;
                    }
                    size = i;
                }
            }
        }
    }

    private static boolean cca_continue(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i != min; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return min == bArr.length;
    }

    private static byte[] configure(CardinalConfigurationParameters cardinalConfigurationParameters) {
        try {
            return cardinalConfigurationParameters.onCReqSuccess().configure("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract void getInstance(getRenderType getrendertype) throws IOException;

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getSDKVersion() {
        DSTU4145 dstu4145 = new DSTU4145();
        dstu4145.cca_continue = this.cca_continue;
        return dstu4145;
    }

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getWarnings() {
        if (this.getInstance) {
            getType gettype = new getType();
            gettype.cca_continue = this.cca_continue;
            return gettype;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.cca_continue.size(); i++) {
            vector.addElement(this.cca_continue.elementAt(i));
        }
        getType gettype2 = new getType();
        gettype2.cca_continue = vector;
        gettype2.cca_continue();
        return gettype2;
    }

    public Iterator<CardinalConfigurationParameters> iterator() {
        return new getBackgroundColor.Cardinal(init());
    }

    public String toString() {
        return this.cca_continue.toString();
    }

    public static setEnableDFSync init(setEnableLogging setenablelogging) {
        getThreeDSRequestorAppURL onCReqSuccess = setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null;
        if (setenablelogging.cca_continue) {
            return setenablelogging instanceof Payload ? new setEnabledDiscover((CardinalConfigurationParameters) onCReqSuccess) : new DSTU4145((CardinalConfigurationParameters) onCReqSuccess);
        }
        if (onCReqSuccess instanceof setEnableDFSync) {
            return (setEnableDFSync) onCReqSuccess;
        }
        if (onCReqSuccess instanceof isEnableLogging) {
            isEnableLogging isenablelogging = (isEnableLogging) onCReqSuccess;
            return setenablelogging instanceof Payload ? new setEnabledDiscover(isenablelogging.getInstance()) : new DSTU4145(isenablelogging.getInstance());
        }
        throw new IllegalArgumentException(new StringBuilder("unknown object in getInstance: ").append(setenablelogging.getClass().getName()).toString());
    }

    protected setEnableDFSync(getBackgroundColor getbackgroundcolor, boolean z) {
        this.cca_continue = new Vector();
        this.getInstance = false;
        for (int i = 0; i != getbackgroundcolor.getInstance.size(); i++) {
            this.cca_continue.addElement((CardinalConfigurationParameters) getbackgroundcolor.getInstance.elementAt(i));
        }
        if (z) {
            cca_continue();
        }
    }

    private CardinalConfigurationParameters[] init() {
        CardinalConfigurationParameters[] cardinalConfigurationParametersArr = new CardinalConfigurationParameters[this.cca_continue.size()];
        for (int i = 0; i != this.cca_continue.size(); i++) {
            cardinalConfigurationParametersArr[i] = (CardinalConfigurationParameters) this.cca_continue.elementAt(i);
        }
        return cardinalConfigurationParametersArr;
    }

    public int hashCode() {
        Enumeration elements = this.cca_continue.elements();
        int size = this.cca_continue.size();
        while (elements.hasMoreElements()) {
            Object obj = (CardinalConfigurationParameters) elements.nextElement();
            if (obj == null) {
                obj = isEnabledVisaCheckout.configure;
            }
            size = (size * 17) ^ obj.hashCode();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof setEnableDFSync)) {
            return false;
        }
        setEnableDFSync setenabledfsync = (setEnableDFSync) getthreedsrequestorappurl;
        if (this.cca_continue.size() != setenabledfsync.cca_continue.size()) {
            return false;
        }
        Enumeration elements = this.cca_continue.elements();
        Enumeration elements2 = setenabledfsync.cca_continue.elements();
        while (elements.hasMoreElements()) {
            CardinalConfigurationParameters cardinalConfigurationParameters = (CardinalConfigurationParameters) elements.nextElement();
            if (cardinalConfigurationParameters == null) {
                cardinalConfigurationParameters = isEnabledVisaCheckout.configure;
            }
            CardinalConfigurationParameters cardinalConfigurationParameters2 = (CardinalConfigurationParameters) elements2.nextElement();
            if (cardinalConfigurationParameters2 == null) {
                cardinalConfigurationParameters2 = isEnabledVisaCheckout.configure;
            }
            getThreeDSRequestorAppURL onCReqSuccess = cardinalConfigurationParameters.onCReqSuccess();
            getThreeDSRequestorAppURL onCReqSuccess2 = cardinalConfigurationParameters2.onCReqSuccess();
            if (onCReqSuccess != onCReqSuccess2 && !onCReqSuccess.equals(onCReqSuccess2)) {
                return false;
            }
        }
        return true;
    }
}
