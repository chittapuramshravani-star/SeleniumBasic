package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_promptPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				

		//Maximize the window
				driver.manage().window().maximize();

				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to app
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				
				//identify alert popup
				WebElement prompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
				prompt.click();
				  
				Thread.sleep(3000);
				
				//handle prompt popup
				Alert al=driver.switchTo().alert();
				al.sendKeys("prompt");	
				Thread.sleep(3000);
				
				//to click on ok on popup
				al.accept();
				
				
				//capture the result
				WebElement res=driver.findElement(By.id("result"));
			System.out.println(res.getText());
			
			//close the browser
			driver.quit();
			

	}

}
