package lib.android.paypal.com.magnessdk.network.base;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class d {
    private static final Object b = new Object();
    private static d c;
    private ThreadPoolExecutor a;

    private d() {
        try {
            this.a = new ThreadPoolExecutor(10, 10, 60000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(256), new ThreadPoolExecutor.DiscardPolicy());
        } catch (Exception unused) {
        }
    }

    static d a() {
        d dVar;
        synchronized (b) {
            if (c == null) {
                c = new d();
            }
            dVar = c;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        this.a.execute(cVar);
    }
}
