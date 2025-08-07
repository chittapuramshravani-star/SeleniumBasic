package Popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDivisionORCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
		//Maximize the window
				driver.manage().window().maximize();

				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.makemytrip.com/flights/");
				
				//click on x button
				driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
				
				//identify from and click on it
				driver.findElement(By.id("fromCity")).click();
				driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyd");
				driver.findElement(By.xpath("//p[contains(text(),'Hyd') and contains(@class,'blackText')]")).click();
				
				//identify to and click on it
				driver.findElement(By.id("toCity")).click();
				driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("mang");
				driver.findElement(By.xpath("//span[contains(text(),'Mang')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[contains(text(),'July')]/../../descendant::p[text()='27']")).click();
				Thread.sleep(3000);
				driver.quit();
	}

}
