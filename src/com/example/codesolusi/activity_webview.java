package com.example.codesolusi;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class activity_webview extends Activity {
	WebView webview;
	protected void onCreate(Bundle webviewac) {
		super.onCreate(webviewac);
		setContentView(R.layout.activity_webview);
		
		Intent x = getIntent();
		String pesan = x.getStringExtra("page");
		String hasil = pesan.substring(0,pesan.lastIndexOf(":"));
		webview = (WebView)findViewById(R.id.webview);
		webview.loadUrl("file:///android_asset/cs/"+hasil+".html");
		
	}

}
