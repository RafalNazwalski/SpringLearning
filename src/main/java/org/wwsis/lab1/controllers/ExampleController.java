
package org.wwsis.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {
	
	@RequestMapping("/")
	public String home() {
		return "startPage";
	}

}
