package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingRightClickMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//Rightclick on an element
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		
		Thread.sleep(3000);
		
		//Refresh the webpage
		driver.navigate().refresh();
		
		//Double click on an element
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(doubleclick).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		//Doubleclick on an element
		
	}

}
