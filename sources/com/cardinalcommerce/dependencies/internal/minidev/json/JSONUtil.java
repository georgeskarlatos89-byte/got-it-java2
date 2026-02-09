package com.cardinalcommerce.dependencies.internal.minidev.json;

import com.cardinalcommerce.a.getBorderWidth;
import com.cardinalcommerce.dependencies.internal.minidev.asm.FieldFilter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JSONUtil {
    public static final JsonSmartFieldFilter JSON_SMART_FIELD_FILTER = new JsonSmartFieldFilter();

    public static Object convertToStrict(Object obj, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                if (obj instanceof Number) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                return Integer.valueOf(obj.toString());
            } else if (cls == Short.TYPE) {
                if (obj instanceof Number) {
                    return Short.valueOf(((Number) obj).shortValue());
                }
                return Short.valueOf(obj.toString());
            } else if (cls == Long.TYPE) {
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                return Long.valueOf(obj.toString());
            } else if (cls == Byte.TYPE) {
                if (obj instanceof Number) {
                    return Byte.valueOf(((Number) obj).byteValue());
                }
                return Byte.valueOf(obj.toString());
            } else if (cls == Float.TYPE) {
                if (obj instanceof Number) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                return Float.valueOf(obj.toString());
            } else if (cls != Double.TYPE) {
                if (cls == Character.TYPE) {
                    String obj2 = cls.toString();
                    if (obj2.length() > 0) {
                        return Character.valueOf(obj2.charAt(0));
                    }
                } else if (cls == Boolean.TYPE) {
                    return (Boolean) obj;
                }
                throw new RuntimeException(new StringBuilder("Primitive: Can not convert ").append(obj.getClass().getName()).append(" to ").append(cls.getName()).toString());
            } else if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            } else {
                return Double.valueOf(obj.toString());
            }
        } else if (cls.isEnum()) {
            return Enum.valueOf(cls, obj.toString());
        } else {
            if (cls == Integer.class) {
                if (obj instanceof Number) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                return Integer.valueOf(obj.toString());
            } else if (cls == Long.class) {
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                return Long.valueOf(obj.toString());
            } else if (cls == Short.class) {
                if (obj instanceof Number) {
                    return Short.valueOf(((Number) obj).shortValue());
                }
                return Short.valueOf(obj.toString());
            } else if (cls == Byte.class) {
                if (obj instanceof Number) {
                    return Byte.valueOf(((Number) obj).byteValue());
                }
                return Byte.valueOf(obj.toString());
            } else if (cls == Float.class) {
                if (obj instanceof Number) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                return Float.valueOf(obj.toString());
            } else if (cls != Double.class) {
                if (cls == Character.class) {
                    String obj3 = cls.toString();
                    if (obj3.length() > 0) {
                        return Character.valueOf(obj3.charAt(0));
                    }
                }
                throw new RuntimeException(new StringBuilder("Object: Can not Convert ").append(obj.getClass().getName()).append(" to ").append(cls.getName()).toString());
            } else if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            } else {
                return Double.valueOf(obj.toString());
            }
        }
    }

    public static Object convertToX(Object obj, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        if (cls.isPrimitive()) {
            if (obj instanceof Number) {
                return obj;
            }
            if (cls == Integer.TYPE) {
                return Integer.valueOf(obj.toString());
            }
            if (cls == Short.TYPE) {
                return Short.valueOf(obj.toString());
            }
            if (cls == Long.TYPE) {
                return Long.valueOf(obj.toString());
            }
            if (cls == Byte.TYPE) {
                return Byte.valueOf(obj.toString());
            }
            if (cls == Float.TYPE) {
                return Float.valueOf(obj.toString());
            }
            if (cls == Double.TYPE) {
                return Double.valueOf(obj.toString());
            }
            if (cls == Character.TYPE) {
                String obj2 = cls.toString();
                if (obj2.length() > 0) {
                    return Character.valueOf(obj2.charAt(0));
                }
            } else if (cls == Boolean.TYPE) {
                return (Boolean) obj;
            }
            throw new RuntimeException(new StringBuilder("Primitive: Can not convert ").append(obj.getClass().getName()).append(" to ").append(cls.getName()).toString());
        } else if (cls.isEnum()) {
            return Enum.valueOf(cls, obj.toString());
        } else {
            if (cls == Integer.class) {
                if (obj instanceof Number) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                return Integer.valueOf(obj.toString());
            } else if (cls == Long.class) {
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                return Long.valueOf(obj.toString());
            } else if (cls == Short.class) {
                if (obj instanceof Number) {
                    return Short.valueOf(((Number) obj).shortValue());
                }
                return Short.valueOf(obj.toString());
            } else if (cls == Byte.class) {
                if (obj instanceof Number) {
                    return Byte.valueOf(((Number) obj).byteValue());
                }
                return Byte.valueOf(obj.toString());
            } else if (cls == Float.class) {
                if (obj instanceof Number) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                return Float.valueOf(obj.toString());
            } else if (cls != Double.class) {
                if (cls == Character.class) {
                    String obj3 = cls.toString();
                    if (obj3.length() > 0) {
                        return Character.valueOf(obj3.charAt(0));
                    }
                }
                throw new RuntimeException(new StringBuilder("Object: Can not Convert ").append(obj.getClass().getName()).append(" to ").append(cls.getName()).toString());
            } else if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            } else {
                return Double.valueOf(obj.toString());
            }
        }
    }

    public static class JsonSmartFieldFilter implements FieldFilter {
        public boolean canRead(Field field) {
            return true;
        }

        public boolean canWrite(Field field) {
            return true;
        }

        public boolean canUse(Field field) {
            getBorderWidth getborderwidth = (getBorderWidth) field.getAnnotation(getBorderWidth.class);
            return getborderwidth == null || !getborderwidth.configure();
        }

        public boolean canUse(Field field, Method method) {
            getBorderWidth getborderwidth = (getBorderWidth) method.getAnnotation(getBorderWidth.class);
            return getborderwidth == null || !getborderwidth.configure();
        }
    }

    public static String getSetterName(String str) {
        int length = str.length();
        char[] cArr = new char[(length + 3)];
        cArr[0] = 's';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static String getGetterName(String str) {
        int length = str.length();
        char[] cArr = new char[(length + 3)];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static String getIsName(String str) {
        int length = str.length();
        char[] cArr = new char[(length + 2)];
        cArr[0] = 'i';
        cArr[1] = 's';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[2] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 2] = str.charAt(i);
        }
        return new String(cArr);
    }
}
