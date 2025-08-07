package PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoAppsQspidersPompage {
//Declare
	//identify header and write path
	@FindBy(xpath="//h1")
	private WebElement header;
	
	//identify nametf and write path
	@FindBy(id="name")
	private WebElement name;
	
	//identify email and write path
	@FindBy(id="email")
	private WebElement email;
	
	//identify pswdtf and write path
	@FindBy(name="password")
	private WebElement password;
	
	//identify register and write path
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement Register;
	
	//initialize
	public DemoAppsQspidersPompage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void Register(String userName,String userEmail,String userPswd)
	{
		name.sendKeys(userName);
		email.sendKeys(userEmail);
		password.sendKeys(userPswd);
		Register.click();
	}
}
