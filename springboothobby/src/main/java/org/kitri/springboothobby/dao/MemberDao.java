package org.kitri.springboothobby.dao;

import org.kitri.springboothobby.dto.MemberDto;
import org.kitri.springboothobby.entity.MemberEntity;

public interface MemberDao {
	public MemberDto loginCheck(String id, String password);
	
	public int registeredMember(MemberEntity memberEntity);
}
