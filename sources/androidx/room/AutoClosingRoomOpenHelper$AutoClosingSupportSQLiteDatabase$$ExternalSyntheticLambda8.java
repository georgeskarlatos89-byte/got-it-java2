package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda8 implements Function {
    public final /* synthetic */ int f$0;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda8(int i) {
        this.f$0 = i;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).needUpgrade(this.f$0));
    }
}
