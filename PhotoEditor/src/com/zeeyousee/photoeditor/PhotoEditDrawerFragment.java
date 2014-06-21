package com.zeeyousee.photoeditor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PhotoEditDrawerFragment extends Fragment {

	private static final int LAYOUT_ID = R.layout.fragment_drawer_photo_editor;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(LAYOUT_ID, container, false);
		return view;
	}

}
