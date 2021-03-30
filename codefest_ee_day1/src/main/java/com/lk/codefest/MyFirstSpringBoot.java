package com.lk.codefest;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")

public class MyFirstSpringBoot {
	@GetMapping(path="/")
	
	public Map HelloWorld(String inData) {
		
		System.out.println(inData);
		
		Map<String, String> m=new HashMap<>();
		m.put("id", "1");
		m.put("name", "Hi"+inData);
		
		return m;
		
		
	}
	
	

}
