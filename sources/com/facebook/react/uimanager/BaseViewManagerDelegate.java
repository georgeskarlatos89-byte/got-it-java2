package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerInterface;

public abstract class BaseViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T>> implements ViewManagerDelegate<T> {
    protected final U mViewManager;

    public void receiveCommand(T t, String str, ReadableArray readableArray) {
    }

    public BaseViewManagerDelegate(U u) {
        this.mViewManager = u;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProperty(T r5, java.lang.String r6, java.lang.Object r7) {
        /*
            r4 = this;
            r6.hashCode()
            int r0 = r6.hashCode()
            r1 = 0
            r2 = -1
            switch(r0) {
                case -1721943862: goto L_0x0181;
                case -1721943861: goto L_0x0176;
                case -1589741021: goto L_0x016b;
                case -1267206133: goto L_0x0160;
                case -1228066334: goto L_0x0155;
                case -908189618: goto L_0x014a;
                case -908189617: goto L_0x013f;
                case -877170387: goto L_0x0134;
                case -731417480: goto L_0x0126;
                case -101663499: goto L_0x0118;
                case -101359900: goto L_0x010a;
                case -80891667: goto L_0x00fc;
                case -40300674: goto L_0x00ee;
                case -4379043: goto L_0x00e0;
                case 36255470: goto L_0x00d2;
                case 333432965: goto L_0x00c4;
                case 581268560: goto L_0x00b6;
                case 588239831: goto L_0x00a8;
                case 746986311: goto L_0x009a;
                case 1052666732: goto L_0x008c;
                case 1146842694: goto L_0x007e;
                case 1153872867: goto L_0x0070;
                case 1287124693: goto L_0x0062;
                case 1349188574: goto L_0x0054;
                case 1505602511: goto L_0x0046;
                case 1761903244: goto L_0x0038;
                case 1865277756: goto L_0x002a;
                case 1993034687: goto L_0x001c;
                case 2045685618: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x018b
        L_0x000e:
            java.lang.String r0 = "nativeID"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0018
            goto L_0x018b
        L_0x0018:
            r2 = 28
            goto L_0x018b
        L_0x001c:
            java.lang.String r0 = "accessibilityCollectionItem"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0026
            goto L_0x018b
        L_0x0026:
            r2 = 27
            goto L_0x018b
        L_0x002a:
            java.lang.String r0 = "accessibilityLabelledBy"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0034
            goto L_0x018b
        L_0x0034:
            r2 = 26
            goto L_0x018b
        L_0x0038:
            java.lang.String r0 = "accessibilityCollection"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0042
            goto L_0x018b
        L_0x0042:
            r2 = 25
            goto L_0x018b
        L_0x0046:
            java.lang.String r0 = "accessibilityActions"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0050
            goto L_0x018b
        L_0x0050:
            r2 = 24
            goto L_0x018b
        L_0x0054:
            java.lang.String r0 = "borderRadius"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005e
            goto L_0x018b
        L_0x005e:
            r2 = 23
            goto L_0x018b
        L_0x0062:
            java.lang.String r0 = "backgroundColor"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x006c
            goto L_0x018b
        L_0x006c:
            r2 = 22
            goto L_0x018b
        L_0x0070:
            java.lang.String r0 = "accessibilityState"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x007a
            goto L_0x018b
        L_0x007a:
            r2 = 21
            goto L_0x018b
        L_0x007e:
            java.lang.String r0 = "accessibilityLabel"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0088
            goto L_0x018b
        L_0x0088:
            r2 = 20
            goto L_0x018b
        L_0x008c:
            java.lang.String r0 = "transform"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0096
            goto L_0x018b
        L_0x0096:
            r2 = 19
            goto L_0x018b
        L_0x009a:
            java.lang.String r0 = "importantForAccessibility"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00a4
            goto L_0x018b
        L_0x00a4:
            r2 = 18
            goto L_0x018b
        L_0x00a8:
            java.lang.String r0 = "borderBottomRightRadius"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00b2
            goto L_0x018b
        L_0x00b2:
            r2 = 17
            goto L_0x018b
        L_0x00b6:
            java.lang.String r0 = "borderBottomLeftRadius"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00c0
            goto L_0x018b
        L_0x00c0:
            r2 = 16
            goto L_0x018b
        L_0x00c4:
            java.lang.String r0 = "borderTopRightRadius"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00ce
            goto L_0x018b
        L_0x00ce:
            r2 = 15
            goto L_0x018b
        L_0x00d2:
            java.lang.String r0 = "accessibilityLiveRegion"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00dc
            goto L_0x018b
        L_0x00dc:
            r2 = 14
            goto L_0x018b
        L_0x00e0:
            java.lang.String r0 = "elevation"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00ea
            goto L_0x018b
        L_0x00ea:
            r2 = 13
            goto L_0x018b
        L_0x00ee:
            java.lang.String r0 = "rotation"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00f8
            goto L_0x018b
        L_0x00f8:
            r2 = 12
            goto L_0x018b
        L_0x00fc:
            java.lang.String r0 = "renderToHardwareTextureAndroid"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0106
            goto L_0x018b
        L_0x0106:
            r2 = 11
            goto L_0x018b
        L_0x010a:
            java.lang.String r0 = "accessibilityRole"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0114
            goto L_0x018b
        L_0x0114:
            r2 = 10
            goto L_0x018b
        L_0x0118:
            java.lang.String r0 = "accessibilityHint"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0122
            goto L_0x018b
        L_0x0122:
            r2 = 9
            goto L_0x018b
        L_0x0126:
            java.lang.String r0 = "zIndex"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0130
            goto L_0x018b
        L_0x0130:
            r2 = 8
            goto L_0x018b
        L_0x0134:
            java.lang.String r0 = "testID"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x013d
            goto L_0x018b
        L_0x013d:
            r2 = 7
            goto L_0x018b
        L_0x013f:
            java.lang.String r0 = "scaleY"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0148
            goto L_0x018b
        L_0x0148:
            r2 = 6
            goto L_0x018b
        L_0x014a:
            java.lang.String r0 = "scaleX"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0153
            goto L_0x018b
        L_0x0153:
            r2 = 5
            goto L_0x018b
        L_0x0155:
            java.lang.String r0 = "borderTopLeftRadius"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x015e
            goto L_0x018b
        L_0x015e:
            r2 = 4
            goto L_0x018b
        L_0x0160:
            java.lang.String r0 = "opacity"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0169
            goto L_0x018b
        L_0x0169:
            r2 = 3
            goto L_0x018b
        L_0x016b:
            java.lang.String r0 = "shadowColor"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0174
            goto L_0x018b
        L_0x0174:
            r2 = 2
            goto L_0x018b
        L_0x0176:
            java.lang.String r0 = "translateY"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x017f
            goto L_0x018b
        L_0x017f:
            r2 = 1
            goto L_0x018b
        L_0x0181:
            java.lang.String r0 = "translateX"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x018a
            goto L_0x018b
        L_0x018a:
            r2 = r1
        L_0x018b:
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            r3 = 2143289344(0x7fc00000, float:NaN)
            switch(r2) {
                case 0: goto L_0x0303;
                case 1: goto L_0x02f4;
                case 2: goto L_0x02df;
                case 3: goto L_0x02d0;
                case 4: goto L_0x02c1;
                case 5: goto L_0x02b2;
                case 6: goto L_0x02a3;
                case 7: goto L_0x029a;
                case 8: goto L_0x028a;
                case 9: goto L_0x0281;
                case 10: goto L_0x0278;
                case 11: goto L_0x0268;
                case 12: goto L_0x0258;
                case 13: goto L_0x0248;
                case 14: goto L_0x023f;
                case 15: goto L_0x022f;
                case 16: goto L_0x021f;
                case 17: goto L_0x020f;
                case 18: goto L_0x0206;
                case 19: goto L_0x01fd;
                case 20: goto L_0x01f4;
                case 21: goto L_0x01eb;
                case 22: goto L_0x01d5;
                case 23: goto L_0x01c5;
                case 24: goto L_0x01bc;
                case 25: goto L_0x01b3;
                case 26: goto L_0x01a7;
                case 27: goto L_0x019e;
                case 28: goto L_0x0195;
                default: goto L_0x0193;
            }
        L_0x0193:
            goto L_0x0311
        L_0x0195:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setNativeId(r5, r7)
            goto L_0x0311
        L_0x019e:
            U r6 = r4.mViewManager
            com.facebook.react.bridge.ReadableMap r7 = (com.facebook.react.bridge.ReadableMap) r7
            r6.setAccessibilityCollectionItem(r5, r7)
            goto L_0x0311
        L_0x01a7:
            com.facebook.react.bridge.DynamicFromObject r6 = new com.facebook.react.bridge.DynamicFromObject
            r6.<init>(r7)
            U r7 = r4.mViewManager
            r7.setAccessibilityLabelledBy(r5, r6)
            goto L_0x0311
        L_0x01b3:
            U r6 = r4.mViewManager
            com.facebook.react.bridge.ReadableMap r7 = (com.facebook.react.bridge.ReadableMap) r7
            r6.setAccessibilityCollection(r5, r7)
            goto L_0x0311
        L_0x01bc:
            U r6 = r4.mViewManager
            com.facebook.react.bridge.ReadableArray r7 = (com.facebook.react.bridge.ReadableArray) r7
            r6.setAccessibilityActions(r5, r7)
            goto L_0x0311
        L_0x01c5:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x01ca
            goto L_0x01d0
        L_0x01ca:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x01d0:
            r6.setBorderRadius(r5, r3)
            goto L_0x0311
        L_0x01d5:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x01da
            goto L_0x01e6
        L_0x01da:
            android.content.Context r0 = r5.getContext()
            java.lang.Integer r7 = com.facebook.react.bridge.ColorPropConverter.getColor(r7, r0)
            int r1 = r7.intValue()
        L_0x01e6:
            r6.setBackgroundColor(r5, r1)
            goto L_0x0311
        L_0x01eb:
            U r6 = r4.mViewManager
            com.facebook.react.bridge.ReadableMap r7 = (com.facebook.react.bridge.ReadableMap) r7
            r6.setViewState(r5, r7)
            goto L_0x0311
        L_0x01f4:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setAccessibilityLabel(r5, r7)
            goto L_0x0311
        L_0x01fd:
            U r6 = r4.mViewManager
            com.facebook.react.bridge.ReadableArray r7 = (com.facebook.react.bridge.ReadableArray) r7
            r6.setTransform(r5, r7)
            goto L_0x0311
        L_0x0206:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setImportantForAccessibility(r5, r7)
            goto L_0x0311
        L_0x020f:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x0214
            goto L_0x021a
        L_0x0214:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x021a:
            r6.setBorderBottomRightRadius(r5, r3)
            goto L_0x0311
        L_0x021f:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x0224
            goto L_0x022a
        L_0x0224:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x022a:
            r6.setBorderBottomLeftRadius(r5, r3)
            goto L_0x0311
        L_0x022f:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x0234
            goto L_0x023a
        L_0x0234:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x023a:
            r6.setBorderTopRightRadius(r5, r3)
            goto L_0x0311
        L_0x023f:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setAccessibilityLiveRegion(r5, r7)
            goto L_0x0311
        L_0x0248:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x024d
            goto L_0x0253
        L_0x024d:
            java.lang.Double r7 = (java.lang.Double) r7
            float r0 = r7.floatValue()
        L_0x0253:
            r6.setElevation(r5, r0)
            goto L_0x0311
        L_0x0258:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x025d
            goto L_0x0263
        L_0x025d:
            java.lang.Double r7 = (java.lang.Double) r7
            float r0 = r7.floatValue()
        L_0x0263:
            r6.setRotation(r5, r0)
            goto L_0x0311
        L_0x0268:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x026d
            goto L_0x0273
        L_0x026d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r1 = r7.booleanValue()
        L_0x0273:
            r6.setRenderToHardwareTexture(r5, r1)
            goto L_0x0311
        L_0x0278:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setAccessibilityRole(r5, r7)
            goto L_0x0311
        L_0x0281:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setAccessibilityHint(r5, r7)
            goto L_0x0311
        L_0x028a:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x028f
            goto L_0x0295
        L_0x028f:
            java.lang.Double r7 = (java.lang.Double) r7
            float r0 = r7.floatValue()
        L_0x0295:
            r6.setZIndex(r5, r0)
            goto L_0x0311
        L_0x029a:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setTestId(r5, r7)
            goto L_0x0311
        L_0x02a3:
            U r0 = r4.mViewManager
            if (r7 != 0) goto L_0x02a8
            goto L_0x02ae
        L_0x02a8:
            java.lang.Double r7 = (java.lang.Double) r7
            float r6 = r7.floatValue()
        L_0x02ae:
            r0.setScaleY(r5, r6)
            goto L_0x0311
        L_0x02b2:
            U r0 = r4.mViewManager
            if (r7 != 0) goto L_0x02b7
            goto L_0x02bd
        L_0x02b7:
            java.lang.Double r7 = (java.lang.Double) r7
            float r6 = r7.floatValue()
        L_0x02bd:
            r0.setScaleX(r5, r6)
            goto L_0x0311
        L_0x02c1:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x02c6
            goto L_0x02cc
        L_0x02c6:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x02cc:
            r6.setBorderTopLeftRadius(r5, r3)
            goto L_0x0311
        L_0x02d0:
            U r0 = r4.mViewManager
            if (r7 != 0) goto L_0x02d5
            goto L_0x02db
        L_0x02d5:
            java.lang.Double r7 = (java.lang.Double) r7
            float r6 = r7.floatValue()
        L_0x02db:
            r0.setOpacity(r5, r6)
            goto L_0x0311
        L_0x02df:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x02e4
            goto L_0x02f0
        L_0x02e4:
            android.content.Context r0 = r5.getContext()
            java.lang.Integer r7 = com.facebook.react.bridge.ColorPropConverter.getColor(r7, r0)
            int r1 = r7.intValue()
        L_0x02f0:
            r6.setShadowColor(r5, r1)
            goto L_0x0311
        L_0x02f4:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x02f9
            goto L_0x02ff
        L_0x02f9:
            java.lang.Double r7 = (java.lang.Double) r7
            float r0 = r7.floatValue()
        L_0x02ff:
            r6.setTranslateY(r5, r0)
            goto L_0x0311
        L_0x0303:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x0308
            goto L_0x030e
        L_0x0308:
            java.lang.Double r7 = (java.lang.Double) r7
            float r0 = r7.floatValue()
        L_0x030e:
            r6.setTranslateX(r5, r0)
        L_0x0311:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.BaseViewManagerDelegate.setProperty(android.view.View, java.lang.String, java.lang.Object):void");
    }
}
