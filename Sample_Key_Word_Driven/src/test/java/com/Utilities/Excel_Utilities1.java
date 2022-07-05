package com.Utilities;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel_Utilities1 {
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	FileInputStream file; 
	XSSFCell cell;
public void readExcelFile(String location) throws IOException {
		 file = new FileInputStream(location);
			 workbook = new XSSFWorkbook(file);
			 sheet = workbook.getSheetAt(0);
		
	}
	
	public String getvalueFromExcel(int row, int column){

		 cell = sheet.getRow(0).getCell(3);
		String cellvalue = cell.getStringCellValue();
		return cellvalue;
	}

}