package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRelativeandAbsolutexpathexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/form[1]/input[1]")).sendKeys("Books");
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computers");
		
		
		//identify the searchstore element
	driver.findElement(By.xpath(".//input")).sendKeys("Books");
	
		
		Thread.sleep(3000);
		
				
				//identify the search button
				driver.findElement(By.xpath(".//input[2]")).click();
				
				
				Thread.sleep(3000);
				
				driver.quit();


	}

}
