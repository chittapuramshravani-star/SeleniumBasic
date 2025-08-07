package Testng;

import org.testng.annotations.Test;

public class UsingDependsonMethodFlag {
	@Test
	public void java()
	{
	System.out.println("java");
	}
	
	@Test(dependsOnMethods="java")
	public void Automation()
	{
		System.out.println("selenium");
	}
}
