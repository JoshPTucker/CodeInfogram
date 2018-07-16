package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.example.demo.models.Course;
import com.example.demo.models.Student;
import com.example.demo.services.DataLoader;
import com.example.demo.services.UserService;
import com.example.demo.utilities.CourseRepository;
import com.example.demo.utilities.PdfTest;
import com.example.demo.utilities.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.io.*;


@Controller
public class MainController {
	@Autowired
	private UserService userService;
	@Autowired
	private StudentRepository studentrepository;
	@Autowired
	private CourseRepository courserepo;

	DataLoader loader = new DataLoader();

	PdfTest test = new PdfTest();

	@RequestMapping("/")
	public String index(){
		return "index";
	}

	@GetMapping("/studentform")
	public String studentform(Model model)
	{
		model.addAttribute("student", new Student());
		model.addAttribute("actCourses",courserepo.findCoursesByActiveIsTrue());
		return "studentform";
	}
	
	@PostMapping("/studentform")
	public String displayform( @Valid@ModelAttribute("student")Student student, BindingResult result, Model model) {
		//String name= student.getFirstname()+student.getLastname();
		if(result.hasErrors()) {
			return "studentform";
		}else {

			studentrepository.save(student);
			//model.addAttribute(student);
			return"printRegistration";
		}
	}

	@GetMapping("/addCourse")
	public String addcourse(Model model){
		model.addAttribute("course", new Course());
		return "addCourse";
	}
	@PostMapping("/addCourse")
	public String showCourse(@Valid@ModelAttribute("course")Course course, BindingResult result, Model model){

		if(result.hasErrors()) {
			return "addCourse";
		}else {
			course.setActive(true);
			courserepo.save(course);
			model.addAttribute("allCourses", courserepo.findAll());
			return "courseList";
		}

	}
	@RequestMapping("/login")
	public  String login(){
		return"login";
	}

	@RequestMapping(value = "/download", method = RequestMethod.POST)
	public @ResponseBody String download(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("currStudent")Student student) throws IOException {

		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
            test.makeRegPDF(student, baos);

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
        studentrepository.delete(student);
		return "printerPage";
	}

}