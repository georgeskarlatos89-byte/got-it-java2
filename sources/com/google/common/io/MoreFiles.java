package com.google.common.io;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser;
import com.google.common.io.ByteSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
public final class MoreFiles {
    private static final SuccessorsFunction<Path> FILE_TREE = new SuccessorsFunction<Path>() {
        public Iterable<Path> successors(Path path) {
            return MoreFiles.fileTreeChildren(path);
        }
    };

    private MoreFiles() {
    }

    public static ByteSource asByteSource(Path path, OpenOption... openOptionArr) {
        return new PathByteSource(path, openOptionArr);
    }

    private static final class PathByteSource extends ByteSource {
        private static final LinkOption[] FOLLOW_LINKS = new LinkOption[0];
        private final boolean followLinks;
        private final OpenOption[] options;
        /* access modifiers changed from: private */
        public final Path path;

        private PathByteSource(Path path2, OpenOption... openOptionArr) {
            this.path = (Path) Preconditions.checkNotNull(path2);
            OpenOption[] openOptionArr2 = (OpenOption[]) openOptionArr.clone();
            this.options = openOptionArr2;
            this.followLinks = followLinks(openOptionArr2);
        }

        private static boolean followLinks(OpenOption[] openOptionArr) {
            for (LinkOption linkOption : openOptionArr) {
                if (linkOption == LinkOption.NOFOLLOW_LINKS) {
                    return false;
                }
            }
            return true;
        }

        public InputStream openStream() throws IOException {
            return Files.newInputStream(this.path, this.options);
        }

