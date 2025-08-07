package UsingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingMultiselectDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//Example-1
	//	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		//identify the DD
		/*WebElement dd=driver.findElement(By.id("select-multiple-native"));
		
		//using select class and selecting the options
		Select s=new Select(dd);
		s.selectByValue("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
		s.selectByIndex(7);
		s.selectByVisibleText("Mens Casual Slim Fit...");
		Thread.sleep(3000);
		
		//fetch all the options
		List<WebElement> options=s.getOptions();
		for(WebElement ele:options) {
			System.out.println(ele.getText());
	}
		
		//fetch first selected option
		WebElement option=s.getFirstSelectedOption();
		System.out.println("first selected option:"+option.getText());
		
		//fetch all the selected options
		List<WebElement> opt=s.getAllSelectedOptions();
		for(WebElement ele:opt)
		{
			System.out.println("all selected options"+ele.getText());
		}
//check for multi select DD
		System.out.println("multi select DD:"+s.isMultiple());
		
		//Deselect the options
		s.deselectByIndex(7);
		Thread.sleep(3000);
		
		s.deselectByValue("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
		Thread.sleep(3000);
		
		s.deselectByVisibleText("Mens Casual Slim Fit...");
		Thread.sleep(3000);
		driver.quit();
*/
//Example-2
driver.get("https://demoqa.com/select-menu");

WebElement MultiDd=driver.findElement(By.id("cars"));


Select s=new Select(MultiDd);
//check the DD whether it is single select or multiselect DD
System.out.println("multi select DD:"+s.isMultiple());

//selecting multiple elements
//indexing starts from zero
s.selectByIndex(3);
Thread.sleep(3000);
s.selectByValue("saab");
Thread.sleep(3000);

s.selectByVisibleText("Volvo");
Thread.sleep(3000);


//fetch all the options
List<WebElement> options=s.getOptions();
for(WebElement ele:options)
{
	System.out.println("all the options:"+ele.getText());
}

//fetch the first selected option
//here in this we will get the option that u were selected recent
String text=s.getFirstSelectedOption().getText();
System.out.println("First selected option:"+text);
		
//fetch all the selected options
//here u will get multiple selected option coz it is a multiselect DD
List<WebElement> selectdopt=s.getAllSelectedOptions();
for(WebElement ele:selectdopt)
{
	System.out.println("selected options"+ele.getText());
}

//deselect the options
s.deselectByIndex(3);
Thread.sleep(3000);

s.deselectByValue("saab");
Thread.sleep(3000);

s.deselectByVisibleText("Audi");
Thread.sleep(3000);

driver.quit();
}

}