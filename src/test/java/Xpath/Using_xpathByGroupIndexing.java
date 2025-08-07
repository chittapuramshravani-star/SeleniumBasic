package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Using_xpathByGroupIndexing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//Example-1
		/*driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		//identify nameTf
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("selenium");
		//identify email TF
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("abc@gmail.com");
		//identify password Tf
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("abc123");
	
		//identify register button
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(3000);
		driver.quit();
*/
//Example-2
driver.get("https://www.facebook.com/");

//identify email and enter text
driver.findElement(By.xpath("(//input)[3]")).sendKeys("selenium");

//identify pswd and enter text
driver.findElement(By.xpath("(//input)[4]")).sendKeys("sel123");

//click on login button
driver.findElement(By.xpath("//button")).click();

//close the browser
driver.quit();
	}

}
