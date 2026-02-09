package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Map;

public final class TraceState {
    private String environment;
    private String publicKey;
    private String release;
    private SentryId traceId;
    private String transaction;
    private TraceStateUser user;

    TraceState(SentryId sentryId, String str) {
        this(sentryId, str, (String) null, (String) null, (TraceStateUser) null, (String) null);
    }

    TraceState(SentryId sentryId, String str, String str2, String str3, TraceStateUser traceStateUser, String str4) {
        this.traceId = sentryId;
        this.publicKey = str;
        this.release = str2;
        this.environment = str3;
        this.user = traceStateUser;
        this.transaction = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    TraceState(ITransaction iTransaction, User user2, SentryOptions sentryOptions) {
        this(iTransaction.getSpanContext().getTraceId(), new Dsn(sentryOptions.getDsn()).getPublicKey(), sentryOptions.getRelease(), sentryOptions.getEnvironment(), user2 != null ? new TraceStateUser(user2) : null, iTransaction.getName());
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getRelease() {
        return this.release;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public TraceStateUser getUser() {
        return this.user;
    }

    public String getTransaction() {
        return this.transaction;
    }

    static final class TraceStateUser {
        private String id;
        private String segment;

        TraceStateUser(String str, String str2) {
            this.id = str;
            this.segment = str2;
        }

        public TraceStateUser(User user) {
            if (user != null) {
                this.id = user.getId();
                this.segment = getSegment(user);
            }
        }

        private static String getSegment(User user) {
            Map<String, String> others = user.getOthers();
            if (others != null) {
                return others.get("segment");
            }
            return null;
        }

        public String getId() {
            return this.id;
        }

        public String getSegment() {
            return this.segment;
        }
    }
}
