package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_fileuploadUsingRobotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
//Robot class we used to select filepath copy and paste
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
//Maximize the window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to select filepath
		StringSelection str=new StringSelection("C:\\\\Users\\\\sweth\\\\Desktop\\\\practice1.txt");
		
		//to copy filepath 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement upload=driver.findElement(By.id("file-upload"));
		
//when normal click didnt works we use actions class click method
		Actions act=new Actions(driver);
		act.click(upload).perform();
		
		Thread.sleep(3000);
		
		//to paste we have keypress and keyrelease
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