        private BasicFileAttributes readAttributes() throws IOException {
            return Files.readAttributes(this.path, BasicFileAttributes.class, this.followLinks ? FOLLOW_LINKS : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        }

        public Optional<Long> sizeIfKnown() {
            try {
                BasicFileAttributes readAttributes = readAttributes();
                if (readAttributes.isDirectory() || readAttributes.isSymbolicLink()) {
                    return Optional.absent();
                }
                return Optional.of(Long.valueOf(readAttributes.size()));
            } catch (IOException unused) {
                return Optional.absent();
            }
        }

        public long size() throws IOException {
            BasicFileAttributes readAttributes = readAttributes();
            if (readAttributes.isDirectory()) {
                throw new IOException("can't read: is a directory");
            } else if (!readAttributes.isSymbolicLink()) {
                return readAttributes.size();
            } else {
                throw new IOException("can't read: is a symbolic link");
            }
        }

        public byte[] read() throws IOException {
            SeekableByteChannel newByteChannel = Files.newByteChannel(this.path, this.options);
            try {
                byte[] byteArray = ByteStreams.toByteArray(Channels.newInputStream(newByteChannel), newByteChannel.size());
                if (newByteChannel != null) {
                    newByteChannel.close();
                }
                return byteArray;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public CharSource asCharSource(Charset charset) {
            if (this.options.length == 0) {
                return new ByteSource.AsCharSource(charset) {
                    public Stream<String> lines() throws IOException {
                        return Files.lines(PathByteSource.this.path, this.charset);
                    }
                };
            }
            return super.asCharSource(charset);
        }

        public String toString() {
            String valueOf = String.valueOf(this.path);
            String arrays = Arrays.toString(this.options);
            return new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(arrays).length()).append("MoreFiles.asByteSource(").append(valueOf).append(", ").append(arrays).append(")").toString();
        }
    }

    public static ByteSink asByteSink(Path path, OpenOption... openOptionArr) {
        return new PathByteSink(path, openOptionArr);
    }

    private static final class PathByteSink extends ByteSink {
        private final OpenOption[] options;
        private final Path path;

        private PathByteSink(Path path2, OpenOption... openOptionArr) {
            this.path = (Path) Preconditions.checkNotNull(path2);
            this.options = (OpenOption[]) openOptionArr.clone();
        }

        public OutputStream openStream() throws IOException {
            return Files.newOutputStream(this.path, this.options);
        }

        public String toString() {
            String valueOf = String.valueOf(this.path);
            String arrays = Arrays.toString(this.options);
            return new StringBuilder(String.valueOf(valueOf).length() + 24 + String.valueOf(arrays).length()).append("MoreFiles.asByteSink(").append(valueOf).append(", ").append(arrays).append(")").toString();
        }
    }

    public static CharSource asCharSource(Path path, Charset charset, OpenOption... openOptionArr) {
        return asByteSource(path, openOptionArr).asCharSource(charset);
    }

    public static CharSink asCharSink(Path path, Charset charset, OpenOption... openOptionArr) {
        return asByteSink(path, openOptionArr).asCharSink(charset);
    }

    public static ImmutableList<Path> listFiles(Path path) throws IOException {
        DirectoryStream<Path> newDirectoryStream;
        try {
            newDirectoryStream = Files.newDirectoryStream(path);
            ImmutableList<Path> copyOf = ImmutableList.copyOf(newDirectoryStream);
            if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            return copyOf;
        } catch (DirectoryIteratorException e) {
            throw e.getCause();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static Traverser<Path> fileTraverser() {
        return Traverser.forTree(FILE_TREE);
    }

    /* access modifiers changed from: private */
    public static Iterable<Path> fileTreeChildren(Path path) {
        if (!Files.isDirectory(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
            return ImmutableList.of();
        }
        try {
            return listFiles(path);
        } catch (IOException e) {
            throw new DirectoryIteratorException(e);
        }
    }

    public static Predicate<Path> isDirectory(LinkOption... linkOptionArr) {
        final LinkOption[] linkOptionArr2 = (LinkOption[]) linkOptionArr.clone();
        return new Predicate<Path>() {
            public boolean apply(Path path) {
                return Files.isDirectory(path, linkOptionArr2);
            }

            public String toString() {
                String arrays = Arrays.toString(linkOptionArr2);
                return new StringBuilder(String.valueOf(arrays).length() + 23).append("MoreFiles.isDirectory(").append(arrays).append(")").toString();
            }
        };
    }

    private static boolean isDirectory(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) throws IOException {
        return ((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, linkOptionArr)).readAttributes().isDirectory();
    }

    public static Predicate<Path> isRegularFile(LinkOption... linkOptionArr) {
        final LinkOption[] linkOptionArr2 = (LinkOption[]) linkOptionArr.clone();
        return new Predicate<Path>() {
            public boolean apply(Path path) {
                return Files.isRegularFile(path, linkOptionArr2);
            }

            public String toString() {
                String arrays = Arrays.toString(linkOptionArr2);
                return new StringBuilder(String.valueOf(arrays).length() + 25).append("MoreFiles.isRegularFile(").append(arrays).append(")").toString();
            }
        };
    }

    public static boolean equal(Path path, Path path2) throws IOException {
        Preconditions.checkNotNull(path);
        Preconditions.checkNotNull(path2);
        if (Files.isSameFile(path, path2)) {
            return true;
        }
        ByteSource asByteSource = asByteSource(path, new OpenOption[0]);
        ByteSource asByteSource2 = asByteSource(path2, new OpenOption[0]);
        long longValue = asByteSource.sizeIfKnown().or(0L).longValue();
        long longValue2 = asByteSource2.sizeIfKnown().or(0L).longValue();
        if (longValue == 0 || longValue2 == 0 || longValue == longValue2) {
            return asByteSource.contentEquals(asByteSource2);
        }
        return false;
    }

    public static void touch(Path path) throws IOException {
        Preconditions.checkNotNull(path);
        try {
            Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));
        } catch (NoSuchFileException unused) {
            try {
                Files.createFile(path, new FileAttribute[0]);
            } catch (FileAlreadyExistsException unused2) {
            }
        }
    }

    public static void createParentDirectories(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path parent = path.toAbsolutePath().normalize().getParent();
        if (parent != null && !Files.isDirectory(parent, new LinkOption[0])) {
            Files.createDirectories(parent, fileAttributeArr);
            if (!Files.isDirectory(parent, new LinkOption[0])) {
                String valueOf = String.valueOf(path);
                throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 39).append("Unable to create parent directories of ").append(valueOf).toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r3 = r3.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileExtension(java.nio.file.Path r3) {
        /*
            java.nio.file.Path r3 = r3.getFileName()
            java.lang.String r0 = ""
            if (r3 != 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.String r3 = r3.toString()
            r1 = 46
            int r1 = r3.lastIndexOf(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0017
            goto L_0x001d
        L_0x0017:
            int r1 = r1 + 1
            java.lang.String r0 = r3.substring(r1)
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.MoreFiles.getFileExtension(java.nio.file.Path):java.lang.String");
    }

    public static String getNameWithoutExtension(Path path) {
        Path fileName = path.getFileName();
        if (fileName == null) {
            return "";
        }
        String obj = fileName.toString();
        int lastIndexOf = obj.lastIndexOf(46);
        return lastIndexOf == -1 ? obj : obj.substring(0, lastIndexOf);
    }

    public static void deleteRecursively(Path path, RecursiveDeleteOption... recursiveDeleteOptionArr) throws IOException {
        DirectoryStream<Path> newDirectoryStream;
        boolean z;
        Path parentPath = getParentPath(path);
        Collection<IOException> collection = null;
        if (parentPath != null) {
            try {
                newDirectoryStream = Files.newDirectoryStream(parentPath);
                if (newDirectoryStream instanceof SecureDirectoryStream) {
                    collection = deleteRecursivelySecure((SecureDirectoryStream) newDirectoryStream, (Path) Objects.requireNonNull(path.getFileName()));
                    z = true;
                } else {
                    z = false;
                }
                if (newDirectoryStream != null) {
                    newDirectoryStream.close();
                }
                if (!z) {
                    checkAllowsInsecure(path, recursiveDeleteOptionArr);
                    collection = deleteRecursivelyInsecure(path);
                }
            } catch (IOException e) {
                if (collection != null) {
                    collection.add(e);
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (collection != null) {
                throwDeleteFailed(path, collection);
                return;
            }
            return;
        }
        throw new FileSystemException(path.toString(), (String) null, "can't delete recursively");
        throw th;
    }

    public static void deleteDirectoryContents(Path path, RecursiveDeleteOption... recursiveDeleteOptionArr) throws IOException {
        DirectoryStream<Path> newDirectoryStream;
        Collection<IOException> collection;
        Collection<IOException> collection2 = null;
        try {
            newDirectoryStream = Files.newDirectoryStream(path);
            if (newDirectoryStream instanceof SecureDirectoryStream) {
                collection = deleteDirectoryContentsSecure((SecureDirectoryStream) newDirectoryStream);
            } else {
                checkAllowsInsecure(path, recursiveDeleteOptionArr);
                collection = deleteDirectoryContentsInsecure(newDirectoryStream);
            }
            collection2 = collection;
            if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
        } catch (IOException e) {
            if (collection2 != null) {
                collection2.add(e);
            } else {
                throw e;
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (collection2 != null) {
            throwDeleteFailed(path, collection2);
            return;
        }
        return;
        throw th;
    }

    @CheckForNull
    private static Collection<IOException> deleteRecursivelySecure(SecureDirectoryStream<Path> secureDirectoryStream, Path path) {
        SecureDirectoryStream<Path> newDirectoryStream;
        Collection<IOException> collection = null;
        try {
            if (isDirectory(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
                newDirectoryStream = secureDirectoryStream.newDirectoryStream(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
                collection = deleteDirectoryContentsSecure(newDirectoryStream);
                if (newDirectoryStream != null) {
                    newDirectoryStream.close();
                }
                if (collection == null) {
                    secureDirectoryStream.deleteDirectory(path);
                }
            } else {
                secureDirectoryStream.deleteFile(path);
            }
            return collection;
        } catch (IOException e) {
            return addException(collection, e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @CheckForNull
    private static Collection<IOException> deleteDirectoryContentsSecure(SecureDirectoryStream<Path> secureDirectoryStream) {
        Collection<IOException> collection = null;
        try {
            for (Path fileName : secureDirectoryStream) {
                collection = concat(collection, deleteRecursivelySecure(secureDirectoryStream, fileName.getFileName()));
            }
            return collection;
        } catch (DirectoryIteratorException e) {
            return addException((Collection<IOException>) null, e.getCause());
        }
    }

    @CheckForNull
    private static Collection<IOException> deleteRecursivelyInsecure(Path path) {
        DirectoryStream<Path> newDirectoryStream;
        Collection<IOException> collection = null;
        try {
            if (Files.isDirectory(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                newDirectoryStream = Files.newDirectoryStream(path);
                collection = deleteDirectoryContentsInsecure(newDirectoryStream);
                if (newDirectoryStream != null) {
                    newDirectoryStream.close();
                }
            }
            if (collection == null) {
                Files.delete(path);
            }
            return collection;
        } catch (IOException e) {
            return addException(collection, e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @CheckForNull
    private static Collection<IOException> deleteDirectoryContentsInsecure(DirectoryStream<Path> directoryStream) {
        Collection<IOException> collection = null;
        try {
            for (Path deleteRecursivelyInsecure : directoryStream) {
                collection = concat(collection, deleteRecursivelyInsecure(deleteRecursivelyInsecure));
            }
            return collection;
        } catch (DirectoryIteratorException e) {
            return addException((Collection<IOException>) null, e.getCause());
        }
    }

    @CheckForNull
    private static Path getParentPath(Path path) {
        Path parent = path.getParent();
        if (parent != null) {
            return parent;
        }
        if (path.getNameCount() == 0) {
            return null;
        }
        return path.getFileSystem().getPath(".", new String[0]);
    }

    private static void checkAllowsInsecure(Path path, RecursiveDeleteOption[] recursiveDeleteOptionArr) throws InsecureRecursiveDeleteException {
        if (!Arrays.asList(recursiveDeleteOptionArr).contains(RecursiveDeleteOption.ALLOW_INSECURE)) {
            throw new InsecureRecursiveDeleteException(path.toString());
        }
    }

    private static Collection<IOException> addException(@CheckForNull Collection<IOException> collection, IOException iOException) {
        if (collection == null) {
            collection = new ArrayList<>();
        }
        collection.add(iOException);
        return collection;
    }

    @CheckForNull
    private static Collection<IOException> concat(@CheckForNull Collection<IOException> collection, @CheckForNull Collection<IOException> collection2) {
        if (collection == null) {
            return collection2;
        }
        if (collection2 != null) {
            collection.addAll(collection2);
        }
        return collection;
    }

    private static void throwDeleteFailed(Path path, Collection<IOException> collection) throws FileSystemException {
        NoSuchFileException pathNotFound = pathNotFound(path, collection);
        if (pathNotFound == null) {
            FileSystemException fileSystemException = new FileSystemException(path.toString(), (String) null, "failed to delete one or more files; see suppressed exceptions for details");
            for (IOException addSuppressed : collection) {
                fileSystemException.addSuppressed(addSuppressed);
            }
            throw fileSystemException;
        }
        throw pathNotFound;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r4 = (java.nio.file.NoSuchFileException) r4;
     */
    @javax.annotation.CheckForNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.file.NoSuchFileException pathNotFound(java.nio.file.Path r3, java.util.Collection<java.io.IOException> r4) {
        /*
            int r0 = r4.size()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0009
            return r2
        L_0x0009:
            java.lang.Object r4 = com.google.common.collect.Iterables.getOnlyElement(r4)
            java.io.IOException r4 = (java.io.IOException) r4
            boolean r0 = r4 instanceof java.nio.file.NoSuchFileException
            if (r0 != 0) goto L_0x0014
            return r2
        L_0x0014:
            java.nio.file.NoSuchFileException r4 = (java.nio.file.NoSuchFileException) r4
            java.lang.String r0 = r4.getFile()
            if (r0 != 0) goto L_0x001d
            return r2
        L_0x001d:
            java.nio.file.Path r1 = getParentPath(r3)
            if (r1 != 0) goto L_0x0024
            return r2
        L_0x0024:
            java.nio.file.Path r3 = r3.getFileName()
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3)
            java.nio.file.Path r3 = (java.nio.file.Path) r3
            java.nio.file.Path r3 = r1.resolve(r3)
            java.lang.String r3 = r3.toString()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x003d
            return r4
        L_0x003d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.MoreFiles.pathNotFound(java.nio.file.Path, java.util.Collection):java.nio.file.NoSuchFileException");
    }
}
