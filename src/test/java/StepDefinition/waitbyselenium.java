package StepDefinition;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitbyselenium {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		  
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		   
		   driver.manage().window().maximize();
		   //implicitwait(globalwait)
		 //  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		   
		   driver.findElement(By.name("q")).sendKeys("Selenium");
		   driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		// WebElement element =   driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));
		   //explicit wait -- used for elements with cert-- user defined method 
		   
		// webdriverwaitmethod(driver,element,10); 
		   
		   
		//fluent wait --similar to webdriverwait with more flexibility in polling time and ignoring exceptions
		 //declaration of fluent wait
		   
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(10))
				  .pollingEvery(Duration.ofSeconds(2))
				  .ignoring(NoSuchElementException.class);
		 
		 //usage of fluent wait
		 
		 WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
			  public WebElement apply(WebDriver driver) {
			    return driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));
			  }
		 });
		 ele.click();

	}
	
	public static void webdriverwaitmethod(WebDriver driver, WebElement ele, int timeout)
	{
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 
		   wait.until(ExpectedConditions.elementToBeClickable(ele));
		     ele.click();
	}
	
	
	
	
	
}
