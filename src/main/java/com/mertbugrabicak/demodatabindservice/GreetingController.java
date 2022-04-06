package com.mertbugrabicak.demodatabindservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;


@RestController
public class GreetingController {

	@GetMapping("/greeting")
	public Greeting greeting() throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		Greeting greeting = mapper.readValue(new File("src/main/resources/greeting.json"), Greeting.class);

		return greeting;
	}

}