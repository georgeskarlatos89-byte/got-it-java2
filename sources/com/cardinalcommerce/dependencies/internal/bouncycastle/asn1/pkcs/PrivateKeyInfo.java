package com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getDeviceFingerprint;
import com.cardinalcommerce.a.getPayment;
import com.cardinalcommerce.a.getProcessorTransactionId;
import com.cardinalcommerce.a.getRequestTimeout;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setCornerRadius;
import com.cardinalcommerce.a.setEnableDFSync;
import com.cardinalcommerce.a.setEnableLogging;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.a.setEnvironment;
import com.cardinalcommerce.a.setRenderType;
import com.cardinalcommerce.a.setUICustomization;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;

public class PrivateKeyInfo extends setRenderType {
    public setUICustomization Cardinal;
    public BCDSAPrivateKey cca_continue;
    public getRequestTimeout configure;
    public setEnableDFSync getInstance;
    private setEnvironment init;

    public PrivateKeyInfo(BCDSAPrivateKey bCDSAPrivateKey, CardinalConfigurationParameters cardinalConfigurationParameters) throws IOException {
        this(bCDSAPrivateKey, cardinalConfigurationParameters, (setEnableDFSync) null, (byte[]) null);
    }

    public PrivateKeyInfo(BCDSAPrivateKey bCDSAPrivateKey, CardinalConfigurationParameters cardinalConfigurationParameters, setEnableDFSync setenabledfsync) throws IOException {
        this(bCDSAPrivateKey, cardinalConfigurationParameters, setenabledfsync, (byte[]) null);
    }

    public PrivateKeyInfo(BCDSAPrivateKey bCDSAPrivateKey, CardinalConfigurationParameters cardinalConfigurationParameters, setEnableDFSync setenabledfsync, byte[] bArr) throws IOException {
        this.init = new setEnvironment(bArr != null ? setCornerRadius.Cardinal : setCornerRadius.init);
        this.cca_continue = bCDSAPrivateKey;
        this.Cardinal = new setEnabledVisaCheckout(cardinalConfigurationParameters);
        this.getInstance = setenabledfsync;
        this.configure = bArr == null ? null : new getDeviceFingerprint(bArr);
    }

    public static PrivateKeyInfo cca_continue(Object obj) {
        if (obj instanceof PrivateKeyInfo) {
            return (PrivateKeyInfo) obj;
        }
        if (obj != null) {
            return new PrivateKeyInfo(isEnableLogging.getInstance(obj));
        }
        return null;
    }

    private PrivateKeyInfo(isEnableLogging isenablelogging) {
        Enumeration init2 = isenablelogging.init();
        setEnvironment instance = setEnvironment.getInstance(init2.nextElement());
        this.init = instance;
        BigInteger bigInteger = new BigInteger(instance.getInstance);
        if (bigInteger.compareTo(setCornerRadius.init) < 0 || bigInteger.compareTo(setCornerRadius.Cardinal) > 0) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        int intValue = bigInteger.intValue();
        Object nextElement = init2.nextElement();
        this.cca_continue = nextElement instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) nextElement : nextElement != null ? new BCDSAPrivateKey(isEnableLogging.getInstance(nextElement)) : null;
        this.Cardinal = setUICustomization.init(init2.nextElement());
        int i = -1;
        while (init2.hasMoreElements()) {
            setEnableLogging setenablelogging = (setEnableLogging) init2.nextElement();
            int i2 = setenablelogging.Cardinal;
            if (i2 > i) {
                if (i2 == 0) {
                    this.getInstance = setEnableDFSync.init(setenablelogging);
                } else if (i2 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                } else if (intValue > 0) {
                    this.configure = getDeviceFingerprint.Cardinal(setenablelogging);
                } else {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                i = i2;
            } else {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
        }
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(this.init);
        getbackgroundcolor.getInstance.addElement(this.cca_continue);
        getbackgroundcolor.getInstance.addElement(this.Cardinal);
        if (this.getInstance != null) {
            getbackgroundcolor.getInstance.addElement(new getPayment(false, 0, this.getInstance));
        }
        if (this.configure != null) {
            getbackgroundcolor.getInstance.addElement(new getPayment(false, 1, this.configure));
        }
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
