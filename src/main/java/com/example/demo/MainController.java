package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.io.*;


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

			studentrepository.save(student);
			//model.addAttribute(student);
			return"printRegistration";
		}
	}
	@RequestMapping(value = "/download", method = RequestMethod.POST)
	public @ResponseBody String download(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("currStudent")Student student) throws IOException {

		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
            test.makeRegPDF(student,baos);
//
			// setting some response headers
			response.setHeader("Expires", "0");
			response.setHeader("Cache-Control",
					"must-revalidate, post-check=0, pre-check=0");
			response.setHeader("Pragma", "public");
			// setting the content type
			response.setContentType("application/pdf");
			// the contentlength
			response.setContentLength(baos.size());
			// write ByteArrayOutputStream to the ServletOutputStream
			OutputStream os = response.getOutputStream();
			baos.writeTo(os);
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "printerPage";
	}
}