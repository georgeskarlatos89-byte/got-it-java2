package org.apache.http.impl.auth;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.Oid;

public class NegotiateScheme extends AuthSchemeBase {
    private static final String KERBEROS_OID = "1.2.840.113554.1.2.2";
    private static final String SPNEGO_OID = "1.3.6.1.5.5.2";
    private GSSContext gssContext;
    private final Log log;
    private Oid negotiationOid;
    private final SpnegoTokenGenerator spengoGenerator;
    private State state;
    private final boolean stripPort;
    private byte[] token;

    enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    public String getRealm() {
        return null;
    }

    public String getSchemeName() {
        return "Negotiate";
    }

    public boolean isConnectionBased() {
        return true;
    }

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator, boolean z) {
        this.log = LogFactory.getLog(getClass());
        this.gssContext = null;
        this.negotiationOid = null;
        this.state = State.UNINITIATED;
        this.spengoGenerator = spnegoTokenGenerator;
        this.stripPort = z;
    }

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator) {
        this(spnegoTokenGenerator, false);
    }

    public NegotiateScheme() {
        this((SpnegoTokenGenerator) null, false);
    }

    public boolean isComplete() {
        return this.state == State.TOKEN_GENERATED || this.state == State.FAILED;
    }

    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        return authenticate(credentials, httpRequest, (HttpContext) null);
    }

    /* access modifiers changed from: protected */
    public GSSManager getManager() {
        return GSSManager.getInstance();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0159, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015a, code lost:
        r7.state = org.apache.http.impl.auth.NegotiateScheme.State.FAILED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0167, code lost:
        throw new org.apache.http.auth.AuthenticationException(r8.getMessage());
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0159 A[ExcHandler: IOException (r8v6 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:4:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.Header authenticate(org.apache.http.auth.Credentials r8, org.apache.http.HttpRequest r9, org.apache.http.protocol.HttpContext r10) throws org.apache.http.auth.AuthenticationException {
        /*
            r7 = this;
            java.lang.String r8 = "Negotiate "
            java.lang.String r0 = "Sending response '"
            java.lang.String r1 = "HTTP@"
            java.lang.String r2 = "init "
            if (r9 == 0) goto L_0x01ce
            org.apache.http.impl.auth.NegotiateScheme$State r9 = r7.state
            org.apache.http.impl.auth.NegotiateScheme$State r3 = org.apache.http.impl.auth.NegotiateScheme.State.CHALLENGE_RECEIVED
            if (r9 != r3) goto L_0x01c6
            boolean r9 = r7.isProxy()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r9 == 0) goto L_0x0019
            java.lang.String r9 = "http.proxy_host"
            goto L_0x001b
        L_0x0019:
            java.lang.String r9 = "http.target_host"
        L_0x001b:
            java.lang.Object r9 = r10.getAttribute(r9)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.apache.http.HttpHost r9 = (org.apache.http.HttpHost) r9     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r9 == 0) goto L_0x0151
            boolean r10 = r7.stripPort     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r10 != 0) goto L_0x0032
            int r10 = r9.getPort()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r10 <= 0) goto L_0x0032
            java.lang.String r9 = r9.toHostString()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            goto L_0x0036
        L_0x0032:
            java.lang.String r9 = r9.getHostName()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
        L_0x0036:
            org.apache.commons.logging.Log r10 = r7.log     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            boolean r10 = r10.isDebugEnabled()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r10 == 0) goto L_0x0050
            org.apache.commons.logging.Log r10 = r7.log     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r3.<init>(r2)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.StringBuilder r2 = r3.append(r9)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r2 = r2.toString()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r10.debug(r2)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
        L_0x0050:
            org.ietf.jgss.Oid r10 = new org.ietf.jgss.Oid     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r2 = "1.3.6.1.5.5.2"
            r10.<init>(r2)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r7.negotiationOid = r10     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r10 = 0
            r2 = 1
            r3 = 0
            org.ietf.jgss.GSSManager r4 = r7.getManager()     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            r5.<init>(r1)     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            java.lang.StringBuilder r5 = r5.append(r9)     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            java.lang.String r5 = r5.toString()     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            org.ietf.jgss.Oid r6 = org.ietf.jgss.GSSName.NT_HOSTBASED_SERVICE     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            org.ietf.jgss.GSSName r5 = r4.createName(r5, r6)     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            org.ietf.jgss.Oid r6 = r7.negotiationOid     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            org.ietf.jgss.GSSName r5 = r5.canonicalize(r6)     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            org.ietf.jgss.Oid r6 = r7.negotiationOid     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            org.ietf.jgss.GSSContext r4 = r4.createContext(r5, r6, r10, r3)     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            r7.gssContext = r4     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            r4.requestMutualAuth(r2)     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            org.ietf.jgss.GSSContext r4 = r7.gssContext     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            r4.requestCredDeleg(r2)     // Catch:{ GSSException -> 0x008b, IOException -> 0x0159 }
            r4 = r3
            goto L_0x009b
        L_0x008b:
            r4 = move-exception
            int r5 = r4.getMajor()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r6 = 2
            if (r5 != r6) goto L_0x0150
            org.apache.commons.logging.Log r4 = r7.log     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r5 = "GSSException BAD_MECH, retry with Kerberos MECH"
            r4.debug(r5)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r4 = r2
        L_0x009b:
            java.lang.String r5 = "1.2.840.113554.1.2.2"
            if (r4 == 0) goto L_0x00da
            org.apache.commons.logging.Log r4 = r7.log     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r6 = "Using Kerberos MECH 1.2.840.113554.1.2.2"
            r4.debug(r6)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.ietf.jgss.Oid r4 = new org.ietf.jgss.Oid     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r4.<init>(r5)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r7.negotiationOid = r4     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.ietf.jgss.GSSManager r4 = r7.getManager()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r6.<init>(r1)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.StringBuilder r9 = r6.append(r9)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r9 = r9.toString()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.ietf.jgss.Oid r1 = org.ietf.jgss.GSSName.NT_HOSTBASED_SERVICE     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.ietf.jgss.GSSName r9 = r4.createName(r9, r1)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.ietf.jgss.Oid r1 = r7.negotiationOid     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.ietf.jgss.GSSName r9 = r9.canonicalize(r1)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.ietf.jgss.Oid r1 = r7.negotiationOid     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.ietf.jgss.GSSContext r9 = r4.createContext(r9, r1, r10, r3)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r7.gssContext = r9     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r9.requestMutualAuth(r2)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.ietf.jgss.GSSContext r9 = r7.gssContext     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r9.requestCredDeleg(r2)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
        L_0x00da:
            byte[] r9 = r7.token     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r9 != 0) goto L_0x00e2
            byte[] r9 = new byte[r3]     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r7.token = r9     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
        L_0x00e2:
            org.ietf.jgss.GSSContext r9 = r7.gssContext     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            byte[] r10 = r7.token     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            int r1 = r10.length     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            byte[] r9 = r9.initSecContext(r10, r3, r1)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r7.token = r9     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r9 == 0) goto L_0x0144
            org.apache.http.impl.auth.SpnegoTokenGenerator r9 = r7.spengoGenerator     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r9 == 0) goto L_0x0109
            org.ietf.jgss.Oid r9 = r7.negotiationOid     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r9 = r9.toString()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            boolean r9 = r9.equals(r5)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r9 == 0) goto L_0x0109
            org.apache.http.impl.auth.SpnegoTokenGenerator r9 = r7.spengoGenerator     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            byte[] r10 = r7.token     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            byte[] r9 = r9.generateSpnegoDERObject(r10)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r7.token = r9     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
        L_0x0109:
            org.apache.http.impl.auth.NegotiateScheme$State r9 = org.apache.http.impl.auth.NegotiateScheme.State.TOKEN_GENERATED     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r7.state = r9     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r9 = new java.lang.String     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            byte[] r10 = r7.token     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            byte[] r10 = org.apache.commons.codec.binary.Base64.encodeBase64(r10, r3)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r9.<init>(r10)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.apache.commons.logging.Log r10 = r7.log     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            boolean r10 = r10.isDebugEnabled()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            if (r10 == 0) goto L_0x0138
            org.apache.commons.logging.Log r10 = r7.log     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r1.<init>(r0)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.StringBuilder r0 = r1.append(r9)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r1 = "' back to the auth server"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r0 = r0.toString()     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r10.debug(r0)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
        L_0x0138:
            org.apache.http.message.BasicHeader r10 = new org.apache.http.message.BasicHeader     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r0 = "Authorization"
            java.lang.String r8 = r8.concat(r9)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r10.<init>(r0, r8)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            return r10
        L_0x0144:
            org.apache.http.impl.auth.NegotiateScheme$State r8 = org.apache.http.impl.auth.NegotiateScheme.State.FAILED     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            r7.state = r8     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            org.apache.http.auth.AuthenticationException r8 = new org.apache.http.auth.AuthenticationException     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r9 = "GSS security context initialization failed"
            r8.<init>(r9)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            throw r8     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
        L_0x0150:
            throw r4     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
        L_0x0151:
            org.apache.http.auth.AuthenticationException r8 = new org.apache.http.auth.AuthenticationException     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            java.lang.String r9 = "Authentication host is not set in the execution context"
            r8.<init>(r9)     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
            throw r8     // Catch:{ GSSException -> 0x0168, IOException -> 0x0159 }
        L_0x0159:
            r8 = move-exception
            org.apache.http.impl.auth.NegotiateScheme$State r9 = org.apache.http.impl.auth.NegotiateScheme.State.FAILED
            r7.state = r9
            org.apache.http.auth.AuthenticationException r9 = new org.apache.http.auth.AuthenticationException
            java.lang.String r8 = r8.getMessage()
            r9.<init>(r8)
            throw r9
        L_0x0168:
            r8 = move-exception
            org.apache.http.impl.auth.NegotiateScheme$State r9 = org.apache.http.impl.auth.NegotiateScheme.State.FAILED
            r7.state = r9
            int r9 = r8.getMajor()
            r10 = 9
            if (r9 == r10) goto L_0x01bc
            int r9 = r8.getMajor()
            r10 = 8
            if (r9 == r10) goto L_0x01bc
            int r9 = r8.getMajor()
            r10 = 13
            if (r9 == r10) goto L_0x01b2
            int r9 = r8.getMajor()
            r10 = 10
            if (r9 == r10) goto L_0x01a8
            int r9 = r8.getMajor()
            r10 = 19
            if (r9 == r10) goto L_0x01a8
            int r9 = r8.getMajor()
            r10 = 20
            if (r9 != r10) goto L_0x019e
            goto L_0x01a8
        L_0x019e:
            org.apache.http.auth.AuthenticationException r9 = new org.apache.http.auth.AuthenticationException
            java.lang.String r8 = r8.getMessage()
            r9.<init>(r8)
            throw r9
        L_0x01a8:
            org.apache.http.auth.AuthenticationException r9 = new org.apache.http.auth.AuthenticationException
            java.lang.String r10 = r8.getMessage()
            r9.<init>(r10, r8)
            throw r9
        L_0x01b2:
            org.apache.http.auth.InvalidCredentialsException r9 = new org.apache.http.auth.InvalidCredentialsException
            java.lang.String r10 = r8.getMessage()
            r9.<init>(r10, r8)
            throw r9
        L_0x01bc:
            org.apache.http.auth.InvalidCredentialsException r9 = new org.apache.http.auth.InvalidCredentialsException
            java.lang.String r10 = r8.getMessage()
            r9.<init>(r10, r8)
            throw r9
        L_0x01c6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Negotiation authentication process has not been initiated"
            r8.<init>(r9)
            throw r8
        L_0x01ce:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "HTTP request may not be null"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.auth.NegotiateScheme.authenticate(org.apache.http.auth.Credentials, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.Header");
    }

    public String getParameter(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("Parameter name may not be null");
    }

    /* access modifiers changed from: protected */
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException {
        String substringTrimmed = charArrayBuffer.substringTrimmed(i, i2);
        if (this.log.isDebugEnabled()) {
            this.log.debug("Received challenge '" + substringTrimmed + "' from the auth server");
        }
        if (this.state == State.UNINITIATED) {
            this.token = new Base64().decode(substringTrimmed.getBytes());
            this.state = State.CHALLENGE_RECEIVED;
            return;
        }
        this.log.debug("Authentication already attempted");
        this.state = State.FAILED;
    }
}
