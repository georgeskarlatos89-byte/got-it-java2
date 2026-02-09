package com.cardinalcommerce.a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

public abstract class setUICustomization extends getThreeDSRequestorAppURL implements getUICustomization {
    byte[] getInstance;

    public setUICustomization(byte[] bArr) {
        if (bArr != null) {
            this.getInstance = bArr;
            return;
        }
        throw new NullPointerException("string cannot be null");
    }

    public static setUICustomization init(Object obj) {
        if (obj == null || (obj instanceof setUICustomization)) {
            return (setUICustomization) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return init(getThreeDSRequestorAppURL.Cardinal((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(new StringBuilder("failed to construct OCTET STRING from byte[]: ").append(e.getMessage()).toString());
            }
        } else {
            if (obj instanceof CardinalConfigurationParameters) {
                getThreeDSRequestorAppURL onCReqSuccess = ((CardinalConfigurationParameters) obj).onCReqSuccess();
                if (onCReqSuccess instanceof setUICustomization) {
                    return (setUICustomization) onCReqSuccess;
                }
            }
            throw new IllegalArgumentException(new StringBuilder("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public final InputStream cca_continue() {
        return new ByteArrayInputStream(this.getInstance);
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof setUICustomization)) {
            return false;
        }
        return getBackgroundColor.Cardinal(this.getInstance, ((setUICustomization) getthreedsrequestorappurl).getInstance);
    }

    /* access modifiers changed from: package-private */
    public abstract void getInstance(getRenderType getrendertype) throws IOException;

    public byte[] getInstance() {
        return this.getInstance;
    }

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getSDKVersion() {
        return new setEnabledVisaCheckout(this.getInstance);
    }

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getWarnings() {
        return new setEnabledVisaCheckout(this.getInstance);
    }

    public int hashCode() {
        return getBackgroundColor.init(getInstance());
    }

    public final getThreeDSRequestorAppURL init() {
        return onCReqSuccess();
    }

    public String toString() {
        return new StringBuilder("#").append(getTextFontSize.getInstance(getHeadingTextFontName.init(this.getInstance))).toString();
    }

    public static setUICustomization init(setEnableLogging setenablelogging, boolean z) {
        getThreeDSRequestorAppURL onCReqSuccess = setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null;
        if (z || (onCReqSuccess instanceof setUICustomization)) {
            return init(onCReqSuccess);
        }
        isEnableLogging instance = isEnableLogging.getInstance((Object) onCReqSuccess);
        setUICustomization[] setuicustomizationArr = new setUICustomization[instance.cca_continue()];
        Enumeration init = instance.init();
        int i = 0;
        while (init.hasMoreElements()) {
            setuicustomizationArr[i] = (setUICustomization) init.nextElement();
            i++;
        }
        return new getEciFlag(setuicustomizationArr);
    }
}
