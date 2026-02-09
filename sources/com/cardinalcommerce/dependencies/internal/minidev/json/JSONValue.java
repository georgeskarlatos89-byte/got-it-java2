package com.cardinalcommerce.dependencies.internal.minidev.json;

import com.cardinalcommerce.a.TextBoxCustomization;
import com.cardinalcommerce.a.ToolbarCustomization;
import com.cardinalcommerce.a.getButtonCustomization;
import com.cardinalcommerce.a.getButtonText;
import com.cardinalcommerce.a.getToolbarCustomization;
import com.cardinalcommerce.a.onContextItemSelected;
import com.cardinalcommerce.a.setBorderColor;
import com.cardinalcommerce.a.setBorderWidth;
import com.cardinalcommerce.a.setContentView;
import com.cardinalcommerce.a.setFadingEdgeLength;
import com.cardinalcommerce.a.setHorizontalScrollbarThumbDrawable;
import com.cardinalcommerce.a.setLabelCustomization;
import com.cardinalcommerce.a.setToolbarCustomization;
import com.cardinalcommerce.a.setVerticalScrollbarThumbDrawable;
import com.cardinalcommerce.a.unregisterForContextMenu;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Iterator;
import net.minidev.json.parser.JSONParser;

public class JSONValue {
    public static JSONStyle COMPRESSION = JSONStyle.NO_COMPRESS;
    public static final setFadingEdgeLength defaultReader = new setFadingEdgeLength();
    public static final setLabelCustomization defaultWriter = new setLabelCustomization();

