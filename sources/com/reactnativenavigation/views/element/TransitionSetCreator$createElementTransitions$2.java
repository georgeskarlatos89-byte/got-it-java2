package com.reactnativenavigation.views.element;

import com.reactnativenavigation.options.ElementTransitionOptions;
import com.reactnativenavigation.options.ElementTransitions;
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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@"}, d2 = {"<anonymous>", "", "Lcom/reactnativenavigation/views/element/ElementTransition;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativenavigation.views.element.TransitionSetCreator$createElementTransitions$2", f = "TransitionSetCreator.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: TransitionSetCreator.kt */
final class TransitionSetCreator$createElementTransitions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ElementTransition>>, Object> {
    final /* synthetic */ ElementTransitions $elementTransitions;
    final /* synthetic */ ViewController<?> $fromScreen;
    final /* synthetic */ ViewController<?> $toScreen;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransitionSetCreator$createElementTransitions$2(ElementTransitions elementTransitions, ViewController<?> viewController, ViewController<?> viewController2, Continuation<? super TransitionSetCreator$createElementTransitions$2> continuation) {
        super(2, continuation);
        this.$elementTransitions = elementTransitions;
        this.$fromScreen = viewController;
        this.$toScreen = viewController2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransitionSetCreator$createElementTransitions$2 transitionSetCreator$createElementTransitions$2 = new TransitionSetCreator$createElementTransitions$2(this.$elementTransitions, this.$fromScreen, this.$toScreen, continuation);
        transitionSetCreator$createElementTransitions$2.L$0 = obj;
        return transitionSetCreator$createElementTransitions$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<ElementTransition>> continuation) {
        return ((TransitionSetCreator$createElementTransitions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Iterable<ElementTransitionOptions> transitions = this.$elementTransitions.getTransitions();
            ViewController<?> viewController = this.$fromScreen;
            ViewController<?> viewController2 = this.$toScreen;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transitions, 10));
            for (ElementTransitionOptions transitionSetCreator$createElementTransitions$2$1$1 : transitions) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TransitionSetCreator$createElementTransitions$2$1$1(transitionSetCreator$createElementTransitions$2$1$1, viewController, viewController2, (Continuation<? super TransitionSetCreator$createElementTransitions$2$1$1>) null), 3, (Object) null));
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
            if (((ElementTransition) next).isValid()) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }
}
