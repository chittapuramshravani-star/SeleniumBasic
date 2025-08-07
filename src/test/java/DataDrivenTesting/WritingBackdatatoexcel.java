package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingBackdatatoexcel {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		//convert physical file to java object
				FileInputStream fis=new FileInputStream("C:\\Users\\sweth\\Desktop\\Testdata.xlsx");
				
				//fetching the workbook
				Workbook wb=WorkbookFactory.create(fis);
				
				//fetch the sheet
				Sheet sh=wb.getSheet("Sheet1");
				
				//fetch the row
				//Row r=sh.getRow(1);
				
				
				//create the row
				Row r=sh.createRow(7);
				//create the cell
				Cell c=r.createCell(4);
				
				//write the data
				c.setCellValue("selenium");
				
				//convertng obj to physical file and saving the file
				//we used becoz after updating workbook
				FileOutputStream fos=new FileOutputStream("C:\\Users\\sweth\\Desktop\\Testdata.xlsx");
	//to save workbook we use write after making changes
wb.write(fos);
	}

}
