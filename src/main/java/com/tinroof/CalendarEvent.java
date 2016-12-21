package com.tinroof;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Brett on 12/21/16.
 */
@Entity
@Table(name="calendarevent")
public class CalendarEvent {

	@Id
	@GeneratedValue
	int eventId;

	@ManyToOne
	Calendar calendar;

	@Column
	String title;

	@Column
	LocalDateTime dateAndTime;

	@Column
	String location;

	@Column
	LocalTime reminder;

	@Column
	boolean reminderSent;

	public CalendarEvent(Calendar calendar, String title, LocalDateTime dateAndTime, String location, LocalTime reminder) {
		this.calendar = calendar;
		this.title = title;
		this.dateAndTime = dateAndTime;
		this.location = location;
		this.reminder = reminder;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalTime getReminder() {
		return reminder;
	}

	public void setReminder(LocalTime reminder) {
		this.reminder = reminder;
	}

	public boolean isReminderSent() {
		return reminderSent;
	}

	public void setReminderSent(boolean reminderSent) {
		this.reminderSent = reminderSent;
	}
}
