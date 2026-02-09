package com.cardinalcommerce.a;

import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;
import java.security.SecureRandom;

public class appendElement {
    public SecureRandom configure;
    public int onValidated;

    public appendElement() {
    }

    private static JSONNavi Cardinal(JSONNavi[] jSONNaviArr, JSONAwareEx jSONAwareEx, BigInteger[] bigIntegerArr) {
        int length = jSONNaviArr.length;
        int i = length << 1;
        boolean[] zArr = new boolean[i];
        getDouble[] getdoubleArr = new getDouble[i];
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            BigInteger bigInteger = bigIntegerArr[i3];
            boolean z = true;
            zArr[i3] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i4];
            if (bigInteger2.signum() >= 0) {
                z = false;
            }
            zArr[i4] = z;
            BigInteger abs2 = bigInteger2.abs();
            int max = Math.max(2, Math.min(16, get.Cardinal(Math.max(abs.bitLength(), abs2.bitLength()))));
            JSONNavi jSONNavi = jSONNaviArr[i2];
            JSONNavi instance = get.getInstance(jSONNavi, max, jSONAwareEx);
            getdoubleArr[i3] = get.cca_continue(jSONNavi);
            getdoubleArr[i4] = get.cca_continue(instance);
            bArr[i3] = get.getInstance(max, abs);
            bArr[i4] = get.getInstance(max, abs2);
        }
        return Cardinal(zArr, getdoubleArr, bArr);
    }

    public static JSONNavi cca_continue(JSONNavi jSONNavi, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        JSONNavi init = jSONNavi.configure().init();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                init = jSONNavi;
            }
            for (int i = 1; i < bitLength; i++) {
                jSONNavi = jSONNavi.getActionCode();
                if (abs.testBit(i)) {
                    init = init.cca_continue(jSONNavi);
                }
            }
        }
        return bigInteger.signum() < 0 ? init.CardinalChallengeObserver() : init;
    }

    public static boolean cca_continue(Base64 base64) {
        return base64.Cardinal() > 1 && base64.configure().equals(writeJSONString.CardinalEnvironment) && (base64 instanceof CompletionEvent);
    }

    public static void getInstance(merge[] mergeArr, int i, merge merge) {
        merge[] mergeArr2 = new merge[i];
        mergeArr2[0] = mergeArr[0];
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 >= i) {
                break;
            }
            mergeArr2[i2] = mergeArr2[i2 - 1].init(mergeArr[i2]);
        }
        int i3 = i2 - 1;
        if (merge != null) {
            mergeArr2[i3] = mergeArr2[i3].init(merge);
        }
        merge onValidated2 = mergeArr2[i3].onValidated();
        while (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = i3 + 0;
            merge merge2 = mergeArr[i5];
            mergeArr[i5] = mergeArr2[i4].init(onValidated2);
            onValidated2 = onValidated2.init(merge2);
            i3 = i4;
        }
        mergeArr[0] = onValidated2;
    }

    public static JSONNavi init(toJSONString tojsonstring, JSONNavi jSONNavi) {
        if (tojsonstring.configure(jSONNavi.configure())) {
            return tojsonstring.cca_continue(jSONNavi.Cardinal(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    static JSONNavi init(JSONNavi[] jSONNaviArr, JSONNavi[] jSONNaviArr2, byte[] bArr, JSONNavi[] jSONNaviArr3, JSONNavi[] jSONNaviArr4, byte[] bArr2) {
        JSONNavi jSONNavi;
        int max = Math.max(bArr.length, bArr2.length);
        JSONNavi init = jSONNaviArr[0].configure().init();
        int i = max - 1;
        int i2 = 0;
        JSONNavi jSONNavi2 = init;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : 0;
            byte b2 = i < bArr2.length ? bArr2[i] : 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    jSONNavi = init.cca_continue((b < 0 ? jSONNaviArr2 : jSONNaviArr)[Math.abs(b) >>> 1]);
                } else {
                    jSONNavi = init;
                }
                if (b2 != 0) {
                    jSONNavi = jSONNavi.cca_continue((b2 < 0 ? jSONNaviArr4 : jSONNaviArr3)[Math.abs(b2) >>> 1]);
                }
                if (i2 > 0) {
                    jSONNavi2 = jSONNavi2.Cardinal(i2);
                    i2 = 0;
                }
                jSONNavi2 = jSONNavi2.configure(jSONNavi);
            }
            i--;
        }
        return i2 > 0 ? jSONNavi2.Cardinal(i2) : jSONNavi2;
    }

    private static JSONNavi init(JSONNavi[] jSONNaviArr, BigInteger[] bigIntegerArr, AuthenticatedCipherText authenticatedCipherText) {
        BigInteger onCReqSuccess = jSONNaviArr[0].configure().onCReqSuccess();
        int length = jSONNaviArr.length;
        BigInteger[] bigIntegerArr2 = new BigInteger[4];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            BigInteger[] instance = authenticatedCipherText.getInstance(bigIntegerArr[i2].mod(onCReqSuccess));
            int i3 = i + 1;
            bigIntegerArr2[i] = instance[0];
            i = i3 + 1;
            bigIntegerArr2[i3] = instance[1];
        }
        return Cardinal(jSONNaviArr, authenticatedCipherText.Cardinal(), bigIntegerArr2);
    }

    public static JSONNavi cca_continue(JSONNavi jSONNavi, BigInteger bigInteger, JSONNavi jSONNavi2, BigInteger bigInteger2) {
        toJSONString configure2 = jSONNavi.configure();
        if (configure2.configure(jSONNavi2.configure())) {
            JSONNavi cca_continue = configure2.cca_continue(jSONNavi2);
            if (!(configure2 instanceof toJSONString.cca_continue) || !((toJSONString.cca_continue) configure2).values()) {
                AAD CardinalError = configure2.CardinalError();
                if (CardinalError instanceof AuthenticatedCipherText) {
                    JSONNavi init = init(new JSONNavi[]{jSONNavi, cca_continue}, new BigInteger[]{bigInteger, bigInteger2}, (AuthenticatedCipherText) CardinalError);
                    if (init.init(false, false)) {
                        return init;
                    }
                    throw new IllegalStateException("Invalid result");
                }
                JSONNavi init2 = init(jSONNavi, bigInteger, cca_continue, bigInteger2);
                if (init2.init(false, false)) {
                    return init2;
                }
                throw new IllegalStateException("Invalid result");
            }
            JSONNavi cca_continue2 = jSONNavi.Cardinal(bigInteger).cca_continue(cca_continue.Cardinal(bigInteger2));
            if (cca_continue2.init(false, false)) {
                return cca_continue2;
            }
            throw new IllegalStateException("Invalid result");
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    private static JSONNavi init(JSONNavi jSONNavi, BigInteger bigInteger, JSONNavi jSONNavi2, BigInteger bigInteger2) {
        JSONNavi[] jSONNaviArr;
        JSONNavi[] jSONNaviArr2;
        JSONNavi[] jSONNaviArr3;
        JSONNavi[] jSONNaviArr4;
        boolean z = false;
        boolean z2 = bigInteger.signum() < 0;
        if (bigInteger2.signum() < 0) {
            z = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int max = Math.max(2, Math.min(16, get.Cardinal(abs.bitLength())));
        int max2 = Math.max(2, Math.min(16, get.Cardinal(abs2.bitLength())));
        getDouble Cardinal = get.Cardinal(jSONNavi, max, true);
        getDouble Cardinal2 = get.Cardinal(jSONNavi2, max2, true);
        if (z2) {
            jSONNaviArr = Cardinal.Cardinal;
        } else {
            jSONNaviArr = Cardinal.configure;
        }
        JSONNavi[] jSONNaviArr5 = jSONNaviArr;
        if (z) {
            jSONNaviArr2 = Cardinal2.Cardinal;
        } else {
            jSONNaviArr2 = Cardinal2.configure;
        }
        JSONNavi[] jSONNaviArr6 = jSONNaviArr2;
        if (z2) {
            jSONNaviArr3 = Cardinal.configure;
        } else {
            jSONNaviArr3 = Cardinal.Cardinal;
        }
        JSONNavi[] jSONNaviArr7 = jSONNaviArr3;
        if (z) {
            jSONNaviArr4 = Cardinal2.configure;
        } else {
            jSONNaviArr4 = Cardinal2.Cardinal;
        }
        return init(jSONNaviArr5, jSONNaviArr7, get.getInstance(max, abs), jSONNaviArr6, jSONNaviArr4, get.getInstance(max2, abs2));
    }

    private static JSONNavi Cardinal(boolean[] zArr, getDouble[] getdoubleArr, byte[][] bArr) {
        JSONNavi[] jSONNaviArr;
        int i = 0;
        for (byte[] length : bArr) {
            i = Math.max(i, length.length);
        }
        JSONNavi init = getdoubleArr[0].configure[0].configure().init();
        int i2 = i - 1;
        int i3 = 0;
        JSONNavi jSONNavi = init;
        while (i2 >= 0) {
            JSONNavi jSONNavi2 = init;
            for (int i4 = 0; i4 < r0; i4++) {
                byte[] bArr2 = bArr[i4];
                byte b = i2 < bArr2.length ? bArr2[i2] : 0;
                if (b != 0) {
                    int abs = Math.abs(b);
                    getDouble getdouble = getdoubleArr[i4];
                    if ((b < 0) == zArr[i4]) {
                        jSONNaviArr = getdouble.configure;
                    } else {
                        jSONNaviArr = getdouble.Cardinal;
                    }
                    jSONNavi2 = jSONNavi2.cca_continue(jSONNaviArr[abs >>> 1]);
                }
            }
            if (jSONNavi2 == init) {
                i3++;
            } else {
                if (i3 > 0) {
                    jSONNavi = jSONNavi.Cardinal(i3);
                    i3 = 0;
                }
                jSONNavi = jSONNavi.configure(jSONNavi2);
            }
            i2--;
        }
        return i3 > 0 ? jSONNavi.Cardinal(i3) : jSONNavi;
    }

    public appendElement(SecureRandom secureRandom, int i) {
        this.configure = secureRandom;
        this.onValidated = i;
    }
}
