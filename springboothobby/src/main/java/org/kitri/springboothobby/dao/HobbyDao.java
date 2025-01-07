package org.kitri.springboothobby.dao;

import java.util.List;

import org.kitri.springboothobby.dto.HobbyBoardDto;
import org.kitri.springboothobby.dto.HobbyDto;
import org.kitri.springboothobby.dto.MatchingMemberDto;

public interface HobbyDao {
	public List<HobbyDto> viewHobbyCategory();
	
	public List<HobbyBoardDto> searchbyname(String h_name);
	
	public List<HobbyBoardDto> viewDetails(String hb_num);
	
	public int registeredMatchingMember(MatchingMemberDto matchingMemberDto);
	
	public int hobbyOpening(String h_num, String id, String title, String content, String meetingplace, String meetingtime);
}
