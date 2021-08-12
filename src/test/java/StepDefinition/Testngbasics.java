package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//order -- before method ,test,aftermethod
public class Testngbasics {

	
	WebDriver driver  ;
	
	@BeforeMethod
	public void setup()
	{
	    WebDriverManager.chromedriver().setup();
		//System.setProperty("Webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();//launch chrome browser
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://google.com");
		}
	
	@Test
	public void googletitle()
	{
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void searchggogle() throws InterruptedException
	{
		System.out.println("user enters a text in searchbox");
		driver.findElement(By.name("q")).sendKeys("Automationstepbystep");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
