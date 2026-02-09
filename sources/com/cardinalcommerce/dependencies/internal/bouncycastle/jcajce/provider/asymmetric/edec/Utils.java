package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.a.BCElGamalPublicKey;
import com.cardinalcommerce.a.Customization;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.getHeadingTextFontName;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.a.setCCAImageUri;

class Utils {
    Utils() {
    }

    static boolean configure(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !configure(bArr, bArr);
        }
        byte b = 0;
        for (int i = 0; i != bArr.length; i++) {
            b |= bArr[i] ^ bArr2[i];
        }
        return b == 0;
    }

    static String Cardinal(String str, String str2, setCCAImageUri setccaimageuri) {
        StringBuffer stringBuffer = new StringBuffer();
        String instance = getTextFontSize.getInstance();
        byte[] bArr = null;
        if (setccaimageuri instanceof DigestSignatureSpi.SHA3_512) {
            byte[] bArr2 = ((DigestSignatureSpi.SHA3_512) setccaimageuri).Cardinal;
            if (bArr2 != null) {
                bArr = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            }
        } else if (setccaimageuri instanceof BCElGamalPublicKey) {
            byte[] bArr3 = ((BCElGamalPublicKey) setccaimageuri).configure;
            if (bArr3 != null) {
                bArr = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
            }
        } else if (setccaimageuri instanceof DigestSignatureSpi.SHA3_224) {
            byte[] bArr4 = ((DigestSignatureSpi.SHA3_224) setccaimageuri).getInstance;
            if (bArr4 != null) {
                bArr = new byte[bArr4.length];
                System.arraycopy(bArr4, 0, bArr, 0, bArr4.length);
            }
        } else {
            byte[] bArr5 = ((KeyPairGeneratorSpi.X25519) setccaimageuri).getInstance;
            if (bArr5 != null) {
                bArr = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr, 0, bArr5.length);
            }
        }
        stringBuffer.append(str2).append(" ").append(str).append(" [").append(new Customization(bArr).toString()).append("]").append(instance).append("    public data: ").append(getHeadingTextFontName.configure(bArr)).append(instance);
        return stringBuffer.toString();
    }
}
