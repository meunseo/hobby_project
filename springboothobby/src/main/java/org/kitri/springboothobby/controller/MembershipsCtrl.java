package org.kitri.springboothobby.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.kitri.springboothobby.dto.MembershipsDto;
import org.kitri.springboothobby.dto.UnjoinDto;
import org.kitri.springboothobby.service.MembershipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MembershipsCtrl {
	@Autowired
	private MembershipsService membershipsService;
	
	@PostMapping("viewmymembershiplist")
	public String viewMyMembershipList(HttpSession httpSession, ModelMap model) {
		String id = (String) httpSession.getAttribute("id");
		if(id == null) {
			return "redirect:/loginscreen";
		}
		List<MembershipsDto> membershipsList = membershipsService.viewMyMembershipList(id);
		if(membershipsList == null) {
			model.addAttribute("message", "등록된 취미가 없습니다.");
		} else {
			model.addAttribute("membershipsList", membershipsList);
		}
		return "membershipsscreen";
	}
	
	@PostMapping("unjoin")
	public String unjoin(@RequestParam("mm_num")String mm_num, HttpSession httpSession, ModelMap model) {
		String id = (String) httpSession.getAttribute("id");
		if(id == null) {
			return "redirect:/loginscreen";
		}
		UnjoinDto unjoinDto = new UnjoinDto();
		unjoinDto.setId(id);
		unjoinDto.setMm_num(mm_num);
		int result = membershipsService.unjoinupdate(unjoinDto);
		if(result == 1) {
			int cnt = membershipsService.unjoindelete(unjoinDto);
			if(cnt == 1) {
				model.addAttribute("success", "탈퇴가 완료되었습니다.");
			} else {
				model.addAttribute("fail", "탈퇴 되지 않았습니다. 다시 실행해주세요.");
			}
		} else {
			model.addAttribute("message", "오류 : 탈퇴되지 않았습니다.");
		}
		return "membershipsscreen";
	}

	
}
