package com.kalyani;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/IPL")
public String[] home() {
		
		String [] str = {"MI","RCB","GJ","RR","lSG"};

	return str;
}
}
