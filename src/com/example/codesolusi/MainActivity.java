package com.example.codesolusi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {
	Integer[] image = { R.drawable.cs, R.drawable.cs,
			R.drawable.cs, R.drawable.cs, R.drawable.cs,
			R.drawable.cs, R.drawable.cs, R.drawable.cs,
			R.drawable.cs, R.drawable.cs, R.drawable.cs,
			R.drawable.cs, R.drawable.cs, R.drawable.cs,
			R.drawable.cs };
	String[] name = { "Part1: Pendahuluan", 
			"Part2: IDE C#", 
			"Part3: Hello World C#", 
			"Part4: WinForms C#", 
			"Part5: Variabel Dasar C#", 
			"Part6: Tipe data pada C#",
			"Part7: Operator aritmatika pada C#", 
			"Part8: Kondisi pada C#", 
			"Part9: Perulangan while pada C#", 
			"Part10: Perulangan for pada C#", 
			"Part11: Array pada C#", 
			"Part12: Class dan objek pada C#", 
			"Part13: Method pada C#",
			"Part14: Field dan property pada C#", 
			"Part15: Collection pada C#", };
	/*
	 * public String [] alamat={ "file:///android_assets/cs/Part1.html",
	 * };
	 */
	ListView listView;
	WebView webview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.listview);
		CustomList adapter = new CustomList(MainActivity.this, name, image);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {

				String teks = (String) (listView.getItemAtPosition(position));
				intentPage(teks);
			}

		});

	}

	private void intentPage(String var) {
		Intent x = new Intent(MainActivity.this, activity_webview.class);
		x.putExtra("page", var);
		startActivity(x);
	}

}
