package com.cardinalcommerce.a;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import java.io.Serializable;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public final class setTransitionAlpha implements Serializable, Runnable {
    private static int getChallengeTimeout = 1;
    private static int setChallengeTimeout;
    public char[] Cardinal;
    public int CardinalActionCode;
    public boolean CardinalChallengeObserver;
    public char[] CardinalEnvironment;
    public char[] CardinalError;
    public boolean CardinalRenderType;
    public boolean CardinalUiType;
    public char[] cca_continue;
    public boolean cleanup;
    public int configure;
    public int getActionCode;
    public char[] getInstance;
    public char[] getSDKVersion;
    public boolean getString;
    public boolean getWarnings;
    public char[] init;
    public boolean onCReqSuccess;
    public char[] onValidated;
    private char[] setRequestTimeout;
    public int valueOf;
    public char[] values;

    setTransitionAlpha(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager != null) {
            this.Cardinal = setHorizontalScrollBarEnabled.configure(telephonyManager.getMmsUAProfUrl());
            this.init = setHorizontalScrollBarEnabled.configure(telephonyManager.getMmsUserAgent());
            this.configure = telephonyManager.getNetworkType();
            this.onValidated = setHorizontalScrollBarEnabled.configure(telephonyManager.getNetworkOperator());
            this.getSDKVersion = setHorizontalScrollBarEnabled.configure(telephonyManager.getNetworkOperatorName());
            this.values = setHorizontalScrollBarEnabled.configure(telephonyManager.getSimCountryIso());
            this.CardinalEnvironment = setHorizontalScrollBarEnabled.configure(telephonyManager.getSimOperator());
            this.CardinalError = setHorizontalScrollBarEnabled.configure(telephonyManager.getSimOperatorName());
            this.valueOf = telephonyManager.getSimState();
            this.CardinalRenderType = telephonyManager.hasIccCard();
            this.getActionCode = telephonyManager.getPhoneCount();
            this.onCReqSuccess = telephonyManager.isHearingAidCompatibilitySupported();
            this.cleanup = telephonyManager.isTtyModeSupported();
            this.getWarnings = telephonyManager.isWorldPhone();
            this.CardinalChallengeObserver = telephonyManager.isNetworkRoaming();
            this.CardinalUiType = telephonyManager.isSmsCapable();
            this.getString = telephonyManager.isVoiceCapable();
            this.getInstance = setHorizontalScrollBarEnabled.configure(telephonyManager.getNetworkCountryIso());
            this.cca_continue = setHorizontalScrollBarEnabled.configure(TimeZone.getDefault().getDisplayName());
            int phoneType = telephonyManager.getPhoneType();
            this.CardinalActionCode = phoneType;
            if (phoneType == 0) {
                this.setRequestTimeout = setHorizontalScrollBarEnabled.configure("PHONE_TYPE_NONE");
            } else if (phoneType == 1) {
                this.setRequestTimeout = setHorizontalScrollBarEnabled.configure("PHONE_TYPE_GSM");
            } else if (phoneType == 2) {
                this.setRequestTimeout = setHorizontalScrollBarEnabled.configure("CDMA");
            }
        }
    }

    public final JSONObject init() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("HasIccCard", Boolean.valueOf(this.CardinalRenderType));
            jSONObject.putOpt("IsHearingAidCompatibilitySupported", Boolean.valueOf(this.onCReqSuccess));
            jSONObject.putOpt("IsNetworkRoaming", Boolean.valueOf(this.CardinalChallengeObserver));
            jSONObject.putOpt("IsSmsCapable", Boolean.valueOf(this.CardinalUiType));
            jSONObject.putOpt("IsTtySupported", Boolean.valueOf(this.cleanup));
            jSONObject.putOpt("IsVoiceCapable", Boolean.valueOf(this.getString));
            jSONObject.putOpt("IsWorldPhone", Boolean.valueOf(this.getWarnings));
            jSONObject.putOpt("MmsUAProfUrl", setHorizontalScrollBarEnabled.cca_continue(this.Cardinal));
            jSONObject.putOpt("MmsUserAgent", setHorizontalScrollBarEnabled.cca_continue(this.init));
            jSONObject.putOpt("NetworkCountryISO", setHorizontalScrollBarEnabled.cca_continue(this.getInstance));
            jSONObject.putOpt("NetworkOperator", setHorizontalScrollBarEnabled.cca_continue(this.onValidated));
            jSONObject.putOpt("NetworkOperatorName", setHorizontalScrollBarEnabled.cca_continue(this.getSDKVersion));
            jSONObject.putOpt("NetworkType", Integer.valueOf(this.configure));
            jSONObject.putOpt("PhoneCount", Integer.valueOf(this.getActionCode));
            jSONObject.putOpt("PhoneType", Integer.valueOf(this.CardinalActionCode));
            jSONObject.putOpt("PhoneTypeString", setHorizontalScrollBarEnabled.cca_continue(this.setRequestTimeout));
            jSONObject.putOpt("SimCountryISO", setHorizontalScrollBarEnabled.cca_continue(this.values));
            jSONObject.putOpt("SimOperator", setHorizontalScrollBarEnabled.cca_continue(this.CardinalEnvironment));
            jSONObject.putOpt("SimOperatorName", setHorizontalScrollBarEnabled.cca_continue(this.CardinalError));
            jSONObject.putOpt("SimState", Integer.valueOf(this.valueOf));
            jSONObject.putOpt("TimeZone", setHorizontalScrollBarEnabled.cca_continue(this.cca_continue));
            int i = setChallengeTimeout + 49;
            getChallengeTimeout = i % 128;
            int i2 = i % 2;
        } catch (JSONException e) {
            setTranslationY.cca_continue().configure("13101", e.getLocalizedMessage(), (String) null);
        }
        int i3 = getChallengeTimeout;
        int i4 = i3 | 117;
        int i5 = (i4 << 1) - (~(-((~(i3 & 117)) & i4)));
        boolean z = true;
        int i6 = i5 - 1;
        setChallengeTimeout = i6 % 128;
        if (i6 % 2 == 0) {
            z = false;
        }
        if (!z) {
            return jSONObject;
        }
        int i7 = 88 / 0;
        return jSONObject;
    }

    public final void getInstance() {
        int i = getChallengeTimeout;
        int i2 = ((i | 36) << 1) - (i ^ 36);
        int i3 = (i2 ^ -1) + ((i2 & -1) << 1);
        setChallengeTimeout = i3 % 128;
        int i4 = i3 % 2;
        Executors.newSingleThreadExecutor().execute(this);
        int i5 = getChallengeTimeout;
        int i6 = ((i5 | 33) << 1) - (i5 ^ 33);
        setChallengeTimeout = i6 % 128;
        if ((i6 % 2 != 0 ? 'G' : 'T') == 'G') {
            throw null;
        }
    }

    public final void run() {
        int i = getChallengeTimeout;
        int i2 = (((i ^ 59) | (i & 59)) << 1) - (((~i) & 59) | (i & -60));
        setChallengeTimeout = i2 % 128;
        int i3 = i2 % 2;
        setHorizontalScrollBarEnabled.getInstance(this.cca_continue);
        setHorizontalScrollBarEnabled.getInstance(this.getInstance);
        boolean z = false;
        this.configure = 0;
        setHorizontalScrollBarEnabled.getInstance(this.Cardinal);
        setHorizontalScrollBarEnabled.getInstance(this.init);
        setHorizontalScrollBarEnabled.getInstance(this.onValidated);
        setHorizontalScrollBarEnabled.getInstance(this.getSDKVersion);
        this.onCReqSuccess = false;
        this.cleanup = false;
        this.getWarnings = false;
        setHorizontalScrollBarEnabled.getInstance(this.values);
        setHorizontalScrollBarEnabled.getInstance(this.CardinalEnvironment);
        setHorizontalScrollBarEnabled.getInstance(this.CardinalError);
        this.valueOf = 0;
        this.CardinalRenderType = false;
        this.CardinalChallengeObserver = false;
        this.CardinalUiType = false;
        this.getString = false;
        this.getActionCode = 0;
        setHorizontalScrollBarEnabled.getInstance(this.setRequestTimeout);
        this.CardinalActionCode = 0;
        int i4 = getChallengeTimeout;
        int i5 = i4 & 71;
        int i6 = (i5 - (~((i4 ^ 71) | i5))) - 1;
        setChallengeTimeout = i6 % 128;
        if (i6 % 2 == 0) {
            z = true;
        }
        if (!z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }
}
