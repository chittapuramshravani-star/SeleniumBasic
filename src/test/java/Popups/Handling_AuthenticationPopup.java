package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_AuthenticationPopup {
//authentication popup means credentials like un and pswd we have to give
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
//Maximize the window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//to handle authenticationPopup we have to pass UN and PSwd in url itself by using admin:admin@ like this
		//navigate to app
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
