package com.reactnativenavigation.options.parsers;

public class InterpolationParser {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.TimeInterpolator parse(org.json.JSONObject r10) {
        /*
            java.lang.String r0 = "interpolation"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            java.lang.String r0 = "linear"
            if (r10 != 0) goto L_0x000c
            r1 = r0
            goto L_0x0012
        L_0x000c:
            java.lang.String r1 = "type"
            java.lang.String r1 = r10.optString(r1, r0)
        L_0x0012:
            int r2 = r1.hashCode()
            r3 = 0
            switch(r2) {
                case -1354466595: goto L_0x005f;
                case -1263948740: goto L_0x0055;
                case -1102672091: goto L_0x004d;
                case -895679987: goto L_0x0043;
                case -749065269: goto L_0x0039;
                case 475910905: goto L_0x002f;
                case 1303039736: goto L_0x0025;
                case 1764943929: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0069
        L_0x001b:
            java.lang.String r0 = "decelerateAccelerate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 3
            goto L_0x006a
        L_0x0025:
            java.lang.String r0 = "fastOutSlowIn"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 4
            goto L_0x006a
        L_0x002f:
            java.lang.String r0 = "accelerateDecelerate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 1
            goto L_0x006a
        L_0x0039:
            java.lang.String r0 = "overshoot"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 5
            goto L_0x006a
        L_0x0043:
            java.lang.String r0 = "spring"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 6
            goto L_0x006a
        L_0x004d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 7
            goto L_0x006a
        L_0x0055:
            java.lang.String r0 = "decelerate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = r3
            goto L_0x006a
        L_0x005f:
            java.lang.String r0 = "accelerate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            r0 = 2
            goto L_0x006a
        L_0x0069:
            r0 = -1
        L_0x006a:
            java.lang.String r1 = "factor"
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            switch(r0) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00cf;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00be;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00ab;
                case 6: goto L_0x0077;
                default: goto L_0x0071;
            }
        L_0x0071:
            android.view.animation.LinearInterpolator r10 = new android.view.animation.LinearInterpolator
            r10.<init>()
            return r10
        L_0x0077:
            java.lang.String r0 = "mass"
            r1 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = r10.optDouble(r0, r1)
            float r5 = (float) r0
            java.lang.String r0 = "damping"
            r1 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r0 = r10.optDouble(r0, r1)
            float r6 = (float) r0
            java.lang.String r0 = "stiffness"
            r1 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r0 = r10.optDouble(r0, r1)
            float r7 = (float) r0
            java.lang.String r0 = "allowsOverdamping"
            boolean r8 = r10.optBoolean(r0, r3)
            java.lang.String r0 = "initialVelocity"
            r1 = 0
            double r0 = r10.optDouble(r0, r1)
            float r9 = (float) r0
            com.reactnativenavigation.options.interpolators.SpringInterpolator r10 = new com.reactnativenavigation.options.interpolators.SpringInterpolator
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            return r10
        L_0x00ab:
            java.lang.String r0 = "tension"
            double r0 = r10.optDouble(r0, r4)
            android.view.animation.OvershootInterpolator r10 = new android.view.animation.OvershootInterpolator
            float r0 = (float) r0
            r10.<init>(r0)
            return r10
        L_0x00b8:
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r10 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r10.<init>()
            return r10
        L_0x00be:
            com.reactnativenavigation.options.interpolators.DecelerateAccelerateInterpolator r10 = new com.reactnativenavigation.options.interpolators.DecelerateAccelerateInterpolator
            r10.<init>()
            return r10
        L_0x00c4:
            double r0 = r10.optDouble(r1, r4)
            float r10 = (float) r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r10)
            return r0
        L_0x00cf:
            android.view.animation.AccelerateDecelerateInterpolator r10 = new android.view.animation.AccelerateDecelerateInterpolator
            r10.<init>()
            return r10
        L_0x00d5:
            double r0 = r10.optDouble(r1, r4)
            float r10 = (float) r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.options.parsers.InterpolationParser.parse(org.json.JSONObject):android.animation.TimeInterpolator");
    }
}
