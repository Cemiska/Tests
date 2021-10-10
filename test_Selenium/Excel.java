package test_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {

	public File file;				//postoji fajl
	public FileInputStream fis;		//fajl treba da unosi neke informacije
	public XSSFWorkbook wb;			// unosi se excel dokument
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;	//column
	

	public Excel(String filePath) throws IOException {
		this.file = new File(filePath);
		this.fis = new FileInputStream(file);
		this.wb = new XSSFWorkbook(fis);
	}

	public String getStringData(String sheetName, int rowNumber, int cellNumber) {
		this.sheet = wb.getSheet(sheetName);
		this.row = sheet.getRow(rowNumber);
		this.cell = row.getCell(cellNumber);
		return this.cell.getStringCellValue();
	}
	
	
	public int getIntegerData(String sheetName, int rowNumber, int cellNumber) {
		this.sheet = wb.getSheet(sheetName);
		this.row = sheet.getRow(rowNumber);
		this.cell = row.getCell(cellNumber);
		return (int) this.cell.getNumericCellValue();
	}
	

	public int getLastRowNumber() {
		return sheet.getLastRowNum();
	}

	
	
}
