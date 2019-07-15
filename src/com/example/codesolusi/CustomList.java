package com.example.codesolusi;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {
	public final Activity context;
	public final String[] name;
	public final Integer[] image;


	public CustomList(Activity context, String[] name, Integer[] image) {
		super(context, R.layout.item, name);
		this.context = context;
		this.name = name;
		this.image = image;

	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.item, null, true);
		ImageView imgView = (ImageView)rowView.findViewById(R.id.imageview);
		TextView txtView = (TextView) rowView.findViewById(R.id.textview);
		imgView.setImageResource(image[position]);
		txtView.setText(name[position]);
		return rowView;
	}
}
