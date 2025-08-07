package PomUtilization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomUtility.DemoAppsQspidersPompage;

public class QspiderRegisterPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// convert physical file to java object
		FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.properties");

		// create an object of properties
		Properties p = new Properties();

		// load the properties obj
		p.load(fis);
		// fetch the data from prop obj
		// String header=p.getProperty("header");
		String url = p.getProperty("url");
		String name = p.getProperty("name");
		String email = p.getProperty("email");
		String password = p.getProperty("password");

		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// navigate to an app
		driver.get(url);
Thread.sleep(10000);
		DemoAppsQspidersPompage page = new DemoAppsQspidersPompage(driver);
		page.Register(name, email, password);
		driver.quit();
	}
}
