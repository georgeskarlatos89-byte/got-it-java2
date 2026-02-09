package com.google.common.io;

import java.nio.file.FileSystemException;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
public final class InsecureRecursiveDeleteException extends FileSystemException {
    public InsecureRecursiveDeleteException(@CheckForNull String str) {
        super(str, (String) null, "unable to guarantee security of recursive delete");
    }
}
