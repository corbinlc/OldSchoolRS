/*
Copyright (c) 2014 Corbin Leigh Champion

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

/* Author(s): Corbin Leigh Champion */

package com.gnuroot.rsinstaller;

import java.util.ArrayList;

import com.gnuroot.library.GNURootCoreActivity;
import com.gnuroot.rsinstaller.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RSInstallerLaunchFragment extends Fragment {

	Button signup_button;
	Button launch_button;
	Button reconnect_button;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View fragmentView = inflater.inflate(R.layout.fragment_launch, container, false);
		
		if (getActivity() != null) {
			signup_button = (Button) fragmentView.findViewById(R.id.signup_button);
			signup_button.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View view)
				{
					((RSInstallerMain)getActivity()).signupRS();
				}
			});
	        launch_button = (Button) fragmentView.findViewById(R.id.launch_button);
			launch_button.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View view)
				{
					((RSInstallerMain)getActivity()).launchRS();
				}
			});
			reconnect_button = (Button) fragmentView.findViewById(R.id.reconnect_button);
			reconnect_button.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View view)
				{
					((RSInstallerMain)getActivity()).reconnectRS();
				}
			});
		}
	
		return fragmentView;
		
	}
}
