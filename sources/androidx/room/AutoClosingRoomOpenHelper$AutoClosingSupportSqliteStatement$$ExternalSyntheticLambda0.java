package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteStatement;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda0 implements Function {
    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteStatement) obj).executeUpdateDelete());
    }
}
