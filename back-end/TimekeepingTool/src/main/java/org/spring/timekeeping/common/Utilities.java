package org.spring.timekeeping.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {

	/**
	 * Formatting Dates
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public String foramtDateTimeToString(Date date, String pattern) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(new Date());
	}
}
