package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		     // to provide the file path
		       FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		     // make the file ready to read
		       Thread.sleep(2000);
		       Workbook wb = WorkbookFactory.create(fis);
		     // read methods
		      Sheet sheet = wb.getSheet("IPLTeam");
		      Row row = sheet.getRow(1);
		      Cell cell = row.getCell(0);
		      String data = cell.getStringCellValue();
		      System.out.println(data);
		      
		       
	}

}
