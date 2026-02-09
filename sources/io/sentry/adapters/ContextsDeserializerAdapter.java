package io.sentry.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import io.sentry.SentryOptions;
import io.sentry.protocol.Contexts;

public final class ContextsDeserializerAdapter implements JsonDeserializer<Contexts> {
    private final SentryOptions options;

    public ContextsDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.sentry.protocol.Contexts deserialize(com.google.gson.JsonElement r9, java.lang.reflect.Type r10, com.google.gson.JsonDeserializationContext r11) throws com.google.gson.JsonParseException {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0124
            boolean r10 = r9.isJsonNull()     // Catch:{ all -> 0x0116 }
            if (r10 != 0) goto L_0x0124
            io.sentry.protocol.Contexts r10 = new io.sentry.protocol.Contexts     // Catch:{ all -> 0x0116 }
            r10.<init>()     // Catch:{ all -> 0x0116 }
            com.google.gson.JsonObject r9 = r9.getAsJsonObject()     // Catch:{ all -> 0x0116 }
            if (r9 == 0) goto L_0x0115
            boolean r0 = r9.isJsonNull()     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x0115
            java.util.Set r0 = r9.keySet()     // Catch:{ all -> 0x0116 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0116 }
        L_0x0021:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0115
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0116 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0116 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0116 }
            r3 = 1
            r4 = 0
            switch(r2) {
                case -1335157162: goto L_0x0073;
                case 3556: goto L_0x0069;
                case 96801: goto L_0x005f;
                case 102572: goto L_0x0055;
                case 110620997: goto L_0x004b;
                case 150940456: goto L_0x0041;
                case 1550962648: goto L_0x0037;
                default: goto L_0x0036;
            }     // Catch:{ all -> 0x0116 }
        L_0x0036:
            goto L_0x007d
        L_0x0037:
            java.lang.String r2 = "runtime"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x007d
            r2 = 4
            goto L_0x007e
        L_0x0041:
            java.lang.String r2 = "browser"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x007d
            r2 = r3
            goto L_0x007e
        L_0x004b:
            java.lang.String r2 = "trace"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x007d
            r2 = 6
            goto L_0x007e
        L_0x0055:
            java.lang.String r2 = "gpu"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x007d
            r2 = 5
            goto L_0x007e
        L_0x005f:
            java.lang.String r2 = "app"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x007d
            r2 = r4
            goto L_0x007e
        L_0x0069:
            java.lang.String r2 = "os"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x007d
            r2 = 3
            goto L_0x007e
        L_0x0073:
            java.lang.String r2 = "device"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x007d
            r2 = 2
            goto L_0x007e
        L_0x007d:
            r2 = -1
        L_0x007e:
            switch(r2) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00a3;
                case 5: goto L_0x0094;
                case 6: goto L_0x0086;
                default: goto L_0x0081;
            }     // Catch:{ all -> 0x0116 }
        L_0x0081:
            com.google.gson.JsonElement r2 = r9.get(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x00ee
        L_0x0086:
            java.lang.Class<io.sentry.SpanContext> r2 = io.sentry.SpanContext.class
            java.lang.Object r1 = r8.parseObject(r11, r9, r1, r2)     // Catch:{ all -> 0x0116 }
            io.sentry.SpanContext r1 = (io.sentry.SpanContext) r1     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0021
            r10.setTrace(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x0021
        L_0x0094:
            java.lang.Class<io.sentry.protocol.Gpu> r2 = io.sentry.protocol.Gpu.class
            java.lang.Object r1 = r8.parseObject(r11, r9, r1, r2)     // Catch:{ all -> 0x0116 }
            io.sentry.protocol.Gpu r1 = (io.sentry.protocol.Gpu) r1     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0021
            r10.setGpu(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x0021
        L_0x00a3:
            java.lang.Class<io.sentry.protocol.SentryRuntime> r2 = io.sentry.protocol.SentryRuntime.class
            java.lang.Object r1 = r8.parseObject(r11, r9, r1, r2)     // Catch:{ all -> 0x0116 }
            io.sentry.protocol.SentryRuntime r1 = (io.sentry.protocol.SentryRuntime) r1     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0021
            r10.setRuntime(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x0021
        L_0x00b2:
            java.lang.Class<io.sentry.protocol.OperatingSystem> r2 = io.sentry.protocol.OperatingSystem.class
            java.lang.Object r1 = r8.parseObject(r11, r9, r1, r2)     // Catch:{ all -> 0x0116 }
            io.sentry.protocol.OperatingSystem r1 = (io.sentry.protocol.OperatingSystem) r1     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0021
            r10.setOperatingSystem(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x0021
        L_0x00c1:
            java.lang.Class<io.sentry.protocol.Device> r2 = io.sentry.protocol.Device.class
            java.lang.Object r1 = r8.parseObject(r11, r9, r1, r2)     // Catch:{ all -> 0x0116 }
            io.sentry.protocol.Device r1 = (io.sentry.protocol.Device) r1     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0021
            r10.setDevice(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x0021
        L_0x00d0:
            java.lang.Class<io.sentry.protocol.Browser> r2 = io.sentry.protocol.Browser.class
            java.lang.Object r1 = r8.parseObject(r11, r9, r1, r2)     // Catch:{ all -> 0x0116 }
            io.sentry.protocol.Browser r1 = (io.sentry.protocol.Browser) r1     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0021
            r10.setBrowser(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x0021
        L_0x00df:
            java.lang.Class<io.sentry.protocol.App> r2 = io.sentry.protocol.App.class
            java.lang.Object r1 = r8.parseObject(r11, r9, r1, r2)     // Catch:{ all -> 0x0116 }
            io.sentry.protocol.App r1 = (io.sentry.protocol.App) r1     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0021
            r10.setApp(r1)     // Catch:{ all -> 0x0116 }
            goto L_0x0021
        L_0x00ee:
            if (r2 == 0) goto L_0x0021
            boolean r5 = r2.isJsonNull()     // Catch:{ all -> 0x0116 }
            if (r5 != 0) goto L_0x0021
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Object r2 = r11.deserialize(r2, r5)     // Catch:{ JsonParseException -> 0x0101 }
            r10.put(r1, r2)     // Catch:{ JsonParseException -> 0x0101 }
            goto L_0x0021
        L_0x0101:
            r2 = move-exception
            io.sentry.SentryOptions r5 = r8.options     // Catch:{ all -> 0x0116 }
            io.sentry.ILogger r5 = r5.getLogger()     // Catch:{ all -> 0x0116 }
            io.sentry.SentryLevel r6 = io.sentry.SentryLevel.ERROR     // Catch:{ all -> 0x0116 }
            java.lang.String r7 = "Error when deserializing the %s key."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0116 }
            r3[r4] = r1     // Catch:{ all -> 0x0116 }
            r5.log(r6, r2, r7, r3)     // Catch:{ all -> 0x0116 }
            goto L_0x0021
        L_0x0115:
            return r10
        L_0x0116:
            r9 = move-exception
            io.sentry.SentryOptions r10 = r8.options
            io.sentry.ILogger r10 = r10.getLogger()
            io.sentry.SentryLevel r11 = io.sentry.SentryLevel.ERROR
            java.lang.String r0 = "Error when deserializing Contexts"
            r10.log((io.sentry.SentryLevel) r11, (java.lang.String) r0, (java.lang.Throwable) r9)
        L_0x0124:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.adapters.ContextsDeserializerAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):io.sentry.protocol.Contexts");
    }

    private <T> T parseObject(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String str, Class<T> cls) throws JsonParseException {
        JsonObject asJsonObject = jsonObject.getAsJsonObject(str);
        if (asJsonObject == null || asJsonObject.isJsonNull()) {
            return null;
        }
        return jsonDeserializationContext.deserialize(asJsonObject, cls);
    }
}
