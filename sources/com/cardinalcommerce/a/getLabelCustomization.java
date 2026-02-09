package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.asm.Accessor;
import com.cardinalcommerce.dependencies.internal.minidev.asm.BeansAccess;
import com.cardinalcommerce.dependencies.internal.minidev.asm.ConvertDate;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONUtil;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;

public abstract class getLabelCustomization<T> extends setVerticalScrollbarThumbDrawable<T> {
    public static setVerticalScrollbarThumbDrawable<Date> init = new setTextBoxCustomization<Date>((setFadingEdgeLength) null) {
        public final /* synthetic */ Object init(Object obj) {
            return ConvertDate.convertToDate(obj);
        }
    };

    public static class getInstance<T> extends setVerticalScrollbarThumbDrawable<T> {
        private Class<T> Cardinal;
        private BeansAccess<T> getInstance;
        private HashMap<String, Accessor> init;

        public getInstance(setFadingEdgeLength setfadingedgelength, Class<T> cls) {
            super(setfadingedgelength);
            this.Cardinal = cls;
            BeansAccess<T> beansAccess = BeansAccess.get(cls, JSONUtil.JSON_SMART_FIELD_FILTER);
            this.getInstance = beansAccess;
            this.init = beansAccess.getMap();
        }

        public final void getInstance(Object obj, String str, Object obj2) {
            this.getInstance.set(obj, str, obj2);
        }

        public final Object getInstance(Object obj, String str) {
            return this.getInstance.get(obj, str);
        }

        public final Type cca_continue(String str) {
            return this.init.get(str).getGenericType();
        }

        public final setVerticalScrollbarThumbDrawable<?> configure(String str) {
            Accessor accessor = this.init.get(str);
            if (accessor != null) {
                setFadingEdgeLength setfadingedgelength = this.valueOf;
                Type genericType = accessor.getGenericType();
                if (genericType instanceof ParameterizedType) {
                    return setfadingedgelength.getInstance((ParameterizedType) genericType);
                }
                return setfadingedgelength.configure((Class) genericType);
            }
            throw new RuntimeException(new StringBuilder("Can not find Array '").append(str).append("' field in ").append(this.Cardinal).toString());
        }

        public final setVerticalScrollbarThumbDrawable<?> init(String str) {
            Accessor accessor = this.init.get(str);
            if (accessor != null) {
                setFadingEdgeLength setfadingedgelength = this.valueOf;
                Type genericType = accessor.getGenericType();
                if (genericType instanceof ParameterizedType) {
                    return setfadingedgelength.getInstance((ParameterizedType) genericType);
                }
                return setfadingedgelength.configure((Class) genericType);
            }
            throw new RuntimeException(new StringBuilder("Can not find Object '").append(str).append("' field in ").append(this.Cardinal).toString());
        }

        public final Object getInstance() {
            return this.getInstance.newInstance();
        }
    }
}
