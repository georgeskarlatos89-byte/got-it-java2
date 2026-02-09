package io.sentry;

import com.braintreepayments.api.GraphQLConstants;
import com.brentvatne.react.ReactVideoView;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import io.sentry.Session;
import io.sentry.util.Objects;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;

public final class SessionAdapter extends TypeAdapter<Session> {
    private final SentryOptions options;

    public SessionAdapter(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions is required.");
    }

    public void write(JsonWriter jsonWriter, Session session) throws IOException {
        if (session == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        if (session.getSessionId() != null) {
            jsonWriter.name("sid").value(session.getSessionId().toString());
        }
        if (session.getDistinctId() != null) {
            jsonWriter.name("did").value(session.getDistinctId());
        }
        if (session.getInit() != null) {
            jsonWriter.name("init").value(session.getInit());
        }
        Date started = session.getStarted();
        if (started != null) {
            jsonWriter.name("started").value(DateUtils.getTimestamp(started));
        }
        Session.State status = session.getStatus();
        if (status != null) {
            jsonWriter.name("status").value(status.name().toLowerCase(Locale.ROOT));
        }
        if (session.getSequence() != null) {
            jsonWriter.name("seq").value((Number) session.getSequence());
        }
        int errorCount = session.errorCount();
        if (errorCount > 0) {
            jsonWriter.name(GraphQLConstants.Keys.ERRORS).value((long) errorCount);
        }
        if (session.getDuration() != null) {
            jsonWriter.name(ReactVideoView.EVENT_PROP_DURATION).value((Number) session.getDuration());
        }
        if (session.getTimestamp() != null) {
            jsonWriter.name("timestamp").value(DateUtils.getTimestamp(session.getTimestamp()));
        }
        boolean initAttrs = initAttrs(jsonWriter, false);
        jsonWriter.name("release").value(session.getRelease());
        if (session.getEnvironment() != null) {
            initAttrs = initAttrs(jsonWriter, initAttrs);
            jsonWriter.name("environment").value(session.getEnvironment());
        }
        if (session.getIpAddress() != null) {
            initAttrs = initAttrs(jsonWriter, initAttrs);
            jsonWriter.name("ip_address").value(session.getIpAddress());
        }
        if (session.getUserAgent() != null) {
            initAttrs = initAttrs(jsonWriter, initAttrs);
            jsonWriter.name("user_agent").value(session.getUserAgent());
        }
        if (initAttrs) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private boolean initAttrs(JsonWriter jsonWriter, boolean z) throws IOException {
        if (z) {
            return true;
        }
        jsonWriter.name("attrs").beginObject();
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.sentry.Session read(com.google.gson.stream.JsonReader r23) throws java.io.IOException {
        /*
            r22 = this;
            r0 = r22
            com.google.gson.stream.JsonToken r1 = r23.peek()
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NULL
            r3 = 0
            if (r1 != r2) goto L_0x000f
            r23.nextNull()
            return r3
        L_0x000f:
            r23.beginObject()
            r5 = r3
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r8 = 0
        L_0x0021:
            boolean r2 = r23.hasNext()
            if (r2 == 0) goto L_0x01a0
            java.lang.String r2 = r23.nextName()
            r2.hashCode()
            int r4 = r2.hashCode()
            java.lang.String r3 = "timestamp"
            r18 = 3
            r19 = 2
            java.lang.String r1 = "started"
            r20 = -1
            r21 = r15
            r15 = 1
            switch(r4) {
                case -1992012396: goto L_0x00ab;
                case -1897185151: goto L_0x00a2;
                case -1294635157: goto L_0x0096;
                case -892481550: goto L_0x008a;
                case 99455: goto L_0x007f;
                case 113759: goto L_0x0074;
                case 113870: goto L_0x0069;
                case 3237136: goto L_0x005e;
                case 55126294: goto L_0x0053;
                case 93152418: goto L_0x0046;
                default: goto L_0x0042;
            }
        L_0x0042:
            r2 = r20
            goto L_0x00b5
        L_0x0046:
            java.lang.String r4 = "attrs"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004f
            goto L_0x0042
        L_0x004f:
            r2 = 9
            goto L_0x00b5
        L_0x0053:
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x005a
            goto L_0x0042
        L_0x005a:
            r2 = 8
            goto L_0x00b5
        L_0x005e:
            java.lang.String r4 = "init"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0067
            goto L_0x0042
        L_0x0067:
            r2 = 7
            goto L_0x00b5
        L_0x0069:
            java.lang.String r4 = "sid"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0072
            goto L_0x0042
        L_0x0072:
            r2 = 6
            goto L_0x00b5
        L_0x0074:
            java.lang.String r4 = "seq"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x007d
            goto L_0x0042
        L_0x007d:
            r2 = 5
            goto L_0x00b5
        L_0x007f:
            java.lang.String r4 = "did"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0088
            goto L_0x0042
        L_0x0088:
            r2 = 4
            goto L_0x00b5
        L_0x008a:
            java.lang.String r4 = "status"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0093
            goto L_0x0042
        L_0x0093:
            r2 = r18
            goto L_0x00b5
        L_0x0096:
            java.lang.String r4 = "errors"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x009f
            goto L_0x0042
        L_0x009f:
            r2 = r19
            goto L_0x00b5
        L_0x00a2:
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00a9
            goto L_0x0042
        L_0x00a9:
            r2 = r15
            goto L_0x00b5
        L_0x00ab:
            java.lang.String r4 = "duration"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00b4
            goto L_0x0042
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            switch(r2) {
                case 0: goto L_0x0194;
                case 1: goto L_0x018b;
                case 2: goto L_0x0186;
                case 3: goto L_0x0162;
                case 4: goto L_0x015b;
                case 5: goto L_0x0152;
                case 6: goto L_0x0135;
                case 7: goto L_0x012c;
                case 8: goto L_0x0123;
                case 9: goto L_0x00bd;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            r23.skipValue()
            goto L_0x015f
        L_0x00bd:
            r23.beginObject()
        L_0x00c0:
            boolean r1 = r23.hasNext()
            if (r1 == 0) goto L_0x011f
            java.lang.String r1 = r23.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            switch(r2) {
                case -85904877: goto L_0x00fa;
                case 1090594823: goto L_0x00ef;
                case 1480014044: goto L_0x00e3;
                case 1917799825: goto L_0x00d7;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            r1 = r20
            goto L_0x0104
        L_0x00d7:
            java.lang.String r2 = "user_agent"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00e0
            goto L_0x00d4
        L_0x00e0:
            r1 = r18
            goto L_0x0104
        L_0x00e3:
            java.lang.String r2 = "ip_address"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ec
            goto L_0x00d4
        L_0x00ec:
            r1 = r19
            goto L_0x0104
        L_0x00ef:
            java.lang.String r2 = "release"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f8
            goto L_0x00d4
        L_0x00f8:
            r1 = r15
            goto L_0x0104
        L_0x00fa:
            java.lang.String r2 = "environment"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0103
            goto L_0x00d4
        L_0x0103:
            r1 = 0
        L_0x0104:
            switch(r1) {
                case 0: goto L_0x011a;
                case 1: goto L_0x0115;
                case 2: goto L_0x0110;
                case 3: goto L_0x010b;
                default: goto L_0x0107;
            }
        L_0x0107:
            r23.skipValue()
            goto L_0x00c0
        L_0x010b:
            java.lang.String r21 = r23.nextString()
            goto L_0x00c0
        L_0x0110:
            java.lang.String r14 = r23.nextString()
            goto L_0x00c0
        L_0x0115:
            java.lang.String r17 = r23.nextString()
            goto L_0x00c0
        L_0x011a:
            java.lang.String r16 = r23.nextString()
            goto L_0x00c0
        L_0x011f:
            r23.endObject()
            goto L_0x015f
        L_0x0123:
            java.lang.String r1 = r23.nextString()
            java.util.Date r7 = r0.converTimeStamp(r1, r3)
            goto L_0x015f
        L_0x012c:
            boolean r1 = r23.nextBoolean()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            goto L_0x015f
        L_0x0135:
            java.lang.String r1 = r23.nextString()     // Catch:{ IllegalArgumentException -> 0x013e }
            java.util.UUID r10 = java.util.UUID.fromString(r1)     // Catch:{ IllegalArgumentException -> 0x013f }
            goto L_0x015f
        L_0x013e:
            r1 = 0
        L_0x013f:
            io.sentry.SentryOptions r2 = r0.options
            io.sentry.ILogger r2 = r2.getLogger()
            io.sentry.SentryLevel r3 = io.sentry.SentryLevel.ERROR
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r15 = 0
            r4[r15] = r1
            java.lang.String r1 = "%s sid is not valid."
            r2.log((io.sentry.SentryLevel) r3, (java.lang.String) r1, (java.lang.Object[]) r4)
            goto L_0x015f
        L_0x0152:
            long r1 = r23.nextLong()
            java.lang.Long r12 = java.lang.Long.valueOf(r1)
            goto L_0x015f
        L_0x015b:
            java.lang.String r9 = r23.nextString()
        L_0x015f:
            r15 = r21
            goto L_0x019d
        L_0x0162:
            java.lang.String r1 = r23.nextString()     // Catch:{ IllegalArgumentException -> 0x0172 }
            java.lang.String r1 = io.sentry.util.StringUtils.capitalize(r1)     // Catch:{ IllegalArgumentException -> 0x0172 }
            if (r1 == 0) goto L_0x015f
            io.sentry.Session$State r1 = io.sentry.Session.State.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0173 }
            r5 = r1
            goto L_0x015f
        L_0x0172:
            r1 = 0
        L_0x0173:
            io.sentry.SentryOptions r2 = r0.options
            io.sentry.ILogger r2 = r2.getLogger()
            io.sentry.SentryLevel r3 = io.sentry.SentryLevel.ERROR
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r15 = 0
            r4[r15] = r1
            java.lang.String r1 = "%s status is not valid."
            r2.log((io.sentry.SentryLevel) r3, (java.lang.String) r1, (java.lang.Object[]) r4)
            goto L_0x015f
        L_0x0186:
            int r8 = r23.nextInt()
            goto L_0x015f
        L_0x018b:
            java.lang.String r2 = r23.nextString()
            java.util.Date r6 = r0.converTimeStamp(r2, r1)
            goto L_0x015f
        L_0x0194:
            double r1 = r23.nextDouble()
            java.lang.Double r13 = java.lang.Double.valueOf(r1)
            goto L_0x015f
        L_0x019d:
            r3 = 0
            goto L_0x0021
        L_0x01a0:
            r21 = r15
            r23.endObject()
            if (r5 == 0) goto L_0x01bb
            if (r6 == 0) goto L_0x01bb
            if (r17 == 0) goto L_0x01bb
            boolean r1 = r17.isEmpty()
            if (r1 == 0) goto L_0x01b2
            goto L_0x01bb
        L_0x01b2:
            io.sentry.Session r1 = new io.sentry.Session
            r4 = r1
            r15 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x01bb:
            io.sentry.SentryOptions r1 = r0.options
            io.sentry.ILogger r1 = r1.getLogger()
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.ERROR
            java.lang.String r3 = "Session is gonna be dropped due to invalid fields."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1.log((io.sentry.SentryLevel) r2, (java.lang.String) r3, (java.lang.Object[]) r4)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.SessionAdapter.read(com.google.gson.stream.JsonReader):io.sentry.Session");
    }

    private Date converTimeStamp(String str, String str2) {
        try {
            return DateUtils.getDateTime(str);
        } catch (IllegalArgumentException e) {
            this.options.getLogger().log(SentryLevel.ERROR, e, "Error converting session (%s) field.", str2);
            return null;
        }
    }
}
