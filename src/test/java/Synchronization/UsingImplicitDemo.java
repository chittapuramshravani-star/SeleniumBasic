package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Example-1
		/*driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.name("name")).sendKeys("Shravy");
		driver.findElement(By.id("email")).sendKeys("shravs@123");
		driver.findElement(By.name("password")).sendKeys("pinks12");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(3000);
*/
		//Example-2
		driver.get("https://shoppersstack.com/");

		//Thread.sleep(20000);
		//here even though we use threa.sleep we will get exception to avoid that we should we use implicitlywait

		driver.findElement(By.id("loginBtn")).click();
	}

}
