package Testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigateToSwiggy {
	@Parameters("browser")
	@Test(groups="smoke")
	public void Swiggy(String Browser) throws InterruptedException {
		//global variable becz if we keep driver inside if it wont work thats y we take in global variable and kept null
		WebDriver driver=null;
		if(Browser.equals("chrome"))
		{
	 driver=new ChromeDriver();
		}
		else if(Browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}else
		{
			driver=new ChromeDriver();
		}


	//maximize the window
	driver.manage().window().maximize();

	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.swiggy.com/");
	Thread.sleep(3000);
	//System.out.println("swiggy");
	Reporter.log("swiggy",true);
	driver.quit();
	}
}
