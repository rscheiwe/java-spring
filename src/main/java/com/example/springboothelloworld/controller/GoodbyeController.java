package com.example.springboothelloworld.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodbyeController {
	private Map<String, Object> newResult = new HashMap<>();
	
	@RequestMapping("/goodbye")
	@ResponseBody
	public Map<String, Object> goodbye() {
		newResult.put("name", "Richard");
		newResult.put("place", "heaven");
		return newResult;
	}

}
