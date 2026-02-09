package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.IOException;

public abstract class getEnvironment extends getThreeDSRequestorAppURL {
    protected ASN1ObjectIdentifier Cardinal;
    protected getThreeDSRequestorAppURL cca_continue;
    protected getThreeDSRequestorAppURL configure;
    protected setEnvironment getInstance;
    protected int init;

    private void cca_continue(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid encoding value: ".concat(String.valueOf(i)));
        }
        this.init = i;
    }

    /* access modifiers changed from: package-private */
    public int Cardinal() throws IOException {
        return getEncoded().length;
    }

    public final ASN1ObjectIdentifier cca_continue() {
        return this.Cardinal;
    }

    public final setEnvironment cleanup() {
        return this.getInstance;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        getThreeDSRequestorAppURL getthreedsrequestorappurl2;
        setEnvironment setenvironment;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (!(getthreedsrequestorappurl instanceof getEnvironment)) {
            return false;
        }
        if (this == getthreedsrequestorappurl) {
            return true;
        }
        getEnvironment getenvironment = (getEnvironment) getthreedsrequestorappurl;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.Cardinal;
        if (aSN1ObjectIdentifier2 != null && ((aSN1ObjectIdentifier = getenvironment.Cardinal) == null || !aSN1ObjectIdentifier.equals(aSN1ObjectIdentifier2))) {
            return false;
        }
        setEnvironment setenvironment2 = this.getInstance;
        if (setenvironment2 != null && ((setenvironment = getenvironment.getInstance) == null || !setenvironment.equals(setenvironment2))) {
            return false;
        }
        getThreeDSRequestorAppURL getthreedsrequestorappurl3 = this.cca_continue;
        if (getthreedsrequestorappurl3 == null || ((getthreedsrequestorappurl2 = getenvironment.cca_continue) != null && getthreedsrequestorappurl2.equals(getthreedsrequestorappurl3))) {
            return this.configure.equals(getenvironment.configure);
        }
        return false;
    }

    public final int getInstance() {
        return this.init;
    }

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getWarnings() {
        return this instanceof setErrorNumber ? this : new setErrorNumber(this.Cardinal, this.getInstance, this.cca_continue, this.init, this.configure);
    }

    public int hashCode() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.Cardinal;
        int hashCode = aSN1ObjectIdentifier != null ? aSN1ObjectIdentifier.hashCode() : 0;
        setEnvironment setenvironment = this.getInstance;
        if (setenvironment != null) {
            hashCode ^= setenvironment.hashCode();
        }
        getThreeDSRequestorAppURL getthreedsrequestorappurl = this.cca_continue;
        if (getthreedsrequestorappurl != null) {
            hashCode ^= getthreedsrequestorappurl.hashCode();
        }
        return hashCode ^ this.configure.hashCode();
    }

    public final getThreeDSRequestorAppURL init() {
        return this.cca_continue;
    }

    public final getThreeDSRequestorAppURL onValidated() {
        return this.configure;
    }

    public getEnvironment(getBackgroundColor getbackgroundcolor) {
        if (getbackgroundcolor.getInstance.size() > 0) {
            int i = 0;
            getThreeDSRequestorAppURL onCReqSuccess = ((CardinalConfigurationParameters) getbackgroundcolor.getInstance.elementAt(0)).onCReqSuccess();
            if (onCReqSuccess instanceof ASN1ObjectIdentifier) {
                this.Cardinal = (ASN1ObjectIdentifier) onCReqSuccess;
                if (getbackgroundcolor.getInstance.size() > 1) {
                    onCReqSuccess = ((CardinalConfigurationParameters) getbackgroundcolor.getInstance.elementAt(1)).onCReqSuccess();
                    i = 1;
                } else {
                    throw new IllegalArgumentException("too few objects in input vector");
                }
            }
            if (onCReqSuccess instanceof setEnvironment) {
                this.getInstance = (setEnvironment) onCReqSuccess;
                i++;
                if (getbackgroundcolor.getInstance.size() > i) {
                    onCReqSuccess = ((CardinalConfigurationParameters) getbackgroundcolor.getInstance.elementAt(i)).onCReqSuccess();
                } else {
                    throw new IllegalArgumentException("too few objects in input vector");
                }
            }
            if (!(onCReqSuccess instanceof setEnableLogging)) {
                this.cca_continue = onCReqSuccess;
                i++;
                if (getbackgroundcolor.getInstance.size() > i) {
                    onCReqSuccess = ((CardinalConfigurationParameters) getbackgroundcolor.getInstance.elementAt(i)).onCReqSuccess();
                } else {
                    throw new IllegalArgumentException("too few objects in input vector");
                }
            }
            if (getbackgroundcolor.getInstance.size() != i + 1) {
                throw new IllegalArgumentException("input vector too large");
            } else if (onCReqSuccess instanceof setEnableLogging) {
                setEnableLogging setenablelogging = (setEnableLogging) onCReqSuccess;
                cca_continue(setenablelogging.Cardinal);
                this.configure = setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null;
            } else {
                throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
            }
        } else {
            throw new IllegalArgumentException("too few objects in input vector");
        }
    }

    public getEnvironment(ASN1ObjectIdentifier aSN1ObjectIdentifier, setEnvironment setenvironment, getThreeDSRequestorAppURL getthreedsrequestorappurl, int i, getThreeDSRequestorAppURL getthreedsrequestorappurl2) {
        this.Cardinal = aSN1ObjectIdentifier;
        this.getInstance = setenvironment;
        this.cca_continue = getthreedsrequestorappurl;
        cca_continue(i);
        this.configure = getthreedsrequestorappurl2.onCReqSuccess();
    }
}
