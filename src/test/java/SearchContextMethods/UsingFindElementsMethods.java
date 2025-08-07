package SearchContextMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElementsMethods {
	//in FindElements if element not there we will get
	//EmptyList with size zero i.e.[0]
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
				driver.manage().window().maximize();
				
				//navigate to an application
				driver.get("https://www.facebook.com/");
				
				//identify untf
				driver.findElement(By.xpath("(//input)[3]")).sendKeys("selenium");
				
				//identify ps TF
				driver.findElement(By.xpath("(//input)[4]")).sendKeys("sel123");
				Thread.sleep(3000);
				
//identify all the links
				List<WebElement> links=driver.findElements(By.xpath("//a"));
				
				for(WebElement ele:links)
				{
					System.out.println(ele.getText());
				}

driver.quit();
	}

}
