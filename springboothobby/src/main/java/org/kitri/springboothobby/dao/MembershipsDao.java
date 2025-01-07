package org.kitri.springboothobby.dao;

import java.util.List;

import org.kitri.springboothobby.dto.MembershipsDto;
import org.kitri.springboothobby.dto.UnjoinDto;

public interface MembershipsDao {
	public List<MembershipsDto> viewMyMembershipList(String id);
	
	public int unjoinupdate(UnjoinDto unjoinDto);
	
	public int unjoindelete(UnjoinDto unjoinDto);
}
