package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNamelocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//navigate to an application
				driver.get("https://www.facebook.com/");
				
				//identify un tf and pass the text
				driver.findElement(By.name("email")).sendKeys("Selenium");
				
				////identify pswd tf and pass the text
				driver.findElement(By.name("pass")).sendKeys("abc123");
				
				//identify login btn and click on it
				driver.findElement(By.name("login")).click();
				
				Thread.sleep(3000);
				//close the browser
				driver.quit();
	}

}
