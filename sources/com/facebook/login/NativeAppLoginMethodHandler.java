package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import co.gotitapp.android.modules.country.CountryPickerActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u001a\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J0\u0010\u001a\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0002J\"\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u001a\u0010(\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020$H\u0014R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006)"}, d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "tokenSource", "Lcom/facebook/AccessTokenSource;", "getTokenSource", "()Lcom/facebook/AccessTokenSource;", "completeLogin", "", "outcome", "Lcom/facebook/login/LoginClient$Result;", "getError", "", "extras", "Landroid/os/Bundle;", "getErrorMessage", "handleResultCancel", "request", "Lcom/facebook/login/LoginClient$Request;", "data", "Landroid/content/Intent;", "handleResultError", "error", "errorMessage", "errorCode", "handleResultOk", "isCallable", "", "intent", "onActivityResult", "requestCode", "", "resultCode", "processSuccessResponse", "tryAuthorize", "tryIntent", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NativeAppLoginMethodHandler.kt */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    private final AccessTokenSource tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;

    public abstract int tryAuthorize(LoginClient.Request request);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "source");
    }

    private final void processSuccessResponse(LoginClient.Request request, Bundle bundle) {
        if (!bundle.containsKey(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA) || Utility.isNullOrEmpty(bundle.getString(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA))) {
            handleResultOk(request, bundle);
        } else {
            FacebookSdk.getExecutor().execute(new NativeAppLoginMethodHandler$$ExternalSyntheticLambda0(this, request, bundle));
        }
    }

    /* access modifiers changed from: private */
    public static final void processSuccessResponse$lambda$0(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        Intrinsics.checkNotNullParameter(nativeAppLoginMethodHandler, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(bundle, "$extras");
        try {
            nativeAppLoginMethodHandler.handleResultOk(request, nativeAppLoginMethodHandler.processCodeExchange(request, bundle));
        } catch (FacebookServiceException e) {
            FacebookRequestError requestError = e.getRequestError();
            nativeAppLoginMethodHandler.handleResultError(request, requestError.getErrorType(), requestError.getErrorMessage(), String.valueOf(requestError.getErrorCode()));
        } catch (FacebookException e2) {
            nativeAppLoginMethodHandler.handleResultError(request, (String) null, e2.getMessage(), (String) null);
        }
    }

    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (intent == null) {
            completeLogin(LoginClient.Result.Companion.createCancelResult(pendingRequest, "Operation canceled"));
        } else if (i2 == 0) {
            handleResultCancel(pendingRequest, intent);
        } else if (i2 != -1) {
            completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, pendingRequest, "Unexpected resultCode from authorization.", (String) null, (String) null, 8, (Object) null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, pendingRequest, "Unexpected null from returned authorization data.", (String) null, (String) null, 8, (Object) null));
                return true;
            }
            String error = getError(extras);
            Object obj = extras.get("error_code");
            String obj2 = obj != null ? obj.toString() : null;
            String errorMessage = getErrorMessage(extras);
            String string = extras.getString("e2e");
            if (!Utility.isNullOrEmpty(string)) {
                logWebLoginCompleted(string);
            }
            if (error == null && obj2 == null && errorMessage == null && pendingRequest != null) {
                processSuccessResponse(pendingRequest, extras);
            } else {
                handleResultError(pendingRequest, error, errorMessage, obj2);
            }
        }
        return true;
    }

    private final void completeLogin(LoginClient.Result result) {
        if (result != null) {
            getLoginClient().completeAndValidate(result);
        } else {
            getLoginClient().tryNextHandler();
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultError(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && Intrinsics.areEqual((Object) str, (Object) "logged_out")) {
            CustomTabLoginMethodHandler.Companion companion = CustomTabLoginMethodHandler.Companion;
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            completeLogin((LoginClient.Result) null);
        } else if (CollectionsKt.contains(ServerProtocol.getErrorsProxyAuthDisabled(), str)) {
            completeLogin((LoginClient.Result) null);
        } else if (CollectionsKt.contains(ServerProtocol.getErrorsUserCanceled(), str)) {
            completeLogin(LoginClient.Result.Companion.createCancelResult(request, (String) null));
        } else {
            completeLogin(LoginClient.Result.Companion.createErrorResult(request, str, str2, str3));
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultOk(LoginClient.Request request, Bundle bundle) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        try {
            completeLogin(LoginClient.Result.Companion.createCompositeTokenResult(request, LoginMethodHandler.Companion.createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId()), LoginMethodHandler.Companion.createAuthenticationTokenFromWebBundle(bundle, request.getNonce())));
        } catch (FacebookException e) {
            completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, request, (String) null, e.getMessage(), (String) null, 8, (Object) null));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r5.get("error_code");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleResultCancel(com.facebook.login.LoginClient.Request r4, android.content.Intent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.os.Bundle r5 = r5.getExtras()
            java.lang.String r0 = r3.getError(r5)
            if (r5 == 0) goto L_0x001c
            java.lang.String r1 = "error_code"
            java.lang.Object r1 = r5.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.String r2 = com.facebook.internal.ServerProtocol.getErrorConnectionFailure()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r2 == 0) goto L_0x0035
            java.lang.String r5 = r3.getErrorMessage(r5)
            com.facebook.login.LoginClient$Result$Companion r2 = com.facebook.login.LoginClient.Result.Companion
            com.facebook.login.LoginClient$Result r4 = r2.createErrorResult(r4, r0, r5, r1)
            r3.completeLogin(r4)
            return
        L_0x0035:
            com.facebook.login.LoginClient$Result$Companion r5 = com.facebook.login.LoginClient.Result.Companion
            com.facebook.login.LoginClient$Result r4 = r5.createCancelResult(r4, r0)
            r3.completeLogin(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.NativeAppLoginMethodHandler.handleResultCancel(com.facebook.login.LoginClient$Request, android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public String getError(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("error")) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString("error_type");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String getErrorMessage(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("error_message")) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean tryIntent(Intent intent, int i) {
        ActivityResultLauncher<Intent> launcher;
        if (intent == null || !isCallable(intent)) {
            return false;
        }
        Fragment fragment = getLoginClient().getFragment();
        Unit unit = null;
        LoginFragment loginFragment = fragment instanceof LoginFragment ? (LoginFragment) fragment : null;
        if (!(loginFragment == null || (launcher = loginFragment.getLauncher()) == null)) {
            launcher.launch(intent);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            return false;
        }
        return true;
    }

    private final boolean isCallable(Intent intent) {
        List<ResolveInfo> queryIntentActivities = FacebookSdk.getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "getApplicationContext()\n…nager.MATCH_DEFAULT_ONLY)");
        return !queryIntentActivities.isEmpty();
    }
}
