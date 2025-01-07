package org.kitri.springboothobby.service;

import java.util.List;

import javax.transaction.Transactional;

import org.kitri.springboothobby.dao.MembershipsDao;
import org.kitri.springboothobby.dto.MembershipsDto;
import org.kitri.springboothobby.dto.UnjoinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MembershipsService {
	@Autowired
	private MembershipsDao membershipsDao;
	
	public List<MembershipsDto> viewMyMembershipList(String id) {
		List<MembershipsDto> membershipsList = membershipsDao.viewMyMembershipList(id);
		return membershipsList;
	}
	
	public int unjoinupdate(UnjoinDto unjoinDto) {
		int cnt = membershipsDao.unjoinupdate(unjoinDto);
		return cnt;
	}
	
	public int unjoindelete(UnjoinDto unjoinDto) {
		int cnt = membershipsDao.unjoindelete(unjoinDto);
		return cnt;
	}
}
