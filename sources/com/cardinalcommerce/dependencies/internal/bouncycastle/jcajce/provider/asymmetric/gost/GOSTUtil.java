package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost;

import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.Customization;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getTextFontSize;
import java.math.BigInteger;

class GOSTUtil {
    GOSTUtil() {
    }

    static String Cardinal(String str, BigInteger bigInteger, CipherSpi.PKCS1v1_5Padding pKCS1v1_5Padding) {
        StringBuffer stringBuffer = new StringBuffer();
        String instance = getTextFontSize.getInstance();
        BigInteger modPow = pKCS1v1_5Padding.Cardinal.modPow(bigInteger, pKCS1v1_5Padding.cca_continue);
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(new Customization(getBackgroundColor.getInstance(modPow.toByteArray(), pKCS1v1_5Padding.cca_continue.toByteArray(), pKCS1v1_5Padding.Cardinal.toByteArray())).toString()).append("]").append(instance);
        stringBuffer.append("                  Y: ").append(modPow.toString(16)).append(instance);
        return stringBuffer.toString();
    }

    static String cca_continue(String str, BigInteger bigInteger, CipherSpi.PKCS1v1_5Padding pKCS1v1_5Padding) {
        StringBuffer stringBuffer = new StringBuffer();
        String instance = getTextFontSize.getInstance();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(new Customization(getBackgroundColor.getInstance(bigInteger.toByteArray(), pKCS1v1_5Padding.cca_continue.toByteArray(), pKCS1v1_5Padding.Cardinal.toByteArray())).toString()).append("]").append(instance);
        stringBuffer.append("                 Y: ").append(bigInteger.toString(16)).append(instance);
        return stringBuffer.toString();
    }
}
