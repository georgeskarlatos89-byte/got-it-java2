package com.mrousavy.camera.frameprocessor;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: FrameProcessorPerformanceDataCollector.kt */
final class FrameProcessorPerformanceDataCollector$beginPerformanceSampleCollection$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ long $begin;
    final /* synthetic */ FrameProcessorPerformanceDataCollector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FrameProcessorPerformanceDataCollector$beginPerformanceSampleCollection$1(long j, FrameProcessorPerformanceDataCollector frameProcessorPerformanceDataCollector) {
        super(0);
        this.$begin = j;
        this.this$0 = frameProcessorPerformanceDataCollector;
    }

    public final void invoke() {
        double currentTimeMillis = ((double) (System.currentTimeMillis() - this.$begin)) / 1000.0d;
        int access$getCounter$p = this.this$0.counter % 15;
        if (this.this$0.performanceSamples.size() > access$getCounter$p) {
            this.this$0.performanceSamples.set(access$getCounter$p, Double.valueOf(currentTimeMillis));
        } else {
            this.this$0.performanceSamples.add(Double.valueOf(currentTimeMillis));
        }
        FrameProcessorPerformanceDataCollector frameProcessorPerformanceDataCollector = this.this$0;
        frameProcessorPerformanceDataCollector.counter = frameProcessorPerformanceDataCollector.counter + 1;
    }
}
