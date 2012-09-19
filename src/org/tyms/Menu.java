package org.tyms;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button showTestSets = (Button) findViewById(R.id.test_sets);
        showTestSets.setOnClickListener(this);
    }

	public void onClick(View arg0) {
		Intent intent = new Intent(this,ViewTestSets.class);
		this.startActivity(intent);
	}
}