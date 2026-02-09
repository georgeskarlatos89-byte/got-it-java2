package com.braintreepayments.api;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

class AnalyticsDatabase_AutoMigration_1_2_Impl extends Migration {
    public AnalyticsDatabase_AutoMigration_1_2_Impl() {
        super(1, 2);
    }

    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `analytics_event` ADD COLUMN `paypal_context_id` TEXT DEFAULT NULL");
    }
}
