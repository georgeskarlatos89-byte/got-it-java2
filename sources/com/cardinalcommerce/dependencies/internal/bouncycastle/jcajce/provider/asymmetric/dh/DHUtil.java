package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh;

import com.cardinalcommerce.a.Customization;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getTextFontSize;
import java.math.BigInteger;

class DHUtil {
    DHUtil() {
    }

    static String getInstance(String str, BigInteger bigInteger, KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF) {
        StringBuffer stringBuffer = new StringBuffer();
        String instance = getTextFontSize.getInstance();
        BigInteger modPow = x25519withSHA256CKDF.init.modPow(bigInteger, x25519withSHA256CKDF.Cardinal);
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(new Customization(getBackgroundColor.getInstance(modPow.toByteArray(), x25519withSHA256CKDF.Cardinal.toByteArray(), x25519withSHA256CKDF.init.toByteArray())).toString()).append("]").append(instance);
        stringBuffer.append("              Y: ").append(modPow.toString(16)).append(instance);
        return stringBuffer.toString();
    }

    static String cca_continue(String str, BigInteger bigInteger, KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF) {
        StringBuffer stringBuffer = new StringBuffer();
        String instance = getTextFontSize.getInstance();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(new Customization(getBackgroundColor.getInstance(bigInteger.toByteArray(), x25519withSHA256CKDF.Cardinal.toByteArray(), x25519withSHA256CKDF.init.toByteArray())).toString()).append("]").append(instance);
        stringBuffer.append("             Y: ").append(bigInteger.toString(16)).append(instance);
        return stringBuffer.toString();
    }
}
