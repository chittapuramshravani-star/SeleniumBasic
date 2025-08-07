package UsingJavascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollbar {
//in this we use only method executescript("js")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an appln
		driver.get("https://www.swiggy.com/restaurants");
		
		//scroll the webpage using hardcoded coordinates(x,y)
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1000)");
	
		Thread.sleep(3000);
		
		//scroll the webpage using element reference scroll it until element is visibile on webpage
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Best Places to Eat Across Cities']"));
		//js.executeScript("arguments[0].scrollIntoView(true)",ele);
		
		Thread.sleep(3000);
		  
		//scroll the webpage using element coordinates
		int xaxis=ele.getLocation().getX();
		int yaxis=ele.getLocation().getY();
		
		//js.executeScript("window.scrollBy(" + xaxis + "," + yaxis + ")");
		Thread.sleep(3000);
	
		//scroll till bottom of the webpage
		//here we are taking x-axis=0,y ais document it will scroll till end of the webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//scroll till top of the webpage
		//using (-) we will go to top
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);

		//close the browser
		driver.quit();
		
	
	}

}
