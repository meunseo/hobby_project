package org.kitri.springboothobby.controller;

import javax.servlet.http.HttpSession;

import org.kitri.springboothobby.dto.MemberDto;
import org.kitri.springboothobby.entity.MemberEntity;
import org.kitri.springboothobby.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberCtrl {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("loginscreen")
	public String loginDisplay() {
		return "loginscreen";
	}
	
	@PostMapping("logincheck")
	public String loginCheck(@RequestParam("id")String id, @RequestParam("password")String password, HttpSession httpSession, ModelMap model) {
		String page = null;
		MemberDto memberDto = memberService.loginCheck(id, password);
		if(memberDto != null) {
			httpSession.setAttribute("id", memberDto.getId());
			page = "mainscreen";
		} else {
			page = "signupscreen";
		}
		return page;
	}
	
	@GetMapping("join")
	public String joinDisplay(ModelMap model) {
		return "signupscreen";
	}
	
	@PostMapping("registeredmember")
	public String registeredMember(@RequestParam("id")String id, @RequestParam("password")String password, @RequestParam("name")String name, @RequestParam("nickname")String nickname, @RequestParam("birth")int birth, ModelMap model) {
		String page = null;
		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setId(id);
		memberEntity.setPassword(password);
		memberEntity.setName(name);
		memberEntity.setNickname(nickname);
		memberEntity.setBirth(birth);
		int cnt = memberService.registeredMember(memberEntity);
		if(cnt == 1) {
			model.addAttribute("success", "회원가입에 성공하셨습니다. 아이디와 비밀번호를 입력해주세요.");
			page = "loginscreen";
		} else {
			model.addAttribute("message", "회원가입에 실패하셨습니다.");
			page = "signupscreen";
		}
		return page;
	}
	
	@PostMapping("logout")
	public String logout(HttpSession httpSession) {
		httpSession.invalidate();
	    return "redirect:/loginscreen";
	}
}
