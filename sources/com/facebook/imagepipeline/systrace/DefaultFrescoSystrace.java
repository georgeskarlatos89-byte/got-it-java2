package com.facebook.imagepipeline.systrace;

import android.os.Trace;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import org.objectweb.asm.signature.SignatureVisitor;

public class DefaultFrescoSystrace implements FrescoSystrace.Systrace {
    public void beginSection(String str) {
    }

    public void endSection() {
    }

    public boolean isTracing() {
        return false;
    }

    public FrescoSystrace.ArgsBuilder beginSectionWithArgs(String str) {
        return FrescoSystrace.NO_OP_ARGS_BUILDER;
    }

    private static final class DefaultArgsBuilder implements FrescoSystrace.ArgsBuilder {
        private final StringBuilder mStringBuilder;

        public DefaultArgsBuilder(String str) {
            this.mStringBuilder = new StringBuilder(str);
        }

        public void flush() {
            if (this.mStringBuilder.length() > 127) {
                this.mStringBuilder.setLength(127);
            }
            Trace.beginSection(this.mStringBuilder.toString());
        }

        public FrescoSystrace.ArgsBuilder arg(String str, Object obj) {
            String str2;
            StringBuilder append = this.mStringBuilder.append(';').append(str).append(SignatureVisitor.INSTANCEOF);
            if (obj == null) {
                str2 = ThreeDSStrings.NULL_STRING;
            } else {
                str2 = obj.toString();
            }
            append.append(str2);
            return this;
        }

        public FrescoSystrace.ArgsBuilder arg(String str, int i) {
            this.mStringBuilder.append(';').append(str).append(SignatureVisitor.INSTANCEOF).append(Integer.toString(i));
            return this;
        }

        public FrescoSystrace.ArgsBuilder arg(String str, long j) {
            this.mStringBuilder.append(';').append(str).append(SignatureVisitor.INSTANCEOF).append(Long.toString(j));
            return this;
        }

        public FrescoSystrace.ArgsBuilder arg(String str, double d) {
            this.mStringBuilder.append(';').append(str).append(SignatureVisitor.INSTANCEOF).append(Double.toString(d));
            return this;
        }
    }
}
