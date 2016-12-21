package com.tinroof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Brett on 12/21/16.
 */
@RestController
public class TinroofRestController {

	@Autowired
	UserRepository users;
	@Autowired
	CalendarRepository calendars;
	@Autowired
	CalendarEventRepository calendarEvents;

	@RequestMapping(path = "/register.json", method = RequestMethod.POST)
	public UserContainer register (@RequestBody RegisterContainer registerInfo) {
		User myUser = users.findByEmail(registerInfo.getEmail());
		UserContainer container = new UserContainer();
		if(myUser == null) {
			myUser = new User(registerInfo.getName(), registerInfo.getEmail(), registerInfo.getPassword());
			users.save(myUser);
			container.user = myUser;
		} else {
			container.errorMessage = "User already exists";
		}
		return container;
	}

	@RequestMapping(path = "/login.json", method = RequestMethod.POST)
	public UserContainer login(@RequestBody LoginInfoPost container) {
		User myUser = users.findByEmail(container.getEmail());
		String incomingPassword = container.getPassword();
		UserContainer outgoingInformation = new UserContainer();
		if(myUser == null) {
			outgoingInformation.errorMessage = "User does not exist";
		}
		if (!myUser.getPassword().equals(incomingPassword)) {
			outgoingInformation.errorMessage = "Password is incorrect";
		}
		if(myUser != null && myUser.getPassword().equals(incomingPassword)) {
			outgoingInformation.user = myUser;
		}

		return outgoingInformation;
	}

	@RequestMapping(path = "/calendar.json", method = RequestMethod.POST)
	public Calendar createCalendar(@RequestBody CalendarRequest newCalendar) {
		User myUser = users.findByEmail(newCalendar.getEmail());
		Calendar myCalendar = new Calendar(newCalendar.getCalendarName(), myUser);
		calendars.save(myCalendar);
		return myCalendar;
	}


}
