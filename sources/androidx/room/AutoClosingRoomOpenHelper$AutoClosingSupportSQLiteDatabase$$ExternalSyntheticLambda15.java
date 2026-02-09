package androidx.room;

import android.content.ContentValues;
import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda15 implements Function {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ ContentValues f$2;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda15(String str, int i, ContentValues contentValues) {
        this.f$0 = str;
        this.f$1 = i;
        this.f$2 = contentValues;
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).insert(this.f$0, this.f$1, this.f$2));
    }
}
