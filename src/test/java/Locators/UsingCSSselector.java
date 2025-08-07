package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("computers");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();*/
		driver.get("https://www.flipkart.com/");
		
		//identify Login btn and click on it
		driver.findElement(By.cssSelector("img[alt='Login']")).click();
		Thread.sleep(3000);
		
		//identify TF and enter mobile number
		driver.findElement(By.cssSelector("input[class='r4vIwl BV+Dqf']")).sendKeys("3948590123");
		Thread.sleep(3000);
		
		//click on request otp button
		driver.findElement(By.cssSelector("button[class='QqFHMw twnTnD _7Pd1Fp']")).click();
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}
	
}
