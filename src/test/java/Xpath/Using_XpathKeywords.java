package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathKeywords {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identify UN TF using And operator
		//driver.findElement(By.xpath("//input[@data-testid='royal-email' and contains(@placeholder,'Email')]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type=\"text\" and @id=\"email\"]")).sendKeys("selenium");
//in AND both the attributes should satisfy
//WE can use AND OR by using Contains also
		//identify PSWD TF using or operator
		//in or even though if we give wrong value in one attribute the next attribute will execute
		//any one should satisfy in OR operator
		//driver.findElement(By.xpath("//input[@data-testid='royal-pass' or @type='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@type=\"pass\" or @id=\"pass\"]")).sendKeys("abc123");
		
		//identify login and click
		//driver.findElement(By.xpath("//button[@name='lo' or text()='Log in']")).click();
		driver.findElement(By.xpath("//button[contains(@type,\"su\") and text()='Log in' ]")).click();
	Thread.sleep(3000);
	driver.quit();
	
	
	}

}
