package kotlinx.coroutines.guava;

import com.google.common.util.concurrent.FutureCallback;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"kotlinx/coroutines/guava/ListenableFutureKt$asDeferred$4", "Lcom/google/common/util/concurrent/FutureCallback;", "onFailure", "", "t", "", "onSuccess", "result", "(Ljava/lang/Object;)V", "kotlinx-coroutines-guava"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: ListenableFuture.kt */
public final class ListenableFutureKt$asDeferred$4 implements FutureCallback<T> {
    final /* synthetic */ CompletableDeferred<T> $deferred;

    ListenableFutureKt$asDeferred$4(CompletableDeferred<T> completableDeferred) {
        this.$deferred = completableDeferred;
    }

    public void onSuccess(T t) {
        Object obj;
        CompletableDeferred<T> completableDeferred = this.$deferred;
        try {
            Result.Companion companion = Result.Companion;
            ListenableFutureKt$asDeferred$4 listenableFutureKt$asDeferred$4 = this;
            obj = Result.m1102constructorimpl(Boolean.valueOf(completableDeferred.complete(t)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1102constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r3 = Result.m1105exceptionOrNullimpl(obj);
        if (r3 != null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, r3);
        }
    }

    public void onFailure(Throwable th) {
        Object obj;
        CompletableDeferred<T> completableDeferred = this.$deferred;
        try {
            Result.Companion companion = Result.Companion;
            ListenableFutureKt$asDeferred$4 listenableFutureKt$asDeferred$4 = this;
            obj = Result.m1102constructorimpl(Boolean.valueOf(completableDeferred.completeExceptionally(th)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1102constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable r3 = Result.m1105exceptionOrNullimpl(obj);
        if (r3 != null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, r3);
        }
    }
}
