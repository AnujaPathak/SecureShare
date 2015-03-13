package com.example.secureshare;



import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstViewActivity extends ActionBarActivity{
	 
	@SuppressWarnings("deprecation")
	Tab homeTab,receivedTab,sentTab;
	Fragment fragmentTab1 = new HomeFrag();
	Fragment fragmentTab2 = new ReceivedFrag();
	Fragment fragmentTab3 = new SentFrag();
	
	   
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_view);
		
		ActionBar actionBar=getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		    homeTab = actionBar.newTab().setText("Home");
	        receivedTab = actionBar.newTab().setText("Received Files");
	        sentTab = actionBar.newTab().setText("Sent Files");
	        
	        homeTab.setTabListener(new MyTabListener(fragmentTab1));
	        receivedTab.setTabListener(new MyTabListener(fragmentTab2));
	        sentTab.setTabListener(new MyTabListener(fragmentTab3));
	        
	        actionBar.addTab(homeTab);
	        actionBar.addTab(receivedTab);
	        actionBar.addTab(sentTab);
		
		
	}
	
	public class HomeFrag extends Fragment {
		  public View onCreateView(LayoutInflater inflater, ViewGroup container, 
		                           Bundle savedInstanceState){
			View view = inflater.inflate(R.layout.tab, container, false);
			TextView textview = (TextView) view.findViewById(R.id.tabtextview);
			TextView tv=(TextView) view.findViewById(R.id.device_name);
			TextView tv1=(TextView) view.findViewById(R.id.manuf_name);
			//TextView tv2 = null;
			String devicename=android.os.Build.MODEL;
			String manufacturer=android.os.Build.MANUFACTURER;
			textview.setText(R.string.home);
			//tv2.setText("Hello User,you are using:");
			tv1.setText(manufacturer);
			tv.setText(devicename);
			
			return view;
		  }
		}
	
	public class ReceivedFrag extends Fragment {
		  public View onCreateView(LayoutInflater inflater, ViewGroup container, 
		                           Bundle savedInstanceState){
			View view = inflater.inflate(R.layout.tab, container, false);
			TextView textview = (TextView) view.findViewById(R.id.tabtextview);
			textview.setText(R.string.received);
			return view;
		  }
		}
	
	public class SentFrag extends Fragment {
		  public View onCreateView(LayoutInflater inflater, ViewGroup container, 
		                           Bundle savedInstanceState){
			View view = inflater.inflate(R.layout.tab, container, false);
			TextView textview = (TextView) view.findViewById(R.id.tabtextview);
			textview.setText(R.string.sent);
			return view;
		  }
		}

	
	// Since this is an object collection, use a FragmentStatePagerAdapter,
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first_view, menu);
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
	
	
	public void OpenCamera(View view)
	 {
		 Intent intent=new Intent(this,OpenCamera.class);
		 startActivity(intent);
		 
	 }
	 
}

