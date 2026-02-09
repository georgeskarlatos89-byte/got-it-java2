package com.mrousavy.camera.frameprocessor;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mrousavy/camera/frameprocessor/PerformanceSampleCollection;", "", "endPerformanceSampleCollection", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getEndPerformanceSampleCollection", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FrameProcessorPerformanceDataCollector.kt */
public final class PerformanceSampleCollection {
    private final Function0<Unit> endPerformanceSampleCollection;

    public static /* synthetic */ PerformanceSampleCollection copy$default(PerformanceSampleCollection performanceSampleCollection, Function0<Unit> function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = performanceSampleCollection.endPerformanceSampleCollection;
        }
        return performanceSampleCollection.copy(function0);
    }

    public final Function0<Unit> component1() {
        return this.endPerformanceSampleCollection;
    }

    public final PerformanceSampleCollection copy(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "endPerformanceSampleCollection");
        return new PerformanceSampleCollection(function0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PerformanceSampleCollection) && Intrinsics.areEqual((Object) this.endPerformanceSampleCollection, (Object) ((PerformanceSampleCollection) obj).endPerformanceSampleCollection);
    }

    public int hashCode() {
        return this.endPerformanceSampleCollection.hashCode();
    }

    public String toString() {
        return "PerformanceSampleCollection(endPerformanceSampleCollection=" + this.endPerformanceSampleCollection + ')';
    }

    public PerformanceSampleCollection(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "endPerformanceSampleCollection");
        this.endPerformanceSampleCollection = function0;
    }

    public final Function0<Unit> getEndPerformanceSampleCollection() {
        return this.endPerformanceSampleCollection;
    }
}
