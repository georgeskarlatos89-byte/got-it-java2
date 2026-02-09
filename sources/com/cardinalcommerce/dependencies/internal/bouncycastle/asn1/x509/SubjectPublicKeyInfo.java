package com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.CardinalConfigurationParameters;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getDeviceFingerprint;
import com.cardinalcommerce.a.getProcessorTransactionId;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setRenderType;
import java.io.IOException;
import java.util.Enumeration;

public class SubjectPublicKeyInfo extends setRenderType {
    public getDeviceFingerprint Cardinal;
    public BCDSAPrivateKey cca_continue;

    public SubjectPublicKeyInfo(BCDSAPrivateKey bCDSAPrivateKey, CardinalConfigurationParameters cardinalConfigurationParameters) throws IOException {
        this.Cardinal = new getDeviceFingerprint(cardinalConfigurationParameters);
        this.cca_continue = bCDSAPrivateKey;
    }

    public SubjectPublicKeyInfo(BCDSAPrivateKey bCDSAPrivateKey, byte[] bArr) {
        this.Cardinal = new getDeviceFingerprint(bArr);
        this.cca_continue = bCDSAPrivateKey;
    }

    public static SubjectPublicKeyInfo configure(Object obj) {
        if (obj instanceof SubjectPublicKeyInfo) {
            return (SubjectPublicKeyInfo) obj;
        }
        if (obj != null) {
            return new SubjectPublicKeyInfo(isEnableLogging.getInstance(obj));
        }
        return null;
    }

    private SubjectPublicKeyInfo(isEnableLogging isenablelogging) {
        if (isenablelogging.cca_continue() == 2) {
            Enumeration init = isenablelogging.init();
            Object nextElement = init.nextElement();
            this.cca_continue = nextElement instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) nextElement : nextElement != null ? new BCDSAPrivateKey(isEnableLogging.getInstance(nextElement)) : null;
            this.Cardinal = getDeviceFingerprint.Cardinal(init.nextElement());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder("Bad sequence size: ").append(isenablelogging.cca_continue()).toString());
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(this.cca_continue);
        getbackgroundcolor.getInstance.addElement(this.Cardinal);
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
