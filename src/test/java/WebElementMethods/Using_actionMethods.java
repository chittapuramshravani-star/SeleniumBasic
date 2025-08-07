package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_actionMethods {
//Actions methods-1.click()
//2.sendkeys()
//3.clear()
//4.submit()-it acts like click() but by using click we are unable to click for some elements which are developed using form tagname
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 //Lanch the brower
		WebDriver driver=new ChromeDriver();
		
		//max the browser
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchtf=driver.findElement(By.name("q"));
		
		//enter the text
		searchtf.sendKeys("selenium");
		Thread.sleep(3000);
		
		//clear the text in searchtf
		searchtf.clear();
		Thread.sleep(3000);
		
		//enter the text
		searchtf.sendKeys("mobile");
		Thread.sleep(3000);
		
		//click on searchbutton
		//to perfom submit() two conditions should satisfy the elment is in the form tag and type=submit should bw there then only we will use submit()
		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		Thread.sleep(3000);
		
		//click on login link
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		
	driver.quit();
	
	}

}
