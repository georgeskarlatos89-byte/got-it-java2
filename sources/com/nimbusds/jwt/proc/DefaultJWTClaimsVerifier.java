package com.nimbusds.jwt.proc;

import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.util.DateUtils;
import java.util.Date;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class DefaultJWTClaimsVerifier<C extends SecurityContext> implements JWTClaimsSetVerifier<C>, JWTClaimsVerifier, ClockSkewAware {
    public static final int DEFAULT_MAX_CLOCK_SKEW_SECONDS = 60;
    private static final BadJWTException EXPIRED_JWT_EXCEPTION = new BadJWTException("Expired JWT");
    private static final BadJWTException JWT_BEFORE_USE_EXCEPTION = new BadJWTException("JWT before use time");
    private int maxClockSkew = 60;

    public int getMaxClockSkew() {
        return this.maxClockSkew;
    }

    public void setMaxClockSkew(int i) {
        this.maxClockSkew = i;
    }

    public void verify(JWTClaimsSet jWTClaimsSet) throws BadJWTException {
        verify(jWTClaimsSet, (SecurityContext) null);
    }

    public void verify(JWTClaimsSet jWTClaimsSet, C c) throws BadJWTException {
        Date date = new Date();
        Date expirationTime = jWTClaimsSet.getExpirationTime();
        if (expirationTime == null || DateUtils.isAfter(expirationTime, date, (long) this.maxClockSkew)) {
            Date notBeforeTime = jWTClaimsSet.getNotBeforeTime();
            if (notBeforeTime != null && !DateUtils.isBefore(notBeforeTime, date, (long) this.maxClockSkew)) {
                throw JWT_BEFORE_USE_EXCEPTION;
            }
            return;
        }
        throw EXPIRED_JWT_EXCEPTION;
    }
}
