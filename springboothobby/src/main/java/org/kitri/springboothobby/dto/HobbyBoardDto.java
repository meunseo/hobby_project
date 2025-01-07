package org.kitri.springboothobby.dto;

public class HobbyBoardDto {
	private String hb_num;
	private String h_name;
	private String nickname;
	private String title;
	private String content;
	private String meetingplace;
	private String meetingtime;

	public HobbyBoardDto() {
	}

	public HobbyBoardDto(String hb_num, String h_name, String nickname, String title, String content,
			String meetingplace, String meetingtime) {
		this.hb_num = hb_num;
		this.h_name = h_name;
		this.nickname = nickname;
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

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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
		return "HobbyBoardDto [hb_num=" + hb_num + ", h_name=" + h_name + ", nickname=" + nickname + ", title=" + title
				+ ", content=" + content + ", meetingplace=" + meetingplace + ", meetingtime=" + meetingtime + "]";
	}

	

}
