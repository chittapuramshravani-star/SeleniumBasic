package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchingdatafromexcelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//convert physical file to java object
		FileInputStream fis=new FileInputStream("./src/test/resources/Testdata.xlsx");
		
		//fetching the workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sh=wb.getSheet("Sheet1");
		
		//fetch the row
		Row r=sh.getRow(1);
		
		//fetch the cell
		Cell c=r.getCell(0);
		
		Cell num_c=r.getCell(1);
		
		//fetch the data
		String data=c.getStringCellValue();
		
		//fetch the numeric data 
		double numData=num_c.getNumericCellValue();
		
		//fetch the data in string format irrespective with the datatype stored in excel
		String datanum=num_c.toString();
		System.out.println(data+" "+datanum);
		
		//close the excel workbook
		wb.close();

	}

}
