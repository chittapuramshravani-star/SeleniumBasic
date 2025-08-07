package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByancestorandDescendant {

	public static void main(String[] args) {                                                            
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		/*driver.findElement(By.name("field-keywords")).sendKeys("mobile"+Keys.ENTER);
//Example-1	
		//WebElement dynamic_ele=driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M05')]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[@class=\"a-price-whole\"]"));
//Example-2
		WebElement dynamic_ele=driver.findElement(By.xpath("//span[contains(text(),'Redmi A4')]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[@class=\"a-price-whole\"]"));
System.out.println(dynamic_ele.getText());
driver.quit();*/
driver.findElement(By.name("field-keywords")).sendKeys("laptop"+Keys.ENTER);
WebElement dynamic_ele=driver.findElement(By.xpath("//span[contains(text(),'ASUS TUF Gaming')]/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[@class=\"a-price-whole\"]"));
System.out.println(dynamic_ele.getText());
driver.quit();
	}

}
