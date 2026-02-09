package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DSA;
import java.io.IOException;

public abstract class setEnableLogging extends getThreeDSRequestorAppURL implements CardinalChallengeObserver {
    public int Cardinal;
    public boolean cca_continue = true;
    public CardinalConfigurationParameters configure = null;
    public boolean init = false;

    public setEnableLogging(boolean z, int i, CardinalConfigurationParameters cardinalConfigurationParameters) {
        if (cardinalConfigurationParameters instanceof getChallengeTimeout) {
            this.cca_continue = true;
        } else {
            this.cca_continue = z;
        }
        this.Cardinal = i;
        if (this.cca_continue) {
            this.configure = cardinalConfigurationParameters;
            return;
        }
        cardinalConfigurationParameters.onCReqSuccess();
        this.configure = cardinalConfigurationParameters;
    }

    public static setEnableLogging cca_continue(Object obj) {
        if (obj == null || (obj instanceof setEnableLogging)) {
            return (setEnableLogging) obj;
        }
        throw new IllegalArgumentException(new StringBuilder("unknown object in getInstance: ").append(obj.getClass().getName()).toString());
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof setEnableLogging)) {
            return false;
        }
        setEnableLogging setenablelogging = (setEnableLogging) getthreedsrequestorappurl;
        if (this.Cardinal == setenablelogging.Cardinal) {
            boolean z = setenablelogging.init;
            if (this.cca_continue == setenablelogging.cca_continue) {
                CardinalConfigurationParameters cardinalConfigurationParameters = this.configure;
                return cardinalConfigurationParameters == null ? setenablelogging.configure == null : cardinalConfigurationParameters.onCReqSuccess().equals(setenablelogging.configure.onCReqSuccess());
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract void getInstance(getRenderType getrendertype) throws IOException;

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getSDKVersion() {
        return new DSA.Mappings(this.cca_continue, this.Cardinal, this.configure);
    }

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getWarnings() {
        return new getPayment(this.cca_continue, this.Cardinal, this.configure);
    }

    public int hashCode() {
        int i = this.Cardinal;
        CardinalConfigurationParameters cardinalConfigurationParameters = this.configure;
        return cardinalConfigurationParameters != null ? i ^ cardinalConfigurationParameters.hashCode() : i;
    }

    public final getThreeDSRequestorAppURL init() {
        return onCReqSuccess();
    }

    public String toString() {
        return new StringBuilder("[").append(this.Cardinal).append("]").append(this.configure).toString();
    }
}
