package com.example.codesolusi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}
	public void BMateri(View v){
		Intent x = new Intent(HomeActivity.this, MainActivity.class);
		startActivity(x);
		
	}
	public void BRef(View v){
		Intent x = new Intent(HomeActivity.this, ReferensiActivity.class);
		startActivity(x);
		
	}
	public void BTentang(View v){
		Intent x = new Intent(HomeActivity.this, TentangActivity.class);
		startActivity(x);
		
	}

	

}