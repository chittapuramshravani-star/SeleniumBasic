package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfaWebpage {

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
				
	//Take the Screenshot of the webpage
	//step-1:Downcast takesscreenshot with webdriver ref variable as there is no is-a relationship btwn them
		TakesScreenshot ts=(TakesScreenshot)driver;	
		
	//step-2:Take ss and store it in a temp folder
		File src=ts.getScreenshotAs(OutputType.FILE);
		
//step-3:create a new empty file
//here we are creating new empty file as after quiting the ss gets deleted to avoid that we should create
	File dest=new File("./SCREENSHOT/flipkartpage.png");
	//here (projectname/foldername/file.png) here we are using image so .png
	//projectname we took (.) becoz projectname is different for everyone
	//after executing refresh project to get ss
	
	//step-4:copy the ss from src to dest
	FileUtils.copyFile(src, dest);
	
	//close the browser
	driver.quit();
	}
}
