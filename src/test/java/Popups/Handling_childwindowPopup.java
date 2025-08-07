package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_childwindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
		//Maximize the window
				driver.manage().window().maximize();

				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to app
				driver.get("https://www.flipkart.com/");
				
				//identify searchTF and enter the text
				driver.findElement(By.name("q")).sendKeys("toys"+Keys.ENTER);
				
				//fetching 
				String Pwid=driver.getWindowHandle();

				//identify the element and click
				driver.findElement(By.xpath("//a[contains(text(),'SABIRAT')]")).click();
				
				//fetching all the window ids
				Set<String> wids=driver.getWindowHandles();
				
				String title="SABIRAT Animal Set No Music Toy For Kids -";
				for(String s:wids)
				{
				 driver.switchTo().window(s);
				 Thread.sleep(3000);
				if(driver.getTitle().contains(title))
				{
					driver.findElement(By.xpath("//*[name()='svg'][@class=\"NwyjNT\"]")).click();
					Thread.sleep(3000);
					break;
				}
				}
				driver.switchTo().window(Pwid);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.quit();

	}

}
