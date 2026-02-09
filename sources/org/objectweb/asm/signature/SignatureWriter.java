package org.objectweb.asm.signature;

import kotlin.text.Typography;
import org.objectweb.asm.Opcodes;

public class SignatureWriter extends SignatureVisitor {
    private final StringBuffer a = new StringBuffer();
    private boolean b;
    private boolean c;
    private int d;

    public SignatureWriter() {
        super(Opcodes.ASM5);
    }

    private void a() {
        if (this.b) {
            this.b = false;
            this.a.append(Typography.greater);
        }
    }

    private void b() {
        if (this.d % 2 != 0) {
            this.a.append(Typography.greater);
        }
        this.d /= 2;
    }

    public String toString() {
        return this.a.toString();
    }

    public SignatureVisitor visitArrayType() {
        this.a.append('[');
        return this;
    }

    public void visitBaseType(char c2) {
        this.a.append(c2);
    }

    public SignatureVisitor visitClassBound() {
        return this;
    }

    public void visitClassType(String str) {
        this.a.append('L');
        this.a.append(str);
        this.d *= 2;
    }

    public void visitEnd() {
        b();
        this.a.append(';');
    }

    public SignatureVisitor visitExceptionType() {
        this.a.append('^');
        return this;
    }

    public void visitFormalTypeParameter(String str) {
        if (!this.b) {
            this.b = true;
            this.a.append(Typography.less);
        }
        this.a.append(str);
        this.a.append(':');
    }

    public void visitInnerClassType(String str) {
        b();
        this.a.append('.');
        this.a.append(str);
        this.d *= 2;
    }

    public SignatureVisitor visitInterface() {
        return this;
    }

    public SignatureVisitor visitInterfaceBound() {
        this.a.append(':');
        return this;
    }

    public SignatureVisitor visitParameterType() {
        a();
        if (!this.c) {
            this.c = true;
            this.a.append('(');
        }
        return this;
    }

    public SignatureVisitor visitReturnType() {
        a();
        if (!this.c) {
            this.a.append('(');
        }
        this.a.append(')');
        return this;
    }

    public SignatureVisitor visitSuperclass() {
        a();
        return this;
    }

    public SignatureVisitor visitTypeArgument(char c2) {
        int i = this.d;
        if (i % 2 == 0) {
            this.d = i + 1;
            this.a.append(Typography.less);
        }
        if (c2 != '=') {
            this.a.append(c2);
        }
        return this;
    }

    public void visitTypeArgument() {
        int i = this.d;
        if (i % 2 == 0) {
            this.d = i + 1;
            this.a.append(Typography.less);
        }
        this.a.append('*');
    }

    public void visitTypeVariable(String str) {
        this.a.append('T');
        this.a.append(str);
        this.a.append(';');
    }
}
