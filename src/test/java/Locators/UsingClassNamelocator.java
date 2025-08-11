package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassNamelocator {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		//while using classname we should remove spaces
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://www.facebook.com/");
		
		//Identify UN TF and pass the text
		driver.findElement(By.className("inputtext")).sendKeys("selenium");
		
		//Identify PSWD TF and pass the text
		driver.findElement(By.className("_9npi")).sendKeys("abc123");
		
		//Identify LoginBtn and click on it
		driver.findElement(By.className("_42ft")).click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();

	}

}
