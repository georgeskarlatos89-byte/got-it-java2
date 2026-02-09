package com.cardinalcommerce.a;

import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalConfigurationParameters;

public final class CardinalActionCode extends valueOf {
    private static int cca_continue = 0;
    private static int getInstance = 1;

    /* renamed from: com.cardinalcommerce.a.CardinalActionCode$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        private static int cca_continue = 1;
        static final /* synthetic */ int[] configure;
        private static int getInstance;

        static {
            int[] iArr = new int[CardinalEnvironment.values().length];
            configure = iArr;
            try {
                iArr[CardinalEnvironment.STAGING.ordinal()] = 1;
                int i = cca_continue;
                int i2 = i ^ 117;
                int i3 = (i & 117) << 1;
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                getInstance = i4 % 128;
                int i5 = i4 % 2;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static String Cardinal(CardinalConfigurationParameters cardinalConfigurationParameters) {
        int i = cca_continue;
        int i2 = ((i ^ 55) | (i & 55)) << 1;
        int i3 = -(((~i) & 55) | (i & -56));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getInstance = i4 % 128;
        if (i4 % 2 != 0) {
            if (AnonymousClass5.configure[cardinalConfigurationParameters.getEnvironment().ordinal()] != 1) {
                int i5 = cca_continue;
                int i6 = (i5 & -36) | ((~i5) & 35);
                int i7 = (i5 & 35) << 1;
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                getInstance = i8 % 128;
                int i9 = i8 % 2;
                return "https://centinelapi.cardinalcommerce.com/V1/";
            }
            int i10 = cca_continue;
            int i11 = i10 & 63;
            int i12 = ((i10 ^ 63) | i11) << 1;
            int i13 = -((i10 | 63) & (~i11));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            getInstance = i14 % 128;
            if ((i14 % 2 == 0 ? 'H' : 'E') != 'H') {
                return "https://centinelapistag.cardinalcommerce.com/V1/";
            }
            int i15 = 94 / 0;
            return "https://centinelapistag.cardinalcommerce.com/V1/";
        }
        int i16 = AnonymousClass5.configure[cardinalConfigurationParameters.getEnvironment().ordinal()];
        throw null;
    }
}
