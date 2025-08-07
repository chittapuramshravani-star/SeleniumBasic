package usingRelativeLocators;

		// TODO Auto-generated method stub
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

		public class UsingNearMethod {
			public static void main(String[] args) {
				 //Lanch the brower
				WebDriver driver=new EdgeDriver();
				
				//max the browser
				driver.manage().window().maximize();
				
//example-1				
				//navigating to an url
				/*driver.get("https://www.flipkart.com/");
				
				//identify cart link
				WebElement search=driver.findElement(By.name("q"));
				
				
				WebElement link=driver.findElement
						(RelativeLocator.with(By.tagName("a")).near(search));
				
				link.click();*/
				
//example-2
//navigate to app
driver.get("https://www.amazon.in/");

//identify accounts and list(baseelement)
WebElement Search=driver.findElement(By.xpath("//span[contains(text(),'Account &')]"));
	
WebElement link=driver.findElement(RelativeLocator.with(By.tagName("a")).near(Search));
		link.click();	
			}
			}
