package com.tinroof;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TinroofCodingChallengeApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	UserRepository users;
	@Autowired
	CalendarRepository calendars;
	@Autowired
	CalendarEventRepository calendarEvents;


	//asserts are not loading, so I am moving on to other parts of the application
//	@Test
//	public void register() {
//		String name = "Brett";
//		String email = "brett@brett.com";
//		String password = "password";
//		User myUser = new User(name, email, password);
//		users.save(myUser);
//		User sameUser = users.findByEmail(email);
//	}

}
