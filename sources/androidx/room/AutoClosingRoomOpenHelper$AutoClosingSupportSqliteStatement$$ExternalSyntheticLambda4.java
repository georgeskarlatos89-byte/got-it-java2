package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteStatement;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda4 implements Function {
    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteStatement) obj).simpleQueryForLong());
    }
}
