package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://www.facebook.com/");
		
		//identify un tf and pass the text
		driver.findElement(By.id("email")).sendKeys("selenium");
		
		//identify pswd tf and pass the text
		driver.findElement(By.id("pass")).sendKeys("abc123");
		
		//identify login btn and click on it
		//we should not consider alpha numeric values
		//driver.findElement(By.id("u_0_5_Gx")).click(); //NoSuchElementException
		Thread.sleep(3000);
		//close the browser
		driver.quit();

	}

}
