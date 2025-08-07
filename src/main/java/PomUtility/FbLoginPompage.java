package PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPompage {

	//Declare
	
	//identify header and write path
	@FindBy(xpath="//h2")
	private WebElement header;
	
	//identify un and write path
	@FindBy(id="email")
	private WebElement unTF;
	
	//identify pswd and write path
	@FindBy(id="pass")
	private WebElement pswdTF;
	
	//identify login button and write path
	@FindBy(name="login")
	private WebElement loginBTN;

		
	//initialize
	//create constructor class
	public FbLoginPompage(WebDriver driver)
	{
PageFactory.initElements(driver, this);
	}
	
	//utilize
//utilize elements by using getters as we are using private
	public WebElement getHeader() {
		return header;
	}


	public void getUnTF(String user) {
	unTF.sendKeys(user);	
	}


	public WebElement getPswdTF() {
		return pswdTF;
	}


	public void getLoginBTN() {
loginBTN.click();
	}
	
	//Bussines logic
	public void Login(String user,String Password)
	{
		unTF.sendKeys(user);
		pswdTF.sendKeys(Password);
		loginBTN.click();
	}
}
