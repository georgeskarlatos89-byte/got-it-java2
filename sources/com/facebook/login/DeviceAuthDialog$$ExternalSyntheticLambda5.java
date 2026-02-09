package com.facebook.login;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DeviceAuthDialog$$ExternalSyntheticLambda5 implements GraphRequest.Callback {
    public final /* synthetic */ DeviceAuthDialog f$0;

    public /* synthetic */ DeviceAuthDialog$$ExternalSyntheticLambda5(DeviceAuthDialog deviceAuthDialog) {
        this.f$0 = deviceAuthDialog;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        DeviceAuthDialog.startLogin$lambda$1(this.f$0, graphResponse);
    }
}
