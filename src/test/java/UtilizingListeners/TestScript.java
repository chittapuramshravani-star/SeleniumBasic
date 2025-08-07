package UtilizingListeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;

//here we can do listeners by using @Listeners or by making use of listeners in listeners.xmlfile
//@Listeners(ListenersUtility.Listeners.class)
public class TestScript extends BaseClass{
//to runlisteners script we should use baseclass and listenersclass
	@Test
	public void listenerTest()
	{
		Reporter.log("Listeners test",true);
		
		//to fail script
		//Assert.fail();
	}
}
