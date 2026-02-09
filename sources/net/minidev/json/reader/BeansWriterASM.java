package net.minidev.json.reader;

import java.io.IOException;
import net.minidev.asm.Accessor;
import net.minidev.asm.BeansAccess;
import net.minidev.asm.FieldFilter;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONStyle;
import net.minidev.json.JSONUtil;

public class BeansWriterASM implements JsonWriterI<Object> {
    public <E> void writeJSONString(E e, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        try {
            BeansAccess<P> beansAccess = BeansAccess.get(e.getClass(), (FieldFilter) JSONUtil.JSON_SMART_FIELD_FILTER);
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
                    JSONObject.writeJSONKV(accessor.getName(), obj, appendable, jSONStyle);
                }
            }
            appendable.append('}');
        } catch (IOException e2) {
            throw e2;
        }
    }
}
