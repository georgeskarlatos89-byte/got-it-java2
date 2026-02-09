package com.facebook.appevents.gps.ara;

import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.facebook.appevents.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/facebook/appevents/gps/ara/GpsAraTriggersManager$registerTrigger$outcomeReceiver$1", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "", "error", "onResult", "result", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: GpsAraTriggersManager.kt */
public final class GpsAraTriggersManager$registerTrigger$outcomeReceiver$1 implements OutcomeReceiver<Object, Exception> {
    GpsAraTriggersManager$registerTrigger$outcomeReceiver$1() {
    }

    public void onResult(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "result");
        Log.d(GpsAraTriggersManager.access$getTAG$p(), "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
        GpsDebugLogger access$getGpsDebugLogger$p = GpsAraTriggersManager.access$getGpsDebugLogger$p();
        if (access$getGpsDebugLogger$p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            access$getGpsDebugLogger$p = null;
        }
        access$getGpsDebugLogger$p.log(Constants.GPS_ARA_SUCCEED, (Bundle) null);
    }

    public void onError(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "error");
        Log.d(GpsAraTriggersManager.access$getTAG$p(), "OUTCOME_RECEIVER_TRIGGER_FAILURE");
        GpsDebugLogger access$getGpsDebugLogger$p = GpsAraTriggersManager.access$getGpsDebugLogger$p();
        if (access$getGpsDebugLogger$p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            access$getGpsDebugLogger$p = null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constants.GPS_ARA_FAILED_REASON, exc.toString());
        Unit unit = Unit.INSTANCE;
        access$getGpsDebugLogger$p.log(Constants.GPS_ARA_FAILED, bundle);
    }
}
