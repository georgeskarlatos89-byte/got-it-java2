package com.reactnativenavigation.views.element;

import com.reactnativenavigation.options.SharedElementTransitionOptions;
import com.reactnativenavigation.options.SharedElements;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@"}, d2 = {"<anonymous>", "", "Lcom/reactnativenavigation/views/element/SharedElementTransition;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativenavigation.views.element.TransitionSetCreator$createSharedElementTransitions$2", f = "TransitionSetCreator.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: TransitionSetCreator.kt */
final class TransitionSetCreator$createSharedElementTransitions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SharedElementTransition>>, Object> {
    final /* synthetic */ ViewController<?> $fromScreen;
    final /* synthetic */ SharedElements $sharedElements;
    final /* synthetic */ ViewController<?> $toScreen;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransitionSetCreator$createSharedElementTransitions$2(SharedElements sharedElements, ViewController<?> viewController, ViewController<?> viewController2, Continuation<? super TransitionSetCreator$createSharedElementTransitions$2> continuation) {
        super(2, continuation);
        this.$sharedElements = sharedElements;
        this.$toScreen = viewController;
        this.$fromScreen = viewController2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransitionSetCreator$createSharedElementTransitions$2 transitionSetCreator$createSharedElementTransitions$2 = new TransitionSetCreator$createSharedElementTransitions$2(this.$sharedElements, this.$toScreen, this.$fromScreen, continuation);
        transitionSetCreator$createSharedElementTransitions$2.L$0 = obj;
        return transitionSetCreator$createSharedElementTransitions$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<SharedElementTransition>> continuation) {
        return ((TransitionSetCreator$createSharedElementTransitions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Iterable<SharedElementTransitionOptions> iterable = this.$sharedElements.get();
            ViewController<?> viewController = this.$toScreen;
            ViewController<?> viewController2 = this.$fromScreen;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (SharedElementTransitionOptions transitionSetCreator$createSharedElementTransitions$2$1$1 : iterable) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TransitionSetCreator$createSharedElementTransitions$2$1$1(viewController, transitionSetCreator$createSharedElementTransitions$2$1$1, viewController2, (Continuation<? super TransitionSetCreator$createSharedElementTransitions$2$1$1>) null), 3, (Object) null));
            }
            this.label = 1;
            obj = AwaitKt.awaitAll((List) arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : (Iterable) obj) {
            if (((SharedElementTransition) next).isValid()) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }
}
