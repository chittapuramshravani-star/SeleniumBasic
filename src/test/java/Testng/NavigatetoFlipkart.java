package Testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigatetoFlipkart {
	@Parameters("browser")

	@Test(groups="reg")
	public void Flipkart(String Browser) throws InterruptedException {

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
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	//System.out.println("flipkart");
	Reporter.log("flipkart",true);
	driver.quit();
	}

}
