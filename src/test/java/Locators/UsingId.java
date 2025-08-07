package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingId {
//if we use close() we will get socketexception
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				
	//driver.findElement(By.name("q")).sendKeys("shirt");
	//driver.findElement(By.className("Pke_EE")).sendKeys("laptop");
//driver.findElement(By.linkText("Appliances")).click();
				driver.findElement(By.partialLinkText("Log")).click();
	}

}
