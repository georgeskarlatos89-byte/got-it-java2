package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda7 implements Function {
    public final /* synthetic */ long f$0;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda7(long j) {
        this.f$0 = j;
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).setMaximumSize(this.f$0));
    }
}
