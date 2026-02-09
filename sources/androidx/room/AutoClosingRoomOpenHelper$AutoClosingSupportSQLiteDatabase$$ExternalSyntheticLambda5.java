package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda5 implements Function {
    public final /* synthetic */ int f$0;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda5(int i) {
        this.f$0 = i;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setVersion(this.f$0);
    }
}
