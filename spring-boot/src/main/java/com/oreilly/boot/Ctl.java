package com.oreilly.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctl {

	@RequestMapping("/test")
	public String home() {
		return "Hello World!";
	}

}
