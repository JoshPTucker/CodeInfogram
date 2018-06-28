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

            //student id
            makeTextBox(pdfDoc,student.getStudentId(),104, 647, 152, 22,1);
            //Last Name
            makeTextBox(pdfDoc,student.getLastname(),20, 612, 240, 22,1);
            //First Name
            makeTextBox(pdfDoc,student.getFirstname(),278, 619, 241, 22,1);
            //middle initial
            makeTextBox(pdfDoc,student.getMiddleInitial(),544, 609, 19, 22,1);
            //Address
            makeTextBox(pdfDoc,student.getAddress(),55,577,432,22,1);
            //Apt num
            makeTextBox(pdfDoc,student.getAptnum(),514,577,70,22,1);
            //City
            makeTextBox(pdfDoc,student.getCity(),55,538,274,22,1);
            //Home Phone
            makeTextBox(pdfDoc,student.getHomephone(),55,502,174,22,1);
            //Fax
            makeTextBox(pdfDoc,student.getFax(),55,475,174,22,1);
            //State
            makeTextBox(pdfDoc,student.getState(),360,538,34,22,1);
            //Zipcode
            makeTextBox(pdfDoc,student.getZipcode(),426,538,160,22,1);
            //Work Phone
            makeTextBox(pdfDoc,student.getWorkPhone(),263,512,174,22,1);
            //Email
            makeTextBox(pdfDoc,student.getEmail(),259,477,320,22,1);


            pdfDoc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static double mm2pt(int mm){
        double pt= mm*2.83;
         return pt;
        }

        public static void makeTextBox(PdfDocument pdfDoc,String paragraph,float x, float y, float w, float h, int pageNum ){
            Paragraph p = new Paragraph(paragraph);
            Rectangle r = new Rectangle( x,y,w,h);
            PdfCanvas pdfc = new PdfCanvas(pdfDoc.getPage(pageNum));
            pdfc.saveState().setFillColor(Color.WHITE).rectangle(r).fill().restoreState();
            Canvas c = new Canvas(pdfc,pdfDoc,r);
            c.add(p);
            c.close();
        }
    }

