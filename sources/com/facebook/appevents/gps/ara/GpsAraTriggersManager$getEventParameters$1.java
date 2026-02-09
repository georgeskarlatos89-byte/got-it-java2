package com.facebook.appevents.gps.ara;

import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "key", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: GpsAraTriggersManager.kt */
final class GpsAraTriggersManager$getEventParameters$1 extends Lambda implements Function1<String, String> {
    final /* synthetic */ JSONObject $params;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GpsAraTriggersManager$getEventParameters$1(JSONObject jSONObject) {
        super(1);
        this.$params = jSONObject;
    }

    public final String invoke(String str) {
        Object opt = this.$params.opt(str);
        if (opt == null) {
            return null;
        }
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            return encode + SignatureVisitor.INSTANCEOF + URLEncoder.encode(opt.toString(), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
