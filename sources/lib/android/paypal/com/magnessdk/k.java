package lib.android.paypal.com.magnessdk;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lib.android.paypal.com.magnessdk.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class k extends g {
    private static k I1 = null;
    private static final int J1 = -1000000;
    private static final String K1 = "";
    private Handler A1;
    /* access modifiers changed from: private */
    public List<String> B1 = new ArrayList();
    /* access modifiers changed from: private */
    public long C1 = 0;
    /* access modifiers changed from: private */
    public boolean D1 = false;
    /* access modifiers changed from: private */
    public boolean E1 = false;
    /* access modifiers changed from: private */
    public boolean F1 = false;
    /* access modifiers changed from: private */
    public d G1 = d.a();
    private HashMap<String, EditText> H1 = new HashMap<>();
    private Context x1 = null;
    private d y1;
    private MagnesSettings z1;

    class a implements TextWatcher {
        String a = "";
        final /* synthetic */ String b;

        a(String str) {
            this.b = str;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (k.this.b(this.b) && charSequence != null) {
                this.a = charSequence.toString();
                if (i2 - i3 > 1) {
                    k.this.B1.add(c.m.CUT_EVENT.toString());
                    long unused = k.this.C1 = System.currentTimeMillis();
                    k.this.G1.b = true;
                    boolean unused2 = k.this.E1 = true;
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (k.this.b(this.b) && charSequence != null) {
                String a2 = k.this.b(this.a, charSequence.toString());
                if (charSequence.length() != 0) {
                    if (a2.length() > 1) {
                        if (k.this.F1) {
                            k.this.B1.add(c.m.AUTO_COMPLETE_EVENT.toString());
                            long unused = k.this.C1 = System.currentTimeMillis();
                            k.this.G1.c = true;
                        } else if (charSequence != "") {
                            k.this.B1.add(c.m.PRE_FILLED_EVENT.toString());
                            k.this.G1.d = true;
                        }
                    } else if (!k.this.E1) {
                        if (i2 > i3) {
                            k.this.G1.e = true;
                            boolean unused2 = k.this.D1 = true;
                        }
                        k.this.c();
                    }
                } else if (k.this.E1) {
                    boolean unused3 = k.this.E1 = false;
                } else {
                    long unused4 = k.this.C1 = System.currentTimeMillis();
                }
            }
        }
    }

    class b implements View.OnFocusChangeListener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public void onFocusChange(View view, boolean z) {
            if (k.this.b(this.a)) {
                k.this.a(this.a, this.b, z);
            }
        }
    }

    class c {
        String a;
        String[] b;
        JSONObject c;
        String d;

        private c() {
        }

        c(String str, List<String> list, JSONObject jSONObject, String str2) {
            String[] a2 = a(list);
            this.a = str;
            this.b = a2;
            this.c = jSONObject;
            this.d = str2;
        }

        private String[] a(List<String> list) {
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i);
            }
            return strArr;
        }

        /* access modifiers changed from: package-private */
        public JSONArray a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(c.m.FLIGHT_TIME.toString(), new JSONArray(this.b));
            jSONObject.put(c.m.TELEMETRY_EVENTS.toString(), this.c);
            jSONObject.put(c.m.VIEW_ID.toString(), this.a);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            return jSONArray;
        }
    }

    static class d {
        private static d f;
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean e = false;

        private d() {
        }

        static synchronized d a() {
            d dVar;
            synchronized (d.class) {
                if (f == null) {
                    f = new d();
                }
                dVar = f;
            }
            return dVar;
        }
    }

    k() {
    }

    private int a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return J1;
        }
        int i = 0;
        if (!(charSequence == null || charSequence2 == null)) {
            while (i < charSequence.length() && i < charSequence2.length() && charSequence.charAt(i) == charSequence2.charAt(i)) {
                i++;
            }
            return (i < charSequence2.length() || i < charSequence.length()) ? i : J1;
        }
    }

    private void a(String str, EditText editText) {
        if (this.H1.get(str) == null) {
            this.H1.put(str, editText);
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, String str2, boolean z) {
        if (!z) {
            this.F1 = false;
            c(str, str2);
            return;
        }
        this.F1 = true;
    }

    private void a(c cVar) {
        try {
            JSONArray a2 = cVar.a();
            boolean a3 = g.a(g.s1);
            JSONObject a4 = a3 ? g.a(cVar.d, a2, g.s1) : g.b(cVar.d, a2, g.s1);
            if (a4 != null) {
                new lib.android.paypal.com.magnessdk.network.b(c.h.d.PRODUCTION_JSON_URL, a4, a3, this.z1, this.A1).c();
            }
        } catch (Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, (Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public String b(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int a2 = a((CharSequence) str, (CharSequence) str2);
        return a2 == J1 ? "" : str2.substring(a2);
    }

    static synchronized k b() {
        k kVar;
        synchronized (k.class) {
            if (I1 == null) {
                I1 = new k();
            }
            kVar = I1;
        }
        return kVar;
    }

    /* access modifiers changed from: private */
    public boolean b(String str) {
        return this.H1.get(str) != null;
    }

    /* access modifiers changed from: private */
    public void c() {
        this.G1.a = true;
        if (this.C1 == 0) {
            this.C1 = System.currentTimeMillis();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.C1;
        this.C1 = currentTimeMillis;
        if (this.D1) {
            j *= -1;
            this.D1 = false;
        }
        if (j != 0) {
            this.B1.add(String.valueOf(j));
        }
    }

    private void c(String str) {
        if (this.H1.get(str) != null) {
            this.H1.remove(str);
        }
    }

    private void c(String str, String str2) {
        d dVar = this.G1;
        boolean z = dVar.a || dVar.c || dVar.b || dVar.e;
        if (!this.B1.isEmpty() || z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(c.m.REGULAR_TYPING_EVENT.toString(), this.G1.a);
                jSONObject.put(c.m.AUTO_COMPLETE_EVENT.toString(), this.G1.c);
                jSONObject.put(c.m.CUT_EVENT.toString(), this.G1.b);
                jSONObject.put(c.m.BACKSPACE_EVENT.toString(), this.G1.e);
            } catch (Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, (Throwable) e);
            }
            a(new c(str, this.B1, jSONObject, str2));
        }
        c(str);
        d();
    }

    private void d() {
        d dVar = this.G1;
        dVar.a = false;
        dVar.c = false;
        dVar.b = false;
        dVar.e = false;
        this.B1.clear();
        this.C1 = 0;
    }

    /* access modifiers changed from: package-private */
    public JSONObject a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(MagnesSettings magnesSettings, d dVar, e eVar) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(int i, MagnesSettings magnesSettings) {
    }

    /* access modifiers changed from: package-private */
    public void a(EditText editText, String str, String str2, Context context, boolean z) {
        this.x1 = context;
        if (a(this.y1, this.z1.getMagnesSource(), g.k1, g.s1, this.z1.getContext())) {
            a(str, editText);
            editText.addTextChangedListener(new a(str));
            if (!z) {
                editText.setOnFocusChangeListener(new b(str, str2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(d dVar, MagnesSettings magnesSettings, Handler handler) {
        this.y1 = dVar;
        this.z1 = magnesSettings;
        this.A1 = handler;
    }

    /* access modifiers changed from: package-private */
    public void b(String str, String str2, boolean z) {
        if (b(str)) {
            a(str, str2, z);
        }
    }
}
