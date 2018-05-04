package com.liberty.springbootstarter.service;

public class Topics {
	private String topic;
	private String id;
	private String desc;

	//public Topics() {
	//}

	public Topics(String topic, String id, String desc) {
		super();
		this.topic = topic;
		this.id = id;
		this.desc = desc;
	}

	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
