package org.kitri.springboothobby.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "a_hobbyboard")
public class HobbyBoardEntity {
	@Id
	@Column(name = "hb_num")
	private String hb_num;
	
	@Column(name = "h_num")
	private String h_num;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "meetingplace")
	private String meetingplace;
	
	@Column(name = "meetingtime")
	private String meetingtime;

	public HobbyBoardEntity() {}

	public HobbyBoardEntity(String hb_num, String h_num, String id, String title, String content, String meetingplace,
			String meetingtime) {
		this.hb_num = hb_num;
		this.h_num = h_num;
		this.id = id;
		this.title = title;
		this.content = content;
		this.meetingplace = meetingplace;
		this.meetingtime = meetingtime;
	}

	public String getHb_num() {
		return hb_num;
	}

	public void setHb_num(String hb_num) {
		this.hb_num = hb_num;
	}

	public String getH_num() {
		return h_num;
	}

	public void setH_num(String h_num) {
		this.h_num = h_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMeetingplace() {
		return meetingplace;
	}

	public void setMeetingplace(String meetingplace) {
		this.meetingplace = meetingplace;
	}

	public String getMeetingtime() {
		return meetingtime;
	}

	public void setMeetingtime(String meetingtime) {
		this.meetingtime = meetingtime;
	}

	@Override
	public String toString() {
		return "HobbyBoardEntity [hb_num=" + hb_num + ", h_num=" + h_num + ", id=" + id + ", title=" + title
				+ ", content=" + content + ", meetingplace=" + meetingplace + ", meetingtime=" + meetingtime
				+ ", getHb_num()=" + getHb_num() + ", getH_num()=" + getH_num() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getContent()=" + getContent() + ", getMeetingplace()="
				+ getMeetingplace() + ", getMeetingtime()=" + getMeetingtime() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
