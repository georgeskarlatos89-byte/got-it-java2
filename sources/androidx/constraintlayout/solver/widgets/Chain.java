package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import java.util.ArrayList;

public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i3 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i2 = 0;
        } else {
            i3 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i2 = 2;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            if (arrayList == null || (arrayList != null && arrayList.contains(chainHead.mFirst))) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: androidx.constraintlayout.solver.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: androidx.constraintlayout.solver.widgets.ConstraintWidget} */
    /* JADX WARNING: type inference failed for: r4v11, types: [androidx.constraintlayout.solver.SolverVariable] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.mHorizontalChainStyle == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.mVerticalChainStyle == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x03c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r35, androidx.constraintlayout.solver.LinearSystem r36, int r37, int r38, androidx.constraintlayout.solver.widgets.ChainHead r39) {
        /*
            r0 = r35
            r9 = r36
            r1 = r39
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r1.mFirst
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r1.mLast
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r1.mFirstVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r1.mLastVisibleWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.mHead
            float r3 = r1.mTotalWeight
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r1.mFirstMatchConstraintWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r1.mLastMatchConstraintWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r4 = r4[r37]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6 = 1
            if (r4 != r5) goto L_0x0021
            r4 = r6
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r37 != 0) goto L_0x0038
            int r8 = r2.mHorizontalChainStyle
            if (r8 != 0) goto L_0x002b
            r8 = r6
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.mHorizontalChainStyle
            if (r14 != r6) goto L_0x0032
            r14 = r6
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.mHorizontalChainStyle
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.mVerticalChainStyle
            if (r8 != 0) goto L_0x003e
            r8 = r6
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.mVerticalChainStyle
            if (r14 != r6) goto L_0x0045
            r14 = r6
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.mVerticalChainStyle
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = r6
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r6 = r10
            r15 = r14
            r14 = r8
            r8 = 0
        L_0x0051:
            r21 = 0
            if (r8 != 0) goto L_0x013b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r6.mListAnchors
            r7 = r7[r38]
            if (r5 == 0) goto L_0x005e
            r19 = 1
            goto L_0x0060
        L_0x005e:
            r19 = 4
        L_0x0060:
            int r22 = r7.getMargin()
            r23 = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r6.mListDimensionBehaviors
            r3 = r3[r37]
            r24 = r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x0078
            int[] r3 = r6.mResolvedMatchConstraintDefault
            r3 = r3[r37]
            if (r3 != 0) goto L_0x0078
            r3 = 1
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r7.mTarget
            if (r8 == 0) goto L_0x0087
            if (r6 == r10) goto L_0x0087
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r7.mTarget
            int r8 = r8.getMargin()
            int r22 = r22 + r8
        L_0x0087:
            r8 = r22
            if (r5 == 0) goto L_0x0094
            if (r6 == r10) goto L_0x0094
            if (r6 == r12) goto L_0x0094
            r22 = r15
            r19 = 8
            goto L_0x0096
        L_0x0094:
            r22 = r15
        L_0x0096:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r7.mTarget
            if (r15 == 0) goto L_0x00cc
            if (r6 != r12) goto L_0x00ab
            androidx.constraintlayout.solver.SolverVariable r15 = r7.mSolverVariable
            r25 = r14
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r7.mTarget
            androidx.constraintlayout.solver.SolverVariable r14 = r14.mSolverVariable
            r26 = r2
            r2 = 6
            r9.addGreaterThan(r15, r14, r8, r2)
            goto L_0x00ba
        L_0x00ab:
            r26 = r2
            r25 = r14
            androidx.constraintlayout.solver.SolverVariable r2 = r7.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r7.mTarget
            androidx.constraintlayout.solver.SolverVariable r14 = r14.mSolverVariable
            r15 = 8
            r9.addGreaterThan(r2, r14, r8, r15)
        L_0x00ba:
            if (r3 == 0) goto L_0x00c0
            if (r5 != 0) goto L_0x00c0
            r2 = 5
            goto L_0x00c2
        L_0x00c0:
            r2 = r19
        L_0x00c2:
            androidx.constraintlayout.solver.SolverVariable r3 = r7.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.mTarget
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
            r9.addEquality(r3, r7, r8, r2)
            goto L_0x00d0
        L_0x00cc:
            r26 = r2
            r25 = r14
        L_0x00d0:
            if (r4 == 0) goto L_0x0108
            int r2 = r6.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x00f6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r6.mListDimensionBehaviors
            r2 = r2[r37]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00f6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r6.mListAnchors
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r6.mListAnchors
            r3 = r3[r38]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r7 = 5
            r8 = 0
            r9.addGreaterThan(r2, r3, r8, r7)
            goto L_0x00f7
        L_0x00f6:
            r8 = 0
        L_0x00f7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r6.mListAnchors
            r2 = r2[r38]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r0.mListAnchors
            r3 = r3[r38]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            r7 = 8
            r9.addGreaterThan(r2, r3, r8, r7)
        L_0x0108:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r6.mListAnchors
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x0129
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.mOwner
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r2.mListAnchors
            r3 = r3[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x0129
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r2.mListAnchors
            r3 = r3[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.mOwner
            if (r3 == r6) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r21 = r2
        L_0x0129:
            if (r21 == 0) goto L_0x0130
            r6 = r21
            r8 = r24
            goto L_0x0131
        L_0x0130:
            r8 = 1
        L_0x0131:
            r15 = r22
            r3 = r23
            r14 = r25
            r2 = r26
            goto L_0x0051
        L_0x013b:
            r26 = r2
            r23 = r3
            r25 = r14
            r22 = r15
            if (r13 == 0) goto L_0x01aa
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x01aa
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r13.mListAnchors
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r13.mListDimensionBehaviors
            r6 = r6[r37]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0163
            int[] r6 = r13.mResolvedMatchConstraintDefault
            r6 = r6[r37]
            if (r6 != 0) goto L_0x0163
            r6 = 1
            goto L_0x0164
        L_0x0163:
            r6 = 0
        L_0x0164:
            if (r6 == 0) goto L_0x017e
            if (r5 != 0) goto L_0x017e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r2.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.mOwner
            if (r6 != r0) goto L_0x017e
            androidx.constraintlayout.solver.SolverVariable r6 = r2.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.mTarget
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
            int r8 = r2.getMargin()
            int r8 = -r8
            r14 = 5
            r9.addEquality(r6, r7, r8, r14)
            goto L_0x0196
        L_0x017e:
            r14 = 5
            if (r5 == 0) goto L_0x0196
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r2.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.mOwner
            if (r6 != r0) goto L_0x0196
            androidx.constraintlayout.solver.SolverVariable r6 = r2.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r2.mTarget
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
            int r8 = r2.getMargin()
            int r8 = -r8
            r15 = 4
            r9.addEquality(r6, r7, r8, r15)
        L_0x0196:
            androidx.constraintlayout.solver.SolverVariable r6 = r2.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r11.mListAnchors
            r3 = r7[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            int r2 = r2.getMargin()
            int r2 = -r2
            r7 = 6
            r9.addLowerThan(r6, r3, r2, r7)
            goto L_0x01ab
        L_0x01aa:
            r14 = 5
        L_0x01ab:
            if (r4 == 0) goto L_0x01c8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            int r2 = r38 + 1
            r0 = r0[r2]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r11.mListAnchors
            r3 = r3[r2]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r11.mListAnchors
            r2 = r4[r2]
            int r2 = r2.getMargin()
            r4 = 8
            r9.addGreaterThan(r0, r3, r2, r4)
        L_0x01c8:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r1.mWeightedMatchConstraintsWidgets
            if (r0 == 0) goto L_0x027f
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x027f
            boolean r4 = r1.mHasUndefinedWeights
            if (r4 == 0) goto L_0x01df
            boolean r4 = r1.mHasComplexMatchWeights
            if (r4 != 0) goto L_0x01df
            int r4 = r1.mWidgetsMatchCount
            float r4 = (float) r4
            goto L_0x01e1
        L_0x01df:
            r4 = r23
        L_0x01e1:
            r6 = 0
            r28 = r6
            r7 = r21
            r8 = 0
        L_0x01e7:
            if (r8 >= r2) goto L_0x027f
            java.lang.Object r15 = r0.get(r8)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            float[] r3 = r15.mWeight
            r3 = r3[r37]
            int r18 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r18 >= 0) goto L_0x0215
            boolean r3 = r1.mHasComplexMatchWeights
            if (r3 == 0) goto L_0x0210
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r18 = r38 + 1
            r3 = r3[r18]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r15 = r15.mListAnchors
            r15 = r15[r38]
            androidx.constraintlayout.solver.SolverVariable r15 = r15.mSolverVariable
            r6 = 0
            r14 = 4
            r9.addEquality(r3, r15, r6, r14)
            r14 = r6
            goto L_0x022e
        L_0x0210:
            r14 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            goto L_0x0216
        L_0x0215:
            r14 = 4
        L_0x0216:
            int r18 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r18 != 0) goto L_0x0233
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r18 = r38 + 1
            r3 = r3[r18]
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r15 = r15.mListAnchors
            r15 = r15[r38]
            androidx.constraintlayout.solver.SolverVariable r15 = r15.mSolverVariable
            r6 = 8
            r14 = 0
            r9.addEquality(r3, r15, r14, r6)
        L_0x022e:
            r23 = r0
            r17 = r2
            goto L_0x0274
        L_0x0233:
            r14 = 0
            if (r7 == 0) goto L_0x026d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r6 = r7.mListAnchors
            r6 = r6[r38]
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r7.mListAnchors
            int r17 = r38 + 1
            r7 = r7[r17]
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r14 = r15.mListAnchors
            r14 = r14[r38]
            androidx.constraintlayout.solver.SolverVariable r14 = r14.mSolverVariable
            r23 = r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r15.mListAnchors
            r0 = r0[r17]
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            r17 = r2
            androidx.constraintlayout.solver.ArrayRow r2 = r36.createRow()
            r27 = r2
            r29 = r4
            r30 = r3
            r31 = r6
            r32 = r7
            r33 = r14
            r34 = r0
            r27.createRowEqualMatchDimensions(r28, r29, r30, r31, r32, r33, r34)
            r9.addConstraint(r2)
            goto L_0x0271
        L_0x026d:
            r23 = r0
            r17 = r2
        L_0x0271:
            r28 = r3
            r7 = r15
        L_0x0274:
            int r8 = r8 + 1
            r2 = r17
            r0 = r23
            r3 = 1
            r6 = 0
            r14 = 5
            goto L_0x01e7
        L_0x027f:
            if (r12 == 0) goto L_0x02d8
            if (r12 == r13) goto L_0x0285
            if (r5 == 0) goto L_0x02d8
        L_0x0285:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r10.mListAnchors
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r11.mListAnchors
            int r2 = r38 + 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mTarget
            if (r3 == 0) goto L_0x0299
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            r3 = r0
            goto L_0x029b
        L_0x0299:
            r3 = r21
        L_0x029b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mTarget
            if (r0 == 0) goto L_0x02a5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mTarget
            androidx.constraintlayout.solver.SolverVariable r0 = r0.mSolverVariable
            r5 = r0
            goto L_0x02a7
        L_0x02a5:
            r5 = r21
        L_0x02a7:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            r1 = r1[r2]
            if (r3 == 0) goto L_0x04fc
            if (r5 == 0) goto L_0x04fc
            if (r37 != 0) goto L_0x02ba
            r2 = r26
            float r2 = r2.mHorizontalBiasPercent
            goto L_0x02be
        L_0x02ba:
            r2 = r26
            float r2 = r2.mVerticalBiasPercent
        L_0x02be:
            r4 = r2
            int r6 = r0.getMargin()
            int r7 = r1.getMargin()
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r8 = r1.mSolverVariable
            r10 = 7
            r0 = r36
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04fc
        L_0x02d8:
            if (r25 == 0) goto L_0x03c9
            if (r12 == 0) goto L_0x03c9
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L_0x02e9
            int r0 = r1.mWidgetsCount
            int r1 = r1.mWidgetsMatchCount
            if (r0 != r1) goto L_0x02e9
            r16 = 1
            goto L_0x02eb
        L_0x02e9:
            r16 = 0
        L_0x02eb:
            r14 = r12
            r15 = r14
        L_0x02ed:
            if (r14 == 0) goto L_0x04fc
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r14.mNextChainWidget
            r0 = r0[r37]
            r8 = r0
        L_0x02f4:
            if (r8 == 0) goto L_0x0303
            int r0 = r8.getVisibility()
            r7 = 8
            if (r0 != r7) goto L_0x0305
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r8.mNextChainWidget
            r8 = r0[r37]
            goto L_0x02f4
        L_0x0303:
            r7 = 8
        L_0x0305:
            if (r8 != 0) goto L_0x030e
            if (r14 != r13) goto L_0x030a
            goto L_0x030e
        L_0x030a:
            r17 = r8
            goto L_0x03bc
        L_0x030e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r38]
            androidx.constraintlayout.solver.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L_0x031d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTarget
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            goto L_0x031f
        L_0x031d:
            r2 = r21
        L_0x031f:
            if (r15 == r14) goto L_0x032a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r15.mListAnchors
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            goto L_0x0341
        L_0x032a:
            if (r14 != r12) goto L_0x0341
            if (r15 != r14) goto L_0x0341
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r10.mListAnchors
            r2 = r2[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x033f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r10.mListAnchors
            r2 = r2[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            goto L_0x0341
        L_0x033f:
            r2 = r21
        L_0x0341:
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r14.mListAnchors
            int r4 = r38 + 1
            r3 = r3[r4]
            int r3 = r3.getMargin()
            if (r8 == 0) goto L_0x035e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r8.mListAnchors
            r5 = r5[r38]
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r14.mListAnchors
            r7 = r7[r4]
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
            goto L_0x0371
        L_0x035e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r11.mListAnchors
            r5 = r5[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L_0x0369
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            goto L_0x036b
        L_0x0369:
            r6 = r21
        L_0x036b:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r14.mListAnchors
            r7 = r7[r4]
            androidx.constraintlayout.solver.SolverVariable r7 = r7.mSolverVariable
        L_0x0371:
            if (r5 == 0) goto L_0x0378
            int r5 = r5.getMargin()
            int r3 = r3 + r5
        L_0x0378:
            if (r15 == 0) goto L_0x0383
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r15.mListAnchors
            r5 = r5[r4]
            int r5 = r5.getMargin()
            int r0 = r0 + r5
        L_0x0383:
            if (r1 == 0) goto L_0x030a
            if (r2 == 0) goto L_0x030a
            if (r6 == 0) goto L_0x030a
            if (r7 == 0) goto L_0x030a
            if (r14 != r12) goto L_0x0395
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r38]
            int r0 = r0.getMargin()
        L_0x0395:
            r5 = r0
            if (r14 != r13) goto L_0x03a3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r4]
            int r0 = r0.getMargin()
            r17 = r0
            goto L_0x03a5
        L_0x03a3:
            r17 = r3
        L_0x03a5:
            if (r16 == 0) goto L_0x03aa
            r18 = 8
            goto L_0x03ac
        L_0x03aa:
            r18 = 5
        L_0x03ac:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r36
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r18
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x03bc:
            int r0 = r14.getVisibility()
            r8 = 8
            if (r0 == r8) goto L_0x03c5
            r15 = r14
        L_0x03c5:
            r14 = r17
            goto L_0x02ed
        L_0x03c9:
            r8 = 8
            if (r22 == 0) goto L_0x04fc
            if (r12 == 0) goto L_0x04fc
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L_0x03dc
            int r0 = r1.mWidgetsCount
            int r1 = r1.mWidgetsMatchCount
            if (r0 != r1) goto L_0x03dc
            r16 = 1
            goto L_0x03de
        L_0x03dc:
            r16 = 0
        L_0x03de:
            r14 = r12
            r15 = r14
        L_0x03e0:
            if (r14 == 0) goto L_0x049e
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r14.mNextChainWidget
            r0 = r0[r37]
        L_0x03e6:
            if (r0 == 0) goto L_0x03f3
            int r1 = r0.getVisibility()
            if (r1 != r8) goto L_0x03f3
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r0 = r0.mNextChainWidget
            r0 = r0[r37]
            goto L_0x03e6
        L_0x03f3:
            if (r14 == r12) goto L_0x048b
            if (r14 == r13) goto L_0x048b
            if (r0 == 0) goto L_0x048b
            if (r0 != r13) goto L_0x03fe
            r7 = r21
            goto L_0x03ff
        L_0x03fe:
            r7 = r0
        L_0x03ff:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r38]
            androidx.constraintlayout.solver.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L_0x040d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.mTarget
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
        L_0x040d:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r15.mListAnchors
            int r3 = r38 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.SolverVariable r2 = r2.mSolverVariable
            int r0 = r0.getMargin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r14.mListAnchors
            r4 = r4[r3]
            int r4 = r4.getMargin()
            if (r7 == 0) goto L_0x0435
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r7.mListAnchors
            r5 = r5[r38]
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.mTarget
            if (r8 == 0) goto L_0x0432
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r5.mTarget
            androidx.constraintlayout.solver.SolverVariable r8 = r8.mSolverVariable
            goto L_0x0446
        L_0x0432:
            r8 = r21
            goto L_0x0446
        L_0x0435:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r5 = r13.mListAnchors
            r5 = r5[r38]
            if (r5 == 0) goto L_0x043e
            androidx.constraintlayout.solver.SolverVariable r6 = r5.mSolverVariable
            goto L_0x0440
        L_0x043e:
            r6 = r21
        L_0x0440:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r8 = r14.mListAnchors
            r8 = r8[r3]
            androidx.constraintlayout.solver.SolverVariable r8 = r8.mSolverVariable
        L_0x0446:
            if (r5 == 0) goto L_0x044d
            int r5 = r5.getMargin()
            int r4 = r4 + r5
        L_0x044d:
            r17 = r4
            if (r15 == 0) goto L_0x045a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r15.mListAnchors
            r3 = r4[r3]
            int r3 = r3.getMargin()
            int r0 = r0 + r3
        L_0x045a:
            r3 = r0
            if (r16 == 0) goto L_0x0460
            r18 = 8
            goto L_0x0462
        L_0x0460:
            r18 = 4
        L_0x0462:
            if (r1 == 0) goto L_0x0480
            if (r2 == 0) goto L_0x0480
            if (r6 == 0) goto L_0x0480
            if (r8 == 0) goto L_0x0480
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r36
            r5 = r6
            r6 = r8
            r19 = r7
            r20 = 4
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r18
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0488
        L_0x0480:
            r19 = r7
            r17 = r15
            r15 = 8
            r20 = 4
        L_0x0488:
            r0 = r19
            goto L_0x0490
        L_0x048b:
            r17 = r15
            r20 = 4
            r15 = r8
        L_0x0490:
            int r1 = r14.getVisibility()
            if (r1 == r15) goto L_0x0497
            goto L_0x0499
        L_0x0497:
            r14 = r17
        L_0x0499:
            r8 = r15
            r15 = r14
            r14 = r0
            goto L_0x03e0
        L_0x049e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r10.mListAnchors
            r1 = r1[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r13.mListAnchors
            int r3 = r38 + 1
            r10 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r2.mTarget
            if (r1 == 0) goto L_0x04eb
            if (r12 == r13) goto L_0x04c5
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r1 = r1.mSolverVariable
            int r0 = r0.getMargin()
            r15 = 5
            r9.addEquality(r2, r1, r0, r15)
            goto L_0x04ec
        L_0x04c5:
            r15 = 5
            if (r14 == 0) goto L_0x04ec
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r3 = r1.mSolverVariable
            int r4 = r0.getMargin()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.solver.SolverVariable r6 = r10.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r7 = r14.mSolverVariable
            int r8 = r10.getMargin()
            r16 = 5
            r0 = r36
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04ec
        L_0x04eb:
            r15 = 5
        L_0x04ec:
            if (r14 == 0) goto L_0x04fc
            if (r12 == r13) goto L_0x04fc
            androidx.constraintlayout.solver.SolverVariable r0 = r10.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r1 = r14.mSolverVariable
            int r2 = r10.getMargin()
            int r2 = -r2
            r9.addEquality(r0, r1, r2, r15)
        L_0x04fc:
            if (r25 != 0) goto L_0x0500
            if (r22 == 0) goto L_0x0567
        L_0x0500:
            if (r12 == 0) goto L_0x0567
            if (r12 == r13) goto L_0x0567
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            int r2 = r38 + 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mTarget
            if (r3 == 0) goto L_0x0517
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.mTarget
            androidx.constraintlayout.solver.SolverVariable r3 = r3.mSolverVariable
            goto L_0x0519
        L_0x0517:
            r3 = r21
        L_0x0519:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L_0x0522
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r1.mTarget
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            goto L_0x0524
        L_0x0522:
            r4 = r21
        L_0x0524:
            if (r11 == r13) goto L_0x0537
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r11.mListAnchors
            r4 = r4[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r4.mTarget
            if (r5 == 0) goto L_0x0534
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            androidx.constraintlayout.solver.SolverVariable r4 = r4.mSolverVariable
            r21 = r4
        L_0x0534:
            r5 = r21
            goto L_0x0538
        L_0x0537:
            r5 = r4
        L_0x0538:
            if (r12 != r13) goto L_0x0542
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r12.mListAnchors
            r0 = r0[r38]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r12.mListAnchors
            r1 = r1[r2]
        L_0x0542:
            if (r3 == 0) goto L_0x0567
            if (r5 == 0) goto L_0x0567
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.getMargin()
            if (r13 != 0) goto L_0x054f
            goto L_0x0550
        L_0x054f:
            r11 = r13
        L_0x0550:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r7 = r11.mListAnchors
            r2 = r7[r2]
            int r7 = r2.getMargin()
            androidx.constraintlayout.solver.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.solver.SolverVariable r8 = r1.mSolverVariable
            r10 = 5
            r0 = r36
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0567:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):void");
    }
}
