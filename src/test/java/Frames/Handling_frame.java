package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();

				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to an app
				driver.get("https://www.zomato.com/india");
				
				//identify login link
				driver.findElement(By.linkText("Log in")).click();
				
				Thread.sleep(3000);
				
				//switch the driver control from mainwebpage to frame
				driver.switchTo().frame("auth-login-ui");
				
				//identify mon tf
				driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9013300567");
				
				//identify cross btn and click
				driver.findElement(By.xpath("//i[@aria-label=\"close Modal\"]")).click();
				
				//switch the driver control to mainweb page
				driver.switchTo().defaultContent();
				
				//identify signup and click 
				//it is to check whether we did login or not
				driver.findElement(By.linkText("Sign up")).click();
				Thread.sleep(3000);

				//close the browser
				driver.quit();
				
	}

}
