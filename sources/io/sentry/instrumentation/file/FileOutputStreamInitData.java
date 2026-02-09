package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import java.io.File;
import java.io.FileOutputStream;

final class FileOutputStreamInitData {
    final boolean append;
    final FileOutputStream delegate;
    final File file;
    final boolean isSendDefaultPii;
    final ISpan span;

    FileOutputStreamInitData(File file2, boolean z, ISpan iSpan, FileOutputStream fileOutputStream, boolean z2) {
        this.file = file2;
        this.append = z;
        this.span = iSpan;
        this.delegate = fileOutputStream;
        this.isSendDefaultPii = z2;
    }
}
