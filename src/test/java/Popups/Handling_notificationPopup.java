package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_notificationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//handling notificationpopup means disabling popup
				//when we use edge we have edgeoptions
		ChromeOptions opt=new ChromeOptions();
		//disable notification popup
		opt.addArguments("--disable-notifications");
		//disable location popup
		opt.addArguments("--disable-geolocation");
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
//Maximize the window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to an app
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		//identify notification popup and click on it
		driver.findElement(By.id("browNotButton")).click();
		
Thread.sleep(3000);

//close the browser
driver.quit();
	}

}
