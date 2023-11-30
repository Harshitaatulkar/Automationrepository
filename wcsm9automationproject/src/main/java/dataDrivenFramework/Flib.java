package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readExcelData(String excelPath,String sheetName, int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
    FileInputStream fis = new FileInputStream(excelPath); //fileinput is class
    Workbook wb = WorkbookFactory.create(fis); //workbbok is interface
    Sheet sheet = wb.getSheet(sheetName); //sheet is interafce
    Row row = sheet.getRow(rowNo); //row is interface
    Cell cell = row.getCell(cellNo); //cell is interface
    String data = cell.getStringCellValue(); //string is class
	return data;
  
}
	public void WriteExcelData(String excelPath,String sheetName,int rowNo,int cellNo,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
	    Row row = sheet.getRow(rowNo);
	    Cell cell = row.createCell(cellNo);
	    cell.setCellValue(data);
	     
	    FileOutputStream fos = new FileOutputStream(excelPath);
	    wb.write(fos);
	}
	public int rowCount(String excelPath,String sheetName) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
	    Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;	
		
	}
	

	
	
	
	
	
}
