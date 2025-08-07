package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class HandlingSvgTagbyNamefunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
//navigate to an appln
driver.get("https://www.flipkart.com/");

//identify search TF and pass the text
driver.findElement(By.name("q")).sendKeys("toys");

//some tags like SVG that we cant handle directly so in this case we should use name()
//identify searchicon/button and click on it
driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();

Thread.sleep(3000);

//close the browser
driver.quit();

	}

}
