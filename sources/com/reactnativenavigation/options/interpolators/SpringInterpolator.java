package com.reactnativenavigation.options.interpolators;

import android.animation.TimeInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/reactnativenavigation/options/interpolators/SpringInterpolator;", "Landroid/animation/TimeInterpolator;", "mass", "", "damping", "stiffness", "allowsOverdamping", "", "initialVelocity", "(FFFZF)V", "velocity", "getInterpolation", "t", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SpringInterpolator.kt */
public final class SpringInterpolator implements TimeInterpolator {
    private final boolean allowsOverdamping;
    private final float damping;
    private final float mass;
    private final float stiffness;
    private final float velocity;

    public SpringInterpolator() {
        this(0.0f, 0.0f, 0.0f, false, 0.0f, 31, (DefaultConstructorMarker) null);
    }

    public SpringInterpolator(float f, float f2, float f3, boolean z, float f4) {
        this.mass = f;
        this.damping = f2;
        this.stiffness = f3;
        this.allowsOverdamping = z;
        this.velocity = f4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SpringInterpolator(float r4, float r5, float r6, boolean r7, float r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            r4 = 1077936128(0x40400000, float:3.0)
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            r5 = 1140457472(0x43fa0000, float:500.0)
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            r6 = 1128792064(0x43480000, float:200.0)
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0019
            r7 = 0
        L_0x0019:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x001f
            r8 = 0
        L_0x001f:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.options.interpolators.SpringInterpolator.<init>(float, float, float, boolean, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public float getInterpolation(float f) {
        float f2;
        float exp;
        float f3 = this.damping;
        float f4 = this.mass;
        float f5 = this.stiffness;
        float f6 = this.velocity;
        float f7 = f3 / (((float) 2) * f4);
        float sqrt = (float) Math.sqrt((double) (f5 / f4));
        float f8 = sqrt * sqrt;
        float f9 = f7 * f7;
        float sqrt2 = (float) Math.sqrt((double) (f8 - f9));
        float sqrt3 = (float) Math.sqrt((double) (f9 - f8));
        if (!this.allowsOverdamping && f7 > sqrt) {
            f7 = sqrt;
        }
        boolean z = false;
        if (f == 1.0f) {
            return 1.0f;
        }
        int i = (f7 > sqrt ? 1 : (f7 == sqrt ? 0 : -1));
        if (i < 0) {
            f2 = (float) 1;
            float f10 = (float) -1;
            double d = (double) (f * sqrt2);
            exp = ((float) Math.exp((double) ((-f7) * f))) * ((((float) Math.cos(d)) * f10) + ((((f7 * f10) + f6) / sqrt2) * ((float) Math.sin(d))));
        } else {
            if (i == 0) {
                z = true;
            }
            if (z) {
                f2 = (float) 1;
                float f11 = (float) -1;
                exp = ((float) Math.exp((double) ((-f7) * f))) * (f11 + (((f7 * f11) + f6) * f));
            } else {
                float f12 = (float) -1;
                double d2 = (double) (f * sqrt3);
                return ((float) 1) + (((float) Math.exp((double) ((-f7) * f))) * ((((float) Math.cosh(d2)) * f12) + ((((f7 * f12) + f6) / sqrt3) * ((float) Math.sinh(d2)))));
            }
        }
        return f2 + exp;
    }
}
