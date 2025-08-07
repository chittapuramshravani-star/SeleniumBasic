package usingRelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingTorightOfandTorightOf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	
//Example-1
/*driver.get("https://www.flipkart.com/");
//identify cart link
WebElement cart=driver.findElement(By.linkText("Cart"));

//using cart element click on become a seller link
driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(cart)).click();

//navigate to previos webpage
driver.navigate().back();

//identify cross button on the login dialogue box(close login suggestions)
driver.findElement(By.xpath("//span[@role='button']")).click();


//again identify cart link to avoid stale element reference exception
WebElement cart1=driver.findElement(By.linkText("Cart"));

//using cart link click on login link
driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(cart1)).click();
Thread.sleep(3000);
*/
		
//Example-2
//navigate to an app
driver.get("https://www.amazon.in/");

//identify accounts and list(baseelement)
WebElement act_list=driver.findElement(By.xpath("//span[contains(text(),'Account &')]"));

driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(act_list)).click();

driver.navigate().back();

//after refreshing address will change so again write xpath for it
WebElement actlist=driver.findElement(By.xpath("//span[contains(text(),'Account &')]"));

driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(actlist)).click();
Thread.sleep(3000);
driver.quit();


	}

}
