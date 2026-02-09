package com.cardinalcommerce.a;

import com.cardinalcommerce.a.getLabelCustomization;
import com.cardinalcommerce.a.getTextBoxCustomization;
import com.cardinalcommerce.a.setTextBoxCustomization;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAware;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAwareEx;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class setFadingEdgeLength {
    public setVerticalScrollbarThumbDrawable<JSONAwareEx> Cardinal = new openContextMenu(this);
    public final ConcurrentHashMap<Type, setVerticalScrollbarThumbDrawable<?>> configure;
    public setVerticalScrollbarThumbDrawable<JSONAwareEx> getInstance = new onOptionsItemSelected(this);

    public setFadingEdgeLength() {
        ConcurrentHashMap<Type, setVerticalScrollbarThumbDrawable<?>> concurrentHashMap = new ConcurrentHashMap<>(100);
        this.configure = concurrentHashMap;
        concurrentHashMap.put(Date.class, getLabelCustomization.init);
        concurrentHashMap.put(int[].class, setTextBoxCustomization.getInstance);
        concurrentHashMap.put(Integer[].class, setTextBoxCustomization.Cardinal);
        concurrentHashMap.put(short[].class, setTextBoxCustomization.getInstance);
        concurrentHashMap.put(Short[].class, setTextBoxCustomization.Cardinal);
        concurrentHashMap.put(long[].class, setTextBoxCustomization.onValidated);
        concurrentHashMap.put(Long[].class, setTextBoxCustomization.getWarnings);
        concurrentHashMap.put(byte[].class, setTextBoxCustomization.configure);
        concurrentHashMap.put(Byte[].class, setTextBoxCustomization.cca_continue);
        concurrentHashMap.put(char[].class, setTextBoxCustomization.init);
        concurrentHashMap.put(Character[].class, setTextBoxCustomization.getSDKVersion);
        concurrentHashMap.put(float[].class, setTextBoxCustomization.onCReqSuccess);
        concurrentHashMap.put(Float[].class, setTextBoxCustomization.cleanup);
        concurrentHashMap.put(double[].class, setTextBoxCustomization.CardinalError);
        concurrentHashMap.put(Double[].class, setTextBoxCustomization.CardinalRenderType);
        concurrentHashMap.put(boolean[].class, setTextBoxCustomization.CardinalEnvironment);
        concurrentHashMap.put(Boolean[].class, setTextBoxCustomization.values);
        concurrentHashMap.put(JSONAwareEx.class, this.Cardinal);
        concurrentHashMap.put(JSONAware.class, this.Cardinal);
        concurrentHashMap.put(JSONArray.class, this.Cardinal);
        concurrentHashMap.put(JSONObject.class, this.Cardinal);
    }

    public final <T> setVerticalScrollbarThumbDrawable<T> configure(Class<T> cls) {
        setVerticalScrollbarThumbDrawable<T> setverticalscrollbarthumbdrawable;
        setVerticalScrollbarThumbDrawable<T> setverticalscrollbarthumbdrawable2 = this.configure.get(cls);
        if (setverticalscrollbarthumbdrawable2 != null) {
            return setverticalscrollbarthumbdrawable2;
        }
        if (cls instanceof Class) {
            if (Map.class.isAssignableFrom(cls)) {
                setverticalscrollbarthumbdrawable2 = new registerForContextMenu<>(this, cls);
            } else if (List.class.isAssignableFrom(cls)) {
                setverticalscrollbarthumbdrawable2 = new registerForContextMenu<>(this, cls);
            }
            if (setverticalscrollbarthumbdrawable2 != null) {
                this.configure.put(cls, setverticalscrollbarthumbdrawable2);
                return setverticalscrollbarthumbdrawable2;
            }
        }
        if (cls.isArray()) {
            setverticalscrollbarthumbdrawable = new setTextBoxCustomization.cca_continue<>(this, cls);
        } else if (List.class.isAssignableFrom(cls)) {
            setverticalscrollbarthumbdrawable = new getTextBoxCustomization.configure<>(this, cls);
        } else if (Map.class.isAssignableFrom(cls)) {
            setverticalscrollbarthumbdrawable = new getTextBoxCustomization.init<>(this, cls);
        } else {
            setverticalscrollbarthumbdrawable = new getLabelCustomization.getInstance<>(this, cls);
        }
        this.configure.putIfAbsent(cls, setverticalscrollbarthumbdrawable);
        return setverticalscrollbarthumbdrawable;
    }

    public final <T> setVerticalScrollbarThumbDrawable<T> getInstance(ParameterizedType parameterizedType) {
        setVerticalScrollbarThumbDrawable<T> setverticalscrollbarthumbdrawable = this.configure.get(parameterizedType);
        if (setverticalscrollbarthumbdrawable != null) {
            return setverticalscrollbarthumbdrawable;
        }
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            setverticalscrollbarthumbdrawable = new getTextBoxCustomization.cca_continue<>(this, parameterizedType);
        } else if (Map.class.isAssignableFrom(cls)) {
            setverticalscrollbarthumbdrawable = new getTextBoxCustomization.Cardinal<>(this, parameterizedType);
        }
        this.configure.putIfAbsent(parameterizedType, setverticalscrollbarthumbdrawable);
        return setverticalscrollbarthumbdrawable;
    }
}
