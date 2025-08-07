package practiceExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();

				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//navigate to an app
				driver.get("https://practicetestautomation.com/practice-test-login/");
				
				//identify Un and enter text
				driver.findElement(By.id("username")).sendKeys("incorrectUser");
				
				//identify Pswd and enter text
				driver.findElement(By.id("password")).sendKeys("Password123");
				
				//identify submit button and click on it
				driver.findElement(By.id("submit")).click();
				
				//Verify error message is displayed
				WebElement error=driver.findElement(By.id("error"));
				//String actualerror=error.getText();
				//String expectederror="error message";
				if(error.isDisplayed())
				{
					System.out.println("error");
				}
				else
				{
					System.out.println("not a error");
				}
				
				//Verify error message text is Your username is invalid!
				WebElement error1=driver.findElement(By.id("error"));
				String actualerror1=error.getText();
				String expectederror1="Your username is invalid!";
				
				if(actualerror1.equals(expectederror1))
				{
					System.out.println("invalid username");
				}
				else
				{
					System.out.println("not a invalid username");
				}


	}

}
