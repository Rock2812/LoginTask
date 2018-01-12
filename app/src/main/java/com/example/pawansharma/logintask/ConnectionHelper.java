package com.example.pawansharma.logintask;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by PAWAN SHARMA on 1/8/2018.
 */
public class ConnectionHelper extends SQLiteOpenHelper {
    Context context;
    public ConnectionHelper(Context context)
    {
        super(context,"PawanDb",null,1);
        this.context=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="create table employee(name text,department text,contectno text,emailaddress text primary key,dateofjoin date)";
        db.execSQL(query);
        Toast.makeText(context, "Table created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
