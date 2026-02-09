package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import org.apache.http.HttpStatus;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class FcmBroadcastProcessor$$ExternalSyntheticLambda2 implements Continuation {
    public static final /* synthetic */ FcmBroadcastProcessor$$ExternalSyntheticLambda2 INSTANCE = new FcmBroadcastProcessor$$ExternalSyntheticLambda2();

    private /* synthetic */ FcmBroadcastProcessor$$ExternalSyntheticLambda2() {
    }

    public final Object then(Task task) {
        return Integer.valueOf(HttpStatus.SC_FORBIDDEN);
    }
}
