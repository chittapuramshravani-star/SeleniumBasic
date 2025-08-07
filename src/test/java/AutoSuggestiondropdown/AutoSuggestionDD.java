package AutoSuggestiondropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDD {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("sel");
		List<WebElement> autosug=driver.findElements(By.xpath("//span[text()='sel']"));
		for(WebElement ele:autosug)
		{			System.out.println(ele.getText());
		}
		
		//click on autosuggestion element(directly we cant fetch path becoz
		//driver.findElement(By.xpath("//span[text()='Selena Gomez']")).click();
		//driver.findElement(By.xpath("))
		
	}

}
