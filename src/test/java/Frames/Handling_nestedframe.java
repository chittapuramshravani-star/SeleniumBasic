package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_nestedframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to app
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		//it consists of two frame
		//first identify outer frame
		WebElement outer_frame=driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
	//used frame(webelement frameelement)
		//switch the drivercontrol to outer frame using frameelement
	driver.switchTo().frame(outer_frame);
	
	WebElement email=driver.findElement(By.xpath("//p[@class=\"para\" and contains(text(),'Admin@g')]"));
	System.out.println(email.getText());
	Thread.sleep(3000);
	
	driver.switchTo().frame(0);
	
	//signup
	driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("admin@123");
	driver.findElement(By.id("confirm-password")).sendKeys("admin@123");
	driver.findElement(By.id("submitButton")).click();
	Thread.sleep(3000);
	
	driver.quit();

	}

}
