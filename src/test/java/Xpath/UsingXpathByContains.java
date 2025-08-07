package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingXpathByContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Example-1
		/*driver.get("https://www.amazon.in/");
		//for text syntax is //tagname[contains(text(),'textvalue')]
		//for attribute is //tagname[contains(@attributename,'attributevalue')]
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("toys");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Mirana Talkin')]")).click();
		driver.quit();
	*/

//Example-2
driver.get("https://demowebshop.tricentis.com/");

//Identify Register and click on it
driver.findElement(By.xpath("//a[contains(@class,'ico-r')]")).click();

//identify Gender btn and click on it
driver.findElement(By.xpath("//input[contains(@id,'gender-f')]")).click();

//identify Firstname and enter text
driver.findElement(By.xpath("//input[contains(@name,'F')]")).sendKeys("Shravani");

//identify Lastname and enter text
driver.findElement(By.xpath("//input[contains(@name,'L')]")).sendKeys("Chittapuram");

//identify email and enter a email
driver.findElement(By.xpath("//input[contains(@data-val-email,'W')]")).sendKeys("abc@gmail.com");

//identify password and enter text
driver.findElement(By.xpath("//input[contains(@class,'text-box single-line p')]")).sendKeys("abc123");

//identify confirm pswd 
driver.findElement(By.xpath("//input[contains(@class,'text-box single-line password i')]")).sendKeys("abc123");

//click on register
driver.findElement(By.xpath("//input[contains(@value,'Re')]")).click();

	}

}
