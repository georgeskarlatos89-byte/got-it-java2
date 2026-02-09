package io.sentry;

import com.facebook.internal.ServerProtocol;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryPackage;
import java.io.IOException;
import java.util.List;

public final class SentryEnvelopeHeaderAdapter extends TypeAdapter<SentryEnvelopeHeader> {
    public void write(JsonWriter jsonWriter, SentryEnvelopeHeader sentryEnvelopeHeader) throws IOException {
        if (sentryEnvelopeHeader == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        if (sentryEnvelopeHeader.getEventId() != null) {
            jsonWriter.name("event_id");
            jsonWriter.value(sentryEnvelopeHeader.getEventId().toString());
        }
        SdkVersion sdkVersion = sentryEnvelopeHeader.getSdkVersion();
        if (sdkVersion != null && hasValidSdkVersion(sdkVersion)) {
            jsonWriter.name(ServerProtocol.DIALOG_PARAM_SDK_VERSION).beginObject();
            jsonWriter.name("name").value(sdkVersion.getName());
            jsonWriter.name("version").value(sdkVersion.getVersion());
            List<String> integrations = sdkVersion.getIntegrations();
            if (integrations != null) {
                jsonWriter.name("integrations").beginArray();
                for (String value : integrations) {
                    jsonWriter.value(value);
                }
                jsonWriter.endArray();
            }
            List<SentryPackage> packages = sdkVersion.getPackages();
            if (packages != null) {
                jsonWriter.name("packages").beginArray();
                for (SentryPackage next : packages) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(next.getName());
                    jsonWriter.name("version").value(next.getVersion());
                    jsonWriter.endObject();
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
        }
        TraceState trace = sentryEnvelopeHeader.getTrace();
        if (trace != null) {
            jsonWriter.name(SpanContext.TYPE);
            jsonWriter.beginObject();
            jsonWriter.name("trace_id").value(trace.getTraceId().toString());
            jsonWriter.name("public_key").value(trace.getPublicKey());
            if (trace.getRelease() != null) {
                jsonWriter.name("release").value(trace.getRelease());
            }
            if (trace.getEnvironment() != null) {
                jsonWriter.name("environment").value(trace.getEnvironment());
            }
            if (trace.getTransaction() != null) {
                jsonWriter.name("transaction").value(trace.getTransaction());
            }
            if (!(trace.getUser() == null || (trace.getUser().getId() == null && trace.getUser().getSegment() == null))) {
                jsonWriter.name("user");
                jsonWriter.beginObject();
                if (trace.getUser().getId() != null) {
                    jsonWriter.name("id").value(trace.getUser().getId());
                }
                if (trace.getUser().getSegment() != null) {
                    jsonWriter.name("segment").value(trace.getUser().getSegment());
                }
                jsonWriter.endObject();
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private boolean hasValidSdkVersion(SdkVersion sdkVersion) {
        return sdkVersion.getName() != null && !sdkVersion.getName().isEmpty() && sdkVersion.getVersion() != null && !sdkVersion.getVersion().isEmpty();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.sentry.SentryEnvelopeHeader read(com.google.gson.stream.JsonReader r19) throws java.io.IOException {
        /*
            r18 = this;
            com.google.gson.stream.JsonToken r0 = r19.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            r2 = 0
            if (r0 != r1) goto L_0x000d
            r19.nextNull()
            return r2
        L_0x000d:
            r19.beginObject()
            r0 = r2
            r1 = r0
            r3 = r1
        L_0x0013:
            boolean r4 = r19.hasNext()
            if (r4 == 0) goto L_0x0200
            java.lang.String r4 = r19.nextName()
            r4.hashCode()
            int r5 = r4.hashCode()
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = -1
            switch(r5) {
                case 113722: goto L_0x0043;
                case 110620997: goto L_0x0038;
                case 278118624: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r4 = r9
            goto L_0x004d
        L_0x002d:
            java.lang.String r5 = "event_id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r4 = r6
            goto L_0x004d
        L_0x0038:
            java.lang.String r5 = "trace"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r4 = r7
            goto L_0x004d
        L_0x0043:
            java.lang.String r5 = "sdk"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r4 = r8
        L_0x004d:
            switch(r4) {
                case 0: goto L_0x013c;
                case 1: goto L_0x0060;
                case 2: goto L_0x0055;
                default: goto L_0x0050;
            }
        L_0x0050:
            r19.skipValue()
            goto L_0x01fd
        L_0x0055:
            io.sentry.protocol.SentryId r0 = new io.sentry.protocol.SentryId
            java.lang.String r4 = r19.nextString()
            r0.<init>((java.lang.String) r4)
            goto L_0x01fd
        L_0x0060:
            r19.beginObject()
            r4 = r2
            r10 = r4
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x006a:
            boolean r16 = r19.hasNext()
            if (r16 == 0) goto L_0x011a
            java.lang.String r2 = r19.nextName()
            r2.hashCode()
            int r17 = r2.hashCode()
            switch(r17) {
                case -85904877: goto L_0x00b7;
                case 3599307: goto L_0x00ac;
                case 1090594823: goto L_0x00a1;
                case 1270300245: goto L_0x0096;
                case 1904812937: goto L_0x008b;
                case 2141246174: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            r2 = r9
            goto L_0x00c1
        L_0x0080:
            java.lang.String r5 = "transaction"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0089
            goto L_0x007e
        L_0x0089:
            r2 = 5
            goto L_0x00c1
        L_0x008b:
            java.lang.String r5 = "public_key"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0094
            goto L_0x007e
        L_0x0094:
            r2 = 4
            goto L_0x00c1
        L_0x0096:
            java.lang.String r5 = "trace_id"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x009f
            goto L_0x007e
        L_0x009f:
            r2 = 3
            goto L_0x00c1
        L_0x00a1:
            java.lang.String r5 = "release"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00aa
            goto L_0x007e
        L_0x00aa:
            r2 = r6
            goto L_0x00c1
        L_0x00ac:
            java.lang.String r5 = "user"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00b5
            goto L_0x007e
        L_0x00b5:
            r2 = r7
            goto L_0x00c1
        L_0x00b7:
            java.lang.String r5 = "environment"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00c0
            goto L_0x007e
        L_0x00c0:
            r2 = r8
        L_0x00c1:
            switch(r2) {
                case 0: goto L_0x0113;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00d2;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00c8;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            r19.skipValue()
            goto L_0x0117
        L_0x00c8:
            java.lang.String r13 = r19.nextString()
            goto L_0x0117
        L_0x00cd:
            java.lang.String r10 = r19.nextString()
            goto L_0x0117
        L_0x00d2:
            io.sentry.protocol.SentryId r4 = new io.sentry.protocol.SentryId
            java.lang.String r2 = r19.nextString()
            r4.<init>((java.lang.String) r2)
            goto L_0x0117
        L_0x00dc:
            java.lang.String r11 = r19.nextString()
            goto L_0x0117
        L_0x00e1:
            r19.beginObject()
        L_0x00e4:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x010f
            java.lang.String r2 = r19.nextName()
            r2.hashCode()
            java.lang.String r5 = "id"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x010a
            java.lang.String r5 = "segment"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0105
            r19.skipValue()
            goto L_0x00e4
        L_0x0105:
            java.lang.String r15 = r19.nextString()
            goto L_0x00e4
        L_0x010a:
            java.lang.String r14 = r19.nextString()
            goto L_0x00e4
        L_0x010f:
            r19.endObject()
            goto L_0x0117
        L_0x0113:
            java.lang.String r12 = r19.nextString()
        L_0x0117:
            r2 = 0
            goto L_0x006a
        L_0x011a:
            if (r4 == 0) goto L_0x0137
            if (r10 == 0) goto L_0x0137
            io.sentry.TraceState r2 = new io.sentry.TraceState
            if (r14 != 0) goto L_0x0127
            if (r15 == 0) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            r3 = 0
            goto L_0x012c
        L_0x0127:
            io.sentry.TraceState$TraceStateUser r3 = new io.sentry.TraceState$TraceStateUser
            r3.<init>(r14, r15)
        L_0x012c:
            r5 = r2
            r6 = r4
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r3
            r11 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3 = r2
        L_0x0137:
            r19.endObject()
            goto L_0x01fd
        L_0x013c:
            r19.beginObject()
            io.sentry.protocol.SdkVersion r1 = new io.sentry.protocol.SdkVersion
            r1.<init>()
        L_0x0144:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x01fa
            java.lang.String r2 = r19.nextName()
            r2.hashCode()
            int r4 = r2.hashCode()
            java.lang.String r5 = "version"
            java.lang.String r10 = "name"
            switch(r4) {
                case 3373707: goto L_0x017d;
                case 351608024: goto L_0x0174;
                case 750867693: goto L_0x0169;
                case 1487029535: goto L_0x015e;
                default: goto L_0x015c;
            }
        L_0x015c:
            r2 = r9
            goto L_0x0185
        L_0x015e:
            java.lang.String r4 = "integrations"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0167
            goto L_0x015c
        L_0x0167:
            r2 = 3
            goto L_0x0185
        L_0x0169:
            java.lang.String r4 = "packages"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0172
            goto L_0x015c
        L_0x0172:
            r2 = r6
            goto L_0x0185
        L_0x0174:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x017b
            goto L_0x015c
        L_0x017b:
            r2 = r7
            goto L_0x0185
        L_0x017d:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x0184
            goto L_0x015c
        L_0x0184:
            r2 = r8
        L_0x0185:
            switch(r2) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01e8;
                case 2: goto L_0x01a3;
                case 3: goto L_0x018c;
                default: goto L_0x0188;
            }
        L_0x0188:
            r19.skipValue()
            goto L_0x0144
        L_0x018c:
            r19.beginArray()
        L_0x018f:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x019f
            java.lang.String r2 = r19.nextString()
            if (r2 == 0) goto L_0x018f
            r1.addIntegration(r2)
            goto L_0x018f
        L_0x019f:
            r19.endArray()
            goto L_0x0144
        L_0x01a3:
            r19.beginArray()
        L_0x01a6:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x01e3
            r19.beginObject()
            r2 = 0
            r4 = 0
        L_0x01b1:
            boolean r11 = r19.hasNext()
            if (r11 == 0) goto L_0x01d8
            java.lang.String r11 = r19.nextName()
            r11.hashCode()
            boolean r12 = r11.equals(r10)
            if (r12 != 0) goto L_0x01d3
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x01ce
            r19.skipValue()
            goto L_0x01b1
        L_0x01ce:
            java.lang.String r4 = r19.nextString()
            goto L_0x01b1
        L_0x01d3:
            java.lang.String r2 = r19.nextString()
            goto L_0x01b1
        L_0x01d8:
            if (r2 == 0) goto L_0x01df
            if (r4 == 0) goto L_0x01df
            r1.addPackage(r2, r4)
        L_0x01df:
            r19.endObject()
            goto L_0x01a6
        L_0x01e3:
            r19.endArray()
            goto L_0x0144
        L_0x01e8:
            java.lang.String r2 = r19.nextString()
            r1.setVersion(r2)
            goto L_0x0144
        L_0x01f1:
            java.lang.String r2 = r19.nextString()
            r1.setName(r2)
            goto L_0x0144
        L_0x01fa:
            r19.endObject()
        L_0x01fd:
            r2 = 0
            goto L_0x0013
        L_0x0200:
            r19.endObject()
            io.sentry.SentryEnvelopeHeader r2 = new io.sentry.SentryEnvelopeHeader
            r2.<init>(r0, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.SentryEnvelopeHeaderAdapter.read(com.google.gson.stream.JsonReader):io.sentry.SentryEnvelopeHeader");
    }
}
