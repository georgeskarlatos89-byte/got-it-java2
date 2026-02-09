package com.facebook.appevents.cloudbridge;

import com.facebook.internal.Utility;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "responseCode", "", "invoke", "(Ljava/lang/String;Ljava/lang/Integer;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
final class AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 extends Lambda implements Function2<String, Integer, Unit> {
    final /* synthetic */ List<Map<String, Object>> $processedEvents;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.$processedEvents = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (Integer) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(String str, Integer num) {
        Utility.runOnNonUiThread(new AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1$$ExternalSyntheticLambda0(num, this.$processedEvents));
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(Integer num, List list) {
        Intrinsics.checkNotNullParameter(list, "$processedEvents");
        if (!CollectionsKt.contains(AppEventsConversionsAPITransformerWebRequests.ACCEPTABLE_HTTP_RESPONSE, num)) {
            AppEventsConversionsAPITransformerWebRequests.INSTANCE.handleError$facebook_core_release(num, list, 5);
        }
    }
}
