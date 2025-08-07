package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_multiframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();

				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to an app
				driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
				
				//identify first frame signup
				WebElement firstframe=driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
				
				driver.switchTo().frame(firstframe);
				
				//identify email and enter text
				driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
				
				//identify pswd and enter text
				driver.findElement(By.id("password")).sendKeys("abc123");
				
				//identify confirm pswd
				driver.findElement(By.id("confirm-password")).sendKeys("abc123");
				
				//click on signup button
				driver.findElement(By.id("submitButton")).click();
				Thread.sleep(3000);

				//switching from one frame to another frame
				driver.switchTo().parentFrame();
				
				//identify second frame login
				WebElement secondframe=driver.findElement(By.xpath("(//iframe[@class=\"w-full h-96\"])[2]"));
				driver.switchTo().frame(secondframe);
				Thread.sleep(3000);
				
				//identify un and enter text
				driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
				Thread.sleep(3000);
				
				//identify pswd and enter text
				driver.findElement(By.id("password")).sendKeys("abc123");
				Thread.sleep(3000);
				
				//identify login and click on it
				driver.findElement(By.id("submitButton")).click();
				Thread.sleep(3000);
				
				//close the browser
				driver.quit();
				
	}

}
