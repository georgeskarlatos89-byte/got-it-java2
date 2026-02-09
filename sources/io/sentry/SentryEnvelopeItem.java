package io.sentry;

import io.sentry.exception.SentryEnvelopeException;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

public final class SentryEnvelopeItem {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private byte[] data;
    private final Callable<byte[]> dataFactory;
    private final SentryEnvelopeItemHeader header;

    SentryEnvelopeItem(SentryEnvelopeItemHeader sentryEnvelopeItemHeader, byte[] bArr) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.data = bArr;
        this.dataFactory = null;
    }

    SentryEnvelopeItem(SentryEnvelopeItemHeader sentryEnvelopeItemHeader, Callable<byte[]> callable) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.dataFactory = (Callable) Objects.requireNonNull(callable, "DataFactory is required.");
        this.data = null;
    }

    public byte[] getData() throws Exception {
        Callable<byte[]> callable;
        if (this.data == null && (callable = this.dataFactory) != null) {
            this.data = callable.call();
        }
        return this.data;
    }

    public SentryEnvelopeItemHeader getHeader() {
        return this.header;
    }

    public static SentryEnvelopeItem fromSession(ISerializer iSerializer, Session session) throws IOException {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(session, "Session is required.");
        CachedItem cachedItem = new CachedItem(new SentryEnvelopeItem$$ExternalSyntheticLambda8(iSerializer, session));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Session, new SentryEnvelopeItem$$ExternalSyntheticLambda9(cachedItem), "application/json", (String) null), (Callable<byte[]>) new SentryEnvelopeItem$$ExternalSyntheticLambda10(cachedItem));
    }

    static /* synthetic */ byte[] lambda$fromSession$0(ISerializer iSerializer, Session session) throws Exception {
        BufferedWriter bufferedWriter;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            iSerializer.serialize(session, (Writer) bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        throw th;
    }

    public SentryEvent getEvent(ISerializer iSerializer) throws Exception {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryEvent sentryEvent = (SentryEvent) iSerializer.deserialize(bufferedReader, SentryEvent.class);
            bufferedReader.close();
            return sentryEvent;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static SentryEnvelopeItem fromEvent(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) throws IOException {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryBaseEvent, "SentryEvent is required.");
        CachedItem cachedItem = new CachedItem(new SentryEnvelopeItem$$ExternalSyntheticLambda0(iSerializer, sentryBaseEvent));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.resolve(sentryBaseEvent), new SentryEnvelopeItem$$ExternalSyntheticLambda3(cachedItem), "application/json", (String) null), (Callable<byte[]>) new SentryEnvelopeItem$$ExternalSyntheticLambda4(cachedItem));
    }

    static /* synthetic */ byte[] lambda$fromEvent$3(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) throws Exception {
        BufferedWriter bufferedWriter;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            iSerializer.serialize(sentryBaseEvent, (Writer) bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        throw th;
    }

    public SentryTransaction getTransaction(ISerializer iSerializer) throws Exception {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryTransaction sentryTransaction = (SentryTransaction) iSerializer.deserialize(bufferedReader, SentryTransaction.class);
            bufferedReader.close();
            return sentryTransaction;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static SentryEnvelopeItem fromUserFeedback(ISerializer iSerializer, UserFeedback userFeedback) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(userFeedback, "UserFeedback is required.");
        CachedItem cachedItem = new CachedItem(new SentryEnvelopeItem$$ExternalSyntheticLambda5(iSerializer, userFeedback));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.UserFeedback, new SentryEnvelopeItem$$ExternalSyntheticLambda6(cachedItem), "application/json", (String) null), (Callable<byte[]>) new SentryEnvelopeItem$$ExternalSyntheticLambda7(cachedItem));
    }

    static /* synthetic */ byte[] lambda$fromUserFeedback$6(ISerializer iSerializer, UserFeedback userFeedback) throws Exception {
        BufferedWriter bufferedWriter;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            iSerializer.serialize(userFeedback, (Writer) bufferedWriter);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bufferedWriter.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        throw th;
    }

    public static SentryEnvelopeItem fromAttachment(Attachment attachment, long j) {
        CachedItem cachedItem = new CachedItem(new SentryEnvelopeItem$$ExternalSyntheticLambda11(attachment, j));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Attachment, (Callable<Integer>) new SentryEnvelopeItem$$ExternalSyntheticLambda1(cachedItem), attachment.getContentType(), attachment.getFilename(), attachment.getAttachmentType()), (Callable<byte[]>) new SentryEnvelopeItem$$ExternalSyntheticLambda2(cachedItem));
    }

    static /* synthetic */ byte[] lambda$fromAttachment$9(Attachment attachment, long j) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream;
        if (attachment.getBytes() != null) {
            if (((long) attachment.getBytes().length) <= j) {
                return attachment.getBytes();
            }
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", new Object[]{attachment.getFilename(), Integer.valueOf(attachment.getBytes().length), Long.valueOf(j)}));
        } else if (attachment.getPathname() != null) {
            try {
                File file = new File(attachment.getPathname());
                if (!file.isFile()) {
                    throw new SentryEnvelopeException(String.format("Reading the attachment %s failed, because the file located at the path is not a file.", new Object[]{attachment.getPathname()}));
                } else if (!file.canRead()) {
                    throw new SentryEnvelopeException(String.format("Reading the attachment %s failed, because can't read the file.", new Object[]{attachment.getPathname()}));
                } else if (file.length() <= j) {
                    FileInputStream fileInputStream = new FileInputStream(attachment.getPathname());
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                if (read != -1) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                } else {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    bufferedInputStream.close();
                                    fileInputStream.close();
                                    return byteArray;
                                }
                            }
                        } catch (Throwable th) {
                            bufferedInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        fileInputStream.close();
                        throw th2;
                    }
                } else {
                    throw new SentryEnvelopeException(String.format("Dropping attachment, because the size of the it located at '%s' with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", new Object[]{attachment.getPathname(), Long.valueOf(file.length()), Long.valueOf(j)}));
                }
            } catch (IOException | SecurityException unused) {
                throw new SentryEnvelopeException(String.format("Reading the attachment %s failed.", new Object[]{attachment.getPathname()}));
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        } else {
            throw new SentryEnvelopeException(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes or a path is set.", new Object[]{attachment.getFilename()}));
        }
        throw th;
    }

    private static class CachedItem {
        private byte[] bytes;
        private final Callable<byte[]> dataFactory;

        private static byte[] orEmptyArray(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public CachedItem(Callable<byte[]> callable) {
            this.dataFactory = callable;
        }

        public byte[] getBytes() throws Exception {
            Callable<byte[]> callable;
            if (this.bytes == null && (callable = this.dataFactory) != null) {
                this.bytes = callable.call();
            }
            return orEmptyArray(this.bytes);
        }
    }
}
