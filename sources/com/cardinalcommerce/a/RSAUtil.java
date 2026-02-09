package com.cardinalcommerce.a;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

public final class RSAUtil extends BasicPermission {
    private final int Cardinal;
    private final String configure;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RSAUtil) {
            RSAUtil rSAUtil = (RSAUtil) obj;
            return this.Cardinal == rSAUtil.Cardinal && getName().equals(rSAUtil.getName());
        }
    }

    public final String getActions() {
        return this.configure;
    }

    public final int hashCode() {
        return getName().hashCode() + this.Cardinal;
    }

    public final boolean implies(Permission permission) {
        if (!(permission instanceof RSAUtil) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.Cardinal;
        int i2 = ((RSAUtil) permission).Cardinal;
        return (i & i2) == i2;
    }

    public RSAUtil(String str, String str2) {
        super(str, str2);
        this.configure = str2;
        StringTokenizer stringTokenizer = new StringTokenizer(getTextFontSize.Cardinal(str2), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            this.Cardinal = i;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }
}
