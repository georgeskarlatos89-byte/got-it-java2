package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.braintreepayments.api.GraphQLConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 )2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001)B\u0007\b\u0012¢\u0006\u0002\u0010\u0004B\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u000f\b\u0014\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\bJ\u0012\u0010#\u001a\u00020$2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010%\u001a\u00020\bH\u0016J\u0018\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0006H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R4\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013@PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006@PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/braintreepayments/api/ErrorWithResponse;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Landroid/os/Parcelable;", "()V", "statusCode", "", "jsonString", "", "(ILjava/lang/String;)V", "inParcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "_message", "_originalResponse", "errorResponse", "getErrorResponse", "()Ljava/lang/String;", "<set-?>", "", "Lcom/braintreepayments/api/BraintreeError;", "fieldErrors", "getFieldErrors", "()Ljava/util/List;", "setFieldErrors$BraintreeCore_release", "(Ljava/util/List;)V", "message", "getMessage", "getStatusCode", "()I", "setStatusCode$BraintreeCore_release", "(I)V", "describeContents", "errorFor", "field", "parseJson", "", "toString", "writeToParcel", "dest", "flags", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: ErrorWithResponse.kt */
public class ErrorWithResponse extends Exception implements Parcelable {
    public static final Parcelable.Creator<ErrorWithResponse> CREATOR = new ErrorWithResponse$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ERROR_KEY = "error";
    private static final String FIELD_ERRORS_KEY = "fieldErrors";
    private static final int GRAPHQL_ERROR_CODE = 422;
    private static final String MESSAGE_KEY = "message";
    /* access modifiers changed from: private */
    public String _message;
    /* access modifiers changed from: private */
    public String _originalResponse;
    private List<? extends BraintreeError> fieldErrors;
    private int statusCode;

    public /* synthetic */ ErrorWithResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final ErrorWithResponse fromJson(String str) throws JSONException {
        return Companion.fromJson(str);
    }

    public int describeContents() {
        return 0;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode$BraintreeCore_release(int i) {
        this.statusCode = i;
    }

    public String getMessage() {
        return this._message;
    }

    public String getErrorResponse() {
        return this._originalResponse;
    }

    public List<BraintreeError> getFieldErrors() {
        return this.fieldErrors;
    }

    public void setFieldErrors$BraintreeCore_release(List<? extends BraintreeError> list) {
        this.fieldErrors = list;
    }

    private ErrorWithResponse() {
    }

    public ErrorWithResponse(int i, String str) {
        setStatusCode$BraintreeCore_release(i);
        this._originalResponse = str;
        try {
            parseJson(str);
        } catch (JSONException unused) {
            this._message = "Parsing error response failed";
            setFieldErrors$BraintreeCore_release(new ArrayList());
        }
    }

    /* access modifiers changed from: private */
    public final void parseJson(String str) throws JSONException {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            this._message = jSONObject.getJSONObject("error").getString("message");
            setFieldErrors$BraintreeCore_release(BraintreeError.Companion.fromJsonArray$BraintreeCore_release(jSONObject.optJSONArray(FIELD_ERRORS_KEY)));
        }
    }

    public final BraintreeError errorFor(String str) {
        BraintreeError errorFor;
        Intrinsics.checkNotNullParameter(str, "field");
        if (getFieldErrors() == null) {
            return null;
        }
        List<BraintreeError> fieldErrors2 = getFieldErrors();
        Intrinsics.checkNotNull(fieldErrors2);
        for (BraintreeError next : fieldErrors2) {
            if (Intrinsics.areEqual((Object) next.getField(), (Object) str)) {
                return next;
            }
            if (next.getFieldErrors() != null && (errorFor = next.errorFor(str)) != null) {
                return errorFor;
            }
        }
        return null;
    }

    public String toString() {
        return StringsKt.trimIndent("\n            ErrorWithResponse (" + getStatusCode() + "): " + getMessage() + "\n            " + getFieldErrors() + "\n        ");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(getStatusCode());
        parcel.writeString(getMessage());
        parcel.writeString(this._originalResponse);
        parcel.writeTypedList(getFieldErrors());
    }

    protected ErrorWithResponse(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "inParcel");
        setStatusCode$BraintreeCore_release(parcel.readInt());
        this._message = parcel.readString();
        this._originalResponse = parcel.readString();
        setFieldErrors$BraintreeCore_release(parcel.createTypedArrayList(BraintreeError.CREATOR));
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u000eJ\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/braintreepayments/api/ErrorWithResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/ErrorWithResponse;", "ERROR_KEY", "", "FIELD_ERRORS_KEY", "GRAPHQL_ERROR_CODE", "", "MESSAGE_KEY", "fromGraphQLJson", "json", "fromGraphQLJson$BraintreeCore_release", "fromJson", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: ErrorWithResponse.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ErrorWithResponse fromJson(String str) throws JSONException {
            ErrorWithResponse errorWithResponse = new ErrorWithResponse((DefaultConstructorMarker) null);
            errorWithResponse._originalResponse = str;
            errorWithResponse.parseJson(str);
            return errorWithResponse;
        }

        public final ErrorWithResponse fromGraphQLJson$BraintreeCore_release(String str) {
            JSONArray jSONArray;
            JSONObject jSONObject;
            String str2 = null;
            ErrorWithResponse errorWithResponse = new ErrorWithResponse((DefaultConstructorMarker) null);
            errorWithResponse._originalResponse = str;
            errorWithResponse.setStatusCode$BraintreeCore_release(422);
            if (str != null) {
                try {
                    jSONArray = new JSONObject(str).getJSONArray(GraphQLConstants.Keys.ERRORS);
                } catch (JSONException unused) {
                    errorWithResponse._message = "Parsing error response failed";
                    errorWithResponse.setFieldErrors$BraintreeCore_release(new ArrayList());
                }
            } else {
                jSONArray = null;
            }
            errorWithResponse.setFieldErrors$BraintreeCore_release(BraintreeError.Companion.fromGraphQLJsonArray(jSONArray));
            List<BraintreeError> fieldErrors = errorWithResponse.getFieldErrors();
            if (fieldErrors != null ? fieldErrors.isEmpty() : true) {
                if (!(jSONArray == null || (jSONObject = jSONArray.getJSONObject(0)) == null)) {
                    str2 = jSONObject.getString("message");
                }
                errorWithResponse._message = str2;
            } else {
                errorWithResponse._message = GraphQLConstants.ErrorMessages.USER;
            }
            return errorWithResponse;
        }
    }
}
