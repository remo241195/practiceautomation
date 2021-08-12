package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Genaeratealert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		WebElement useremail = driver.findElement(By.name("email"));
		sendkeys(driver,useremail,10,"rohiteceremo@gmail.com");
		generatealert(driver ,"u r in homepage");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	@SuppressWarnings("deprecation")
	public static void sendkeys(WebDriver driver, WebElement Element,int timeout,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver ,timeout);
		wait.until(ExpectedConditions.visibilityOf(Element));
				
		  Element.sendKeys(value);
}
	public static void generatealert(WebDriver driver,String Message)
	{
		 JavascriptExecutor js = (JavascriptExecutor)driver; 
		 js.executeScript("alert('"+Message+"')");
	}
}
