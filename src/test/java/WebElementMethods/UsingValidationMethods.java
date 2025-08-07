                             
package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationMethods {
                                                    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		                        
		//max the browser
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//newsletter signup
		WebElement sub_tf=driver.findElement(By.id("newsletter-email"));
		
		if(sub_tf.isDisplayed())
		{
			//if returns true we perform sendkeys
			sub_tf.sendKeys("selenium");
		}
		else
		{
			System.out.println("element is not displayed");
			
		}
		Thread.sleep(3000);
		
		//verifying to check subscribe button is enabled or not
		WebElement subscribe=driver.findElement(By.id("newsletter-subscribe-button"));
		
		if(subscribe.isEnabled())
		{
			subscribe.click();
		}
		else
		{
			System.out.println("subscribe is not enabled");
		}
		
		Thread.sleep(3000);
		
		//verifying whether the element is selected for radiobutton
		WebElement radiobutton=driver.findElement(By.id("pollanswers-1"));
		radiobutton.click();
		if(radiobutton.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		Thread.sleep(3000);
		driver.quit();
			
	}
}
