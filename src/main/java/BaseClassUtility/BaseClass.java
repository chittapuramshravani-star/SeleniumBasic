package BaseClassUtility;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void bs()
	{
		//instead of using syso use reporterlog and to print in console use true
		Reporter.log("BS-connect with the database",true);
	}
	@AfterSuite
	public void as()
	{
		Reporter.log("AS-Disconnect with the database",true);
	}
	@BeforeTest
	public void bt()
	{
		Reporter.log("BT-configure the parallel execution",true);
	}
	@BeforeClass
	public void bc()
	{
		Reporter.log("BC-Launch the browser",true);
	}
	@AfterMethod
	public void am()
	{
		Reporter.log("AM-Logout",true);
	}
	@AfterTest
	public void at()
	{
		Reporter.log("AT-close the parallel execution",true);
	}
	@BeforeMethod
	public void bm()
	{
		Reporter.log("BM-login",true);
	}
	@AfterClass
	public void af()
	{
		Reporter.log("AF-Quit the browser",true);
	}
}
