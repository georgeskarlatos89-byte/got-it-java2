package com.mrousavy.camera.frameprocessor;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\nj\b\u0012\u0004\u0012\u00020\u0004`\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mrousavy/camera/frameprocessor/FrameProcessorPerformanceDataCollector;", "", "()V", "averageExecutionTimeSeconds", "", "getAverageExecutionTimeSeconds", "()D", "counter", "", "performanceSamples", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "beginPerformanceSampleCollection", "Lcom/mrousavy/camera/frameprocessor/PerformanceSampleCollection;", "clear", "", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FrameProcessorPerformanceDataCollector.kt */
public final class FrameProcessorPerformanceDataCollector {
    /* access modifiers changed from: private */
    public int counter;
    /* access modifiers changed from: private */
    public ArrayList<Double> performanceSamples = new ArrayList<>();

    public final double getAverageExecutionTimeSeconds() {
        return CollectionsKt.averageOfDouble(this.performanceSamples);
    }

    public final PerformanceSampleCollection beginPerformanceSampleCollection() {
        return new PerformanceSampleCollection(new FrameProcessorPerformanceDataCollector$beginPerformanceSampleCollection$1(System.currentTimeMillis(), this));
    }

    public final void clear() {
        this.counter = 0;
        this.performanceSamples.clear();
    }
}
