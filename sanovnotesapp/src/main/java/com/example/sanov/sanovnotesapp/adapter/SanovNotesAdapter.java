package com.example.sanov.sanovnotesapp.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.sanov.sanovnotesapp.R;

import static com.example.sanov.sanovnotesapp.db.DatabaseContract.NoteColumns.DATE;
import static com.example.sanov.sanovnotesapp.db.DatabaseContract.NoteColumns.DESCRIPTION;
import static com.example.sanov.sanovnotesapp.db.DatabaseContract.NoteColumns.TITLE;
import static com.example.sanov.sanovnotesapp.db.DatabaseContract.getColumnString;

/**
 * Created by sanov on 3/15/2018.
 */

public class SanovNotesAdapter extends CursorAdapter {

    public SanovNotesAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sanov_note, viewGroup, false);
        return view;
    }

    @Override
    public Cursor getCursor() {
        return super.getCursor();
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        if (cursor != null) {
            TextView tvTitle = view.findViewById(R.id.tv_item_title);
            TextView tvDate = view.findViewById(R.id.tv_item_date);
            TextView tvDescription = view.findViewById(R.id.tv_item_description);

            tvTitle.setText(getColumnString(cursor, TITLE));
            tvDate.setText(getColumnString(cursor, DATE));
            tvDescription.setText(getColumnString(cursor, DESCRIPTION));
        }

    }
}
