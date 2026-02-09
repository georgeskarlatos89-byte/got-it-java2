package com.cardinalcommerce.cardinalmobilesdk.models;

import com.cardinalcommerce.a.onCReqSuccess;

public class Payload {
    private boolean Cardinal;
    private boolean cca_continue;
    private int configure;
    public onCReqSuccess deviceFingerprint;
    public String deviceFingerprintUrl;
    private boolean getInstance;
    private boolean getSDKVersion;
    private boolean getWarnings;
    private String init;

    public boolean isEnabledDiscover() {
        return this.cca_continue;
    }

    public void setEnabledDiscover(boolean z) {
        this.cca_continue = z;
    }

    public boolean isEnabledPaypal() {
        return this.getInstance;
    }

    public void setEnabledPaypal(boolean z) {
        this.getInstance = z;
    }

    public onCReqSuccess getDeviceFingerprint() {
        return this.deviceFingerprint;
    }

    public void setDeviceFingerprint(onCReqSuccess oncreqsuccess) {
        this.deviceFingerprint = oncreqsuccess;
    }

    public int getErrorNumber() {
        return this.configure;
    }

    public void setErrorNumber(int i) {
        this.configure = i;
    }

    public String getErrorDescription() {
        return this.init;
    }

    public void setErrorDescription(String str) {
        this.init = str;
    }

    public String getDeviceFingerprintUrl() {
        return this.deviceFingerprintUrl;
    }

    public void setDeviceFingerprintUrl(String str) {
        this.deviceFingerprintUrl = str;
    }

    public boolean isEnabledCCA() {
        return this.Cardinal;
    }

    public void setEnabledCCA(boolean z) {
        this.Cardinal = z;
    }

    public boolean isEnabledHostedFields() {
        return this.getWarnings;
    }

    public void setEnabledHostedFields(boolean z) {
        this.getWarnings = z;
    }

    public boolean isEnabledVisaCheckout() {
        return this.getSDKVersion;
    }

    public void setEnabledVisaCheckout(boolean z) {
        this.getSDKVersion = z;
    }
}
