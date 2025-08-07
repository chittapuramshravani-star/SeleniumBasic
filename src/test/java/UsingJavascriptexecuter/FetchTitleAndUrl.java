package UsingJavascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleAndUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();

				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to an app
				driver.get("https://www.facebook.com/");
				
				//fetch the title
				JavascriptExecutor js=(JavascriptExecutor)driver;
				System.out.println(js.executeScript("return document.title"));
				
				//fetch the url
				System.out.println(js.executeScript("return document.URL"));
				Thread.sleep(3000);

				//refresh the webpage
				js.executeScript("history.go(0)");
				Thread.sleep(3000);
				
				driver.quit();

	}

}
