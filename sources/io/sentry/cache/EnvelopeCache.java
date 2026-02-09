package io.sentry.cache;

import io.sentry.DateUtils;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;

public final class EnvelopeCache extends CacheStrategy implements IEnvelopeCache {
    public static final String CRASH_MARKER_FILE = "last_crash";
    public static final String NATIVE_CRASH_MARKER_FILE = ".sentry-native/last_crash";
    public static final String PREFIX_CURRENT_SESSION_FILE = "session";
    static final String SUFFIX_CURRENT_SESSION_FILE = ".json";
    public static final String SUFFIX_ENVELOPE_FILE = ".envelope";
    private final Map<SentryEnvelope, String> fileNameMap = new WeakHashMap();

    public static IEnvelopeCache create(SentryOptions sentryOptions) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        int maxCacheItems = sentryOptions.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new EnvelopeCache(sentryOptions, cacheDirPath, maxCacheItems);
        }
        sentryOptions.getLogger().log(SentryLevel.WARNING, "maxCacheItems is null, returning NoOpEnvelopeCache", new Object[0]);
        return NoOpEnvelopeCache.getInstance();
    }

    private EnvelopeCache(SentryOptions sentryOptions, String str, int i) {
        super(sentryOptions, str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r5.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ed, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:30:0x00dc, B:35:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void store(io.sentry.SentryEnvelope r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Envelope is required."
            io.sentry.util.Objects.requireNonNull(r13, r0)
            java.io.File[] r0 = r12.allEnvelopeFiles()
            r12.rotateCacheIfNeeded(r0)
            java.io.File r0 = r12.getCurrentSessionFile()
            boolean r1 = r14 instanceof io.sentry.hints.SessionEnd
            r2 = 0
            if (r1 == 0) goto L_0x002a
            boolean r1 = r0.delete()
            if (r1 != 0) goto L_0x002a
            io.sentry.SentryOptions r1 = r12.options
            io.sentry.ILogger r1 = r1.getLogger()
            io.sentry.SentryLevel r3 = io.sentry.SentryLevel.WARNING
            java.lang.String r4 = "Current envelope doesn't exist."
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r1.log((io.sentry.SentryLevel) r3, (java.lang.String) r4, (java.lang.Object[]) r5)
        L_0x002a:
            boolean r1 = r14 instanceof io.sentry.hints.SessionStart
            r3 = 1
            if (r1 == 0) goto L_0x015d
            boolean r1 = r0.exists()
            java.lang.String r4 = "Failed to delete the crash marker file. %s."
            if (r1 == 0) goto L_0x0114
            io.sentry.SentryOptions r1 = r12.options
            io.sentry.ILogger r1 = r1.getLogger()
            io.sentry.SentryLevel r5 = io.sentry.SentryLevel.WARNING
            java.lang.String r6 = "Current session is not ended, we'd need to end it."
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r1.log((io.sentry.SentryLevel) r5, (java.lang.String) r6, (java.lang.Object[]) r7)
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x00ef }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x00ef }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x00ef }
            r6.<init>(r0)     // Catch:{ all -> 0x00ef }
            java.nio.charset.Charset r7 = UTF_8     // Catch:{ all -> 0x00ef }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00ef }
            r1.<init>(r5)     // Catch:{ all -> 0x00ef }
            io.sentry.ISerializer r5 = r12.serializer     // Catch:{ all -> 0x00e2 }
            java.lang.Class<io.sentry.Session> r6 = io.sentry.Session.class
            java.lang.Object r5 = r5.deserialize(r1, r6)     // Catch:{ all -> 0x00e2 }
            io.sentry.Session r5 = (io.sentry.Session) r5     // Catch:{ all -> 0x00e2 }
            if (r5 != 0) goto L_0x007a
            io.sentry.SentryOptions r5 = r12.options     // Catch:{ all -> 0x00e2 }
            io.sentry.ILogger r5 = r5.getLogger()     // Catch:{ all -> 0x00e2 }
            io.sentry.SentryLevel r6 = io.sentry.SentryLevel.ERROR     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = "Stream from path %s resulted in a null envelope."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ all -> 0x00e2 }
            java.lang.String r9 = r0.getAbsolutePath()     // Catch:{ all -> 0x00e2 }
            r8[r2] = r9     // Catch:{ all -> 0x00e2 }
            r5.log((io.sentry.SentryLevel) r6, (java.lang.String) r7, (java.lang.Object[]) r8)     // Catch:{ all -> 0x00e2 }
            r6 = r2
            goto L_0x00dc
        L_0x007a:
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00e2 }
            io.sentry.SentryOptions r7 = r12.options     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = r7.getCacheDirPath()     // Catch:{ all -> 0x00e2 }
            java.lang.String r8 = ".sentry-native/last_crash"
            r6.<init>(r7, r8)     // Catch:{ all -> 0x00e2 }
            boolean r7 = r6.exists()     // Catch:{ all -> 0x00e2 }
            r8 = 0
            if (r7 == 0) goto L_0x00c5
            io.sentry.SentryOptions r7 = r12.options     // Catch:{ all -> 0x00e2 }
            io.sentry.ILogger r7 = r7.getLogger()     // Catch:{ all -> 0x00e2 }
            io.sentry.SentryLevel r9 = io.sentry.SentryLevel.INFO     // Catch:{ all -> 0x00e2 }
            java.lang.String r10 = "Crash marker file exists, last Session is gonna be Crashed."
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e2 }
            r7.log((io.sentry.SentryLevel) r9, (java.lang.String) r10, (java.lang.Object[]) r11)     // Catch:{ all -> 0x00e2 }
            java.util.Date r7 = r12.getTimestampFromCrashMarkerFile(r6)     // Catch:{ all -> 0x00e2 }
            boolean r9 = r6.delete()     // Catch:{ all -> 0x00c2 }
            if (r9 != 0) goto L_0x00ba
            io.sentry.SentryOptions r9 = r12.options     // Catch:{ all -> 0x00c2 }
            io.sentry.ILogger r9 = r9.getLogger()     // Catch:{ all -> 0x00c2 }
            io.sentry.SentryLevel r10 = io.sentry.SentryLevel.ERROR     // Catch:{ all -> 0x00c2 }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x00c2 }
            r11[r2] = r6     // Catch:{ all -> 0x00c2 }
            r9.log((io.sentry.SentryLevel) r10, (java.lang.String) r4, (java.lang.Object[]) r11)     // Catch:{ all -> 0x00c2 }
        L_0x00ba:
            io.sentry.Session$State r6 = io.sentry.Session.State.Crashed     // Catch:{ all -> 0x00c2 }
            r5.update(r6, r8, r3)     // Catch:{ all -> 0x00c2 }
            r6 = r3
            r8 = r7
            goto L_0x00c6
        L_0x00c2:
            r5 = move-exception
            r6 = r3
            goto L_0x00e4
        L_0x00c5:
            r6 = r2
        L_0x00c6:
            r5.end(r8)     // Catch:{ all -> 0x00e0 }
            io.sentry.ISerializer r7 = r12.serializer     // Catch:{ all -> 0x00e0 }
            io.sentry.SentryOptions r8 = r12.options     // Catch:{ all -> 0x00e0 }
            io.sentry.protocol.SdkVersion r8 = r8.getSdkVersion()     // Catch:{ all -> 0x00e0 }
            io.sentry.SentryEnvelope r5 = io.sentry.SentryEnvelope.from((io.sentry.ISerializer) r7, (io.sentry.Session) r5, (io.sentry.protocol.SdkVersion) r8)     // Catch:{ all -> 0x00e0 }
            java.io.File r7 = r12.getEnvelopeFile(r5)     // Catch:{ all -> 0x00e0 }
            r12.writeEnvelopeToDisk(r7, r5)     // Catch:{ all -> 0x00e0 }
        L_0x00dc:
            r1.close()     // Catch:{ all -> 0x00ed }
            goto L_0x00fe
        L_0x00e0:
            r5 = move-exception
            goto L_0x00e4
        L_0x00e2:
            r5 = move-exception
            r6 = r2
        L_0x00e4:
            r1.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch:{ all -> 0x00ed }
        L_0x00ec:
            throw r5     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r1 = move-exception
            goto L_0x00f1
        L_0x00ef:
            r1 = move-exception
            r6 = r2
        L_0x00f1:
            io.sentry.SentryOptions r5 = r12.options
            io.sentry.ILogger r5 = r5.getLogger()
            io.sentry.SentryLevel r7 = io.sentry.SentryLevel.ERROR
            java.lang.String r8 = "Error processing session."
            r5.log((io.sentry.SentryLevel) r7, (java.lang.String) r8, (java.lang.Throwable) r1)
        L_0x00fe:
            boolean r1 = r0.delete()
            if (r1 != 0) goto L_0x0115
            io.sentry.SentryOptions r1 = r12.options
            io.sentry.ILogger r1 = r1.getLogger()
            io.sentry.SentryLevel r5 = io.sentry.SentryLevel.WARNING
            java.lang.String r7 = "Failed to delete the current session file."
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r1.log((io.sentry.SentryLevel) r5, (java.lang.String) r7, (java.lang.Object[]) r8)
            goto L_0x0115
        L_0x0114:
            r6 = r2
        L_0x0115:
            r12.updateCurrentSession(r0, r13)
            if (r6 != 0) goto L_0x0156
            java.io.File r0 = new java.io.File
            io.sentry.SentryOptions r1 = r12.options
            java.lang.String r1 = r1.getCacheDirPath()
            java.lang.String r5 = "last_crash"
            r0.<init>(r1, r5)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0156
            io.sentry.SentryOptions r1 = r12.options
            io.sentry.ILogger r1 = r1.getLogger()
            io.sentry.SentryLevel r5 = io.sentry.SentryLevel.INFO
            java.lang.String r6 = "Crash marker file exists, crashedLastRun will return true."
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r1.log((io.sentry.SentryLevel) r5, (java.lang.String) r6, (java.lang.Object[]) r7)
            boolean r1 = r0.delete()
            if (r1 != 0) goto L_0x0155
            io.sentry.SentryOptions r1 = r12.options
            io.sentry.ILogger r1 = r1.getLogger()
            io.sentry.SentryLevel r5 = io.sentry.SentryLevel.ERROR
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getAbsolutePath()
            r6[r2] = r0
            r1.log((io.sentry.SentryLevel) r5, (java.lang.String) r4, (java.lang.Object[]) r6)
        L_0x0155:
            r6 = r3
        L_0x0156:
            io.sentry.SentryCrashLastRunState r0 = io.sentry.SentryCrashLastRunState.getInstance()
            r0.setCrashedLastRun(r6)
        L_0x015d:
            java.io.File r0 = r12.getEnvelopeFile(r13)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x017d
            io.sentry.SentryOptions r13 = r12.options
            io.sentry.ILogger r13 = r13.getLogger()
            io.sentry.SentryLevel r14 = io.sentry.SentryLevel.WARNING
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getAbsolutePath()
            r1[r2] = r0
            java.lang.String r0 = "Not adding Envelope to offline storage because it already exists: %s"
            r13.log((io.sentry.SentryLevel) r14, (java.lang.String) r0, (java.lang.Object[]) r1)
            return
        L_0x017d:
            io.sentry.SentryOptions r1 = r12.options
            io.sentry.ILogger r1 = r1.getLogger()
            io.sentry.SentryLevel r4 = io.sentry.SentryLevel.DEBUG
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r0.getAbsolutePath()
            r3[r2] = r5
            java.lang.String r2 = "Adding Envelope to offline storage: %s"
            r1.log((io.sentry.SentryLevel) r4, (java.lang.String) r2, (java.lang.Object[]) r3)
            r12.writeEnvelopeToDisk(r0, r13)
            boolean r13 = r14 instanceof io.sentry.hints.DiskFlushNotification
            if (r13 == 0) goto L_0x019c
            r12.writeCrashMarkerFile()
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.cache.EnvelopeCache.store(io.sentry.SentryEnvelope, java.lang.Object):void");
    }

    private void writeCrashMarkerFile() {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(new File(this.options.getCacheDirPath(), CRASH_MARKER_FILE));
            fileOutputStream.write(DateUtils.getTimestamp(DateUtils.getCurrentDateTime()).getBytes(UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error writing the crash marker file to the disk", th);
            return;
        }
        throw th;
    }

    private Date getTimestampFromCrashMarkerFile(File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), UTF_8));
            String readLine = bufferedReader.readLine();
            this.options.getLogger().log(SentryLevel.DEBUG, "Crash marker file has %s timestamp.", readLine);
            Date dateTime = DateUtils.getDateTime(readLine);
            bufferedReader.close();
            return dateTime;
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error reading the crash marker file.", (Throwable) e);
            return null;
        } catch (IllegalArgumentException e2) {
            this.options.getLogger().log(SentryLevel.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private void updateCurrentSession(File file, SentryEnvelope sentryEnvelope) {
        BufferedReader bufferedReader;
        Iterable<SentryEnvelopeItem> items = sentryEnvelope.getItems();
        if (items.iterator().hasNext()) {
            SentryEnvelopeItem next = items.iterator().next();
            if (SentryItemType.Session.equals(next.getHeader().getType())) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.getData()), UTF_8));
                    Session session = (Session) this.serializer.deserialize(bufferedReader, Session.class);
                    if (session == null) {
                        this.options.getLogger().log(SentryLevel.ERROR, "Item of type %s returned null by the parser.", next.getHeader().getType());
                    } else {
                        writeSessionToDisk(file, session);
                    }
                    bufferedReader.close();
                    return;
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Item failed to process.", th);
                    return;
                }
            } else {
                this.options.getLogger().log(SentryLevel.INFO, "Current envelope has a different envelope type %s", next.getHeader().getType());
                return;
            }
        } else {
            this.options.getLogger().log(SentryLevel.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        throw th;
    }

    private void writeEnvelopeToDisk(File file, SentryEnvelope sentryEnvelope) {
        FileOutputStream fileOutputStream;
        if (file.exists()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            this.serializer.serialize(sentryEnvelope, (OutputStream) fileOutputStream);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
            return;
        }
        throw th;
    }

    private void writeSessionToDisk(File file, Session session) {
        BufferedWriter bufferedWriter;
        if (file.exists()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Overwriting session to offline storage: %s", session.getSessionId());
            if (!file.delete()) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, UTF_8));
                this.serializer.serialize(session, (Writer) bufferedWriter);
                bufferedWriter.close();
                fileOutputStream.close();
                return;
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, th2, "Error writing Session to offline storage: %s", session.getSessionId());
        }
    }

    public void discard(SentryEnvelope sentryEnvelope) {
        Objects.requireNonNull(sentryEnvelope, "Envelope is required.");
        File envelopeFile = getEnvelopeFile(sentryEnvelope);
        if (envelopeFile.exists()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Discarding envelope from cache: %s", envelopeFile.getAbsolutePath());
            if (!envelopeFile.delete()) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete envelope: %s", envelopeFile.getAbsolutePath());
                return;
            }
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Envelope was not cached: %s", envelopeFile.getAbsolutePath());
    }

    private synchronized File getEnvelopeFile(SentryEnvelope sentryEnvelope) {
        String str;
        String str2;
        if (this.fileNameMap.containsKey(sentryEnvelope)) {
            str = this.fileNameMap.get(sentryEnvelope);
        } else {
            if (sentryEnvelope.getHeader().getEventId() != null) {
                str2 = sentryEnvelope.getHeader().getEventId().toString();
            } else {
                str2 = UUID.randomUUID().toString();
            }
            String str3 = str2 + SUFFIX_ENVELOPE_FILE;
            this.fileNameMap.put(sentryEnvelope, str3);
            str = str3;
        }
        return new File(this.directory.getAbsolutePath(), str);
    }

    private File getCurrentSessionFile() {
        return new File(this.directory.getAbsolutePath(), "session.json");
    }

    public Iterator<SentryEnvelope> iterator() {
        BufferedInputStream bufferedInputStream;
        File[] allEnvelopeFiles = allEnvelopeFiles();
        ArrayList arrayList = new ArrayList(allEnvelopeFiles.length);
        for (File file : allEnvelopeFiles) {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                arrayList.add(this.serializer.deserializeEnvelope(bufferedInputStream));
                bufferedInputStream.close();
            } catch (FileNotFoundException unused) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                this.options.getLogger().log(SentryLevel.ERROR, String.format("Error while reading cached envelope from file %s", new Object[]{file.getAbsolutePath()}), (Throwable) e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return arrayList.iterator();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.directory.listFiles(new io.sentry.cache.EnvelopeCache$$ExternalSyntheticLambda0());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File[] allEnvelopeFiles() {
        /*
            r2 = this;
            boolean r0 = r2.isDirectoryValid()
            if (r0 == 0) goto L_0x0014
            java.io.File r0 = r2.directory
            io.sentry.cache.EnvelopeCache$$ExternalSyntheticLambda0 r1 = new io.sentry.cache.EnvelopeCache$$ExternalSyntheticLambda0
            r1.<init>()
            java.io.File[] r0 = r0.listFiles(r1)
            if (r0 == 0) goto L_0x0014
            return r0
        L_0x0014:
            r0 = 0
            java.io.File[] r0 = new java.io.File[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.cache.EnvelopeCache.allEnvelopeFiles():java.io.File[]");
    }
}
