package com.zeeyousee.photoeditor;

import java.util.zip.Inflater;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RootDrawerFragment extends Fragment {

	private static final int LAYOUT_ID = R.layout.fragment_drawer_root;
	private static final int PLACEHOLDER_ID_LAYOUT = R.id.layout_drawer;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(LAYOUT_ID, container, false);
		getFragmentManager().beginTransaction()
				.add(PLACEHOLDER_ID_LAYOUT, new PhotoEditDrawerFragment())
				.commit();
		return view;
	}

}
