package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_explicit_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		//max the browser
		driver.manage().window().maximize();

		//navigating to an url
		//driver.get("https://demoapps.qspiders.com/");
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("DemoApps | Qspiders | Text Box")); 
		
		
		WebElement ntf = driver.findElement(By.id("name"));
		
		wait.until(ExpectedConditions.visibilityOf(ntf));
	
		 Thread.sleep(3000);
		ntf.sendKeys("Selenium");
		
		driver.findElement(By.id("email")).sendKeys("Sel@123");
		driver.findElement(By.id("password")).sendKeys("Sel@123");
		
		WebElement r = driver.findElement(By.xpath("//button[text()='Register']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(r));
		
		r.click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
