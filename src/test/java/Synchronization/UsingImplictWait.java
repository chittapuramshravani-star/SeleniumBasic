package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplictWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigating to an app
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Shravs");
		
		//passward
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("shravy123");
	
		//login
		driver.findElement(By.xpath("(//button)")).click();
		
		//Thread.sleep(3000);
		
		//quit the browser
		driver.quit();
			
	}

}
