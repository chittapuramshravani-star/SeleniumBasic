package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingActionsScrollingMethods {
//to perform actions method perform() is mandatory
//to perform multiple actions sequentially build()we can use
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//scroll the webpage using coordinates
		Actions act=new Actions(driver);
		act.scrollByAmount(0,1700).perform();
		
		Thread.sleep(3000);
		
		WebElement Amazon=driver.findElement(By.linkText("Amazon App Download"));
act.scrollToElement(Amazon).perform();

Thread.sleep(3000);

driver.quit();
	}

}
