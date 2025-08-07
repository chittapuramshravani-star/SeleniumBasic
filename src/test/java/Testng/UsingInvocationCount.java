package Testng;

import org.testng.annotations.Test;

public class UsingInvocationCount {

	@Test(priority=2)
	public void login()
	{
	System.out.println("login");	
	}
	
	@Test(priority=1)
	public void register()
	{
		System.out.println("register");
	}
	
	@Test(invocationCount=3,priority=3)
	public void create()
	{
		System.out.println("create");
	}
	}
