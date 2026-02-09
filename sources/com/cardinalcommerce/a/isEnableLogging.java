package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DSTU4145;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.getBackgroundColor;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public abstract class isEnableLogging extends getThreeDSRequestorAppURL implements GMCipherSpi.SM2withRMD<CardinalConfigurationParameters> {
    protected Vector init;

    protected isEnableLogging() {
        this.init = new Vector();
    }

    protected isEnableLogging(CardinalConfigurationParameters cardinalConfigurationParameters) {
        Vector vector = new Vector();
        this.init = vector;
        vector.addElement(cardinalConfigurationParameters);
    }

    protected isEnableLogging(CardinalConfigurationParameters[] cardinalConfigurationParametersArr) {
        this.init = new Vector();
        for (int i = 0; i != cardinalConfigurationParametersArr.length; i++) {
            this.init.addElement(cardinalConfigurationParametersArr[i]);
        }
    }

    public static isEnableLogging getInstance(Object obj) {
        while (obj != null && !(obj instanceof isEnableLogging)) {
            if (obj instanceof setThreeDSRequestorAppURL) {
                obj = ((setThreeDSRequestorAppURL) obj).onCReqSuccess();
            } else if (obj instanceof byte[]) {
                try {
                    return getInstance((Object) Cardinal((byte[]) obj));
                } catch (IOException e) {
                    throw new IllegalArgumentException(new StringBuilder("failed to construct sequence from byte[]: ").append(e.getMessage()).toString());
                }
            } else {
                if (obj instanceof CardinalConfigurationParameters) {
                    getThreeDSRequestorAppURL onCReqSuccess = ((CardinalConfigurationParameters) obj).onCReqSuccess();
                    if (onCReqSuccess instanceof isEnableLogging) {
                        return (isEnableLogging) onCReqSuccess;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder("unknown object in getInstance: ").append(obj.getClass().getName()).toString());
            }
        }
        return (isEnableLogging) obj;
    }

    public int cca_continue() {
        return this.init.size();
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract void getInstance(getRenderType getrendertype) throws IOException;

    public final CardinalConfigurationParameters[] getInstance() {
        CardinalConfigurationParameters[] cardinalConfigurationParametersArr = new CardinalConfigurationParameters[cca_continue()];
        for (int i = 0; i != cca_continue(); i++) {
            cardinalConfigurationParametersArr[i] = init(i);
        }
        return cardinalConfigurationParametersArr;
    }

    /* access modifiers changed from: package-private */
    public getThreeDSRequestorAppURL getSDKVersion() {
        DSTU4145.Mappings mappings = new DSTU4145.Mappings();
        mappings.init = this.init;
        return mappings;
    }

    /* access modifiers changed from: package-private */
    public getThreeDSRequestorAppURL getWarnings() {
        getProcessorTransactionId getprocessortransactionid = new getProcessorTransactionId();
        getprocessortransactionid.init = this.init;
        return getprocessortransactionid;
    }

    public CardinalConfigurationParameters init(int i) {
        return (CardinalConfigurationParameters) this.init.elementAt(i);
    }

    public Enumeration init() {
        return this.init.elements();
    }

    public Iterator<CardinalConfigurationParameters> iterator() {
        return new getBackgroundColor.Cardinal(getInstance());
    }

    public String toString() {
        return this.init.toString();
    }

    public static isEnableLogging configure(setEnableLogging setenablelogging, boolean z) {
        getThreeDSRequestorAppURL getthreedsrequestorappurl = null;
        if (!z) {
            if (setenablelogging.configure != null) {
                getthreedsrequestorappurl = setenablelogging.configure.onCReqSuccess();
            }
            if (setenablelogging.cca_continue) {
                return setenablelogging instanceof Payload ? new getPaResStatus((CardinalConfigurationParameters) getthreedsrequestorappurl) : new DSTU4145.Mappings((CardinalConfigurationParameters) getthreedsrequestorappurl);
            }
            if (getthreedsrequestorappurl instanceof isEnableLogging) {
                return (isEnableLogging) getthreedsrequestorappurl;
            }
            throw new IllegalArgumentException(new StringBuilder("unknown object in getInstance: ").append(setenablelogging.getClass().getName()).toString());
        } else if (setenablelogging.cca_continue) {
            if (setenablelogging.configure != null) {
                getthreedsrequestorappurl = setenablelogging.configure.onCReqSuccess();
            }
            return getInstance((Object) getthreedsrequestorappurl.onCReqSuccess());
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }

    protected isEnableLogging(getBackgroundColor getbackgroundcolor) {
        this.init = new Vector();
        for (int i = 0; i != getbackgroundcolor.getInstance.size(); i++) {
            this.init.addElement((CardinalConfigurationParameters) getbackgroundcolor.getInstance.elementAt(i));
        }
    }

    public int hashCode() {
        Enumeration init2 = init();
        int cca_continue = cca_continue();
        while (init2.hasMoreElements()) {
            cca_continue = (cca_continue * 17) ^ ((CardinalConfigurationParameters) init2.nextElement()).hashCode();
        }
        return cca_continue;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof isEnableLogging)) {
            return false;
        }
        isEnableLogging isenablelogging = (isEnableLogging) getthreedsrequestorappurl;
        if (cca_continue() != isenablelogging.cca_continue()) {
            return false;
        }
        Enumeration init2 = init();
        Enumeration init3 = isenablelogging.init();
        while (init2.hasMoreElements()) {
            getThreeDSRequestorAppURL onCReqSuccess = ((CardinalConfigurationParameters) init2.nextElement()).onCReqSuccess();
            getThreeDSRequestorAppURL onCReqSuccess2 = ((CardinalConfigurationParameters) init3.nextElement()).onCReqSuccess();
            if (onCReqSuccess != onCReqSuccess2 && !onCReqSuccess.equals(onCReqSuccess2)) {
                return false;
            }
        }
        return true;
    }
}
