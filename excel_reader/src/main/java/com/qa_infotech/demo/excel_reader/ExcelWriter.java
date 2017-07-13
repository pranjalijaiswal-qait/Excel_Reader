package com.qa_infotech.demo.excel_reader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	 
	
	public class ExcelWriter {
	 
	    public static void main(String[] args) throws IOException {
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("example1");
	         
	        Object[][] data = {
	                {"Pranjali","Jaiswal"},
	                {"Pooja","Bhagwani"}
	                	        };
	 
	        int rowCount = 0;
	         
	        for (Object[] d : data) {
	            Row row = sheet.createRow(++rowCount);
	             
	            int columnCount = 0;
	             
	            for (Object field : d) {
	                Cell cell = row.createCell(++columnCount);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	             
	        }
	        
	        Files.lines(Paths.get("C://users//pranjalijaiswal//example1.xls"));
	       // Files.lines(new File("example1.xls").toPath()) .map(s -> s.trim()) .filter(s -> !s.isEmpty()) .forEach(System.out::println);

	       // Read more: http://javarevisited.blogspot.com/2015/07/3-ways-to-read-file-line-by-line-in.html#ixzz4k91vZZOL
	         
	        //try (FileOutputStream outputStream = new FileOutputStream("wri")) {
	            //workbook.write(outputStream);
	        }
	    }


