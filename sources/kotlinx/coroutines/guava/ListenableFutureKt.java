package kotlinx.coroutines.guava;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a\u001e\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@¢\u0006\u0002\u0010\u0006\u001aX\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\u0010\u0012\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002¨\u0006\u0016"}, d2 = {"asDeferred", "Lkotlinx/coroutines/Deferred;", "T", "Lcom/google/common/util/concurrent/ListenableFuture;", "asListenableFuture", "await", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "future", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "nonNullCause", "", "Ljava/util/concurrent/ExecutionException;", "kotlinx-coroutines-guava"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: ListenableFuture.kt */
public final class ListenableFutureKt {
    public static /* synthetic */ ListenableFuture future$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> ListenableFuture<T> future(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        if (!coroutineStart.isLazy()) {
            ListenableFutureCoroutine listenableFutureCoroutine = new ListenableFutureCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext));
            listenableFutureCoroutine.start(coroutineStart, listenableFutureCoroutine, function2);
            return listenableFutureCoroutine.future;
        }
        throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
    }

    public static final <T> Deferred<T> asDeferred(ListenableFuture<T> listenableFuture) {
        Throwable tryInternalFastPathGetFailure;
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture)) != null) {
            CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
            CompletableDeferred$default.completeExceptionally(tryInternalFastPathGetFailure);
            return CompletableDeferred$default;
        } else if (listenableFuture.isDone()) {
            try {
                return CompletableDeferredKt.CompletableDeferred(Uninterruptibles.getUninterruptibly(listenableFuture));
            } catch (CancellationException e) {
                CompletableDeferred CompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
                CompletableDeferred$default2.cancel(e);
                return CompletableDeferred$default2;
            } catch (ExecutionException e2) {
                CompletableDeferred CompletableDeferred$default3 = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
                CompletableDeferred$default3.completeExceptionally(nonNullCause(e2));
                return CompletableDeferred$default3;
            }
        } else {
            CompletableDeferred CompletableDeferred$default4 = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
            Futures.addCallback(listenableFuture, new ListenableFutureKt$asDeferred$4(CompletableDeferred$default4), MoreExecutors.directExecutor());
            CompletableDeferred$default4.invokeOnCompletion(new ListenableFutureKt$asDeferred$5(listenableFuture));
            return new ListenableFutureKt$asDeferred$6(CompletableDeferred$default4);
        }
    }

    /* access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }

    public static final <T> ListenableFuture<T> asListenableFuture(Deferred<? extends T> deferred) {
        JobListenableFuture jobListenableFuture = new JobListenableFuture(deferred);
        deferred.invokeOnCompletion(new ListenableFutureKt$asListenableFuture$1(jobListenableFuture, deferred));
        return jobListenableFuture;
    }

    public static final <T> Object await(ListenableFuture<T> listenableFuture, Continuation<? super T> continuation) {
        try {
            if (listenableFuture.isDone()) {
                return Uninterruptibles.getUninterruptibly(listenableFuture);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
            listenableFuture.addListener(new ToContinuation(listenableFuture, cancellableContinuation), MoreExecutors.directExecutor());
            cancellableContinuation.invokeOnCancellation(new ListenableFutureKt$await$2$1(listenableFuture));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (ExecutionException e) {
            throw nonNullCause(e);
        }
    }
}
