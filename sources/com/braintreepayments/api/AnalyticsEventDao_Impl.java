package com.braintreepayments.api;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.android.vending.expansion.zipfile.APEZProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AnalyticsEventDao_Impl implements AnalyticsEventDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<AnalyticsEvent> __deletionAdapterOfAnalyticsEvent;
    private final EntityInsertionAdapter<AnalyticsEvent> __insertionAdapterOfAnalyticsEvent;

    public AnalyticsEventDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfAnalyticsEvent = new EntityInsertionAdapter<AnalyticsEvent>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR ABORT INTO `analytics_event` (`name`,`paypal_context_id`,`timestamp`,`_id`) VALUES (?,?,?,nullif(?, 0))";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, AnalyticsEvent analyticsEvent) {
                if (analyticsEvent.getName() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, analyticsEvent.getName());
                }
                if (analyticsEvent.getPayPalContextId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, analyticsEvent.getPayPalContextId());
                }
                supportSQLiteStatement.bindLong(3, analyticsEvent.getTimestamp());
                supportSQLiteStatement.bindLong(4, analyticsEvent.id);
            }
        };
        this.__deletionAdapterOfAnalyticsEvent = new EntityDeletionOrUpdateAdapter<AnalyticsEvent>(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM `analytics_event` WHERE `_id` = ?";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, AnalyticsEvent analyticsEvent) {
                supportSQLiteStatement.bindLong(1, analyticsEvent.id);
            }
        };
    }

    public void insertEvent(AnalyticsEvent analyticsEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAnalyticsEvent.insert(analyticsEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void deleteEvents(List<? extends AnalyticsEvent> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfAnalyticsEvent.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<AnalyticsEvent> getAllEvents() {
        String str;
        String str2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM analytics_event", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "paypal_context_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, APEZProvider.FILEID);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(columnIndexOrThrow)) {
                    str = null;
                } else {
                    str = query.getString(columnIndexOrThrow);
                }
                if (query.isNull(columnIndexOrThrow2)) {
                    str2 = null;
                } else {
                    str2 = query.getString(columnIndexOrThrow2);
                }
                AnalyticsEvent analyticsEvent = new AnalyticsEvent(str, str2, query.getLong(columnIndexOrThrow3));
                analyticsEvent.id = query.getLong(columnIndexOrThrow4);
                arrayList.add(analyticsEvent);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
