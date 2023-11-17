package com.yedam.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String viewTest(Model model) {
		model.addAttribute("info", "타임리프가 적용된 경우");
		return "viewTest";
	}
	
	@GetMapping("/selectInfo")
	public String viewSelectInfo(Model model) {
		model.addAttribute("info", "링크 테스트합니다.");
		return "selectInfo";
	}
	
	@GetMapping("/editor")
	public String editorTest() {
		return "editor";
	}
}
