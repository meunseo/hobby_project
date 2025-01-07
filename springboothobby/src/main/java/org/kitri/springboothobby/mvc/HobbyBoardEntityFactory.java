package org.kitri.springboothobby.mvc;

import org.kitri.springboothobby.entity.HobbyBoardEntity;

public class HobbyBoardEntityFactory {
	public HobbyBoardEntity createHobbyBoard(String h_num, String id, String title, String content, String meetingplace, String meetingtime) {
		HobbyBoardEntity hobbyBoardEntity = new HobbyBoardEntity();
		hobbyBoardEntity.setH_num(h_num);
		hobbyBoardEntity.setId(id);
		hobbyBoardEntity.setTitle(title);
		hobbyBoardEntity.setContent(content);
		hobbyBoardEntity.setMeetingplace(meetingplace);
		hobbyBoardEntity.setMeetingtime(meetingtime);
		return hobbyBoardEntity;
	}
}
