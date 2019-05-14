/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajpi_demo;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class ReadPdf
{
	public static void main(String[] args)
	{
		try
		{
			PdfReader pdfReader = new PdfReader("HelloWorld.pdf");
			PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream("Rewritten HelloWorld.pdf"));
			PdfContentByte content = pdfStamper.getUnderContent(1);//1 for the first page
			BaseFont bf = BaseFont.createFont(BaseFont.TIMES_ITALIC, BaseFont.CP1250, BaseFont.EMBEDDED);
			content.beginText();
			content.setFontAndSize(bf, 18);
			content.showTextAligned(PdfContentByte.ALIGN_CENTER, "JavaCodeGeeks", 250,650,0);
			content.endText();
			
			pdfStamper.close();
			pdfReader.close();
		}
		catch (IOException | DocumentException e)
		{
			e.printStackTrace();
		}
        }
}
