package UsingActionsClass;
import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingClickandHold {

	public static void main(String[] args) throws InterruptedException {
		            //Lanch the brower
				WebDriver driver=new ChromeDriver();
				
				//max the browser
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigating to an url
				driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
				
				//identify the element to click and hold element on circle for click and hold action
				
				WebElement circle=driver.findElement(By.id("circle"));
				
				
				//click and hold the element
				Actions act=new Actions(driver);
				act.clickAndHold(circle).perform();
				
				Thread.sleep(3000);
				
				//release the element
				
				act.release(circle).perform();
				
				
				Thread.sleep(3000);
				
				
				driver.quit();
				
	}

}
