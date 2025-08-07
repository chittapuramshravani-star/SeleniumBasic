package practiceExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.id("username")).sendKeys("student");
		
		//identify Pswd and enter text
		driver.findElement(By.id("password")).sendKeys("incorrectPassword");
		Thread.sleep(3000);
		//identify submit button and click on it
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

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
		
		//Verify error message text is Your password is invalid!
		WebElement error1=driver.findElement(By.id("error"));
		String actualerror1=error.getText();
		String expectederror1="Your password is invalid!";
		
		if(actualerror1.equals(expectederror1))
		{
			System.out.println("invalid password");
		}
		else
		{
			System.out.println("not a invalid password");
		}
	}

}
