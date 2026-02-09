package com.reactnativenavigation.options.parsers;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONParser {
    public JSONObject parse(ReadableMap readableMap) {
        try {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            JSONObject jSONObject = new JSONObject();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                int i = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()];
                if (i == 1) {
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                } else if (i == 2) {
                    jSONObject.put(nextKey, parseNumber(readableMap, nextKey));
                } else if (i == 3) {
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                } else if (i == 4) {
                    jSONObject.put(nextKey, parse(readableMap.getArray(nextKey)));
                } else if (i == 5) {
                    jSONObject.put(nextKey, parse(readableMap.getMap(nextKey)));
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: com.reactnativenavigation.options.parsers.JSONParser$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$facebook$react$bridge$ReadableType = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.options.parsers.JSONParser.AnonymousClass1.<clinit>():void");
        }
    }

    public JSONArray parse(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()];
            if (i2 == 1) {
                jSONArray.put(readableArray.getString(i));
            } else if (i2 == 2) {
                jSONArray.put(parseNumber(readableArray, i));
            } else if (i2 == 3) {
                jSONArray.put(readableArray.getBoolean(i));
            } else if (i2 == 4) {
                jSONArray.put(parse(readableArray.getArray(i)));
            } else if (i2 == 5) {
                jSONArray.put(parse(readableArray.getMap(i)));
            }
        }
        return jSONArray;
    }

    private static Object parseNumber(ReadableMap readableMap, String str) {
        try {
            Double valueOf = Double.valueOf(readableMap.getDouble(str));
            return valueOf.doubleValue() % 1.0d == 0.0d ? Integer.valueOf(readableMap.getInt(str)) : valueOf;
        } catch (Exception unused) {
            return Integer.valueOf(readableMap.getInt(str));
        }
    }

    private static Object parseNumber(ReadableArray readableArray, int i) {
        try {
            Double valueOf = Double.valueOf(readableArray.getDouble(i));
            return valueOf.doubleValue() % 1.0d == 0.0d ? Integer.valueOf(readableArray.getInt(i)) : valueOf;
        } catch (Exception unused) {
            return Integer.valueOf(readableArray.getInt(i));
        }
    }

    public static WritableMap convert(JSONObject jSONObject) {
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                createMap.putMap(next, convert((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                createMap.putArray(next, convert((JSONArray) opt));
            } else if (opt instanceof Boolean) {
                createMap.putBoolean(next, ((Boolean) opt).booleanValue());
            } else if (opt instanceof Integer) {
                createMap.putInt(next, ((Integer) opt).intValue());
            } else if (opt instanceof Double) {
                createMap.putDouble(next, ((Double) opt).doubleValue());
            } else if (opt instanceof String) {
                createMap.putString(next, (String) opt);
            } else {
                createMap.putString(next, opt.toString());
            }
        }
        return createMap;
    }

    public static WritableArray convert(JSONArray jSONArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONObject) {
                createArray.pushMap(convert((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                createArray.pushArray(convert((JSONArray) opt));
            } else if (opt instanceof Boolean) {
                createArray.pushBoolean(((Boolean) opt).booleanValue());
            } else if (opt instanceof Integer) {
                createArray.pushInt(((Integer) opt).intValue());
            } else if (opt instanceof Double) {
                createArray.pushDouble(((Double) opt).doubleValue());
            } else if (opt instanceof String) {
                createArray.pushString((String) opt);
            } else {
                createArray.pushString(opt.toString());
            }
        }
        return createArray;
    }
}
