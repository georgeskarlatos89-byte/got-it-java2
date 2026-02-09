package com.reactnativenavigation.views.element;

import com.reactnativenavigation.R;
import com.reactnativenavigation.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/reactnativenavigation/views/element/Transition;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TransitionAnimatorCreator.kt */
final class TransitionAnimatorCreator$recordIndices$1 extends Lambda implements Function1<Transition, Unit> {
    public static final TransitionAnimatorCreator$recordIndices$1 INSTANCE = new TransitionAnimatorCreator$recordIndices$1();

    TransitionAnimatorCreator$recordIndices$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Transition) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "it");
        transition.getView().setTag(R.id.original_index_in_parent, Integer.valueOf(ViewUtils.getIndexInParent(transition.getView())));
    }
}
