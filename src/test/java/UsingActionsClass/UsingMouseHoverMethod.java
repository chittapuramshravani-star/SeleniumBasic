package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMouseHoverMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Example-1
		
		/*driver.get("https://www.amazon.in/");
		
		WebElement prime=driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(prime).perform();
		Thread.sleep(3000);
*/
		
//Example-2
	driver.get("https://www.ajio.com/");	
	//if unable to inspect so use control+shift+i
	WebElement text=driver.findElement(By.linkText("WOMEN"));
	Actions act=new Actions(driver);
	act.moveToElement(text).perform();
	Thread.sleep(3000);
//to freeze screen use f8
	
	//after doing mousehover click on any element
	//identify the element
	driver.findElement(By.linkText("Kurtas")).click();
		Thread.sleep(3000);
	}

}
