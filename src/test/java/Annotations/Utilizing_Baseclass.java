package Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;

public class Utilizing_Baseclass extends BaseClass {
//methods will execute based on asci value here m is first then t so m will execute first
//in methods we can do create object ,modify and delete scenarios
	@Test
	public void testscript()
	{
		Reporter.log("Create a product" ,true);
	}
	
	@Test
	public void modify()
	{
		Reporter.log("modify the product",true);
	}
}
