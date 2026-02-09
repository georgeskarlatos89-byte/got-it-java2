package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAware;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAwareEx;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONStreamAware;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONStreamAwareEx;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONStyle;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONValue;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;

public class setLabelCustomization {
    public static final setToolbarCustomization<Iterable<? extends Object>> Cardinal = new setToolbarCustomization<Iterable<? extends Object>>() {
        public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.arrayStart(appendable);
            boolean z = true;
            for (Object next : (Iterable) obj) {
                if (z) {
                    jSONStyle.arrayfirstObject(appendable);
                    z = false;
                } else {
                    jSONStyle.arrayNextElm(appendable);
                }
                if (next == null) {
                    appendable.append(ThreeDSStrings.NULL_STRING);
                } else {
                    JSONValue.writeJSONString(next, appendable, jSONStyle);
                }
                jSONStyle.arrayObjectEnd(appendable);
            }
            jSONStyle.arrayStop(appendable);
        }
    };
    private static setToolbarCustomization<Object> CardinalEnvironment = new setToolbarCustomization<Object>() {
        public final void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append(obj.toString());
        }
    };
    private static setToolbarCustomization<JSONStreamAwareEx> cleanup = new setToolbarCustomization<JSONStreamAwareEx>() {
        public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            ((JSONStreamAwareEx) obj).writeJSONString(appendable);
        }
    };
    public static final setToolbarCustomization<Map<String, ? extends Object>> getInstance = new setToolbarCustomization<Map<String, ? extends Object>>() {
        public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.objectStart(appendable);
            boolean z = true;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (value != null || !jSONStyle.ignoreNull()) {
                    if (z) {
                        jSONStyle.objectFirstStart(appendable);
                        z = false;
                    } else {
                        jSONStyle.objectNext(appendable);
                    }
                    setLabelCustomization.Cardinal(entry.getKey().toString(), value, appendable, jSONStyle);
                }
            }
            jSONStyle.objectStop(appendable);
        }
    };
    private static setToolbarCustomization<JSONStreamAwareEx> getSDKVersion = new setToolbarCustomization<JSONStreamAwareEx>() {
        public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            ((JSONStreamAwareEx) obj).writeJSONString(appendable, jSONStyle);
        }
    };
    private static setToolbarCustomization<JSONAwareEx> getWarnings = new setToolbarCustomization<JSONAwareEx>() {
        public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append(((JSONAwareEx) obj).toJSONString(jSONStyle));
        }
    };
    public static final setToolbarCustomization<Object> init = new setButtonText();
    public static final setToolbarCustomization<Object> onCReqSuccess = new setButtonCustomization();
    private static setToolbarCustomization<JSONAware> onValidated = new setToolbarCustomization<JSONAware>() {
        public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            appendable.append(((JSONAware) obj).toJSONString());
        }
    };
    private static setToolbarCustomization<Enum<?>> valueOf = new setToolbarCustomization<Enum<?>>() {
        public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
            jSONStyle.writeString(appendable, ((Enum) obj).name());
        }
    };
    public LinkedList<getInstance> cca_continue = new LinkedList<>();
    public ConcurrentHashMap<Class<?>, setToolbarCustomization<?>> configure = new ConcurrentHashMap<>();

    public setLabelCustomization() {
        cca_continue(new setToolbarCustomization<String>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                jSONStyle.writeString(appendable, (String) obj);
            }
        }, String.class);
        cca_continue(new setToolbarCustomization<Double>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                Double d = (Double) obj;
                if (d.isInfinite()) {
                    appendable.append(ThreeDSStrings.NULL_STRING);
                } else {
                    appendable.append(d.toString());
                }
            }
        }, Double.class);
        cca_continue(new setToolbarCustomization<Date>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                appendable.append(Typography.quote);
                JSONValue.escape(((Date) obj).toString(), appendable, jSONStyle);
                appendable.append(Typography.quote);
            }
        }, Date.class);
        cca_continue(new setToolbarCustomization<Float>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                Float f = (Float) obj;
                if (f.isInfinite()) {
                    appendable.append(ThreeDSStrings.NULL_STRING);
                } else {
                    appendable.append(f.toString());
                }
            }
        }, Float.class);
        cca_continue(CardinalEnvironment, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        cca_continue(CardinalEnvironment, Boolean.class);
        cca_continue(new setToolbarCustomization<int[]>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                jSONStyle.arrayStart(appendable);
                boolean z = false;
                for (int i : (int[]) obj) {
                    if (z) {
                        jSONStyle.objectNext(appendable);
                    } else {
                        z = true;
                    }
                    appendable.append(Integer.toString(i));
                }
                jSONStyle.arrayStop(appendable);
            }
        }, int[].class);
        cca_continue(new setToolbarCustomization<short[]>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                jSONStyle.arrayStart(appendable);
                boolean z = false;
                for (short s : (short[]) obj) {
                    if (z) {
                        jSONStyle.objectNext(appendable);
                    } else {
                        z = true;
                    }
                    appendable.append(Short.toString(s));
                }
                jSONStyle.arrayStop(appendable);
            }
        }, short[].class);
        cca_continue(new setToolbarCustomization<long[]>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                jSONStyle.arrayStart(appendable);
                boolean z = false;
                for (long j : (long[]) obj) {
                    if (z) {
                        jSONStyle.objectNext(appendable);
                    } else {
                        z = true;
                    }
                    appendable.append(Long.toString(j));
                }
                jSONStyle.arrayStop(appendable);
            }
        }, long[].class);
        cca_continue(new setToolbarCustomization<float[]>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                jSONStyle.arrayStart(appendable);
                boolean z = false;
                for (float f : (float[]) obj) {
                    if (z) {
                        jSONStyle.objectNext(appendable);
                    } else {
                        z = true;
                    }
                    appendable.append(Float.toString(f));
                }
                jSONStyle.arrayStop(appendable);
            }
        }, float[].class);
        cca_continue(new setToolbarCustomization<double[]>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                jSONStyle.arrayStart(appendable);
                boolean z = false;
                for (double d : (double[]) obj) {
                    if (z) {
                        jSONStyle.objectNext(appendable);
                    } else {
                        z = true;
                    }
                    appendable.append(Double.toString(d));
                }
                jSONStyle.arrayStop(appendable);
            }
        }, double[].class);
        cca_continue(new setToolbarCustomization<boolean[]>() {
            public final /* synthetic */ void getInstance(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
                jSONStyle.arrayStart(appendable);
                boolean z = false;
                for (boolean z2 : (boolean[]) obj) {
                    if (z) {
                        jSONStyle.objectNext(appendable);
                    } else {
                        z = true;
                    }
                    appendable.append(Boolean.toString(z2));
                }
                jSONStyle.arrayStop(appendable);
            }
        }, boolean[].class);
        this.cca_continue.addLast(new getInstance(JSONStreamAwareEx.class, getSDKVersion));
        this.cca_continue.addLast(new getInstance(JSONStreamAware.class, cleanup));
        this.cca_continue.addLast(new getInstance(JSONAwareEx.class, getWarnings));
        this.cca_continue.addLast(new getInstance(JSONAware.class, onValidated));
        this.cca_continue.addLast(new getInstance(Map.class, getInstance));
        this.cca_continue.addLast(new getInstance(Iterable.class, Cardinal));
        this.cca_continue.addLast(new getInstance(Enum.class, valueOf));
        this.cca_continue.addLast(new getInstance(Number.class, CardinalEnvironment));
    }

    public static class getInstance {
        public Class<?> Cardinal;
        public setToolbarCustomization<?> configure;

        public getInstance(Class<?> cls, setToolbarCustomization<?> settoolbarcustomization) {
            this.Cardinal = cls;
            this.configure = settoolbarcustomization;
        }
    }

    static {
        new UiCustomization();
    }

    public final <T> void cca_continue(setToolbarCustomization<T> settoolbarcustomization, Class<?>... clsArr) {
        for (Class<?> put : clsArr) {
            this.configure.put(put, settoolbarcustomization);
        }
    }

    public static void Cardinal(String str, Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (str == null) {
            appendable.append(ThreeDSStrings.NULL_STRING);
        } else if (!jSONStyle.mustProtectKey(str)) {
            appendable.append(str);
        } else {
            appendable.append(Typography.quote);
            JSONValue.escape(str, appendable, jSONStyle);
            appendable.append(Typography.quote);
        }
        jSONStyle.objectEndOfKey(appendable);
        if (obj instanceof String) {
            jSONStyle.writeString(appendable, (String) obj);
        } else {
            JSONValue.writeJSONString(obj, appendable, jSONStyle);
        }
        jSONStyle.objectElmStop(appendable);
    }
}
