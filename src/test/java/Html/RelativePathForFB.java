package Html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativePathForFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//max the browser
		driver.manage().window().maximize();
		
		//navigate to an app
		driver.get("https://www.facebook.com/");
		
		//identify username TF
				WebElement un=driver.findElement(By.xpath("(//input)[3]"));
				//pass the text in un TF
				un.sendKeys("selenium");
				
				//identify password TF
				WebElement pswd=driver.findElement(By.xpath("(//input)[4]"));
				pswd.sendKeys("sel123");
				
				//identify loginbutton
				WebElement login=driver.findElement(By.xpath("//button"));
				login.click();
				
				Thread.sleep(3000);
				
				//close the browser
				driver.quit();

	}

}
