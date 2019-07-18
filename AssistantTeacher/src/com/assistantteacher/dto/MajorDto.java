package com.assistantteacher.dto;

import java.io.Serializable;

public class MajorDto implements Serializable {

	private long id;
	private String name;
	private String longName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	
}
