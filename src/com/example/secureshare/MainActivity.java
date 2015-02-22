package com.example.secureshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	
	public final static String EXTRA_Name = "com.example.secureshare.Name";
	public final static String EXTRA_Aadhar="com.example.secureshare.Aadhar";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
	
	public void Verify(View view){
		
		Intent intent = new Intent(this, VerifyActivity.class);
		EditText fullName=(EditText)findViewById(R.id.full_name);      //Name of EdiText resource in xml file
		EditText aadharNum=(EditText)findViewById(R.id.aadhar_num);
		String fname=fullName.getText().toString();
		String aadhar=aadharNum.getText().toString();
		intent.putExtra(EXTRA_Name,fname);
		intent.putExtra(EXTRA_Aadhar,aadhar);
		startActivity(intent);
	} 
	
	
}
