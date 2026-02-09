package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import co.gotitapp.android.modules.country.CountryPickerActivity;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.common.R;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0016\u0018\u0000 J2\u00020\u0001:\u0003JKLB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016J4\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J\b\u0010'\u001a\u00020\u001dH\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000fH\u0015J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u000fH\u0014J\b\u0010,\u001a\u00020\u000fH\u0014J\b\u0010-\u001a\u00020\u001fH\u0014J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J&\u00102\u001a\u0004\u0018\u00010\u00162\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00107\u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020=H\u0014J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u000201H\u0016J'\u0010@\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020B2\b\u0010&\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020\u001fH\u0002J<\u0010E\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J\b\u0010G\u001a\u00020\u001fH\u0002J\u0010\u0010H\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010I\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "completed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "confirmationCode", "Landroid/widget/TextView;", "currentGraphRequestPoll", "Lcom/facebook/GraphRequestAsyncTask;", "currentRequestState", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "deviceAuthMethodHandler", "Lcom/facebook/login/DeviceAuthMethodHandler;", "instructions", "isBeingDestroyed", "", "isRetry", "pollRequest", "Lcom/facebook/GraphRequest;", "getPollRequest", "()Lcom/facebook/GraphRequest;", "progressBar", "Landroid/view/View;", "request", "Lcom/facebook/login/LoginClient$Request;", "scheduledPoll", "Ljava/util/concurrent/ScheduledFuture;", "additionalDeviceInfo", "", "", "completeLogin", "", "userId", "permissions", "Lcom/facebook/login/DeviceAuthDialog$PermissionsLists;", "accessToken", "expirationTime", "Ljava/util/Date;", "dataAccessExpirationTime", "getApplicationAccessToken", "getLayoutResId", "", "isSmartLogin", "initializeContentView", "onBackButtonPressed", "onCancel", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onError", "ex", "Lcom/facebook/FacebookException;", "onSaveInstanceState", "outState", "onSuccess", "expiresIn", "", "(Ljava/lang/String;JLjava/lang/Long;)V", "poll", "presentConfirmation", "name", "schedulePoll", "setCurrentRequestState", "startLogin", "Companion", "PermissionsLists", "RequestState", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DeviceAuthDialog.kt */
public class DeviceAuthDialog extends DialogFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String DEVICE_LOGIN_ENDPOINT = "device/login";
    /* access modifiers changed from: private */
    public static final String DEVICE_LOGIN_STATUS_ENDPOINT = "device/login_status";
    private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED = 1349173;
    /* access modifiers changed from: private */
    public static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING = 1349174;
    private static final int LOGIN_ERROR_SUBCODE_CODE_EXPIRED = 1349152;
    private static final int LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING = 1349172;
    private static final String REQUEST_STATE_KEY = "request_state";
    private final AtomicBoolean completed = new AtomicBoolean();
    private TextView confirmationCode;
    private volatile GraphRequestAsyncTask currentGraphRequestPoll;
    private volatile RequestState currentRequestState;
    private DeviceAuthMethodHandler deviceAuthMethodHandler;
    private TextView instructions;
    private boolean isBeingDestroyed;
    private boolean isRetry;
    private View progressBar;
    private LoginClient.Request request;
    private volatile ScheduledFuture<?> scheduledPoll;

    public Map<String, String> additionalDeviceInfo() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean onBackButtonPressed() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r3 = r3.getLoginClient();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
        /*
            r1 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.view.View r2 = super.onCreateView(r2, r3, r4)
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.FacebookActivity"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            com.facebook.FacebookActivity r3 = (com.facebook.FacebookActivity) r3
            androidx.fragment.app.Fragment r3 = r3.getCurrentFragment()
            com.facebook.login.LoginFragment r3 = (com.facebook.login.LoginFragment) r3
            if (r3 == 0) goto L_0x0027
            com.facebook.login.LoginClient r3 = r3.getLoginClient()
            if (r3 == 0) goto L_0x0027
            com.facebook.login.LoginMethodHandler r3 = r3.getCurrentHandler()
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            com.facebook.login.DeviceAuthMethodHandler r3 = (com.facebook.login.DeviceAuthMethodHandler) r3
            r1.deviceAuthMethodHandler = r3
            if (r4 == 0) goto L_0x003b
            java.lang.String r3 = "request_state"
            android.os.Parcelable r3 = r4.getParcelable(r3)
            com.facebook.login.DeviceAuthDialog$RequestState r3 = (com.facebook.login.DeviceAuthDialog.RequestState) r3
            if (r3 == 0) goto L_0x003b
            r1.setCurrentRequestState(r3)
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.DeviceAuthDialog.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog deviceAuthDialog$onCreateDialog$dialog$1 = new DeviceAuthDialog$onCreateDialog$dialog$1(this, requireActivity(), R.style.com_facebook_auth_dialog);
        deviceAuthDialog$onCreateDialog$dialog$1.setContentView(initializeContentView(DeviceRequestsHelper.isAvailable() && !this.isRetry));
        return deviceAuthDialog$onCreateDialog$dialog$1;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.isBeingDestroyed) {
            onCancel();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.currentRequestState != null) {
            bundle.putParcelable(REQUEST_STATE_KEY, this.currentRequestState);
        }
    }

    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        GraphRequestAsyncTask graphRequestAsyncTask = this.currentGraphRequestPoll;
        if (graphRequestAsyncTask != null) {
            graphRequestAsyncTask.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.scheduledPoll;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public void startLogin(LoginClient.Request request2) {
        Intrinsics.checkNotNullParameter(request2, "request");
        this.request = request2;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request2.getPermissions()));
        Utility.putNonEmptyString(bundle, ServerProtocol.DIALOG_PARAM_REDIRECT_URI, request2.getDeviceRedirectUriString());
        Utility.putNonEmptyString(bundle, DeviceRequestsHelper.DEVICE_TARGET_USER_ID, request2.getDeviceAuthTargetUserId());
        bundle.putString("access_token", getApplicationAccessToken());
        Map<String, String> additionalDeviceInfo = additionalDeviceInfo();
        bundle.putString(DeviceRequestsHelper.DEVICE_INFO_PARAM, DeviceRequestsHelper.getDeviceInfo(additionalDeviceInfo != null ? MapsKt.toMutableMap(additionalDeviceInfo) : null));
        GraphRequest.Companion.newPostRequestWithBundle((AccessToken) null, DEVICE_LOGIN_ENDPOINT, bundle, new DeviceAuthDialog$$ExternalSyntheticLambda5(this)).executeAsync();
    }

    /* access modifiers changed from: private */
    public static final void startLogin$lambda$1(DeviceAuthDialog deviceAuthDialog, GraphResponse graphResponse) {
        FacebookException facebookException;
        Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
        Intrinsics.checkNotNullParameter(graphResponse, "response");
        if (!deviceAuthDialog.isBeingDestroyed) {
            if (graphResponse.getError() != null) {
                FacebookRequestError error = graphResponse.getError();
                if (error == null || (facebookException = error.getException()) == null) {
                    facebookException = new FacebookException();
                }
                deviceAuthDialog.onError(facebookException);
                return;
            }
            JSONObject jSONObject = graphResponse.getJSONObject();
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            RequestState requestState = new RequestState();
            try {
                requestState.setUserCode(jSONObject.getString("user_code"));
                requestState.setRequestCode(jSONObject.getString(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA));
                requestState.setInterval(jSONObject.getLong("interval"));
                deviceAuthDialog.setCurrentRequestState(requestState);
            } catch (JSONException e) {
                deviceAuthDialog.onError(new FacebookException((Throwable) e));
            }
        }
    }

    public String getApplicationAccessToken() {
        return Validate.hasAppID() + '|' + Validate.hasClientToken();
    }

    private final void setCurrentRequestState(RequestState requestState) {
        this.currentRequestState = requestState;
        TextView textView = this.confirmationCode;
        View view = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            textView = null;
        }
        textView.setText(requestState.getUserCode());
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), DeviceRequestsHelper.generateQRCode(requestState.getAuthorizationUri()));
        TextView textView2 = this.instructions;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructions");
            textView2 = null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            textView3 = null;
        }
        textView3.setVisibility(0);
        View view2 = this.progressBar;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        } else {
            view = view2;
        }
        view.setVisibility(8);
        if (!this.isRetry && DeviceRequestsHelper.startAdvertisementService(requestState.getUserCode())) {
            new InternalAppEventsLogger(getContext()).logEventImplicitly(AnalyticsEvents.EVENT_SMART_LOGIN_SERVICE);
        }
        if (requestState.withinLastRefreshWindow()) {
            schedulePoll();
        } else {
            poll();
        }
    }

    /* access modifiers changed from: protected */
    public View initializeContentView(boolean z) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        TextView textView = null;
        View inflate = layoutInflater.inflate(getLayoutResId(z), (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(getLayo…esId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(R.id.progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress_bar)");
        this.progressBar = findViewById;
        View findViewById2 = inflate.findViewById(R.id.confirmation_code);
        Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.confirmationCode = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.cancel_button);
        Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) findViewById3).setOnClickListener(new DeviceAuthDialog$$ExternalSyntheticLambda6(this));
        View findViewById4 = inflate.findViewById(R.id.com_facebook_device_auth_instructions);
        Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        this.instructions = textView2;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructions");
        } else {
            textView = textView2;
        }
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* access modifiers changed from: private */
    public static final void initializeContentView$lambda$2(DeviceAuthDialog deviceAuthDialog, View view) {
        Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
        deviceAuthDialog.onCancel();
    }

    /* access modifiers changed from: protected */
    public int getLayoutResId(boolean z) {
        if (z) {
            return R.layout.com_facebook_smart_device_dialog_fragment;
        }
        return R.layout.com_facebook_device_auth_dialog_fragment;
    }

    private final void poll() {
        RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.setLastPoll(new Date().getTime());
        }
        this.currentGraphRequestPoll = getPollRequest().executeAsync();
    }

    private final void schedulePoll() {
        RequestState requestState = this.currentRequestState;
        Long valueOf = requestState != null ? Long.valueOf(requestState.getInterval()) : null;
        if (valueOf != null) {
            this.scheduledPoll = DeviceAuthMethodHandler.Companion.getBackgroundExecutor().schedule(new DeviceAuthDialog$$ExternalSyntheticLambda3(this), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: private */
    public static final void schedulePoll$lambda$3(DeviceAuthDialog deviceAuthDialog) {
        Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
        deviceAuthDialog.poll();
    }

    private final GraphRequest getPollRequest() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.currentRequestState;
        bundle.putString(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA, requestState != null ? requestState.getRequestCode() : null);
        bundle.putString("access_token", getApplicationAccessToken());
        return GraphRequest.Companion.newPostRequestWithBundle((AccessToken) null, DEVICE_LOGIN_STATUS_ENDPOINT, bundle, new DeviceAuthDialog$$ExternalSyntheticLambda4(this));
    }

    /* access modifiers changed from: private */
    public static final void _get_pollRequest_$lambda$5(DeviceAuthDialog deviceAuthDialog, GraphResponse graphResponse) {
        FacebookException facebookException;
        Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
        Intrinsics.checkNotNullParameter(graphResponse, "response");
        if (!deviceAuthDialog.completed.get()) {
            FacebookRequestError error = graphResponse.getError();
            if (error != null) {
                int subErrorCode = error.getSubErrorCode();
                boolean z = true;
                if (!(subErrorCode == LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING || subErrorCode == LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING)) {
                    z = false;
                }
                if (z) {
                    deviceAuthDialog.schedulePoll();
                } else if (subErrorCode == LOGIN_ERROR_SUBCODE_CODE_EXPIRED) {
                    RequestState requestState = deviceAuthDialog.currentRequestState;
                    if (requestState != null) {
                        DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
                    }
                    LoginClient.Request request2 = deviceAuthDialog.request;
                    if (request2 != null) {
                        deviceAuthDialog.startLogin(request2);
                    } else {
                        deviceAuthDialog.onCancel();
                    }
                } else if (subErrorCode == LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED) {
                    deviceAuthDialog.onCancel();
                } else {
                    FacebookRequestError error2 = graphResponse.getError();
                    if (error2 == null || (facebookException = error2.getException()) == null) {
                        facebookException = new FacebookException();
                    }
                    deviceAuthDialog.onError(facebookException);
                }
            } else {
                try {
                    JSONObject jSONObject = graphResponse.getJSONObject();
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    String string = jSONObject.getString("access_token");
                    Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                    deviceAuthDialog.onSuccess(string, jSONObject.getLong(AccessToken.EXPIRES_IN_KEY), Long.valueOf(jSONObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
                } catch (JSONException e) {
                    deviceAuthDialog.onError(new FacebookException((Throwable) e));
                }
            }
        }
    }

    private final void presentConfirmation(String str, PermissionsLists permissionsLists, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…login_confirmation_title)");
        String string2 = getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…confirmation_continue_as)");
        String string3 = getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.st…ogin_confirmation_cancel)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DeviceAuthDialog$$ExternalSyntheticLambda1(this, str, permissionsLists, str2, date, date2)).setPositiveButton(string3, new DeviceAuthDialog$$ExternalSyntheticLambda2(this));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    public static final void presentConfirmation$lambda$6(DeviceAuthDialog deviceAuthDialog, String str, PermissionsLists permissionsLists, String str2, Date date, Date date2, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
        Intrinsics.checkNotNullParameter(str, "$userId");
        Intrinsics.checkNotNullParameter(permissionsLists, "$permissions");
        Intrinsics.checkNotNullParameter(str2, "$accessToken");
        deviceAuthDialog.completeLogin(str, permissionsLists, str2, date, date2);
    }

    /* access modifiers changed from: private */
    public static final void presentConfirmation$lambda$8(DeviceAuthDialog deviceAuthDialog, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
        View initializeContentView = deviceAuthDialog.initializeContentView(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(initializeContentView);
        }
        LoginClient.Request request2 = deviceAuthDialog.request;
        if (request2 != null) {
            deviceAuthDialog.startLogin(request2);
        }
    }

    private final void onSuccess(String str, long j, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, "id,permissions,name");
        Date date = null;
        Date date2 = j != 0 ? new Date(new Date().getTime() + (j * 1000)) : null;
        if ((l == null || l.longValue() != 0) && l != null) {
            date = new Date(l.longValue() * 1000);
        }
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(new AccessToken(str, FacebookSdk.getApplicationId(), "0", (Collection) null, (Collection) null, (Collection) null, (AccessTokenSource) null, date2, (Date) null, date, (String) null, 1024, (DefaultConstructorMarker) null), TournamentShareDialogURIBuilder.me, new DeviceAuthDialog$$ExternalSyntheticLambda0(this, str, date2, date));
        newGraphPathRequest.setHttpMethod(HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        newGraphPathRequest.executeAsync();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        r12 = r12.getSmartLoginOptions();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void onSuccess$lambda$10(com.facebook.login.DeviceAuthDialog r8, java.lang.String r9, java.util.Date r10, java.util.Date r11, com.facebook.GraphResponse r12) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "$accessToken"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.completed
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0018
            return
        L_0x0018:
            com.facebook.FacebookRequestError r0 = r12.getError()
            if (r0 == 0) goto L_0x002d
            com.facebook.FacebookException r9 = r0.getException()
            if (r9 != 0) goto L_0x0029
            com.facebook.FacebookException r9 = new com.facebook.FacebookException
            r9.<init>()
        L_0x0029:
            r8.onError(r9)
            return
        L_0x002d:
            org.json.JSONObject r12 = r12.getJSONObject()     // Catch:{ JSONException -> 0x009c }
            if (r12 != 0) goto L_0x0038
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009c }
            r12.<init>()     // Catch:{ JSONException -> 0x009c }
        L_0x0038:
            java.lang.String r0 = "id"
            java.lang.String r2 = r12.getString(r0)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r0 = "jsonObject.getString(\"id\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch:{ JSONException -> 0x009c }
            com.facebook.login.DeviceAuthDialog$Companion r0 = Companion     // Catch:{ JSONException -> 0x009c }
            com.facebook.login.DeviceAuthDialog$PermissionsLists r3 = r0.handlePermissionResponse(r12)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r0 = "name"
            java.lang.String r5 = r12.getString(r0)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r12 = "jsonObject.getString(\"name\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r12)     // Catch:{ JSONException -> 0x009c }
            com.facebook.login.DeviceAuthDialog$RequestState r12 = r8.currentRequestState
            if (r12 == 0) goto L_0x005f
            java.lang.String r12 = r12.getUserCode()
            com.facebook.devicerequests.internal.DeviceRequestsHelper.cleanUpAdvertisementService(r12)
        L_0x005f:
            java.lang.String r12 = com.facebook.FacebookSdk.getApplicationId()
            com.facebook.internal.FetchedAppSettings r12 = com.facebook.internal.FetchedAppSettingsManager.getAppSettingsWithoutQuery(r12)
            if (r12 == 0) goto L_0x007a
            java.util.EnumSet r12 = r12.getSmartLoginOptions()
            if (r12 == 0) goto L_0x007a
            com.facebook.internal.SmartLoginOption r0 = com.facebook.internal.SmartLoginOption.RequireConfirm
            boolean r12 = r12.contains(r0)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            goto L_0x007b
        L_0x007a:
            r12 = 0
        L_0x007b:
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r1)
            if (r12 == 0) goto L_0x0094
            boolean r12 = r8.isRetry
            if (r12 != 0) goto L_0x0094
            r8.isRetry = r0
            r1 = r8
            r4 = r9
            r6 = r10
            r7 = r11
            r1.presentConfirmation(r2, r3, r4, r5, r6, r7)
            return
        L_0x0094:
            r1 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.completeLogin(r2, r3, r4, r5, r6)
            return
        L_0x009c:
            r9 = move-exception
            com.facebook.FacebookException r10 = new com.facebook.FacebookException
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r10.<init>((java.lang.Throwable) r9)
            r8.onError(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.DeviceAuthDialog.onSuccess$lambda$10(com.facebook.login.DeviceAuthDialog, java.lang.String, java.util.Date, java.util.Date, com.facebook.GraphResponse):void");
    }

    private final void completeLogin(String str, PermissionsLists permissionsLists, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler2 = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler2 != null) {
            deviceAuthMethodHandler2.onSuccess(str2, FacebookSdk.getApplicationId(), str, permissionsLists.getGrantedPermissions(), permissionsLists.getDeclinedPermissions(), permissionsLists.getExpiredPermissions(), AccessTokenSource.DEVICE_AUTH, date, (Date) null, date2);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onError(FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(facebookException, "ex");
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler2 = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler2 != null) {
                deviceAuthMethodHandler2.onError(facebookException);
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCancel() {
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                DeviceRequestsHelper.cleanUpAdvertisementService(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler2 = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler2 != null) {
                deviceAuthMethodHandler2.onCancel();
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0018H\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "<set-?>", "", "authorizationUri", "getAuthorizationUri", "()Ljava/lang/String;", "interval", "", "getInterval", "()J", "setInterval", "(J)V", "lastPoll", "requestCode", "getRequestCode", "setRequestCode", "(Ljava/lang/String;)V", "userCode", "describeContents", "", "getUserCode", "setLastPoll", "", "setUserCode", "withinLastRefreshWindow", "", "writeToParcel", "dest", "flags", "Companion", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DeviceAuthDialog.kt */
    private static final class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new DeviceAuthDialog$RequestState$Companion$CREATOR$1();
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private String authorizationUri;
        private long interval;
        private long lastPoll;
        private String requestCode;
        private String userCode;

        public int describeContents() {
            return 0;
        }

        public final String getAuthorizationUri() {
            return this.authorizationUri;
        }

        public final String getRequestCode() {
            return this.requestCode;
        }

        public final void setRequestCode(String str) {
            this.requestCode = str;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final void setInterval(long j) {
            this.interval = j;
        }

        public RequestState() {
        }

        public final String getUserCode() {
            return this.userCode;
        }

        public final void setUserCode(String str) {
            this.userCode = str;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
            this.authorizationUri = format;
        }

        public final void setLastPoll(long j) {
            this.lastPoll = j;
        }

        protected RequestState(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        public final boolean withinLastRefreshWindow() {
            if (this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.authorizationUri);
            parcel.writeString(this.userCode);
            parcel.writeString(this.requestCode);
            parcel.writeLong(this.interval);
            parcel.writeLong(this.lastPoll);
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: DeviceAuthDialog.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0000XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0000XD¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u00020\f8\u0000XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$Companion;", "", "()V", "DEVICE_LOGIN_ENDPOINT", "", "getDEVICE_LOGIN_ENDPOINT$facebook_common_release$annotations", "getDEVICE_LOGIN_ENDPOINT$facebook_common_release", "()Ljava/lang/String;", "DEVICE_LOGIN_STATUS_ENDPOINT", "getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release$annotations", "getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release", "LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED", "", "LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING", "getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release$annotations", "getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release", "()I", "LOGIN_ERROR_SUBCODE_CODE_EXPIRED", "LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING", "REQUEST_STATE_KEY", "handlePermissionResponse", "Lcom/facebook/login/DeviceAuthDialog$PermissionsLists;", "result", "Lorg/json/JSONObject;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DeviceAuthDialog.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDEVICE_LOGIN_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release$annotations() {
        }

        public static /* synthetic */ void getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release$annotations() {
        }

        private Companion() {
        }

        public final String getDEVICE_LOGIN_ENDPOINT$facebook_common_release() {
            return DeviceAuthDialog.DEVICE_LOGIN_ENDPOINT;
        }

        public final String getDEVICE_LOGIN_STATUS_ENDPOINT$facebook_common_release() {
            return DeviceAuthDialog.DEVICE_LOGIN_STATUS_ENDPOINT;
        }

        public final int getLOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING$facebook_common_release() {
            return DeviceAuthDialog.LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING;
        }

        /* access modifiers changed from: private */
        public final PermissionsLists handlePermissionResponse(JSONObject jSONObject) throws JSONException {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString2 = optJSONObject.optString("permission");
                Intrinsics.checkNotNullExpressionValue(optString2, "permission");
                if (!(optString2.length() == 0) && !Intrinsics.areEqual((Object) optString2, (Object) "installed") && (optString = optJSONObject.optString("status")) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                arrayList2.add(optString2);
                            }
                        } else if (optString.equals("granted")) {
                            arrayList.add(optString2);
                        }
                    } else if (optString.equals("expired")) {
                        arrayList3.add(optString2);
                    }
                }
            }
            return new PermissionsLists(arrayList, arrayList2, arrayList3);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$PermissionsLists;", "", "grantedPermissions", "", "", "declinedPermissions", "expiredPermissions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDeclinedPermissions", "()Ljava/util/List;", "setDeclinedPermissions", "(Ljava/util/List;)V", "getExpiredPermissions", "setExpiredPermissions", "getGrantedPermissions", "setGrantedPermissions", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DeviceAuthDialog.kt */
    private static final class PermissionsLists {
        private List<String> declinedPermissions;
        private List<String> expiredPermissions;
        private List<String> grantedPermissions;

        public PermissionsLists(List<String> list, List<String> list2, List<String> list3) {
            Intrinsics.checkNotNullParameter(list, "grantedPermissions");
            Intrinsics.checkNotNullParameter(list2, SDKConstants.PARAM_DECLINED_PERMISSIONS);
            Intrinsics.checkNotNullParameter(list3, SDKConstants.PARAM_EXPIRED_PERMISSIONS);
            this.grantedPermissions = list;
            this.declinedPermissions = list2;
            this.expiredPermissions = list3;
        }

        public final List<String> getGrantedPermissions() {
            return this.grantedPermissions;
        }

        public final void setGrantedPermissions(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.grantedPermissions = list;
        }

        public final List<String> getDeclinedPermissions() {
            return this.declinedPermissions;
        }

        public final void setDeclinedPermissions(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.declinedPermissions = list;
        }

        public final List<String> getExpiredPermissions() {
            return this.expiredPermissions;
        }

        public final void setExpiredPermissions(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.expiredPermissions = list;
        }
    }
}
