package SearchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://www.facebook.com/");
		
		//identify un tf and fass the text
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("selenium");
		
		//identify pswd tf and pass the text
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("abc123");
		
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		//quit browser
		driver.quit();
		}

}
