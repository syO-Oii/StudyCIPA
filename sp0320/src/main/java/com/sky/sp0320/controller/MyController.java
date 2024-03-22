package com.sky.sp0320.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.sp0320.dto.Member;
import com.sky.sp0320.service.MemberService;

@Controller
public class MyController {
	
//	@Autowired
//	private MemberDao memberDao;
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/")
	public String root(Model model) {
		model.addAttribute("list", memberService.listAll());
		return "root";
	}
	
	@PostMapping("/input")
	public String input(Model model, Member member) {
		System.out.println(member);
		memberService.insert(member);
		model.addAttribute("list", memberService.listAll());
		return "root";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(int id, Model model) {
		System.out.println("id="+id);
		model.addAttribute("list", memberService.listAll());
		return "updateForm";
	}
	
	@GetMapping("/update")
	public String update(Model model, Member member) {
		memberService.update(member);
		model.addAttribute("list", memberService.listAll());
		return "updateForm";
	}
	
	@GetMapping("/HelloTest")
	@ResponseBody
	public String HelloString() {
		
		return "hello dkdkdk";
	}
}



