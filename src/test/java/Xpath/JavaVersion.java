package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		WebElement version=driver.findElement(By.xpath("//p[text()='Java']/../p/a[text()='4.33.0 (May 23, 2025)']"));
		////p[text()='Java']/../p/a[contains(text(),'4.33.0 (May 23, 2025)')]
System.out.println(version.getText());
	}

}
