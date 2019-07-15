package com.example.codesolusi;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class TentangActivity extends Activity {
	WebView wv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tentang);
		wv=(WebView)findViewById(R.id.webv);
		wv.loadUrl("file:///android_asset/cs/tentang.html");
	}
	
}
