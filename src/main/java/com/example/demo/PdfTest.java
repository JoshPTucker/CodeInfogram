package com.example.demo;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfButtonFormField;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfString;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;

import com.itextpdf.kernel.pdf.annot.PdfAnnotation;
import com.itextpdf.kernel.pdf.annot.PdfTextAnnotation;
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
            PdfReader reader = new PdfReader(src);
            PdfDocument pdfDoc = new PdfDocument( reader);


                pdfDoc = new PdfDocument(new PdfReader(src), new PdfWriter(dest));
                PdfAnnotation ann = new PdfTextAnnotation(new Rectangle(13, 824, 18, 3))
                        .setColor(Color.GREEN)
                        .setTitle(new PdfString("iText"))
                        .setContents("With iText, "
                                + "you can truly take your documentation needs to the next level.")
                        .setOpen(true);
                pdfDoc.getFirstPage().addAnnotation(ann);
            // add content
            pdfDoc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

