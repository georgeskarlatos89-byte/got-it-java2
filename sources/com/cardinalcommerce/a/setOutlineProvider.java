package com.cardinalcommerce.a;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class setOutlineProvider extends JSONArray {
    private static int configure = 0;
    private static int init = 1;
    private final String cca_continue = "setOutlineProvider";

    setOutlineProvider(String str) throws JSONException {
        super(str);
    }

    setOutlineProvider() {
    }

    public final JSONObject getInstance(HashMap<String, String> hashMap, String str) {
        int i = init;
        int i2 = (i + 84) - 1;
        configure = i2 % 128;
        int i3 = i2 % 2;
        int i4 = i & 111;
        int i5 = -(-(i | 111));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        configure = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (true) {
            if (!(i8 < length() ? true : true)) {
                int i9 = init;
                int i10 = (i9 | 87) << 1;
                int i11 = -(((~i9) & 87) | (i9 & -88));
                int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
                configure = i12 % 128;
                int i13 = i12 % 2;
                JSONObject jSONObject = getJSONObject(i8);
                Iterator<String> it = hashMap.keySet().iterator();
                int i14 = configure;
                int i15 = i14 & 85;
                int i16 = (i14 ^ 85) | i15;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                init = i17 % 128;
                int i18 = i17 % 2;
                boolean z = false;
                while (true) {
                    try {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i19 = init + 93;
                        configure = i19 % 128;
                        int i20 = i19 % 2;
                        String next = it.next();
                        if (jSONObject.has(next)) {
                            int i21 = configure;
                            int i22 = ((i21 | 95) << 1) - (i21 ^ 95);
                            init = i22 % 128;
                            if ((i22 % 2 == 0 ? 'W' : '3') != 'W') {
                                if (!(!jSONObject.getString(next).equals(hashMap.get(next)))) {
                                    continue;
                                    int i23 = ((init + 100) - 0) - 1;
                                    configure = i23 % 128;
                                    int i24 = i23 % 2;
                                    z = true;
                                }
                            } else {
                                int i25 = 63 / 0;
                                if (jSONObject.getString(next).equals(hashMap.get(next))) {
                                    continue;
                                    int i232 = ((init + 100) - 0) - 1;
                                    configure = i232 % 128;
                                    int i242 = i232 % 2;
                                    z = true;
                                }
                            }
                        }
                        if ((!jSONObject.has(next) ? 10 : '/') == '/') {
                            break;
                        }
                        int i26 = configure;
                        int i27 = i26 & 35;
                        int i28 = i27 + ((i26 ^ 35) | i27);
                        init = i28 % 128;
                        int i29 = i28 % 2;
                        if (!(next.equals(str))) {
                            break;
                        }
                        int i2322 = ((init + 100) - 0) - 1;
                        configure = i2322 % 128;
                        int i2422 = i2322 % 2;
                        z = true;
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                int i30 = (configure + 124) - 1;
                init = i30 % 128;
                int i31 = i30 % 2;
                z = false;
                if (!(!z)) {
                    int i32 = configure;
                    int i33 = (i32 | 103) << 1;
                    int i34 = -(((~i32) & 103) | (i32 & -104));
                    int i35 = (i33 & i34) + (i34 | i33);
                    init = i35 % 128;
                    if (i35 % 2 == 0) {
                        int i36 = 1 / 0;
                    }
                    return jSONObject;
                }
                int i37 = i8 & 1;
                int i38 = (i8 ^ 1) | i37;
                i8 = ((i38 & i37) << 1) + (i37 ^ i38);
                int i39 = init;
                int i40 = i39 & 59;
                int i41 = (i39 | 59) & (~i40);
                int i42 = i40 << 1;
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                configure = i43 % 128;
                int i44 = i43 % 2;
            } else {
                int i45 = init;
                int i46 = (((i45 & -32) | ((~i45) & 31)) - (~(-(-((i45 & 31) << 1))))) - 1;
                int i47 = i46 % 128;
                configure = i47;
                int i48 = i46 % 2;
                int i49 = i47 + 95;
                init = i49 % 128;
                if ((i49 % 2 == 0 ? 12 : '2') != 12) {
                    return null;
                }
                throw null;
            }
        }
    }

    public final void configure(JSONObject jSONObject, JSONObject jSONObject2) {
        int i = configure;
        int i2 = ((i ^ 75) - (~(-(-((i & 75) << 1))))) - 1;
        int i3 = i2 % 128;
        init = i3;
        int i4 = i2 % 2;
        int i5 = i3 & 23;
        int i6 = (i3 | 23) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        configure = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 0;
        while (true) {
            try {
                if (i10 < length()) {
                    int i11 = init;
                    int i12 = ((i11 ^ 51) | (i11 & 51)) << 1;
                    int i13 = -(((~i11) & 51) | (i11 & -52));
                    int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                    configure = i14 % 128;
                    if (i14 % 2 == 0) {
                        if ((getJSONObject(i10) == jSONObject ? '1' : 'L') == 'L') {
                            continue;
                            i10 = ((i10 & 1) << 1) + (i10 ^ 1);
                            int i15 = (init + 114) - 1;
                            configure = i15 % 128;
                            int i16 = i15 % 2;
                        }
                    } else {
                        int i17 = 97 / 0;
                        if (!(getJSONObject(i10) == jSONObject)) {
                            continue;
                            i10 = ((i10 & 1) << 1) + (i10 ^ 1);
                            int i152 = (init + 114) - 1;
                            configure = i152 % 128;
                            int i162 = i152 % 2;
                        }
                    }
                    int i18 = init;
                    int i19 = (i18 + 76) - 1;
                    configure = i19 % 128;
                    int i20 = i19 % 2;
                    if ((jSONObject2 != null ? 12 : '+') != '+') {
                        int i21 = (((i18 ^ 52) + ((i18 & 52) << 1)) - 0) - 1;
                        configure = i21 % 128;
                        int i22 = i21 % 2;
                        remove(i10);
                        put(jSONObject2);
                        int i23 = (init + 38) - 1;
                        configure = i23 % 128;
                        int i24 = i23 % 2;
                        return;
                    }
                    i10 = ((i10 & 1) << 1) + (i10 ^ 1);
                    int i1522 = (init + 114) - 1;
                    configure = i1522 % 128;
                    int i1622 = i1522 % 2;
                } else {
                    int i25 = configure + 34;
                    int i26 = (i25 & -1) + (i25 | -1);
                    init = i26 % 128;
                    int i27 = i26 % 2;
                    return;
                }
            } catch (JSONException e) {
                Log.e(this.cca_continue, new StringBuilder("Exception during replacing logs JSON. Error: ").append(e.getLocalizedMessage()).toString());
                return;
            }
        }
    }
}