    public static Object parse(InputStream inputStream) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            if (setborderwidth.getInstance == null) {
                setborderwidth.getInstance = new setBorderColor(setborderwidth.cca_continue);
            }
            return setborderwidth.getInstance.configure(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parse(byte[] bArr) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            if (setborderwidth.configure == null) {
                setborderwidth.configure = new TextBoxCustomization(setborderwidth.cca_continue);
            }
            return setborderwidth.configure.configure(bArr, defaultReader.Cardinal);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T parse(InputStream inputStream, Class<T> cls) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            setVerticalScrollbarThumbDrawable<T> configure = defaultReader.configure(cls);
            if (setborderwidth.getInstance == null) {
                setborderwidth.getInstance = new setBorderColor(setborderwidth.cca_continue);
            }
            return setborderwidth.getInstance.configure(inputStream, configure);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parse(Reader reader) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            if (setborderwidth.Cardinal == null) {
                setborderwidth.Cardinal = new getButtonText(setborderwidth.cca_continue);
            }
            return setborderwidth.Cardinal.getInstance(reader);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T parse(byte[] bArr, Class<T> cls) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            setVerticalScrollbarThumbDrawable<T> configure = defaultReader.configure(cls);
            if (setborderwidth.configure == null) {
                setborderwidth.configure = new TextBoxCustomization(setborderwidth.cca_continue);
            }
            return setborderwidth.configure.configure(bArr, configure);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T parse(Reader reader, Class<T> cls) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            setVerticalScrollbarThumbDrawable<T> configure = defaultReader.configure(cls);
            if (setborderwidth.Cardinal == null) {
                setborderwidth.Cardinal = new getButtonText(setborderwidth.cca_continue);
            }
            return setborderwidth.Cardinal.getInstance(reader, configure);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T parse(Reader reader, T t) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            onContextItemSelected oncontextitemselected = new onContextItemSelected(defaultReader, t);
            if (setborderwidth.Cardinal == null) {
                setborderwidth.Cardinal = new getButtonText(setborderwidth.cca_continue);
            }
            return setborderwidth.Cardinal.getInstance(reader, oncontextitemselected);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T parse(String str, Class<T> cls) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            setVerticalScrollbarThumbDrawable<T> configure = defaultReader.configure(cls);
            if (setborderwidth.getSDKVersion == null) {
                setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
            }
            return setborderwidth.getSDKVersion.configure(str, configure);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T parse(InputStream inputStream, T t) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            onContextItemSelected oncontextitemselected = new onContextItemSelected(defaultReader, t);
            if (setborderwidth.getInstance == null) {
                setborderwidth.getInstance = new setBorderColor(setborderwidth.cca_continue);
            }
            return setborderwidth.getInstance.configure(inputStream, oncontextitemselected);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T parse(String str, T t) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            onContextItemSelected oncontextitemselected = new onContextItemSelected(defaultReader, t);
            if (setborderwidth.getSDKVersion == null) {
                setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
            }
            return setborderwidth.getSDKVersion.configure(str, oncontextitemselected);
        } catch (Exception unused) {
            return null;
        }
    }

    protected static <T> T getInstance(String str, setVerticalScrollbarThumbDrawable<T> setverticalscrollbarthumbdrawable) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            if (setborderwidth.getSDKVersion == null) {
                setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
            }
            return setborderwidth.getSDKVersion.configure(str, setverticalscrollbarthumbdrawable);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parse(String str) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            if (setborderwidth.getSDKVersion == null) {
                setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
            }
            return setborderwidth.getSDKVersion.configure(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(Reader reader) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = defaultReader.getInstance;
            if (setborderwidth.Cardinal == null) {
                setborderwidth.Cardinal = new getButtonText(setborderwidth.cca_continue);
            }
            return setborderwidth.Cardinal.getInstance(reader, setverticalscrollbarthumbdrawable);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(String str) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = defaultReader.getInstance;
            if (setborderwidth.getSDKVersion == null) {
                setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
            }
            return setborderwidth.getSDKVersion.configure(str, setverticalscrollbarthumbdrawable);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String compress(String str, JSONStyle jSONStyle) {
        try {
            StringBuilder sb = new StringBuilder();
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            setContentView setcontentview = new setContentView(defaultReader, sb, jSONStyle);
            if (setborderwidth.getSDKVersion == null) {
                setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
            }
            setborderwidth.getSDKVersion.configure(str, setcontentview);
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String compress(String str) {
        return compress(str, JSONStyle.MAX_COMPRESS);
    }

    public static String uncompress(String str) {
        return compress(str, JSONStyle.NO_COMPRESS);
    }

    public static Object parseWithException(byte[] bArr) throws IOException, getToolbarCustomization {
        setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = defaultReader.Cardinal;
        if (setborderwidth.configure == null) {
            setborderwidth.configure = new TextBoxCustomization(setborderwidth.cca_continue);
        }
        return setborderwidth.configure.configure(bArr, setverticalscrollbarthumbdrawable);
    }

    public static Object parseWithException(InputStream inputStream) throws IOException, getToolbarCustomization {
        setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = defaultReader.Cardinal;
        if (setborderwidth.getInstance == null) {
            setborderwidth.getInstance = new setBorderColor(setborderwidth.cca_continue);
        }
        return setborderwidth.getInstance.configure(inputStream, setverticalscrollbarthumbdrawable);
    }

    public static Object parseWithException(Reader reader) throws IOException, getToolbarCustomization {
        setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = defaultReader.Cardinal;
        if (setborderwidth.Cardinal == null) {
            setborderwidth.Cardinal = new getButtonText(setborderwidth.cca_continue);
        }
        return setborderwidth.Cardinal.getInstance(reader, setverticalscrollbarthumbdrawable);
    }

    public static Object parseWithException(String str) throws getToolbarCustomization {
        setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = defaultReader.Cardinal;
        if (setborderwidth.getSDKVersion == null) {
            setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
        }
        return setborderwidth.getSDKVersion.configure(str, setverticalscrollbarthumbdrawable);
    }

    public static <T> T parseWithException(String str, Class<T> cls) throws getToolbarCustomization {
        setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
        setVerticalScrollbarThumbDrawable<T> configure = defaultReader.configure(cls);
        if (setborderwidth.getSDKVersion == null) {
            setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
        }
        return setborderwidth.getSDKVersion.configure(str, configure);
    }

    public static Object parseStrict(Reader reader) throws IOException, getToolbarCustomization {
        setBorderWidth setborderwidth = new setBorderWidth(JSONParser.MODE_RFC4627);
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = defaultReader.Cardinal;
        if (setborderwidth.Cardinal == null) {
            setborderwidth.Cardinal = new getButtonText(setborderwidth.cca_continue);
        }
        return setborderwidth.Cardinal.getInstance(reader, setverticalscrollbarthumbdrawable);
    }

    public static Object parseStrict(String str) throws getToolbarCustomization {
        setBorderWidth setborderwidth = new setBorderWidth(JSONParser.MODE_RFC4627);
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = defaultReader.Cardinal;
        if (setborderwidth.getSDKVersion == null) {
            setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
        }
        return setborderwidth.getSDKVersion.configure(str, setverticalscrollbarthumbdrawable);
    }

    public static boolean isValidJsonStrict(Reader reader) throws IOException {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(JSONParser.MODE_RFC4627);
            setVerticalScrollbarThumbDrawable<Object> setverticalscrollbarthumbdrawable = unregisterForContextMenu.cca_continue;
            if (setborderwidth.Cardinal == null) {
                setborderwidth.Cardinal = new getButtonText(setborderwidth.cca_continue);
            }
            setborderwidth.Cardinal.getInstance(reader, setverticalscrollbarthumbdrawable);
            return true;
        } catch (getToolbarCustomization unused) {
            return false;
        }
    }

    public static boolean isValidJsonStrict(String str) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(JSONParser.MODE_RFC4627);
            setVerticalScrollbarThumbDrawable<Object> setverticalscrollbarthumbdrawable = unregisterForContextMenu.cca_continue;
            if (setborderwidth.getSDKVersion == null) {
                setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
            }
            setborderwidth.getSDKVersion.configure(str, setverticalscrollbarthumbdrawable);
            return true;
        } catch (getToolbarCustomization unused) {
            return false;
        }
    }

    public static boolean isValidJson(Reader reader) throws IOException {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            setVerticalScrollbarThumbDrawable<Object> setverticalscrollbarthumbdrawable = unregisterForContextMenu.cca_continue;
            if (setborderwidth.Cardinal == null) {
                setborderwidth.Cardinal = new getButtonText(setborderwidth.cca_continue);
            }
            setborderwidth.Cardinal.getInstance(reader, setverticalscrollbarthumbdrawable);
            return true;
        } catch (getToolbarCustomization unused) {
            return false;
        }
    }

    public static boolean isValidJson(String str) {
        try {
            setBorderWidth setborderwidth = new setBorderWidth(setBorderWidth.init);
            setVerticalScrollbarThumbDrawable<Object> setverticalscrollbarthumbdrawable = unregisterForContextMenu.cca_continue;
            if (setborderwidth.getSDKVersion == null) {
                setborderwidth.getSDKVersion = new ToolbarCustomization(setborderwidth.cca_continue);
            }
            setborderwidth.getSDKVersion.configure(str, setverticalscrollbarthumbdrawable);
            return true;
        } catch (getToolbarCustomization unused) {
            return false;
        }
    }

    public static void writeJSONString(Object obj, Appendable appendable) throws IOException {
        writeJSONString(obj, appendable, COMPRESSION);
    }

    public static <T> void remapField(Class<T> cls, String str, String str2) {
        setFadingEdgeLength setfadingedgelength = defaultReader;
        setVerticalScrollbarThumbDrawable<T> configure = setfadingedgelength.configure(cls);
        if (!(configure instanceof setHorizontalScrollbarThumbDrawable)) {
            setHorizontalScrollbarThumbDrawable sethorizontalscrollbarthumbdrawable = new setHorizontalScrollbarThumbDrawable(configure);
            setfadingedgelength.configure.put(cls, sethorizontalscrollbarthumbdrawable);
            configure = sethorizontalscrollbarthumbdrawable;
        }
        ((setHorizontalScrollbarThumbDrawable) configure).cca_continue.put(str, str2);
        setLabelCustomization setlabelcustomization = defaultWriter;
        setToolbarCustomization settoolbarcustomization = setlabelcustomization.configure.get(cls);
        if (!(settoolbarcustomization instanceof getButtonCustomization)) {
            settoolbarcustomization = new getButtonCustomization();
            setlabelcustomization.cca_continue(settoolbarcustomization, cls);
        }
        ((getButtonCustomization) settoolbarcustomization).cca_continue.put(str2, str);
    }

    public static <T> void registerWriter(Class<?> cls, setToolbarCustomization<T> settoolbarcustomization) {
        defaultWriter.cca_continue(settoolbarcustomization, cls);
    }

    public static <T> void registerReader(Class<T> cls, setVerticalScrollbarThumbDrawable<T> setverticalscrollbarthumbdrawable) {
        defaultReader.configure.put(cls, setverticalscrollbarthumbdrawable);
    }

    public static void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        setToolbarCustomization settoolbarcustomization;
        if (obj == null) {
            appendable.append(ThreeDSStrings.NULL_STRING);
            return;
        }
        Class<?> cls = obj.getClass();
        setLabelCustomization setlabelcustomization = defaultWriter;
        setToolbarCustomization settoolbarcustomization2 = setlabelcustomization.configure.get(cls);
        if (settoolbarcustomization2 == null) {
            if (cls.isArray()) {
                settoolbarcustomization = setLabelCustomization.onCReqSuccess;
            } else {
                Class<?> cls2 = obj.getClass();
                Iterator<setLabelCustomization.getInstance> it = setlabelcustomization.cca_continue.iterator();
                while (true) {
                    if (it.hasNext()) {
                        setLabelCustomization.getInstance next = it.next();
                        if (next.Cardinal.isAssignableFrom(cls2)) {
                            settoolbarcustomization = next.configure;
                            break;
                        }
                    } else {
                        settoolbarcustomization = null;
                        break;
                    }
                }
                if (settoolbarcustomization == null) {
                    settoolbarcustomization = setLabelCustomization.init;
                }
            }
            settoolbarcustomization2 = settoolbarcustomization;
            defaultWriter.cca_continue(settoolbarcustomization2, cls);
        }
        settoolbarcustomization2.getInstance(obj, appendable, jSONStyle);
    }

    public static String toJSONString(Object obj) {
        return toJSONString(obj, COMPRESSION);
    }

    public static String toJSONString(Object obj, JSONStyle jSONStyle) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSONString(obj, sb, jSONStyle);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static String escape(String str) {
        return escape(str, COMPRESSION);
    }

    public static String escape(String str, JSONStyle jSONStyle) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        jSONStyle.escape(str, sb);
        return sb.toString();
    }

    public static void escape(String str, Appendable appendable) {
        escape(str, appendable, COMPRESSION);
    }

    public static void escape(String str, Appendable appendable, JSONStyle jSONStyle) {
        if (str != null) {
            jSONStyle.escape(str, appendable);
        }
    }
}
