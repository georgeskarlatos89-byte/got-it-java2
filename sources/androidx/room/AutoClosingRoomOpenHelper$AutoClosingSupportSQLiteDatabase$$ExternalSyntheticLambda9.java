package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda9 implements Function {
    public final /* synthetic */ long f$0;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda9(long j) {
        this.f$0 = j;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setPageSize(this.f$0);
    }
}
