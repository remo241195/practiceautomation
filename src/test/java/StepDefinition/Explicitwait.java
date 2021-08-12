package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		//System.setProperty("WebDriver.chromedriver", "C:/Users/Rohit/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
		System.setProperty("Webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		WebElement useremail = driver.findElement(By.name("email"));
		   WebElement Password = driver.findElement(By.name("passwd"));
		   sendkeys(driver, useremail,10,"rohiteceremo@gmail.com" );
		   sendkeys(driver, Password,10,"Test@12345" );
		WebElement Login =   driver.findElement(By.name("SubmitLogin"));
		click(driver,Login,3);
		//WebDriverWait wait = new WebDriverWait(driver,timeout)
		//wait.until(ExpectedConditions.visibilityOf(Element));
		  

	}


	
	public static void sendkeys(WebDriver driver, WebElement Element,int timeout,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(Element));
				
		  Element.sendKeys(value);
		
	}
	
	
	public static void click(WebDriver driver, WebElement Element,int timeout)
	
	{
		new WebDriverWait(driver,Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(Element));
		Element.click();
	}
}