package com.zeeyousee.photoeditor;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {

	private static final int LAYOUT_ID = R.layout.activity_main;

	private static final int PLACEHOLDER_ID_MAIN = R.id.layout_main;
	private static final int PLACEHOLDER_ID_DRAWER = R.id.layout_drawer_root;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(LAYOUT_ID);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(PLACEHOLDER_ID_MAIN, new PhotoEditMainFragment())
					.add(PLACEHOLDER_ID_DRAWER, new RootDrawerFragment())
					.commit();
		}
	}

}