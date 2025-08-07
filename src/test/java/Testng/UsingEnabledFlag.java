package Testng;

import org.testng.annotations.Test;

public class UsingEnabledFlag {

	@Test
	public void tom()
	{
	System.out.println("tom");
	}
	
	@Test(enabled=false)
	public void jerry()
	{
		System.out.println("jerry");
	}
}
