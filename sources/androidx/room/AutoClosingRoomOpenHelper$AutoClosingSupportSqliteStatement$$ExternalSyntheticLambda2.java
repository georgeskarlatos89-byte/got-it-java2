package androidx.room;

import androidx.arch.core.util.Function;
import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement f$0;
    public final /* synthetic */ Function f$1;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, Function function) {
        this.f$0 = autoClosingSupportSqliteStatement;
        this.f$1 = function;
    }

    public final Object apply(Object obj) {
        return this.f$0.m290lambda$executeSqliteStatementWithRefCount$0$androidxroomAutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement(this.f$1, (SupportSQLiteDatabase) obj);
    }
}
