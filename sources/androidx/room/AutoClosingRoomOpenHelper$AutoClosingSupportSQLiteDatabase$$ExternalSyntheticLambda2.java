package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ String f$0;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda2(String str) {
        this.f$0 = str;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).execSQL(this.f$0);
    }
}
