package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathbyAttribute {
//by using xpathby attribute syntax=//tagname[@attributename='attributevalue']
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
//example-1
		/*driver.get("https://www.flipkart.com/");
		//identify search textfield and pass the text
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile"+Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("Samsung"+Keys.ENTER);
		Thread.sleep(3000);*/
		
//Example-2
		driver.get("https://www.facebook.com/");
		
		//identify UN TF and pass the text
		driver.findElement(By.xpath("//input[@data-testid=\"royal-email\"]")).sendKeys("selenium");
		
		//identify pswd TF and pass the text
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("abc123");
		
		//identify login btn and click on it
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
