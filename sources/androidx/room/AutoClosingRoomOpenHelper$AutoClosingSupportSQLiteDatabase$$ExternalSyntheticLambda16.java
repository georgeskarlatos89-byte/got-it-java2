package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda16 implements Function {
    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
    }
}
