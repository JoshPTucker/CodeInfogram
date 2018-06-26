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
import com.itextpdf.test.annotations.type.SampleTest;
import org.junit.experimental.categories.Category;

import java.io.File;
import java.io.IOException;

public class PdfTest {

    public void makePDF (String studentName) {
        String home = System.getProperty("user.home");
        String src = home+"/Downloads/CyberRegForm.pdf";
        String dest = home+"/Downloads/"+studentName+"RegForm.pdf";
        try {
            PdfDocument pdfDoc;
                pdfDoc = new PdfDocument(new PdfReader(src), new PdfWriter(dest));
            // add content
            PdfCanvas canvas = new PdfCanvas(pdfDoc.getPage(1));
            Color greenColor = new DeviceCmyk(1.f, 0.f, 1.f, 0.176f);
            canvas.setFillColor(greenColor);
            canvas.rectangle(103, 651, 152.82, 22);
            canvas.fillStroke();

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

