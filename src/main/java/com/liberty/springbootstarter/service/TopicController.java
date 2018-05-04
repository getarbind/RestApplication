package com.liberty.springbootstarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicServices topicServices;
	
	@RequestMapping("/alltopics")
	public List<Topics> getAllTopics() {
		return topicServices.getAllTopics(); 
		}
	
	@RequestMapping("/topics/{id}")
	public Topics getTopic(@PathVariable String id) {
		return topicServices.getTopic(id);
		}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topics topic) {
		topicServices.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topics topic, @PathVariable String id) {
		topicServices.updateTopic(topic, id);
	}

}
