package com.example.demo;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfButtonFormField;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceCmyk;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfString;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;

import com.itextpdf.kernel.pdf.annot.PdfAnnotation;
import com.itextpdf.kernel.pdf.annot.PdfTextAnnotation;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.test.annotations.type.SampleTest;
import org.junit.experimental.categories.Category;

import java.io.File;
import java.io.IOException;

public class PdfTest {

    public void makePDF (Student student) {
        String studentName=student.getFirstname()+student.getLastname();
        String home = System.getProperty("user.home");
        String src = "static/CyberRegForm.pdf";
        String dest = home+"/Downloads/"+studentName+"RegForm.pdf";
        try {
            //Creates a new pdf doc
            PdfDocument pdfDoc;
                pdfDoc = new PdfDocument(new PdfReader(src), new PdfWriter(dest));
            // Adds content to page

            //Handles student id
            Paragraph paragraph1 = new Paragraph(student.getStudentId());
            Rectangle rectangle1 = new Rectangle(104, 649, 152, 22);
            PdfCanvas pdfcanvas = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas.saveState().setFillColor(Color.WHITE).rectangle(rectangle1).fill().restoreState();
            Canvas canvas1 = new Canvas(pdfcanvas,pdfDoc,rectangle1);
            canvas1.add(paragraph1);
            canvas1.close();

            //Handles B-Day
            Paragraph paragraph2 = new Paragraph(student.getLastname());
            Rectangle rectangle2 = new Rectangle(300, 649, 152, 22);
            PdfCanvas pdfcanvas2 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas2.saveState().setFillColor(Color.WHITE).rectangle(rectangle2).fill().restoreState();
            Canvas canvas2 = new Canvas(pdfcanvas2,pdfDoc,rectangle2);
            canvas2.add(paragraph2);
            canvas2.close();
            pdfDoc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static double mm2pt(int mm){
        double pt= mm*2.83;
         return pt;
        }

    }

