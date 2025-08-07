package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkTextlocator {

	public static void main(String[] args) throws InterruptedException {
		
	//launch the browser
	WebDriver driver=new ChromeDriver();
				
	//maximize the window
	driver.manage().window().maximize();
				
	//navigate to an application
	driver.get("https://www.facebook.com/");
	//linktext() will only work for anchor tag "a" with href and >thing that is present in btw this<
	
	//click on forgotten pswd(Link)
	driver.findElement(By.linkText("Forgotten password?")).click();
			 
	Thread.sleep(3000);
			 
	driver.quit();
	}
}
