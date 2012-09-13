package org.tyms.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "testYourMemorySkills.db";
    private static final int DATABASE_VERSION = 1;
    private static DbHelper instance;

    public static DbHelper getInstance(Context context){
        if(instance == null)
            instance = new DbHelper(context);
        return instance;
    }


    private DbHelper(Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
       sqLiteDatabase.execSQL("create table test_set (set_id integer primary key autoincrement, set_name text");
       sqLiteDatabase.execSQL("create table test_set_hash (test_set_id integer," +
       						  " word text, meaning text, foreign key('test_set_id') references test_set('set_id')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
