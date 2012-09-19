package org.tyms;

import org.tyms.repository.TestSetRepository;
import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.SimpleCursorAdapter;

public class ViewTestSets extends ListActivity {
	private TestSetRepository testSetRepository;
	
	public ViewTestSets(){
		testSetRepository = new TestSetRepository(this);
	}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_test_sets);
        try{
        Cursor allTestSets = testSetRepository.getAllTestSets();
        startManagingCursor(allTestSets);
        String[] from = {"name","wmcount"};
        int[] to = {R.id.test_set_name,R.id.word_meaning_count};
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,R.layout.test_set_row,allTestSets,from,to);
        setListAdapter(adapter);
        }
        catch(Exception e){
        	Log.d("",e.getMessage());
        	Log.d("",e.getCause().toString());
        }
    }
}
