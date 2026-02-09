package com.reactnativenavigation.options;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour;", "", "()V", "hasValue", "", "Companion", "Exit", "JumpToFirst", "PrevSelection", "Undefined", "Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour$Exit;", "Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour$JumpToFirst;", "Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour$PrevSelection;", "Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour$Undefined;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: HardwareBackButtonOptions.kt */
public abstract class HwBackBottomTabsBehaviour {
    private static final String BEHAVIOUR_EXIT = "exit";
    private static final String BEHAVIOUR_FIRST = "first";
    private static final String BEHAVIOUR_PREV = "previous";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public /* synthetic */ HwBackBottomTabsBehaviour(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean hasValue() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour$Undefined;", "Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour;", "()V", "hasValue", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: HardwareBackButtonOptions.kt */
    public static final class Undefined extends HwBackBottomTabsBehaviour {
        public static final Undefined INSTANCE = new Undefined();

        public boolean hasValue() {
            return false;
        }

        private Undefined() {
            super((DefaultConstructorMarker) null);
        }
    }

    private HwBackBottomTabsBehaviour() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour$Exit;", "Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour;", "()V", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: HardwareBackButtonOptions.kt */
    public static final class Exit extends HwBackBottomTabsBehaviour {
        public static final Exit INSTANCE = new Exit();

        private Exit() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour$PrevSelection;", "Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour;", "()V", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: HardwareBackButtonOptions.kt */
    public static final class PrevSelection extends HwBackBottomTabsBehaviour {
        public static final PrevSelection INSTANCE = new PrevSelection();

        private PrevSelection() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour$JumpToFirst;", "Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour;", "()V", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: HardwareBackButtonOptions.kt */
    public static final class JumpToFirst extends HwBackBottomTabsBehaviour {
        public static final JumpToFirst INSTANCE = new JumpToFirst();

        private JumpToFirst() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour$Companion;", "", "()V", "BEHAVIOUR_EXIT", "", "BEHAVIOUR_FIRST", "BEHAVIOUR_PREV", "fromString", "Lcom/reactnativenavigation/options/HwBackBottomTabsBehaviour;", "behaviour", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: HardwareBackButtonOptions.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HwBackBottomTabsBehaviour fromString(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1273775369) {
                    if (hashCode != 3127582) {
                        if (hashCode == 97440432 && str.equals(HwBackBottomTabsBehaviour.BEHAVIOUR_FIRST)) {
                            return JumpToFirst.INSTANCE;
                        }
                    } else if (str.equals(HwBackBottomTabsBehaviour.BEHAVIOUR_EXIT)) {
                        return Exit.INSTANCE;
                    }
                } else if (str.equals(HwBackBottomTabsBehaviour.BEHAVIOUR_PREV)) {
                    return PrevSelection.INSTANCE;
                }
            }
            return Undefined.INSTANCE;
        }
    }
}
