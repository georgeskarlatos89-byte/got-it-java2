package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import java.math.BigInteger;
import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

public class GMSignatureSpi extends KeyAgreementSpi.CDHwithSHA1KDFAndSharedInfo {

    public interface sha256WithSM2 {
        void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD);

        boolean configure(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2);

        BigInteger init();

        BigInteger[] init(byte[] bArr);
    }

    public final class sm3WithSM2 extends Permission {
        private final Set<String> Cardinal;

        public sm3WithSM2(String str) {
            super(str);
            HashSet hashSet = new HashSet();
            this.Cardinal = hashSet;
            hashSet.add(str);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof sm3WithSM2) && this.Cardinal.equals(((sm3WithSM2) obj).Cardinal);
        }

        public final String getActions() {
            return this.Cardinal.toString();
        }

        public final int hashCode() {
            return this.Cardinal.hashCode();
        }

        public final boolean implies(Permission permission) {
            if (!(permission instanceof sm3WithSM2)) {
                return false;
            }
            sm3WithSM2 sm3withsm2 = (sm3WithSM2) permission;
            return getName().equals(sm3withsm2.getName()) || this.Cardinal.containsAll(sm3withsm2.Cardinal);
        }
    }

    public GMSignatureSpi() {
    }

    public GMSignatureSpi(String str) {
        super(str);
    }
}
