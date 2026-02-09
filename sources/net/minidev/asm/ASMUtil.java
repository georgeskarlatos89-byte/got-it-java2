package net.minidev.asm;

import java.lang.reflect.Field;
import java.util.HashMap;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class ASMUtil {
    public static void autoBoxing(MethodVisitor methodVisitor, Class<?> cls) {
        autoBoxing(methodVisitor, Type.getType((Class) cls));
    }

    public static Accessor[] getAccessors(Class<?> cls, FieldFilter fieldFilter) {
        HashMap hashMap = new HashMap();
        if (fieldFilter == null) {
            fieldFilter = BasicFiledFilter.SINGLETON;
        }
        for (Class<? super Object> cls2 = cls; cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            for (Field field : cls2.getDeclaredFields()) {
                String name = field.getName();
                if (!hashMap.containsKey(name)) {
                    Accessor accessor = new Accessor(cls2, field, fieldFilter);
                    if (accessor.isUsable()) {
                        hashMap.put(name, accessor);
                    }
                }
            }
        }
        return (Accessor[]) hashMap.values().toArray(new Accessor[hashMap.size()]);
    }

    protected static void autoBoxing(MethodVisitor methodVisitor, Type type) {
        switch (type.getSort()) {
            case 1:
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
                return;
            case 2:
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
                return;
            case 3:
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                return;
            case 4:
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                return;
            case 5:
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                return;
            case 6:
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                return;
            case 7:
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                return;
            case 8:
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                return;
            default:
                return;
        }
    }

    protected static void autoUnBoxing1(MethodVisitor methodVisitor, Type type) {
        switch (type.getSort()) {
            case 1:
                methodVisitor.visitTypeInsn(192, "java/lang/Boolean");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z");
                return;
            case 2:
                methodVisitor.visitTypeInsn(192, "java/lang/Character");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Character", "charValue", "()C");
                return;
            case 3:
                methodVisitor.visitTypeInsn(192, "java/lang/Byte");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Byte", "byteValue", "()B");
                return;
            case 4:
                methodVisitor.visitTypeInsn(192, "java/lang/Short");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Short", "shortValue", "()S");
                return;
            case 5:
                methodVisitor.visitTypeInsn(192, "java/lang/Integer");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I");
                return;
            case 6:
                methodVisitor.visitTypeInsn(192, "java/lang/Float");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Float", "floatValue", "()F");
                return;
            case 7:
                methodVisitor.visitTypeInsn(192, "java/lang/Long");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J");
                return;
            case 8:
                methodVisitor.visitTypeInsn(192, "java/lang/Double");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Double", "doubleValue", "()D");
                return;
            case 9:
                methodVisitor.visitTypeInsn(192, type.getInternalName());
                return;
            default:
                methodVisitor.visitTypeInsn(192, type.getInternalName());
                return;
        }
    }

    protected static void autoUnBoxing2(MethodVisitor methodVisitor, Type type) {
        switch (type.getSort()) {
            case 1:
                methodVisitor.visitTypeInsn(192, "java/lang/Boolean");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z");
                return;
            case 2:
                methodVisitor.visitTypeInsn(192, "java/lang/Character");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Character", "charValue", "()C");
                return;
            case 3:
                methodVisitor.visitTypeInsn(192, "java/lang/Number");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Number", "byteValue", "()B");
                return;
            case 4:
                methodVisitor.visitTypeInsn(192, "java/lang/Number");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Number", "shortValue", "()S");
                return;
            case 5:
                methodVisitor.visitTypeInsn(192, "java/lang/Number");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Number", "intValue", "()I");
                return;
            case 6:
                methodVisitor.visitTypeInsn(192, "java/lang/Number");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Number", "floatValue", "()F");
                return;
            case 7:
                methodVisitor.visitTypeInsn(192, "java/lang/Number");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Number", "longValue", "()J");
                return;
            case 8:
                methodVisitor.visitTypeInsn(192, "java/lang/Number");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Number", "doubleValue", "()D");
                return;
            case 9:
                methodVisitor.visitTypeInsn(192, type.getInternalName());
                return;
            default:
                methodVisitor.visitTypeInsn(192, type.getInternalName());
                return;
        }
    }

    public static Label[] newLabels(int i) {
        Label[] labelArr = new Label[i];
        for (int i2 = 0; i2 < i; i2++) {
            labelArr[i2] = new Label();
        }
        return labelArr;
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
