package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleofBasicRelXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		//identify name TF and enter text in register
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your name')]")).sendKeys("selenium");
		
		//identify email and enter text
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sel@gmail.com");
				//identify pswd and enter text 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sel123");
				//identify register and click on it
		driver.findElement(By.xpath("//button[text()='Register']")).click();
Thread.sleep(3000);
driver.quit();
	}

}
