package org.kitri.springboothobby.dto;

public class MembershipsDto {
	private String mm_num;
	private String id;
	private String title;
	private String meetingplace;
	private String meetingtime;

	public MembershipsDto() {
	}

	public MembershipsDto(String mm_num, String id, String title, String meetingplace, String meetingtime) {
		this.mm_num = mm_num;
		this.id = id;
		this.title = title;
		this.meetingplace = meetingplace;
		this.meetingtime = meetingtime;
	}

	public String getMm_num() {
		return mm_num;
	}

	public void setMm_num(String mm_num) {
		this.mm_num = mm_num;
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
		return "MembershipsDto [mm_num=" + mm_num + ", id=" + id + ", title=" + title + ", meetingplace=" + meetingplace
				+ ", meetingtime=" + meetingtime + "]";
	}

}
