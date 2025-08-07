package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//convert physical file to java object
				FileInputStream fis=new FileInputStream("./src/test/resources/Testdata.xlsx");
				
				//fetching the workbook
				Workbook wb=WorkbookFactory.create(fis);
				
				//fetch the sheet
				Sheet sh=wb.getSheet("Testdata");
				
				//fetch the row
				Row r=sh.getRow(0);
				
				//fetch the cell
				Cell c=r.getCell(0);
				
				//fetch the data
				String data=c.getStringCellValue();
				System.out.println(data);
				
				//close the excel workbook
				wb.close();
	}

}
