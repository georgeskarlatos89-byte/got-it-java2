package com.braintreepayments.api;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/AnalyticsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "analyticsEventDao", "Lcom/braintreepayments/api/AnalyticsEventDao;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: AnalyticsDatabase.kt */
public abstract class AnalyticsDatabase extends RoomDatabase {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static volatile AnalyticsDatabase INSTANCE;

    @JvmStatic
    public static final AnalyticsDatabase getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public abstract AnalyticsEventDao analyticsEventDao();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/AnalyticsDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/braintreepayments/api/AnalyticsDatabase;", "getInstance", "context", "Landroid/content/Context;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: AnalyticsDatabase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AnalyticsDatabase getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AnalyticsDatabase access$getINSTANCE$cp = AnalyticsDatabase.INSTANCE;
            if (access$getINSTANCE$cp == null) {
                synchronized (this) {
                    AnalyticsDatabase build = Room.databaseBuilder(context.getApplicationContext(), AnalyticsDatabase.class, "analytics_database").build();
                    Intrinsics.checkNotNullExpressionValue(build, "databaseBuilder(\n       …                ).build()");
                    access$getINSTANCE$cp = build;
                    Companion companion = AnalyticsDatabase.Companion;
                    AnalyticsDatabase.INSTANCE = access$getINSTANCE$cp;
                }
            }
            return access$getINSTANCE$cp;
        }
    }
}
