package UsingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelectDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
	//DropDowns are developed using select tag so we use select class
		//Maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an appln
		driver.get("https://www.amazon.in/");
		
		//identify the Dropdown
		WebElement DD=driver.findElement(By.id("searchDropdownBox"));
		
		//create an obj of select class
		Select s=new Select(DD);
		
		//select the option-index
		s.selectByIndex(7);
		Thread.sleep(3000);
		
		//select an option by value attribute
		s.selectByValue("search-alias=alexa-skills");
		Thread.sleep(3000);
		
		//select an option by visible text
		s.selectByVisibleText("Amazon Devices");
		Thread.sleep(3000);
		
		//fetching all the options from the DD
		//iterate using for each loop and print the text from the option'
List<WebElement> options=s.getOptions();
for(WebElement ele:options) {
	System.out.println(ele.getText());
}

//check the DD for single or multi
//here we can directly print or we can use if else
//System.out.println("Multi select DD:" +s.isMultiple());
if(s.isMultiple())
{
	System.out.println("multi select DD");
}
else
{
	System.out.println("single select DD");
}
//in single select dropdown in firstselectedoption we we get last option that got selected becoz it is single select
///fetch the first selected option
WebElement option=s.getFirstSelectedOption();
System.out.println("First selected option:"+option.getText());

//fetch all the selected options
//here we will get the only single option becoz it is a single select DD
List<WebElement> selected=s.getAllSelectedOptions();
for(WebElement ele:selected)
{
	System.out.println("all the selected options:"+ele.getText());
}                                   
driver.quit();
	}

}
