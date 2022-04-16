package com.motion.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/")
public class CommonController {

		@GetMapping("/index")
		public String home() {	
		  return "index";
		}
	  
		@GetMapping("/hello")
		public String hello() {
			return "hello";
		}
		
		@GetMapping("/login")
		public String login() {
			return "login";
		}
	  
		@GetMapping("/test1")
		@ResponseBody
		public Map<String, Object> TestPage1() {
			Map<String, Object> resultObject = new HashMap<String, Object>();
			try {
				
				resultObject.put("result", "success");
				
			} catch (Exception e) {
				resultObject.put("result", "fail");
				e.printStackTrace();
			}
			
			return resultObject;
			
		}

	  
}

