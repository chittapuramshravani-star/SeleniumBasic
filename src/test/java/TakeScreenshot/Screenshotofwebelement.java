package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotofwebelement {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an app
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		//identify the element
	//WebElement ele=	driver.findElement(By.linkText("Beauty, Food.."));
	WebElement flipkartele=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		
	//take the ss of a webelement
	File src=flipkartele.getScreenshotAs(OutputType.FILE);
	File dest=new File("./SCREENSHOT/flipkartelement.png");
FileUtils.copyFile(src, dest);
	
	//close the browser
	driver.quit();
	

	
	
		
		
	}

}
