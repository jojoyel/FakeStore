package com.jojoyel.fakestore;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import com.jojoyel.fakestore.databinding.ActivityMainBinding;
import com.jojoyel.fakestore.model.User;
import com.jojoyel.fakestore.tools.DetermineDayPeriod;
import com.jojoyel.fakestore.tools.JojoMaths;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MainActivity";

	Context mContext = this;

	ActivityMainBinding mBinding;

	Toolbar mToolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

		User user = new User("Jonathan");

		mToolbar = mBinding.mainActivityToolbar;
		setSupportActionBar(mToolbar);

		Log.d(TAG, "onCreate: ");
		if (JojoMaths.frameNumber(5, 13, DetermineDayPeriod.determineDayPeriod())) {
			Log.d(TAG, "onCreate: 1");
			mBinding.mainSalutation.setText(getString(R.string.goodMorning, user.getName()));
		} else if (JojoMaths.frameNumber(13, 18, DetermineDayPeriod.determineDayPeriod())) {
			Log.d(TAG, "onCreate: 2");
			mBinding.mainSalutation.setText(getString(R.string.goodAfternoon, user.getName()));
		} else if (JojoMaths.frameNumber(18, 24, DetermineDayPeriod.determineDayPeriod()) || JojoMaths.frameNumber(0, 5, DetermineDayPeriod.determineDayPeriod())) {
			Log.d(TAG, "onCreate: 3");
			mBinding.mainSalutation.setText(getString(R.string.goodEvening, user.getName()));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Log.d(TAG, "onCreateOptionsMenu: ");
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}
}