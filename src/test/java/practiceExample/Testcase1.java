package practiceExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();

		//navigate to an app
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//identify Un and enter text
		driver.findElement(By.id("username")).sendKeys("student");
		
		//identify Pswd and enter text
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		//identify submit button and click on it
		driver.findElement(By.id("submit")).click();
		
		//Verify new page URL contains practicetestautomation.com/logged-in-successfully/
String Expectedurl="https://practicetestautomation.com/logged-in-successfully/";
		String url=driver.getCurrentUrl();
if(url.equals(Expectedurl))
{
	System.out.println("passed");
}
else
{
	System.out.println("failed");
}

//Verify new page contains expected text ('Congratulations' or 'successfully logged in')


String expectedtext="Congratulations student. You successfully logged in!";
WebElement text=driver.findElement(By.tagName("strong"));
String Actualtext=text.getText();
if(expectedtext.equals(Actualtext))
{
	System.out.println("TextPassed");
}
else
{
	System.out.println("Textfailed");
}

//verify button logout is displayed on the new page
WebElement logout=driver.findElement(By.linkText("Log out"));
if(logout.isDisplayed())
{
	System.out.println("displayed");
}
else
{
	System.out.println("not displayed");
}
	}

}
