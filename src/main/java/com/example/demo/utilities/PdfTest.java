package com.example.demo.utilities;

import com.example.demo.models.Course;
import com.example.demo.models.Student;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.VerticalAlignment;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PdfTest {

    public static void makeRegPDF (Student student, ByteArrayOutputStream stream) {
        String studentName=student.getFirstname()+student.getLastname();
        String home = System.getProperty("user.home");
        String src = "static/CyberRegForm.pdf";

       // String dest = home+"/Downloads/"+studentName+"RegForm.pdf";
        try {
            //Creates a new pdf doc
            PdfDocument pdfDoc;
                pdfDoc = new PdfDocument(new PdfReader(src), new PdfWriter(stream));
            // Adds content to page
            System.out.print(student.getFirstname());

            //student id
            makeTextBox(pdfDoc,student.getStudentId(),104, 646, 152, 22,1);
            //Last Name
            makeTextBox(pdfDoc,student.getLastname(),20, 612, 240, 22,1);
            //First Name
            makeTextBox(pdfDoc,student.getFirstname(),278, 619, 241, 22,1);
            //middle initial
            makeTextBox(pdfDoc,student.getMiddleInitial(),544, 609, 19, 22,1);
            //Address
            makeTextBox(pdfDoc,student.getAddress(),55,576,432,22,1);
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
            //Attended MC before
            makeTextBox(pdfDoc, student.boolString(student.isAttenMcb4()),142,461,54,13,1);
            //Hear about MC
            makeTextBox(pdfDoc,student.getHearMC(),131,437,460,15,1);
            //Gender
            makeTextBox(pdfDoc,student.getGender(),513,647,61,15,1);
            //Is American Indian
            makeCheckBox(pdfDoc,student.isAmericanIndian(),23,353,6,6,1);
            //Is Hispanic
            makeCheckBox(pdfDoc,student.isHispanic(),122,374,6,6,1);
            //Asian
            makeCheckBox(pdfDoc,student.isAsian(),147,353,6,6,1);
            //Black or African American
            makeCheckBox(pdfDoc,student.isBlackAfricanAmerican(),181,353,6,6,1);
            //Native hawaiian
            makeCheckBox(pdfDoc,student.isHawaiian(),278,353,6,6,1);
            //White
            makeCheckBox(pdfDoc,student.isWhite(),420,353,6,6,1);
            //Us Citizen
            makeCheckBox(pdfDoc,student.isCitizen(),24,333,6,6,1);
            //Permanent resident alien
            makeCheckBox(pdfDoc,student.isPermanentResidnetAlien(),76,333,6,6,1);
            //Md res
            makeCheckBox(pdfDoc,student.isMdRes(),24,307,6,6,1);
            //60 Plus
            makeCheckBox(pdfDoc,student.isSixtyPlus(),24,299,6,6,1);
            //Md National gaurd
            makeCheckBox(pdfDoc,student.isNatGaurd(),24,285,6,6,1);

            Collection<Course> courses = student.getCourses();
            for(Course course:courses){
                makeTextBox(pdfDoc,course.getCourseNum(),22,240,40,15,1);
                makeTextBox(pdfDoc,course.getCrn(),64,240,53,15,1);
                makeTextBox(pdfDoc,"APG007",100,240,53,15,1);
            }

            makeTextBox(pdfDoc,"APG007",200,240,53,15,1);



            pdfDoc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static double mm2pt(int mm){
            return mm*2.83;
        }
        //Makes a text box, takes in a pdfdoc, statement, x x-coord, y y-coord, w width,h height, and page number
        private static void makeTextBox(PdfDocument pdfDoc,String paragraph,float x, float y, float w, float h, int pageNum ){
        if(paragraph==null){
            paragraph="";
        }
            Paragraph p = new Paragraph(paragraph);
           // p.setBorder(new SolidBorder(Color.CYAN,1,1));
            p.setVerticalAlignment(VerticalAlignment.MIDDLE);
          //  p.setHorizontalAlignment(HorizontalAlignment.CENTER);
            p.setFontSize(9);
            Rectangle r = new Rectangle( x,y,w,h);
            PdfCanvas pdfc = new PdfCanvas(pdfDoc.getPage(pageNum));
            pdfc.saveState().setFillColor(Color.WHITE).rectangle(r).fill().restoreState();
            Canvas c = new Canvas(pdfc,pdfDoc,r);
            c.add(p);
            c.close();
        }

        //Makes a check box at location, if boolean statement is true fill of box is set to gray
        private static void makeCheckBox(PdfDocument pdfDoc,boolean bool,float x, float y, float w, float h, int pageNum ){
        Rectangle r = new Rectangle(x,y,w,h);
        PdfCanvas canvas = new PdfCanvas(pdfDoc.getPage(pageNum));
        if(bool) {
            canvas.saveState().setFillColor(Color.DARK_GRAY).rectangle(r).fill().restoreState();
        }else if(!bool){
            canvas.saveState().setFillColor(Color.WHITE).rectangle(r).fill().restoreState();
        }else{
            canvas.saveState().setFillColor(Color.WHITE).rectangle(r).fill().restoreState();

        }
      }
    }
