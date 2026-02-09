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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H\u0016R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r@PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R4\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00132\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013@PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r@PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006$"}, d2 = {"Lcom/braintreepayments/api/BraintreeError;", "Landroid/os/Parcelable;", "()V", "inParcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "<set-?>", "", "code", "getCode", "()I", "setCode$BraintreeCore_release", "(I)V", "", "field", "getField", "()Ljava/lang/String;", "setField$BraintreeCore_release", "(Ljava/lang/String;)V", "", "fieldErrors", "getFieldErrors", "()Ljava/util/List;", "setFieldErrors$BraintreeCore_release", "(Ljava/util/List;)V", "message", "getMessage", "setMessage$BraintreeCore_release", "describeContents", "errorFor", "toString", "writeToParcel", "", "dest", "flags", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeError.kt */
public class BraintreeError implements Parcelable {
    private static final String CODE_KEY = "code";
    public static final Parcelable.Creator<BraintreeError> CREATOR = new BraintreeError$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String FIELD_ERRORS_KEY = "fieldErrors";
    private static final String FIELD_KEY = "field";
    private static final String MESSAGE_KEY = "message";
    private static final int UNKNOWN_CODE = -1;
    private int code = -1;
    private String field;
    private List<BraintreeError> fieldErrors;
    private String message;

    @JvmStatic
    public static final List<BraintreeError> fromGraphQLJsonArray(JSONArray jSONArray) {
        return Companion.fromGraphQLJsonArray(jSONArray);
    }

    public int describeContents() {
        return 0;
    }

    public String getField() {
        return this.field;
    }

    public void setField$BraintreeCore_release(String str) {
        this.field = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage$BraintreeCore_release(String str) {
        this.message = str;
    }

    public List<BraintreeError> getFieldErrors() {
        return this.fieldErrors;
    }

    public void setFieldErrors$BraintreeCore_release(List<BraintreeError> list) {
        this.fieldErrors = list;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode$BraintreeCore_release(int i) {
        this.code = i;
    }

    public BraintreeError errorFor(String str) {
        BraintreeError errorFor;
        Intrinsics.checkNotNullParameter(str, FIELD_KEY);
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
        String str;
        StringBuilder append = new StringBuilder("BraintreeError for ").append(getField()).append(": ").append(getMessage()).append(" -> ");
        List<BraintreeError> fieldErrors2 = getFieldErrors();
        if (fieldErrors2 == null || (str = fieldErrors2.toString()) == null) {
            str = "";
        }
        return append.append(str).toString();
    }

    public BraintreeError() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(getField());
        parcel.writeString(getMessage());
        parcel.writeTypedList(getFieldErrors());
    }

    protected BraintreeError(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "inParcel");
        setField$BraintreeCore_release(parcel.readString());
        setMessage$BraintreeCore_release(parcel.readString());
        setFieldErrors$BraintreeCore_release(parcel.createTypedArrayList(CREATOR));
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H\u0002J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u001aJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0002\b\u001dR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/braintreepayments/api/BraintreeError$Companion;", "", "()V", "CODE_KEY", "", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/BraintreeError;", "FIELD_ERRORS_KEY", "FIELD_KEY", "MESSAGE_KEY", "UNKNOWN_CODE", "", "addGraphQLFieldError", "", "inputPath", "", "errorJSON", "Lorg/json/JSONObject;", "errors", "", "fromGraphQLJsonArray", "graphQLErrors", "Lorg/json/JSONArray;", "fromJson", "json", "fromJson$BraintreeCore_release", "fromJsonArray", "input", "fromJsonArray$BraintreeCore_release", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: BraintreeError.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<BraintreeError> fromJsonArray$BraintreeCore_release(JSONArray jSONArray) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            List<BraintreeError> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "json.getJSONObject(i)");
                    arrayList.add(fromJson$BraintreeCore_release(jSONObject));
                } catch (JSONException unused) {
                }
            }
            return arrayList;
        }

        @JvmStatic
        public final List<BraintreeError> fromGraphQLJsonArray(JSONArray jSONArray) {
            List<BraintreeError> arrayList = new ArrayList<>();
            if (jSONArray == null) {
                return arrayList;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONObject optJSONObject = jSONObject.optJSONObject(GraphQLConstants.Keys.EXTENSIONS);
                    if (Intrinsics.areEqual((Object) optJSONObject != null ? optJSONObject.optString(GraphQLConstants.Keys.ERROR_TYPE) : null, (Object) GraphQLConstants.ErrorTypes.USER)) {
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray2 = optJSONObject.getJSONArray(GraphQLConstants.Keys.INPUT_PATH);
                        int length2 = jSONArray2.length();
                        for (int i2 = 1; i2 < length2; i2++) {
                            arrayList2.add(jSONArray2.getString(i2));
                        }
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "graphQLError");
                        addGraphQLFieldError(arrayList2, jSONObject, arrayList);
                    }
                } catch (JSONException unused) {
                }
            }
            return arrayList;
        }

        public final BraintreeError fromJson$BraintreeCore_release(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            BraintreeError braintreeError = new BraintreeError();
            braintreeError.setField$BraintreeCore_release(Json.optString(jSONObject, BraintreeError.FIELD_KEY, (String) null));
            braintreeError.setMessage$BraintreeCore_release(Json.optString(jSONObject, "message", (String) null));
            braintreeError.setCode$BraintreeCore_release(jSONObject.optInt("code", -1));
            braintreeError.setFieldErrors$BraintreeCore_release(BraintreeError.Companion.fromJsonArray$BraintreeCore_release(jSONObject.optJSONArray(BraintreeError.FIELD_ERRORS_KEY)));
            return braintreeError;
        }

        private final void addGraphQLFieldError(List<String> list, JSONObject jSONObject, List<BraintreeError> list2) throws JSONException {
            BraintreeError braintreeError;
            String str = list.get(0);
            if (list.size() == 1) {
                BraintreeError braintreeError2 = new BraintreeError();
                braintreeError2.setField$BraintreeCore_release(str);
                braintreeError2.setMessage$BraintreeCore_release(jSONObject.getString("message"));
                JSONObject optJSONObject = jSONObject.optJSONObject(GraphQLConstants.Keys.EXTENSIONS);
                if (optJSONObject != null) {
                    braintreeError2.setCode$BraintreeCore_release(optJSONObject.optInt(GraphQLConstants.Keys.LEGACY_CODE, -1));
                }
                braintreeError2.setFieldErrors$BraintreeCore_release(new ArrayList());
                if (list2 != null) {
                    list2.add(braintreeError2);
                    return;
                }
                return;
            }
            List<String> subList = list.subList(1, list.size());
            List<BraintreeError> list3 = null;
            if (list2 != null) {
                braintreeError = null;
                for (BraintreeError next : list2) {
                    if (Intrinsics.areEqual((Object) next.getField(), (Object) str)) {
                        braintreeError = next;
                    }
                }
                if (braintreeError == null) {
                    braintreeError = new BraintreeError();
                    braintreeError.setField$BraintreeCore_release(str);
                    braintreeError.setFieldErrors$BraintreeCore_release(new ArrayList());
                    list2.add(braintreeError);
                }
            } else {
                braintreeError = null;
            }
            if (braintreeError != null) {
                list3 = braintreeError.getFieldErrors();
            }
            addGraphQLFieldError(subList, jSONObject, list3);
        }
    }
}
