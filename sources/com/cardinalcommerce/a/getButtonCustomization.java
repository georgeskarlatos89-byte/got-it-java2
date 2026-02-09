package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.asm.Accessor;
import com.cardinalcommerce.dependencies.internal.minidev.asm.BeansAccess;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONStyle;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class getButtonCustomization implements setToolbarCustomization<Object> {
    public Map<String, String> cca_continue = new HashMap();

    public final <E> void getInstance(E e, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        try {
            BeansAccess beansAccess = BeansAccess.get(e.getClass(), JSONUtil.JSON_SMART_FIELD_FILTER);
            appendable.append('{');
            boolean z = false;
            for (Accessor accessor : beansAccess.getAccessors()) {
                Object obj = beansAccess.get(e, accessor.getIndex());
                if (obj != null || !jSONStyle.ignoreNull()) {
                    if (z) {
                        appendable.append(',');
                    } else {
                        z = true;
                    }
                    String name = accessor.getName();
                    String str = this.cca_continue.get(name);
                    if (str != null) {
                        name = str;
                    }
                    JSONObject.writeJSONKV(name, obj, appendable, jSONStyle);
                }
            }
            appendable.append('}');
        } catch (IOException e2) {
            throw e2;
        }
    }
}
