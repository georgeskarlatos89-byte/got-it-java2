package com.facebook.login;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DeviceAuthDialog$$ExternalSyntheticLambda4 implements GraphRequest.Callback {
    public final /* synthetic */ DeviceAuthDialog f$0;

    public /* synthetic */ DeviceAuthDialog$$ExternalSyntheticLambda4(DeviceAuthDialog deviceAuthDialog) {
        this.f$0 = deviceAuthDialog;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        DeviceAuthDialog._get_pollRequest_$lambda$5(this.f$0, graphResponse);
    }
}
