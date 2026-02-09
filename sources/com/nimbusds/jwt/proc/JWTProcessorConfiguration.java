package com.nimbusds.jwt.proc;

import com.nimbusds.jose.proc.JOSEProcessorConfiguration;
import com.nimbusds.jose.proc.SecurityContext;

public interface JWTProcessorConfiguration<C extends SecurityContext> extends JOSEProcessorConfiguration<C> {
    JWTClaimsSetVerifier<C> getJWTClaimsSetVerifier();

    @Deprecated
    JWTClaimsVerifier getJWTClaimsVerifier();

    void setJWTClaimsSetVerifier(JWTClaimsSetVerifier<C> jWTClaimsSetVerifier);

    @Deprecated
    void setJWTClaimsVerifier(JWTClaimsVerifier jWTClaimsVerifier);
}
