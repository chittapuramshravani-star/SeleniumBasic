package Html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_AbsolutePath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  //Lanch the brower
		WebDriver driver=new ChromeDriver();
		
		//max the browser
		driver.manage().window().maximize();
		
		//navigate to the webpage
		driver.get("file:///C:/Users/sweth/Desktop/Login.html");
		
		//identify username TF
		WebElement un=driver.findElement(By.xpath("./html/body/input[1]"));
		//pass the text in un TF
		un.sendKeys("selenium");
		
		//identify password TF
		WebElement pswd=driver.findElement(By.xpath("./html/body/input[2]"));
		pswd.sendKeys("sel123");
		
		//identify loginbutton
		WebElement login=driver.findElement(By.xpath("./html/body/button[1]"));
		login.click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
		

	}

}
