package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDatafromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//convert physical file to java object
		FileInputStream fis=new FileInputStream("./src/test/resources/Multipletestdata.xlsx");
		
		//fetching the workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sh=wb.getSheet("sheet1");
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
			{
				String data=sh.getRow(i).getCell(j).toString();
				System.out.print(data+" ");
			}
			//to iterate in oneline keep syso after innerloop
			System.out.println(" ");
		}
wb.close();
	}

}
