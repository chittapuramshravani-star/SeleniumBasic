package UsingJavascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();

				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to an app
				driver.get("https://www.facebook.com/");
				
				//identify un 
				WebElement un=driver.findElement(By.id("email"));
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				//value is acting like send keys
				//arg1 is textfield and agr2 is value that u want to enter
				js.executeScript("arguments[0].value=arguments[1]", un,"selenium");
				Thread.sleep(3000);
				
				//identify pswd
				WebElement pswd=driver.findElement(By.id("pass"));
				js.executeScript("arguments[0].value=arguments[1]", pswd,"sel@123");
				Thread.sleep(3000);
				
				//click on an element
				WebElement login=driver.findElement(By.name("login"));
				js.executeScript("arguments[0].click()",login);
				Thread.sleep(3000);
				driver.quit();

	}

}
