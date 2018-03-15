package com.example.sanov.mynotesapp.db;

import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by sanov on 3/7/2018.
 */

public class DatabaseContract {

    public static String TABLE_NOTE = "note";

     public static final class NoteColumns implements BaseColumns {
        public static String TITLE = "title";
        public static String DESCRIPTION = "description";
        public static String DATE = "date";
    }

    public static final String AUTHORITY = "com.example.sanov.mynotesapp";

     public static final Uri CONTENT_URI = new Uri.Builder().scheme("content")
             .authority(AUTHORITY)
             .appendPath(TABLE_NOTE)
             .build();

     public static String getColumnString(Cursor cursor, String columnName) {
         return cursor.getString(cursor.getColumnIndex(columnName));
     }

     public static int getColumnInt(Cursor cursor, String columnName) {
         return cursor.getInt(cursor.getColumnIndex(columnName));
     }

     public static long getColumnLong(Cursor cursor, String columnName) {
         return cursor.getLong(cursor.getColumnIndex(columnName));
     }
}
