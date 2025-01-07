package org.kitri.springboothobby.service;

import java.util.List;

import javax.transaction.Transactional;

import org.kitri.springboothobby.dao.HobbyDao;
import org.kitri.springboothobby.dto.HobbyBoardDto;
import org.kitri.springboothobby.dto.HobbyDto;
import org.kitri.springboothobby.dto.MatchingMemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HobbyService {
	@Autowired
	private HobbyDao hobbyDao;
	
	public List<HobbyDto> viewHobbyCategory() {
		List<HobbyDto> hobbyList = hobbyDao.viewHobbyCategory();
		return hobbyList;
	}
	
	public List<HobbyBoardDto> searchbyname(String h_name) {
		List<HobbyBoardDto> hobbyBoardList = hobbyDao.searchbyname(h_name);
		return hobbyBoardList;
	}
	
	public List<HobbyBoardDto> viewDetails(String hb_num) {
		List<HobbyBoardDto> hobbyBoardList = hobbyDao.viewDetails(hb_num);
		return hobbyBoardList;
	}
	
	public int registeredMatchingMember(MatchingMemberDto matchingMemberDto) {
		int cnt = hobbyDao.registeredMatchingMember(matchingMemberDto);
		return cnt;
	}
	
	public int hobbyOpening(String h_num, String id, String title, String content, String meetingplace, String meetingtime) {
		int cnt = hobbyDao.hobbyOpening(h_num, id, title, content, meetingplace, meetingtime);
		return cnt;
	}

}
