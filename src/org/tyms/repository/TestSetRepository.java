package org.tyms.repository;

import org.tyms.helper.DbHelper;

import android.content.Context;
import android.database.Cursor;

public class TestSetRepository {
    private DbHelper dbHelper;

    public TestSetRepository(Context context) {
        this.dbHelper = DbHelper.getInstance(context);
    }
    public Cursor getAllTestSets(){
    	return dbHelper.getWritableDatabase().rawQuery("select set_id as _id, set_name as name , count(test_set_id) as wmcount from test_set" +
    			" inner join test_set_hash on set_id = test_set_id group by test_set_id",null);
    }
}
