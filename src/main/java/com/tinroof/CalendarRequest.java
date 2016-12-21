package com.tinroof;

/**
 * Created by Brett on 12/21/16.
 */
public class CalendarRequest {
	String email;
	String calendarName;

	public CalendarRequest() {
	}

	public CalendarRequest(String email, String calendarName) {
		this.email = email;
		this.calendarName = calendarName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCalendarName() {
		return calendarName;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}
}
