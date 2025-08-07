package usingRelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingAboveandBelowMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
	//navigate to an application
driver.get("https://www.facebook.com/");

//in this we should identify baseelement first PSWD by using pswd we are identifying otherelements
//identify pwsd(base element)
WebElement pswd=driver.findElement(By.id("pass"));

//identify Un tf and enter username
WebElement un=driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd));
un.sendKeys("selenium");

pswd.sendKeys("abc123");

//identify login button and click on it
driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd)).click();

Thread.sleep(3000);
driver.quit();



/*WebElement pswd1=driver.findElement(By.id("pass"));
WebElement un1=driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd1));

pswd1.sendKeys("sel123");
un1.sendKeys("selenium");
driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd1)).click();
Thread.sleep(3000);
driver.quit();
*/
	}

}
