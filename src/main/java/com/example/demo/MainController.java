package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@Autowired
	private StudentRepository studentrepository;

	@GetMapping("/studentform")
	public String studentform(Model model)
	{
		model.addAttribute("student", new Student());
		return "studentform";
	}
	@PostMapping("/studentform")
	public String dgsg() {
		return "";
	}
}
