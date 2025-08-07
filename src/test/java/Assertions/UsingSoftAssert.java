package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingSoftAssert {
	@Test
	public void softAssert() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		//fetch the title 
		String actualtitle=driver.getTitle();
		
		String expTitle="Facebook – log out";
		//SoftAssert-execute block of code, Validates hard assert cond if it is true executes remaining lines of code
		//if assertion is false it execute remaining lines of code and it gives Assertion Error at console
		//validate title using soft assert
		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(actualtitle,expTitle);
		//soft.assertFalse(actualtitle.contains(expTitle));
		soft.assertNull(actualtitle);
		System.out.println("Verified Title");
		driver.quit();
		soft.assertAll();//if we not use this we will not get error msg at console if assertion fails
}
}