package org.kitri.springboothobby.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EtcCtrl {
	
	@PostMapping("main")
	public String mainScreen(HttpSession httpSession, ModelMap model) {
		String id = (String) httpSession.getAttribute("id");
		if(id == null) {
			return "redirect:/loginscreen";
		}
		return "mainscreen";
	}
}
