package io.sentry;

import java.util.concurrent.Callable;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SentryEnvelopeItem$$ExternalSyntheticLambda11 implements Callable {
    public final /* synthetic */ Attachment f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ SentryEnvelopeItem$$ExternalSyntheticLambda11(Attachment attachment, long j) {
        this.f$0 = attachment;
        this.f$1 = j;
    }

    public final Object call() {
        return SentryEnvelopeItem.lambda$fromAttachment$9(this.f$0, this.f$1);
    }
}
