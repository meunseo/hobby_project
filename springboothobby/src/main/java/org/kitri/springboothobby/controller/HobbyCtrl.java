package org.kitri.springboothobby.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.kitri.springboothobby.dto.HobbyBoardDto;
import org.kitri.springboothobby.dto.HobbyDto;
import org.kitri.springboothobby.dto.MatchingMemberDto;
import org.kitri.springboothobby.entity.HobbyBoardEntity;
import org.kitri.springboothobby.mvc.HobbyBoardEntityFactory;
import org.kitri.springboothobby.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HobbyCtrl {
	@Autowired
	private HobbyService hobbyService;
	
	@PostMapping("viewhobbycategory")
	public String viewHobbyCategory(HttpSession httpSession, ModelMap model) {
		String id = (String) httpSession.getAttribute("id");
		if(id == null) {
			return "redirect:/loginscreen";
		}
		List<HobbyDto> hobbyList = hobbyService.viewHobbyCategory();
		model.addAttribute("hobbyList", hobbyList);
		return "hobbylistscreen";
	}
	
	@GetMapping("searchbyname")
	public String searchbyname(@RequestParam("h_name")String h_name, HttpSession httpSession, ModelMap model) {
		String id = (String) httpSession.getAttribute("id");
		if(id == null) {
			return "redirect:/loginscreen";
		}
		List<HobbyBoardDto> hobbyBoardList = hobbyService.searchbyname(h_name);
		model.addAttribute("hobbyBoardList", hobbyBoardList);
		return "hobbyboardscreen";
	}
	
	@PostMapping("viewdetails")
	public String viewDetails(@RequestParam("hb_num")String hb_num, HttpSession httpSession, ModelMap model) {
		String id = (String) httpSession.getAttribute("id");
		if(id == null) {
			return "redirect:/loginscreen";
		}
		List<HobbyBoardDto> hobbyBoardList = hobbyService.viewDetails(hb_num);
		model.addAttribute("detail", hobbyBoardList);
		return "hobbyboarddetailscreen";
	}
	
	@PostMapping("registeredmatchingmember")
	public String registeredMatchingMember(@RequestParam("hb_num")String hb_num, HttpSession httpSession, ModelMap model) {
		String id = (String) httpSession.getAttribute("id");
		if(id == null) {
			return "redirect:/loginscreen";
		}
		MatchingMemberDto matchingMemberDto = new MatchingMemberDto();
		matchingMemberDto.setId(id);
		matchingMemberDto.setHb_num(hb_num);
		int cnt = hobbyService.registeredMatchingMember(matchingMemberDto);
		if(cnt == 1) {
			model.addAttribute("complete", "모임에 가입되었습니다.");
		} else {
			model.addAttribute("message", "가입에 실패하였습니다.");
		}
		return "hobbyboarddetailscreen";
	}
	
	@PostMapping("opening")
	public String joinDisplay(HttpSession httpSession, ModelMap model) {
		String id = (String) httpSession.getAttribute("id");
		if(id == null) {
			return "redirect:/loginscreen";
		}
		List<HobbyDto> hobbyList = hobbyService.viewHobbyCategory();
		model.addAttribute("hobby", hobbyList);
		return "hobbyopeningscreen";
	}
	
	@PostMapping("hobbyopening")
	public String hobbyOpening(@RequestParam("hobby")String h_num, @RequestParam("title")String title, @RequestParam("content")String content, @RequestParam("meetingplace")String meetingplace, @RequestParam("meetingtime")String meetingtime, HttpSession httpSession, ModelMap model) {
		String id = (String) httpSession.getAttribute("id");
		if(id == null) {
			return "redirect:/loginscreen";
		}
		HobbyBoardEntityFactory boardEntityFactory = new HobbyBoardEntityFactory();
	    HobbyBoardEntity hobbyBoardEntity = boardEntityFactory.createHobbyBoard(h_num, id, title, content, meetingplace, meetingtime);
		int cnt = hobbyService.hobbyOpening(hobbyBoardEntity.getH_num(), hobbyBoardEntity.getId(), hobbyBoardEntity.getTitle(), hobbyBoardEntity.getContent(), hobbyBoardEntity.getMeetingplace(), hobbyBoardEntity.getMeetingtime());
		if(cnt == 1) {
			model.addAttribute("success", "모임 개설 성공하였습니다.");
		} else {
			model.addAttribute("fail", "모임 개설 실패하였습니다.");
		}
		return "hobbyopeningscreen";
	}
}
