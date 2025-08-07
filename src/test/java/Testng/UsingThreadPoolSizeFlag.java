package Testng;

import org.testng.annotations.Test;

public class UsingThreadPoolSizeFlag {

	@Test
	public void shinchan()
	{
		System.out.println("shinchan");
	}
	
	@Test(threadPoolSize=3,invocationCount=4)
	public void doreamon()
	{
		System.out.println("doreamon");
	
}
}
