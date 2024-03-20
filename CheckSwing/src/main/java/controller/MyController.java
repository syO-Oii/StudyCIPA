package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dto.LoginRequest;
import service.GetMemberNumService;

@Controller
public class MyController {
	
	private GetMemberNumService getMemberService;
	
	// 포워딩 작업
	@GetMapping("/")
	public String root() {
		return "index";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/login")
	public String login() {
		return "inputForm";
	}
	
//	@GetMapping("/result")
//	public String result(HttpServletRequest request) {
//		String id = request.getParameter("id");
//		String email = request.getParameter("email");
//		System.out.println("id : " + id + ", email : " + email);
//		return "result";
//	}
	
	// 위 코드랑 동일한 결과. 다만 아래 코드를 더 자주 이용한다.
	/*
	 * @GetMapping("/result") public String result(@RequestParam String id,
	 * 
	 * @RequestParam String email) { System.out.println(id + ", " + email); return
	 * "result"; }
	 */
	
	// 가장 스마트한 방식
	@GetMapping("/result")
	public String result(LoginRequest loginRequest, Model model) {
		String id = loginRequest.getId();
		model.addAttribute("id", id);
		return "result";
	}
	
	@GetMapping("/move")
	public String move(){
		return "redirect:/";
	}
}
