package com.simplegridview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	GridView gridview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gridview = (GridView) findViewById(R.id.gridView1);

		// String Array for setting data over gridview
		String data[] = { "A", "B", "C", "D", "F", "G", "H", "I" };

		// Array adapter for holding the data
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				MainActivity.this, android.R.layout.simple_list_item_1, data);

		// Setting adapter over gridview
		gridview.setAdapter(adapter);

		// Notifying adapter
		adapter.notifyDataSetChanged();

		// Setting click listener on items
		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// Showing clicked item position
				Toast.makeText(MainActivity.this,
						"Clicked Position : " + position, Toast.LENGTH_SHORT)
						.show();

			}
		});

	}

}
