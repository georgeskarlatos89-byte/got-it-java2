package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Locale;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda21 implements Function {
    public final /* synthetic */ Locale f$0;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda21(Locale locale) {
        this.f$0 = locale;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setLocale(this.f$0);
    }
}
