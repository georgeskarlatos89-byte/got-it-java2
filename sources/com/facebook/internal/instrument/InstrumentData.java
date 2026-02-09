package com.facebook.internal.instrument;

import android.os.Build;
import com.braintreepayments.api.GraphQLConstants;
import com.facebook.internal.Utility;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u0001:\u0003,-.B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001b\b\u0012\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rB\u000f\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010%\u001a\u00020&J\u0011\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0000H\u0002J\u0006\u0010*\u001a\u00020&J\b\u0010+\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0010\u0010 \u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0004\n\u0002\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData;", "", "features", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)V", "e", "", "t", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "(Ljava/lang/Throwable;Lcom/facebook/internal/instrument/InstrumentData$Type;)V", "anrCause", "", "st", "(Ljava/lang/String;Ljava/lang/String;)V", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "analysisReportParameters", "Lorg/json/JSONObject;", "getAnalysisReportParameters", "()Lorg/json/JSONObject;", "appVersion", "cause", "exceptionReportParameters", "getExceptionReportParameters", "featureNames", "filename", "isValid", "", "()Z", "parameters", "getParameters", "stackTrace", "timestamp", "", "Ljava/lang/Long;", "type", "clear", "", "compareTo", "", "data", "save", "toString", "Builder", "Companion", "Type", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InstrumentData.kt */
public final class InstrumentData {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String PARAM_APP_VERSION = "app_version";
    private static final String PARAM_CALLSTACK = "callstack";
    private static final String PARAM_DEVICE_MODEL = "device_model";
    private static final String PARAM_DEVICE_OS = "device_os_version";
    private static final String PARAM_FEATURE_NAMES = "feature_names";
    private static final String PARAM_REASON = "reason";
    private static final String PARAM_TIMESTAMP = "timestamp";
    private static final String PARAM_TYPE = "type";
    private static final String UNKNOWN = "Unknown";
    private String appVersion;
    private String cause;
    private JSONArray featureNames;
    private String filename;
    private String stackTrace;
    private Long timestamp;
    private Type type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: InstrumentData.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.facebook.internal.instrument.InstrumentData$Type[] r0 = com.facebook.internal.instrument.InstrumentData.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.Analysis     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.AnrReport     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.CrashReport     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.CrashShield     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.instrument.InstrumentData.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ InstrumentData(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public /* synthetic */ InstrumentData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th, Type type2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, type2);
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "(Ljava/lang/String;I)V", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "toString", "Unknown", "Analysis", "AnrReport", "CrashReport", "CrashShield", "ThreadCheck", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: InstrumentData.kt */
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* compiled from: InstrumentData.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.facebook.internal.instrument.InstrumentData$Type[] r0 = com.facebook.internal.instrument.InstrumentData.Type.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.Analysis     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.AnrReport     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.CrashReport     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.CrashShield     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.facebook.internal.instrument.InstrumentData$Type r1 = com.facebook.internal.instrument.InstrumentData.Type.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.instrument.InstrumentData.Type.WhenMappings.<clinit>():void");
            }
        }

        public String toString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "Analysis";
            }
            if (i == 2) {
                return "AnrReport";
            }
            if (i == 3) {
                return "CrashReport";
            }
            if (i != 4) {
                return i != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }

        public final String getLogPrefix() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return InstrumentUtility.ANALYSIS_REPORT_PREFIX;
            }
            if (i == 2) {
                return InstrumentUtility.ANR_REPORT_PREFIX;
            }
            if (i == 3) {
                return InstrumentUtility.CRASH_REPORT_PREFIX;
            }
            if (i != 4) {
                return i != 5 ? "Unknown" : InstrumentUtility.THREAD_CHECK_PREFIX;
            }
            return InstrumentUtility.CRASH_SHIELD_PREFIX;
        }
    }

    private InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.featureNames = jSONArray;
        String stringBuffer = new StringBuffer(InstrumentUtility.ANALYSIS_REPORT_PREFIX).append(String.valueOf(this.timestamp)).append(".json").toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer, "StringBuffer()\n         …)\n            .toString()");
        this.filename = stringBuffer;
    }

    private InstrumentData(Throwable th, Type type2) {
        this.type = type2;
        this.appVersion = Utility.getAppVersion();
        this.cause = InstrumentUtility.getCause(th);
        this.stackTrace = InstrumentUtility.getStackTrace(th);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        String stringBuffer = new StringBuffer().append(type2.getLogPrefix()).append(String.valueOf(this.timestamp)).append(".json").toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.filename = stringBuffer;
    }

    private InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        this.appVersion = Utility.getAppVersion();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        String stringBuffer = new StringBuffer(InstrumentUtility.ANR_REPORT_PREFIX).append(String.valueOf(this.timestamp)).append(".json").toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer, "StringBuffer()\n         …)\n            .toString()");
        this.filename = stringBuffer;
    }

    private InstrumentData(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.filename = name;
        this.type = Companion.getType(name);
        JSONObject readFile = InstrumentUtility.readFile(this.filename, true);
        if (readFile != null) {
            this.timestamp = Long.valueOf(readFile.optLong("timestamp", 0));
            this.appVersion = readFile.optString(PARAM_APP_VERSION, (String) null);
            this.cause = readFile.optString(PARAM_REASON, (String) null);
            this.stackTrace = readFile.optString(PARAM_CALLSTACK, (String) null);
            this.featureNames = readFile.optJSONArray(PARAM_FEATURE_NAMES);
        }
    }

    public final int compareTo(InstrumentData instrumentData) {
        Intrinsics.checkNotNullParameter(instrumentData, "data");
        Long l = this.timestamp;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        Long l2 = instrumentData.timestamp;
        if (l2 != null) {
            return Intrinsics.compare(l2.longValue(), longValue);
        }
        return 1;
    }

    public final boolean isValid() {
        Type type2 = this.type;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (!(i == 3 || i == 4 || i == 5) || this.stackTrace == null || this.timestamp == null) {
                    return false;
                }
            } else if (this.stackTrace == null || this.cause == null || this.timestamp == null) {
                return false;
            }
        } else if (this.featureNames == null || this.timestamp == null) {
            return false;
        }
        return true;
    }

    public final void save() {
        if (isValid()) {
            InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    public final void clear() {
        InstrumentUtility.deleteFile(this.filename);
    }

    public String toString() {
        JSONObject parameters = getParameters();
        if (parameters == null) {
            String jSONObject = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        String jSONObject2 = parameters.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    private final JSONObject getParameters() {
        Type type2 = this.type;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return getAnalysisReportParameters();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return getExceptionReportParameters();
        }
        return null;
    }

    private final JSONObject getAnalysisReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put(PARAM_FEATURE_NAMES, jSONArray);
            }
            Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getExceptionReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PARAM_DEVICE_OS, Build.VERSION.RELEASE);
            jSONObject.put(PARAM_DEVICE_MODEL, Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put(PARAM_APP_VERSION, str);
            }
            Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put(PARAM_REASON, str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put(PARAM_CALLSTACK, str3);
            }
            Type type2 = this.type;
            if (type2 != null) {
                jSONObject.put("type", type2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Builder;", "", "()V", "build", "Lcom/facebook/internal/instrument/InstrumentData;", "anrCause", "", "st", "e", "", "t", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "features", "Lorg/json/JSONArray;", "load", "file", "Ljava/io/File;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: InstrumentData.kt */
    public static final class Builder {
        public static final Builder INSTANCE = new Builder();

        private Builder() {
        }

        @JvmStatic
        public static final InstrumentData load(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new InstrumentData(file, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public static final InstrumentData build(Throwable th, Type type) {
            Intrinsics.checkNotNullParameter(type, "t");
            return new InstrumentData(th, type, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public static final InstrumentData build(JSONArray jSONArray) {
            Intrinsics.checkNotNullParameter(jSONArray, GraphQLConstants.Keys.FEATURES);
            return new InstrumentData(jSONArray, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public static final InstrumentData build(String str, String str2) {
            return new InstrumentData(str, str2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Companion;", "", "()V", "PARAM_APP_VERSION", "", "PARAM_CALLSTACK", "PARAM_DEVICE_MODEL", "PARAM_DEVICE_OS", "PARAM_FEATURE_NAMES", "PARAM_REASON", "PARAM_TIMESTAMP", "PARAM_TYPE", "UNKNOWN", "getType", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "filename", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: InstrumentData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Type getType(String str) {
            if (StringsKt.startsWith$default(str, InstrumentUtility.CRASH_REPORT_PREFIX, false, 2, (Object) null)) {
                return Type.CrashReport;
            }
            if (StringsKt.startsWith$default(str, InstrumentUtility.CRASH_SHIELD_PREFIX, false, 2, (Object) null)) {
                return Type.CrashShield;
            }
            if (StringsKt.startsWith$default(str, InstrumentUtility.THREAD_CHECK_PREFIX, false, 2, (Object) null)) {
                return Type.ThreadCheck;
            }
            if (StringsKt.startsWith$default(str, InstrumentUtility.ANALYSIS_REPORT_PREFIX, false, 2, (Object) null)) {
                return Type.Analysis;
            }
            if (StringsKt.startsWith$default(str, InstrumentUtility.ANR_REPORT_PREFIX, false, 2, (Object) null)) {
                return Type.AnrReport;
            }
            return Type.Unknown;
        }
    }
}
