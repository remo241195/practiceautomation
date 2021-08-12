package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yahoologintest {
	
	WebDriver driver;

	@Test
	@Parameters({"url","username","pwd"})
	public void yahoologintest(String url,String username, String pwd) throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
			//System.setProperty("Webdriver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();//launch chrome browser
			 driver.manage().window().maximize();
			 driver.get(url);
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(username);
			 driver.findElement(By.xpath("//input[@id='login-signin']")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys(pwd);
			 
	}
	
	
	
	
}
