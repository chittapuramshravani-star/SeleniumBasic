package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetterMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		//max the browser
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement login_link=driver.findElement(By.linkText("Log in"));
		
		//fetch the text present on the webelement
		String text=login_link.getText();
		System.out.println("text:"+text);
		
		//fetch the tagname of the element
		String tag=login_link.getTagName();
		System.out.println("tagname:"+tag);
		
		//fetch the attribute value//inside method we should pass attname
		String av=login_link.getAttribute("class");
		System.out.println("Attributevalue:"+av);
		
		//fetch the size of the element
		Dimension size=login_link.getSize();
		System.out.println("size:"+size);
		System.out.println("widthsize:"+size.getWidth());
		System.out.println("heightsize:"+size.getHeight());

		//fetch the position(location) of the element
		Point loc=login_link.getLocation();
		System.out.println("location:"+loc);
		System.out.println("X-Axis:"+loc.getX());
		System.out.println("Y-Axis:"+loc.getY());

		//fetch the rect(size and location) of the element
		Rectangle rect=login_link.getRect();
		//System.out.println(rect);//here we get address
		System.out.println("widthsize_r:"+rect.getWidth());
		System.out.println("heightsize_r:"+rect.getHeight());
		System.out.println("X-Axis_r:"+rect.getX());
		System.out.println("Y-Axis_r:"+rect.getY());
System.out.println(rect.getDimension());
		System.out.println(rect.getPoint());
		
		//fetch the css value
		//css attribute name we will get from styles after inspecting
		String cssvalue=login_link.getCssValue("padding-left");
		System.out.println("cssvalue:"+cssvalue
				);
		driver.quit();
		
	}

}
