package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingXpathStartsWithFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Example-1
driver.get("https://www.facebook.com/");
//identify search TF and pass the text
driver.findElement(By.xpath("//input[starts-with(@type,\"te\")]")).sendKeys("selenium");
driver.findElement(By.xpath("//input[starts-with(@placeholder,'Pass')]")).sendKeys("abc123");
driver.findElement(By.xpath("//button[starts-with(text(),'Log')]")).click();
Thread.sleep(3000);

//Example-2
/*driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//input[starts-with(@type,\"t\")]")).sendKeys("toys");
Thread.sleep(3000);*/
driver.quit();
	}

}
