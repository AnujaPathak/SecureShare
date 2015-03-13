package com.example.secureshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
//import android.widget.Button;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;

public class VerifyActivity extends ActionBarActivity {
	
	public final static String EXTRA_UserName = "com.example.secureshare.UserName";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent=getIntent();
		String fname=intent.getStringExtra(MainActivity.EXTRA_Name);
		
		//String aadhar=intent.getStringExtra(MainActivity.EXTRA_Aadhar);
		
		setContentView(R.layout.activity_verify);
		
		String name="Anuja Pathak";
		
		// Create the text view
	   // TextView textView = new TextView(this);
	   
	    
	   // TextView verified = (TextView) findViewById(R.id.Verified);
	     //textView.setTextSize(20);
	    
	      if(fname.equals(name)) {	    
	      //setContentView(textView);
	      setContentView(R.layout.activity_verify);
	 	 //textView.setText(" Verified User : " + fname);
	 	 
	/* 	OnClickListener listnr=new OnClickListener() {

            @Override

            public void onClick(View v) {

                  Intent i= new Intent("OpenCamera");

                  startActivity(i);

            }

      };

      Button btn =(Button) findViewById(R.id.button_Create);

      btn.setOnClickListener(listnr);*/
	 	// Button Create=
	   
	   }

	  
	    // Set the text view as the activity layout
	    
	    
		
		//if (savedInstanceState == null) {
          //  getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
        //}

		
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
   
	 
	 public void FirstView(View view)
	 {
		 Intent intent=new Intent(this,FirstViewActivity.class);
		 startActivity(intent);
		 
	 }


 	/*public void Browse(View view){
 		//Intent intent = new Intent(this, BrowseGalleryActivity.class);
		EditText uName=(EditText)findViewById(R.id.User_name); 
		String username=uName.getText().toString();
		//intent.putExtra("EXTRA_UserName",username);
	 

 	}*/
}
/**
 * A placeholder fragment containing a simple view.
 */
/*public static class PlaceholderFragment extends Fragment {

    public PlaceholderFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
              Bundle savedInstanceState) {
          View rootView = inflater.inflate(R.layout.fragment_verify,
                  container, false);
          return rootView;
    }
}*/

