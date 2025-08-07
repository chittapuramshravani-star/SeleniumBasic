package UsingActionsClass;

		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class UsingKeyboardactions {
			public static void main(String[] args) throws InterruptedException {
				//keyboard actions:1.keyup 2.keydown
				//1.keydown means clicking something 
				//2.keyup means after clicking releasing your fingure from the button
				//Lanch the brower
				WebDriver driver=new ChromeDriver();
				
				//max the browser
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Example-1		
				//navigating to an url
				driver.get("https://www.flipkart.com/");
				
			WebElement s_tf= driver.findElement(By.name("q"));
			
			//first mousehover action we will perform and we use keyup and keydown actions
			Actions act=new Actions(driver);
			act.moveToElement(s_tf).click(s_tf).sendKeys("mobiles").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
				
				Thread.sleep(3000);
				
				
			driver.quit();
			}
			

		}

	
