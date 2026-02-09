package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;
import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.log.a;
import lib.android.paypal.com.magnessdk.network.base.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class m extends c implements SensorEventListener {
    private static AtomicInteger j = new AtomicInteger(0);
    private Sensor b;
    private SensorManager c;
    private JSONObject d;
    private JSONArray e;
    private Handler f;
    private JSONArray g;
    private int h;
    private long i = 0;

    m(Context context, Handler handler, int i2) {
        this.f = handler;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.c = sensorManager;
        this.h = i2;
        this.b = sensorManager.getDefaultSensor(i2);
    }

    private void a(SensorManager sensorManager) {
        AtomicInteger atomicInteger;
        try {
            if (this.b != null && (atomicInteger = j) != null && atomicInteger.get() < 120) {
                sensorManager.registerListener(this, this.b, 50000, this.f);
                j.getAndIncrement();
                JSONObject a = f.a(this.d, f.a(this.b));
                this.d = a;
                if (this.h == 1) {
                    a.put(c.a.SENSOR_TYPE.toString(), c.l.AC.toString());
                }
                if (this.h == 4) {
                    this.d.put(c.a.SENSOR_TYPE.toString(), c.l.GY.toString());
                }
                if (this.h == 2) {
                    this.d.put(c.a.SENSOR_TYPE.toString(), c.l.MG.toString());
                }
            }
        } catch (JSONException e2) {
            a.a(getClass(), 3, (Throwable) e2);
        }
    }

    private void b(SensorManager sensorManager) {
        a(sensorManager);
    }

    private void c(SensorManager sensorManager) {
        sensorManager.unregisterListener(this, this.b);
        AtomicInteger atomicInteger = j;
        if (atomicInteger != null && atomicInteger.get() > 0) {
            j.getAndDecrement();
        }
    }

    private void e() {
        try {
            this.d.put(c.a.SENSOR_PAYLOAD.toString(), this.g);
            this.e.put(this.d);
        } catch (JSONException e2) {
            a.a(getClass(), 3, (Throwable) e2);
        }
    }

    public void c() {
        this.d = new JSONObject();
        this.g = new JSONArray();
        this.e = new JSONArray();
        b();
    }

    public void d() {
        b(this.c);
    }

    public JSONObject f() {
        if (this.b == null) {
            return new JSONObject();
        }
        c(this.c);
        e();
        return this.d;
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.i > 25 && this.g.length() < 150) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(String.valueOf((double) sensorEvent.values[0]));
            jSONArray.put(String.valueOf((double) sensorEvent.values[1]));
            jSONArray.put(String.valueOf((double) sensorEvent.values[2]));
            jSONArray.put(currentTimeMillis);
            this.g.put(jSONArray);
            this.i = currentTimeMillis;
        }
    }

    public void run() {
        if (this.f != null) {
            d();
        }
    }
}
