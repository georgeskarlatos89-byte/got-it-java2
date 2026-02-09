package com.reactnativenavigation.views.element.finder;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¨\u0006\u0002"}, d2 = {"<anonymous>", "", "androidx/core/view/ViewKt$doOnPreDraw$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: View.kt */
public final class ExistingViewFinder$resumeOnImageLoad$$inlined$doOnPreDraw$1 implements Runnable {
    final /* synthetic */ Continuation $cont$inlined;
    final /* synthetic */ View $this_doOnPreDraw;
    final /* synthetic */ ImageView $view$inlined;
    final /* synthetic */ ExistingViewFinder this$0;

    public ExistingViewFinder$resumeOnImageLoad$$inlined$doOnPreDraw$1(View view, ExistingViewFinder existingViewFinder, ImageView imageView, Continuation continuation) {
        this.$this_doOnPreDraw = view;
        this.this$0 = existingViewFinder;
        this.$view$inlined = imageView;
        this.$cont$inlined = continuation;
    }

    public final void run() {
        if (this.this$0.hasMeasuredDrawable(this.$view$inlined)) {
            this.$view$inlined.post(new ExistingViewFinder$resumeOnImageLoad$1$1(this.$cont$inlined, this.$view$inlined));
        } else {
            this.this$0.resumeOnImageLoad(this.$view$inlined, this.$cont$inlined);
        }
    }
}
