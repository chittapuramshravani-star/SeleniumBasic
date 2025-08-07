package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_fileuploadPopup {
//fileupload we can handle by using 2 ways 1.send
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
		//Maximize the window
				driver.manage().window().maximize();

				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to app
				driver.get("https://the-internet.herokuapp.com/upload");
				Thread.sleep(3000);
				
				//handling file upload popup
				driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sweth\\Desktop\\practice1.txt ");
			Thread.sleep(3000);

				//close the browser
				driver.quit();
	}

}
