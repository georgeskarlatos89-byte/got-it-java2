package com.cardinalcommerce.a;

public final class BCDSAPublicKey extends setRenderType {
    public setChallengeTimeout Cardinal = setChallengeTimeout.init(false);
    public setEnvironment configure = null;

    public BCDSAPublicKey(isEnableLogging isenablelogging) {
        if (isenablelogging.cca_continue() == 0) {
            this.Cardinal = null;
            this.configure = null;
            return;
        }
        if (isenablelogging.init(0) instanceof setChallengeTimeout) {
            this.Cardinal = setChallengeTimeout.getInstance((Object) isenablelogging.init(0));
        } else {
            this.Cardinal = null;
            this.configure = setEnvironment.getInstance((Object) isenablelogging.init(0));
        }
        if (isenablelogging.cca_continue() <= 1) {
            return;
        }
        if (this.Cardinal != null) {
            this.configure = setEnvironment.getInstance((Object) isenablelogging.init(1));
            return;
        }
        throw new IllegalArgumentException("wrong sequence in constructor");
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        setChallengeTimeout setchallengetimeout = this.Cardinal;
        if (setchallengetimeout != null) {
            getbackgroundcolor.getInstance.addElement(setchallengetimeout);
        }
        setEnvironment setenvironment = this.configure;
        if (setenvironment != null) {
            getbackgroundcolor.getInstance.addElement(setenvironment);
        }
        return new getProcessorTransactionId(getbackgroundcolor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if ((r1.init[0] != 0) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if ((r1.init[0] != 0) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r4 = this;
            com.cardinalcommerce.a.setEnvironment r0 = r4.configure
            java.lang.String r1 = "BasicConstraints: isCa("
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0034
            com.cardinalcommerce.a.setChallengeTimeout r0 = r4.Cardinal
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "BasicConstraints: isCa(false)"
            return r0
        L_0x000f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            com.cardinalcommerce.a.setChallengeTimeout r1 = r4.Cardinal
            if (r1 == 0) goto L_0x0024
            byte[] r1 = r1.init
            byte r1 = r1[r3]
            if (r1 == 0) goto L_0x0020
            r1 = r2
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0034:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            com.cardinalcommerce.a.setChallengeTimeout r1 = r4.Cardinal
            if (r1 == 0) goto L_0x0049
            byte[] r1 = r1.init
            byte r1 = r1[r3]
            if (r1 == 0) goto L_0x0045
            r1 = r2
            goto L_0x0046
        L_0x0045:
            r1 = r3
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "), pathLenConstraint = "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.cardinalcommerce.a.setEnvironment r1 = r4.configure
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r1 = r1.getInstance
            r2.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.BCDSAPublicKey.toString():java.lang.String");
    }
}
