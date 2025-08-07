package PomUtilization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PomUtility.FbLoginPompage;

public class Fblogintest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an app
		driver.get("https://www.facebook.com/");
		
		//identify un 
		/*WebElement un=driver.findElement(By.id("email"));
		un.sendKeys("selenium");
		
		driver.navigate().refresh();
		
		un.sendKeys("hi");*/
	//staleelementreferanceExxception we will get to avoid we use pom
		
		//nonstatic elements we can access by creating object
		FbLoginPompage login=new FbLoginPompage(driver);
		login.getUnTF("selenium");
		
		driver.navigate().refresh();
		
		login.getUnTF("hi");
		login.getPswdTF().sendKeys("123");
		login.getLoginBTN();
		
		Thread.sleep(3000);
		
		//for bascilogin we have to call Login()
		login.Login("selenium", "abc123");
		driver.quit();
		
	}

}
