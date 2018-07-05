package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

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
	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public ResponseEntity download(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String filePath = "/downloads";

		try {
			// Get the text that will be added to the PDF
			String text = request.getParameter("text");
			if (text == null || text.trim().length() == 0) {
				text = "You didn't enter any text.";
			}
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PdfDocument pdfDoc = new PdfDocument(new PdfWriter(baos));
			Document doc = new Document(pdfDoc);
			doc.add(new Paragraph(String.format(
					"You have submitted the following text using the %s method:",
					request.getMethod())));
			doc.add(new Paragraph(text));
			doc.close();

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


		InputStream inputStream = new FileInputStream(new File(filePath));
		InputStreamResource inputStreamResource = new InputStreamResource(inputStream);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentLength(Files.size(Paths.get(filePath)));
		return new ResponseEntity(inputStreamResource, headers, HttpStatus.OK);
	}
}