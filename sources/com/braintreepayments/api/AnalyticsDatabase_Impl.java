package com.braintreepayments.api;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.android.vending.expansion.zipfile.APEZProvider;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AnalyticsDatabase_Impl extends AnalyticsDatabase {
    private volatile AnalyticsEventDao _analyticsEventDao;

    /* access modifiers changed from: protected */
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(2) {
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `analytics_event` (`name` TEXT NOT NULL, `paypal_context_id` TEXT, `timestamp` INTEGER NOT NULL, `_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fb16d596d2e4a66c684ffece8b37601e')");
            }

            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `analytics_event`");
                if (AnalyticsDatabase_Impl.this.mCallbacks != null) {
                    int size = AnalyticsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AnalyticsDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            /* access modifiers changed from: protected */
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (AnalyticsDatabase_Impl.this.mCallbacks != null) {
                    int size = AnalyticsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AnalyticsDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase unused = AnalyticsDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                AnalyticsDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (AnalyticsDatabase_Impl.this.mCallbacks != null) {
                    int size = AnalyticsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AnalyticsDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            /* access modifiers changed from: protected */
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("name", new TableInfo.Column("name", "TEXT", true, 0, (String) null, 1));
                hashMap.put("paypal_context_id", new TableInfo.Column("paypal_context_id", "TEXT", false, 0, (String) null, 1));
                hashMap.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, (String) null, 1));
                hashMap.put(APEZProvider.FILEID, new TableInfo.Column(APEZProvider.FILEID, "INTEGER", true, 1, (String) null, 1));
                TableInfo tableInfo = new TableInfo("analytics_event", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "analytics_event");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "analytics_event(com.braintreepayments.api.AnalyticsEvent).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
        }, "fb16d596d2e4a66c684ffece8b37601e", "3c0ee8f7504942806ae8cf76460f9937")).build());
    }

    /* access modifiers changed from: protected */
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "analytics_event");
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `analytics_event`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(AnalyticsEventDao.class, AnalyticsEventDao_Impl.getRequiredConverters());
        return hashMap;
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[]{new AnalyticsDatabase_AutoMigration_1_2_Impl()});
    }

    public AnalyticsEventDao analyticsEventDao() {
        AnalyticsEventDao analyticsEventDao;
        if (this._analyticsEventDao != null) {
            return this._analyticsEventDao;
        }
        synchronized (this) {
            if (this._analyticsEventDao == null) {
                this._analyticsEventDao = new AnalyticsEventDao_Impl(this);
            }
            analyticsEventDao = this._analyticsEventDao;
        }
        return analyticsEventDao;
    }
}
