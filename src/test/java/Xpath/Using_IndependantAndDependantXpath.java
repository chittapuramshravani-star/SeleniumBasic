package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_IndependantAndDependantXpath {
//steps--1.identify static element & write xpath for it
	//2.traverse to common parent
	//3.from cp traverse to dynamic element 
	//dynamic is price which changes and static is name of product
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.name("q")).sendKeys("toys"+Keys.ENTER);
//Example for toys product	
		/*
		WebElement price=driver.findElement(By.xpath("//a[contains(text(),'SABIRAT')]/../a[@class='DMMoT0']/div/div[@class='Nx9bqj']"));
		System.out.println(price.getText());
		driver.quit();*/
				//a[contains(text(),'ARIZON')]/../a[@class='DMMoT0']/div/div[@class='Nx9bqj']
		/*WebElement dynamic_ele=driver.findElement(By.xpath("//a[contains(text(),'ARIZON')]/../a[@class='DMMoT0']/div/div[@class='Nx9bqj']"));
		System.out.println(dynamic_ele.getText());
		driver.quit();*/
//Example for mobile
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		WebElement dynamic_ele=driver.findElement(By.xpath("//div[contains(text(),'Samsung Galaxy F05 (Twilight')]/../div/span/div"));
		System.out.println(dynamic_ele.getText());
		driver.quit();


	}

}
