package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.toJSONString;
import java.math.BigInteger;

public final class set extends Sphincs256KeyFactorySpi {
    /* access modifiers changed from: protected */
    public final JSONNavi Cardinal(JSONNavi jSONNavi, BigInteger bigInteger) {
        at[] atVarArr;
        if (jSONNavi instanceof JSONNavi.init) {
            final JSONNavi.init init = (JSONNavi.init) jSONNavi;
            toJSONString.cca_continue cca_continue = (toJSONString.cca_continue) init.configure();
            int instance = cca_continue.getInstance();
            byte byteValue = cca_continue.getSDKVersion().cca_continue().byteValue();
            byte Cardinal = getSize.Cardinal(byteValue);
            at configure = getSize.configure(bigInteger, instance, byteValue, cca_continue.CardinalRenderType(), Cardinal);
            if (byteValue == 0) {
                atVarArr = getSize.configure;
            } else {
                atVarArr = getSize.getInstance;
            }
            byte[] Cardinal2 = getSize.Cardinal(Cardinal, configure, BigInteger.valueOf(16), getSize.init(Cardinal), atVarArr);
            toJSONString.cca_continue cca_continue2 = (toJSONString.cca_continue) init.configure();
            final byte byteValue2 = cca_continue2.getSDKVersion().cca_continue().byteValue();
            JSONNavi.init[] initArr = ((hasKey) cca_continue2.Cardinal(init, "bc_wtnaf", new getCurrentObject() {
                public final GMCipherSpi.SM2withRMD Cardinal(GMCipherSpi.SM2withRMD sM2withRMD) {
                    if (sM2withRMD instanceof hasKey) {
                        return sM2withRMD;
                    }
                    hasKey haskey = new hasKey();
                    haskey.Cardinal = getSize.cca_continue(init, byteValue2);
                    return haskey;
                }
            })).Cardinal;
            JSONNavi.init[] initArr2 = new JSONNavi.init[initArr.length];
            for (int i = 0; i < initArr.length; i++) {
                initArr2[i] = (JSONNavi.init) initArr[i].CardinalChallengeObserver();
            }
            JSONNavi.init init2 = (JSONNavi.init) init.configure().init();
            int i2 = 0;
            for (int length = Cardinal2.length - 1; length >= 0; length--) {
                i2++;
                byte b = Cardinal2[length];
                if (b != 0) {
                    init2 = (JSONNavi.init) init2.init(i2).cca_continue(b > 0 ? initArr[b >>> 1] : initArr2[(-b) >>> 1]);
                    i2 = 0;
                }
            }
            return i2 > 0 ? init2.init(i2) : init2;
        }
        throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
    }
}
