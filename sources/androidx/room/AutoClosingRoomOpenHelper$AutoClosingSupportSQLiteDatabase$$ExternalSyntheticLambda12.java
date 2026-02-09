package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda12 implements Function {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object[] f$1;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda12(String str, Object[] objArr) {
        this.f$0 = str;
        this.f$1 = objArr;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).execSQL(this.f$0, this.f$1);
    }
}
