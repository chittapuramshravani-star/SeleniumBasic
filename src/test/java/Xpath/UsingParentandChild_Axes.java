package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingParentandChild_Axes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.name("field-keywords")).sendKeys("mobile"+Keys.ENTER);
		//WebElement dynamic_ele=driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M05')]/parent::h2/parent::a/parent::div/parent::div/child::div[@class=\"puisg-row puis-desktop-list-row\"]/child::div/child::div/child::div/child::div/child::div/child::a/child::span/child::span[@aria-hidden=\"true\"]/child::span[@class=\"a-price-whole\"]"));
		WebElement dynamic_ele=driver.findElement(By.xpath("//span[contains(text(),'Redmi A4 5G (St')]/parent::h2/parent::a/parent::div/parent::div/child::div[@class=\"puisg-row puis-desktop-list-row\"]/child::div/child::div/child::div/child::div[@class=\"a-row a-size-base a-color-base\"]/child::div/child::a/child::span/child::span[@aria-hidden=\"true\"]/child::span[@class=\"a-price-whole\"]"));
System.out.println(dynamic_ele.getText());
driver.quit();
	}

}
