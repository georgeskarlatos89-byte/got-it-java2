package com.braintreepayments.api;

import android.os.Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007\b\u0017¢\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0017J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0007J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0007H\u0007J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/braintreepayments/api/PaymentMethod;", "", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "_integration", "", "_sessionId", "_source", "apiPath", "getApiPath", "()Ljava/lang/String;", "buildJSON", "Lorg/json/JSONObject;", "buildMetadataJSON", "setIntegration", "", "integration", "setSessionId", "sessionId", "setSource", "source", "writeToParcel", "dest", "flags", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: PaymentMethod.kt */
public abstract class PaymentMethod {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String DEFAULT_INTEGRATION = "custom";
    private static final String DEFAULT_SOURCE = "form";
    public static final String OPERATION_NAME_KEY = "operationName";
    public static final String OPTIONS_KEY = "options";
    public static final String VALIDATE_KEY = "validate";
    private String _integration = "custom";
    private String _sessionId;
    private String _source = DEFAULT_SOURCE;

    public abstract String getApiPath();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/PaymentMethod$Companion;", "", "()V", "DEFAULT_INTEGRATION", "", "DEFAULT_SOURCE", "OPERATION_NAME_KEY", "OPTIONS_KEY", "VALIDATE_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: PaymentMethod.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PaymentMethod() {
    }

    public final void setIntegration(String str) {
        Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_INTEGRATION);
        this._integration = str;
    }

    public final void setSource(String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        this._source = str;
    }

    public final void setSessionId(String str) {
        this._sessionId = str;
    }

    public final JSONObject buildMetadataJSON() {
        return new MetadataBuilder().sessionId(this._sessionId).source(this._source).integration(this._integration).build();
    }

    public JSONObject buildJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MetadataBuilder.META_KEY, buildMetadataJSON());
        return jSONObject;
    }

    protected PaymentMethod(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this._integration = parcel.readString();
        this._source = parcel.readString();
        this._sessionId = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this._integration);
        parcel.writeString(this._source);
        parcel.writeString(this._sessionId);
    }
}
