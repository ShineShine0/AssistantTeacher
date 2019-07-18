package com.assistantteacher.dto;

import java.io.Serializable;

public class LessonPlanFileDto implements Serializable{
	private long id;
	private String path;
	private String type;
	private long lessonPlanId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getLessonPlanId() {
		return lessonPlanId;
	}
	public void setLessonPlanId(long lessonPlanId) {
		this.lessonPlanId = lessonPlanId;
	}

}
