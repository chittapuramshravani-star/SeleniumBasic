package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingMultipleSetOfData {

		@Test(dataProvider="data")
		public void loginTestScript(String un,String pswd)
		{
		
			System.out.println(un+pswd);
		}
		
		//DataProviders is used to store multiple sets of data
		//data should be stored in 2D object array
		//create empty object array ovject
		@DataProvider
		public Object[][] data()
		{
			Object[][] obj=new Object[3][2];
			
			obj[0][0]="User1";
			obj[0][1]="Password1";
			
			obj[0][0]="User2";
			obj[0][1]="Password2";
			
			obj[0][0]="User3";
			obj[0][1]="Password3";
			
			return obj;
		}
}
