package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		//max the browser
		driver.manage().window().maximize();

		//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

				driver.get("https://shoppersstack.com/");

			WebElement login=	driver.findElement(By.id("loginBtn"));
			//for 1.visibilityof(ele)
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(login)); 
			//to check whether login is visible or not if yes we will perform actions
			login.click();
	
			//explicit wait using title contains method
			//waiting till title is loaded after clicking on login
			wait.until(ExpectedConditions.titleContains("ShoppersStack | Login"));
			
			//for 2.elementtobeclickable
			//here after clicking on login by passing text checking whether login button is clickble or not
			driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("abc123");
			
			Thread.sleep(3000);
		WebElement	login_btn=driver.findElement(By.xpath("//span[text()='Login']"));
			
		//explicit wait using element to be clickable method
		wait.until(ExpectedConditions.elementToBeClickable(login_btn));
	
		login_btn.click();
		Thread.sleep(3000);
		
			driver.quit();
	}

}
