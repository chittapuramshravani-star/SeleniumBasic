package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_xpathByAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using parent and child axes
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("toys"+Keys.ENTER);
		WebElement price=driver.findElement(By.xpath("//span[contains(text(),'Gooyo GY3')]/ancestor::div[contains(@class,'a-section a-spacing-smal')]/descendant::span[@class='a-price-whole']"));
		System.out.println(price.getText());
		
//Using Example for Following-Sibling and Preceding-Sibling Axes
//link/following-sibling::link/following-sibling::script/preceding-sibling::meta

	}

}
