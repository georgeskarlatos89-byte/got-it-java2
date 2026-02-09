package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.integrity.RedactedEventsManager;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u0001:\u000201BQ\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B1\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\b\u0010\"\u001a\u00020\u0003H\u0002J\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\u001aJ;\u0010%\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u001aJ\u0010\u0010'\u001a\u0004\u0018\u00010\u001a2\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u0003H\u0016J(\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030,2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\nH\u0002J\b\u0010.\u001a\u00020/H\u0002R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001c¨\u00062"}, d2 = {"Lcom/facebook/appevents/AppEvent;", "Ljava/io/Serializable;", "contextName", "", "eventName", "valueToSum", "", "parameters", "Landroid/os/Bundle;", "isImplicitlyLogged", "", "isInBackground", "currentSessionId", "Ljava/util/UUID;", "operationalParameters", "Lcom/facebook/appevents/OperationalData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZZLjava/util/UUID;Lcom/facebook/appevents/OperationalData;)V", "jsonString", "operationalJsonString", "isImplicit", "inBackground", "checksum", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "isChecksumValid", "()Z", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "()Lorg/json/JSONObject;", "name", "getName", "()Ljava/lang/String;", "operationalJsonObject", "getOperationalJsonObject", "calculateChecksum", "getIsImplicit", "getJSONObject", "getJSONObjectForAppEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Ljava/util/UUID;)Lorg/json/JSONObject;", "getOperationalJSONObject", "type", "Lcom/facebook/appevents/OperationalDataEnum;", "toString", "validateParameters", "", "isOperational", "writeReplace", "", "Companion", "SerializationProxyV2", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppEvent.kt */
public final class AppEvent implements Serializable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int MAX_IDENTIFIER_LENGTH = 40;
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */
    public static final HashSet<String> validatedIdentifiers = new HashSet<>();
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;
    private final JSONObject operationalJsonObject;

    public /* synthetic */ AppEvent(String str, String str2, boolean z, boolean z2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, z2, str3);
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, OperationalData operationalData, int i, DefaultConstructorMarker defaultConstructorMarker) throws JSONException, FacebookException {
        this(str, str2, d, bundle, z, z2, uuid, (i & 128) != 0 ? null : operationalData);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        r11 = r14.toJSON();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppEvent(java.lang.String r7, java.lang.String r8, java.lang.Double r9, android.os.Bundle r10, boolean r11, boolean r12, java.util.UUID r13, com.facebook.appevents.OperationalData r14) throws org.json.JSONException, com.facebook.FacebookException {
        /*
            r6 = this;
            java.lang.String r0 = "contextName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "eventName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r6.<init>()
            r6.isImplicit = r11
            r6.inBackground = r12
            r6.name = r8
            if (r14 == 0) goto L_0x001b
            org.json.JSONObject r11 = r14.toJSON()
            if (r11 != 0) goto L_0x0020
        L_0x001b:
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
        L_0x0020:
            r6.operationalJsonObject = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r13
            org.json.JSONObject r7 = r0.getJSONObjectForAppEvent(r1, r2, r3, r4, r5)
            r6.jsonObject = r7
            java.lang.String r7 = r6.calculateChecksum()
            r6.checksum = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEvent.<init>(java.lang.String, java.lang.String, java.lang.Double, android.os.Bundle, boolean, boolean, java.util.UUID, com.facebook.appevents.OperationalData):void");
    }

    private AppEvent(String str, String str2, boolean z, boolean z2, String str3) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.operationalJsonObject = new JSONObject(str2);
        this.isImplicit = z;
        String optString = jSONObject.optString(Constants.EVENT_NAME_EVENT_KEY);
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.name = optString;
        this.checksum = str3;
        this.inBackground = z2;
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    public final JSONObject getJSONObject() {
        return this.jsonObject;
    }

    public final JSONObject getOperationalJSONObject() {
        return this.operationalJsonObject;
    }

    public final JSONObject getOperationalJSONObject(OperationalDataEnum operationalDataEnum) {
        Intrinsics.checkNotNullParameter(operationalDataEnum, "type");
        return this.operationalJsonObject.optJSONObject(operationalDataEnum.getValue());
    }

    public final boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        return Intrinsics.areEqual((Object) calculateChecksum(), (Object) this.checksum);
    }

    private final JSONObject getJSONObjectForAppEvent(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        Companion.validateIdentifier(str2);
        JSONObject jSONObject = new JSONObject();
        String processEvent = RestrictiveDataManager.processEvent(str2);
        if (Intrinsics.areEqual((Object) processEvent, (Object) str2)) {
            processEvent = RedactedEventsManager.processEventsRedaction(str2);
        }
        jSONObject.put(Constants.EVENT_NAME_EVENT_KEY, processEvent);
        jSONObject.put(Constants.LOG_TIME_APP_EVENT_KEY, System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map validateParameters$default = validateParameters$default(this, bundle, false, 2, (Object) null);
            for (String str3 : validateParameters$default.keySet()) {
                jSONObject.put(str3, validateParameters$default.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, d.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "eventObject.toString()");
            companion.log(loggingBehavior, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    static /* synthetic */ Map validateParameters$default(AppEvent appEvent, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return appEvent.validateParameters(bundle, z);
    }

    private final Map<String, String> validateParameters(Bundle bundle, boolean z) {
        Map<String, String> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            Companion companion = Companion;
            Intrinsics.checkNotNullExpressionValue(str, SDKConstants.PARAM_KEY);
            companion.validateIdentifier(str);
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(str, obj.toString());
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                throw new FacebookException(format);
            }
        }
        if (!z) {
            IntegrityManager.processParameters(hashMap);
            RestrictiveDataManager.processParameters(TypeIntrinsics.asMutableMap(hashMap), this.name);
            EventDeactivationManager.processDeprecatedParameters(TypeIntrinsics.asMutableMap(hashMap), this.name);
        }
        return hashMap;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2;", "Ljava/io/Serializable;", "jsonString", "", "operationalJsonString", "isImplicit", "", "inBackground", "checksum", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "readResolve", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AppEvent.kt */
    public static final class SerializationProxyV2 implements Serializable {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;
        private final String operationalJsonString;

        public SerializationProxyV2(String str, String str2, boolean z, boolean z2, String str3) {
            Intrinsics.checkNotNullParameter(str, "jsonString");
            Intrinsics.checkNotNullParameter(str2, "operationalJsonString");
            this.jsonString = str;
            this.operationalJsonString = str2;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str3;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new AppEvent(this.jsonString, this.operationalJsonString, this.isImplicit, this.inBackground, this.checksum, (DefaultConstructorMarker) null);
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2$Companion;", "", "()V", "serialVersionUID", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: AppEvent.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        String jSONObject2 = this.operationalJsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "operationalJsonObject.toString()");
        return new SerializationProxyV2(jSONObject, jSONObject2, this.isImplicit, this.inBackground, this.checksum);
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    private final String calculateChecksum() {
        Companion companion = Companion;
        String jSONObject = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return companion.md5Checksum(jSONObject);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/AppEvent$Companion;", "", "()V", "MAX_IDENTIFIER_LENGTH", "", "serialVersionUID", "", "validatedIdentifiers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "md5Checksum", "toHash", "validateIdentifier", "", "identifier", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AppEvent.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void validateIdentifier(String str) {
            boolean contains;
            Intrinsics.checkNotNullParameter(str, "identifier");
            CharSequence charSequence = str;
            if ((charSequence.length() == 0) || str.length() > 40) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                throw new FacebookException(format);
            }
            synchronized (AppEvent.validatedIdentifiers) {
                contains = AppEvent.validatedIdentifiers.contains(str);
                Unit unit = Unit.INSTANCE;
            }
            if (contains) {
                return;
            }
            if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(charSequence)) {
                synchronized (AppEvent.validatedIdentifiers) {
                    AppEvent.validatedIdentifiers.add(str);
                }
                return;
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
            throw new FacebookException(format2);
        }

        /* access modifiers changed from: private */
        public final String md5Checksum(String str) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
                byte[] bytes = str.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                instance.update(bytes, 0, bytes.length);
                byte[] digest = instance.digest();
                Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
                return AppEventUtility.bytesToHex(digest);
            } catch (NoSuchAlgorithmException e) {
                Utility.logd("Failed to generate checksum: ", (Exception) e);
                return "0";
            } catch (UnsupportedEncodingException e2) {
                Utility.logd("Failed to generate checksum: ", (Exception) e2);
                return "1";
            }
        }
    }
}
