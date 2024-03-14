package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import dto.LoginRequest;


@Controller
public class MyController {
	
	// 포워딩 작업
	@GetMapping("/")
	public String root() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login(@ModelAttribute LoginRequest loginRequest, Model model) {
		String id = loginRequest.getId();
		String password = loginRequest.getPassword();
		model.addAttribute("id", id);
		model.addAttribute("password", password);

		return "result";
	}
	
	@GetMapping("/home")
	public String home() {
		return "redirect:/";
	}
}
