package org.kitri.springboothobby.service;

import javax.transaction.Transactional;

import org.kitri.springboothobby.dao.MemberDao;
import org.kitri.springboothobby.dto.MemberDto;
import org.kitri.springboothobby.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MemberService {
	@Autowired
	private MemberDao memberDao;
	
	public MemberDto loginCheck(String id, String password) {
		MemberDto memberDto = memberDao.loginCheck(id, password);
		return memberDto;
	}
	
	public int registeredMember(MemberEntity memberEntity) {
		int cnt = memberDao.registeredMember(memberEntity);
		return cnt;
	}
}
