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

    public static void makeRegPDF (Student student) {
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
            Rectangle rectangle1 = new Rectangle(104, 647, 152, 22);
            PdfCanvas pdfcanvas = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas.saveState().setFillColor(Color.WHITE).rectangle(rectangle1).fill().restoreState();
            Canvas canvas1 = new Canvas(pdfcanvas,pdfDoc,rectangle1);
            canvas1.add(paragraph1);
            canvas1.close();

            //Handles Last Name
            Paragraph paragraph2 = new Paragraph(student.getLastname());
            Rectangle rectangle2 = new Rectangle(20, 612, 240, 22);
            PdfCanvas pdfcanvas2 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas2.saveState().setFillColor(Color.WHITE).rectangle(rectangle2).fill().restoreState();
            Canvas canvas2 = new Canvas(pdfcanvas2,pdfDoc,rectangle2);
            canvas2.add(paragraph2);
            canvas2.close();

            //Handles First Name
            Paragraph paragraph3 = new Paragraph(student.getFirstname());
            Rectangle rectangle3 = new Rectangle(278, 619, 241, 22);
            PdfCanvas pdfcanvas3 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas3.saveState().setFillColor(Color.WHITE).rectangle(rectangle3).fill().restoreState();
            Canvas canvas3 = new Canvas(pdfcanvas3,pdfDoc,rectangle3);
            canvas3.add(paragraph3);
            canvas3.close();

            //Handles middle initial
            Paragraph paragraph4 = new Paragraph(student.getMiddleInitial());
            Rectangle rectangle4 = new Rectangle(544, 609, 19, 22);
            PdfCanvas pdfcanvas4 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas4.saveState().setFillColor(Color.WHITE).rectangle(rectangle4).fill().restoreState();
            Canvas canvas4 = new Canvas(pdfcanvas4,pdfDoc,rectangle4);
            canvas4.add(paragraph4);
            canvas4.close();

            //Handles Address
            Paragraph paragraph5 = new Paragraph(student.getAddress());
            Rectangle rectangle5 = new Rectangle(55, 577, 432, 22);
            PdfCanvas pdfcanvas5 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas5.saveState().setFillColor(Color.WHITE).rectangle(rectangle5).fill().restoreState();
            Canvas canvas5 = new Canvas(pdfcanvas5,pdfDoc,rectangle5);
            canvas5.add(paragraph5);
            canvas5.close();

            //Handles Apt num
            Paragraph paragraph6 = new Paragraph(student.getAptnum());
            Rectangle rectangle6 = new Rectangle(514, 577, 70, 22);
            PdfCanvas pdfcanvas6 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas6.saveState().setFillColor(Color.WHITE).rectangle(rectangle6).fill().restoreState();
            Canvas canvas6 = new Canvas(pdfcanvas6,pdfDoc,rectangle6);
            canvas6.add(paragraph6);
            canvas6.close();

            //City
            Paragraph paragraph7 = new Paragraph(student.getCity());
            Rectangle rectangle7 = new Rectangle( 55,538,274,22);
            PdfCanvas pdfcanvas7 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas7.saveState().setFillColor(Color.WHITE).rectangle(rectangle7).fill().restoreState();
            Canvas canvas7 = new Canvas(pdfcanvas7,pdfDoc,rectangle7);
            canvas7.add(paragraph7);
            canvas7.close();

            //Home Phone
            Paragraph paragraph8 = new Paragraph(student.getHomephone());
            Rectangle rectangle8 = new Rectangle(55,502,174,22);
            PdfCanvas pdfcanvas8 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas8.saveState().setFillColor(Color.WHITE).rectangle(rectangle8).fill().restoreState();
            Canvas canvas8 = new Canvas(pdfcanvas8,pdfDoc,rectangle8);
            canvas8.add(paragraph8);
            canvas8.close();

            //Fax
            Paragraph paragraph9 = new Paragraph(student.getFax());
            Rectangle rectangle9 = new Rectangle(55,475,174,22);
            PdfCanvas pdfcanvas9 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas9.saveState().setFillColor(Color.WHITE).rectangle(rectangle9).fill().restoreState();
            Canvas canvas9 = new Canvas(pdfcanvas9,pdfDoc,rectangle9);
            canvas9.add(paragraph9);
            canvas9.close();

            //State
            Paragraph paragraph10 = new Paragraph(student.getState());
            Rectangle rectangle10 = new Rectangle( 360,538,34,22);
            PdfCanvas pdfcanvas10 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas10.saveState().setFillColor(Color.WHITE).rectangle(rectangle10).fill().restoreState();
            Canvas canvas10 = new Canvas(pdfcanvas10,pdfDoc,rectangle10);
            canvas10.add(paragraph10);
            canvas10.close();

            //Zipcode
            Paragraph paragraph11 = new Paragraph(student.getZipcode());
            Rectangle rectangle11 = new Rectangle( 426,538,160,22);
            PdfCanvas pdfcanvas11 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas11.saveState().setFillColor(Color.WHITE).rectangle(rectangle11).fill().restoreState();
            Canvas canvas11 = new Canvas(pdfcanvas11,pdfDoc,rectangle11);
            canvas11.add(paragraph11);
            canvas11.close();

            //Work Phone
            Paragraph paragraph12 = new Paragraph(student.getWorkPhone());
            Rectangle rectangle12 = new Rectangle( 263,512,174,22);
            PdfCanvas pdfcanvas12 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas12.saveState().setFillColor(Color.WHITE).rectangle(rectangle12).fill().restoreState();
            Canvas canvas12 = new Canvas(pdfcanvas12,pdfDoc,rectangle12);
            canvas12.add(paragraph12);
            canvas12.close();

            //Email
            Paragraph paragraph13 = new Paragraph(student.getEmail());
            Rectangle rectangle13 = new Rectangle( 259,477,320,22);
            PdfCanvas pdfcanvas13 = new PdfCanvas(pdfDoc.getPage(1));
            pdfcanvas13.saveState().setFillColor(Color.WHITE).rectangle(rectangle13).fill().restoreState();
            Canvas canvas13 = new Canvas(pdfcanvas13,pdfDoc,rectangle13);
            canvas13.add(paragraph13);
            canvas13.close();

            pdfDoc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static double mm2pt(int mm){
        double pt= mm*2.83;
         return pt;
        }

        public static void
    }

