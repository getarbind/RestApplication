package com.liberty.springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {
	private List<Topics> topicList = new ArrayList<> (Arrays.asList(
			new Topics("Spring","Spring Framework","Spring Framework Description"),
			new Topics("Java","Core Java","Core Java Description"),
			new Topics("Javascript","JavaScript","JavaScript Description")));
	
	public List<Topics> getAllTopics() {
		return topicList;
	}
	
	public Topics getTopic(String id) {
		return topicList.stream().filter(t -> t.getTopic().equals(id)).findFirst().get();
	}

	public void addTopic(Topics topic) {
		topicList.add(topic);
		
	}

}
