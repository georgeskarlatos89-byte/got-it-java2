package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda6 implements Function {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Object[] f$2;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda6(String str, String str2, Object[] objArr) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = objArr;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).delete(this.f$0, this.f$1, this.f$2));
    }
}
