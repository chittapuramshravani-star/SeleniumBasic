package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.edge.EdgeDriver;

public class UsingDragandDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drop_ele1=driver.findElement(By.id("fourth"));
		WebElement drop_loc1=driver.findElement(By.id("amt7"));
		
		WebElement drop_ele2=driver.findElement(By.id("credit2"));
		WebElement drop_loc2=driver.findElement(By.id("bank"));

		
		WebElement drop_ele3=driver.findElement(By.id("fourth"));
		WebElement drop_loc3=driver.findElement(By.id("amt8"));

		WebElement drop_ele4=driver.findElement(By.id("credit1"));
		WebElement drop_loc4=driver.findElement(By.id("loan"));

		
		Actions act=new Actions(driver);
		act.dragAndDrop(drop_ele1, drop_loc1).dragAndDrop(drop_ele2, drop_loc2).dragAndDrop(drop_ele3, drop_loc3).dragAndDrop(drop_ele4, drop_loc4).build().perform();
		
		Thread.sleep(3000);
		
		
		WebElement res=driver.findElement(By.id("equal"));
//checking whether if res is perfect dispayed then print perfect in console by using if else
//if else or directly we can print
		if(res.isDisplayed())
{
	System.out.println(res.getText());
}
else
{
	System.out.println("perfect not displayed");
}
//WebElement perfect=driver.findElement(By.id("equal"));
//		System.out.println(perfect.getText());

Thread.sleep(3000);
		
		
		
		

	}

}
