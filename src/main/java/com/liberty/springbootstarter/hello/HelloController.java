package com.liberty.springbootstarter.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liberty.springbootstarter.service.Topics;

@RestController
public class HelloController {
	
	//@Autowired
	//private TopicServices topicServices;
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi!!";
	}
	
	@RequestMapping("/topics123")
	public List<Topics> topics() {
		List<Topics> topicList = new ArrayList<Topics>();
		topicList.add(new Topics("Java","JEE","Enterprise Java"));
		topicList.add(new Topics("Spring Framework","Spring","Spring Freamework Desc"));
		return topicList; 
	}
}
