package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.MotionEvent;
import android.widget.EditText;
import java.util.HashMap;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.log.a;
import lib.android.paypal.com.magnessdk.network.b;
import lib.android.paypal.com.magnessdk.network.base.e;
import org.json.JSONException;
import org.json.JSONObject;

public final class MagnesSDK {
    private static final int j = 32;
    private static MagnesSDK k;
    public e a;
    MagnesSettings b;
    private JSONObject c;
    private Handler d;
    private HandlerThread e;
    private h f;
    private d g;
    private k h = k.b();
    private l i = l.e();

    private MagnesSDK() {
    }

    private MagnesResult a(Context context, String str, HashMap<String, String> hashMap, boolean z) throws InvalidInputException {
        String str2;
        String str3 = str;
        Class<MagnesSDK> cls = MagnesSDK.class;
        a.a((Class<?>) cls, 0, "COLLECT method called with paypalClientMetaDataId : " + str3 + " , Is pass in additionalData null? : " + Boolean.toString(hashMap == null));
        if (str3 == null || str.length() <= 32) {
            if (this.b == null) {
                a.a((Class<?>) cls, 2, "No MagnesSettings specified, using platform default.");
                Context context2 = context;
                MagnesSettings build = new MagnesSettings.Builder(context).build();
                this.b = build;
                setUp(build);
            }
            if (this.a.k()) {
                a.a((Class<?>) cls, 0, "nc presents, collecting coreData.");
                h hVar = new h();
                this.f = hVar;
                this.c = hVar.a(this.b, this.g, this.a);
                e.a(false);
            }
            JSONObject a2 = this.f.a(new i(z).a(this.b, this.g, this.a, this.f.b(), str, hashMap, this.d));
            try {
                a.a((Class<?>) cls, 0, "Device Info JSONObject : " + a2.toString(2));
                str2 = a2.getString(c.b.a);
            } catch (JSONException e2) {
                a.a((Class<?>) cls, 3, (Throwable) e2);
                str2 = null;
            }
            return new MagnesResult().setDeviceInfo(a2).setPaypalClientMetaDataId(str2);
        }
        throw new InvalidInputException(c.b.C0001c.CMID_EXCEPTION_MESSAGE.toString());
    }

    private void a(Context context, JSONObject jSONObject) {
        new b(c.h.d.DEVICE_INFO_URL, jSONObject, false, this.b, this.d).c();
        if (c()) {
            new lib.android.paypal.com.magnessdk.network.a(c.h.d.PRODUCTION_BEACON_URL, this.b, this.d, jSONObject).c();
        }
    }

    private void b() {
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread("MagnesHandlerThread");
            this.e = handlerThread;
            handlerThread.start();
            this.d = e.a(this.e.getLooper(), this);
        }
    }

    private boolean c() {
        return !this.b.isDisableBeacon() && this.b.getEnvironment() == Environment.LIVE;
    }

    public static synchronized MagnesSDK getInstance() {
        MagnesSDK magnesSDK;
        synchronized (MagnesSDK.class) {
            if (k == null) {
                k = new MagnesSDK();
            }
            magnesSDK = k;
        }
        return magnesSDK;
    }

    /* access modifiers changed from: package-private */
    public d a() {
        if (this.g == null) {
            this.g = new d(this.b, this.d);
        }
        return this.g;
    }

    public MagnesResult collect(Context context) {
        try {
            return a(context, (String) null, (HashMap<String, String>) null, false);
        } catch (InvalidInputException unused) {
            return null;
        }
    }

    public MagnesResult collect(Context context, String str, HashMap<String, String> hashMap) throws InvalidInputException {
        return a(context, str, hashMap, false);
    }

    public MagnesResult collectAndSubmit(Context context) {
        try {
            return collectAndSubmit(context, (String) null, (HashMap<String, String>) null);
        } catch (InvalidInputException unused) {
            return null;
        }
    }

    public MagnesResult collectAndSubmit(Context context, String str, HashMap<String, String> hashMap) throws InvalidInputException {
        a.a((Class<?>) MagnesSDK.class, 0, "SUBMIT method called with paypalClientMetaDataId : " + str + " , Is pass in additionalData null? : " + Boolean.toString(hashMap == null));
        if (str == null || str.length() <= 32) {
            MagnesResult a2 = a(context, str, hashMap, true);
            a(context, a2.getDeviceInfo());
            return a2;
        }
        throw new InvalidInputException(c.b.C0001c.CMID_EXCEPTION_MESSAGE.toString());
    }

    public void collectTelemetryData(Context context, EditText editText, String str, String str2, boolean z) {
        if (this.b == null) {
            a.a((Class<?>) MagnesSDK.class, 2, "No MagnesSettings specified, using platform default.");
            MagnesSettings build = new MagnesSettings.Builder(context).build();
            this.b = build;
            setUp(build);
        }
        k.b().a(editText, str, str2, context, z);
    }

    public void collectTouchData(MotionEvent motionEvent, Context context, String str) {
        if (this.b == null) {
            a.a((Class<?>) MagnesSDK.class, 2, "No MagnesSettings specified, using platform default.");
            MagnesSettings build = new MagnesSettings.Builder(context).build();
            this.b = build;
            setUp(build);
        }
        l.e().a(motionEvent, str);
    }

    public void setTelemetryFocusChanged(Context context, EditText editText, String str, String str2, boolean z) {
        if (this.b == null) {
            a.a((Class<?>) MagnesSDK.class, 2, "No MagnesSettings specified, using platform default.");
            MagnesSettings build = new MagnesSettings.Builder(context).build();
            this.b = build;
            setUp(build);
        }
        k.b().b(str, str2, z);
    }

    public MagnesSettings setUp(MagnesSettings magnesSettings) {
        this.b = magnesSettings;
        b();
        this.a = new e(magnesSettings, this.d);
        d dVar = new d(magnesSettings, this.d);
        this.g = dVar;
        this.h.a(dVar, this.b, this.d);
        this.i.a(this.g, this.b, this.d);
        if (this.f == null) {
            h hVar = new h();
            this.f = hVar;
            this.c = hVar.a(magnesSettings, this.g, this.a);
        }
        return magnesSettings;
    }
}
