package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagnamelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//navigate to an app
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify links on a webpage
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		for(WebElement element:ele)
		{
			System.out.println(element.getText());
		}
	
//close the browser
		driver.quit();
	}

}
