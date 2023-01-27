package com.example.vlogs.test;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.html.HTML;

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;

public class Test {

	public static void main(String[] args) throws IOException{
		File outputFile= new File("C:\\Users\\Abhishek Ranjan\\OneDrive\\Desktop\\generate.pdf");
//		HtmlConverter.convertToPdf("<hi>Here</h1>", new PdfWriter(outputFile));
		HtmlConverter.convertToPdf(new File("C:\\Users\\Abhishek Ranjan\\OneDrive\\Desktop\\NewFile.html"), outputFile);
		try {
			Desktop.getDesktop().open(outputFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		Test t= new Test();
//		String generatePdf = t.generatePdf();
//		System.out.println(generatePdf);
	}

	public String generatePdf() {
		try {

			String sourcePath = "C:/Users/Abhishek Ranjan/OneDrive/Desktop/pdf/";

			File isDir = new File(sourcePath);
			if (!isDir.exists()) {
				new File(sourcePath).mkdirs();
			}

			String filePath = sourcePath + "my.pdf";

			Document document = new Document(PageSize.A4);
//			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
//			String imageFile = "/getepayPortal/resources/mintos_themeforest_pack/dist/img/getepay.png";
//			Image image1 = Image.getInstance(imageFile);
//			document.add(image1);

			Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			fontTiltle.setSize(20);
			Paragraph paragraph = new Paragraph();
			paragraph = new Paragraph("Transaction Report", fontTiltle);
			paragraph.setAlignment(Paragraph.ALIGN_CENTER);
			document.add(paragraph);
			
			PdfPTable table1 = new PdfPTable(2);
			table1.setWidthPercentage(100f);
			table1.setWidths(new int[] { 5, 5 });
			
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(100f);
			table.setWidths(new int[] { 3, 3, 3, 3 });
			table.setSpacingBefore(5);
			
			PdfPCell cell = new PdfPCell();
			PdfPCell cell1 = new PdfPCell();
			
			cell.setBackgroundColor(CMYKColor.BLUE);
			cell.setPadding(5);
			cell1.setBackgroundColor(CMYKColor.CYAN);
			cell1.setPadding(5);
			Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			font.setColor(CMYKColor.WHITE);
			Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			font1.setColor(CMYKColor.RED);
			Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			font2.setColor(CMYKColor.GREEN);
			Font font3 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			font3.setColor(CMYKColor.WHITE);
			font3.setSize(20);
			Font font4 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			font4.setColor(CMYKColor.BLACK);
			
			Paragraph paragraph1 = new Paragraph(" ", fontTiltle);
			paragraph1.setAlignment(Paragraph.ALIGN_CENTER);
			document.add(paragraph1);
			cell.setPhrase(new Phrase("You Send : ", font3));
			table1.addCell(cell);
			cell.setPhrase(
					new Phrase("You Recived : ", font3));
			table1.addCell(cell);
			cell.setPhrase(new Phrase("S.No", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("Name", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("Date", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("amount", font));
			table.addCell(cell);
			int sn = 0;
			while(sn<10){
			cell1.setPhrase(new Phrase("a", font4));
			table.addCell(cell1);
			table.addCell("b");
			table.addCell("c");
			table.addCell("d");
			sn++;
			}
			document.add(table1);
			document.add(table);
			document.close();
			return filePath;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
