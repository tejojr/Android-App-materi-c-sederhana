package com.example.codesolusi;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
	@Override
	protected void onCreate(Bundle splashActivity) {
		super.onCreate(splashActivity);
		setContentView(R.layout.active_splash);
		
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent x = new Intent(SplashActivity.this, HomeActivity.class);
				startActivity(x);
				finish();
				
			}
		}, 2500);
	}
}
