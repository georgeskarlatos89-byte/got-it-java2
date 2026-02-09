package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda11 implements Function {
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda11(boolean z) {
        this.f$0 = z;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setForeignKeyConstraintsEnabled(this.f$0);
    }
}
