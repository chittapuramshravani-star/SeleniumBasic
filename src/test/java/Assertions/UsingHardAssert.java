package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {

	@Test
	public void hardAssert()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		//fetch the title 
		String actualtitle=driver.getTitle();
		
		String expTitle="Facebook – log out";
		//if-else cond doesnt have a capability to fail the test script so we use Assertions
		//HardAssert-execute block of code, Validates hard assert condn if it is true executes remaining lines of code 
		//if assertion is false it doesnt execute remaining lines of code and itbgives Assertion Error at consolel
		//validate title using hard assert
		
		//Assert.assertNotEquals(actualtitle, expTitle);
		
		Assert.assertFalse(actualtitle.contains(expTitle));
		
		//Assert.assertNull(expTitle);
		//System.out.println("Verified");
		//Assert.fail(); //it is used to fail the assert
		driver.quit();
	}
}
