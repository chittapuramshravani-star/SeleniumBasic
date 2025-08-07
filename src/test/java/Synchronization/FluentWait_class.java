package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait_class {
	//advantages-we can customize time polling period and we can avoid exception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//fluent wait
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		
		//mentioning time duration to wait
		wait.withTimeout(Duration.ofSeconds(10));
		
		//to customize polling period time
		wait.pollingEvery(Duration.ofSeconds(1));
		
		//ignoring the exception within the given time duration
		wait.ignoring(Exception.class);
		
		//identify un tf
		WebElement un=driver.findElement(By.id("email"));
		
		//condition
		wait.until(ExpectedConditions.visibilityOf(un));
		
		un.sendKeys("selenium");
		
		driver.close();                                                                                                                                                                                                                                                                                                                                                
	}

}
