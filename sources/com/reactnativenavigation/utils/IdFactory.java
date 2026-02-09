package com.reactnativenavigation.utils;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/reactnativenavigation/utils/IdFactory;", "", "()V", "Companion", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: IdFactory.kt */
public final class IdFactory {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int count;
    /* access modifiers changed from: private */
    public static final HashMap<String, Integer> stringIdToIntId = new HashMap<>();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/reactnativenavigation/utils/IdFactory$Companion;", "", "()V", "count", "", "stringIdToIntId", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "get", "id", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: IdFactory.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int get(String str) {
            Intrinsics.checkNotNullParameter(str, "id");
            if (IdFactory.stringIdToIntId.containsKey(str)) {
                Object obj = IdFactory.stringIdToIntId.get(str);
                Intrinsics.checkNotNull(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "{\n                string…IntId[id]!!\n            }");
                return ((Number) obj).intValue();
            }
            IdFactory.count = IdFactory.count + 1;
            int access$getCount$cp = IdFactory.count;
            IdFactory.stringIdToIntId.put(str, Integer.valueOf(IdFactory.count));
            return access$getCount$cp;
        }
    }
}
