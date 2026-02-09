package com.braintreepayments.api;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0001H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/braintreepayments/api/CrashReporter;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "braintreeClient", "Lcom/braintreepayments/api/BraintreeClient;", "(Lcom/braintreepayments/api/BraintreeClient;)V", "braintreeClientRef", "Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;)V", "defaultExceptionHandler", "determineExceptionCause", "", "ex", "", "handleExceptionWithDefaultBehavior", "", "thread", "Ljava/lang/Thread;", "registerExceptionHandler", "handler", "restoreDefaultExceptionHandler", "start", "uncaughtException", "exception", "Cause", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: CrashReporter.kt */
public final class CrashReporter implements Thread.UncaughtExceptionHandler {
    public static final int CAUSE_RELATED_TO_BRAINTREE = 2;
    public static final int CAUSE_RELATED_TO_PAYPAL = 1;
    public static final int CAUSE_UNKNOWN = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final WeakReference<BraintreeClient> braintreeClientRef;
    private Thread.UncaughtExceptionHandler defaultExceptionHandler;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/CrashReporter$Cause;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    /* compiled from: CrashReporter.kt */
    public @interface Cause {
    }

    public CrashReporter(WeakReference<BraintreeClient> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "braintreeClientRef");
        this.braintreeClientRef = weakReference;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CrashReporter(BraintreeClient braintreeClient) {
        this((WeakReference<BraintreeClient>) new WeakReference(braintreeClient));
        Intrinsics.checkNotNullParameter(braintreeClient, "braintreeClient");
    }

    private final void registerExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.defaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private final void restoreDefaultExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this.defaultExceptionHandler);
        this.defaultExceptionHandler = null;
    }

    private final int determineExceptionCause(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "stringWriter.toString()");
        if (StringsKt.contains$default((CharSequence) stringWriter2, (CharSequence) "com.braintreepayments", false, 2, (Object) null)) {
            return 2;
        }
        String stringWriter3 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter3, "stringWriter.toString()");
        if (StringsKt.contains$default((CharSequence) stringWriter3, (CharSequence) "com.paypal", false, 2, (Object) null)) {
            return 1;
        }
        return 0;
    }

    private final void handleExceptionWithDefaultBehavior(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultExceptionHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public final void start() {
        registerExceptionHandler(this);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(th, "exception");
        BraintreeClient braintreeClient = (BraintreeClient) this.braintreeClientRef.get();
        if (braintreeClient == null) {
            handleExceptionWithDefaultBehavior(thread, th);
            restoreDefaultExceptionHandler();
            return;
        }
        int determineExceptionCause = determineExceptionCause(th);
        if (determineExceptionCause == 1 || determineExceptionCause == 2) {
            braintreeClient.reportCrash();
        }
        handleExceptionWithDefaultBehavior(thread, th);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/CrashReporter$Companion;", "", "()V", "CAUSE_RELATED_TO_BRAINTREE", "", "CAUSE_RELATED_TO_PAYPAL", "CAUSE_UNKNOWN", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: CrashReporter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
