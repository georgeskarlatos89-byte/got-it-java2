package com.reactnativenavigation.options;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0000R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/reactnativenavigation/options/ElementTransitions;", "", "()V", "transitions", "Ljava/util/ArrayList;", "Lcom/reactnativenavigation/options/ElementTransitionOptions;", "Lkotlin/collections/ArrayList;", "getTransitions", "()Ljava/util/ArrayList;", "setTransitions", "(Ljava/util/ArrayList;)V", "hasValue", "", "mergeWith", "", "other", "mergeWithDefault", "defaultOptions", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ElementTransitions.kt */
public final class ElementTransitions {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private ArrayList<ElementTransitionOptions> transitions = new ArrayList<>();

    public final ArrayList<ElementTransitionOptions> getTransitions() {
        return this.transitions;
    }

    public final void setTransitions(ArrayList<ElementTransitionOptions> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.transitions = arrayList;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/reactnativenavigation/options/ElementTransitions$Companion;", "", "()V", "parse", "Lcom/reactnativenavigation/options/ElementTransitions;", "json", "Lorg/json/JSONObject;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ElementTransitions.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ElementTransitions parse(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ElementTransitions elementTransitions = new ElementTransitions();
            JSONArray optJSONArray = jSONObject.optJSONArray("elementTransitions");
            if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    ArrayList<ElementTransitionOptions> transitions = elementTransitions.getTransitions();
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "elementTransitions.getJSONObject(i)");
                    transitions.add(new ElementTransitionOptions(jSONObject2));
                }
            }
            return elementTransitions;
        }
    }

    public final void mergeWith(ElementTransitions elementTransitions) {
        Intrinsics.checkNotNullParameter(elementTransitions, "other");
        if (elementTransitions.hasValue()) {
            this.transitions = elementTransitions.transitions;
        }
    }

    public final void mergeWithDefault(ElementTransitions elementTransitions) {
        Intrinsics.checkNotNullParameter(elementTransitions, "defaultOptions");
        if (!hasValue()) {
            this.transitions = elementTransitions.transitions;
        }
    }

    public final boolean hasValue() {
        return !this.transitions.isEmpty();
    }
}
