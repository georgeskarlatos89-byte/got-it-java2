package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.RemoteKeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKMatcher;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jose.util.ResourceRetriever;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class RemoteJWKSet<C extends SecurityContext> implements JWKSource<C> {
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 250;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 250;
    public static final int DEFAULT_HTTP_SIZE_LIMIT = 51200;
    private final AtomicReference<JWKSet> cachedJWKSet;
    private final ResourceRetriever jwkSetRetriever;
    private final URL jwkSetURL;

    public RemoteJWKSet(URL url) {
        this(url, (ResourceRetriever) null);
    }

    public RemoteJWKSet(URL url, ResourceRetriever resourceRetriever) {
        this.cachedJWKSet = new AtomicReference<>();
        if (url != null) {
            this.jwkSetURL = url;
            if (resourceRetriever != null) {
                this.jwkSetRetriever = resourceRetriever;
            } else {
                this.jwkSetRetriever = new DefaultResourceRetriever(250, 250, DEFAULT_HTTP_SIZE_LIMIT);
            }
        } else {
            throw new IllegalArgumentException("The JWK set URL must not be null");
        }
    }

    private JWKSet updateJWKSetFromURL() throws RemoteKeySourceException {
        try {
            try {
                JWKSet parse = JWKSet.parse(this.jwkSetRetriever.retrieveResource(this.jwkSetURL).getContent());
                this.cachedJWKSet.set(parse);
                return parse;
            } catch (ParseException e) {
                throw new RemoteKeySourceException("Couldn't parse remote JWK set: " + e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new RemoteKeySourceException("Couldn't retrieve remote JWK set: " + e2.getMessage(), e2);
        }
    }

    public URL getJWKSetURL() {
        return this.jwkSetURL;
    }

    public ResourceRetriever getResourceRetriever() {
        return this.jwkSetRetriever;
    }

    public JWKSet getCachedJWKSet() {
        return this.cachedJWKSet.get();
    }

    protected static String getFirstSpecifiedKeyID(JWKMatcher jWKMatcher) {
        Set<String> keyIDs = jWKMatcher.getKeyIDs();
        if (keyIDs == null || keyIDs.isEmpty()) {
            return null;
        }
        for (String next : keyIDs) {
            if (next != null) {
                return next;
            }
        }
        return null;
    }

    public List<JWK> get(JWKSelector jWKSelector, C c) throws RemoteKeySourceException {
        JWKSet jWKSet = this.cachedJWKSet.get();
        if (jWKSet == null) {
            jWKSet = updateJWKSetFromURL();
        }
        List<JWK> select = jWKSelector.select(jWKSet);
        if (!select.isEmpty()) {
            return select;
        }
        String firstSpecifiedKeyID = getFirstSpecifiedKeyID(jWKSelector.getMatcher());
        if (firstSpecifiedKeyID == null) {
            return Collections.emptyList();
        }
        if (jWKSet.getKeyByKeyId(firstSpecifiedKeyID) != null) {
            return Collections.emptyList();
        }
        JWKSet updateJWKSetFromURL = updateJWKSetFromURL();
        if (updateJWKSetFromURL == null) {
            return Collections.emptyList();
        }
        return jWKSelector.select(updateJWKSetFromURL);
    }
}
