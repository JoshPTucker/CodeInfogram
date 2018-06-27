package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@Autowired
	private StudentRepository studentrepository;

	PdfTest test = new PdfTest();

	@GetMapping("/studentform")
	public String studentform(Model model)
	{
		model.addAttribute("student", new Student());
		return "studentform";
	}
	
	@PostMapping("/studentform")
	public String displayform( @Valid@ModelAttribute("student")Student student, BindingResult result, Model model) {
		String name= student.getFirstname()+student.getLastname();
		if(result.hasErrors()) {
			return "studentform";
		}else {
			test.makeRegPDF(student);
			studentrepository.save(student);
			//model.addAttribute(student);
			return"printRegistration";
		}
	}
}