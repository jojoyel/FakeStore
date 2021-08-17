package com.jojoyel.fakestore.tools;

import android.util.Log;

public class JojoMaths {

	public static boolean frameNumber(int numberLeft, int numberRight, int numberToFrame) {
		Log.d("JojoMaths", "frameNumber: " + (numberLeft <= numberToFrame));
		Log.d("JojoMaths", "frameNumber: " + (numberToFrame <= numberRight));
		return numberLeft < numberToFrame && numberToFrame < numberRight;
	}
}
