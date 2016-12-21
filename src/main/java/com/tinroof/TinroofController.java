package com.tinroof;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Brett on 12/21/16.
 */
@Controller
public class TinroofController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
}
