package com.example.startactivity;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity implements OnClickListener {

	Button btnStartAnotherActivity;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnStartAnotherActivity = (Button)findViewById(R.id.btnStartAnotherActivity);
        btnStartAnotherActivity.setOnClickListener((OnClickListener) this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
	@Override
	public void onClick(View view) {
		
		Intent myIntent = new Intent(this, AnotherActivity.class);

		// calling an activity using <intent-filter> action name 
		//Intent inent = new Intent("com.example.startactivity.ANOTHER_ACTIVITY");
		
		startActivity(myIntent);
	}
}
