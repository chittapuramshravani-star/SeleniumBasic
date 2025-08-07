package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingxpathByText {
//in this xpathbytext we can use text() or .
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
//Example-1
		/*driver.get("https://www.flipkart.com/");
		//identify search textfield and pass the text
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile"+Keys.ENTER);
		Thread.sleep(3000);
		//byusingxpathbyText syntax=//tagname[text()='textvalue']
				driver.findElement(By.xpath("//div[text()='Popularity']")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F05 (Twilight Blue, 64 GB)']")).click();
				
				Thread.sleep(3000);
				driver.quit();
*/
		
//Example-2
driver.get("https://www.facebook.com/");

//identify create new account button and click on it
driver.findElement(By.xpath("//a[text()='Create new account']")).click();

Thread.sleep(3000);

//identify already have an account
driver.findElement(By.xpath("//a[.='Already have an account?']")).click();
Thread.sleep(3000);

driver.quit();
	}

}
