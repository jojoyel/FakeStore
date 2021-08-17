package com.jojoyel.fakestore.tools;

import java.util.Calendar;

public class DetermineDayPeriod {

	public static int determineDayPeriod() {
		Calendar currentTime = Calendar.getInstance();
		return currentTime.get(Calendar.HOUR_OF_DAY);
	}
}
