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
import java.util.Iterator;

public class PdfTest {

    public static void makeRegPDF (Student student, ByteArrayOutputStream stream) {
        String src = "static/RegForms.pdf";

        try {
            //Creates a new pdf doc
            PdfDocument pdfDoc;
            pdfDoc = new PdfDocument(new PdfReader(src), new PdfWriter(stream));
            // Adds content to page

            //student id
            makeTextBox(pdfDoc,student.getStudentId(),95, 684, 127, 16,1);
            makeTextBox(pdfDoc,student.getStudentId(),104, 646, 152, 22,2);
            //Recieved copies of the Gievance Procedures and Veterans Priority of Service form
            makeCheckBox(pdfDoc,student.isRecievGreiveVet(),33,601,5,5,1);
            //Last Name
            makeTextBox(pdfDoc,student.getLastname(),129, 544, 179, 16,1);
            makeTextBox(pdfDoc,student.getLastname(),20, 612, 240, 22,2);
            //First Name
            makeTextBox(pdfDoc,student.getFirstname(),320, 544, 180, 16,1);
            makeTextBox(pdfDoc,student.getFirstname(),278, 619, 241, 22,2);
            //middle initial
            makeTextBox(pdfDoc,student.getMiddleInitial(),505, 544, 48, 16,1);
            makeTextBox(pdfDoc,student.getMiddleInitial(),544, 609, 19, 22,2);
            //Address
            makeTextBox(pdfDoc,student.getAddress(),130,518,365,15,1);
            makeTextBox(pdfDoc,student.getAddress(),55,576,432,22,2);
            //Apt num
            makeTextBox(pdfDoc,student.getAptnum(),504,518,87,15,1);
            makeTextBox(pdfDoc,student.getAptnum(),514,577,70,22,2);
            //City
            makeTextBox(pdfDoc,student.getCity(),127,492,273,15,1);
            makeTextBox(pdfDoc,student.getCity(),55,538,274,22,2);
            //State
            makeTextBox(pdfDoc,student.getState(),412,492,40,15,1);
            makeTextBox(pdfDoc,student.getState(),360,538,34,22,2);
            //Zipcode
            makeTextBox(pdfDoc,student.getZipcode(),488,492,100,14,1);
            makeTextBox(pdfDoc,student.getZipcode(),426,538,160,22,2);
            //Home Phone
            makeTextBox(pdfDoc,student.getHomephone(),127,460,209,16,1);
            makeTextBox(pdfDoc,student.getHomephone(),55,502,174,22,2);
            //Fax
            makeTextBox(pdfDoc,student.getFax(),55,475,174,22,2);
            //Work Phone
            makeTextBox(pdfDoc,student.getWorkPhone(),492,183,88,13,1);
            makeTextBox(pdfDoc,student.getWorkPhone(),263,512,174,22,2);
            //Email
            makeTextBox(pdfDoc,student.getEmail(),379,460,200,16,1);
            makeTextBox(pdfDoc,student.getEmail(),259,477,320,22,2);
            //Attended MC before
            makeTextBox(pdfDoc, student.boolString(student.isAttenMcb4()),142,461,54,13,2);
            //Hear about MC
            makeTextBox(pdfDoc,student.getHearMC(),131,437,460,15,2);
            //Gender
            makeTextBox(pdfDoc,student.getGender(),513,320,66,20,1);
            makeTextBox(pdfDoc,student.getGender(),513,650,61,15,2);
            //Is American Indian
            makeCheckBox(pdfDoc,student.isAmericanIndian(),261,375,6,6,1);
            makeCheckBox(pdfDoc,student.isAmericanIndian(),23,353,6,6,2);
            //Is Hispanic
            makeCheckBox(pdfDoc,student.isHispanic(),185,375,6,6,1);
            makeCheckBox(pdfDoc,student.isHispanic(),122,374,6,6,2);
            //Asian
            makeCheckBox(pdfDoc,student.isAsian(),404,375,6,6,1);
            makeCheckBox(pdfDoc,student.isAsian(),147,353,6,6,2);
            //Black or African American
            makeCheckBox(pdfDoc,student.isBlackAfricanAmerican(),442,375,6,6,1);
            makeCheckBox(pdfDoc,student.isBlackAfricanAmerican(),181,353,6,6,2);
            //Native hawaiian
            makeCheckBox(pdfDoc,student.isHawaiian(),33,365,6,6,1);
            makeCheckBox(pdfDoc,student.isHawaiian(),278,353,6,6,2);
            //White
            makeCheckBox(pdfDoc,student.isWhite(),178,365,6,6,1);
            makeCheckBox(pdfDoc,student.isWhite(),420,353,6,6,2);
            //Us Citizen
            if (student.isCitizen()){
                makeCheckBox(pdfDoc,student.isCitizen(),153,407,6,6,1);
            }else{
                makeCheckBox(pdfDoc,true,153,396,6,6,1);
            }
            makeCheckBox(pdfDoc,student.isCitizen(),24,333,6,6,2);

            //Permanent resident alien
            if(student.isPermanentResidnetAlien()){
                makeCheckBox(pdfDoc,student.isPermanentResidnetAlien(),246,407,6,6,1);
            }else{
                makeCheckBox(pdfDoc,true,246,396,6,6,1);
            }
            makeCheckBox(pdfDoc,student.isPermanentResidnetAlien(),76,333,6,6,2);
            //Md res
            makeCheckBox(pdfDoc,student.isMdRes(),24,307,6,6,2);
            //60 Plus
            makeCheckBox(pdfDoc,student.isSixtyPlus(),24,299,6,6,2);
            //Md National gaurd
            makeCheckBox(pdfDoc,student.isNatGaurd(),24,285,6,6,2);
            //Student has documented disability
            if(student.isHasDisability()){
                makeCheckBox(pdfDoc,student.isHasDisability(),36,407,6,6,1);
            }else{
                    makeCheckBox(pdfDoc,true,36,396,6,6,1);
            }

            //Adds Each Course up to 4
            float val;
            val = 240;
            int counter=0;
            Collection<Course> courses;
            courses = student.getCourses();
            for (Course course : courses) {
                //CRN
                makeTextBox(pdfDoc, course.getCrn(), 22, val, 40, 15, 2);
                //Course Number
                makeTextBox(pdfDoc, course.getCourseNum(), 63, val, 54, 15, 2);
                //Course Title
                makeTextBox(pdfDoc, course.getCourseName(), 118, val, 374, 15, 2);
                //Start-End Date
                makeTextBox(pdfDoc, course.getStartDate() + "|" + course.getEndDate(), 497, val, 95, 15, 2);
                val = val - 16;
                counter++;
                if (counter == 4) {
                    break;
                }
            }
            counter=0;

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
        //Comment out dark gray line when not testing
        pdfc.saveState().setFillColor(Color.DARK_GRAY).rectangle(r).fill().restoreState();
        //pdfc.saveState().setFillColor(Color.WHITE).rectangle(r).fill().restoreState();
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

