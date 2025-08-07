package UsingJavascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/sweth/Documents/disabledwebpage.html");
		
		WebElement untf=driver.findElement(By.id("user"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",untf,"selenium");
		
		Thread.sleep(3000);
		
		//handle disable button
		WebElement loginbtn=driver.findElement(By.id("login"));
		js.executeScript("arguments[0].disabled=false",loginbtn);
		loginbtn.click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
