package com.cardinalcommerce.a;

import android.location.Location;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public final class setPivotX implements Runnable {
    private static int getInstance = 0;
    private static int init = 1;
    public char[] cca_continue;
    public char[] configure;

    public setPivotX(Location location) {
        this.configure = setHorizontalScrollBarEnabled.configure(String.valueOf(location.getLatitude()));
        this.cca_continue = setHorizontalScrollBarEnabled.configure(String.valueOf(location.getLongitude()));
    }

    public setPivotX() {
    }

    public final JSONObject Cardinal() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("Latitude", setHorizontalScrollBarEnabled.cca_continue(this.configure));
            jSONObject.putOpt("Longitude", setHorizontalScrollBarEnabled.cca_continue(this.cca_continue));
            int i = init;
            int i2 = ((i ^ 62) + ((i & 62) << 1)) - 1;
            getInstance = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException e) {
            setTranslationY.cca_continue().configure("13101", e.getLocalizedMessage(), (String) null);
        }
        int i4 = getInstance;
        int i5 = (i4 & 113) + (i4 | 113);
        init = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    public final void configure() {
        int i = init + 40;
        boolean z = true;
        int i2 = ((i | -1) << 1) - (i ^ -1);
        getInstance = i2 % 128;
        if (i2 % 2 == 0) {
            z = false;
        }
        Executors.newSingleThreadExecutor().execute(this);
        if (z) {
            Throwable th = null;
            super.hashCode();
            throw th;
        }
    }

    public final void run() {
        int i = init;
        int i2 = ((i & 101) - (~(i | 101))) - 1;
        getInstance = i2 % 128;
        Throwable th = null;
        if ((i2 % 2 != 0 ? ')' : 'V') == 'V') {
            setHorizontalScrollBarEnabled.getInstance(this.configure);
            setHorizontalScrollBarEnabled.getInstance(this.cca_continue);
            int i3 = getInstance;
            int i4 = i3 | 15;
            int i5 = (i4 << 1) - ((~(i3 & 15)) & i4);
            init = i5 % 128;
            if (i5 % 2 == 0) {
                throw th;
            }
            return;
        }
        setHorizontalScrollBarEnabled.getInstance(this.configure);
        setHorizontalScrollBarEnabled.getInstance(this.cca_continue);
        super.hashCode();
        throw th;
    }
}
