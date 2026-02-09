package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.asm.BeansAccess;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONUtil;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public final class getTextBoxCustomization {

    public static class Cardinal<T> extends setVerticalScrollbarThumbDrawable<T> {
        private ParameterizedType Cardinal;
        private Class<?> cca_continue;
        private setVerticalScrollbarThumbDrawable<?> cleanup;
        private Class<?> configure;
        private BeansAccess<?> getInstance;
        private Class<?> getWarnings;
        private Type init;
        private Class<?> onCReqSuccess;
        private Type onValidated;

        public Cardinal(setFadingEdgeLength setfadingedgelength, ParameterizedType parameterizedType) {
            super(setfadingedgelength);
            this.Cardinal = parameterizedType;
            Class<?> cls = (Class) parameterizedType.getRawType();
            this.cca_continue = cls;
            if (cls.isInterface()) {
                this.configure = JSONObject.class;
            } else {
                this.configure = this.cca_continue;
            }
            this.getInstance = BeansAccess.get(this.configure, JSONUtil.JSON_SMART_FIELD_FILTER);
            this.init = parameterizedType.getActualTypeArguments()[0];
            this.onValidated = parameterizedType.getActualTypeArguments()[1];
            Type type = this.init;
            if (type instanceof Class) {
                this.getWarnings = (Class) type;
            } else {
                this.getWarnings = (Class) ((ParameterizedType) type).getRawType();
            }
            Type type2 = this.onValidated;
            if (type2 instanceof Class) {
                this.onCReqSuccess = (Class) type2;
            } else {
                this.onCReqSuccess = (Class) ((ParameterizedType) type2).getRawType();
            }
        }

        public final Object getInstance() {
            try {
                return this.configure.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public final setVerticalScrollbarThumbDrawable<?> configure(String str) {
            setVerticalScrollbarThumbDrawable<?> setverticalscrollbarthumbdrawable;
            if (this.cleanup == null) {
                setFadingEdgeLength setfadingedgelength = this.valueOf;
                Type type = this.onValidated;
                if (type instanceof ParameterizedType) {
                    setverticalscrollbarthumbdrawable = setfadingedgelength.getInstance((ParameterizedType) type);
                } else {
                    setverticalscrollbarthumbdrawable = setfadingedgelength.configure((Class) type);
                }
                this.cleanup = setverticalscrollbarthumbdrawable;
            }
            return this.cleanup;
        }

        public final setVerticalScrollbarThumbDrawable<?> init(String str) {
            setVerticalScrollbarThumbDrawable<?> setverticalscrollbarthumbdrawable;
            if (this.cleanup == null) {
                setFadingEdgeLength setfadingedgelength = this.valueOf;
                Type type = this.onValidated;
                if (type instanceof ParameterizedType) {
                    setverticalscrollbarthumbdrawable = setfadingedgelength.getInstance((ParameterizedType) type);
                } else {
                    setverticalscrollbarthumbdrawable = setfadingedgelength.configure((Class) type);
                }
                this.cleanup = setverticalscrollbarthumbdrawable;
            }
            return this.cleanup;
        }

        public final void getInstance(Object obj, String str, Object obj2) {
            ((Map) obj).put(JSONUtil.convertToX(str, this.getWarnings), JSONUtil.convertToX(obj2, this.onCReqSuccess));
        }

        public final Object getInstance(Object obj, String str) {
            return ((Map) obj).get(JSONUtil.convertToX(str, this.getWarnings));
        }

        public final Type cca_continue(String str) {
            return this.Cardinal;
        }
    }

    public static class init<T> extends setVerticalScrollbarThumbDrawable<T> {
        private Class<?> Cardinal;
        private Class<?> cca_continue;
        private BeansAccess<?> init;

        public init(setFadingEdgeLength setfadingedgelength, Class<?> cls) {
            super(setfadingedgelength);
            this.Cardinal = cls;
            if (cls.isInterface()) {
                this.cca_continue = JSONObject.class;
            } else {
                this.cca_continue = cls;
            }
            this.init = BeansAccess.get(this.cca_continue, JSONUtil.JSON_SMART_FIELD_FILTER);
        }

        public final Object getInstance() {
            return this.init.newInstance();
        }

        public final setVerticalScrollbarThumbDrawable<?> configure(String str) {
            return this.valueOf.Cardinal;
        }

        public final setVerticalScrollbarThumbDrawable<?> init(String str) {
            return this.valueOf.Cardinal;
        }

        public final void getInstance(Object obj, String str, Object obj2) {
            ((Map) obj).put(str, obj2);
        }

        public final Object getInstance(Object obj, String str) {
            return ((Map) obj).get(str);
        }

        public final Type cca_continue(String str) {
            return this.Cardinal;
        }
    }

    public static class cca_continue<T> extends setVerticalScrollbarThumbDrawable<T> {
        private Type Cardinal;
        private Class<?> cca_continue;
        private Class<?> configure;
        private ParameterizedType getInstance;
        private Class<?> getSDKVersion;
        private BeansAccess<?> init;
        private setVerticalScrollbarThumbDrawable<?> onCReqSuccess;

        public cca_continue(setFadingEdgeLength setfadingedgelength, ParameterizedType parameterizedType) {
            super(setfadingedgelength);
            this.getInstance = parameterizedType;
            Class<?> cls = (Class) parameterizedType.getRawType();
            this.configure = cls;
            if (cls.isInterface()) {
                this.cca_continue = JSONArray.class;
            } else {
                this.cca_continue = this.configure;
            }
            this.init = BeansAccess.get(this.cca_continue, JSONUtil.JSON_SMART_FIELD_FILTER);
            Type type = parameterizedType.getActualTypeArguments()[0];
            this.Cardinal = type;
            if (type instanceof Class) {
                this.getSDKVersion = (Class) type;
            } else {
                this.getSDKVersion = (Class) ((ParameterizedType) type).getRawType();
            }
        }

        public final Object cca_continue() {
            return this.init.newInstance();
        }

        public final setVerticalScrollbarThumbDrawable<?> configure(String str) {
            setVerticalScrollbarThumbDrawable<?> setverticalscrollbarthumbdrawable;
            if (this.onCReqSuccess == null) {
                setFadingEdgeLength setfadingedgelength = this.valueOf;
                Type type = this.getInstance.getActualTypeArguments()[0];
                if (type instanceof ParameterizedType) {
                    setverticalscrollbarthumbdrawable = setfadingedgelength.getInstance((ParameterizedType) type);
                } else {
                    setverticalscrollbarthumbdrawable = setfadingedgelength.configure((Class) type);
                }
                this.onCReqSuccess = setverticalscrollbarthumbdrawable;
            }
            return this.onCReqSuccess;
        }

        public final setVerticalScrollbarThumbDrawable<?> init(String str) {
            setVerticalScrollbarThumbDrawable<?> setverticalscrollbarthumbdrawable;
            if (this.onCReqSuccess == null) {
                setFadingEdgeLength setfadingedgelength = this.valueOf;
                Type type = this.getInstance.getActualTypeArguments()[0];
                if (type instanceof ParameterizedType) {
                    setverticalscrollbarthumbdrawable = setfadingedgelength.getInstance((ParameterizedType) type);
                } else {
                    setverticalscrollbarthumbdrawable = setfadingedgelength.configure((Class) type);
                }
                this.onCReqSuccess = setverticalscrollbarthumbdrawable;
            }
            return this.onCReqSuccess;
        }

        public final void Cardinal(Object obj, Object obj2) {
            ((List) obj).add(JSONUtil.convertToX(obj2, this.getSDKVersion));
        }
    }

    public static class configure<T> extends setVerticalScrollbarThumbDrawable<T> {
        private Class<?> Cardinal;
        private BeansAccess<?> cca_continue;
        private Class<?> getInstance;

        public configure(setFadingEdgeLength setfadingedgelength, Class<?> cls) {
            super(setfadingedgelength);
            this.getInstance = cls;
            if (cls.isInterface()) {
                this.Cardinal = JSONArray.class;
            } else {
                this.Cardinal = cls;
            }
            this.cca_continue = BeansAccess.get(this.Cardinal, JSONUtil.JSON_SMART_FIELD_FILTER);
        }

        public final Object cca_continue() {
            return this.cca_continue.newInstance();
        }

        public final setVerticalScrollbarThumbDrawable<?> configure(String str) {
            return this.valueOf.Cardinal;
        }

        public final setVerticalScrollbarThumbDrawable<?> init(String str) {
            return this.valueOf.Cardinal;
        }

        public final void Cardinal(Object obj, Object obj2) {
            ((List) obj).add(obj2);
        }
    }
}
