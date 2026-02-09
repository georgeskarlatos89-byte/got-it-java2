package org.apache.http.impl.conn;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSchemeSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    private final Log log = LogFactory.getLog(getClass());
    protected final SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry2) {
        if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            return;
        }
        throw new IllegalArgumentException("Scheme registry amy not be null");
    }

    public OperatedClientConnection createConnection() {
        return new DefaultClientConnection();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openConnection(org.apache.http.conn.OperatedClientConnection r17, org.apache.http.HttpHost r18, java.net.InetAddress r19, org.apache.http.protocol.HttpContext r20, org.apache.http.params.HttpParams r21) throws java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            if (r2 == 0) goto L_0x00e3
            if (r3 == 0) goto L_0x00db
            if (r5 == 0) goto L_0x00d3
            boolean r0 = r17.isOpen()
            if (r0 != 0) goto L_0x00cb
            org.apache.http.conn.scheme.SchemeRegistry r0 = r1.schemeRegistry
            java.lang.String r6 = r18.getSchemeName()
            org.apache.http.conn.scheme.Scheme r0 = r0.getScheme((java.lang.String) r6)
            org.apache.http.conn.scheme.SchemeSocketFactory r6 = r0.getSchemeSocketFactory()
            java.lang.String r7 = r18.getHostName()
            java.net.InetAddress[] r7 = r1.resolveHostname(r7)
            int r8 = r18.getPort()
            int r8 = r0.resolvePort(r8)
            r9 = 0
            r10 = r9
        L_0x0036:
            int r0 = r7.length
            if (r10 >= r0) goto L_0x00ca
            r0 = r7[r10]
            int r11 = r7.length
            r12 = 1
            int r11 = r11 - r12
            if (r10 != r11) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r12 = r9
        L_0x0042:
            java.net.Socket r11 = r6.createSocket(r5)
            r2.opening(r11, r3)
            org.apache.http.impl.conn.HttpInetSocketAddress r13 = new org.apache.http.impl.conn.HttpInetSocketAddress
            r13.<init>(r3, r0, r8)
            if (r4 == 0) goto L_0x0056
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r4, r9)
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            org.apache.commons.logging.Log r14 = r1.log
            boolean r14 = r14.isDebugEnabled()
            if (r14 == 0) goto L_0x0073
            org.apache.commons.logging.Log r14 = r1.log
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r9 = "Connecting to "
            r15.<init>(r9)
            java.lang.StringBuilder r9 = r15.append(r13)
            java.lang.String r9 = r9.toString()
            r14.debug(r9)
        L_0x0073:
            java.net.Socket r0 = r6.connectSocket(r11, r13, r0, r5)     // Catch:{ ConnectException -> 0x0098, ConnectTimeoutException -> 0x0091 }
            if (r11 == r0) goto L_0x0080
            r2.opening(r0, r3)     // Catch:{ ConnectException -> 0x0098, ConnectTimeoutException -> 0x0091 }
            r9 = r20
            r11 = r0
            goto L_0x0082
        L_0x0080:
            r9 = r20
        L_0x0082:
            r1.prepareSocket(r11, r9, r5)     // Catch:{ ConnectException -> 0x008f, ConnectTimeoutException -> 0x008d }
            boolean r0 = r6.isSecure(r11)     // Catch:{ ConnectException -> 0x008f, ConnectTimeoutException -> 0x008d }
            r2.openCompleted(r0, r5)     // Catch:{ ConnectException -> 0x008f, ConnectTimeoutException -> 0x008d }
            return
        L_0x008d:
            r0 = move-exception
            goto L_0x0094
        L_0x008f:
            r0 = move-exception
            goto L_0x009b
        L_0x0091:
            r0 = move-exception
            r9 = r20
        L_0x0094:
            if (r12 != 0) goto L_0x0097
            goto L_0x009d
        L_0x0097:
            throw r0
        L_0x0098:
            r0 = move-exception
            r9 = r20
        L_0x009b:
            if (r12 != 0) goto L_0x00c4
        L_0x009d:
            org.apache.commons.logging.Log r0 = r1.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L_0x00bf
            org.apache.commons.logging.Log r0 = r1.log
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Connect to "
            r11.<init>(r12)
            java.lang.StringBuilder r11 = r11.append(r13)
            java.lang.String r12 = " timed out. Connection will be retried using another IP address"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            r0.debug(r11)
        L_0x00bf:
            int r10 = r10 + 1
            r9 = 0
            goto L_0x0036
        L_0x00c4:
            org.apache.http.conn.HttpHostConnectException r2 = new org.apache.http.conn.HttpHostConnectException
            r2.<init>(r3, r0)
            throw r2
        L_0x00ca:
            return
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Connection must not be open"
            r0.<init>(r2)
            throw r0
        L_0x00d3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Parameters may not be null"
            r0.<init>(r2)
            throw r0
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Target host may not be null"
            r0.<init>(r2)
            throw r0
        L_0x00e3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Connection may not be null"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams):void");
    }

    public void updateSecureConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, HttpContext httpContext, HttpParams httpParams) throws IOException {
        if (operatedClientConnection == null) {
            throw new IllegalArgumentException("Connection may not be null");
        } else if (httpHost == null) {
            throw new IllegalArgumentException("Target host may not be null");
        } else if (httpParams == null) {
            throw new IllegalArgumentException("Parameters may not be null");
        } else if (operatedClientConnection.isOpen()) {
            Scheme scheme = this.schemeRegistry.getScheme(httpHost.getSchemeName());
            if (scheme.getSchemeSocketFactory() instanceof LayeredSchemeSocketFactory) {
                LayeredSchemeSocketFactory layeredSchemeSocketFactory = (LayeredSchemeSocketFactory) scheme.getSchemeSocketFactory();
                try {
                    Socket createLayeredSocket = layeredSchemeSocketFactory.createLayeredSocket(operatedClientConnection.getSocket(), httpHost.getHostName(), httpHost.getPort(), true);
                    prepareSocket(createLayeredSocket, httpContext, httpParams);
                    operatedClientConnection.update(createLayeredSocket, httpHost, layeredSchemeSocketFactory.isSecure(createLayeredSocket), httpParams);
                } catch (ConnectException e) {
                    throw new HttpHostConnectException(httpHost, e);
                }
            } else {
                throw new IllegalArgumentException("Target scheme (" + scheme.getName() + ") must have layered socket factory.");
            }
        } else {
            throw new IllegalStateException("Connection must be open");
        }
    }

    /* access modifiers changed from: protected */
    public void prepareSocket(Socket socket, HttpContext httpContext, HttpParams httpParams) throws IOException {
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        int linger = HttpConnectionParams.getLinger(httpParams);
        if (linger >= 0) {
            socket.setSoLinger(linger > 0, linger);
        }
    }

    /* access modifiers changed from: protected */
    public InetAddress[] resolveHostname(String str) throws UnknownHostException {
        return InetAddress.getAllByName(str);
    }
}
