package Testng;

import org.testng.annotations.Test;
//default priority=0
public class UsingPriorityFlag {
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

@Test
public void create()
{
	System.out.println("create");
}
}
