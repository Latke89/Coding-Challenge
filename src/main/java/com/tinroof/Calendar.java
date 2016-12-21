package com.tinroof;

import javax.persistence.*;

/**
 * Created by Brett on 12/21/16.
 */

@Entity
@Table(name="calendar")
public class Calendar {

	@Id
	@GeneratedValue
	int calendarId;

	@Column
	String name;

	@ManyToOne
	User user;

	public Calendar(String name, User user) {
		this.name = name;
		this.user = user;
	}

	public int getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(int calendarId) {
		this.calendarId = calendarId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
