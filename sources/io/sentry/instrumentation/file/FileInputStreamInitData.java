package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import java.io.File;
import java.io.FileInputStream;

final class FileInputStreamInitData {
    final FileInputStream delegate;
    final File file;
    final boolean isSendDefaultPii;
    final ISpan span;

    FileInputStreamInitData(File file2, ISpan iSpan, FileInputStream fileInputStream, boolean z) {
        this.file = file2;
        this.span = iSpan;
        this.delegate = fileInputStream;
        this.isSendDefaultPii = z;
    }
}
