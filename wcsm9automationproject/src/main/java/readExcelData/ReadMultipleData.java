package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// provide the path of excel file
		   FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		   //to make the file ready to load/read
		   Workbook wb = WorkbookFactory.create(fis);
		   //to get into particular sheet
		   Sheet sheet = wb.getSheet("IPLTeam");
		   //to get the number of rows
		   int rc = sheet.getLastRowNum();
		   
		   for(int i=1;i<=rc;i++)
		   {
			  
			   Row row1 = sheet.getRow(i);
			   Cell cell1 = row1.getCell(0);
			   String data = cell1.getStringCellValue();
			   System.out.println(data);
			   
		   }

	}

}
